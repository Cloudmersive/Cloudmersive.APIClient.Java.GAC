package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;

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
public class CompareDocumentApi {
    private ApiClient apiClient;

    public CompareDocumentApi() {
        this(new ApiClient());
    }

    public CompareDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Compare Two Word DOCX
    * Compare two Office Word Documents (docx) files and highlight the differences
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] compareDocumentDocx(File inputFile1, File inputFile2) throws IOException {
        HttpResponse response = compareDocumentDocxForHttpResponse(inputFile1, inputFile2);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Compare Two Word DOCX
    * Compare two Office Word Documents (docx) files and highlight the differences
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] compareDocumentDocx(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        HttpResponse response = compareDocumentDocxForHttpResponse(inputFile1, inputFile2, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse compareDocumentDocxForHttpResponse(File inputFile1, File inputFile2) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling compareDocumentDocx");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling compareDocumentDocx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/compare/docx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse compareDocumentDocxForHttpResponse(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling compareDocumentDocx");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling compareDocumentDocx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/compare/docx");

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
