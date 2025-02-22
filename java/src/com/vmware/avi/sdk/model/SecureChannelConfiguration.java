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
 * The SecureChannelConfiguration is a POJO class extends AviRestResource that used for creating
 * SecureChannelConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SecureChannelConfiguration  {
    @JsonProperty("bypass_secure_channel_must_checks")
    private Boolean bypassSecureChannelMustChecks;

    @JsonProperty("sslkeyandcertificate_refs")
    private List<String> sslkeyandcertificateRefs = null;



    /**
     * This is the getter method this will return the attribute value.
     * Boolean which allowed force update of secure channel certificate.
     * Forced updating has been disallowed.
     * Field deprecated in 18.2.8.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return bypassSecureChannelMustChecks
     */
    public Boolean getBypassSecureChannelMustChecks() {
        return bypassSecureChannelMustChecks;
    }

    /**
     * This is the setter method to the attribute.
     * Boolean which allowed force update of secure channel certificate.
     * Forced updating has been disallowed.
     * Field deprecated in 18.2.8.
     * Field introduced in 18.2.5.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param bypassSecureChannelMustChecks set the bypassSecureChannelMustChecks.
     */
    public void setBypassSecureChannelMustChecks(Boolean  bypassSecureChannelMustChecks) {
        this.bypassSecureChannelMustChecks = bypassSecureChannelMustChecks;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Certificate for secure channel.
     * Leave list empty to use system default certs.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 18.1.4, 18.2.1.
     * Maximum of 1 items allowed.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslkeyandcertificateRefs
     */
    public List<String> getSslkeyandcertificateRefs() {
        return sslkeyandcertificateRefs;
    }

    /**
     * This is the setter method. this will set the sslkeyandcertificateRefs
     * Certificate for secure channel.
     * Leave list empty to use system default certs.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 18.1.4, 18.2.1.
     * Maximum of 1 items allowed.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslkeyandcertificateRefs
     */
    public void setSslkeyandcertificateRefs(List<String>  sslkeyandcertificateRefs) {
        this.sslkeyandcertificateRefs = sslkeyandcertificateRefs;
    }

    /**
     * This is the setter method this will set the sslkeyandcertificateRefs
     * Certificate for secure channel.
     * Leave list empty to use system default certs.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 18.1.4, 18.2.1.
     * Maximum of 1 items allowed.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslkeyandcertificateRefs
     */
    public SecureChannelConfiguration addSslkeyandcertificateRefsItem(String sslkeyandcertificateRefsItem) {
      if (this.sslkeyandcertificateRefs == null) {
        this.sslkeyandcertificateRefs = new ArrayList<String>();
      }
      this.sslkeyandcertificateRefs.add(sslkeyandcertificateRefsItem);
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
      SecureChannelConfiguration objSecureChannelConfiguration = (SecureChannelConfiguration) o;
      return   Objects.equals(this.sslkeyandcertificateRefs, objSecureChannelConfiguration.sslkeyandcertificateRefs)&&
  Objects.equals(this.bypassSecureChannelMustChecks, objSecureChannelConfiguration.bypassSecureChannelMustChecks);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SecureChannelConfiguration {\n");
                  sb.append("    bypassSecureChannelMustChecks: ").append(toIndentedString(bypassSecureChannelMustChecks)).append("\n");
                        sb.append("    sslkeyandcertificateRefs: ").append(toIndentedString(sslkeyandcertificateRefs)).append("\n");
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
