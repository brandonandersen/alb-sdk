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
 * The SecureChannelAvailableLocalIPs is a POJO class extends AviRestResource that used for creating
 * SecureChannelAvailableLocalIPs.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SecureChannelAvailableLocalIPs extends AviRestResource  {
    @JsonProperty("end")
    private Integer end = null;

    @JsonProperty("free_controller_ips")
    private List<String> freeControllerIps;

    @JsonProperty("free_ips")
    private List<Integer> freeIps = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("start")
    private Integer start = null;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid = null;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return end
     */
    public Integer getEnd() {
        return end;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param end set the end.
     */
    public void setEnd(Integer  end) {
        this.end = end;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return freeControllerIps
     */
    public List<String> getFreeControllerIps() {
        return freeControllerIps;
    }

    /**
     * This is the setter method. this will set the freeControllerIps
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return freeControllerIps
     */
    public void setFreeControllerIps(List<String>  freeControllerIps) {
        this.freeControllerIps = freeControllerIps;
    }

    /**
     * This is the setter method this will set the freeControllerIps
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return freeControllerIps
     */
    public SecureChannelAvailableLocalIPs addFreeControllerIpsItem(String freeControllerIpsItem) {
      if (this.freeControllerIps == null) {
        this.freeControllerIps = new ArrayList<String>();
      }
      this.freeControllerIps.add(freeControllerIpsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return freeIps
     */
    public List<Integer> getFreeIps() {
        return freeIps;
    }

    /**
     * This is the setter method. this will set the freeIps
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return freeIps
     */
    public void setFreeIps(List<Integer>  freeIps) {
        this.freeIps = freeIps;
    }

    /**
     * This is the setter method this will set the freeIps
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return freeIps
     */
    public SecureChannelAvailableLocalIPs addFreeIpsItem(Integer freeIpsItem) {
      if (this.freeIps == null) {
        this.freeIps = new ArrayList<Integer>();
      }
      this.freeIps.add(freeIpsItem);
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
     * @return start
     */
    public Integer getStart() {
        return start;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param start set the start.
     */
    public void setStart(Integer  start) {
        this.start = start;
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
      SecureChannelAvailableLocalIPs objSecureChannelAvailableLocalIPs = (SecureChannelAvailableLocalIPs) o;
      return   Objects.equals(this.uuid, objSecureChannelAvailableLocalIPs.uuid)&&
  Objects.equals(this.name, objSecureChannelAvailableLocalIPs.name)&&
  Objects.equals(this.freeIps, objSecureChannelAvailableLocalIPs.freeIps)&&
  Objects.equals(this.start, objSecureChannelAvailableLocalIPs.start)&&
  Objects.equals(this.end, objSecureChannelAvailableLocalIPs.end)&&
  Objects.equals(this.freeControllerIps, objSecureChannelAvailableLocalIPs.freeControllerIps);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SecureChannelAvailableLocalIPs {\n");
                  sb.append("    end: ").append(toIndentedString(end)).append("\n");
                        sb.append("    freeControllerIps: ").append(toIndentedString(freeControllerIps)).append("\n");
                        sb.append("    freeIps: ").append(toIndentedString(freeIps)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
