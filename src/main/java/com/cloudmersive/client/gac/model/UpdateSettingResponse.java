/*
 * configapi
 * Config API lets you easily manage configuration at scale.
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
 * UpdateSettingResponse
 */
@JsonPropertyOrder({
  UpdateSettingResponse.JSON_PROPERTY_SUCCESSFUL,
  UpdateSettingResponse.JSON_PROPERTY_ERROR_MESSAGE
})
@JsonTypeName("UpdateSettingResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:18.250-07:00[America/Los_Angeles]")
public class UpdateSettingResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "ErrorMessage";
  private String errorMessage;


  public UpdateSettingResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * Get successful
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public UpdateSettingResponse errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSettingResponse updateSettingResponse = (UpdateSettingResponse) o;
    return Objects.equals(this.successful, updateSettingResponse.successful) &&
        Objects.equals(this.errorMessage, updateSettingResponse.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, errorMessage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSettingResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
