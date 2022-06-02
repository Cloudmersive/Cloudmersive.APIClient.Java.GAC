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
 * Input parameter to a date time parsing request
 */
@ApiModel(description = "Input parameter to a date time parsing request")
@JsonPropertyOrder({
  DateTimeStandardizedParseRequest.JSON_PROPERTY_RAW_DATE_TIME_INPUT,
  DateTimeStandardizedParseRequest.JSON_PROPERTY_COUNTRY_CODE
})
@JsonTypeName("DateTimeStandardizedParseRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:36.624-07:00[America/Los_Angeles]")
public class DateTimeStandardizedParseRequest {
  public static final String JSON_PROPERTY_RAW_DATE_TIME_INPUT = "RawDateTimeInput";
  private String rawDateTimeInput;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "CountryCode";
  private String countryCode;


  public DateTimeStandardizedParseRequest rawDateTimeInput(String rawDateTimeInput) {
    
    this.rawDateTimeInput = rawDateTimeInput;
    return this;
  }

   /**
   * Raw string input of a standard-formatted date and time for parsing
   * @return rawDateTimeInput
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Raw string input of a standard-formatted date and time for parsing")
  @JsonProperty(JSON_PROPERTY_RAW_DATE_TIME_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRawDateTimeInput() {
    return rawDateTimeInput;
  }


  public void setRawDateTimeInput(String rawDateTimeInput) {
    this.rawDateTimeInput = rawDateTimeInput;
  }


  public DateTimeStandardizedParseRequest countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Optional: specify the two-letter country code to optimzie date formatting; default is US
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: specify the two-letter country code to optimzie date formatting; default is US")
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
    DateTimeStandardizedParseRequest dateTimeStandardizedParseRequest = (DateTimeStandardizedParseRequest) o;
    return Objects.equals(this.rawDateTimeInput, dateTimeStandardizedParseRequest.rawDateTimeInput) &&
        Objects.equals(this.countryCode, dateTimeStandardizedParseRequest.countryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawDateTimeInput, countryCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeStandardizedParseRequest {\n");
    sb.append("    rawDateTimeInput: ").append(toIndentedString(rawDateTimeInput)).append("\n");
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
