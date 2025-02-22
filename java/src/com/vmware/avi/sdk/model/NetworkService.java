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
 * The NetworkService is a POJO class extends AviRestResource that used for creating
 * NetworkService.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NetworkService extends AviRestResource  {
    @JsonProperty("cloud_ref")
    private String cloudRef = null;

    @JsonProperty("labels")
    private List<KeyValue> labels;

    @JsonProperty("markers")
    private List<RoleFilterMatchLabel> markers = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("routing_service")
    private RoutingService routingService = null;

    @JsonProperty("se_group_ref")
    private String seGroupRef = null;

    @JsonProperty("service_type")
    private String serviceType = null;

    @JsonProperty("tenant_ref")
    private String tenantRef = null;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid = null;

    @JsonProperty("vrf_ref")
    private String vrfRef = null;



    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type cloud.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudRef
     */
    public String getCloudRef() {
        return cloudRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type cloud.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudRef set the cloudRef.
     */
    public void setCloudRef(String  cloudRef) {
        this.cloudRef = cloudRef;
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
    public NetworkService addLabelsItem(KeyValue labelsItem) {
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
    public NetworkService addMarkersItem(RoleFilterMatchLabel markersItem) {
      if (this.markers == null) {
        this.markers = new ArrayList<RoleFilterMatchLabel>();
      }
      this.markers.add(markersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the networkservice.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the networkservice.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Routing information of the networkservice.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return routingService
     */
    public RoutingService getRoutingService() {
        return routingService;
    }

    /**
     * This is the setter method to the attribute.
     * Routing information of the networkservice.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param routingService set the routingService.
     */
    public void setRoutingService(RoutingService routingService) {
        this.routingService = routingService;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Service engine group to which the service is applied.
     * It is a reference to an object of type serviceenginegroup.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupRef
     */
    public String getSeGroupRef() {
        return seGroupRef;
    }

    /**
     * This is the setter method to the attribute.
     * Service engine group to which the service is applied.
     * It is a reference to an object of type serviceenginegroup.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGroupRef set the seGroupRef.
     */
    public void setSeGroupRef(String  seGroupRef) {
        this.seGroupRef = seGroupRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Indicates the type of networkservice.
     * Enum options - ROUTING_SERVICE.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceType
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * This is the setter method to the attribute.
     * Indicates the type of networkservice.
     * Enum options - ROUTING_SERVICE.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serviceType set the serviceType.
     */
    public void setServiceType(String  serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type tenant.
     * Field introduced in 18.2.5.
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
     * Field introduced in 18.2.5.
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
     * Uuid of the networkservice.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the networkservice.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vrf context to which the service is scoped.
     * It is a reference to an object of type vrfcontext.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vrfRef
     */
    public String getVrfRef() {
        return vrfRef;
    }

    /**
     * This is the setter method to the attribute.
     * Vrf context to which the service is scoped.
     * It is a reference to an object of type vrfcontext.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vrfRef set the vrfRef.
     */
    public void setVrfRef(String  vrfRef) {
        this.vrfRef = vrfRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      NetworkService objNetworkService = (NetworkService) o;
      return   Objects.equals(this.uuid, objNetworkService.uuid)&&
  Objects.equals(this.name, objNetworkService.name)&&
  Objects.equals(this.seGroupRef, objNetworkService.seGroupRef)&&
  Objects.equals(this.vrfRef, objNetworkService.vrfRef)&&
  Objects.equals(this.serviceType, objNetworkService.serviceType)&&
  Objects.equals(this.routingService, objNetworkService.routingService)&&
  Objects.equals(this.labels, objNetworkService.labels)&&
  Objects.equals(this.markers, objNetworkService.markers)&&
  Objects.equals(this.tenantRef, objNetworkService.tenantRef)&&
  Objects.equals(this.cloudRef, objNetworkService.cloudRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class NetworkService {\n");
                  sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
                        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
                        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    routingService: ").append(toIndentedString(routingService)).append("\n");
                        sb.append("    seGroupRef: ").append(toIndentedString(seGroupRef)).append("\n");
                        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    vrfRef: ").append(toIndentedString(vrfRef)).append("\n");
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
