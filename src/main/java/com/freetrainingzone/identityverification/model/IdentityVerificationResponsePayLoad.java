package com.freetrainingzone.identityverification.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Objects;

/**
 * IdentityVerificationResponsePayLoad
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-26T14:47:05.807916-04:00[America/New_York]")


public class IdentityVerificationResponsePayLoad   {
  @JsonProperty("verifiedInput")
  private VerifiedInput verifiedInput = null;

  @JsonProperty("riskScores")
  private RiskScores riskScores = null;

  public IdentityVerificationResponsePayLoad verifiedInput(VerifiedInput verifiedInput) {
    this.verifiedInput = verifiedInput;
    return this;
  }

  /**
   * Get verifiedInput
   * @return verifiedInput
   **/
  @Schema(description = "")
  
    @Valid
    public VerifiedInput getVerifiedInput() {
    return verifiedInput;
  }

  public void setVerifiedInput(VerifiedInput verifiedInput) {
    this.verifiedInput = verifiedInput;
  }

  public IdentityVerificationResponsePayLoad riskScores(RiskScores riskScores) {
    this.riskScores = riskScores;
    return this;
  }

  /**
   * Get riskScores
   * @return riskScores
   **/
  @Schema(description = "")
  
    @Valid
    public RiskScores getRiskScores() {
    return riskScores;
  }

  public void setRiskScores(RiskScores riskScores) {
    this.riskScores = riskScores;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVerificationResponsePayLoad identityVerificationResponsePayLoad = (IdentityVerificationResponsePayLoad) o;
    return Objects.equals(this.verifiedInput, identityVerificationResponsePayLoad.verifiedInput) &&
        Objects.equals(this.riskScores, identityVerificationResponsePayLoad.riskScores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verifiedInput, riskScores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationResponsePayLoad {\n");

    sb.append("    verifiedInput: ").append(toIndentedString(verifiedInput)).append("\n");
    sb.append("    riskScores: ").append(toIndentedString(riskScores)).append("\n");
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
