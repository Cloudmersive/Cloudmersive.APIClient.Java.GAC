package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.FirstNameValidationRequest;
import com.cloudmersive.client.gac.model.FirstNameValidationResponse;
import com.cloudmersive.client.gac.model.FullNameValidationRequest;
import com.cloudmersive.client.gac.model.FullNameValidationResponse;
import com.cloudmersive.client.gac.model.GetGenderRequest;
import com.cloudmersive.client.gac.model.GetGenderResponse;
import com.cloudmersive.client.gac.model.LastNameValidationRequest;
import com.cloudmersive.client.gac.model.LastNameValidationResponse;
import com.cloudmersive.client.gac.model.ValidateIdentifierRequest;
import com.cloudmersive.client.gac.model.ValidateIdentifierResponse;

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
public class NameApi {
    private ApiClient apiClient;

    public NameApi() {
        this(new ApiClient());
    }

    public NameApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Get the gender of a first name
    * Determines the gender of a first name (given name)
    * <p><b>200</b> - OK
    * @param input Gender request information
    * @return GetGenderResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetGenderResponse nameGetGender(GetGenderRequest input) throws IOException {
        HttpResponse response = nameGetGenderForHttpResponse(input);
        TypeReference<GetGenderResponse> typeRef = new TypeReference<GetGenderResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get the gender of a first name
    * Determines the gender of a first name (given name)
    * <p><b>200</b> - OK
    * @param input Gender request information
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetGenderResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetGenderResponse nameGetGender(GetGenderRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = nameGetGenderForHttpResponse(input, params);
        TypeReference<GetGenderResponse> typeRef = new TypeReference<GetGenderResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse nameGetGenderForHttpResponse(GetGenderRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling nameGetGender");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/name/get-gender");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse nameGetGenderForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling nameGetGender");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/name/get-gender");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse nameGetGenderForHttpResponse(GetGenderRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling nameGetGender");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/name/get-gender");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Validate a code identifier
    * Determines if the input name is a valid technical / code identifier.  Configure input rules such as whether whitespace, hyphens, underscores, etc. are allowed.  For example, a valid identifier might be \&quot;helloWorld\&quot; but not \&quot;hello*World\&quot;.
    * <p><b>200</b> - OK
    * @param input Identifier validation request information
    * @return ValidateIdentifierResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateIdentifierResponse nameIdentifier(ValidateIdentifierRequest input) throws IOException {
        HttpResponse response = nameIdentifierForHttpResponse(input);
        TypeReference<ValidateIdentifierResponse> typeRef = new TypeReference<ValidateIdentifierResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a code identifier
    * Determines if the input name is a valid technical / code identifier.  Configure input rules such as whether whitespace, hyphens, underscores, etc. are allowed.  For example, a valid identifier might be \&quot;helloWorld\&quot; but not \&quot;hello*World\&quot;.
    * <p><b>200</b> - OK
    * @param input Identifier validation request information
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ValidateIdentifierResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateIdentifierResponse nameIdentifier(ValidateIdentifierRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = nameIdentifierForHttpResponse(input, params);
        TypeReference<ValidateIdentifierResponse> typeRef = new TypeReference<ValidateIdentifierResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse nameIdentifierForHttpResponse(ValidateIdentifierRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling nameIdentifier");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/name/identifier");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse nameIdentifierForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling nameIdentifier");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/name/identifier");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse nameIdentifierForHttpResponse(ValidateIdentifierRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling nameIdentifier");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/name/identifier");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Validate a first name
    * Determines if a string is a valid first name (given name)
    * <p><b>200</b> - OK
    * @param input Validation request information
    * @return FirstNameValidationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FirstNameValidationResponse nameValidateFirstName(FirstNameValidationRequest input) throws IOException {
        HttpResponse response = nameValidateFirstNameForHttpResponse(input);
        TypeReference<FirstNameValidationResponse> typeRef = new TypeReference<FirstNameValidationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a first name
    * Determines if a string is a valid first name (given name)
    * <p><b>200</b> - OK
    * @param input Validation request information
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FirstNameValidationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FirstNameValidationResponse nameValidateFirstName(FirstNameValidationRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = nameValidateFirstNameForHttpResponse(input, params);
        TypeReference<FirstNameValidationResponse> typeRef = new TypeReference<FirstNameValidationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse nameValidateFirstNameForHttpResponse(FirstNameValidationRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling nameValidateFirstName");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/name/first");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse nameValidateFirstNameForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling nameValidateFirstName");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/name/first");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse nameValidateFirstNameForHttpResponse(FirstNameValidationRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling nameValidateFirstName");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/name/first");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Parse and validate a full name
    * Parses a full name string (e.g. \&quot;Mr. Jon van der Waal Jr.\&quot;) into its component parts (and returns these component parts), and then validates whether it is a valid name string or not
    * <p><b>200</b> - OK
    * @param input Validation request information
    * @return FullNameValidationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FullNameValidationResponse nameValidateFullName(FullNameValidationRequest input) throws IOException {
        HttpResponse response = nameValidateFullNameForHttpResponse(input);
        TypeReference<FullNameValidationResponse> typeRef = new TypeReference<FullNameValidationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Parse and validate a full name
    * Parses a full name string (e.g. \&quot;Mr. Jon van der Waal Jr.\&quot;) into its component parts (and returns these component parts), and then validates whether it is a valid name string or not
    * <p><b>200</b> - OK
    * @param input Validation request information
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FullNameValidationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FullNameValidationResponse nameValidateFullName(FullNameValidationRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = nameValidateFullNameForHttpResponse(input, params);
        TypeReference<FullNameValidationResponse> typeRef = new TypeReference<FullNameValidationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse nameValidateFullNameForHttpResponse(FullNameValidationRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling nameValidateFullName");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/name/full-name");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse nameValidateFullNameForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling nameValidateFullName");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/name/full-name");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse nameValidateFullNameForHttpResponse(FullNameValidationRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling nameValidateFullName");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/name/full-name");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Validate a last name
    * Determines if a string is a valid last name (surname)
    * <p><b>200</b> - OK
    * @param input Validation request information
    * @return LastNameValidationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LastNameValidationResponse nameValidateLastName(LastNameValidationRequest input) throws IOException {
        HttpResponse response = nameValidateLastNameForHttpResponse(input);
        TypeReference<LastNameValidationResponse> typeRef = new TypeReference<LastNameValidationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a last name
    * Determines if a string is a valid last name (surname)
    * <p><b>200</b> - OK
    * @param input Validation request information
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return LastNameValidationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LastNameValidationResponse nameValidateLastName(LastNameValidationRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = nameValidateLastNameForHttpResponse(input, params);
        TypeReference<LastNameValidationResponse> typeRef = new TypeReference<LastNameValidationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse nameValidateLastNameForHttpResponse(LastNameValidationRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling nameValidateLastName");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/name/last");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse nameValidateLastNameForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling nameValidateLastName");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/name/last");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse nameValidateLastNameForHttpResponse(LastNameValidationRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling nameValidateLastName");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/name/last");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
