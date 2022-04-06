package com.freetrainingzone.identityverification.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Address
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-26T14:47:05.807916-04:00[America/New_York]")


public class Address   {
  @JsonProperty("streeAddressLine1")
  private String streeAddressLine1 = null;

  @JsonProperty("streeAddressLine2")
  private String streeAddressLine2 = null;

  @JsonProperty("addressCityName")
  private String addressCityName = null;

  @JsonProperty("addressStateCode")
  private String addressStateCode = null;

  @JsonProperty("addressPostalCode")
  private String addressPostalCode = null;

  public Address streeAddressLine1(String streeAddressLine1) {
    this.streeAddressLine1 = streeAddressLine1;
    return this;
  }

  /**
   * Street Address Line1
   * @return streeAddressLine1
   **/
  @Schema(description = "Street Address Line1")
  
  @Size(max=70)   public String getStreeAddressLine1() {
    return streeAddressLine1;
  }

  public void setStreeAddressLine1(String streeAddressLine1) {
    this.streeAddressLine1 = streeAddressLine1;
  }

  public Address streeAddressLine2(String streeAddressLine2) {
    this.streeAddressLine2 = streeAddressLine2;
    return this;
  }

  /**
   * Street Address Line1
   * @return streeAddressLine2
   **/
  @Schema(description = "Street Address Line1")
  
  @Size(max=70)   public String getStreeAddressLine2() {
    return streeAddressLine2;
  }

  public void setStreeAddressLine2(String streeAddressLine2) {
    this.streeAddressLine2 = streeAddressLine2;
  }

  public Address addressCityName(String addressCityName) {
    this.addressCityName = addressCityName;
    return this;
  }

  /**
   * Address City Name.
   * @return addressCityName
   **/
  @Schema(required = true, description = "Address City Name.")
      @NotNull

  @Size(min=1,max=50)   public String getAddressCityName() {
    return addressCityName;
  }

  public void setAddressCityName(String addressCityName) {
    this.addressCityName = addressCityName;
  }

  public Address addressStateCode(String addressStateCode) {
    this.addressStateCode = addressStateCode;
    return this;
  }

  /**
   * Address State Code.
   * @return addressStateCode
   **/
  @Schema(required = true, description = "Address State Code.")
      @NotNull

  @Size(min=2,max=2)   public String getAddressStateCode() {
    return addressStateCode;
  }

  public void setAddressStateCode(String addressStateCode) {
    this.addressStateCode = addressStateCode;
  }

  public Address addressPostalCode(String addressPostalCode) {
    this.addressPostalCode = addressPostalCode;
    return this;
  }

  /**
   * Address Postal Code.
   * @return addressPostalCode
   **/
  @Schema(required = true, description = "Address Postal Code.")
      @NotNull

  @Size(min=2,max=2)   public String getAddressPostalCode() {
    return addressPostalCode;
  }

  public void setAddressPostalCode(String addressPostalCode) {
    this.addressPostalCode = addressPostalCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.streeAddressLine1, address.streeAddressLine1) &&
        Objects.equals(this.streeAddressLine2, address.streeAddressLine2) &&
        Objects.equals(this.addressCityName, address.addressCityName) &&
        Objects.equals(this.addressStateCode, address.addressStateCode) &&
        Objects.equals(this.addressPostalCode, address.addressPostalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streeAddressLine1, streeAddressLine2, addressCityName, addressStateCode, addressPostalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");

    sb.append("    streeAddressLine1: ").append(toIndentedString(streeAddressLine1)).append("\n");
    sb.append("    streeAddressLine2: ").append(toIndentedString(streeAddressLine2)).append("\n");
    sb.append("    addressCityName: ").append(toIndentedString(addressCityName)).append("\n");
    sb.append("    addressStateCode: ").append(toIndentedString(addressStateCode)).append("\n");
    sb.append("    addressPostalCode: ").append(toIndentedString(addressPostalCode)).append("\n");
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
