package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.DominantColorResult;
import java.io.File;
import com.cloudmersive.client.gac.model.ImageMetadata;

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
public class InfoApi {
    private ApiClient apiClient;

    public InfoApi() {
        this(new ApiClient());
    }

    public InfoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Returns the dominant colors of the image
    * Uses advanced image processing to extract the top 5 dominant colors in the image, returned in the order of dominance with the most-dominant color first.  These are the primary perceptual colors used in the image as perceived by a viewer.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return DominantColorResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DominantColorResult infoGetDominantColor(File imageFile) throws IOException {
        HttpResponse response = infoGetDominantColorForHttpResponse(imageFile);
        TypeReference<DominantColorResult> typeRef = new TypeReference<DominantColorResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns the dominant colors of the image
    * Uses advanced image processing to extract the top 5 dominant colors in the image, returned in the order of dominance with the most-dominant color first.  These are the primary perceptual colors used in the image as perceived by a viewer.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DominantColorResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DominantColorResult infoGetDominantColor(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = infoGetDominantColorForHttpResponse(imageFile, params);
        TypeReference<DominantColorResult> typeRef = new TypeReference<DominantColorResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse infoGetDominantColorForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling infoGetDominantColor");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/get-info/dominant-color");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse infoGetDominantColorForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling infoGetDominantColor");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/get-info/dominant-color");

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


  /**
    * Returns the image metadata including EXIF and resolution
    * Returns the metadata information on the image, including file type, EXIF (if available), and resolution.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return ImageMetadata
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImageMetadata infoGetMetadata(File imageFile) throws IOException {
        HttpResponse response = infoGetMetadataForHttpResponse(imageFile);
        TypeReference<ImageMetadata> typeRef = new TypeReference<ImageMetadata>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Returns the image metadata including EXIF and resolution
    * Returns the metadata information on the image, including file type, EXIF (if available), and resolution.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ImageMetadata
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImageMetadata infoGetMetadata(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = infoGetMetadataForHttpResponse(imageFile, params);
        TypeReference<ImageMetadata> typeRef = new TypeReference<ImageMetadata>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse infoGetMetadataForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling infoGetMetadata");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/get-info/metadata");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse infoGetMetadataForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling infoGetMetadata");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/get-info/metadata");

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
