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
 * The UserAgentDBConfig is a POJO class extends AviRestResource that used for creating
 * UserAgentDBConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAgentDBConfig  {
    @JsonProperty("allowed_batch_size")
    private Integer allowedBatchSize = 500;



    /**
     * This is the getter method this will return the attribute value.
     * Batch query limit.
     * Allowed values are 1-500.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, essentials(allowed values- 500) edition, basic(allowed values- 500) edition, enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 500.
     * @return allowedBatchSize
     */
    public Integer getAllowedBatchSize() {
        return allowedBatchSize;
    }

    /**
     * This is the setter method to the attribute.
     * Batch query limit.
     * Allowed values are 1-500.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, essentials(allowed values- 500) edition, basic(allowed values- 500) edition, enterprise with cloud
     * services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 500.
     * @param allowedBatchSize set the allowedBatchSize.
     */
    public void setAllowedBatchSize(Integer  allowedBatchSize) {
        this.allowedBatchSize = allowedBatchSize;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      UserAgentDBConfig objUserAgentDBConfig = (UserAgentDBConfig) o;
      return   Objects.equals(this.allowedBatchSize, objUserAgentDBConfig.allowedBatchSize);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class UserAgentDBConfig {\n");
                  sb.append("    allowedBatchSize: ").append(toIndentedString(allowedBatchSize)).append("\n");
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
