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
 * The DataScriptErrorTrace is a POJO class extends AviRestResource that used for creating
 * DataScriptErrorTrace.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataScriptErrorTrace  {
    @JsonProperty("error")
    private String error = null;

    @JsonProperty("event")
    private String event = null;

    @JsonProperty("stack_trace")
    private String stackTrace = null;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return error
     */
    public String getError() {
        return error;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param error set the error.
     */
    public void setError(String  error) {
        this.error = error;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return event
     */
    public String getEvent() {
        return event;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param event set the event.
     */
    public void setEvent(String  event) {
        this.event = event;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stackTrace
     */
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param stackTrace set the stackTrace.
     */
    public void setStackTrace(String  stackTrace) {
        this.stackTrace = stackTrace;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DataScriptErrorTrace objDataScriptErrorTrace = (DataScriptErrorTrace) o;
      return   Objects.equals(this.error, objDataScriptErrorTrace.error)&&
  Objects.equals(this.stackTrace, objDataScriptErrorTrace.stackTrace)&&
  Objects.equals(this.event, objDataScriptErrorTrace.event);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DataScriptErrorTrace {\n");
                  sb.append("    error: ").append(toIndentedString(error)).append("\n");
                        sb.append("    event: ").append(toIndentedString(event)).append("\n");
                        sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
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
