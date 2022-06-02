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
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Public holiday occurrence
 */
@ApiModel(description = "Public holiday occurrence")
@JsonPropertyOrder({
  PublicHolidayOccurrence.JSON_PROPERTY_ENGLISH_NAME,
  PublicHolidayOccurrence.JSON_PROPERTY_LOCAL_NAME,
  PublicHolidayOccurrence.JSON_PROPERTY_OCCURRENCE_DATE,
  PublicHolidayOccurrence.JSON_PROPERTY_HOLIDAY_TYPE,
  PublicHolidayOccurrence.JSON_PROPERTY_NATIONWAIDE
})
@JsonTypeName("PublicHolidayOccurrence")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:36.624-07:00[America/Los_Angeles]")
public class PublicHolidayOccurrence {
  public static final String JSON_PROPERTY_ENGLISH_NAME = "EnglishName";
  private String englishName;

  public static final String JSON_PROPERTY_LOCAL_NAME = "LocalName";
  private String localName;

  public static final String JSON_PROPERTY_OCCURRENCE_DATE = "OccurrenceDate";
  private OffsetDateTime occurrenceDate;

  public static final String JSON_PROPERTY_HOLIDAY_TYPE = "HolidayType";
  private String holidayType;

  public static final String JSON_PROPERTY_NATIONWAIDE = "Nationwaide";
  private Boolean nationwaide;


  public PublicHolidayOccurrence englishName(String englishName) {
    
    this.englishName = englishName;
    return this;
  }

   /**
   * Name of the holiday in English
   * @return englishName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the holiday in English")
  @JsonProperty(JSON_PROPERTY_ENGLISH_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnglishName() {
    return englishName;
  }


  public void setEnglishName(String englishName) {
    this.englishName = englishName;
  }


  public PublicHolidayOccurrence localName(String localName) {
    
    this.localName = localName;
    return this;
  }

   /**
   * Local name of the holiday
   * @return localName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Local name of the holiday")
  @JsonProperty(JSON_PROPERTY_LOCAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocalName() {
    return localName;
  }


  public void setLocalName(String localName) {
    this.localName = localName;
  }


  public PublicHolidayOccurrence occurrenceDate(OffsetDateTime occurrenceDate) {
    
    this.occurrenceDate = occurrenceDate;
    return this;
  }

   /**
   * Date of the holiday (start time)
   * @return occurrenceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the holiday (start time)")
  @JsonProperty(JSON_PROPERTY_OCCURRENCE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getOccurrenceDate() {
    return occurrenceDate;
  }


  public void setOccurrenceDate(OffsetDateTime occurrenceDate) {
    this.occurrenceDate = occurrenceDate;
  }


  public PublicHolidayOccurrence holidayType(String holidayType) {
    
    this.holidayType = holidayType;
    return this;
  }

   /**
   * Type of the holiday; possible values are: Public, Bank, School, Authorities, Optional, Observance
   * @return holidayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of the holiday; possible values are: Public, Bank, School, Authorities, Optional, Observance")
  @JsonProperty(JSON_PROPERTY_HOLIDAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHolidayType() {
    return holidayType;
  }


  public void setHolidayType(String holidayType) {
    this.holidayType = holidayType;
  }


  public PublicHolidayOccurrence nationwaide(Boolean nationwaide) {
    
    this.nationwaide = nationwaide;
    return this;
  }

   /**
   * True if the holiday is celebrated in all locales in the country, false otherwise
   * @return nationwaide
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the holiday is celebrated in all locales in the country, false otherwise")
  @JsonProperty(JSON_PROPERTY_NATIONWAIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNationwaide() {
    return nationwaide;
  }


  public void setNationwaide(Boolean nationwaide) {
    this.nationwaide = nationwaide;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicHolidayOccurrence publicHolidayOccurrence = (PublicHolidayOccurrence) o;
    return Objects.equals(this.englishName, publicHolidayOccurrence.englishName) &&
        Objects.equals(this.localName, publicHolidayOccurrence.localName) &&
        Objects.equals(this.occurrenceDate, publicHolidayOccurrence.occurrenceDate) &&
        Objects.equals(this.holidayType, publicHolidayOccurrence.holidayType) &&
        Objects.equals(this.nationwaide, publicHolidayOccurrence.nationwaide);
  }

  @Override
  public int hashCode() {
    return Objects.hash(englishName, localName, occurrenceDate, holidayType, nationwaide);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicHolidayOccurrence {\n");
    sb.append("    englishName: ").append(toIndentedString(englishName)).append("\n");
    sb.append("    localName: ").append(toIndentedString(localName)).append("\n");
    sb.append("    occurrenceDate: ").append(toIndentedString(occurrenceDate)).append("\n");
    sb.append("    holidayType: ").append(toIndentedString(holidayType)).append("\n");
    sb.append("    nationwaide: ").append(toIndentedString(nationwaide)).append("\n");
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

