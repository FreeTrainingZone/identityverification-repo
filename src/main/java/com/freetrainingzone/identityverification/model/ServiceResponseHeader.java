package com.freetrainingzone.identityverification.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * ServiceResponseHeader
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-26T14:47:05.807916-04:00[America/New_York]")


public class ServiceResponseHeader   {
  @JsonProperty("statusCode")
  private String statusCode = null;

  @JsonProperty("statusMessage")
  private String statusMessage = null;

  @JsonProperty("serviceTraceId")
  private String serviceTraceId = null;

  public ServiceResponseHeader statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Required, Repreesnt the status code return by the service.
   * @return statusCode
   **/
  @Schema(required = true, description = "Required, Repreesnt the status code return by the service.")
      @NotNull

  @Size(min=4,max=4)   public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public ServiceResponseHeader statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Required, Repreesnt the status message return by the service.
   * @return statusMessage
   **/
  @Schema(required = true, description = "Required, Repreesnt the status message return by the service.")
      @NotNull

  @Size(min=1,max=50)   public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public ServiceResponseHeader serviceTraceId(String serviceTraceId) {
    this.serviceTraceId = serviceTraceId;
    return this;
  }

  /**
   * Unique ID assigned by the service to the request.
   * @return serviceTraceId
   **/
  @Schema(description = "Unique ID assigned by the service to the request.")
  
  @Size(min=1,max=40)   public String getServiceTraceId() {
    return serviceTraceId;
  }

  public void setServiceTraceId(String serviceTraceId) {
    this.serviceTraceId = serviceTraceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceResponseHeader serviceResponseHeader = (ServiceResponseHeader) o;
    return Objects.equals(this.statusCode, serviceResponseHeader.statusCode) &&
        Objects.equals(this.statusMessage, serviceResponseHeader.statusMessage) &&
        Objects.equals(this.serviceTraceId, serviceResponseHeader.serviceTraceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, statusMessage, serviceTraceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceResponseHeader {\n");

    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("    serviceTraceId: ").append(toIndentedString(serviceTraceId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
