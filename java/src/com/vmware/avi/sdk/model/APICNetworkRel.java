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
 * The APICNetworkRel is a POJO class extends AviRestResource that used for creating
 * APICNetworkRel.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class APICNetworkRel  {
    @JsonProperty("connector")
    private String connector;

    @JsonProperty("rel_key")
    private String relKey;

    @JsonProperty("target_network")
    private String targetNetwork;



    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return connector
     */
    public String getConnector() {
        return connector;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param connector set the connector.
     */
    public void setConnector(String  connector) {
        this.connector = connector;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return relKey
     */
    public String getRelKey() {
        return relKey;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param relKey set the relKey.
     */
    public void setRelKey(String  relKey) {
        this.relKey = relKey;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return targetNetwork
     */
    public String getTargetNetwork() {
        return targetNetwork;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param targetNetwork set the targetNetwork.
     */
    public void setTargetNetwork(String  targetNetwork) {
        this.targetNetwork = targetNetwork;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      APICNetworkRel objAPICNetworkRel = (APICNetworkRel) o;
      return   Objects.equals(this.relKey, objAPICNetworkRel.relKey)&&
  Objects.equals(this.connector, objAPICNetworkRel.connector)&&
  Objects.equals(this.targetNetwork, objAPICNetworkRel.targetNetwork);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class APICNetworkRel {\n");
                  sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
                        sb.append("    relKey: ").append(toIndentedString(relKey)).append("\n");
                        sb.append("    targetNetwork: ").append(toIndentedString(targetNetwork)).append("\n");
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
