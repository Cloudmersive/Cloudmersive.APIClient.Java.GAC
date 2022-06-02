package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.GetWordsRequest;
import com.cloudmersive.client.gac.model.GetWordsResponse;
import com.cloudmersive.client.gac.model.SentenceSegmentationRequest;
import com.cloudmersive.client.gac.model.SentenceSegmentationResponse;

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
public class SegmentationApi {
    private ApiClient apiClient;

    public SegmentationApi() {
        this(new ApiClient());
    }

    public SegmentationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Extract sentences from string
    * Segment an input string into separate sentences, output result as a string.
    * <p><b>200</b> - OK
    * @param input Input string
    * @return SentenceSegmentationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SentenceSegmentationResponse segmentationGetSentences(SentenceSegmentationRequest input) throws IOException {
        HttpResponse response = segmentationGetSentencesForHttpResponse(input);
        TypeReference<SentenceSegmentationResponse> typeRef = new TypeReference<SentenceSegmentationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Extract sentences from string
    * Segment an input string into separate sentences, output result as a string.
    * <p><b>200</b> - OK
    * @param input Input string
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SentenceSegmentationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SentenceSegmentationResponse segmentationGetSentences(SentenceSegmentationRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = segmentationGetSentencesForHttpResponse(input, params);
        TypeReference<SentenceSegmentationResponse> typeRef = new TypeReference<SentenceSegmentationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse segmentationGetSentencesForHttpResponse(SentenceSegmentationRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling segmentationGetSentences");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/segmentation/sentences");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse segmentationGetSentencesForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling segmentationGetSentences");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/segmentation/sentences");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse segmentationGetSentencesForHttpResponse(SentenceSegmentationRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling segmentationGetSentences");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/segmentation/sentences");

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
    * Get words in input string
    * Get the component words in an input string
    * <p><b>200</b> - OK
    * @param input String to process
    * @return GetWordsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetWordsResponse segmentationGetWords(GetWordsRequest input) throws IOException {
        HttpResponse response = segmentationGetWordsForHttpResponse(input);
        TypeReference<GetWordsResponse> typeRef = new TypeReference<GetWordsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get words in input string
    * Get the component words in an input string
    * <p><b>200</b> - OK
    * @param input String to process
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetWordsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetWordsResponse segmentationGetWords(GetWordsRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = segmentationGetWordsForHttpResponse(input, params);
        TypeReference<GetWordsResponse> typeRef = new TypeReference<GetWordsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse segmentationGetWordsForHttpResponse(GetWordsRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling segmentationGetWords");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/segmentation/words");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse segmentationGetWordsForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling segmentationGetWords");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/segmentation/words");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse segmentationGetWordsForHttpResponse(GetWordsRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling segmentationGetWords");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/segmentation/words");

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
