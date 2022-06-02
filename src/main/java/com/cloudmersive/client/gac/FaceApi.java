package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.AgeDetectionResult;
import com.cloudmersive.client.gac.model.FaceCompareResponse;
import com.cloudmersive.client.gac.model.FaceLocateResponse;
import com.cloudmersive.client.gac.model.FaceLocateWithLandmarksResponse;
import java.io.File;
import com.cloudmersive.client.gac.model.GenderDetectionResult;

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
public class FaceApi {
    private ApiClient apiClient;

    public FaceApi() {
        this(new ApiClient());
    }

    public FaceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Compare and match faces
    * Find the faces in an input image, and compare against a reference image to determine if there is a match against the face in the reference image.  The reference image (second parameter) should contain exactly one face.
    * <p><b>200</b> - OK
    * @param inputImage Image file to perform the operation on; this image can contain one or more faces which will be matched against face provided in the second image.  Common file formats such as PNG, JPEG are supported.
    * @param matchFace Image of a single face to compare and match against.
    * @return FaceCompareResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FaceCompareResponse faceCompare(File inputImage, File matchFace) throws IOException {
        HttpResponse response = faceCompareForHttpResponse(inputImage, matchFace);
        TypeReference<FaceCompareResponse> typeRef = new TypeReference<FaceCompareResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Compare and match faces
    * Find the faces in an input image, and compare against a reference image to determine if there is a match against the face in the reference image.  The reference image (second parameter) should contain exactly one face.
    * <p><b>200</b> - OK
    * @param inputImage Image file to perform the operation on; this image can contain one or more faces which will be matched against face provided in the second image.  Common file formats such as PNG, JPEG are supported.
    * @param matchFace Image of a single face to compare and match against.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FaceCompareResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FaceCompareResponse faceCompare(File inputImage, File matchFace, Map<String, Object> params) throws IOException {
        HttpResponse response = faceCompareForHttpResponse(inputImage, matchFace, params);
        TypeReference<FaceCompareResponse> typeRef = new TypeReference<FaceCompareResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse faceCompareForHttpResponse(File inputImage, File matchFace) throws IOException {
        // verify the required parameter 'inputImage' is set
        if (inputImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputImage' when calling faceCompare");
        }// verify the required parameter 'matchFace' is set
        if (matchFace == null) {
            throw new IllegalArgumentException("Missing the required parameter 'matchFace' when calling faceCompare");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/face/compare-and-match");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse faceCompareForHttpResponse(File inputImage, File matchFace, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputImage' is set
        if (inputImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputImage' when calling faceCompare");
        }// verify the required parameter 'matchFace' is set
        if (matchFace == null) {
            throw new IllegalArgumentException("Missing the required parameter 'matchFace' when calling faceCompare");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/face/compare-and-match");

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
    * Crop image to face with square crop
    * Crop an image to the face (rectangular crop).  If there is more than one face present, choose the first one.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] faceCropFirst(File imageFile) throws IOException {
        HttpResponse response = faceCropFirstForHttpResponse(imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Crop image to face with square crop
    * Crop an image to the face (rectangular crop).  If there is more than one face present, choose the first one.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] faceCropFirst(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = faceCropFirstForHttpResponse(imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse faceCropFirstForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling faceCropFirst");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/face/crop/first");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse faceCropFirstForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling faceCropFirst");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/face/crop/first");

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
    * Crop image to face with round crop
    * Crop an image to the face (circular/round crop).  If there is more than one face present, choose the first one.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] faceCropFirstRound(File imageFile) throws IOException {
        HttpResponse response = faceCropFirstRoundForHttpResponse(imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Crop image to face with round crop
    * Crop an image to the face (circular/round crop).  If there is more than one face present, choose the first one.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] faceCropFirstRound(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = faceCropFirstRoundForHttpResponse(imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse faceCropFirstRoundForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling faceCropFirstRound");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/face/crop/first/round");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse faceCropFirstRoundForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling faceCropFirstRound");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/face/crop/first/round");

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
    * Detect the age of people in an image
    * Identify the age, position, and size of human faces in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return AgeDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AgeDetectionResult faceDetectAge(File imageFile) throws IOException {
        HttpResponse response = faceDetectAgeForHttpResponse(imageFile);
        TypeReference<AgeDetectionResult> typeRef = new TypeReference<AgeDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect the age of people in an image
    * Identify the age, position, and size of human faces in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AgeDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AgeDetectionResult faceDetectAge(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = faceDetectAgeForHttpResponse(imageFile, params);
        TypeReference<AgeDetectionResult> typeRef = new TypeReference<AgeDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse faceDetectAgeForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling faceDetectAge");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/face/detect-age");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse faceDetectAgeForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling faceDetectAge");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/face/detect-age");

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
    * Detect the gender of people in an image
    * Identify the gender, position, and size of human faces in an image, along with a recognition confidence level.  People in the image should be facing the camera.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return GenderDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GenderDetectionResult faceDetectGender(File imageFile) throws IOException {
        HttpResponse response = faceDetectGenderForHttpResponse(imageFile);
        TypeReference<GenderDetectionResult> typeRef = new TypeReference<GenderDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect the gender of people in an image
    * Identify the gender, position, and size of human faces in an image, along with a recognition confidence level.  People in the image should be facing the camera.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GenderDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GenderDetectionResult faceDetectGender(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = faceDetectGenderForHttpResponse(imageFile, params);
        TypeReference<GenderDetectionResult> typeRef = new TypeReference<GenderDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse faceDetectGenderForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling faceDetectGender");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/face/detect-gender");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse faceDetectGenderForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling faceDetectGender");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/face/detect-gender");

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
    * Detect and find faces in an image
    * Locate the positions of all faces in an image
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return FaceLocateResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FaceLocateResponse faceLocate(File imageFile) throws IOException {
        HttpResponse response = faceLocateForHttpResponse(imageFile);
        TypeReference<FaceLocateResponse> typeRef = new TypeReference<FaceLocateResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect and find faces in an image
    * Locate the positions of all faces in an image
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FaceLocateResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FaceLocateResponse faceLocate(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = faceLocateForHttpResponse(imageFile, params);
        TypeReference<FaceLocateResponse> typeRef = new TypeReference<FaceLocateResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse faceLocateForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling faceLocate");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/face/locate");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse faceLocateForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling faceLocate");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/face/locate");

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
    * Detect and find faces and landmarks eyes and nose and mouth in image
    * Locate the positions of all faces in an image, along with the eyes, eye brows, nose and mouth components of each
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return FaceLocateWithLandmarksResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FaceLocateWithLandmarksResponse faceLocateWithLandmarks(File imageFile) throws IOException {
        HttpResponse response = faceLocateWithLandmarksForHttpResponse(imageFile);
        TypeReference<FaceLocateWithLandmarksResponse> typeRef = new TypeReference<FaceLocateWithLandmarksResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect and find faces and landmarks eyes and nose and mouth in image
    * Locate the positions of all faces in an image, along with the eyes, eye brows, nose and mouth components of each
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FaceLocateWithLandmarksResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FaceLocateWithLandmarksResponse faceLocateWithLandmarks(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = faceLocateWithLandmarksForHttpResponse(imageFile, params);
        TypeReference<FaceLocateWithLandmarksResponse> typeRef = new TypeReference<FaceLocateWithLandmarksResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse faceLocateWithLandmarksForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling faceLocateWithLandmarks");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/face/locate-with-landmarks");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse faceLocateWithLandmarksForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling faceLocateWithLandmarks");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/face/locate-with-landmarks");

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
