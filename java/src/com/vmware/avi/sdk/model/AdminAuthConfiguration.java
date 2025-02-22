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
 * The AdminAuthConfiguration is a POJO class extends AviRestResource that used for creating
 * AdminAuthConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminAuthConfiguration  {
    @JsonProperty("allow_local_user_login")
    private Boolean allowLocalUserLogin = true;

    @JsonProperty("alternate_auth_configurations")
    private List<AlternateAuthConfiguration> alternateAuthConfigurations = null;

    @JsonProperty("auth_profile_ref")
    private String authProfileRef = null;

    @JsonProperty("mapping_rules")
    private List<AuthMappingRule> mappingRules = null;



    /**
     * This is the getter method this will return the attribute value.
     * Allow any user created locally to login with local credentials.
     * Field introduced in 17.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return allowLocalUserLogin
     */
    public Boolean getAllowLocalUserLogin() {
        return allowLocalUserLogin;
    }

    /**
     * This is the setter method to the attribute.
     * Allow any user created locally to login with local credentials.
     * Field introduced in 17.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param allowLocalUserLogin set the allowLocalUserLogin.
     */
    public void setAllowLocalUserLogin(Boolean  allowLocalUserLogin) {
        this.allowLocalUserLogin = allowLocalUserLogin;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Secondary authentication mechanisms to be used.
     * Field introduced in 20.1.6.
     * Maximum of 1 items allowed.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return alternateAuthConfigurations
     */
    public List<AlternateAuthConfiguration> getAlternateAuthConfigurations() {
        return alternateAuthConfigurations;
    }

    /**
     * This is the setter method. this will set the alternateAuthConfigurations
     * Secondary authentication mechanisms to be used.
     * Field introduced in 20.1.6.
     * Maximum of 1 items allowed.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return alternateAuthConfigurations
     */
    public void setAlternateAuthConfigurations(List<AlternateAuthConfiguration>  alternateAuthConfigurations) {
        this.alternateAuthConfigurations = alternateAuthConfigurations;
    }

    /**
     * This is the setter method this will set the alternateAuthConfigurations
     * Secondary authentication mechanisms to be used.
     * Field introduced in 20.1.6.
     * Maximum of 1 items allowed.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return alternateAuthConfigurations
     */
    public AdminAuthConfiguration addAlternateAuthConfigurationsItem(AlternateAuthConfiguration alternateAuthConfigurationsItem) {
      if (this.alternateAuthConfigurations == null) {
        this.alternateAuthConfigurations = new ArrayList<AlternateAuthConfiguration>();
      }
      this.alternateAuthConfigurations.add(alternateAuthConfigurationsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type authprofile.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authProfileRef
     */
    public String getAuthProfileRef() {
        return authProfileRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type authprofile.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param authProfileRef set the authProfileRef.
     */
    public void setAuthProfileRef(String  authProfileRef) {
        this.authProfileRef = authProfileRef;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Rules list for tenant or role mapping.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mappingRules
     */
    public List<AuthMappingRule> getMappingRules() {
        return mappingRules;
    }

    /**
     * This is the setter method. this will set the mappingRules
     * Rules list for tenant or role mapping.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mappingRules
     */
    public void setMappingRules(List<AuthMappingRule>  mappingRules) {
        this.mappingRules = mappingRules;
    }

    /**
     * This is the setter method this will set the mappingRules
     * Rules list for tenant or role mapping.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mappingRules
     */
    public AdminAuthConfiguration addMappingRulesItem(AuthMappingRule mappingRulesItem) {
      if (this.mappingRules == null) {
        this.mappingRules = new ArrayList<AuthMappingRule>();
      }
      this.mappingRules.add(mappingRulesItem);
      return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AdminAuthConfiguration objAdminAuthConfiguration = (AdminAuthConfiguration) o;
      return   Objects.equals(this.authProfileRef, objAdminAuthConfiguration.authProfileRef)&&
  Objects.equals(this.mappingRules, objAdminAuthConfiguration.mappingRules)&&
  Objects.equals(this.allowLocalUserLogin, objAdminAuthConfiguration.allowLocalUserLogin)&&
  Objects.equals(this.alternateAuthConfigurations, objAdminAuthConfiguration.alternateAuthConfigurations);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AdminAuthConfiguration {\n");
                  sb.append("    allowLocalUserLogin: ").append(toIndentedString(allowLocalUserLogin)).append("\n");
                        sb.append("    alternateAuthConfigurations: ").append(toIndentedString(alternateAuthConfigurations)).append("\n");
                        sb.append("    authProfileRef: ").append(toIndentedString(authProfileRef)).append("\n");
                        sb.append("    mappingRules: ").append(toIndentedString(mappingRules)).append("\n");
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
