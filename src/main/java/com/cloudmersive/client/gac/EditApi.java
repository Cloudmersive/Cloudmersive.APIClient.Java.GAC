package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.DrawPolygonRequest;
import com.cloudmersive.client.gac.model.DrawRectangleRequest;
import com.cloudmersive.client.gac.model.DrawTextRequest;
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
public class EditApi {
    private ApiClient apiClient;

    public EditApi() {
        this(new ApiClient());
    }

    public EditApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Normalizes image rotation and removes EXIF rotation data
    * Automatically orients the input image based on EXIF information and then removes the EXIF information.  EXIF is an additional set of information stored in some images taken with cell phone cameras based on the orientation of the camera.  By normalizing rotation and removing EXIF data these images become much easier to process.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editAutoOrient(File imageFile) throws IOException {
        HttpResponse response = editAutoOrientForHttpResponse(imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Normalizes image rotation and removes EXIF rotation data
    * Automatically orients the input image based on EXIF information and then removes the EXIF information.  EXIF is an additional set of information stored in some images taken with cell phone cameras based on the orientation of the camera.  By normalizing rotation and removing EXIF data these images become much easier to process.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editAutoOrient(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editAutoOrientForHttpResponse(imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editAutoOrientForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editAutoOrient");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/auto-orient/remove-exif");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editAutoOrientForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editAutoOrient");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/auto-orient/remove-exif");

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
    * Composite two images together
    * Composites two input images together; a layered image onto a base image.  The first image you input is the base image.  The second image (the layered image) will be composited on top of this base image.  Supports PNG transparency.  To control padding you can include transparent pixels at the border(s) of your layered images as appropriate.
    * <p><b>200</b> - OK
    * @param location Location to composite the layered images; possible values are: \&quot;center\&quot;, \&quot;top-left\&quot;, \&quot;top-center\&quot;, \&quot;top-right\&quot;, \&quot;center-left\&quot;, \&quot;center-right\&quot;, \&quot;bottom-left\&quot;, \&quot;bottom-center\&quot;, \&quot;bottom-right\&quot;
    * @param baseImage Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param layeredImage Image to layer on top of the base image.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editCompositeBasic(String location, File baseImage, File layeredImage) throws IOException {
        HttpResponse response = editCompositeBasicForHttpResponse(location, baseImage, layeredImage);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Composite two images together
    * Composites two input images together; a layered image onto a base image.  The first image you input is the base image.  The second image (the layered image) will be composited on top of this base image.  Supports PNG transparency.  To control padding you can include transparent pixels at the border(s) of your layered images as appropriate.
    * <p><b>200</b> - OK
    * @param location Location to composite the layered images; possible values are: \&quot;center\&quot;, \&quot;top-left\&quot;, \&quot;top-center\&quot;, \&quot;top-right\&quot;, \&quot;center-left\&quot;, \&quot;center-right\&quot;, \&quot;bottom-left\&quot;, \&quot;bottom-center\&quot;, \&quot;bottom-right\&quot;
    * @param baseImage Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param layeredImage Image to layer on top of the base image.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editCompositeBasic(String location, File baseImage, File layeredImage, Map<String, Object> params) throws IOException {
        HttpResponse response = editCompositeBasicForHttpResponse(location, baseImage, layeredImage, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editCompositeBasicForHttpResponse(String location, File baseImage, File layeredImage) throws IOException {
        // verify the required parameter 'location' is set
        if (location == null) {
            throw new IllegalArgumentException("Missing the required parameter 'location' when calling editCompositeBasic");
        }// verify the required parameter 'baseImage' is set
        if (baseImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'baseImage' when calling editCompositeBasic");
        }// verify the required parameter 'layeredImage' is set
        if (layeredImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'layeredImage' when calling editCompositeBasic");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("location", location);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/composite/{location}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editCompositeBasicForHttpResponse(String location, File baseImage, File layeredImage, Map<String, Object> params) throws IOException {
        // verify the required parameter 'location' is set
        if (location == null) {
            throw new IllegalArgumentException("Missing the required parameter 'location' when calling editCompositeBasic");
        }// verify the required parameter 'baseImage' is set
        if (baseImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'baseImage' when calling editCompositeBasic");
        }// verify the required parameter 'layeredImage' is set
        if (layeredImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'layeredImage' when calling editCompositeBasic");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("location", location);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/composite/{location}");

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
    * Composite two images together precisely
    * Composites two input images together; a layered image onto a base image. Position is based on distance in pixels from each side.  The first image you input is the base image.  The second image (the layered image) will be composited on top of this base image.  Supports PNG transparency.  To control padding you can include transparent pixels at the border(s) of your layered images as appropriate.  Providing multiple parameters in a single axis (for example top and bottom) is not recommended, since only one of the parameters will be used per axis.
    * <p><b>200</b> - OK
    * @param baseImage Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param layeredImage Image to layer on top of the base image.
    * @param top Optional; Desired distance in pixels from the top of the base image to the top of the layered image.
    * @param bottom Optional; Desired distance in pixels from the bottom of the base image to the bottom of the layered image.
    * @param left Optional; Desired distance in pixels from the left side of the base image to the left side of the layered image.
    * @param right Optional; Desired distance in pixels from the right side of the base image to the right side of the layered image.
    * @param width Optional; Desired width of the layered image in pixels. Leave height empty or 0 to automatically scale the image proportionally.
    * @param height Optional; Desired height of the layered image in pixels. Leave width empty or 0 to automatically scale the image proportionally.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editCompositePrecise(File baseImage, File layeredImage, Integer top, Integer bottom, Integer left, Integer right, Integer width, Integer height) throws IOException {
        HttpResponse response = editCompositePreciseForHttpResponse(baseImage, layeredImage, top, bottom, left, right, width, height);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Composite two images together precisely
    * Composites two input images together; a layered image onto a base image. Position is based on distance in pixels from each side.  The first image you input is the base image.  The second image (the layered image) will be composited on top of this base image.  Supports PNG transparency.  To control padding you can include transparent pixels at the border(s) of your layered images as appropriate.  Providing multiple parameters in a single axis (for example top and bottom) is not recommended, since only one of the parameters will be used per axis.
    * <p><b>200</b> - OK
    * @param baseImage Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param layeredImage Image to layer on top of the base image.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editCompositePrecise(File baseImage, File layeredImage, Map<String, Object> params) throws IOException {
        HttpResponse response = editCompositePreciseForHttpResponse(baseImage, layeredImage, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editCompositePreciseForHttpResponse(File baseImage, File layeredImage, Integer top, Integer bottom, Integer left, Integer right, Integer width, Integer height) throws IOException {
        // verify the required parameter 'baseImage' is set
        if (baseImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'baseImage' when calling editCompositePrecise");
        }// verify the required parameter 'layeredImage' is set
        if (layeredImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'layeredImage' when calling editCompositePrecise");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/composite/precise");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editCompositePreciseForHttpResponse(File baseImage, File layeredImage, Map<String, Object> params) throws IOException {
        // verify the required parameter 'baseImage' is set
        if (baseImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'baseImage' when calling editCompositePrecise");
        }// verify the required parameter 'layeredImage' is set
        if (layeredImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'layeredImage' when calling editCompositePrecise");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/composite/precise");

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
    * Adaptively adjust the contrast of the image to be more appealing and easy to see
    * Uses Gamma to adjust the contrast adaptively the way the human eye sees the world.  Results significantly improve the viewability and visual appeal of the image.
    * <p><b>200</b> - OK
    * @param gamma Gamma value to adjust the contrast in the image.  Recommended value is 2.0.  Values between 0.0 and 1.0 will reduce contrast, while values above 1.0 will increase contrast.
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editContrastAdaptive(Double gamma, File imageFile) throws IOException {
        HttpResponse response = editContrastAdaptiveForHttpResponse(gamma, imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Adaptively adjust the contrast of the image to be more appealing and easy to see
    * Uses Gamma to adjust the contrast adaptively the way the human eye sees the world.  Results significantly improve the viewability and visual appeal of the image.
    * <p><b>200</b> - OK
    * @param gamma Gamma value to adjust the contrast in the image.  Recommended value is 2.0.  Values between 0.0 and 1.0 will reduce contrast, while values above 1.0 will increase contrast.
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editContrastAdaptive(Double gamma, File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editContrastAdaptiveForHttpResponse(gamma, imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editContrastAdaptiveForHttpResponse(Double gamma, File imageFile) throws IOException {
        // verify the required parameter 'gamma' is set
        if (gamma == null) {
            throw new IllegalArgumentException("Missing the required parameter 'gamma' when calling editContrastAdaptive");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editContrastAdaptive");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gamma", gamma);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/contrast/{gamma}/adaptive");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editContrastAdaptiveForHttpResponse(Double gamma, File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'gamma' is set
        if (gamma == null) {
            throw new IllegalArgumentException("Missing the required parameter 'gamma' when calling editContrastAdaptive");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editContrastAdaptive");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gamma", gamma);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/contrast/{gamma}/adaptive");

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
    * Crop an image to an circular area
    * Crop an image to a target circular area
    * <p><b>200</b> - OK
    * @param left The left edge of the circular crop area in pixels (X).
    * @param top The top edge of the circular crop area in pixels (Y).
    * @param radius The radius of the circular crop area in pixels.
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editCropCircle(Integer left, Integer top, Integer radius, File imageFile) throws IOException {
        HttpResponse response = editCropCircleForHttpResponse(left, top, radius, imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Crop an image to an circular area
    * Crop an image to a target circular area
    * <p><b>200</b> - OK
    * @param left The left edge of the circular crop area in pixels (X).
    * @param top The top edge of the circular crop area in pixels (Y).
    * @param radius The radius of the circular crop area in pixels.
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editCropCircle(Integer left, Integer top, Integer radius, File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editCropCircleForHttpResponse(left, top, radius, imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editCropCircleForHttpResponse(Integer left, Integer top, Integer radius, File imageFile) throws IOException {
        // verify the required parameter 'left' is set
        if (left == null) {
            throw new IllegalArgumentException("Missing the required parameter 'left' when calling editCropCircle");
        }// verify the required parameter 'top' is set
        if (top == null) {
            throw new IllegalArgumentException("Missing the required parameter 'top' when calling editCropCircle");
        }// verify the required parameter 'radius' is set
        if (radius == null) {
            throw new IllegalArgumentException("Missing the required parameter 'radius' when calling editCropCircle");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editCropCircle");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("left", left);
        uriVariables.put("top", top);
        uriVariables.put("radius", radius);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/crop/circle/{left}/{top}/{radius}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editCropCircleForHttpResponse(Integer left, Integer top, Integer radius, File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'left' is set
        if (left == null) {
            throw new IllegalArgumentException("Missing the required parameter 'left' when calling editCropCircle");
        }// verify the required parameter 'top' is set
        if (top == null) {
            throw new IllegalArgumentException("Missing the required parameter 'top' when calling editCropCircle");
        }// verify the required parameter 'radius' is set
        if (radius == null) {
            throw new IllegalArgumentException("Missing the required parameter 'radius' when calling editCropCircle");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editCropCircle");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("left", left);
        uriVariables.put("top", top);
        uriVariables.put("radius", radius);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/crop/circle/{left}/{top}/{radius}");

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
    * Crop an image to a rectangular area
    * Crop an image to a target rectangular area
    * <p><b>200</b> - OK
    * @param left The left edge of the rectangular crop area in pixels (X).
    * @param top The top edge of the rectangular crop area in pixels (Y).
    * @param width The width of the rectangular crop area in pixels.
    * @param height The height of the rectangular crop area in pixels.
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editCropRectangle(Integer left, Integer top, Integer width, Integer height, File imageFile) throws IOException {
        HttpResponse response = editCropRectangleForHttpResponse(left, top, width, height, imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Crop an image to a rectangular area
    * Crop an image to a target rectangular area
    * <p><b>200</b> - OK
    * @param left The left edge of the rectangular crop area in pixels (X).
    * @param top The top edge of the rectangular crop area in pixels (Y).
    * @param width The width of the rectangular crop area in pixels.
    * @param height The height of the rectangular crop area in pixels.
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editCropRectangle(Integer left, Integer top, Integer width, Integer height, File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editCropRectangleForHttpResponse(left, top, width, height, imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editCropRectangleForHttpResponse(Integer left, Integer top, Integer width, Integer height, File imageFile) throws IOException {
        // verify the required parameter 'left' is set
        if (left == null) {
            throw new IllegalArgumentException("Missing the required parameter 'left' when calling editCropRectangle");
        }// verify the required parameter 'top' is set
        if (top == null) {
            throw new IllegalArgumentException("Missing the required parameter 'top' when calling editCropRectangle");
        }// verify the required parameter 'width' is set
        if (width == null) {
            throw new IllegalArgumentException("Missing the required parameter 'width' when calling editCropRectangle");
        }// verify the required parameter 'height' is set
        if (height == null) {
            throw new IllegalArgumentException("Missing the required parameter 'height' when calling editCropRectangle");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editCropRectangle");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("left", left);
        uriVariables.put("top", top);
        uriVariables.put("width", width);
        uriVariables.put("height", height);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/crop/rectangle/{left}/{top}/{width}/{height}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editCropRectangleForHttpResponse(Integer left, Integer top, Integer width, Integer height, File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'left' is set
        if (left == null) {
            throw new IllegalArgumentException("Missing the required parameter 'left' when calling editCropRectangle");
        }// verify the required parameter 'top' is set
        if (top == null) {
            throw new IllegalArgumentException("Missing the required parameter 'top' when calling editCropRectangle");
        }// verify the required parameter 'width' is set
        if (width == null) {
            throw new IllegalArgumentException("Missing the required parameter 'width' when calling editCropRectangle");
        }// verify the required parameter 'height' is set
        if (height == null) {
            throw new IllegalArgumentException("Missing the required parameter 'height' when calling editCropRectangle");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editCropRectangle");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("left", left);
        uriVariables.put("top", top);
        uriVariables.put("width", width);
        uriVariables.put("height", height);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/crop/rectangle/{left}/{top}/{width}/{height}");

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
    * Draw a polygon onto an image
    * Draw one or more polygons, with customized visuals, onto an image
    * <p><b>200</b> - OK
    * @param request Polygon drawing request parameters
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDrawPolygon(DrawPolygonRequest request) throws IOException {
        HttpResponse response = editDrawPolygonForHttpResponse(request);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Draw a polygon onto an image
    * Draw one or more polygons, with customized visuals, onto an image
    * <p><b>200</b> - OK
    * @param request Polygon drawing request parameters
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDrawPolygon(DrawPolygonRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = editDrawPolygonForHttpResponse(request, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDrawPolygonForHttpResponse(DrawPolygonRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editDrawPolygon");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/draw/polygon");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDrawPolygonForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling editDrawPolygon");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/draw/polygon");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDrawPolygonForHttpResponse(DrawPolygonRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editDrawPolygon");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/draw/polygon");

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


  /**
    * Draw a rectangle onto an image
    * Draw one or more rectangles, with customized visuals, onto an image
    * <p><b>200</b> - OK
    * @param request Draw rectangle parameters
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDrawRectangle(DrawRectangleRequest request) throws IOException {
        HttpResponse response = editDrawRectangleForHttpResponse(request);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Draw a rectangle onto an image
    * Draw one or more rectangles, with customized visuals, onto an image
    * <p><b>200</b> - OK
    * @param request Draw rectangle parameters
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDrawRectangle(DrawRectangleRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = editDrawRectangleForHttpResponse(request, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDrawRectangleForHttpResponse(DrawRectangleRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editDrawRectangle");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/draw/rectangle");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDrawRectangleForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling editDrawRectangle");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/draw/rectangle");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDrawRectangleForHttpResponse(DrawRectangleRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editDrawRectangle");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/draw/rectangle");

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


  /**
    * Draw text onto an image
    * Draw one or more pieces of text, with customized visuals, onto an image
    * <p><b>200</b> - OK
    * @param request Draw text parameters
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDrawText(DrawTextRequest request) throws IOException {
        HttpResponse response = editDrawTextForHttpResponse(request);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Draw text onto an image
    * Draw one or more pieces of text, with customized visuals, onto an image
    * <p><b>200</b> - OK
    * @param request Draw text parameters
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDrawText(DrawTextRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = editDrawTextForHttpResponse(request, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDrawTextForHttpResponse(DrawTextRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editDrawText");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/draw/text");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDrawTextForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling editDrawText");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/draw/text");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDrawTextForHttpResponse(DrawTextRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editDrawText");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/draw/text");

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


  /**
    * Add a customizeable drop shadow to an image
    * Add a customizeable drop shadow to the image
    * <p><b>200</b> - OK
    * @param X Horizontal (X) offset of the drop shadow
    * @param Y Vertical (Y) offset of the drop shadow
    * @param sigma Sigma (blur distance) of the drop shadow
    * @param opacity Opacity of the drop shadow; 0 is 0% and 100 is 100%
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDropShadow(Integer X, Integer Y, Integer sigma, Integer opacity, File imageFile) throws IOException {
        HttpResponse response = editDropShadowForHttpResponse(X, Y, sigma, opacity, imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Add a customizeable drop shadow to an image
    * Add a customizeable drop shadow to the image
    * <p><b>200</b> - OK
    * @param X Horizontal (X) offset of the drop shadow
    * @param Y Vertical (Y) offset of the drop shadow
    * @param sigma Sigma (blur distance) of the drop shadow
    * @param opacity Opacity of the drop shadow; 0 is 0% and 100 is 100%
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDropShadow(Integer X, Integer Y, Integer sigma, Integer opacity, File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editDropShadowForHttpResponse(X, Y, sigma, opacity, imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDropShadowForHttpResponse(Integer X, Integer Y, Integer sigma, Integer opacity, File imageFile) throws IOException {
        // verify the required parameter 'X' is set
        if (X == null) {
            throw new IllegalArgumentException("Missing the required parameter 'X' when calling editDropShadow");
        }// verify the required parameter 'Y' is set
        if (Y == null) {
            throw new IllegalArgumentException("Missing the required parameter 'Y' when calling editDropShadow");
        }// verify the required parameter 'sigma' is set
        if (sigma == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sigma' when calling editDropShadow");
        }// verify the required parameter 'opacity' is set
        if (opacity == null) {
            throw new IllegalArgumentException("Missing the required parameter 'opacity' when calling editDropShadow");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editDropShadow");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("X", X);
        uriVariables.put("Y", Y);
        uriVariables.put("sigma", sigma);
        uriVariables.put("opacity", opacity);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/drop-shadow/{X}/{Y}/{sigma}/{opacity}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editDropShadowForHttpResponse(Integer X, Integer Y, Integer sigma, Integer opacity, File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'X' is set
        if (X == null) {
            throw new IllegalArgumentException("Missing the required parameter 'X' when calling editDropShadow");
        }// verify the required parameter 'Y' is set
        if (Y == null) {
            throw new IllegalArgumentException("Missing the required parameter 'Y' when calling editDropShadow");
        }// verify the required parameter 'sigma' is set
        if (sigma == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sigma' when calling editDropShadow");
        }// verify the required parameter 'opacity' is set
        if (opacity == null) {
            throw new IllegalArgumentException("Missing the required parameter 'opacity' when calling editDropShadow");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editDropShadow");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("X", X);
        uriVariables.put("Y", Y);
        uriVariables.put("sigma", sigma);
        uriVariables.put("opacity", opacity);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/drop-shadow/{X}/{Y}/{sigma}/{opacity}");

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
    * Invert, negate the colors in the image
    * Inverts (negates) all of the colors in the image.  If the image contains transparency, the transparency will first be removed prior to inverting the image.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editInvert(File imageFile) throws IOException {
        HttpResponse response = editInvertForHttpResponse(imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Invert, negate the colors in the image
    * Inverts (negates) all of the colors in the image.  If the image contains transparency, the transparency will first be removed prior to inverting the image.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editInvert(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editInvertForHttpResponse(imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editInvertForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editInvert");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/invert");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editInvertForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editInvert");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/invert");

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
    * Remove EXIF data from the image
    * Removes any EXIF data and profiles .
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editRemoveExifData(File imageFile) throws IOException {
        HttpResponse response = editRemoveExifDataForHttpResponse(imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Remove EXIF data from the image
    * Removes any EXIF data and profiles .
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editRemoveExifData(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editRemoveExifDataForHttpResponse(imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editRemoveExifDataForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editRemoveExifData");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/remove-exif");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editRemoveExifDataForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editRemoveExifData");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/remove-exif");

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
    * Remove transparency from the image
    * Removes any active transparency in the image.  Effectively renders the image at the same resolution, in the same file format, over a white background, thus removing transparency.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editRemoveTransparency(File imageFile) throws IOException {
        HttpResponse response = editRemoveTransparencyForHttpResponse(imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Remove transparency from the image
    * Removes any active transparency in the image.  Effectively renders the image at the same resolution, in the same file format, over a white background, thus removing transparency.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editRemoveTransparency(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editRemoveTransparencyForHttpResponse(imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editRemoveTransparencyForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editRemoveTransparency");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/remove-transparency");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editRemoveTransparencyForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editRemoveTransparency");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/remove-transparency");

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
    * Rotate an image any number of degrees
    * Rotates an image by an arbitrary number of degrees
    * <p><b>200</b> - OK
    * @param degrees Degrees to rotate the image; values range from 0.0 to 360.0.
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editRotate(Double degrees, File imageFile) throws IOException {
        HttpResponse response = editRotateForHttpResponse(degrees, imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Rotate an image any number of degrees
    * Rotates an image by an arbitrary number of degrees
    * <p><b>200</b> - OK
    * @param degrees Degrees to rotate the image; values range from 0.0 to 360.0.
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editRotate(Double degrees, File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editRotateForHttpResponse(degrees, imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editRotateForHttpResponse(Double degrees, File imageFile) throws IOException {
        // verify the required parameter 'degrees' is set
        if (degrees == null) {
            throw new IllegalArgumentException("Missing the required parameter 'degrees' when calling editRotate");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editRotate");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("degrees", degrees);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/rotate/{degrees}/angle");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editRotateForHttpResponse(Double degrees, File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'degrees' is set
        if (degrees == null) {
            throw new IllegalArgumentException("Missing the required parameter 'degrees' when calling editRotate");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling editRotate");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("degrees", degrees);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/edit/rotate/{degrees}/angle");

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
