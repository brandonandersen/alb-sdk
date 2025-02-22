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
 * The GslbPoolMemberDatapathStatus is a POJO class extends AviRestResource that used for creating
 * GslbPoolMemberDatapathStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GslbPoolMemberDatapathStatus  {
    @JsonProperty("location")
    private GeoLocation location = null;

    @JsonProperty("oper_status")
    private OperationalStatus operStatus = null;

    @JsonProperty("site_uuid")
    private String siteUuid = null;



    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return location
     */
    public GeoLocation getLocation() {
        return location;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param location set the location.
     */
    public void setLocation(GeoLocation location) {
        this.location = location;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return operStatus
     */
    public OperationalStatus getOperStatus() {
        return operStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param operStatus set the operStatus.
     */
    public void setOperStatus(OperationalStatus operStatus) {
        this.operStatus = operStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return siteUuid
     */
    public String getSiteUuid() {
        return siteUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param siteUuid set the siteUuid.
     */
    public void setSiteUuid(String  siteUuid) {
        this.siteUuid = siteUuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      GslbPoolMemberDatapathStatus objGslbPoolMemberDatapathStatus = (GslbPoolMemberDatapathStatus) o;
      return   Objects.equals(this.siteUuid, objGslbPoolMemberDatapathStatus.siteUuid)&&
  Objects.equals(this.operStatus, objGslbPoolMemberDatapathStatus.operStatus)&&
  Objects.equals(this.location, objGslbPoolMemberDatapathStatus.location);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GslbPoolMemberDatapathStatus {\n");
                  sb.append("    location: ").append(toIndentedString(location)).append("\n");
                        sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
                        sb.append("    siteUuid: ").append(toIndentedString(siteUuid)).append("\n");
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
