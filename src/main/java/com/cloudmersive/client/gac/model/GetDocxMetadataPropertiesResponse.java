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
import com.cloudmersive.client.gac.model.DocxMetadataCustomProperty;
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
 * Result of running a DocxGetMetadataProperties command
 */
@ApiModel(description = "Result of running a DocxGetMetadataProperties command")
@JsonPropertyOrder({
  GetDocxMetadataPropertiesResponse.JSON_PROPERTY_COMPANY,
  GetDocxMetadataPropertiesResponse.JSON_PROPERTY_MANAGER,
  GetDocxMetadataPropertiesResponse.JSON_PROPERTY_APPLICATION_VERSION,
  GetDocxMetadataPropertiesResponse.JSON_PROPERTY_WORD_COUNT,
  GetDocxMetadataPropertiesResponse.JSON_PROPERTY_LINE_COUNT,
  GetDocxMetadataPropertiesResponse.JSON_PROPERTY_PARAGRAPH_COUNT,
  GetDocxMetadataPropertiesResponse.JSON_PROPERTY_PAGE_COUNT,
  GetDocxMetadataPropertiesResponse.JSON_PROPERTY_CUSTOM_PROPERTIES,
  GetDocxMetadataPropertiesResponse.JSON_PROPERTY_SUCCESSFUL
})
@JsonTypeName("GetDocxMetadataPropertiesResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:05.444-07:00[America/Los_Angeles]")
public class GetDocxMetadataPropertiesResponse {
  public static final String JSON_PROPERTY_COMPANY = "Company";
  private String company;

  public static final String JSON_PROPERTY_MANAGER = "Manager";
  private String manager;

  public static final String JSON_PROPERTY_APPLICATION_VERSION = "ApplicationVersion";
  private String applicationVersion;

  public static final String JSON_PROPERTY_WORD_COUNT = "WordCount";
  private Long wordCount;

  public static final String JSON_PROPERTY_LINE_COUNT = "LineCount";
  private Long lineCount;

  public static final String JSON_PROPERTY_PARAGRAPH_COUNT = "ParagraphCount";
  private Long paragraphCount;

  public static final String JSON_PROPERTY_PAGE_COUNT = "PageCount";
  private Long pageCount;

  public static final String JSON_PROPERTY_CUSTOM_PROPERTIES = "CustomProperties";
  private List<DocxMetadataCustomProperty> customProperties = null;

  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;


  public GetDocxMetadataPropertiesResponse company(String company) {
    
    this.company = company;
    return this;
  }

   /**
   * Name of the Company that authored the document, if available
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Company that authored the document, if available")
  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompany() {
    return company;
  }


  public void setCompany(String company) {
    this.company = company;
  }


  public GetDocxMetadataPropertiesResponse manager(String manager) {
    
    this.manager = manager;
    return this;
  }

   /**
   * Name of the Manager that authored the document, if available
   * @return manager
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Manager that authored the document, if available")
  @JsonProperty(JSON_PROPERTY_MANAGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getManager() {
    return manager;
  }


  public void setManager(String manager) {
    this.manager = manager;
  }


  public GetDocxMetadataPropertiesResponse applicationVersion(String applicationVersion) {
    
    this.applicationVersion = applicationVersion;
    return this;
  }

   /**
   * Application version that authored the document, if available
   * @return applicationVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Application version that authored the document, if available")
  @JsonProperty(JSON_PROPERTY_APPLICATION_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApplicationVersion() {
    return applicationVersion;
  }


  public void setApplicationVersion(String applicationVersion) {
    this.applicationVersion = applicationVersion;
  }


  public GetDocxMetadataPropertiesResponse wordCount(Long wordCount) {
    
    this.wordCount = wordCount;
    return this;
  }

   /**
   * Word count of the document
   * @return wordCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Word count of the document")
  @JsonProperty(JSON_PROPERTY_WORD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getWordCount() {
    return wordCount;
  }


  public void setWordCount(Long wordCount) {
    this.wordCount = wordCount;
  }


  public GetDocxMetadataPropertiesResponse lineCount(Long lineCount) {
    
    this.lineCount = lineCount;
    return this;
  }

   /**
   * Line count of the document
   * @return lineCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Line count of the document")
  @JsonProperty(JSON_PROPERTY_LINE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLineCount() {
    return lineCount;
  }


  public void setLineCount(Long lineCount) {
    this.lineCount = lineCount;
  }


  public GetDocxMetadataPropertiesResponse paragraphCount(Long paragraphCount) {
    
    this.paragraphCount = paragraphCount;
    return this;
  }

   /**
   * Paragraph count of the document
   * @return paragraphCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Paragraph count of the document")
  @JsonProperty(JSON_PROPERTY_PARAGRAPH_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getParagraphCount() {
    return paragraphCount;
  }


  public void setParagraphCount(Long paragraphCount) {
    this.paragraphCount = paragraphCount;
  }


  public GetDocxMetadataPropertiesResponse pageCount(Long pageCount) {
    
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Page count of the document
   * @return pageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Page count of the document")
  @JsonProperty(JSON_PROPERTY_PAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPageCount() {
    return pageCount;
  }


  public void setPageCount(Long pageCount) {
    this.pageCount = pageCount;
  }


  public GetDocxMetadataPropertiesResponse customProperties(List<DocxMetadataCustomProperty> customProperties) {
    
    this.customProperties = customProperties;
    return this;
  }

  public GetDocxMetadataPropertiesResponse addCustomPropertiesItem(DocxMetadataCustomProperty customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new ArrayList<DocxMetadataCustomProperty>();
    }
    this.customProperties.add(customPropertiesItem);
    return this;
  }

   /**
   * Custom properties applied to the document
   * @return customProperties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom properties applied to the document")
  @JsonProperty(JSON_PROPERTY_CUSTOM_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxMetadataCustomProperty> getCustomProperties() {
    return customProperties;
  }


  public void setCustomProperties(List<DocxMetadataCustomProperty> customProperties) {
    this.customProperties = customProperties;
  }


  public GetDocxMetadataPropertiesResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxMetadataPropertiesResponse getDocxMetadataPropertiesResponse = (GetDocxMetadataPropertiesResponse) o;
    return Objects.equals(this.company, getDocxMetadataPropertiesResponse.company) &&
        Objects.equals(this.manager, getDocxMetadataPropertiesResponse.manager) &&
        Objects.equals(this.applicationVersion, getDocxMetadataPropertiesResponse.applicationVersion) &&
        Objects.equals(this.wordCount, getDocxMetadataPropertiesResponse.wordCount) &&
        Objects.equals(this.lineCount, getDocxMetadataPropertiesResponse.lineCount) &&
        Objects.equals(this.paragraphCount, getDocxMetadataPropertiesResponse.paragraphCount) &&
        Objects.equals(this.pageCount, getDocxMetadataPropertiesResponse.pageCount) &&
        Objects.equals(this.customProperties, getDocxMetadataPropertiesResponse.customProperties) &&
        Objects.equals(this.successful, getDocxMetadataPropertiesResponse.successful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(company, manager, applicationVersion, wordCount, lineCount, paragraphCount, pageCount, customProperties, successful);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxMetadataPropertiesResponse {\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    applicationVersion: ").append(toIndentedString(applicationVersion)).append("\n");
    sb.append("    wordCount: ").append(toIndentedString(wordCount)).append("\n");
    sb.append("    lineCount: ").append(toIndentedString(lineCount)).append("\n");
    sb.append("    paragraphCount: ").append(toIndentedString(paragraphCount)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
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

