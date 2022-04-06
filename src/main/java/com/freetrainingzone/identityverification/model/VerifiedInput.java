package com.freetrainingzone.identityverification.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * VerifiedInput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-26T14:47:05.807916-04:00[America/New_York]")


public class VerifiedInput   {
  @JsonProperty("verifiedInputCount")
  private Integer verifiedInputCount = null;

  @JsonProperty("verificationCode1")
  private BigDecimal verificationCode1 = null;

  /**
   * Source of data verification.
   */
  public enum VerificationSourceEnum {
    INTERNAL("Internal"),
    
    EXTERNAL("External");

    private String value;

    VerificationSourceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VerificationSourceEnum fromValue(String text) {
      for (VerificationSourceEnum b : VerificationSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("verificationSource")
  private VerificationSourceEnum verificationSource = null;

  @JsonProperty("verificationCode2")
  private Integer verificationCode2 = null;

  @JsonProperty("verificationCode3")
  private Integer verificationCode3 = 99;

  public VerifiedInput verifiedInputCount(Integer verifiedInputCount) {
    this.verifiedInputCount = verifiedInputCount;
    return this;
  }

  /**
   * Total number of inputs verified by the service
   * minimum: 0
   * maximum: 20
   * @return verifiedInputCount
   **/
  @Schema(description = "Total number of inputs verified by the service")
  
  @Min(0) @Max(20)   public Integer getVerifiedInputCount() {
    return verifiedInputCount;
  }

  public void setVerifiedInputCount(Integer verifiedInputCount) {
    this.verifiedInputCount = verifiedInputCount;
  }

  public VerifiedInput verificationCode1(BigDecimal verificationCode1) {
    this.verificationCode1 = verificationCode1;
    return this;
  }

  /**
   * A  numerical code generated by the service.
   * minimum: 0
   * maximum: 999999999
   * @return verificationCode1
   **/
  @Schema(description = "A  numerical code generated by the service.")
  
    @Valid
  @DecimalMin("0") @DecimalMax("999999999")   public BigDecimal getVerificationCode1() {
    return verificationCode1;
  }

  public void setVerificationCode1(BigDecimal verificationCode1) {
    this.verificationCode1 = verificationCode1;
  }

  public VerifiedInput verificationSource(VerificationSourceEnum verificationSource) {
    this.verificationSource = verificationSource;
    return this;
  }

  /**
   * Source of data verification.
   * @return verificationSource
   **/
  @Schema(description = "Source of data verification.")
  
    public VerificationSourceEnum getVerificationSource() {
    return verificationSource;
  }

  public void setVerificationSource(VerificationSourceEnum verificationSource) {
    this.verificationSource = verificationSource;
  }

  public VerifiedInput verificationCode2(Integer verificationCode2) {
    this.verificationCode2 = verificationCode2;
    return this;
  }

  /**
   * verificationCode2 only only one of two values should be retruned.
   * maximum: 9999
   * @return verificationCode2
   **/
  @Schema(description = "verificationCode2 only only one of two values should be retruned.")
  
   @Max(9999)   public Integer getVerificationCode2() {
    return verificationCode2;
  }

  public void setVerificationCode2(Integer verificationCode2) {
    this.verificationCode2 = verificationCode2;
  }

  public VerifiedInput verificationCode3(Integer verificationCode3) {
    this.verificationCode3 = verificationCode3;
    return this;
  }

  /**
   * Verification Code3 A numerical code generated by the service.
   * minimum: -99
   * maximum: 99
   * @return verificationCode3
   **/
  @Schema(description = "Verification Code3 A numerical code generated by the service.")
  
  @Min(-99) @Max(99)   public Integer getVerificationCode3() {
    return verificationCode3;
  }

  public void setVerificationCode3(Integer verificationCode3) {
    this.verificationCode3 = verificationCode3;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifiedInput verifiedInput = (VerifiedInput) o;
    return Objects.equals(this.verifiedInputCount, verifiedInput.verifiedInputCount) &&
        Objects.equals(this.verificationCode1, verifiedInput.verificationCode1) &&
        Objects.equals(this.verificationSource, verifiedInput.verificationSource) &&
        Objects.equals(this.verificationCode2, verifiedInput.verificationCode2) &&
        Objects.equals(this.verificationCode3, verifiedInput.verificationCode3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verifiedInputCount, verificationCode1, verificationSource, verificationCode2, verificationCode3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifiedInput {\n");

    sb.append("    verifiedInputCount: ").append(toIndentedString(verifiedInputCount)).append("\n");
    sb.append("    verificationCode1: ").append(toIndentedString(verificationCode1)).append("\n");
    sb.append("    verificationSource: ").append(toIndentedString(verificationSource)).append("\n");
    sb.append("    verificationCode2: ").append(toIndentedString(verificationCode2)).append("\n");
    sb.append("    verificationCode3: ").append(toIndentedString(verificationCode3)).append("\n");
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