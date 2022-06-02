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
 * A single converted page
 */
@ApiModel(description = "A single converted page")
@JsonPropertyOrder({
  ConvertedJpgPage.JSON_PROPERTY_PAGE_NUMBER,
  ConvertedJpgPage.JSON_PROPERTY_CONTENT
})
@JsonTypeName("ConvertedJpgPage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:05.444-07:00[America/Los_Angeles]")
public class ConvertedJpgPage {
  public static final String JSON_PROPERTY_PAGE_NUMBER = "PageNumber";
  private Integer pageNumber;

  public static final String JSON_PROPERTY_CONTENT = "Content";
  private byte[] content;


  public ConvertedJpgPage pageNumber(Integer pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number of the converted page, starting with 1
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Page number of the converted page, starting with 1")
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNumber() {
    return pageNumber;
  }


  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  public ConvertedJpgPage content(byte[] content) {
    
    this.content = content;
    return this;
  }

   /**
   * The JPG file of this page as a byte array
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The JPG file of this page as a byte array")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getContent() {
    return content;
  }


  public void setContent(byte[] content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertedJpgPage convertedJpgPage = (ConvertedJpgPage) o;
    return Objects.equals(this.pageNumber, convertedJpgPage.pageNumber) &&
        Arrays.equals(this.content, convertedJpgPage.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, Arrays.hashCode(content));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertedJpgPage {\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
