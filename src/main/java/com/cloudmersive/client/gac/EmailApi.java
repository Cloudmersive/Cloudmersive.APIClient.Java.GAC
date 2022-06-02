package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.AddressGetServersResponse;
import com.cloudmersive.client.gac.model.AddressVerifySyntaxOnlyResponse;
import com.cloudmersive.client.gac.model.FullEmailValidationResponse;

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
public class EmailApi {
    private ApiClient apiClient;

    public EmailApi() {
        this(new ApiClient());
    }

    public EmailApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Partially check whether an email address is valid
    * Validate an email address by identifying whether its parent domain has email servers defined.  This call is less limited than syntaxOnly but not as comprehensive as address/full.
    * <p><b>200</b> - OK
    * @param email Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes.
    * @return AddressGetServersResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AddressGetServersResponse emailAddressGetServers(String email) throws IOException {
        HttpResponse response = emailAddressGetServersForHttpResponse(email);
        TypeReference<AddressGetServersResponse> typeRef = new TypeReference<AddressGetServersResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Partially check whether an email address is valid
    * Validate an email address by identifying whether its parent domain has email servers defined.  This call is less limited than syntaxOnly but not as comprehensive as address/full.
    * <p><b>200</b> - OK
    * @param email Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AddressGetServersResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AddressGetServersResponse emailAddressGetServers(String email, Map<String, Object> params) throws IOException {
        HttpResponse response = emailAddressGetServersForHttpResponse(email, params);
        TypeReference<AddressGetServersResponse> typeRef = new TypeReference<AddressGetServersResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse emailAddressGetServersForHttpResponse(String email) throws IOException {
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new IllegalArgumentException("Missing the required parameter 'email' when calling emailAddressGetServers");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/email/address/servers");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(email);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse emailAddressGetServersForHttpResponse(java.io.InputStream email, String mediaType) throws IOException {
          // verify the required parameter 'email' is set
              if (email == null) {
              throw new IllegalArgumentException("Missing the required parameter 'email' when calling emailAddressGetServers");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/email/address/servers");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = email == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, email);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse emailAddressGetServersForHttpResponse(String email, Map<String, Object> params) throws IOException {
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new IllegalArgumentException("Missing the required parameter 'email' when calling emailAddressGetServers");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/email/address/servers");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(email);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Fully validate an email address
    * Performs a full validation of the email address.  Checks for syntactic correctness, identifies the mail server in question if any, and then contacts the email server to validate the existence of the account - without sending any emails.
    * <p><b>200</b> - OK
    * @param email Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes.
    * @return FullEmailValidationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FullEmailValidationResponse emailFullValidation(String email) throws IOException {
        HttpResponse response = emailFullValidationForHttpResponse(email);
        TypeReference<FullEmailValidationResponse> typeRef = new TypeReference<FullEmailValidationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Fully validate an email address
    * Performs a full validation of the email address.  Checks for syntactic correctness, identifies the mail server in question if any, and then contacts the email server to validate the existence of the account - without sending any emails.
    * <p><b>200</b> - OK
    * @param email Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FullEmailValidationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FullEmailValidationResponse emailFullValidation(String email, Map<String, Object> params) throws IOException {
        HttpResponse response = emailFullValidationForHttpResponse(email, params);
        TypeReference<FullEmailValidationResponse> typeRef = new TypeReference<FullEmailValidationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse emailFullValidationForHttpResponse(String email) throws IOException {
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new IllegalArgumentException("Missing the required parameter 'email' when calling emailFullValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/email/address/full");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(email);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse emailFullValidationForHttpResponse(java.io.InputStream email, String mediaType) throws IOException {
          // verify the required parameter 'email' is set
              if (email == null) {
              throw new IllegalArgumentException("Missing the required parameter 'email' when calling emailFullValidation");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/email/address/full");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = email == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, email);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse emailFullValidationForHttpResponse(String email, Map<String, Object> params) throws IOException {
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new IllegalArgumentException("Missing the required parameter 'email' when calling emailFullValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/email/address/full");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(email);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Validate email adddress for syntactic correctness only
    * Validate whether a given email address is syntactically correct via a limited local-only check.  Use the address/full API to do a full validation.
    * <p><b>200</b> - OK
    * @param value Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes.
    * @return AddressVerifySyntaxOnlyResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AddressVerifySyntaxOnlyResponse emailPost(String value) throws IOException {
        HttpResponse response = emailPostForHttpResponse(value);
        TypeReference<AddressVerifySyntaxOnlyResponse> typeRef = new TypeReference<AddressVerifySyntaxOnlyResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate email adddress for syntactic correctness only
    * Validate whether a given email address is syntactically correct via a limited local-only check.  Use the address/full API to do a full validation.
    * <p><b>200</b> - OK
    * @param value Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AddressVerifySyntaxOnlyResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AddressVerifySyntaxOnlyResponse emailPost(String value, Map<String, Object> params) throws IOException {
        HttpResponse response = emailPostForHttpResponse(value, params);
        TypeReference<AddressVerifySyntaxOnlyResponse> typeRef = new TypeReference<AddressVerifySyntaxOnlyResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse emailPostForHttpResponse(String value) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling emailPost");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/email/address/syntaxOnly");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse emailPostForHttpResponse(java.io.InputStream value, String mediaType) throws IOException {
          // verify the required parameter 'value' is set
              if (value == null) {
              throw new IllegalArgumentException("Missing the required parameter 'value' when calling emailPost");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/email/address/syntaxOnly");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = value == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, value);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse emailPostForHttpResponse(String value, Map<String, Object> params) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling emailPost");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/email/address/syntaxOnly");

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
