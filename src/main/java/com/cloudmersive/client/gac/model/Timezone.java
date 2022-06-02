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
 * IANA/Olsen time zone
 */
@ApiModel(description = "IANA/Olsen time zone")
@JsonPropertyOrder({
  Timezone.JSON_PROPERTY_NAME,
  Timezone.JSON_PROPERTY_BASE_U_T_C_OFFSET,
  Timezone.JSON_PROPERTY_NOW
})
@JsonTypeName("Timezone")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:36.624-07:00[America/Los_Angeles]")
public class Timezone {
  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_BASE_U_T_C_OFFSET = "BaseUTCOffset";
  private String baseUTCOffset;

  public static final String JSON_PROPERTY_NOW = "Now";
  private OffsetDateTime now;


  public Timezone name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the Time Zone
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Time Zone")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Timezone baseUTCOffset(String baseUTCOffset) {
    
    this.baseUTCOffset = baseUTCOffset;
    return this;
  }

   /**
   * UTC offset for this time zone
   * @return baseUTCOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UTC offset for this time zone")
  @JsonProperty(JSON_PROPERTY_BASE_U_T_C_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBaseUTCOffset() {
    return baseUTCOffset;
  }


  public void setBaseUTCOffset(String baseUTCOffset) {
    this.baseUTCOffset = baseUTCOffset;
  }


  public Timezone now(OffsetDateTime now) {
    
    this.now = now;
    return this;
  }

   /**
   * The current time (Now) in this time zone
   * @return now
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current time (Now) in this time zone")
  @JsonProperty(JSON_PROPERTY_NOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getNow() {
    return now;
  }


  public void setNow(OffsetDateTime now) {
    this.now = now;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timezone timezone = (Timezone) o;
    return Objects.equals(this.name, timezone.name) &&
        Objects.equals(this.baseUTCOffset, timezone.baseUTCOffset) &&
        Objects.equals(this.now, timezone.now);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, baseUTCOffset, now);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timezone {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    baseUTCOffset: ").append(toIndentedString(baseUTCOffset)).append("\n");
    sb.append("    now: ").append(toIndentedString(now)).append("\n");
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

