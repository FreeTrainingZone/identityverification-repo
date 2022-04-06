package com.freetrainingzone.identityverification.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Person
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-03-26T14:47:05.807916-04:00[America/New_York]")


public class Person   {
  @JsonProperty("partyRecordIdentifier")
  private String partyRecordIdentifier = null;

  @JsonProperty("birthDate")
  private String birthDate = null;

  @JsonProperty("personName")
  private PersonName personName = null;

  @JsonProperty("address")
  private Address address = null;

  public Person partyRecordIdentifier(String partyRecordIdentifier) {
    this.partyRecordIdentifier = partyRecordIdentifier;
    return this;
  }

  /**
   * A Unqiue Id Assigned to party record.
   * @return partyRecordIdentifier
   **/
  @Schema(required = true, description = "A Unqiue Id Assigned to party record.")
      @NotNull

  @Size(min=9,max=40)   public String getPartyRecordIdentifier() {
    return partyRecordIdentifier;
  }

  public void setPartyRecordIdentifier(String partyRecordIdentifier) {
    this.partyRecordIdentifier = partyRecordIdentifier;
  }

  public Person birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Optional Specify the year month and day of party birth date.
   * @return birthDate
   **/
  @Schema(description = "Optional Specify the year month and day of party birth date.")
  
  @Size(min=10,max=10)   public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public Person personName(PersonName personName) {
    this.personName = personName;
    return this;
  }

  /**
   * Get personName
   * @return personName
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public PersonName getPersonName() {
    return personName;
  }

  public void setPersonName(PersonName personName) {
    this.personName = personName;
  }

  public Person address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.partyRecordIdentifier, person.partyRecordIdentifier) &&
        Objects.equals(this.birthDate, person.birthDate) &&
        Objects.equals(this.personName, person.personName) &&
        Objects.equals(this.address, person.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partyRecordIdentifier, birthDate, personName, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");

    sb.append("    partyRecordIdentifier: ").append(toIndentedString(partyRecordIdentifier)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
