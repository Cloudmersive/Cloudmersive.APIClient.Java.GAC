package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.CreateHandwritingRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:58.346-07:00[America/Los_Angeles]")
public class TextGenerationApi {
    private ApiClient apiClient;

    public TextGenerationApi() {
        this(new ApiClient());
    }

    public TextGenerationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Create an image of handwriting in PNG format
    * Uses Deep Learning to generate realistic handwriting and returns the result as a PNG image
    * <p><b>200</b> - OK
    * @param request Draw text parameters
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object textGenerationCreateHandwritingPng(CreateHandwritingRequest request) throws IOException {
        HttpResponse response = textGenerationCreateHandwritingPngForHttpResponse(request);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create an image of handwriting in PNG format
    * Uses Deep Learning to generate realistic handwriting and returns the result as a PNG image
    * <p><b>200</b> - OK
    * @param request Draw text parameters
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object textGenerationCreateHandwritingPng(CreateHandwritingRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = textGenerationCreateHandwritingPngForHttpResponse(request, params);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse textGenerationCreateHandwritingPngForHttpResponse(CreateHandwritingRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling textGenerationCreateHandwritingPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/text/create/handwriting/png");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse textGenerationCreateHandwritingPngForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling textGenerationCreateHandwritingPng");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/text/create/handwriting/png");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse textGenerationCreateHandwritingPngForHttpResponse(CreateHandwritingRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling textGenerationCreateHandwritingPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/text/create/handwriting/png");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
