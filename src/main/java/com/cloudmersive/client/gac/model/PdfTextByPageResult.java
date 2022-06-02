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
import com.cloudmersive.client.gac.model.PdfPageText;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Text of the PDF, broken down by page
 */
@ApiModel(description = "Text of the PDF, broken down by page")
@JsonPropertyOrder({
  PdfTextByPageResult.JSON_PROPERTY_SUCCESSFUL,
  PdfTextByPageResult.JSON_PROPERTY_PAGES
})
@JsonTypeName("PdfTextByPageResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:05.444-07:00[America/Los_Angeles]")
public class PdfTextByPageResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_PAGES = "Pages";
  private List<PdfPageText> pages = null;


  public PdfTextByPageResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public PdfTextByPageResult pages(List<PdfPageText> pages) {
    
    this.pages = pages;
    return this;
  }

  public PdfTextByPageResult addPagesItem(PdfPageText pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<PdfPageText>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Pages in the PDF
   * @return pages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pages in the PDF")
  @JsonProperty(JSON_PROPERTY_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PdfPageText> getPages() {
    return pages;
  }


  public void setPages(List<PdfPageText> pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfTextByPageResult pdfTextByPageResult = (PdfTextByPageResult) o;
    return Objects.equals(this.successful, pdfTextByPageResult.successful) &&
        Objects.equals(this.pages, pdfTextByPageResult.pages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, pages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfTextByPageResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

