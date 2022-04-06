package com.freetrainingzone.identityverification.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * ValidationError
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-26T14:47:05.807916-04:00[America/New_York]")


public class ValidationError   {
  @JsonProperty("fieldName")
  private String fieldName = null;

  @JsonProperty("validationErrorDescription")
  private String validationErrorDescription = null;

  public ValidationError fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Get fieldName
   * @return fieldName
   **/
  @Schema(description = "")
  
    public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public ValidationError validationErrorDescription(String validationErrorDescription) {
    this.validationErrorDescription = validationErrorDescription;
    return this;
  }

  /**
   * Get validationErrorDescription
   * @return validationErrorDescription
   **/
  @Schema(description = "")
  
    public String getValidationErrorDescription() {
    return validationErrorDescription;
  }

  public void setValidationErrorDescription(String validationErrorDescription) {
    this.validationErrorDescription = validationErrorDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationError validationError = (ValidationError) o;
    return Objects.equals(this.fieldName, validationError.fieldName) &&
        Objects.equals(this.validationErrorDescription, validationError.validationErrorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, validationErrorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationError {\n");

    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    validationErrorDescription: ").append(toIndentedString(validationErrorDescription)).append("\n");
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
