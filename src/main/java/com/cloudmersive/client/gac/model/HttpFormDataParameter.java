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
import com.cloudmersive.client.gac.model.TaskOutputReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Defines a parameter of type FormData (multipart/form-data)
 */
@ApiModel(description = "Defines a parameter of type FormData (multipart/form-data)")
@JsonPropertyOrder({
  HttpFormDataParameter.JSON_PROPERTY_PARAMETER_NAME,
  HttpFormDataParameter.JSON_PROPERTY_PARAMETER_TEXT_VALUE,
  HttpFormDataParameter.JSON_PROPERTY_PARAMETER_FILE_CONTENTS,
  HttpFormDataParameter.JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK
})
@JsonTypeName("HttpFormDataParameter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:18.250-07:00[America/Los_Angeles]")
public class HttpFormDataParameter {
  public static final String JSON_PROPERTY_PARAMETER_NAME = "ParameterName";
  private String parameterName;

  public static final String JSON_PROPERTY_PARAMETER_TEXT_VALUE = "ParameterTextValue";
  private String parameterTextValue;

  public static final String JSON_PROPERTY_PARAMETER_FILE_CONTENTS = "ParameterFileContents";
  private byte[] parameterFileContents;

  public static final String JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK = "UseOutputFromPreviousTask";
  private TaskOutputReference useOutputFromPreviousTask;


  public HttpFormDataParameter parameterName(String parameterName) {
    
    this.parameterName = parameterName;
    return this;
  }

   /**
   * Name of the parameter
   * @return parameterName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the parameter")
  @JsonProperty(JSON_PROPERTY_PARAMETER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParameterName() {
    return parameterName;
  }


  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }


  public HttpFormDataParameter parameterTextValue(String parameterTextValue) {
    
    this.parameterTextValue = parameterTextValue;
    return this;
  }

   /**
   * Text value of the parameter; if set, do not set ParameterFileContents or UseOutputFromPreviousTask
   * @return parameterTextValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text value of the parameter; if set, do not set ParameterFileContents or UseOutputFromPreviousTask")
  @JsonProperty(JSON_PROPERTY_PARAMETER_TEXT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParameterTextValue() {
    return parameterTextValue;
  }


  public void setParameterTextValue(String parameterTextValue) {
    this.parameterTextValue = parameterTextValue;
  }


  public HttpFormDataParameter parameterFileContents(byte[] parameterFileContents) {
    
    this.parameterFileContents = parameterFileContents;
    return this;
  }

   /**
   * Binary contents of the parameter; if set, do not set ParameterTextValue or UseOutputFromPreviousTask
   * @return parameterFileContents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Binary contents of the parameter; if set, do not set ParameterTextValue or UseOutputFromPreviousTask")
  @JsonProperty(JSON_PROPERTY_PARAMETER_FILE_CONTENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getParameterFileContents() {
    return parameterFileContents;
  }


  public void setParameterFileContents(byte[] parameterFileContents) {
    this.parameterFileContents = parameterFileContents;
  }


  public HttpFormDataParameter useOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    
    this.useOutputFromPreviousTask = useOutputFromPreviousTask;
    return this;
  }

   /**
   * Get useOutputFromPreviousTask
   * @return useOutputFromPreviousTask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaskOutputReference getUseOutputFromPreviousTask() {
    return useOutputFromPreviousTask;
  }


  public void setUseOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    this.useOutputFromPreviousTask = useOutputFromPreviousTask;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpFormDataParameter httpFormDataParameter = (HttpFormDataParameter) o;
    return Objects.equals(this.parameterName, httpFormDataParameter.parameterName) &&
        Objects.equals(this.parameterTextValue, httpFormDataParameter.parameterTextValue) &&
        Arrays.equals(this.parameterFileContents, httpFormDataParameter.parameterFileContents) &&
        Objects.equals(this.useOutputFromPreviousTask, httpFormDataParameter.useOutputFromPreviousTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterName, parameterTextValue, Arrays.hashCode(parameterFileContents), useOutputFromPreviousTask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpFormDataParameter {\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
    sb.append("    parameterTextValue: ").append(toIndentedString(parameterTextValue)).append("\n");
    sb.append("    parameterFileContents: ").append(toIndentedString(parameterFileContents)).append("\n");
    sb.append("    useOutputFromPreviousTask: ").append(toIndentedString(useOutputFromPreviousTask)).append("\n");
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

