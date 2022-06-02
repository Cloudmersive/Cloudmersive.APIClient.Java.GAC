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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Result of a partial email address validation
 */
@ApiModel(description = "Result of a partial email address validation")
@JsonPropertyOrder({
  AddressGetServersResponse.JSON_PROPERTY_SUCCESS,
  AddressGetServersResponse.JSON_PROPERTY_SERVERS
})
@JsonTypeName("AddressGetServersResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:36.624-07:00[America/Los_Angeles]")
public class AddressGetServersResponse {
  public static final String JSON_PROPERTY_SUCCESS = "Success";
  private Boolean success;

  public static final String JSON_PROPERTY_SERVERS = "Servers";
  private List<String> servers = null;


  public AddressGetServersResponse success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * True if partial address validation was successufl, false otherwise
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if partial address validation was successufl, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public AddressGetServersResponse servers(List<String> servers) {
    
    this.servers = servers;
    return this;
  }

  public AddressGetServersResponse addServersItem(String serversItem) {
    if (this.servers == null) {
      this.servers = new ArrayList<String>();
    }
    this.servers.add(serversItem);
    return this;
  }

   /**
   * Email servers for this email address
   * @return servers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email servers for this email address")
  @JsonProperty(JSON_PROPERTY_SERVERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getServers() {
    return servers;
  }


  public void setServers(List<String> servers) {
    this.servers = servers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressGetServersResponse addressGetServersResponse = (AddressGetServersResponse) o;
    return Objects.equals(this.success, addressGetServersResponse.success) &&
        Objects.equals(this.servers, addressGetServersResponse.servers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, servers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressGetServersResponse {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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

