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
 * The SePoolLbEventDetails is a POJO class extends AviRestResource that used for creating
 * SePoolLbEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SePoolLbEventDetails  {
    @JsonProperty("failure_code")
    private String failureCode = null;

    @JsonProperty("pool")
    private String pool = null;

    @JsonProperty("reason")
    private String reason = null;

    @JsonProperty("src_uuid")
    private String srcUuid = null;

    @JsonProperty("virtual_service")
    private String virtualService = null;



    /**
     * This is the getter method this will return the attribute value.
     * Reason code for load balancing failure.
     * Enum options - PERSISTENT_SERVER_INVALID, PERSISTENT_SERVER_DOWN, SRVR_DOWN, ADD_PENDING, SLOW_START_MAX_CONN, MAX_CONN, NO_LPORT, SUSPECT_STATE,
     * MAX_CONN_RATE, CAPEST_RAND_MAX_CONN, GET_NEXT.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return failureCode
     */
    public String getFailureCode() {
        return failureCode;
    }

    /**
     * This is the setter method to the attribute.
     * Reason code for load balancing failure.
     * Enum options - PERSISTENT_SERVER_INVALID, PERSISTENT_SERVER_DOWN, SRVR_DOWN, ADD_PENDING, SLOW_START_MAX_CONN, MAX_CONN, NO_LPORT, SUSPECT_STATE,
     * MAX_CONN_RATE, CAPEST_RAND_MAX_CONN, GET_NEXT.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param failureCode set the failureCode.
     */
    public void setFailureCode(String  failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Pool name.
     * It is a reference to an object of type pool.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pool
     */
    public String getPool() {
        return pool;
    }

    /**
     * This is the setter method to the attribute.
     * Pool name.
     * It is a reference to an object of type pool.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param pool set the pool.
     */
    public void setPool(String  pool) {
        this.pool = pool;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reason for load balancing failure.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * This is the setter method to the attribute.
     * Reason for load balancing failure.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reason set the reason.
     */
    public void setReason(String  reason) {
        this.reason = reason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of event generator.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return srcUuid
     */
    public String getSrcUuid() {
        return srcUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of event generator.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param srcUuid set the srcUuid.
     */
    public void setSrcUuid(String  srcUuid) {
        this.srcUuid = srcUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Virtual service name.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return virtualService
     */
    public String getVirtualService() {
        return virtualService;
    }

    /**
     * This is the setter method to the attribute.
     * Virtual service name.
     * It is a reference to an object of type virtualservice.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param virtualService set the virtualService.
     */
    public void setVirtualService(String  virtualService) {
        this.virtualService = virtualService;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SePoolLbEventDetails objSePoolLbEventDetails = (SePoolLbEventDetails) o;
      return   Objects.equals(this.pool, objSePoolLbEventDetails.pool)&&
  Objects.equals(this.reason, objSePoolLbEventDetails.reason)&&
  Objects.equals(this.failureCode, objSePoolLbEventDetails.failureCode)&&
  Objects.equals(this.virtualService, objSePoolLbEventDetails.virtualService)&&
  Objects.equals(this.srcUuid, objSePoolLbEventDetails.srcUuid);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SePoolLbEventDetails {\n");
                  sb.append("    failureCode: ").append(toIndentedString(failureCode)).append("\n");
                        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
                        sb.append("    srcUuid: ").append(toIndentedString(srcUuid)).append("\n");
                        sb.append("    virtualService: ").append(toIndentedString(virtualService)).append("\n");
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
