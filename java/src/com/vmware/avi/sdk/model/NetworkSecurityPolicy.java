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
 * The NetworkSecurityPolicy is a POJO class extends AviRestResource that used for creating
 * NetworkSecurityPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NetworkSecurityPolicy extends AviRestResource  {
    @JsonProperty("cloud_config_cksum")
    private String cloudConfigCksum = null;

    @JsonProperty("created_by")
    private String createdBy = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("geo_db_ref")
    private String geoDbRef = null;

    @JsonProperty("internal")
    private Boolean internal = null;

    @JsonProperty("ip_reputation_db_ref")
    private String ipReputationDbRef = null;

    @JsonProperty("labels")
    private List<KeyValue> labels;

    @JsonProperty("markers")
    private List<RoleFilterMatchLabel> markers = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("rules")
    private List<NetworkSecurityRule> rules = null;

    @JsonProperty("tenant_ref")
    private String tenantRef = null;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid = null;



    /**
     * This is the getter method this will return the attribute value.
     * Checksum of cloud configuration for network sec policy.
     * Internally set by cloud connector.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudConfigCksum
     */
    public String getCloudConfigCksum() {
        return cloudConfigCksum;
    }

    /**
     * This is the setter method to the attribute.
     * Checksum of cloud configuration for network sec policy.
     * Internally set by cloud connector.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudConfigCksum set the cloudConfigCksum.
     */
    public void setCloudConfigCksum(String  cloudConfigCksum) {
        this.cloudConfigCksum = cloudConfigCksum;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Creator name.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This is the setter method to the attribute.
     * Creator name.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param createdBy set the createdBy.
     */
    public void setCreatedBy(String  createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Geo database.
     * It is a reference to an object of type geodb.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return geoDbRef
     */
    public String getGeoDbRef() {
        return geoDbRef;
    }

    /**
     * This is the setter method to the attribute.
     * Geo database.
     * It is a reference to an object of type geodb.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param geoDbRef set the geoDbRef.
     */
    public void setGeoDbRef(String  geoDbRef) {
        this.geoDbRef = geoDbRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Network security policy is created and modified by internal modules only.
     * Should not be modified by users.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return internal
     */
    public Boolean getInternal() {
        return internal;
    }

    /**
     * This is the setter method to the attribute.
     * Network security policy is created and modified by internal modules only.
     * Should not be modified by users.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param internal set the internal.
     */
    public void setInternal(Boolean  internal) {
        this.internal = internal;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ip reputation database.
     * It is a reference to an object of type ipreputationdb.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipReputationDbRef
     */
    public String getIpReputationDbRef() {
        return ipReputationDbRef;
    }

    /**
     * This is the setter method to the attribute.
     * Ip reputation database.
     * It is a reference to an object of type ipreputationdb.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipReputationDbRef set the ipReputationDbRef.
     */
    public void setIpReputationDbRef(String  ipReputationDbRef) {
        this.ipReputationDbRef = ipReputationDbRef;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Key value pairs for granular object access control.
     * Also allows for classification and tagging of similar objects.
     * Field deprecated in 20.1.5.
     * Field introduced in 20.1.2.
     * Maximum of 4 items allowed.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * @return labels
     */
    public List<KeyValue> getLabels() {
        return labels;
    }

    /**
     * This is the setter method. this will set the labels
     * Key value pairs for granular object access control.
     * Also allows for classification and tagging of similar objects.
     * Field deprecated in 20.1.5.
     * Field introduced in 20.1.2.
     * Maximum of 4 items allowed.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * @return labels
     */
    public void setLabels(List<KeyValue>  labels) {
        this.labels = labels;
    }

    /**
     * This is the setter method this will set the labels
     * Key value pairs for granular object access control.
     * Also allows for classification and tagging of similar objects.
     * Field deprecated in 20.1.5.
     * Field introduced in 20.1.2.
     * Maximum of 4 items allowed.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * @return labels
     */
    public NetworkSecurityPolicy addLabelsItem(KeyValue labelsItem) {
      if (this.labels == null) {
        this.labels = new ArrayList<KeyValue>();
      }
      this.labels.add(labelsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.5.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public List<RoleFilterMatchLabel> getMarkers() {
        return markers;
    }

    /**
     * This is the setter method. this will set the markers
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.5.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public void setMarkers(List<RoleFilterMatchLabel>  markers) {
        this.markers = markers;
    }

    /**
     * This is the setter method this will set the markers
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.5.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public NetworkSecurityPolicy addMarkersItem(RoleFilterMatchLabel markersItem) {
      if (this.markers == null) {
        this.markers = new ArrayList<RoleFilterMatchLabel>();
      }
      this.markers.add(markersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public List<NetworkSecurityRule> getRules() {
        return rules;
    }

    /**
     * This is the setter method. this will set the rules
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public void setRules(List<NetworkSecurityRule>  rules) {
        this.rules = rules;
    }

    /**
     * This is the setter method this will set the rules
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return rules
     */
    public NetworkSecurityPolicy addRulesItem(NetworkSecurityRule rulesItem) {
      if (this.rules == null) {
        this.rules = new ArrayList<NetworkSecurityRule>();
      }
      this.rules.add(rulesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type tenant.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type tenant.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
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
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      NetworkSecurityPolicy objNetworkSecurityPolicy = (NetworkSecurityPolicy) o;
      return   Objects.equals(this.uuid, objNetworkSecurityPolicy.uuid)&&
  Objects.equals(this.name, objNetworkSecurityPolicy.name)&&
  Objects.equals(this.rules, objNetworkSecurityPolicy.rules)&&
  Objects.equals(this.createdBy, objNetworkSecurityPolicy.createdBy)&&
  Objects.equals(this.cloudConfigCksum, objNetworkSecurityPolicy.cloudConfigCksum)&&
  Objects.equals(this.ipReputationDbRef, objNetworkSecurityPolicy.ipReputationDbRef)&&
  Objects.equals(this.labels, objNetworkSecurityPolicy.labels)&&
  Objects.equals(this.geoDbRef, objNetworkSecurityPolicy.geoDbRef)&&
  Objects.equals(this.markers, objNetworkSecurityPolicy.markers)&&
  Objects.equals(this.internal, objNetworkSecurityPolicy.internal)&&
  Objects.equals(this.description, objNetworkSecurityPolicy.description)&&
  Objects.equals(this.tenantRef, objNetworkSecurityPolicy.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class NetworkSecurityPolicy {\n");
                  sb.append("    cloudConfigCksum: ").append(toIndentedString(cloudConfigCksum)).append("\n");
                        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    geoDbRef: ").append(toIndentedString(geoDbRef)).append("\n");
                        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
                        sb.append("    ipReputationDbRef: ").append(toIndentedString(ipReputationDbRef)).append("\n");
                        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
                        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
