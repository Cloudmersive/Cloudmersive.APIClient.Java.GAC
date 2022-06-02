package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.CheckSentenceRequest;
import com.cloudmersive.client.gac.model.CheckSentenceResponse;
import com.cloudmersive.client.gac.model.CheckWordRequest;
import com.cloudmersive.client.gac.model.CheckWordResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:42.991-07:00[America/Los_Angeles]")
public class SpellcheckApi {
    private ApiClient apiClient;

    public SpellcheckApi() {
        this(new ApiClient());
    }

    public SpellcheckApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Check if sentence is spelled correctly
    * Checks whether the sentence is spelled correctly and returns the result as JSON
    * <p><b>200</b> - OK
    * @param value Input sentence
    * @return CheckSentenceResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CheckSentenceResponse spellcheckCheckSentence(CheckSentenceRequest value) throws IOException {
        HttpResponse response = spellcheckCheckSentenceForHttpResponse(value);
        TypeReference<CheckSentenceResponse> typeRef = new TypeReference<CheckSentenceResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Check if sentence is spelled correctly
    * Checks whether the sentence is spelled correctly and returns the result as JSON
    * <p><b>200</b> - OK
    * @param value Input sentence
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CheckSentenceResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CheckSentenceResponse spellcheckCheckSentence(CheckSentenceRequest value, Map<String, Object> params) throws IOException {
        HttpResponse response = spellcheckCheckSentenceForHttpResponse(value, params);
        TypeReference<CheckSentenceResponse> typeRef = new TypeReference<CheckSentenceResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse spellcheckCheckSentenceForHttpResponse(CheckSentenceRequest value) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling spellcheckCheckSentence");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/spellcheck/check/sentence");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse spellcheckCheckSentenceForHttpResponse(java.io.InputStream value, String mediaType) throws IOException {
          // verify the required parameter 'value' is set
              if (value == null) {
              throw new IllegalArgumentException("Missing the required parameter 'value' when calling spellcheckCheckSentence");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/spellcheck/check/sentence");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = value == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, value);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse spellcheckCheckSentenceForHttpResponse(CheckSentenceRequest value, Map<String, Object> params) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling spellcheckCheckSentence");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/spellcheck/check/sentence");

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


  /**
    * Find spelling corrections
    * Find spelling correction suggestions and return result as JSON
    * <p><b>200</b> - OK
    * @param value Input string
    * @return CheckWordResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CheckWordResponse spellcheckCorrectJson(CheckWordRequest value) throws IOException {
        HttpResponse response = spellcheckCorrectJsonForHttpResponse(value);
        TypeReference<CheckWordResponse> typeRef = new TypeReference<CheckWordResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Find spelling corrections
    * Find spelling correction suggestions and return result as JSON
    * <p><b>200</b> - OK
    * @param value Input string
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CheckWordResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CheckWordResponse spellcheckCorrectJson(CheckWordRequest value, Map<String, Object> params) throws IOException {
        HttpResponse response = spellcheckCorrectJsonForHttpResponse(value, params);
        TypeReference<CheckWordResponse> typeRef = new TypeReference<CheckWordResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse spellcheckCorrectJsonForHttpResponse(CheckWordRequest value) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling spellcheckCorrectJson");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/spellcheck/check/word");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse spellcheckCorrectJsonForHttpResponse(java.io.InputStream value, String mediaType) throws IOException {
          // verify the required parameter 'value' is set
              if (value == null) {
              throw new IllegalArgumentException("Missing the required parameter 'value' when calling spellcheckCorrectJson");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/spellcheck/check/word");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = value == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, value);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse spellcheckCorrectJsonForHttpResponse(CheckWordRequest value, Map<String, Object> params) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling spellcheckCorrectJson");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/spellcheck/check/word");

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
