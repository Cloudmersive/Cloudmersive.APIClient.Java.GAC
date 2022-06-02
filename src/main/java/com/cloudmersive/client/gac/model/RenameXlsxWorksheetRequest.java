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
import com.cloudmersive.client.gac.model.XlsxWorksheet;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Input to a Rename-Worksheet request
 */
@ApiModel(description = "Input to a Rename-Worksheet request")
@JsonPropertyOrder({
  RenameXlsxWorksheetRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  RenameXlsxWorksheetRequest.JSON_PROPERTY_INPUT_FILE_URL,
  RenameXlsxWorksheetRequest.JSON_PROPERTY_WORKSHEET_TO_RENAME,
  RenameXlsxWorksheetRequest.JSON_PROPERTY_NEW_WORKSHEET_NAME
})
@JsonTypeName("RenameXlsxWorksheetRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:05.444-07:00[America/Los_Angeles]")
public class RenameXlsxWorksheetRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_WORKSHEET_TO_RENAME = "WorksheetToRename";
  private XlsxWorksheet worksheetToRename;

  public static final String JSON_PROPERTY_NEW_WORKSHEET_NAME = "NewWorksheetName";
  private String newWorksheetName;


  public RenameXlsxWorksheetRequest inputFileBytes(byte[] inputFileBytes) {
    
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input file to operate on
   * @return inputFileBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Bytes of the input file to operate on")
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }


  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }


  public RenameXlsxWorksheetRequest inputFileUrl(String inputFileUrl) {
    
    this.inputFileUrl = inputFileUrl;
    return this;
  }

   /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputFileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInputFileUrl() {
    return inputFileUrl;
  }


  public void setInputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
  }


  public RenameXlsxWorksheetRequest worksheetToRename(XlsxWorksheet worksheetToRename) {
    
    this.worksheetToRename = worksheetToRename;
    return this;
  }

   /**
   * Get worksheetToRename
   * @return worksheetToRename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORKSHEET_TO_RENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XlsxWorksheet getWorksheetToRename() {
    return worksheetToRename;
  }


  public void setWorksheetToRename(XlsxWorksheet worksheetToRename) {
    this.worksheetToRename = worksheetToRename;
  }


  public RenameXlsxWorksheetRequest newWorksheetName(String newWorksheetName) {
    
    this.newWorksheetName = newWorksheetName;
    return this;
  }

   /**
   * Required; The new name to be used for the worksheet
   * @return newWorksheetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required; The new name to be used for the worksheet")
  @JsonProperty(JSON_PROPERTY_NEW_WORKSHEET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNewWorksheetName() {
    return newWorksheetName;
  }


  public void setNewWorksheetName(String newWorksheetName) {
    this.newWorksheetName = newWorksheetName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenameXlsxWorksheetRequest renameXlsxWorksheetRequest = (RenameXlsxWorksheetRequest) o;
    return Arrays.equals(this.inputFileBytes, renameXlsxWorksheetRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, renameXlsxWorksheetRequest.inputFileUrl) &&
        Objects.equals(this.worksheetToRename, renameXlsxWorksheetRequest.worksheetToRename) &&
        Objects.equals(this.newWorksheetName, renameXlsxWorksheetRequest.newWorksheetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, worksheetToRename, newWorksheetName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenameXlsxWorksheetRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    worksheetToRename: ").append(toIndentedString(worksheetToRename)).append("\n");
    sb.append("    newWorksheetName: ").append(toIndentedString(newWorksheetName)).append("\n");
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

