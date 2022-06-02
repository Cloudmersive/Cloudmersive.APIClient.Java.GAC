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
 * Single object instance, and associated details, detected in an image
 */
@ApiModel(description = "Single object instance, and associated details, detected in an image")
@JsonPropertyOrder({
  DetectedObject.JSON_PROPERTY_OBJECT_CLASS_NAME,
  DetectedObject.JSON_PROPERTY_HEIGHT,
  DetectedObject.JSON_PROPERTY_WIDTH,
  DetectedObject.JSON_PROPERTY_SCORE,
  DetectedObject.JSON_PROPERTY_X,
  DetectedObject.JSON_PROPERTY_Y
})
@JsonTypeName("DetectedObject")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:58.346-07:00[America/Los_Angeles]")
public class DetectedObject {
  public static final String JSON_PROPERTY_OBJECT_CLASS_NAME = "ObjectClassName";
  private String objectClassName;

  public static final String JSON_PROPERTY_HEIGHT = "Height";
  private Integer height;

  public static final String JSON_PROPERTY_WIDTH = "Width";
  private Integer width;

  public static final String JSON_PROPERTY_SCORE = "Score";
  private Double score;

  public static final String JSON_PROPERTY_X = "X";
  private Integer X;

  public static final String JSON_PROPERTY_Y = "Y";
  private Integer Y;


  public DetectedObject objectClassName(String objectClassName) {
    
    this.objectClassName = objectClassName;
    return this;
  }

   /**
   * Class of the object.  Example values are \&quot;person\&quot;, \&quot;car\&quot;, \&quot;dining table\&quot;, etc.
   * @return objectClassName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Class of the object.  Example values are \"person\", \"car\", \"dining table\", etc.")
  @JsonProperty(JSON_PROPERTY_OBJECT_CLASS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObjectClassName() {
    return objectClassName;
  }


  public void setObjectClassName(String objectClassName) {
    this.objectClassName = objectClassName;
  }


  public DetectedObject height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Height, in pixels, of the object
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Height, in pixels, of the object")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public DetectedObject width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Width, in pixels, of the object
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Width, in pixels, of the object")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    this.width = width;
  }


  public DetectedObject score(Double score) {
    
    this.score = score;
    return this;
  }

   /**
   * Confidence score of detected object; possible values are between 0.0 and 1.0; values closer to 1.0 are higher confidence
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Confidence score of detected object; possible values are between 0.0 and 1.0; values closer to 1.0 are higher confidence")
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getScore() {
    return score;
  }


  public void setScore(Double score) {
    this.score = score;
  }


  public DetectedObject X(Integer X) {
    
    this.X = X;
    return this;
  }

   /**
   * X location, in pixels, of the left side location of the object, with the right side being X + Width
   * @return X
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "X location, in pixels, of the left side location of the object, with the right side being X + Width")
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getX() {
    return X;
  }


  public void setX(Integer X) {
    this.X = X;
  }


  public DetectedObject Y(Integer Y) {
    
    this.Y = Y;
    return this;
  }

   /**
   * Y location, in pixels, of the top side location of the object, with the bottom side being Y + Height
   * @return Y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Y location, in pixels, of the top side location of the object, with the bottom side being Y + Height")
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getY() {
    return Y;
  }


  public void setY(Integer Y) {
    this.Y = Y;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetectedObject detectedObject = (DetectedObject) o;
    return Objects.equals(this.objectClassName, detectedObject.objectClassName) &&
        Objects.equals(this.height, detectedObject.height) &&
        Objects.equals(this.width, detectedObject.width) &&
        Objects.equals(this.score, detectedObject.score) &&
        Objects.equals(this.X, detectedObject.X) &&
        Objects.equals(this.Y, detectedObject.Y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectClassName, height, width, score, X, Y);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetectedObject {\n");
    sb.append("    objectClassName: ").append(toIndentedString(objectClassName)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
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

