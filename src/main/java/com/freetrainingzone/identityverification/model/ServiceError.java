package com.freetrainingzone.identityverification.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ServiceError
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-26T14:47:05.807916-04:00[America/New_York]")


public class ServiceError   {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("errorDescription")
  private String errorDescription = null;

  @JsonProperty("validationErrors")
  @Valid
  private List<ValidationError> validationErrors = null;

  public ServiceError errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Error Code returned by the service prcoessing.
   * @return errorCode
   **/
  @Schema(description = "Error Code returned by the service prcoessing.")
  
    public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ServiceError errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * Error Code description.
   * @return errorDescription
   **/
  @Schema(description = "Error Code description.")
  
    public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public ServiceError validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public ServiceError addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<ValidationError>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Get validationErrors
   * @return validationErrors
   **/
  @Schema(description = "")
      @Valid
    public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceError serviceError = (ServiceError) o;
    return Objects.equals(this.errorCode, serviceError.errorCode) &&
        Objects.equals(this.errorDescription, serviceError.errorDescription) &&
        Objects.equals(this.validationErrors, serviceError.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorDescription, validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceError {\n");

    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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
