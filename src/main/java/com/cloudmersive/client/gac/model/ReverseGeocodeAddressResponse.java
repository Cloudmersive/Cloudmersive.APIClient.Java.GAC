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
 * Result of reverse geocoding a street address
 */
@ApiModel(description = "Result of reverse geocoding a street address")
@JsonPropertyOrder({
  ReverseGeocodeAddressResponse.JSON_PROPERTY_SUCCESSFUL,
  ReverseGeocodeAddressResponse.JSON_PROPERTY_STREET_ADDRESS,
  ReverseGeocodeAddressResponse.JSON_PROPERTY_CITY,
  ReverseGeocodeAddressResponse.JSON_PROPERTY_STATE_OR_PROVINCE,
  ReverseGeocodeAddressResponse.JSON_PROPERTY_POSTAL_CODE,
  ReverseGeocodeAddressResponse.JSON_PROPERTY_COUNTRY_FULL_NAME,
  ReverseGeocodeAddressResponse.JSON_PROPERTY_COUNTRY_CODE
})
@JsonTypeName("ReverseGeocodeAddressResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:36.624-07:00[America/Los_Angeles]")
public class ReverseGeocodeAddressResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_STREET_ADDRESS = "StreetAddress";
  private String streetAddress;

  public static final String JSON_PROPERTY_CITY = "City";
  private String city;

  public static final String JSON_PROPERTY_STATE_OR_PROVINCE = "StateOrProvince";
  private String stateOrProvince;

  public static final String JSON_PROPERTY_POSTAL_CODE = "PostalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_COUNTRY_FULL_NAME = "CountryFullName";
  private String countryFullName;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "CountryCode";
  private String countryCode;


  public ReverseGeocodeAddressResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if the address operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the address operation was successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public ReverseGeocodeAddressResponse streetAddress(String streetAddress) {
    
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Street address to validate, such as &#39;2950 Buskirk Ave.&#39;
   * @return streetAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Street address to validate, such as '2950 Buskirk Ave.'")
  @JsonProperty(JSON_PROPERTY_STREET_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetAddress() {
    return streetAddress;
  }


  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }


  public ReverseGeocodeAddressResponse city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City part of the addrerss to validate, such as &#39;Walnut Creek&#39;
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "City part of the addrerss to validate, such as 'Walnut Creek'")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public ReverseGeocodeAddressResponse stateOrProvince(String stateOrProvince) {
    
    this.stateOrProvince = stateOrProvince;
    return this;
  }

   /**
   * State or province of the address to validate, such as &#39;CA&#39; or &#39;California&#39;
   * @return stateOrProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State or province of the address to validate, such as 'CA' or 'California'")
  @JsonProperty(JSON_PROPERTY_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStateOrProvince() {
    return stateOrProvince;
  }


  public void setStateOrProvince(String stateOrProvince) {
    this.stateOrProvince = stateOrProvince;
  }


  public ReverseGeocodeAddressResponse postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Zip code or postal code of the address to validate, such as &#39;94597&#39;
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Zip code or postal code of the address to validate, such as '94597'")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public ReverseGeocodeAddressResponse countryFullName(String countryFullName) {
    
    this.countryFullName = countryFullName;
    return this;
  }

   /**
   * Name of the country, such as &#39;United States&#39;.  Global countries are supported.
   * @return countryFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the country, such as 'United States'.  Global countries are supported.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryFullName() {
    return countryFullName;
  }


  public void setCountryFullName(String countryFullName) {
    this.countryFullName = countryFullName;
  }


  public ReverseGeocodeAddressResponse countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Three-letter ISO 3166-1 country code
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Three-letter ISO 3166-1 country code")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReverseGeocodeAddressResponse reverseGeocodeAddressResponse = (ReverseGeocodeAddressResponse) o;
    return Objects.equals(this.successful, reverseGeocodeAddressResponse.successful) &&
        Objects.equals(this.streetAddress, reverseGeocodeAddressResponse.streetAddress) &&
        Objects.equals(this.city, reverseGeocodeAddressResponse.city) &&
        Objects.equals(this.stateOrProvince, reverseGeocodeAddressResponse.stateOrProvince) &&
        Objects.equals(this.postalCode, reverseGeocodeAddressResponse.postalCode) &&
        Objects.equals(this.countryFullName, reverseGeocodeAddressResponse.countryFullName) &&
        Objects.equals(this.countryCode, reverseGeocodeAddressResponse.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, streetAddress, city, stateOrProvince, postalCode, countryFullName, countryCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReverseGeocodeAddressResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateOrProvince: ").append(toIndentedString(stateOrProvince)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countryFullName: ").append(toIndentedString(countryFullName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

