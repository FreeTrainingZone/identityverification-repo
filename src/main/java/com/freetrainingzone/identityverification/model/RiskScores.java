package com.freetrainingzone.identityverification.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Objects;

/**
 * RiskScores
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-26T14:47:05.807916-04:00[America/New_York]")


public class RiskScores   {
  @JsonProperty("riskScore1")
  private Double riskScore1 = null;

  @JsonProperty("riskScore3")
  private Long riskScore3 = null;

  @JsonProperty("riskScore4")
  private Double riskScore4 = 999.88d;

  public RiskScores riskScore1(Double riskScore1) {
    this.riskScore1 = riskScore1;
    return this;
  }

  /**
   * Risk Score 1 in decimal format
   * minimum: -9
   * maximum: 9
   * @return riskScore1
   **/
  @Schema(description = "Risk Score 1 in decimal format")
  
  @DecimalMin("-9") @DecimalMax("9")   public Double getRiskScore1() {
    return riskScore1;
  }

  public void setRiskScore1(Double riskScore1) {
    this.riskScore1 = riskScore1;
  }

  public RiskScores riskScore3(Long riskScore3) {
    this.riskScore3 = riskScore3;
    return this;
  }

  /**
   * Risk Score 3 between 0 and 9999999999999999.
   * minimum: 0
   * maximum: 9999999999999999
   * @return riskScore3
   **/
  @Schema(description = "Risk Score 3 between 0 and 9999999999999999.")
  
  @Min(0L) @Max(9999999999999999L)   public Long getRiskScore3() {
    return riskScore3;
  }

  public void setRiskScore3(Long riskScore3) {
    this.riskScore3 = riskScore3;
  }

  public RiskScores riskScore4(Double riskScore4) {
    this.riskScore4 = riskScore4;
    return this;
  }

  /**
   * Risk Score 4 in decimal format
   * minimum: -999
   * maximum: 999
   * @return riskScore4
   **/
  @Schema(description = "Risk Score 4 in decimal format")
  
  @DecimalMin("-999") @DecimalMax("999")   public Double getRiskScore4() {
    return riskScore4;
  }

  public void setRiskScore4(Double riskScore4) {
    this.riskScore4 = riskScore4;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskScores riskScores = (RiskScores) o;
    return Objects.equals(this.riskScore1, riskScores.riskScore1) &&
        Objects.equals(this.riskScore3, riskScores.riskScore3) &&
        Objects.equals(this.riskScore4, riskScores.riskScore4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(riskScore1, riskScore3, riskScore4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskScores {\n");

    sb.append("    riskScore1: ").append(toIndentedString(riskScore1)).append("\n");
    sb.append("    riskScore3: ").append(toIndentedString(riskScore3)).append("\n");
    sb.append("    riskScore4: ").append(toIndentedString(riskScore4)).append("\n");
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
