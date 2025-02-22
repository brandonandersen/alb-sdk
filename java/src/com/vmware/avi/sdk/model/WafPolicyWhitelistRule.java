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
 * The WafPolicyWhitelistRule is a POJO class extends AviRestResource that used for creating
 * WafPolicyWhitelistRule.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WafPolicyWhitelistRule  {
    @JsonProperty("actions")
    private List<String> actions;

    @JsonProperty("description")
    private String description;

    @JsonProperty("enable")
    private Boolean enable;

    @JsonProperty("index")
    private Integer index;

    @JsonProperty("match")
    private MatchTarget match;

    @JsonProperty("name")
    private String name;

    @JsonProperty("sampling_percent")
    private Integer samplingPercent;


    /**
     * This is the getter method this will return the attribute value.
     * Actions to be performed upon successful matching.
     * Enum options - WAF_POLICY_WHITELIST_ACTION_ALLOW, WAF_POLICY_WHITELIST_ACTION_DETECTION_MODE, WAF_POLICY_WHITELIST_ACTION_CONTINUE.
     * Field deprecated in 20.1.3.
     * Field introduced in 18.2.3.
     * Minimum of 1 items required.
     * Maximum of 1 items allowed.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return actions
     */
    public List<String> getActions() {
        return actions;
    }

    /**
     * This is the setter method. this will set the actions
     * Actions to be performed upon successful matching.
     * Enum options - WAF_POLICY_WHITELIST_ACTION_ALLOW, WAF_POLICY_WHITELIST_ACTION_DETECTION_MODE, WAF_POLICY_WHITELIST_ACTION_CONTINUE.
     * Field deprecated in 20.1.3.
     * Field introduced in 18.2.3.
     * Minimum of 1 items required.
     * Maximum of 1 items allowed.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return actions
     */
    public void setActions(List<String>  actions) {
        this.actions = actions;
    }

    /**
     * This is the setter method this will set the actions
     * Actions to be performed upon successful matching.
     * Enum options - WAF_POLICY_WHITELIST_ACTION_ALLOW, WAF_POLICY_WHITELIST_ACTION_DETECTION_MODE, WAF_POLICY_WHITELIST_ACTION_CONTINUE.
     * Field deprecated in 20.1.3.
     * Field introduced in 18.2.3.
     * Minimum of 1 items required.
     * Maximum of 1 items allowed.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return actions
     */
    public WafPolicyWhitelistRule addActionsItem(String actionsItem) {
      if (this.actions == null) {
        this.actions = new ArrayList<String>();
      }
      this.actions.add(actionsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Description of this rule.
     * Field deprecated in 20.1.3.
     * Field introduced in 18.2.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Description of this rule.
     * Field deprecated in 20.1.3.
     * Field introduced in 18.2.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable or disable the rule.
     * Field deprecated in 20.1.3.
     * Field introduced in 18.2.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * This is the setter method to the attribute.
     * Enable or disable the rule.
     * Field deprecated in 20.1.3.
     * Field introduced in 18.2.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param enable set the enable.
     */
    public void setEnable(Boolean  enable) {
        this.enable = enable;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Rules are executed in order of this index field.
     * Field deprecated in 20.1.3.
     * Field introduced in 18.2.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * This is the setter method to the attribute.
     * Rules are executed in order of this index field.
     * Field deprecated in 20.1.3.
     * Field introduced in 18.2.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param index set the index.
     */
    public void setIndex(Integer  index) {
        this.index = index;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Match criteria describing requests to which this rule should be applied.
     * Field deprecated in 20.1.3.
     * Field introduced in 18.2.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return match
     */
    public MatchTarget getMatch() {
        return match;
    }

    /**
     * This is the setter method to the attribute.
     * Match criteria describing requests to which this rule should be applied.
     * Field deprecated in 20.1.3.
     * Field introduced in 18.2.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param match set the match.
     */
    public void setMatch(MatchTarget match) {
        this.match = match;
    }

    /**
     * This is the getter method this will return the attribute value.
     * A name describing the rule in a short form.
     * Field deprecated in 20.1.3.
     * Field introduced in 18.2.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * A name describing the rule in a short form.
     * Field deprecated in 20.1.3.
     * Field introduced in 18.2.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Percentage of traffic that is sampled.
     * Allowed values are 0-100.
     * Field deprecated in 20.1.3.
     * Field introduced in 20.1.1.
     * Unit is percent.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return samplingPercent
     */
    public Integer getSamplingPercent() {
        return samplingPercent;
    }

    /**
     * This is the setter method to the attribute.
     * Percentage of traffic that is sampled.
     * Allowed values are 0-100.
     * Field deprecated in 20.1.3.
     * Field introduced in 20.1.1.
     * Unit is percent.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param samplingPercent set the samplingPercent.
     */
    public void setSamplingPercent(Integer  samplingPercent) {
        this.samplingPercent = samplingPercent;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      WafPolicyWhitelistRule objWafPolicyWhitelistRule = (WafPolicyWhitelistRule) o;
      return   Objects.equals(this.index, objWafPolicyWhitelistRule.index)&&
  Objects.equals(this.name, objWafPolicyWhitelistRule.name)&&
  Objects.equals(this.enable, objWafPolicyWhitelistRule.enable)&&
  Objects.equals(this.match, objWafPolicyWhitelistRule.match)&&
  Objects.equals(this.actions, objWafPolicyWhitelistRule.actions)&&
  Objects.equals(this.description, objWafPolicyWhitelistRule.description)&&
  Objects.equals(this.samplingPercent, objWafPolicyWhitelistRule.samplingPercent);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WafPolicyWhitelistRule {\n");
                  sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
                        sb.append("    index: ").append(toIndentedString(index)).append("\n");
                        sb.append("    match: ").append(toIndentedString(match)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    samplingPercent: ").append(toIndentedString(samplingPercent)).append("\n");
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
