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
 * The ControllerPortalAuth is a POJO class extends AviRestResource that used for creating
 * ControllerPortalAuth.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ControllerPortalAuth  {
    @JsonProperty("access_token")
    private String accessToken = null;

    @JsonProperty("instance_url")
    private String instanceUrl = null;

    @JsonProperty("jwt_token")
    private String jwtToken = null;



    /**
     * This is the getter method this will return the attribute value.
     * Access token to authenticate customer portal rest calls.
     * Field introduced in 18.2.6.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * This is the setter method to the attribute.
     * Access token to authenticate customer portal rest calls.
     * Field introduced in 18.2.6.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param accessToken set the accessToken.
     */
    public void setAccessToken(String  accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Salesforce instance url.
     * Field introduced in 18.2.6.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return instanceUrl
     */
    public String getInstanceUrl() {
        return instanceUrl;
    }

    /**
     * This is the setter method to the attribute.
     * Salesforce instance url.
     * Field introduced in 18.2.6.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param instanceUrl set the instanceUrl.
     */
    public void setInstanceUrl(String  instanceUrl) {
        this.instanceUrl = instanceUrl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Signed jwt to refresh the access token.
     * Field introduced in 18.2.6.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return jwtToken
     */
    public String getJwtToken() {
        return jwtToken;
    }

    /**
     * This is the setter method to the attribute.
     * Signed jwt to refresh the access token.
     * Field introduced in 18.2.6.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param jwtToken set the jwtToken.
     */
    public void setJwtToken(String  jwtToken) {
        this.jwtToken = jwtToken;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ControllerPortalAuth objControllerPortalAuth = (ControllerPortalAuth) o;
      return   Objects.equals(this.accessToken, objControllerPortalAuth.accessToken)&&
  Objects.equals(this.jwtToken, objControllerPortalAuth.jwtToken)&&
  Objects.equals(this.instanceUrl, objControllerPortalAuth.instanceUrl);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ControllerPortalAuth {\n");
                  sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
                        sb.append("    instanceUrl: ").append(toIndentedString(instanceUrl)).append("\n");
                        sb.append("    jwtToken: ").append(toIndentedString(jwtToken)).append("\n");
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
