package com.freetrainingzone.identityverification.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * IntendedUseOfData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-26T14:47:05.807916-04:00[America/New_York]")


public class IntendedUseOfData   {
  @JsonProperty("category")
  private String category = null;

  @JsonProperty("subCategory")
  private String subCategory = null;

  public IntendedUseOfData category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Required Category. Values IDERF
   * @return category
   **/
  @Schema(required = true, description = "Required Category. Values IDERF")
      @NotNull

  @Size(min=5,max=5)   public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public IntendedUseOfData subCategory(String subCategory) {
    this.subCategory = subCategory;
    return this;
  }

  /**
   * Required SubCategory. Values CCACQ
   * @return subCategory
   **/
  @Schema(required = true, description = "Required SubCategory. Values CCACQ")
      @NotNull

  @Size(min=5,max=5)   public String getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(String subCategory) {
    this.subCategory = subCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntendedUseOfData intendedUseOfData = (IntendedUseOfData) o;
    return Objects.equals(this.category, intendedUseOfData.category) &&
        Objects.equals(this.subCategory, intendedUseOfData.subCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, subCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntendedUseOfData {\n");

    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
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
