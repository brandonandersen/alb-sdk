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
 * The SamlIdentityProviderSettings is a POJO class extends AviRestResource that used for creating
 * SamlIdentityProviderSettings.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SamlIdentityProviderSettings  {
    @JsonProperty("metadata")
    private String metadata = null;



    /**
     * This is the getter method this will return the attribute value.
     * Saml idp metadata.
     * Field introduced in 17.2.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metadata
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * This is the setter method to the attribute.
     * Saml idp metadata.
     * Field introduced in 17.2.3.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metadata set the metadata.
     */
    public void setMetadata(String  metadata) {
        this.metadata = metadata;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SamlIdentityProviderSettings objSamlIdentityProviderSettings = (SamlIdentityProviderSettings) o;
      return   Objects.equals(this.metadata, objSamlIdentityProviderSettings.metadata);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SamlIdentityProviderSettings {\n");
                  sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
