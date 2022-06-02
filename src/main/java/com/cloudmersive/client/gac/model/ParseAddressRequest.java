/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
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
 * Request to parse an address formatted as a string/free text into a structured address
 */
@ApiModel(description = "Request to parse an address formatted as a string/free text into a structured address")
@JsonPropertyOrder({
  ParseAddressRequest.JSON_PROPERTY_ADDRESS_STRING,
  ParseAddressRequest.JSON_PROPERTY_CAPITALIZATION_MODE
})
@JsonTypeName("ParseAddressRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:36.624-07:00[America/Los_Angeles]")
public class ParseAddressRequest {
  public static final String JSON_PROPERTY_ADDRESS_STRING = "AddressString";
  private String addressString;

  public static final String JSON_PROPERTY_CAPITALIZATION_MODE = "CapitalizationMode";
  private String capitalizationMode;


  public ParseAddressRequest addressString(String addressString) {
    
    this.addressString = addressString;
    return this;
  }

   /**
   * A mailing address or street address formatted as a single text string; this will be parsed into its components
   * @return addressString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A mailing address or street address formatted as a single text string; this will be parsed into its components")
  @JsonProperty(JSON_PROPERTY_ADDRESS_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressString() {
    return addressString;
  }


  public void setAddressString(String addressString) {
    this.addressString = addressString;
  }


  public ParseAddressRequest capitalizationMode(String capitalizationMode) {
    
    this.capitalizationMode = capitalizationMode;
    return this;
  }

   /**
   * Optional; indicates how the parsed output should be capitalized; default is Title Case; possible values are: \&quot;Uppercase\&quot; will set the capitalization to UPPER CASE; \&quot;Lowercase\&quot; will set the capitalization to lower case; \&quot;Titlecase\&quot; will set the capitalization to Title Case; and \&quot;Originalcase\&quot; will preserve the original casing as much as possible
   * @return capitalizationMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional; indicates how the parsed output should be capitalized; default is Title Case; possible values are: \"Uppercase\" will set the capitalization to UPPER CASE; \"Lowercase\" will set the capitalization to lower case; \"Titlecase\" will set the capitalization to Title Case; and \"Originalcase\" will preserve the original casing as much as possible")
  @JsonProperty(JSON_PROPERTY_CAPITALIZATION_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCapitalizationMode() {
    return capitalizationMode;
  }


  public void setCapitalizationMode(String capitalizationMode) {
    this.capitalizationMode = capitalizationMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParseAddressRequest parseAddressRequest = (ParseAddressRequest) o;
    return Objects.equals(this.addressString, parseAddressRequest.addressString) &&
        Objects.equals(this.capitalizationMode, parseAddressRequest.capitalizationMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressString, capitalizationMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseAddressRequest {\n");
    sb.append("    addressString: ").append(toIndentedString(addressString)).append("\n");
    sb.append("    capitalizationMode: ").append(toIndentedString(capitalizationMode)).append("\n");
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

