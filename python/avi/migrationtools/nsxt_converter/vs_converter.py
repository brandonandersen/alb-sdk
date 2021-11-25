from avi.migrationtools.nsxt_converter import conversion_util


def update_alb_type(lb_vs, alb_vs, prefix):
    alb_vs['enabled'] = lb_vs.get('enabled')

    alb_vs['services'] = dict(
        port=lb_vs.get('ports')[0]
    )

    alb_vs['ssl_profile_ref'] = lb_vs.get('client_ssl_profile_binding')
    alb_vs['tenant_ref'] = conversion_util.get_object_ref('admin', 'tenant')


def convert(alb_config, nsx_lb_config, cloud_name, prefix):
    alb_config['VirtualService'] = list()
    alb_config['vsvip'] = list()
    for lb_vs in nsx_lb_config['LBVirtualServers']:
        if prefix:
            name = '%s-%s' % (prefix, lb_vs['display_name'])
        else:
            name = lb_vs['display_name']
        vsvip = dict(
            ip_address=dict(
                addr=lb_vs['ip_address'],
                type="V4"
            )
        )
        alb_vs = dict(
            name=name,

        )

        update_alb_type(lb_vs, alb_vs, prefix)
        alb_vs['cloud_ref'] = conversion_util.get_object_ref(cloud_name, 'cloud')
        alb_config['VirtualService'].append(alb_vs)
        alb_config['vsvip'].append(vsvip)
