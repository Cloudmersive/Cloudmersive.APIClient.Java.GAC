/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
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
 * Request to convert a URL to a PDF file
 */
@ApiModel(description = "Request to convert a URL to a PDF file")
@JsonPropertyOrder({
  UrlToPdfRequest.JSON_PROPERTY_URL,
  UrlToPdfRequest.JSON_PROPERTY_EXTRA_LOADING_WAIT,
  UrlToPdfRequest.JSON_PROPERTY_INCLUDE_BACKGROUND_GRAPHICS,
  UrlToPdfRequest.JSON_PROPERTY_SCALE_FACTOR
})
@JsonTypeName("UrlToPdfRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:05.444-07:00[America/Los_Angeles]")
public class UrlToPdfRequest {
  public static final String JSON_PROPERTY_URL = "Url";
  private String url;

  public static final String JSON_PROPERTY_EXTRA_LOADING_WAIT = "ExtraLoadingWait";
  private Integer extraLoadingWait;

  public static final String JSON_PROPERTY_INCLUDE_BACKGROUND_GRAPHICS = "IncludeBackgroundGraphics";
  private Boolean includeBackgroundGraphics;

  public static final String JSON_PROPERTY_SCALE_FACTOR = "ScaleFactor";
  private Integer scaleFactor;


  public UrlToPdfRequest url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL address of the website to screenshot.  HTTP and HTTPS are both supported, as are custom ports.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL address of the website to screenshot.  HTTP and HTTPS are both supported, as are custom ports.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public UrlToPdfRequest extraLoadingWait(Integer extraLoadingWait) {
    
    this.extraLoadingWait = extraLoadingWait;
    return this;
  }

   /**
   * Optional: Additional number of milliseconds to wait once the web page has finished loading before taking the screenshot.  Can be helpful for highly asynchronous websites.  Provide a value of 0 for the default of 5000 milliseconds (5 seconds). Maximum is 20000 milliseconds (20 seconds).
   * @return extraLoadingWait
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Additional number of milliseconds to wait once the web page has finished loading before taking the screenshot.  Can be helpful for highly asynchronous websites.  Provide a value of 0 for the default of 5000 milliseconds (5 seconds). Maximum is 20000 milliseconds (20 seconds).")
  @JsonProperty(JSON_PROPERTY_EXTRA_LOADING_WAIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExtraLoadingWait() {
    return extraLoadingWait;
  }


  public void setExtraLoadingWait(Integer extraLoadingWait) {
    this.extraLoadingWait = extraLoadingWait;
  }


  public UrlToPdfRequest includeBackgroundGraphics(Boolean includeBackgroundGraphics) {
    
    this.includeBackgroundGraphics = includeBackgroundGraphics;
    return this;
  }

   /**
   * Optional: Set to true to include background graphics in the PDF, or false to not include.  Default is true.
   * @return includeBackgroundGraphics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Set to true to include background graphics in the PDF, or false to not include.  Default is true.")
  @JsonProperty(JSON_PROPERTY_INCLUDE_BACKGROUND_GRAPHICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeBackgroundGraphics() {
    return includeBackgroundGraphics;
  }


  public void setIncludeBackgroundGraphics(Boolean includeBackgroundGraphics) {
    this.includeBackgroundGraphics = includeBackgroundGraphics;
  }


  public UrlToPdfRequest scaleFactor(Integer scaleFactor) {
    
    this.scaleFactor = scaleFactor;
    return this;
  }

   /**
   * Optional: Set to 100 to scale at 100%, set to 50% to scale down to 50% scale, set to 200% to scale up to 200% scale, etc.  Default is 100%. Maximum is 1000%
   * @return scaleFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Set to 100 to scale at 100%, set to 50% to scale down to 50% scale, set to 200% to scale up to 200% scale, etc.  Default is 100%. Maximum is 1000%")
  @JsonProperty(JSON_PROPERTY_SCALE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getScaleFactor() {
    return scaleFactor;
  }


  public void setScaleFactor(Integer scaleFactor) {
    this.scaleFactor = scaleFactor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlToPdfRequest urlToPdfRequest = (UrlToPdfRequest) o;
    return Objects.equals(this.url, urlToPdfRequest.url) &&
        Objects.equals(this.extraLoadingWait, urlToPdfRequest.extraLoadingWait) &&
        Objects.equals(this.includeBackgroundGraphics, urlToPdfRequest.includeBackgroundGraphics) &&
        Objects.equals(this.scaleFactor, urlToPdfRequest.scaleFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, extraLoadingWait, includeBackgroundGraphics, scaleFactor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlToPdfRequest {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    extraLoadingWait: ").append(toIndentedString(extraLoadingWait)).append("\n");
    sb.append("    includeBackgroundGraphics: ").append(toIndentedString(includeBackgroundGraphics)).append("\n");
    sb.append("    scaleFactor: ").append(toIndentedString(scaleFactor)).append("\n");
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

