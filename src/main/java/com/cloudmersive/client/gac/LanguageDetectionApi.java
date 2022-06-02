package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.LanguageDetectionRequest;
import com.cloudmersive.client.gac.model.LanguageDetectionResponse;

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
public class LanguageDetectionApi {
    private ApiClient apiClient;

    public LanguageDetectionApi() {
        this(new ApiClient());
    }

    public LanguageDetectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Detect language of text
    * Automatically determine which language a text string is written in.  Supports Danish (DAN), German (DEU), English (ENG), French (FRA), Italian (ITA), Japanese (JPN), Korean (KOR), Dutch (NLD), Norwegian (NOR), Portuguese (POR), Russian (RUS), Spanish (SPA), Swedish (SWE), Chinese (ZHO).
    * <p><b>200</b> - OK
    * @param input The input parameter
    * @return LanguageDetectionResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LanguageDetectionResponse languageDetectionGetLanguage(LanguageDetectionRequest input) throws IOException {
        HttpResponse response = languageDetectionGetLanguageForHttpResponse(input);
        TypeReference<LanguageDetectionResponse> typeRef = new TypeReference<LanguageDetectionResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect language of text
    * Automatically determine which language a text string is written in.  Supports Danish (DAN), German (DEU), English (ENG), French (FRA), Italian (ITA), Japanese (JPN), Korean (KOR), Dutch (NLD), Norwegian (NOR), Portuguese (POR), Russian (RUS), Spanish (SPA), Swedish (SWE), Chinese (ZHO).
    * <p><b>200</b> - OK
    * @param input The input parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return LanguageDetectionResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LanguageDetectionResponse languageDetectionGetLanguage(LanguageDetectionRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = languageDetectionGetLanguageForHttpResponse(input, params);
        TypeReference<LanguageDetectionResponse> typeRef = new TypeReference<LanguageDetectionResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse languageDetectionGetLanguageForHttpResponse(LanguageDetectionRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageDetectionGetLanguage");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/language/detect");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse languageDetectionGetLanguageForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageDetectionGetLanguage");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/language/detect");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse languageDetectionGetLanguageForHttpResponse(LanguageDetectionRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageDetectionGetLanguage");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/language/detect");

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
