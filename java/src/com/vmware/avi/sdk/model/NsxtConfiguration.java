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
 * The NsxtConfiguration is a POJO class extends AviRestResource that used for creating
 * NsxtConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NsxtConfiguration  {
    @JsonProperty("automate_dfw_rules")
    private Boolean automateDfwRules = false;

    @JsonProperty("data_network_config")
    private DataNetworkConfig dataNetworkConfig = null;

    @JsonProperty("domain_id")
    private String domainId = "default";

    @JsonProperty("enforcementpoint_id")
    private String enforcementpointId = "default";

    @JsonProperty("management_network_config")
    private ManagementNetworkConfig managementNetworkConfig = null;

    @JsonProperty("management_segment")
    private Tier1LogicalRouterInfo managementSegment;

    @JsonProperty("nsxt_credentials_ref")
    private String nsxtCredentialsRef = null;

    @JsonProperty("nsxt_url")
    private String nsxtUrl = null;

    @JsonProperty("site_id")
    private String siteId = "default";

    @JsonProperty("tier1_segment_config")
    private NsxtTier1SegmentConfig tier1SegmentConfig;

    @JsonProperty("transport_zone")
    private String transportZone;



    /**
     * This is the getter method this will return the attribute value.
     * Automatically create dfw rules for virtualservice in nsx-t manager.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, basic(allowed values- false) edition, essentials edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return automateDfwRules
     */
    public Boolean getAutomateDfwRules() {
        return automateDfwRules;
    }

    /**
     * This is the setter method to the attribute.
     * Automatically create dfw rules for virtualservice in nsx-t manager.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, basic(allowed values- false) edition, essentials edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param automateDfwRules set the automateDfwRules.
     */
    public void setAutomateDfwRules(Boolean  automateDfwRules) {
        this.automateDfwRules = automateDfwRules;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Data network configuration for avi service engines.
     * Field introduced in 20.1.5.
     * Allowed in enterprise with any value edition, basic with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dataNetworkConfig
     */
    public DataNetworkConfig getDataNetworkConfig() {
        return dataNetworkConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Data network configuration for avi service engines.
     * Field introduced in 20.1.5.
     * Allowed in enterprise with any value edition, basic with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dataNetworkConfig set the dataNetworkConfig.
     */
    public void setDataNetworkConfig(DataNetworkConfig dataNetworkConfig) {
        this.dataNetworkConfig = dataNetworkConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Domain where nsgroup objects belongs to.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "default".
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * This is the setter method to the attribute.
     * Domain where nsgroup objects belongs to.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "default".
     * @param domainId set the domainId.
     */
    public void setDomainId(String  domainId) {
        this.domainId = domainId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enforcement point is where the rules of a policy to apply.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "default".
     * @return enforcementpointId
     */
    public String getEnforcementpointId() {
        return enforcementpointId;
    }

    /**
     * This is the setter method to the attribute.
     * Enforcement point is where the rules of a policy to apply.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "default".
     * @param enforcementpointId set the enforcementpointId.
     */
    public void setEnforcementpointId(String  enforcementpointId) {
        this.enforcementpointId = enforcementpointId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Management network configuration for avi service engines.
     * Field introduced in 20.1.5.
     * Allowed in enterprise with any value edition, basic with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return managementNetworkConfig
     */
    public ManagementNetworkConfig getManagementNetworkConfig() {
        return managementNetworkConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Management network configuration for avi service engines.
     * Field introduced in 20.1.5.
     * Allowed in enterprise with any value edition, basic with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param managementNetworkConfig set the managementNetworkConfig.
     */
    public void setManagementNetworkConfig(ManagementNetworkConfig managementNetworkConfig) {
        this.managementNetworkConfig = managementNetworkConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Management network segment to use for avi service engines.
     * Field deprecated in 20.1.5.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return managementSegment
     */
    public Tier1LogicalRouterInfo getManagementSegment() {
        return managementSegment;
    }

    /**
     * This is the setter method to the attribute.
     * Management network segment to use for avi service engines.
     * Field deprecated in 20.1.5.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param managementSegment set the managementSegment.
     */
    public void setManagementSegment(Tier1LogicalRouterInfo managementSegment) {
        this.managementSegment = managementSegment;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Credentials to access nsx-t manager.
     * It is a reference to an object of type cloudconnectoruser.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nsxtCredentialsRef
     */
    public String getNsxtCredentialsRef() {
        return nsxtCredentialsRef;
    }

    /**
     * This is the setter method to the attribute.
     * Credentials to access nsx-t manager.
     * It is a reference to an object of type cloudconnectoruser.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nsxtCredentialsRef set the nsxtCredentialsRef.
     */
    public void setNsxtCredentialsRef(String  nsxtCredentialsRef) {
        this.nsxtCredentialsRef = nsxtCredentialsRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Nsx-t manager hostname or ip address.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nsxtUrl
     */
    public String getNsxtUrl() {
        return nsxtUrl;
    }

    /**
     * This is the setter method to the attribute.
     * Nsx-t manager hostname or ip address.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nsxtUrl set the nsxtUrl.
     */
    public void setNsxtUrl(String  nsxtUrl) {
        this.nsxtUrl = nsxtUrl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Site where transport zone belongs to.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "default".
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * This is the setter method to the attribute.
     * Site where transport zone belongs to.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "default".
     * @param siteId set the siteId.
     */
    public void setSiteId(String  siteId) {
        this.siteId = siteId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Nsxt tier1 segment configuration for avi service engine data path.
     * Field deprecated in 20.1.5.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return tier1SegmentConfig
     */
    public NsxtTier1SegmentConfig getTier1SegmentConfig() {
        return tier1SegmentConfig;
    }

    /**
     * This is the setter method to the attribute.
     * Nsxt tier1 segment configuration for avi service engine data path.
     * Field deprecated in 20.1.5.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param tier1SegmentConfig set the tier1SegmentConfig.
     */
    public void setTier1SegmentConfig(NsxtTier1SegmentConfig tier1SegmentConfig) {
        this.tier1SegmentConfig = tier1SegmentConfig;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Network zone where nodes can talk via overlay.
     * Virtual ips and service engines will belong to this zone.
     * Value should be path like /infra/sites/default/enforcement-points/default/transport-zones/xxx-xxx-xxxx.
     * Field deprecated in 20.1.5.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return transportZone
     */
    public String getTransportZone() {
        return transportZone;
    }

    /**
     * This is the setter method to the attribute.
     * Network zone where nodes can talk via overlay.
     * Virtual ips and service engines will belong to this zone.
     * Value should be path like /infra/sites/default/enforcement-points/default/transport-zones/xxx-xxx-xxxx.
     * Field deprecated in 20.1.5.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param transportZone set the transportZone.
     */
    public void setTransportZone(String  transportZone) {
        this.transportZone = transportZone;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      NsxtConfiguration objNsxtConfiguration = (NsxtConfiguration) o;
      return   Objects.equals(this.nsxtUrl, objNsxtConfiguration.nsxtUrl)&&
  Objects.equals(this.nsxtCredentialsRef, objNsxtConfiguration.nsxtCredentialsRef)&&
  Objects.equals(this.transportZone, objNsxtConfiguration.transportZone)&&
  Objects.equals(this.siteId, objNsxtConfiguration.siteId)&&
  Objects.equals(this.enforcementpointId, objNsxtConfiguration.enforcementpointId)&&
  Objects.equals(this.domainId, objNsxtConfiguration.domainId)&&
  Objects.equals(this.managementSegment, objNsxtConfiguration.managementSegment)&&
  Objects.equals(this.tier1SegmentConfig, objNsxtConfiguration.tier1SegmentConfig)&&
  Objects.equals(this.automateDfwRules, objNsxtConfiguration.automateDfwRules)&&
  Objects.equals(this.managementNetworkConfig, objNsxtConfiguration.managementNetworkConfig)&&
  Objects.equals(this.dataNetworkConfig, objNsxtConfiguration.dataNetworkConfig);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class NsxtConfiguration {\n");
                  sb.append("    automateDfwRules: ").append(toIndentedString(automateDfwRules)).append("\n");
                        sb.append("    dataNetworkConfig: ").append(toIndentedString(dataNetworkConfig)).append("\n");
                        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
                        sb.append("    enforcementpointId: ").append(toIndentedString(enforcementpointId)).append("\n");
                        sb.append("    managementNetworkConfig: ").append(toIndentedString(managementNetworkConfig)).append("\n");
                        sb.append("    managementSegment: ").append(toIndentedString(managementSegment)).append("\n");
                        sb.append("    nsxtCredentialsRef: ").append(toIndentedString(nsxtCredentialsRef)).append("\n");
                        sb.append("    nsxtUrl: ").append(toIndentedString(nsxtUrl)).append("\n");
                        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
                        sb.append("    tier1SegmentConfig: ").append(toIndentedString(tier1SegmentConfig)).append("\n");
                        sb.append("    transportZone: ").append(toIndentedString(transportZone)).append("\n");
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
