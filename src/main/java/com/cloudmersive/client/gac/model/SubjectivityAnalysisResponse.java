/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
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
 * Output of a subjectivity analysis operation
 */
@ApiModel(description = "Output of a subjectivity analysis operation")
@JsonPropertyOrder({
  SubjectivityAnalysisResponse.JSON_PROPERTY_SUCCESSFUL,
  SubjectivityAnalysisResponse.JSON_PROPERTY_SUBJECTIVITY_SCORE_RESULT,
  SubjectivityAnalysisResponse.JSON_PROPERTY_SENTENCE_COUNT
})
@JsonTypeName("SubjectivityAnalysisResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:42.991-07:00[America/Los_Angeles]")
public class SubjectivityAnalysisResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_SUBJECTIVITY_SCORE_RESULT = "SubjectivityScoreResult";
  private Double subjectivityScoreResult;

  public static final String JSON_PROPERTY_SENTENCE_COUNT = "SentenceCount";
  private Integer sentenceCount;


  public SubjectivityAnalysisResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if the subjectivity analysis operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the subjectivity analysis operation was successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public SubjectivityAnalysisResponse subjectivityScoreResult(Double subjectivityScoreResult) {
    
    this.subjectivityScoreResult = subjectivityScoreResult;
    return this;
  }

   /**
   * Subjectivity vs. objectivity classification score between 0.0 and 1.0 where scores closer to zero have a high probability of objectivity, while scores close to 1.0 have a high probability of subjectivity.
   * @return subjectivityScoreResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subjectivity vs. objectivity classification score between 0.0 and 1.0 where scores closer to zero have a high probability of objectivity, while scores close to 1.0 have a high probability of subjectivity.")
  @JsonProperty(JSON_PROPERTY_SUBJECTIVITY_SCORE_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getSubjectivityScoreResult() {
    return subjectivityScoreResult;
  }


  public void setSubjectivityScoreResult(Double subjectivityScoreResult) {
    this.subjectivityScoreResult = subjectivityScoreResult;
  }


  public SubjectivityAnalysisResponse sentenceCount(Integer sentenceCount) {
    
    this.sentenceCount = sentenceCount;
    return this;
  }

   /**
   * Number of sentences in input text
   * @return sentenceCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of sentences in input text")
  @JsonProperty(JSON_PROPERTY_SENTENCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSentenceCount() {
    return sentenceCount;
  }


  public void setSentenceCount(Integer sentenceCount) {
    this.sentenceCount = sentenceCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubjectivityAnalysisResponse subjectivityAnalysisResponse = (SubjectivityAnalysisResponse) o;
    return Objects.equals(this.successful, subjectivityAnalysisResponse.successful) &&
        Objects.equals(this.subjectivityScoreResult, subjectivityAnalysisResponse.subjectivityScoreResult) &&
        Objects.equals(this.sentenceCount, subjectivityAnalysisResponse.sentenceCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, subjectivityScoreResult, sentenceCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjectivityAnalysisResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    subjectivityScoreResult: ").append(toIndentedString(subjectivityScoreResult)).append("\n");
    sb.append("    sentenceCount: ").append(toIndentedString(sentenceCount)).append("\n");
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

