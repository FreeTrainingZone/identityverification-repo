package com.freetrainingzone.identityverification.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * PersonName
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-26T14:47:05.807916-04:00[America/New_York]")


public class PersonName   {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("middleName")
  private String middleName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  public PersonName firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Required First name of the party.
   * @return firstName
   **/
  @Schema(required = true, description = "Required First name of the party.")
      @NotNull

  @Size(min=1,max=15)   public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PersonName middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * Optional Middlename of the party.
   * @return middleName
   **/
  @Schema(description = "Optional Middlename of the party.")
  
  @Size(min=1,max=15)   public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public PersonName lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Required last name of the party.
   * @return lastName
   **/
  @Schema(required = true, description = "Required last name of the party.")
      @NotNull

  @Size(min=1,max=25)   public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonName personName = (PersonName) o;
    return Objects.equals(this.firstName, personName.firstName) &&
        Objects.equals(this.middleName, personName.middleName) &&
        Objects.equals(this.lastName, personName.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, middleName, lastName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonName {\n");

    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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
