/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.gac.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Result of parsing an address into its component parts
 */
@ApiModel(description = "Result of parsing an address into its component parts")
@JsonPropertyOrder({
  ParseAddressResponse.JSON_PROPERTY_SUCCESSFUL,
  ParseAddressResponse.JSON_PROPERTY_BUILDING,
  ParseAddressResponse.JSON_PROPERTY_STREET_NUMBER,
  ParseAddressResponse.JSON_PROPERTY_STREET,
  ParseAddressResponse.JSON_PROPERTY_CITY,
  ParseAddressResponse.JSON_PROPERTY_STATE_OR_PROVINCE,
  ParseAddressResponse.JSON_PROPERTY_POSTAL_CODE,
  ParseAddressResponse.JSON_PROPERTY_COUNTRY_FULL_NAME,
  ParseAddressResponse.JSON_PROPERTY_IS_O_TWO_LETTER_CODE
})
@JsonTypeName("ParseAddressResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:36.624-07:00[America/Los_Angeles]")
public class ParseAddressResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_BUILDING = "Building";
  private String building;

  public static final String JSON_PROPERTY_STREET_NUMBER = "StreetNumber";
  private String streetNumber;

  public static final String JSON_PROPERTY_STREET = "Street";
  private String street;

  public static final String JSON_PROPERTY_CITY = "City";
  private String city;

  public static final String JSON_PROPERTY_STATE_OR_PROVINCE = "StateOrProvince";
  private String stateOrProvince;

  public static final String JSON_PROPERTY_POSTAL_CODE = "PostalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_COUNTRY_FULL_NAME = "CountryFullName";
  private String countryFullName;

  public static final String JSON_PROPERTY_IS_O_TWO_LETTER_CODE = "ISOTwoLetterCode";
  private String isOTwoLetterCode;


  public ParseAddressResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if the parsing operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the parsing operation was successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public ParseAddressResponse building(String building) {
    
    this.building = building;
    return this;
  }

   /**
   * The name of the building, house or structure if applicable, such as \&quot;Cloudmersive Building 2\&quot;.  This will often by null.
   * @return building
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the building, house or structure if applicable, such as \"Cloudmersive Building 2\".  This will often by null.")
  @JsonProperty(JSON_PROPERTY_BUILDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuilding() {
    return building;
  }


  public void setBuilding(String building) {
    this.building = building;
  }


  public ParseAddressResponse streetNumber(String streetNumber) {
    
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * The street number or house number of the address.  For example, in the address \&quot;1600 Pennsylvania Avenue NW\&quot; the street number would be \&quot;1600\&quot;.  This value will typically be populated for most addresses.
   * @return streetNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The street number or house number of the address.  For example, in the address \"1600 Pennsylvania Avenue NW\" the street number would be \"1600\".  This value will typically be populated for most addresses.")
  @JsonProperty(JSON_PROPERTY_STREET_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetNumber() {
    return streetNumber;
  }


  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }


  public ParseAddressResponse street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * The name of the street or road of the address.  For example, in the address \&quot;1600 Pennsylvania Avenue NW\&quot; the street number would be \&quot;Pennsylvania Avenue NW\&quot;.
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the street or road of the address.  For example, in the address \"1600 Pennsylvania Avenue NW\" the street number would be \"Pennsylvania Avenue NW\".")
  @JsonProperty(JSON_PROPERTY_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public ParseAddressResponse city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The city of the address.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The city of the address.")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public ParseAddressResponse stateOrProvince(String stateOrProvince) {
    
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * The state or province of the address.
   * @return stateOrProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state or province of the address.")
  @JsonProperty(JSON_PROPERTY_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStateOrProvince() {
    return stateOrProvince;
  }


  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }


  public ParseAddressResponse postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code or zip code of the address.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The postal code or zip code of the address.")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public ParseAddressResponse countryFullName(String countryFullName) {
    
    this.countryFullName = countryFullName;
    return this;
  }

   /**
   * Country of the address, if present in the address.  If not included in the address it will be null.
   * @return countryFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country of the address, if present in the address.  If not included in the address it will be null.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryFullName() {
    return countryFullName;
  }


  public void setCountryFullName(String countryFullName) {
    this.countryFullName = countryFullName;
  }


  public ParseAddressResponse isOTwoLetterCode(String isOTwoLetterCode) {
    
    this.isOTwoLetterCode = isOTwoLetterCode;
    return this;
  }

   /**
   * Two-letter ISO 3166-1 country code
   * @return isOTwoLetterCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Two-letter ISO 3166-1 country code")
  @JsonProperty(JSON_PROPERTY_IS_O_TWO_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsOTwoLetterCode() {
    return isOTwoLetterCode;
  }


  public void setIsOTwoLetterCode(String isOTwoLetterCode) {
    this.isOTwoLetterCode = isOTwoLetterCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParseAddressResponse parseAddressResponse = (ParseAddressResponse) o;
    return Objects.equals(this.successful, parseAddressResponse.successful) &&
        Objects.equals(this.building, parseAddressResponse.building) &&
        Objects.equals(this.streetNumber, parseAddressResponse.streetNumber) &&
        Objects.equals(this.street, parseAddressResponse.street) &&
        Objects.equals(this.city, parseAddressResponse.city) &&
        Objects.equals(this.stateOrProvince, parseAddressResponse.stateOrProvince) &&
        Objects.equals(this.postalCode, parseAddressResponse.postalCode) &&
        Objects.equals(this.countryFullName, parseAddressResponse.countryFullName) &&
        Objects.equals(this.isOTwoLetterCode, parseAddressResponse.isOTwoLetterCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, building, streetNumber, street, city, stateOrProvince, postalCode, countryFullName, isOTwoLetterCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseAddressResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryFullName: ").append(toIndentedString(countryFullName)).append("\n");
    sb.append("    isOTwoLetterCode: ").append(toIndentedString(isOTwoLetterCode)).append("\n");
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

