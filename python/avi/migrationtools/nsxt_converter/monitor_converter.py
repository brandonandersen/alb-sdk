import time, logging

import com.vmware.nsx_policy.model_client as model_client

from avi.migrationtools.avi_migration_utils import update_count
from avi.migrationtools.nsxt_converter.conversion_util import NsxtConvUtil, csv_writer_dict_list
import avi.migrationtools.nsxt_converter.converter_constants as conv_const
from avi.migrationtools.avi_migration_utils import MigrationUtil

LOG = logging.getLogger(__name__)

conv_utils = NsxtConvUtil()
common_avi_util = MigrationUtil()


class MonitorConfigConv(object):
    def __init__(self, nsxt_monitor_attributes, object_merge_check, merge_object_mapping, sys_dict):
        """

       :param nsxt_monitor_attributes: NsxT monitor attributes from yaml file.
       :param prefix: prefix for objects
       :param object_merge_check: flag for merge objects
        """
        self.supported_types = nsxt_monitor_attributes['Monitor_Supported_Types']
        self.tup = "time until up"
        self.supported_attributes = \
            nsxt_monitor_attributes['Monitor_Supported_Attributes']
        self.dest_key = "dest"
        self.http_attr = nsxt_monitor_attributes['Monitor_http_attr']
        self.https_attr = nsxt_monitor_attributes['Monitor_https_attr']
        self.tcp_attr = nsxt_monitor_attributes['Monitor_tcp_attr']
        self.udp_attr = nsxt_monitor_attributes['Monitor_udp_attr']
        self.ping_attr = nsxt_monitor_attributes['Monitor_ping_attr']
        self.common_na_attr = nsxt_monitor_attributes['Common_Na_List']
        self.object_merge_check = object_merge_check
        self.merge_object_mapping = merge_object_mapping
        self.sys_dict = sys_dict
        self.monitor_count = 0

    def get_alb_response_codes(self, response_codes):
        if not response_codes:
            return None
        HttpResponseCode = model_client.ALBHealthMonitorHttp
        codes = list()
        for code in response_codes:
            if code < 200:
                if HttpResponseCode.HTTP_RESPONSE_CODE_1XX not in codes:
                    codes.append(HttpResponseCode.HTTP_RESPONSE_CODE_1XX)
            elif code > 199 and code < 300:
                if HttpResponseCode.HTTP_RESPONSE_CODE_2XX not in codes:
                    codes.append(HttpResponseCode.HTTP_RESPONSE_CODE_2XX)
            elif code > 299 and code < 400:
                if HttpResponseCode.HTTP_RESPONSE_CODE_3XX not in codes:
                    codes.append(HttpResponseCode.HTTP_RESPONSE_CODE_3XX)
            elif code > 399 and code < 500:
                if HttpResponseCode.HTTP_RESPONSE_CODE_4XX not in codes:
                    codes.append(HttpResponseCode.HTTP_RESPONSE_CODE_4XX)
            elif code > 499 and code < 600:
                if HttpResponseCode.HTTP_RESPONSE_CODE_5XX not in codes:
                    codes.append(HttpResponseCode.HTTP_RESPONSE_CODE_5XX)
        return codes

    def update_alb_type(self, lb_hm, alb_hm, skipped):
        if lb_hm['resource_type'] == 'LBHttpMonitorProfile':
            alb_hm['type'] = 'HEALTH_MONITOR_HTTP'

            alb_hm['http_monitor'] = dict(
                http_request=lb_hm['request_url'],
                http_request_body=lb_hm.get('request_body'),
                http_response=lb_hm.get('response_body'),
                http_response_code=self.get_alb_response_codes(lb_hm['response_status_codes']),
            )
            skipped = [key for key in skipped if key not in self.http_attr]
        elif lb_hm['resource_type'] == 'LBHttpsMonitorProfile':
            alb_hm['type'] = 'HEALTH_MONITOR_HTTPS'
            alb_hm['https_monitor'] = dict(
                http_request=lb_hm['request_url'],
                http_request_body=lb_hm.get('request_body'),
                http_response=lb_hm.get('response_body'),
                http_response_code=self.get_alb_response_codes(lb_hm['response_status_codes']),

            )

            skipped = [key for key in skipped if key not in self.https_attr]

        elif lb_hm['resource_type'] == 'LBIcmpMonitorProfile':
            alb_hm['type'] = 'HEALTH_MONITOR_PING'
        elif lb_hm['resource_type'] == 'LBTcpMonitorProfile':
            alb_hm['type'] = 'HEALTH_MONITOR_TCP'
        elif lb_hm['resource_type'] == 'LBUdpMonitorProfile':
            alb_hm['type'] = 'HEALTH_MONITOR_UDP'
        return skipped

    def convert(self, alb_config, nsx_lb_config, prefix):
        alb_config['HealthMonitor'] = list()
        converted_objs = []
        progressbar_count = 0
        skipped_list = []
        converted_alb_monitor = []
        total_size = len(nsx_lb_config['LbMonitorProfiles'])
        print("Converting Monitors...")
        LOG.info('[MONITOR] Converting Monitors...')
        for lb_hm in nsx_lb_config['LbMonitorProfiles']:
            try:
                LOG.info('[MONITOR] Migration started for HM {}'.format(lb_hm['display_name']))
                progressbar_count += 1
                if lb_hm['resource_type'] == 'LBPassiveMonitorProfile':
                    conv_utils.add_status_row('monitor', lb_hm['resource_type'], lb_hm['display_name'],
                                              conv_const.STATUS_SKIPPED)
                    continue

                monitor_type, name = self.get_name_type(lb_hm)
                skipped = [val for val in lb_hm.keys()
                           if val not in self.supported_attributes]
                na_list = [val for val in lb_hm.keys()
                           if val in self.common_na_attr]
                if prefix:
                    name = prefix + '-' + name

                alb_hm = dict(
                    name=name,
                    failed_checks=lb_hm['fall_count'],
                    receive_timeout=lb_hm['timeout'],
                    send_interval=lb_hm['interval'],
                    successful_checks=lb_hm.get('rise_count', None),
                    monitor_port=lb_hm.get('monitor_port', None),
                )
                alb_hm['tenant_ref'] = "/api/tenant/?name=admin"
                if monitor_type == "LBHttpMonitorProfile":
                    skipped = self.convert_http(lb_hm, alb_hm, skipped)
                elif monitor_type == "LBHttpsMonitorProfile":
                    skipped = self.convert_https(lb_hm, alb_hm, skipped)
                elif monitor_type == "LBIcmpMonitorProfile":
                    skipped = self.convert_icmp(lb_hm, alb_hm, skipped)
                elif monitor_type == "LBTcpMonitorProfile":
                    skipped = self.convert_tcp(lb_hm, alb_hm, skipped)
                elif monitor_type == "LBUdpMonitorProfile":
                    skipped = self.convert_udp(lb_hm, alb_hm, skipped)

                indirect = []
                u_ignore = []
                ignore_for_defaults = {}
                skipped_list.append(skipped)
                if self.object_merge_check:
                    common_avi_util.update_skip_duplicates(alb_hm,
                                                           alb_config['HealthMonitor'], 'health_monitor',
                                                           converted_objs, name, None, self.merge_object_mapping,
                                                           monitor_type, prefix,
                                                           self.sys_dict['HealthMonitor'])
                    self.monitor_count += 1
                else:
                    alb_config['HealthMonitor'].append(alb_hm)
                val = dict(
                    name=name,
                    resource_type=lb_hm['resource_type'],
                    alb_hm=alb_hm

                )
                converted_alb_monitor.append(val)
                msg = "Monitor conversion started..."
                conv_utils.print_progress_bar(progressbar_count, total_size, msg,
                                              prefix='Progress', suffix='')
                # time.sleep(1)

                LOG.info('[MONITOR] Migration completed for HM {}'.format(lb_hm['display_name']))
            except:
                update_count('error')
                LOG.error("[MONITOR] Failed to convert Monitor: %s" % lb_hm['display_name'],
                          exc_info=True)
                conv_utils.add_status_row('monitor', None, lb_hm['display_name'],
                                          conv_const.STATUS_ERROR)

        for index, skipped in enumerate(skipped_list):
            conv_status = conv_utils.get_conv_status(
                skipped_list[index], indirect, ignore_for_defaults, nsx_lb_config['LbMonitorProfiles'],
                u_ignore, na_list)
            name = converted_alb_monitor[index]['name']
            alb_mig_hm = converted_alb_monitor[index]['alb_hm']
            resource_type = converted_alb_monitor[index]['resource_type']
            if self.object_merge_check:
                alb_mig_hm = [hm for hm in alb_config['HealthMonitor'] if
                              hm.get('name') == self.merge_object_mapping['health_monitor'].get(name)]
            conv_utils.add_conv_status('monitor', resource_type, name, conv_status,
                                           [{'health_monitor': alb_mig_hm[0]}])
            if len(conv_status['skipped']) > 0:
                LOG.debug('[Monitor] Skipped Attribute {}:{}'.format(name, conv_status['skipped']))

    def get_name_type(self, lb_hm):
        """

        """
        return lb_hm['resource_type'], lb_hm['display_name']

    def convert_http(self, lb_hm, alb_hm, skipped):
        alb_hm['type'] = 'HEALTH_MONITOR_HTTP'
        alb_hm['http_monitor'] = dict(
            http_request=lb_hm['request_url'],
            http_request_body=lb_hm.get('request_body'),
            http_response=lb_hm.get('response_body'),
            http_response_code=self.get_alb_response_codes(lb_hm['response_status_codes']),
        )

        skipped = [key for key in skipped if key not in self.http_attr]
        return skipped

    def convert_https(self, lb_hm, alb_hm, skipped):
        alb_hm['type'] = 'HEALTH_MONITOR_HTTPS'
        alb_hm['https_monitor'] = dict(
            http_request=lb_hm['request_url'],
            http_request_body=lb_hm.get('request_body'),
            http_response=lb_hm.get('response_body'),
            http_response_code=self.get_alb_response_codes(lb_hm['response_status_codes']),
        )
        alb_hm["https_monitor"]['ssl_attributes'] = dict()
        if lb_hm.get('server_ssl_profile_binding', None):
            # TODO Need to convert
            print(lb_hm['server_ssl_profile_binding'])
            # self.create_sslprofile(alb_hm, lb_hm, avi_config,
            #                        tenant_ref, cloud_name, merge_object_mapping,
            #                        sys_dict)


        skipped = [key for key in skipped if key not in self.https_attr]

        return skipped

    def convert_icmp(self, lb_hm, alb_hm, skipped):
        alb_hm['type'] = 'HEALTH_MONITOR_PING'
        if self.ping_attr:
            skipped = [key for key in skipped if key not in self.ping_attr]

        return skipped

    def convert_tcp(self, lb_hm, alb_hm, skipped):
        alb_hm['type'] = 'HEALTH_MONITOR_TCP'
        alb_hm["tcp_monitor"] = dict()
        request = lb_hm.get("send", None)
        # request = self.update_request_for_avi(request, False)
        response = lb_hm.get("receive", None)
        if response == 'none':
            response = None
        tcp_monitor = {"tcp_request": request, "tcp_response": response}
        alb_hm["tcp_monitor"] = tcp_monitor

        # [skipped.append(key) for key in lb_hm.keys() if key not in self.tcp_attr]
        skipped = [key for key in skipped if key not in self.tcp_attr]

        return skipped

    def convert_udp(self, lb_hm, alb_hm, skipped):
        request = lb_hm.get("send", None)
        # request = self.update_request_for_avi(request, False)
        response = lb_hm.get("receive", None)
        if response == 'none':
            response = None
        udp_monitor = {"udp_request": request, "udp_response": response}
        alb_hm["udp_monitor"] = udp_monitor
        # [skipped.append(key) for key in lb_hm.keys() if key not in self.udp_attr]
        skipped = [key for key in skipped if key not in self.tcp_attr]

        return skipped
