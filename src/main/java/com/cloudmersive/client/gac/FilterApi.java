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
public class FilterApi {
    private ApiClient apiClient;

    public FilterApi() {
        this(new ApiClient());
    }

    public FilterApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Convert image to black-and-white grayscale
    * Remove color from the image by converting to a grayscale, black-and-white image
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] filterBlackAndWhite(File imageFile) throws IOException {
        HttpResponse response = filterBlackAndWhiteForHttpResponse(imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert image to black-and-white grayscale
    * Remove color from the image by converting to a grayscale, black-and-white image
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] filterBlackAndWhite(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = filterBlackAndWhiteForHttpResponse(imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse filterBlackAndWhiteForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling filterBlackAndWhite");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/filter/black-and-white");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse filterBlackAndWhiteForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling filterBlackAndWhite");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/filter/black-and-white");

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
    * Despeckle to remove point noise from the image
    * Remove point noise / despeckle the input image
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] filterDespeckle(File imageFile) throws IOException {
        HttpResponse response = filterDespeckleForHttpResponse(imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Despeckle to remove point noise from the image
    * Remove point noise / despeckle the input image
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] filterDespeckle(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = filterDespeckleForHttpResponse(imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse filterDespeckleForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling filterDespeckle");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/filter/despeckle");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse filterDespeckleForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling filterDespeckle");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/filter/despeckle");

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
    * Detect and highlight edges in an image
    * Perform an edge detection operation on the input image
    * <p><b>200</b> - OK
    * @param radius Radius in pixels of the edge detection operation; a larger radius will produce a greater effect
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] filterEdgeDetect(Integer radius, File imageFile) throws IOException {
        HttpResponse response = filterEdgeDetectForHttpResponse(radius, imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect and highlight edges in an image
    * Perform an edge detection operation on the input image
    * <p><b>200</b> - OK
    * @param radius Radius in pixels of the edge detection operation; a larger radius will produce a greater effect
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] filterEdgeDetect(Integer radius, File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = filterEdgeDetectForHttpResponse(radius, imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse filterEdgeDetectForHttpResponse(Integer radius, File imageFile) throws IOException {
        // verify the required parameter 'radius' is set
        if (radius == null) {
            throw new IllegalArgumentException("Missing the required parameter 'radius' when calling filterEdgeDetect");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling filterEdgeDetect");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radius", radius);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/filter/edge-detect/{radius}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse filterEdgeDetectForHttpResponse(Integer radius, File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'radius' is set
        if (radius == null) {
            throw new IllegalArgumentException("Missing the required parameter 'radius' when calling filterEdgeDetect");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling filterEdgeDetect");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radius", radius);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/filter/edge-detect/{radius}");

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
    * Emboss an image
    * Perform an emboss operation on the input image
    * <p><b>200</b> - OK
    * @param radius Radius in pixels of the emboss operation; a larger radius will produce a greater effect
    * @param sigma Sigma, or variance, of the emboss operation
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] filterEmboss(Integer radius, Integer sigma, File imageFile) throws IOException {
        HttpResponse response = filterEmbossForHttpResponse(radius, sigma, imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Emboss an image
    * Perform an emboss operation on the input image
    * <p><b>200</b> - OK
    * @param radius Radius in pixels of the emboss operation; a larger radius will produce a greater effect
    * @param sigma Sigma, or variance, of the emboss operation
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] filterEmboss(Integer radius, Integer sigma, File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = filterEmbossForHttpResponse(radius, sigma, imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse filterEmbossForHttpResponse(Integer radius, Integer sigma, File imageFile) throws IOException {
        // verify the required parameter 'radius' is set
        if (radius == null) {
            throw new IllegalArgumentException("Missing the required parameter 'radius' when calling filterEmboss");
        }// verify the required parameter 'sigma' is set
        if (sigma == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sigma' when calling filterEmboss");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling filterEmboss");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radius", radius);
        uriVariables.put("sigma", sigma);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/filter/emboss/{radius}/{sigma}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse filterEmbossForHttpResponse(Integer radius, Integer sigma, File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'radius' is set
        if (radius == null) {
            throw new IllegalArgumentException("Missing the required parameter 'radius' when calling filterEmboss");
        }// verify the required parameter 'sigma' is set
        if (sigma == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sigma' when calling filterEmboss");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling filterEmboss");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radius", radius);
        uriVariables.put("sigma", sigma);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/filter/emboss/{radius}/{sigma}");

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
    * Perform a guassian blur on the input image
    * Perform a gaussian blur on the input image
    * <p><b>200</b> - OK
    * @param radius Radius in pixels of the blur operation; a larger radius will produce a greater blur effect
    * @param sigma Sigma, or variance, of the gaussian blur operation
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] filterGaussianBlur(Integer radius, Integer sigma, File imageFile) throws IOException {
        HttpResponse response = filterGaussianBlurForHttpResponse(radius, sigma, imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Perform a guassian blur on the input image
    * Perform a gaussian blur on the input image
    * <p><b>200</b> - OK
    * @param radius Radius in pixels of the blur operation; a larger radius will produce a greater blur effect
    * @param sigma Sigma, or variance, of the gaussian blur operation
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] filterGaussianBlur(Integer radius, Integer sigma, File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = filterGaussianBlurForHttpResponse(radius, sigma, imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse filterGaussianBlurForHttpResponse(Integer radius, Integer sigma, File imageFile) throws IOException {
        // verify the required parameter 'radius' is set
        if (radius == null) {
            throw new IllegalArgumentException("Missing the required parameter 'radius' when calling filterGaussianBlur");
        }// verify the required parameter 'sigma' is set
        if (sigma == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sigma' when calling filterGaussianBlur");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling filterGaussianBlur");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radius", radius);
        uriVariables.put("sigma", sigma);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/filter/blur/guassian/{radius}/{sigma}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse filterGaussianBlurForHttpResponse(Integer radius, Integer sigma, File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'radius' is set
        if (radius == null) {
            throw new IllegalArgumentException("Missing the required parameter 'radius' when calling filterGaussianBlur");
        }// verify the required parameter 'sigma' is set
        if (sigma == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sigma' when calling filterGaussianBlur");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling filterGaussianBlur");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radius", radius);
        uriVariables.put("sigma", sigma);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/filter/blur/guassian/{radius}/{sigma}");

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
    * Perform a motion blur on the input image
    * Perform a motion blur on the input image at a specific angle
    * <p><b>200</b> - OK
    * @param radius Radius in pixels of the blur operation; a larger radius will produce a greater blur effect
    * @param sigma Sigma, or variance, of the motion blur operation
    * @param angle Angle of the motion blur in degrees
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] filterMotionBlur(Integer radius, Integer sigma, Integer angle, File imageFile) throws IOException {
        HttpResponse response = filterMotionBlurForHttpResponse(radius, sigma, angle, imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Perform a motion blur on the input image
    * Perform a motion blur on the input image at a specific angle
    * <p><b>200</b> - OK
    * @param radius Radius in pixels of the blur operation; a larger radius will produce a greater blur effect
    * @param sigma Sigma, or variance, of the motion blur operation
    * @param angle Angle of the motion blur in degrees
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] filterMotionBlur(Integer radius, Integer sigma, Integer angle, File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = filterMotionBlurForHttpResponse(radius, sigma, angle, imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse filterMotionBlurForHttpResponse(Integer radius, Integer sigma, Integer angle, File imageFile) throws IOException {
        // verify the required parameter 'radius' is set
        if (radius == null) {
            throw new IllegalArgumentException("Missing the required parameter 'radius' when calling filterMotionBlur");
        }// verify the required parameter 'sigma' is set
        if (sigma == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sigma' when calling filterMotionBlur");
        }// verify the required parameter 'angle' is set
        if (angle == null) {
            throw new IllegalArgumentException("Missing the required parameter 'angle' when calling filterMotionBlur");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling filterMotionBlur");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radius", radius);
        uriVariables.put("sigma", sigma);
        uriVariables.put("angle", angle);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/filter/blur/motion/{radius}/{sigma}/{angle}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse filterMotionBlurForHttpResponse(Integer radius, Integer sigma, Integer angle, File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'radius' is set
        if (radius == null) {
            throw new IllegalArgumentException("Missing the required parameter 'radius' when calling filterMotionBlur");
        }// verify the required parameter 'sigma' is set
        if (sigma == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sigma' when calling filterMotionBlur");
        }// verify the required parameter 'angle' is set
        if (angle == null) {
            throw new IllegalArgumentException("Missing the required parameter 'angle' when calling filterMotionBlur");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling filterMotionBlur");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radius", radius);
        uriVariables.put("sigma", sigma);
        uriVariables.put("angle", angle);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/filter/blur/motion/{radius}/{sigma}/{angle}");

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
    * Posterize the image by reducing distinct colors
    * Reduce the unique number of colors in the image to the specified level
    * <p><b>200</b> - OK
    * @param levels Number of unique colors to retain in the output image
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] filterPosterize(Integer levels, File imageFile) throws IOException {
        HttpResponse response = filterPosterizeForHttpResponse(levels, imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Posterize the image by reducing distinct colors
    * Reduce the unique number of colors in the image to the specified level
    * <p><b>200</b> - OK
    * @param levels Number of unique colors to retain in the output image
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] filterPosterize(Integer levels, File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = filterPosterizeForHttpResponse(levels, imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse filterPosterizeForHttpResponse(Integer levels, File imageFile) throws IOException {
        // verify the required parameter 'levels' is set
        if (levels == null) {
            throw new IllegalArgumentException("Missing the required parameter 'levels' when calling filterPosterize");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling filterPosterize");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/filter/posterize");
        if (levels != null) {
            String key = "levels";
            Object value = levels;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse filterPosterizeForHttpResponse(Integer levels, File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'levels' is set
        if (levels == null) {
            throw new IllegalArgumentException("Missing the required parameter 'levels' when calling filterPosterize");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling filterPosterize");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/filter/posterize");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'levels' to the map of query params
        allParams.put("levels", levels);

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
    * Swirl distort the image
    * Swirl distort the image by the specified number of degrees
    * <p><b>200</b> - OK
    * @param degrees Degrees of swirl
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] filterSwirl(Integer degrees, File imageFile) throws IOException {
        HttpResponse response = filterSwirlForHttpResponse(degrees, imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Swirl distort the image
    * Swirl distort the image by the specified number of degrees
    * <p><b>200</b> - OK
    * @param degrees Degrees of swirl
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] filterSwirl(Integer degrees, File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = filterSwirlForHttpResponse(degrees, imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse filterSwirlForHttpResponse(Integer degrees, File imageFile) throws IOException {
        // verify the required parameter 'degrees' is set
        if (degrees == null) {
            throw new IllegalArgumentException("Missing the required parameter 'degrees' when calling filterSwirl");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling filterSwirl");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/filter/swirl");
        if (degrees != null) {
            String key = "degrees";
            Object value = degrees;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse filterSwirlForHttpResponse(Integer degrees, File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'degrees' is set
        if (degrees == null) {
            throw new IllegalArgumentException("Missing the required parameter 'degrees' when calling filterSwirl");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling filterSwirl");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/filter/swirl");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'degrees' to the map of query params
        allParams.put("degrees", degrees);

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
