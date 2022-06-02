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
 * Unit of text content in a Word Document (DOCX) file
 */
@ApiModel(description = "Unit of text content in a Word Document (DOCX) file")
@JsonPropertyOrder({
  DocxText.JSON_PROPERTY_TEXT_INDEX,
  DocxText.JSON_PROPERTY_PATH,
  DocxText.JSON_PROPERTY_TEXT_CONTENT
})
@JsonTypeName("DocxText")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:05.444-07:00[America/Los_Angeles]")
public class DocxText {
  public static final String JSON_PROPERTY_TEXT_INDEX = "TextIndex";
  private Integer textIndex;

  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;

  public static final String JSON_PROPERTY_TEXT_CONTENT = "TextContent";
  private String textContent;


  public DocxText textIndex(Integer textIndex) {
    
    this.textIndex = textIndex;
    return this;
  }

   /**
   * Index of the text content in the run; 0-based
   * @return textIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Index of the text content in the run; 0-based")
  @JsonProperty(JSON_PROPERTY_TEXT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTextIndex() {
    return textIndex;
  }


  public void setTextIndex(Integer textIndex) {
    this.textIndex = textIndex;
  }


  public DocxText path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this Text object; leave blank for creation
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Path of the location of this Text object; leave blank for creation")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public DocxText textContent(String textContent) {
    
    this.textContent = textContent;
    return this;
  }

   /**
   * Text string containing the text content of this text content item
   * @return textContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text string containing the text content of this text content item")
  @JsonProperty(JSON_PROPERTY_TEXT_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextContent() {
    return textContent;
  }


  public void setTextContent(String textContent) {
    this.textContent = textContent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxText docxText = (DocxText) o;
    return Objects.equals(this.textIndex, docxText.textIndex) &&
        Objects.equals(this.path, docxText.path) &&
        Objects.equals(this.textContent, docxText.textContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textIndex, path, textContent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxText {\n");
    sb.append("    textIndex: ").append(toIndentedString(textIndex)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
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

