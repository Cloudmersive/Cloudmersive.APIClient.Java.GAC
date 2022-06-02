package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.PhoneNumberValidateRequest;
import com.cloudmersive.client.gac.model.PhoneNumberValidationResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.InputStreamContent;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.json.Json;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:36.624-07:00[America/Los_Angeles]")
public class PhoneNumberApi {
    private ApiClient apiClient;

    public PhoneNumberApi() {
        this(new ApiClient());
    }

    public PhoneNumberApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Validate phone number (basic)
    * Validate a phone number by analyzing the syntax
    * <p><b>200</b> - OK
    * @param value Phone number to validate in a PhoneNumberValidateRequest object.  Try a phone number such as \&quot;1.800.463.3339\&quot;, and either leave DefaultCountryCode blank or use \&quot;US\&quot;.
    * @return PhoneNumberValidationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PhoneNumberValidationResponse phoneNumberSyntaxOnly(PhoneNumberValidateRequest value) throws IOException {
        HttpResponse response = phoneNumberSyntaxOnlyForHttpResponse(value);
        TypeReference<PhoneNumberValidationResponse> typeRef = new TypeReference<PhoneNumberValidationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate phone number (basic)
    * Validate a phone number by analyzing the syntax
    * <p><b>200</b> - OK
    * @param value Phone number to validate in a PhoneNumberValidateRequest object.  Try a phone number such as \&quot;1.800.463.3339\&quot;, and either leave DefaultCountryCode blank or use \&quot;US\&quot;.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PhoneNumberValidationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PhoneNumberValidationResponse phoneNumberSyntaxOnly(PhoneNumberValidateRequest value, Map<String, Object> params) throws IOException {
        HttpResponse response = phoneNumberSyntaxOnlyForHttpResponse(value, params);
        TypeReference<PhoneNumberValidationResponse> typeRef = new TypeReference<PhoneNumberValidationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse phoneNumberSyntaxOnlyForHttpResponse(PhoneNumberValidateRequest value) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling phoneNumberSyntaxOnly");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/phonenumber/basic");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse phoneNumberSyntaxOnlyForHttpResponse(java.io.InputStream value, String mediaType) throws IOException {
          // verify the required parameter 'value' is set
              if (value == null) {
              throw new IllegalArgumentException("Missing the required parameter 'value' when calling phoneNumberSyntaxOnly");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/phonenumber/basic");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = value == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, value);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse phoneNumberSyntaxOnlyForHttpResponse(PhoneNumberValidateRequest value, Map<String, Object> params) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling phoneNumberSyntaxOnly");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/phonenumber/basic");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);

        for (Map.Entry<String, Object> entry: allParams.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (key != null && value != null) {
                if (value instanceof Collection) {
                    uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
                } else if (value instanceof Object[]) {
                    uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
                } else {
                    uriBuilder = uriBuilder.queryParam(key, value);
                }
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
