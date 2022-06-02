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
 * Field definition and value in the form
 */
@ApiModel(description = "Field definition and value in the form")
@JsonPropertyOrder({
  PdfFormField.JSON_PROPERTY_FIELD_NAME,
  PdfFormField.JSON_PROPERTY_FIELD_TYPE,
  PdfFormField.JSON_PROPERTY_FIELD_VALUE,
  PdfFormField.JSON_PROPERTY_FIELD_COMBO_BOX_SELECTED_INDEX
})
@JsonTypeName("PdfFormField")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:05.444-07:00[America/Los_Angeles]")
public class PdfFormField {
  public static final String JSON_PROPERTY_FIELD_NAME = "FieldName";
  private String fieldName;

  public static final String JSON_PROPERTY_FIELD_TYPE = "FieldType";
  private String fieldType;

  public static final String JSON_PROPERTY_FIELD_VALUE = "FieldValue";
  private String fieldValue;

  public static final String JSON_PROPERTY_FIELD_COMBO_BOX_SELECTED_INDEX = "FieldComboBoxSelectedIndex";
  private Integer fieldComboBoxSelectedIndex;


  public PdfFormField fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Name of the form field
   * @return fieldName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the form field")
  @JsonProperty(JSON_PROPERTY_FIELD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldName() {
    return fieldName;
  }


  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public PdfFormField fieldType(String fieldType) {
    
    this.fieldType = fieldType;
    return this;
  }

   /**
   * The data type of the field; possible values are Text (FieldValue will be a string), Checkbox (FieldValue can be \&quot;true\&quot; or \&quot;false\&quot;), ComboBox (FieldComboBoxSelectedIndex will also be populated), Other
   * @return fieldType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The data type of the field; possible values are Text (FieldValue will be a string), Checkbox (FieldValue can be \"true\" or \"false\"), ComboBox (FieldComboBoxSelectedIndex will also be populated), Other")
  @JsonProperty(JSON_PROPERTY_FIELD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldType() {
    return fieldType;
  }


  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }


  public PdfFormField fieldValue(String fieldValue) {
    
    this.fieldValue = fieldValue;
    return this;
  }

   /**
   * Value of the form field
   * @return fieldValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value of the form field")
  @JsonProperty(JSON_PROPERTY_FIELD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldValue() {
    return fieldValue;
  }


  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }


  public PdfFormField fieldComboBoxSelectedIndex(Integer fieldComboBoxSelectedIndex) {
    
    this.fieldComboBoxSelectedIndex = fieldComboBoxSelectedIndex;
    return this;
  }

   /**
   * Applies to ComboBox field types only; specifies the selected index of the combo box selection if available
   * @return fieldComboBoxSelectedIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Applies to ComboBox field types only; specifies the selected index of the combo box selection if available")
  @JsonProperty(JSON_PROPERTY_FIELD_COMBO_BOX_SELECTED_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFieldComboBoxSelectedIndex() {
    return fieldComboBoxSelectedIndex;
  }


  public void setFieldComboBoxSelectedIndex(Integer fieldComboBoxSelectedIndex) {
    this.fieldComboBoxSelectedIndex = fieldComboBoxSelectedIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfFormField pdfFormField = (PdfFormField) o;
    return Objects.equals(this.fieldName, pdfFormField.fieldName) &&
        Objects.equals(this.fieldType, pdfFormField.fieldType) &&
        Objects.equals(this.fieldValue, pdfFormField.fieldValue) &&
        Objects.equals(this.fieldComboBoxSelectedIndex, pdfFormField.fieldComboBoxSelectedIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, fieldType, fieldValue, fieldComboBoxSelectedIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfFormField {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
    sb.append("    fieldComboBoxSelectedIndex: ").append(toIndentedString(fieldComboBoxSelectedIndex)).append("\n");
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

