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
 * The GcpInfo is a POJO class extends AviRestResource that used for creating
 * GcpInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GcpInfo  {
    @JsonProperty("hostname")
    private String hostname = null;

    @JsonProperty("machine_type")
    private String machineType = null;

    @JsonProperty("network")
    private String network = null;

    @JsonProperty("project")
    private String project = null;

    @JsonProperty("subnet")
    private String subnet = null;

    @JsonProperty("zone")
    private String zone = null;



    /**
     * This is the getter method this will return the attribute value.
     * Hostname of this se.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * This is the setter method to the attribute.
     * Hostname of this se.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param hostname set the hostname.
     */
    public void setHostname(String  hostname) {
        this.hostname = hostname;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Instance type of this se.
     * Field introduced in 22.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return machineType
     */
    public String getMachineType() {
        return machineType;
    }

    /**
     * This is the setter method to the attribute.
     * Instance type of this se.
     * Field introduced in 22.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param machineType set the machineType.
     */
    public void setMachineType(String  machineType) {
        this.machineType = machineType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Network this se is assigned.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return network
     */
    public String getNetwork() {
        return network;
    }

    /**
     * This is the setter method to the attribute.
     * Network this se is assigned.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param network set the network.
     */
    public void setNetwork(String  network) {
        this.network = network;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Project this se belongs to.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return project
     */
    public String getProject() {
        return project;
    }

    /**
     * This is the setter method to the attribute.
     * Project this se belongs to.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param project set the project.
     */
    public void setProject(String  project) {
        this.project = project;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Subnet assigned to this se.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subnet
     */
    public String getSubnet() {
        return subnet;
    }

    /**
     * This is the setter method to the attribute.
     * Subnet assigned to this se.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param subnet set the subnet.
     */
    public void setSubnet(String  subnet) {
        this.subnet = subnet;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Zone this se is part of.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return zone
     */
    public String getZone() {
        return zone;
    }

    /**
     * This is the setter method to the attribute.
     * Zone this se is part of.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param zone set the zone.
     */
    public void setZone(String  zone) {
        this.zone = zone;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      GcpInfo objGcpInfo = (GcpInfo) o;
      return   Objects.equals(this.project, objGcpInfo.project)&&
  Objects.equals(this.zone, objGcpInfo.zone)&&
  Objects.equals(this.network, objGcpInfo.network)&&
  Objects.equals(this.subnet, objGcpInfo.subnet)&&
  Objects.equals(this.hostname, objGcpInfo.hostname)&&
  Objects.equals(this.machineType, objGcpInfo.machineType);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GcpInfo {\n");
                  sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
                        sb.append("    machineType: ").append(toIndentedString(machineType)).append("\n");
                        sb.append("    network: ").append(toIndentedString(network)).append("\n");
                        sb.append("    project: ").append(toIndentedString(project)).append("\n");
                        sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
                        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
