/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
 * License plate found in the image
 */
@ApiModel(description = "License plate found in the image")
@JsonPropertyOrder({
  DetectedLicensePlate.JSON_PROPERTY_LICENSE_PLATE_TEXT_BEST_MATCH,
  DetectedLicensePlate.JSON_PROPERTY_LICENSE_PLATE_TEXT_RUNNER_UP,
  DetectedLicensePlate.JSON_PROPERTY_LOCATION_X,
  DetectedLicensePlate.JSON_PROPERTY_LOCATION_Y,
  DetectedLicensePlate.JSON_PROPERTY_WIDTH,
  DetectedLicensePlate.JSON_PROPERTY_HEIGHT,
  DetectedLicensePlate.JSON_PROPERTY_LICENSE_PLATE_RECOGNITION_CONFIDENCE_LEVEL
})
@JsonTypeName("DetectedLicensePlate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:58.346-07:00[America/Los_Angeles]")
public class DetectedLicensePlate {
  public static final String JSON_PROPERTY_LICENSE_PLATE_TEXT_BEST_MATCH = "LicensePlateText_BestMatch";
  private String licensePlateTextBestMatch;

  public static final String JSON_PROPERTY_LICENSE_PLATE_TEXT_RUNNER_UP = "LicensePlateText_RunnerUp";
  private String licensePlateTextRunnerUp;

  public static final String JSON_PROPERTY_LOCATION_X = "LocationX";
  private Integer locationX;

  public static final String JSON_PROPERTY_LOCATION_Y = "LocationY";
  private Integer locationY;

  public static final String JSON_PROPERTY_WIDTH = "Width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "Height";
  private Integer height;

  public static final String JSON_PROPERTY_LICENSE_PLATE_RECOGNITION_CONFIDENCE_LEVEL = "LicensePlateRecognitionConfidenceLevel";
  private Double licensePlateRecognitionConfidenceLevel;


  public DetectedLicensePlate licensePlateTextBestMatch(String licensePlateTextBestMatch) {
    
    this.licensePlateTextBestMatch = licensePlateTextBestMatch;
    return this;
  }

   /**
   * Text from the license plate, highest-confidence result
   * @return licensePlateTextBestMatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text from the license plate, highest-confidence result")
  @JsonProperty(JSON_PROPERTY_LICENSE_PLATE_TEXT_BEST_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLicensePlateTextBestMatch() {
    return licensePlateTextBestMatch;
  }


  public void setLicensePlateTextBestMatch(String licensePlateTextBestMatch) {
    this.licensePlateTextBestMatch = licensePlateTextBestMatch;
  }


  public DetectedLicensePlate licensePlateTextRunnerUp(String licensePlateTextRunnerUp) {
    
    this.licensePlateTextRunnerUp = licensePlateTextRunnerUp;
    return this;
  }

   /**
   * Alternate text from the license plate, based on second-highest-confidence result
   * @return licensePlateTextRunnerUp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Alternate text from the license plate, based on second-highest-confidence result")
  @JsonProperty(JSON_PROPERTY_LICENSE_PLATE_TEXT_RUNNER_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLicensePlateTextRunnerUp() {
    return licensePlateTextRunnerUp;
  }


  public void setLicensePlateTextRunnerUp(String licensePlateTextRunnerUp) {
    this.licensePlateTextRunnerUp = licensePlateTextRunnerUp;
  }


  public DetectedLicensePlate locationX(Integer locationX) {
    
    this.locationX = locationX;
    return this;
  }

   /**
   * X location of the left edge of the license plate, starting from the left edge of the photo (X &#x3D; 0)
   * @return locationX
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "X location of the left edge of the license plate, starting from the left edge of the photo (X = 0)")
  @JsonProperty(JSON_PROPERTY_LOCATION_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLocationX() {
    return locationX;
  }


  public void setLocationX(Integer locationX) {
    this.locationX = locationX;
  }


  public DetectedLicensePlate locationY(Integer locationY) {
    
    this.locationY = locationY;
    return this;
  }

   /**
   * Y location of the top edge of the license plate, starting from the top edge of the photo (Y &#x3D; 0)
   * @return locationY
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Y location of the top edge of the license plate, starting from the top edge of the photo (Y = 0)")
  @JsonProperty(JSON_PROPERTY_LOCATION_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLocationY() {
    return locationY;
  }


  public void setLocationY(Integer locationY) {
    this.locationY = locationY;
  }


  public DetectedLicensePlate width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Width of the license plate&#39;s location in pixels
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Width of the license plate's location in pixels")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    this.width = width;
  }


  public DetectedLicensePlate height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Height of the license plate&#39;s location in pixels
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Height of the license plate's location in pixels")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public DetectedLicensePlate licensePlateRecognitionConfidenceLevel(Double licensePlateRecognitionConfidenceLevel) {
    
    this.licensePlateRecognitionConfidenceLevel = licensePlateRecognitionConfidenceLevel;
    return this;
  }

   /**
   * Confidence score on a range of 0.0 - 1.0 of the accuracy of the detected license plate, with higher scores being better; values about 0.75 are high confidence
   * @return licensePlateRecognitionConfidenceLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Confidence score on a range of 0.0 - 1.0 of the accuracy of the detected license plate, with higher scores being better; values about 0.75 are high confidence")
  @JsonProperty(JSON_PROPERTY_LICENSE_PLATE_RECOGNITION_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getLicensePlateRecognitionConfidenceLevel() {
    return licensePlateRecognitionConfidenceLevel;
  }


  public void setLicensePlateRecognitionConfidenceLevel(Double licensePlateRecognitionConfidenceLevel) {
    this.licensePlateRecognitionConfidenceLevel = licensePlateRecognitionConfidenceLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectedLicensePlate detectedLicensePlate = (DetectedLicensePlate) o;
    return Objects.equals(this.licensePlateTextBestMatch, detectedLicensePlate.licensePlateTextBestMatch) &&
        Objects.equals(this.licensePlateTextRunnerUp, detectedLicensePlate.licensePlateTextRunnerUp) &&
        Objects.equals(this.locationX, detectedLicensePlate.locationX) &&
        Objects.equals(this.locationY, detectedLicensePlate.locationY) &&
        Objects.equals(this.width, detectedLicensePlate.width) &&
        Objects.equals(this.height, detectedLicensePlate.height) &&
        Objects.equals(this.licensePlateRecognitionConfidenceLevel, detectedLicensePlate.licensePlateRecognitionConfidenceLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licensePlateTextBestMatch, licensePlateTextRunnerUp, locationX, locationY, width, height, licensePlateRecognitionConfidenceLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectedLicensePlate {\n");
    sb.append("    licensePlateTextBestMatch: ").append(toIndentedString(licensePlateTextBestMatch)).append("\n");
    sb.append("    licensePlateTextRunnerUp: ").append(toIndentedString(licensePlateTextRunnerUp)).append("\n");
    sb.append("    locationX: ").append(toIndentedString(locationX)).append("\n");
    sb.append("    locationY: ").append(toIndentedString(locationY)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    licensePlateRecognitionConfidenceLevel: ").append(toIndentedString(licensePlateRecognitionConfidenceLevel)).append("\n");
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
