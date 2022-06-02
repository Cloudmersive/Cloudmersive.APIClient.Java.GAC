/*
 * barcodeapi
 * Barcode APIs let you generate barcode images, and recognize values from images of barcodes.
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
 * Matching product for the input barcode
 */
@ApiModel(description = "Matching product for the input barcode")
@JsonPropertyOrder({
  ProductMatch.JSON_PROPERTY_E_A_N,
  ProductMatch.JSON_PROPERTY_TITLE
})
@JsonTypeName("ProductMatch")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:53.849-07:00[America/Los_Angeles]")
public class ProductMatch {
  public static final String JSON_PROPERTY_E_A_N = "EAN";
  private String EAN;

  public static final String JSON_PROPERTY_TITLE = "Title";
  private String title;


  public ProductMatch EAN(String EAN) {
    
    this.EAN = EAN;
    return this;
  }

   /**
   * EAN code for the product
   * @return EAN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EAN code for the product")
  @JsonProperty(JSON_PROPERTY_E_A_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEAN() {
    return EAN;
  }


  public void setEAN(String EAN) {
    this.EAN = EAN;
  }


  public ProductMatch title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of the product
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of the product")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductMatch productMatch = (ProductMatch) o;
    return Objects.equals(this.EAN, productMatch.EAN) &&
        Objects.equals(this.title, productMatch.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(EAN, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductMatch {\n");
    sb.append("    EAN: ").append(toIndentedString(EAN)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

