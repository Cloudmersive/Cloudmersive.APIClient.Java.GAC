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
import com.cloudmersive.client.gac.model.PublicHolidayOccurrence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Result of performing a get public holidays request operation
 */
@ApiModel(description = "Result of performing a get public holidays request operation")
@JsonPropertyOrder({
  PublicHolidaysResponse.JSON_PROPERTY_SUCCESSFUL,
  PublicHolidaysResponse.JSON_PROPERTY_PUBLIC_HOLIDAYS
})
@JsonTypeName("PublicHolidaysResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:36.624-07:00[America/Los_Angeles]")
public class PublicHolidaysResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_PUBLIC_HOLIDAYS = "PublicHolidays";
  private List<PublicHolidayOccurrence> publicHolidays = null;


  public PublicHolidaysResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public PublicHolidaysResponse publicHolidays(List<PublicHolidayOccurrence> publicHolidays) {
    
    this.publicHolidays = publicHolidays;
    return this;
  }

  public PublicHolidaysResponse addPublicHolidaysItem(PublicHolidayOccurrence publicHolidaysItem) {
    if (this.publicHolidays == null) {
      this.publicHolidays = new ArrayList<PublicHolidayOccurrence>();
    }
    this.publicHolidays.add(publicHolidaysItem);
    return this;
  }

   /**
   * Public holidays in the requested country and year
   * @return publicHolidays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Public holidays in the requested country and year")
  @JsonProperty(JSON_PROPERTY_PUBLIC_HOLIDAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PublicHolidayOccurrence> getPublicHolidays() {
    return publicHolidays;
  }


  public void setPublicHolidays(List<PublicHolidayOccurrence> publicHolidays) {
    this.publicHolidays = publicHolidays;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicHolidaysResponse publicHolidaysResponse = (PublicHolidaysResponse) o;
    return Objects.equals(this.successful, publicHolidaysResponse.successful) &&
        Objects.equals(this.publicHolidays, publicHolidaysResponse.publicHolidays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, publicHolidays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicHolidaysResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    publicHolidays: ").append(toIndentedString(publicHolidays)).append("\n");
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

