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
 * Result of performing a replace node operation on XML input using XPath
 */
@ApiModel(description = "Result of performing a replace node operation on XML input using XPath")
@JsonPropertyOrder({
  XmlReplaceWithXPathResult.JSON_PROPERTY_SUCCESSFUL,
  XmlReplaceWithXPathResult.JSON_PROPERTY_RESULTING_XML_DOCUMENT,
  XmlReplaceWithXPathResult.JSON_PROPERTY_NODES_EDITED_COUNT
})
@JsonTypeName("XmlReplaceWithXPathResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:05.444-07:00[America/Los_Angeles]")
public class XmlReplaceWithXPathResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_RESULTING_XML_DOCUMENT = "ResultingXmlDocument";
  private String resultingXmlDocument;

  public static final String JSON_PROPERTY_NODES_EDITED_COUNT = "NodesEditedCount";
  private Integer nodesEditedCount;


  public XmlReplaceWithXPathResult successful(Boolean successful) {
    
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


  public XmlReplaceWithXPathResult resultingXmlDocument(String resultingXmlDocument) {
    
    this.resultingXmlDocument = resultingXmlDocument;
    return this;
  }

   /**
   * Resulting, modified XML document
   * @return resultingXmlDocument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resulting, modified XML document")
  @JsonProperty(JSON_PROPERTY_RESULTING_XML_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResultingXmlDocument() {
    return resultingXmlDocument;
  }


  public void setResultingXmlDocument(String resultingXmlDocument) {
    this.resultingXmlDocument = resultingXmlDocument;
  }


  public XmlReplaceWithXPathResult nodesEditedCount(Integer nodesEditedCount) {
    
    this.nodesEditedCount = nodesEditedCount;
    return this;
  }

   /**
   * Count of the matching results
   * @return nodesEditedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of the matching results")
  @JsonProperty(JSON_PROPERTY_NODES_EDITED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNodesEditedCount() {
    return nodesEditedCount;
  }


  public void setNodesEditedCount(Integer nodesEditedCount) {
    this.nodesEditedCount = nodesEditedCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlReplaceWithXPathResult xmlReplaceWithXPathResult = (XmlReplaceWithXPathResult) o;
    return Objects.equals(this.successful, xmlReplaceWithXPathResult.successful) &&
        Objects.equals(this.resultingXmlDocument, xmlReplaceWithXPathResult.resultingXmlDocument) &&
        Objects.equals(this.nodesEditedCount, xmlReplaceWithXPathResult.nodesEditedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, resultingXmlDocument, nodesEditedCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlReplaceWithXPathResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    resultingXmlDocument: ").append(toIndentedString(resultingXmlDocument)).append("\n");
    sb.append("    nodesEditedCount: ").append(toIndentedString(nodesEditedCount)).append("\n");
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

