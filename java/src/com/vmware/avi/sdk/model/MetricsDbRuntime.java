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
 * The MetricsDbRuntime is a POJO class extends AviRestResource that used for creating
 * MetricsDbRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetricsDbRuntime  {
    @JsonProperty("db_num_client_queries")
    private Integer dbNumClientQueries = null;

    @JsonProperty("db_num_client_resp")
    private Integer dbNumClientResp = null;

    @JsonProperty("db_num_db_queries")
    private Integer dbNumDbQueries = null;

    @JsonProperty("db_num_db_resp")
    private Integer dbNumDbResp = null;

    @JsonProperty("db_num_oom")
    private Integer dbNumOom = null;

    @JsonProperty("db_queue_size")
    private Integer dbQueueSize = null;

    @JsonProperty("db_rum_queries")
    private Integer dbRumQueries = null;

    @JsonProperty("db_rum_rows")
    private Integer dbRumRows = null;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dbNumClientQueries
     */
    public Integer getDbNumClientQueries() {
        return dbNumClientQueries;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dbNumClientQueries set the dbNumClientQueries.
     */
    public void setDbNumClientQueries(Integer  dbNumClientQueries) {
        this.dbNumClientQueries = dbNumClientQueries;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dbNumClientResp
     */
    public Integer getDbNumClientResp() {
        return dbNumClientResp;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dbNumClientResp set the dbNumClientResp.
     */
    public void setDbNumClientResp(Integer  dbNumClientResp) {
        this.dbNumClientResp = dbNumClientResp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dbNumDbQueries
     */
    public Integer getDbNumDbQueries() {
        return dbNumDbQueries;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dbNumDbQueries set the dbNumDbQueries.
     */
    public void setDbNumDbQueries(Integer  dbNumDbQueries) {
        this.dbNumDbQueries = dbNumDbQueries;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dbNumDbResp
     */
    public Integer getDbNumDbResp() {
        return dbNumDbResp;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dbNumDbResp set the dbNumDbResp.
     */
    public void setDbNumDbResp(Integer  dbNumDbResp) {
        this.dbNumDbResp = dbNumDbResp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dbNumOom
     */
    public Integer getDbNumOom() {
        return dbNumOom;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dbNumOom set the dbNumOom.
     */
    public void setDbNumOom(Integer  dbNumOom) {
        this.dbNumOom = dbNumOom;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dbQueueSize
     */
    public Integer getDbQueueSize() {
        return dbQueueSize;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dbQueueSize set the dbQueueSize.
     */
    public void setDbQueueSize(Integer  dbQueueSize) {
        this.dbQueueSize = dbQueueSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dbRumQueries
     */
    public Integer getDbRumQueries() {
        return dbRumQueries;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dbRumQueries set the dbRumQueries.
     */
    public void setDbRumQueries(Integer  dbRumQueries) {
        this.dbRumQueries = dbRumQueries;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dbRumRows
     */
    public Integer getDbRumRows() {
        return dbRumRows;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dbRumRows set the dbRumRows.
     */
    public void setDbRumRows(Integer  dbRumRows) {
        this.dbRumRows = dbRumRows;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      MetricsDbRuntime objMetricsDbRuntime = (MetricsDbRuntime) o;
      return   Objects.equals(this.dbNumClientQueries, objMetricsDbRuntime.dbNumClientQueries)&&
  Objects.equals(this.dbNumDbQueries, objMetricsDbRuntime.dbNumDbQueries)&&
  Objects.equals(this.dbNumOom, objMetricsDbRuntime.dbNumOom)&&
  Objects.equals(this.dbNumDbResp, objMetricsDbRuntime.dbNumDbResp)&&
  Objects.equals(this.dbNumClientResp, objMetricsDbRuntime.dbNumClientResp)&&
  Objects.equals(this.dbQueueSize, objMetricsDbRuntime.dbQueueSize)&&
  Objects.equals(this.dbRumQueries, objMetricsDbRuntime.dbRumQueries)&&
  Objects.equals(this.dbRumRows, objMetricsDbRuntime.dbRumRows);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MetricsDbRuntime {\n");
                  sb.append("    dbNumClientQueries: ").append(toIndentedString(dbNumClientQueries)).append("\n");
                        sb.append("    dbNumClientResp: ").append(toIndentedString(dbNumClientResp)).append("\n");
                        sb.append("    dbNumDbQueries: ").append(toIndentedString(dbNumDbQueries)).append("\n");
                        sb.append("    dbNumDbResp: ").append(toIndentedString(dbNumDbResp)).append("\n");
                        sb.append("    dbNumOom: ").append(toIndentedString(dbNumOom)).append("\n");
                        sb.append("    dbQueueSize: ").append(toIndentedString(dbQueueSize)).append("\n");
                        sb.append("    dbRumQueries: ").append(toIndentedString(dbRumQueries)).append("\n");
                        sb.append("    dbRumRows: ").append(toIndentedString(dbRumRows)).append("\n");
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
