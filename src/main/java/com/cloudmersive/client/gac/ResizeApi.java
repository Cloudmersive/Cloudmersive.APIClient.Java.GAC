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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:58.346-07:00[America/Los_Angeles]")
public class ResizeApi {
    private ApiClient apiClient;

    public ResizeApi() {
        this(new ApiClient());
    }

    public ResizeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Resize an image while preserving aspect ratio
    * Resize an image to a maximum width and maximum height, while preserving the image&#39;s original aspect ratio.  Resize is EXIF-aware.
    * <p><b>200</b> - OK
    * @param maxWidth Maximum width of the output image - final image will be as large as possible while less than or equial to this width
    * @param maxHeight Maximum height of the output image - final image will be as large as possible while less than or equial to this height
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] resizePost(Integer maxWidth, Integer maxHeight, File imageFile) throws IOException {
        HttpResponse response = resizePostForHttpResponse(maxWidth, maxHeight, imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Resize an image while preserving aspect ratio
    * Resize an image to a maximum width and maximum height, while preserving the image&#39;s original aspect ratio.  Resize is EXIF-aware.
    * <p><b>200</b> - OK
    * @param maxWidth Maximum width of the output image - final image will be as large as possible while less than or equial to this width
    * @param maxHeight Maximum height of the output image - final image will be as large as possible while less than or equial to this height
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] resizePost(Integer maxWidth, Integer maxHeight, File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = resizePostForHttpResponse(maxWidth, maxHeight, imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse resizePostForHttpResponse(Integer maxWidth, Integer maxHeight, File imageFile) throws IOException {
        // verify the required parameter 'maxWidth' is set
        if (maxWidth == null) {
            throw new IllegalArgumentException("Missing the required parameter 'maxWidth' when calling resizePost");
        }// verify the required parameter 'maxHeight' is set
        if (maxHeight == null) {
            throw new IllegalArgumentException("Missing the required parameter 'maxHeight' when calling resizePost");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling resizePost");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("maxWidth", maxWidth);
        uriVariables.put("maxHeight", maxHeight);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/resize/preserveAspectRatio/{maxWidth}/{maxHeight}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse resizePostForHttpResponse(Integer maxWidth, Integer maxHeight, File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'maxWidth' is set
        if (maxWidth == null) {
            throw new IllegalArgumentException("Missing the required parameter 'maxWidth' when calling resizePost");
        }// verify the required parameter 'maxHeight' is set
        if (maxHeight == null) {
            throw new IllegalArgumentException("Missing the required parameter 'maxHeight' when calling resizePost");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling resizePost");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("maxWidth", maxWidth);
        uriVariables.put("maxHeight", maxHeight);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/resize/preserveAspectRatio/{maxWidth}/{maxHeight}");

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

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Resize an image
    * Resize an image to a specific width and specific height.  Resize is EXIF-aware.
    * <p><b>200</b> - OK
    * @param width Width of the output image - final image will be exactly this width
    * @param height Height of the output image - final image will be exactly this height
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] resizeResizeSimple(Integer width, Integer height, File imageFile) throws IOException {
        HttpResponse response = resizeResizeSimpleForHttpResponse(width, height, imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Resize an image
    * Resize an image to a specific width and specific height.  Resize is EXIF-aware.
    * <p><b>200</b> - OK
    * @param width Width of the output image - final image will be exactly this width
    * @param height Height of the output image - final image will be exactly this height
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] resizeResizeSimple(Integer width, Integer height, File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = resizeResizeSimpleForHttpResponse(width, height, imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse resizeResizeSimpleForHttpResponse(Integer width, Integer height, File imageFile) throws IOException {
        // verify the required parameter 'width' is set
        if (width == null) {
            throw new IllegalArgumentException("Missing the required parameter 'width' when calling resizeResizeSimple");
        }// verify the required parameter 'height' is set
        if (height == null) {
            throw new IllegalArgumentException("Missing the required parameter 'height' when calling resizeResizeSimple");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling resizeResizeSimple");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("width", width);
        uriVariables.put("height", height);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/resize/target/{width}/{height}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse resizeResizeSimpleForHttpResponse(Integer width, Integer height, File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'width' is set
        if (width == null) {
            throw new IllegalArgumentException("Missing the required parameter 'width' when calling resizeResizeSimple");
        }// verify the required parameter 'height' is set
        if (height == null) {
            throw new IllegalArgumentException("Missing the required parameter 'height' when calling resizeResizeSimple");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling resizeResizeSimple");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("width", width);
        uriVariables.put("height", height);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/resize/target/{width}/{height}");

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

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
