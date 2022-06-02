package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.NsfwResult;

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
public class NsfwApi {
    private ApiClient apiClient;

    public NsfwApi() {
        this(new ApiClient());
    }

    public NsfwApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Not safe for work NSFW racy content classification
    * Classify an image into Not Safe For Work (NSFW)/Porn/Racy content and Safe Content.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return NsfwResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public NsfwResult nsfwClassify(File imageFile) throws IOException {
        HttpResponse response = nsfwClassifyForHttpResponse(imageFile);
        TypeReference<NsfwResult> typeRef = new TypeReference<NsfwResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Not safe for work NSFW racy content classification
    * Classify an image into Not Safe For Work (NSFW)/Porn/Racy content and Safe Content.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return NsfwResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public NsfwResult nsfwClassify(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = nsfwClassifyForHttpResponse(imageFile, params);
        TypeReference<NsfwResult> typeRef = new TypeReference<NsfwResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse nsfwClassifyForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling nsfwClassify");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/nsfw/classify");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse nsfwClassifyForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling nsfwClassify");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/nsfw/classify");

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

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
