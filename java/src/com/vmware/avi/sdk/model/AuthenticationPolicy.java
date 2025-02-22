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
 * The AuthenticationPolicy is a POJO class extends AviRestResource that used for creating
 * AuthenticationPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticationPolicy  {
    @JsonProperty("auth_profile_ref")
    private String authProfileRef;

    @JsonProperty("authn_rules")
    private List<AuthenticationRule> authnRules = null;

    @JsonProperty("cookie_name")
    private String cookieName;

    @JsonProperty("cookie_timeout")
    private Integer cookieTimeout;

    @JsonProperty("default_auth_profile_ref")
    private String defaultAuthProfileRef = null;

    @JsonProperty("entity_id")
    private String entityId;

    @JsonProperty("key")
    private List<HttpCookiePersistenceKey> key;

    @JsonProperty("single_signon_url")
    private String singleSignonUrl;

    @JsonProperty("sp_metadata")
    private String spMetadata;



    /**
     * This is the getter method this will return the attribute value.
     * Auth profile to use for validating users.
     * It is a reference to an object of type authprofile.
     * Field deprecated in 18.2.3.
     * Field introduced in 18.2.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return authProfileRef
     */
    public String getAuthProfileRef() {
        return authProfileRef;
    }

    /**
     * This is the setter method to the attribute.
     * Auth profile to use for validating users.
     * It is a reference to an object of type authprofile.
     * Field deprecated in 18.2.3.
     * Field introduced in 18.2.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param authProfileRef set the authProfileRef.
     */
    public void setAuthProfileRef(String  authProfileRef) {
        this.authProfileRef = authProfileRef;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Add rules to apply auth profile to specific targets.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authnRules
     */
    public List<AuthenticationRule> getAuthnRules() {
        return authnRules;
    }

    /**
     * This is the setter method. this will set the authnRules
     * Add rules to apply auth profile to specific targets.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authnRules
     */
    public void setAuthnRules(List<AuthenticationRule>  authnRules) {
        this.authnRules = authnRules;
    }

    /**
     * This is the setter method this will set the authnRules
     * Add rules to apply auth profile to specific targets.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authnRules
     */
    public AuthenticationPolicy addAuthnRulesItem(AuthenticationRule authnRulesItem) {
      if (this.authnRules == null) {
        this.authnRules = new ArrayList<AuthenticationRule>();
      }
      this.authnRules.add(authnRulesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Http cookie name for authenticated session.
     * Field deprecated in 18.2.3.
     * Field introduced in 18.2.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return cookieName
     */
    public String getCookieName() {
        return cookieName;
    }

    /**
     * This is the setter method to the attribute.
     * Http cookie name for authenticated session.
     * Field deprecated in 18.2.3.
     * Field introduced in 18.2.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param cookieName set the cookieName.
     */
    public void setCookieName(String  cookieName) {
        this.cookieName = cookieName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Cookie timeout in minutes.
     * Allowed values are 1-1440.
     * Field deprecated in 18.2.3.
     * Field introduced in 18.2.1.
     * Unit is min.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return cookieTimeout
     */
    public Integer getCookieTimeout() {
        return cookieTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Cookie timeout in minutes.
     * Allowed values are 1-1440.
     * Field deprecated in 18.2.3.
     * Field introduced in 18.2.1.
     * Unit is min.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param cookieTimeout set the cookieTimeout.
     */
    public void setCookieTimeout(Integer  cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Auth profile to use for validating users.
     * It is a reference to an object of type authprofile.
     * Field introduced in 18.2.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return defaultAuthProfileRef
     */
    public String getDefaultAuthProfileRef() {
        return defaultAuthProfileRef;
    }

    /**
     * This is the setter method to the attribute.
     * Auth profile to use for validating users.
     * It is a reference to an object of type authprofile.
     * Field introduced in 18.2.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param defaultAuthProfileRef set the defaultAuthProfileRef.
     */
    public void setDefaultAuthProfileRef(String  defaultAuthProfileRef) {
        this.defaultAuthProfileRef = defaultAuthProfileRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Globally unique entityid for this node.
     * Entity id on the idp should match this.
     * Field deprecated in 18.2.3.
     * Field introduced in 18.2.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return entityId
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * This is the setter method to the attribute.
     * Globally unique entityid for this node.
     * Entity id on the idp should match this.
     * Field deprecated in 18.2.3.
     * Field introduced in 18.2.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param entityId set the entityId.
     */
    public void setEntityId(String  entityId) {
        this.entityId = entityId;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Key to generate the cookie.
     * Field deprecated in 18.2.3.
     * Field introduced in 18.2.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return key
     */
    public List<HttpCookiePersistenceKey> getKey() {
        return key;
    }

    /**
     * This is the setter method. this will set the key
     * Key to generate the cookie.
     * Field deprecated in 18.2.3.
     * Field introduced in 18.2.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return key
     */
    public void setKey(List<HttpCookiePersistenceKey>  key) {
        this.key = key;
    }

    /**
     * This is the setter method this will set the key
     * Key to generate the cookie.
     * Field deprecated in 18.2.3.
     * Field introduced in 18.2.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return key
     */
    public AuthenticationPolicy addKeyItem(HttpCookiePersistenceKey keyItem) {
      if (this.key == null) {
        this.key = new ArrayList<HttpCookiePersistenceKey>();
      }
      this.key.add(keyItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Single signon url to be programmed on the idp.
     * Field deprecated in 18.2.3.
     * Field introduced in 18.2.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return singleSignonUrl
     */
    public String getSingleSignonUrl() {
        return singleSignonUrl;
    }

    /**
     * This is the setter method to the attribute.
     * Single signon url to be programmed on the idp.
     * Field deprecated in 18.2.3.
     * Field introduced in 18.2.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param singleSignonUrl set the singleSignonUrl.
     */
    public void setSingleSignonUrl(String  singleSignonUrl) {
        this.singleSignonUrl = singleSignonUrl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Saml sp metadata.
     * Field deprecated in 18.2.3.
     * Field introduced in 18.2.1.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * @return spMetadata
     */
    public String getSpMetadata() {
        return spMetadata;
    }

    /**
     * This is the setter method to the attribute.
     * Saml sp metadata.
     * Field deprecated in 18.2.3.
     * Field introduced in 18.2.1.
     * Allowed in enterprise with any value edition, essentials with any value edition, basic with any value edition, enterprise with cloud services
     * edition.
     * @param spMetadata set the spMetadata.
     */
    public void setSpMetadata(String  spMetadata) {
        this.spMetadata = spMetadata;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AuthenticationPolicy objAuthenticationPolicy = (AuthenticationPolicy) o;
      return   Objects.equals(this.entityId, objAuthenticationPolicy.entityId)&&
  Objects.equals(this.singleSignonUrl, objAuthenticationPolicy.singleSignonUrl)&&
  Objects.equals(this.authProfileRef, objAuthenticationPolicy.authProfileRef)&&
  Objects.equals(this.spMetadata, objAuthenticationPolicy.spMetadata)&&
  Objects.equals(this.key, objAuthenticationPolicy.key)&&
  Objects.equals(this.cookieTimeout, objAuthenticationPolicy.cookieTimeout)&&
  Objects.equals(this.cookieName, objAuthenticationPolicy.cookieName)&&
  Objects.equals(this.defaultAuthProfileRef, objAuthenticationPolicy.defaultAuthProfileRef)&&
  Objects.equals(this.authnRules, objAuthenticationPolicy.authnRules);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AuthenticationPolicy {\n");
                  sb.append("    authProfileRef: ").append(toIndentedString(authProfileRef)).append("\n");
                        sb.append("    authnRules: ").append(toIndentedString(authnRules)).append("\n");
                        sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
                        sb.append("    cookieTimeout: ").append(toIndentedString(cookieTimeout)).append("\n");
                        sb.append("    defaultAuthProfileRef: ").append(toIndentedString(defaultAuthProfileRef)).append("\n");
                        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
                        sb.append("    key: ").append(toIndentedString(key)).append("\n");
                        sb.append("    singleSignonUrl: ").append(toIndentedString(singleSignonUrl)).append("\n");
                        sb.append("    spMetadata: ").append(toIndentedString(spMetadata)).append("\n");
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
