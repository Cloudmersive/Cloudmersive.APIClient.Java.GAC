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
import com.cloudmersive.client.gac.model.RecognitionOutcome;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Result of recognizing an image
 */
@ApiModel(description = "Result of recognizing an image")
@JsonPropertyOrder({
  ImageDescriptionResponse.JSON_PROPERTY_SUCCESSFUL,
  ImageDescriptionResponse.JSON_PROPERTY_HIGHCONFIDENCE,
  ImageDescriptionResponse.JSON_PROPERTY_BEST_OUTCOME,
  ImageDescriptionResponse.JSON_PROPERTY_RUNNER_UP_OUTCOME
})
@JsonTypeName("ImageDescriptionResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:58.346-07:00[America/Los_Angeles]")
public class ImageDescriptionResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_HIGHCONFIDENCE = "Highconfidence";
  private Boolean highconfidence;

  public static final String JSON_PROPERTY_BEST_OUTCOME = "BestOutcome";
  private RecognitionOutcome bestOutcome;

  public static final String JSON_PROPERTY_RUNNER_UP_OUTCOME = "RunnerUpOutcome";
  private RecognitionOutcome runnerUpOutcome;


  public ImageDescriptionResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * Was the image processed successfully?
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Was the image processed successfully?")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public ImageDescriptionResponse highconfidence(Boolean highconfidence) {
    
    this.highconfidence = highconfidence;
    return this;
  }

   /**
   * Is the resulting best outcome recognition a high confidence outcome?
   * @return highconfidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is the resulting best outcome recognition a high confidence outcome?")
  @JsonProperty(JSON_PROPERTY_HIGHCONFIDENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHighconfidence() {
    return highconfidence;
  }


  public void setHighconfidence(Boolean highconfidence) {
    this.highconfidence = highconfidence;
  }


  public ImageDescriptionResponse bestOutcome(RecognitionOutcome bestOutcome) {
    
    this.bestOutcome = bestOutcome;
    return this;
  }

   /**
   * Get bestOutcome
   * @return bestOutcome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BEST_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecognitionOutcome getBestOutcome() {
    return bestOutcome;
  }


  public void setBestOutcome(RecognitionOutcome bestOutcome) {
    this.bestOutcome = bestOutcome;
  }


  public ImageDescriptionResponse runnerUpOutcome(RecognitionOutcome runnerUpOutcome) {
    
    this.runnerUpOutcome = runnerUpOutcome;
    return this;
  }

   /**
   * Get runnerUpOutcome
   * @return runnerUpOutcome
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RUNNER_UP_OUTCOME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecognitionOutcome getRunnerUpOutcome() {
    return runnerUpOutcome;
  }


  public void setRunnerUpOutcome(RecognitionOutcome runnerUpOutcome) {
    this.runnerUpOutcome = runnerUpOutcome;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageDescriptionResponse imageDescriptionResponse = (ImageDescriptionResponse) o;
    return Objects.equals(this.successful, imageDescriptionResponse.successful) &&
        Objects.equals(this.highconfidence, imageDescriptionResponse.highconfidence) &&
        Objects.equals(this.bestOutcome, imageDescriptionResponse.bestOutcome) &&
        Objects.equals(this.runnerUpOutcome, imageDescriptionResponse.runnerUpOutcome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, highconfidence, bestOutcome, runnerUpOutcome);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageDescriptionResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    highconfidence: ").append(toIndentedString(highconfidence)).append("\n");
    sb.append("    bestOutcome: ").append(toIndentedString(bestOutcome)).append("\n");
    sb.append("    runnerUpOutcome: ").append(toIndentedString(runnerUpOutcome)).append("\n");
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

