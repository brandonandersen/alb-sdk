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
 * The VinfraDiscSummaryDetails is a POJO class extends AviRestResource that used for creating
 * VinfraDiscSummaryDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VinfraDiscSummaryDetails  {
    @JsonProperty("num_clusters")
    private Integer numClusters = null;

    @JsonProperty("num_dcs")
    private Integer numDcs = null;

    @JsonProperty("num_hosts")
    private Integer numHosts = null;

    @JsonProperty("num_nws")
    private Integer numNws = null;

    @JsonProperty("num_vms")
    private Integer numVms = null;

    @JsonProperty("vcenter")
    private String vcenter = null;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numClusters
     */
    public Integer getNumClusters() {
        return numClusters;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numClusters set the numClusters.
     */
    public void setNumClusters(Integer  numClusters) {
        this.numClusters = numClusters;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numDcs
     */
    public Integer getNumDcs() {
        return numDcs;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numDcs set the numDcs.
     */
    public void setNumDcs(Integer  numDcs) {
        this.numDcs = numDcs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numHosts
     */
    public Integer getNumHosts() {
        return numHosts;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numHosts set the numHosts.
     */
    public void setNumHosts(Integer  numHosts) {
        this.numHosts = numHosts;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numNws
     */
    public Integer getNumNws() {
        return numNws;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numNws set the numNws.
     */
    public void setNumNws(Integer  numNws) {
        this.numNws = numNws;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numVms
     */
    public Integer getNumVms() {
        return numVms;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numVms set the numVms.
     */
    public void setNumVms(Integer  numVms) {
        this.numVms = numVms;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcenter
     */
    public String getVcenter() {
        return vcenter;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcenter set the vcenter.
     */
    public void setVcenter(String  vcenter) {
        this.vcenter = vcenter;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VinfraDiscSummaryDetails objVinfraDiscSummaryDetails = (VinfraDiscSummaryDetails) o;
      return   Objects.equals(this.vcenter, objVinfraDiscSummaryDetails.vcenter)&&
  Objects.equals(this.numDcs, objVinfraDiscSummaryDetails.numDcs)&&
  Objects.equals(this.numHosts, objVinfraDiscSummaryDetails.numHosts)&&
  Objects.equals(this.numClusters, objVinfraDiscSummaryDetails.numClusters)&&
  Objects.equals(this.numVms, objVinfraDiscSummaryDetails.numVms)&&
  Objects.equals(this.numNws, objVinfraDiscSummaryDetails.numNws);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VinfraDiscSummaryDetails {\n");
                  sb.append("    numClusters: ").append(toIndentedString(numClusters)).append("\n");
                        sb.append("    numDcs: ").append(toIndentedString(numDcs)).append("\n");
                        sb.append("    numHosts: ").append(toIndentedString(numHosts)).append("\n");
                        sb.append("    numNws: ").append(toIndentedString(numNws)).append("\n");
                        sb.append("    numVms: ").append(toIndentedString(numVms)).append("\n");
                        sb.append("    vcenter: ").append(toIndentedString(vcenter)).append("\n");
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
