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
 * The WafApplicationSignatureAppVersion is a POJO class extends AviRestResource that used for creating
 * WafApplicationSignatureAppVersion.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WafApplicationSignatureAppVersion  {
    @JsonProperty("application")
    private String application;

    @JsonProperty("last_changed_ruleset_version")
    private String lastChangedRulesetVersion;

    @JsonProperty("number_of_rules")
    private Integer numberOfRules;



    /**
     * This is the getter method this will return the attribute value.
     * Name of an application in the rule set.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * @return application
     */
    public String getApplication() {
        return application;
    }

    /**
     * This is the setter method to the attribute.
     * Name of an application in the rule set.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * @param application set the application.
     */
    public void setApplication(String  application) {
        this.application = application;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The last version of the rule set when the rules corresponding to the application changed.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * @return lastChangedRulesetVersion
     */
    public String getLastChangedRulesetVersion() {
        return lastChangedRulesetVersion;
    }

    /**
     * This is the setter method to the attribute.
     * The last version of the rule set when the rules corresponding to the application changed.
     * Field introduced in 20.1.1.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * @param lastChangedRulesetVersion set the lastChangedRulesetVersion.
     */
    public void setLastChangedRulesetVersion(String  lastChangedRulesetVersion) {
        this.lastChangedRulesetVersion = lastChangedRulesetVersion;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The number of rules available for this application.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * @return numberOfRules
     */
    public Integer getNumberOfRules() {
        return numberOfRules;
    }

    /**
     * This is the setter method to the attribute.
     * The number of rules available for this application.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * @param numberOfRules set the numberOfRules.
     */
    public void setNumberOfRules(Integer  numberOfRules) {
        this.numberOfRules = numberOfRules;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      WafApplicationSignatureAppVersion objWafApplicationSignatureAppVersion = (WafApplicationSignatureAppVersion) o;
      return   Objects.equals(this.application, objWafApplicationSignatureAppVersion.application)&&
  Objects.equals(this.lastChangedRulesetVersion, objWafApplicationSignatureAppVersion.lastChangedRulesetVersion)&&
  Objects.equals(this.numberOfRules, objWafApplicationSignatureAppVersion.numberOfRules);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WafApplicationSignatureAppVersion {\n");
                  sb.append("    application: ").append(toIndentedString(application)).append("\n");
                        sb.append("    lastChangedRulesetVersion: ").append(toIndentedString(lastChangedRulesetVersion)).append("\n");
                        sb.append("    numberOfRules: ").append(toIndentedString(numberOfRules)).append("\n");
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
