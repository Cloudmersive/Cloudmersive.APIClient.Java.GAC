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
 * Input to a profanity analysis operation
 */
@ApiModel(description = "Input to a profanity analysis operation")
@JsonPropertyOrder({
  ProfanityAnalysisRequest.JSON_PROPERTY_TEXT_TO_ANALYZE
})
@JsonTypeName("ProfanityAnalysisRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:42.991-07:00[America/Los_Angeles]")
public class ProfanityAnalysisRequest {
  public static final String JSON_PROPERTY_TEXT_TO_ANALYZE = "TextToAnalyze";
  private String textToAnalyze;


  public ProfanityAnalysisRequest textToAnalyze(String textToAnalyze) {
    
    this.textToAnalyze = textToAnalyze;
    return this;
  }

   /**
   * Text to analyze
   * @return textToAnalyze
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text to analyze")
  @JsonProperty(JSON_PROPERTY_TEXT_TO_ANALYZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextToAnalyze() {
    return textToAnalyze;
  }


  public void setTextToAnalyze(String textToAnalyze) {
    this.textToAnalyze = textToAnalyze;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfanityAnalysisRequest profanityAnalysisRequest = (ProfanityAnalysisRequest) o;
    return Objects.equals(this.textToAnalyze, profanityAnalysisRequest.textToAnalyze);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textToAnalyze);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfanityAnalysisRequest {\n");
    sb.append("    textToAnalyze: ").append(toIndentedString(textToAnalyze)).append("\n");
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

