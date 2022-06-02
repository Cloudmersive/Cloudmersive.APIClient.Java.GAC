package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.ViewerResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:05.444-07:00[America/Los_Angeles]")
public class ViewerToolsApi {
    private ApiClient apiClient;

    public ViewerToolsApi() {
        this(new ApiClient());
    }

    public ViewerToolsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Create a web-based viewer
    * Creates an HTML embed code for a simple web-based viewer of a document; supports Office document types and PDF.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param width Optional; width of the output viewer in pixels
    * @param height Optional; height of the output viewer in pixels
    * @return ViewerResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ViewerResponse viewerToolsCreateSimple(File inputFile, Integer width, Integer height) throws IOException {
        HttpResponse response = viewerToolsCreateSimpleForHttpResponse(inputFile, width, height);
        TypeReference<ViewerResponse> typeRef = new TypeReference<ViewerResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create a web-based viewer
    * Creates an HTML embed code for a simple web-based viewer of a document; supports Office document types and PDF.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ViewerResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ViewerResponse viewerToolsCreateSimple(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = viewerToolsCreateSimpleForHttpResponse(inputFile, params);
        TypeReference<ViewerResponse> typeRef = new TypeReference<ViewerResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse viewerToolsCreateSimpleForHttpResponse(File inputFile, Integer width, Integer height) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling viewerToolsCreateSimple");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/viewer/create/web/simple");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse viewerToolsCreateSimpleForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling viewerToolsCreateSimple");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/viewer/create/web/simple");

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
