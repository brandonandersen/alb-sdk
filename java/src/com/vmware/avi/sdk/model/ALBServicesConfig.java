/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The ALBServicesConfig is a POJO class extends AviRestResource that used for creating
 * ALBServicesConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ALBServicesConfig extends AviRestResource  {
    @JsonProperty("app_signature_config")
    private AppSignatureConfig appSignatureConfig = null;

    @JsonProperty("asset_contact")
    private ALBServicesUser assetContact = null;

    @JsonProperty("case_config")
    private CaseConfig caseConfig = null;

    @JsonProperty("feature_opt_in_status")
    private PortalFeatureOptIn featureOptInStatus = null;

    @JsonProperty("ip_reputation_config")
    private IpReputationConfig ipReputationConfig = null;

    @JsonProperty("mode")
    private String mode = "MYVMWARE";

    @JsonProperty("polling_interval")
    private Integer pollingInterval = 10;

    @JsonProperty("portal_url")
    private String portalUrl = null;

    @JsonProperty("proactive_support_defaults")
    private ProactiveSupportDefaults proactiveSupportDefaults;

    @JsonProperty("saas_licensing_config")
    private SaasLicensingInfo saasLicensingConfig = null;

    @JsonProperty("split_proxy_configuration")
    private ProxyConfiguration splitProxyConfiguration = null;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("use_split_proxy")
    private Boolean useSplitProxy = false;

    @JsonProperty("use_tls")
    private Boolean useTls = true;

    @JsonProperty("user_agent_db_config")
    private UserAgentDBConfig userAgentDbConfig = null;

    @JsonProperty("uuid")
    private String uuid = null;

    @JsonProperty("waf_config")
    private WafCrsConfig wafConfig = null;



    /**
     * This is the getter method this will return the attribute value.
     * Default values to be used for application signature sync.
     * Field introduced in 20.1.4.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return appSignatureConfig
     */
    public AppSignatureConfig getAppSignatureConfig() {
        return appSignatureConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Default values to be used for application signature sync.
     * Field introduced in 20.1.4.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param appSignatureConfig set the appSignatureConfig.
     */
    public void setAppSignatureConfig(AppSignatureConfig appSignatureConfig) {
        this.appSignatureConfig = appSignatureConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Information about the default contact for this controller cluster.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return assetContact
     */
    public ALBServicesUser getAssetContact() {
        return assetContact;
    }

    /**
     * This is the setter method to the attribute.
     * Information about the default contact for this controller cluster.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param assetContact set the assetContact.
     */
    public void setAssetContact(ALBServicesUser assetContact) {
        this.assetContact = assetContact;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Default values to be used for pulse case management.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caseConfig
     */
    public CaseConfig getCaseConfig() {
        return caseConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Default values to be used for pulse case management.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param caseConfig set the caseConfig.
     */
    public void setCaseConfig(CaseConfig caseConfig) {
        this.caseConfig = caseConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Information about the portal features opted in for controller.
     * Field introduced in 20.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return featureOptInStatus
     */
    public PortalFeatureOptIn getFeatureOptInStatus() {
        return featureOptInStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Information about the portal features opted in for controller.
     * Field introduced in 20.1.1.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param featureOptInStatus set the featureOptInStatus.
     */
    public void setFeatureOptInStatus(PortalFeatureOptIn featureOptInStatus) {
        this.featureOptInStatus = featureOptInStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Default values to be used for ip reputation sync.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipReputationConfig
     */
    public IpReputationConfig getIpReputationConfig() {
        return ipReputationConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Default values to be used for ip reputation sync.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipReputationConfig set the ipReputationConfig.
     */
    public void setIpReputationConfig(IpReputationConfig ipReputationConfig) {
        this.ipReputationConfig = ipReputationConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Mode helps log collection and upload.
     * Enum options - MODE_UNKNOWN, SALESFORCE, SYSTEST, MYVMWARE.
     * Field introduced in 20.1.2.
     * Allowed in enterprise with any value edition, essentials(allowed values- salesforce,myvmware,systest) edition, basic(allowed values-
     * salesforce,myvmware,systest) edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "MYVMWARE".
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * This is the setter method to the attribute.
     * Mode helps log collection and upload.
     * Enum options - MODE_UNKNOWN, SALESFORCE, SYSTEST, MYVMWARE.
     * Field introduced in 20.1.2.
     * Allowed in enterprise with any value edition, essentials(allowed values- salesforce,myvmware,systest) edition, basic(allowed values-
     * salesforce,myvmware,systest) edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "MYVMWARE".
     * @param mode set the mode.
     */
    public void setMode(String  mode) {
        this.mode = mode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time interval in minutes.
     * Allowed values are 5-60.
     * Field introduced in 18.2.6.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return pollingInterval
     */
    public Integer getPollingInterval() {
        return pollingInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Time interval in minutes.
     * Allowed values are 5-60.
     * Field introduced in 18.2.6.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param pollingInterval set the pollingInterval.
     */
    public void setPollingInterval(Integer  pollingInterval) {
        this.pollingInterval = pollingInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The fqdn or ip address of the customer portal.
     * Field introduced in 18.2.6.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return portalUrl
     */
    public String getPortalUrl() {
        return portalUrl;
    }

    /**
     * This is the setter method to the attribute.
     * The fqdn or ip address of the customer portal.
     * Field introduced in 18.2.6.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param portalUrl set the portalUrl.
     */
    public void setPortalUrl(String  portalUrl) {
        this.portalUrl = portalUrl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This field is deprecated.
     * Field deprecated in 21.1.1.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return proactiveSupportDefaults
     */
    public ProactiveSupportDefaults getProactiveSupportDefaults() {
        return proactiveSupportDefaults;
    }

    /**
     * This is the setter method to the attribute.
     * This field is deprecated.
     * Field deprecated in 21.1.1.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param proactiveSupportDefaults set the proactiveSupportDefaults.
     */
    public void setProactiveSupportDefaults(ProactiveSupportDefaults proactiveSupportDefaults) {
        this.proactiveSupportDefaults = proactiveSupportDefaults;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Saas licensing configuration.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return saasLicensingConfig
     */
    public SaasLicensingInfo getSaasLicensingConfig() {
        return saasLicensingConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Saas licensing configuration.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param saasLicensingConfig set the saasLicensingConfig.
     */
    public void setSaasLicensingConfig(SaasLicensingInfo saasLicensingConfig) {
        this.saasLicensingConfig = saasLicensingConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Split proxy configuration to connect external pulse services.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return splitProxyConfiguration
     */
    public ProxyConfiguration getSplitProxyConfiguration() {
        return splitProxyConfiguration;
    }

    /**
     * This is the setter method to the attribute.
     * Split proxy configuration to connect external pulse services.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param splitProxyConfiguration set the splitProxyConfiguration.
     */
    public void setSplitProxyConfiguration(ProxyConfiguration splitProxyConfiguration) {
        this.splitProxyConfiguration = splitProxyConfiguration;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Avi controller URL of the object.
     * @return url
     */
    public String getUrl() {
        return url;
    }

   /**
    * This is the setter method. this will set the url
    * Avi controller URL of the object.
    * @return url
    */
   public void setUrl(String  url) {
     this.url = url;
   }

    /**
     * This is the getter method this will return the attribute value.
     * By default, pulse uses proxy added in system configuration.
     * If pulse needs to use a seperate proxy, set this flag to true and configure split proxy configuration.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return useSplitProxy
     */
    public Boolean getUseSplitProxy() {
        return useSplitProxy;
    }

    /**
     * This is the setter method to the attribute.
     * By default, pulse uses proxy added in system configuration.
     * If pulse needs to use a seperate proxy, set this flag to true and configure split proxy configuration.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param useSplitProxy set the useSplitProxy.
     */
    public void setUseSplitProxy(Boolean  useSplitProxy) {
        this.useSplitProxy = useSplitProxy;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Secure the controller to pulse communication over tls.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, basic with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return useTls
     */
    public Boolean getUseTls() {
        return useTls;
    }

    /**
     * This is the setter method to the attribute.
     * Secure the controller to pulse communication over tls.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, basic with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param useTls set the useTls.
     */
    public void setUseTls(Boolean  useTls) {
        this.useTls = useTls;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Default values to be used for user agent db service.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return userAgentDbConfig
     */
    public UserAgentDBConfig getUserAgentDbConfig() {
        return userAgentDbConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Default values to be used for user agent db service.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param userAgentDbConfig set the userAgentDbConfig.
     */
    public void setUserAgentDbConfig(UserAgentDBConfig userAgentDbConfig) {
        this.userAgentDbConfig = userAgentDbConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Default values to be used for pulse waf management.
     * Field introduced in 21.1.1.
     * Allowed in essentials with any value edition, basic with any value edition, enterprise edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return wafConfig
     */
    public WafCrsConfig getWafConfig() {
        return wafConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Default values to be used for pulse waf management.
     * Field introduced in 21.1.1.
     * Allowed in essentials with any value edition, basic with any value edition, enterprise edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param wafConfig set the wafConfig.
     */
    public void setWafConfig(WafCrsConfig wafConfig) {
        this.wafConfig = wafConfig;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ALBServicesConfig objALBServicesConfig = (ALBServicesConfig) o;
      return   Objects.equals(this.uuid, objALBServicesConfig.uuid)&&
  Objects.equals(this.portalUrl, objALBServicesConfig.portalUrl)&&
  Objects.equals(this.pollingInterval, objALBServicesConfig.pollingInterval)&&
  Objects.equals(this.assetContact, objALBServicesConfig.assetContact)&&
  Objects.equals(this.featureOptInStatus, objALBServicesConfig.featureOptInStatus)&&
  Objects.equals(this.proactiveSupportDefaults, objALBServicesConfig.proactiveSupportDefaults)&&
  Objects.equals(this.useSplitProxy, objALBServicesConfig.useSplitProxy)&&
  Objects.equals(this.splitProxyConfiguration, objALBServicesConfig.splitProxyConfiguration)&&
  Objects.equals(this.ipReputationConfig, objALBServicesConfig.ipReputationConfig)&&
  Objects.equals(this.useTls, objALBServicesConfig.useTls)&&
  Objects.equals(this.mode, objALBServicesConfig.mode)&&
  Objects.equals(this.appSignatureConfig, objALBServicesConfig.appSignatureConfig)&&
  Objects.equals(this.userAgentDbConfig, objALBServicesConfig.userAgentDbConfig)&&
  Objects.equals(this.wafConfig, objALBServicesConfig.wafConfig)&&
  Objects.equals(this.caseConfig, objALBServicesConfig.caseConfig)&&
  Objects.equals(this.saasLicensingConfig, objALBServicesConfig.saasLicensingConfig);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ALBServicesConfig {\n");
                  sb.append("    appSignatureConfig: ").append(toIndentedString(appSignatureConfig)).append("\n");
                        sb.append("    assetContact: ").append(toIndentedString(assetContact)).append("\n");
                        sb.append("    caseConfig: ").append(toIndentedString(caseConfig)).append("\n");
                        sb.append("    featureOptInStatus: ").append(toIndentedString(featureOptInStatus)).append("\n");
                        sb.append("    ipReputationConfig: ").append(toIndentedString(ipReputationConfig)).append("\n");
                        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
                        sb.append("    pollingInterval: ").append(toIndentedString(pollingInterval)).append("\n");
                        sb.append("    portalUrl: ").append(toIndentedString(portalUrl)).append("\n");
                        sb.append("    proactiveSupportDefaults: ").append(toIndentedString(proactiveSupportDefaults)).append("\n");
                        sb.append("    saasLicensingConfig: ").append(toIndentedString(saasLicensingConfig)).append("\n");
                        sb.append("    splitProxyConfiguration: ").append(toIndentedString(splitProxyConfiguration)).append("\n");
                                    sb.append("    useSplitProxy: ").append(toIndentedString(useSplitProxy)).append("\n");
                        sb.append("    useTls: ").append(toIndentedString(useTls)).append("\n");
                        sb.append("    userAgentDbConfig: ").append(toIndentedString(userAgentDbConfig)).append("\n");
                        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    wafConfig: ").append(toIndentedString(wafConfig)).append("\n");
                  sb.append("}");
      return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
      if (o == null) {
          return "null";
      }
      return o.toString().replace("\n", "\n    ");
    }
}
