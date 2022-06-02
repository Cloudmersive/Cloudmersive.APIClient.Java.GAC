package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.FindSymbolResult;
import com.cloudmersive.client.gac.model.FineTextDetectionResult;
import com.cloudmersive.client.gac.model.ImageDescriptionResponse;
import com.cloudmersive.client.gac.model.ImageSimilarityHashDistanceRequest;
import com.cloudmersive.client.gac.model.ImageSimilarityHashDistanceResponse;
import com.cloudmersive.client.gac.model.ImageSimilarityHashResponse;
import com.cloudmersive.client.gac.model.ObjectDetectionResult;
import com.cloudmersive.client.gac.model.TextDetectionResult;
import com.cloudmersive.client.gac.model.VehicleLicensePlateDetectionResult;

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
public class RecognizeApi {
    private ApiClient apiClient;

    public RecognizeApi() {
        this(new ApiClient());
    }

    public RecognizeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Describe an image in natural language
    * Generate an English language text description of the image as a sentence.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return ImageDescriptionResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImageDescriptionResponse recognizeDescribe(File imageFile) throws IOException {
        HttpResponse response = recognizeDescribeForHttpResponse(imageFile);
        TypeReference<ImageDescriptionResponse> typeRef = new TypeReference<ImageDescriptionResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Describe an image in natural language
    * Generate an English language text description of the image as a sentence.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ImageDescriptionResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImageDescriptionResponse recognizeDescribe(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = recognizeDescribeForHttpResponse(imageFile, params);
        TypeReference<ImageDescriptionResponse> typeRef = new TypeReference<ImageDescriptionResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse recognizeDescribeForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling recognizeDescribe");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/describe");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse recognizeDescribeForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling recognizeDescribe");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/describe");

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
    * Detect and unskew a photo of a document
    * Detect and unskew a photo of a document (e.g. taken on a cell phone) into a perfectly square image.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param postProcessingEffect Optional, post-processing effects to apply to the email, default is None.  Possible values are None and BlackAndWhite (force the image into a black and white view to aid in OCR operations).
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] recognizeDetectAndUnskewDocument(File imageFile, String postProcessingEffect) throws IOException {
        HttpResponse response = recognizeDetectAndUnskewDocumentForHttpResponse(imageFile, postProcessingEffect);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect and unskew a photo of a document
    * Detect and unskew a photo of a document (e.g. taken on a cell phone) into a perfectly square image.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] recognizeDetectAndUnskewDocument(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = recognizeDetectAndUnskewDocumentForHttpResponse(imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse recognizeDetectAndUnskewDocumentForHttpResponse(File imageFile, String postProcessingEffect) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling recognizeDetectAndUnskewDocument");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/detect-document/unskew");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse recognizeDetectAndUnskewDocumentForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling recognizeDetectAndUnskewDocument");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/detect-document/unskew");

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
    * Detect objects including types and locations in an image
    * Identify the position, size and description of objects in an image, along with a recognition confidence level.  Detects both human people and objects in an image.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return ObjectDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ObjectDetectionResult recognizeDetectObjects(File imageFile) throws IOException {
        HttpResponse response = recognizeDetectObjectsForHttpResponse(imageFile);
        TypeReference<ObjectDetectionResult> typeRef = new TypeReference<ObjectDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect objects including types and locations in an image
    * Identify the position, size and description of objects in an image, along with a recognition confidence level.  Detects both human people and objects in an image.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ObjectDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ObjectDetectionResult recognizeDetectObjects(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = recognizeDetectObjectsForHttpResponse(imageFile, params);
        TypeReference<ObjectDetectionResult> typeRef = new TypeReference<ObjectDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse recognizeDetectObjectsForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling recognizeDetectObjects");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/detect-objects");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse recognizeDetectObjectsForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling recognizeDetectObjects");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/detect-objects");

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
    * Detect people including locations in an image
    * Identify the position, and size of human people in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return ObjectDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ObjectDetectionResult recognizeDetectPeople(File imageFile) throws IOException {
        HttpResponse response = recognizeDetectPeopleForHttpResponse(imageFile);
        TypeReference<ObjectDetectionResult> typeRef = new TypeReference<ObjectDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect people including locations in an image
    * Identify the position, and size of human people in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ObjectDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ObjectDetectionResult recognizeDetectPeople(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = recognizeDetectPeopleForHttpResponse(imageFile, params);
        TypeReference<ObjectDetectionResult> typeRef = new TypeReference<ObjectDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse recognizeDetectPeopleForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling recognizeDetectPeople");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/detect-people");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse recognizeDetectPeopleForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling recognizeDetectPeople");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/detect-people");

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
    * Detect fine text in a photo of a document
    * Identify the position, and size of small/fine text within a photograph of a document.  Identify the location of small text in a photo - such as words and other forms of high density text.  Can be used on a scan of a document or a photograph (e.g. smartphone camera) of a document, page or receipt.  For OCR purposes - please see our Deep Learning OCR APIs.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return FineTextDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FineTextDetectionResult recognizeDetectTextFine(File imageFile) throws IOException {
        HttpResponse response = recognizeDetectTextFineForHttpResponse(imageFile);
        TypeReference<FineTextDetectionResult> typeRef = new TypeReference<FineTextDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect fine text in a photo of a document
    * Identify the position, and size of small/fine text within a photograph of a document.  Identify the location of small text in a photo - such as words and other forms of high density text.  Can be used on a scan of a document or a photograph (e.g. smartphone camera) of a document, page or receipt.  For OCR purposes - please see our Deep Learning OCR APIs.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FineTextDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FineTextDetectionResult recognizeDetectTextFine(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = recognizeDetectTextFineForHttpResponse(imageFile, params);
        TypeReference<FineTextDetectionResult> typeRef = new TypeReference<FineTextDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse recognizeDetectTextFineForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling recognizeDetectTextFine");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/detect-text/fine");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse recognizeDetectTextFineForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling recognizeDetectTextFine");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/detect-text/fine");

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
    * Detect large text in a photo
    * Identify the position, and size of large text within a photograph.  Identify the location of large text in a photo - such as signs, titles, etc. and other forms of large, low-density text.  Not suitable for high-density text (e.g. scans of documents, receipts, etc.) for OCR purposes - for OCR, please see our Deep Learning OCR APIs.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return TextDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextDetectionResult recognizeDetectTextLarge(File imageFile) throws IOException {
        HttpResponse response = recognizeDetectTextLargeForHttpResponse(imageFile);
        TypeReference<TextDetectionResult> typeRef = new TypeReference<TextDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect large text in a photo
    * Identify the position, and size of large text within a photograph.  Identify the location of large text in a photo - such as signs, titles, etc. and other forms of large, low-density text.  Not suitable for high-density text (e.g. scans of documents, receipts, etc.) for OCR purposes - for OCR, please see our Deep Learning OCR APIs.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TextDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextDetectionResult recognizeDetectTextLarge(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = recognizeDetectTextLargeForHttpResponse(imageFile, params);
        TypeReference<TextDetectionResult> typeRef = new TypeReference<TextDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse recognizeDetectTextLargeForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling recognizeDetectTextLarge");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/detect-text/large");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse recognizeDetectTextLargeForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling recognizeDetectTextLarge");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/detect-text/large");

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
    * Detect vehicle license plates in an image
    * Identify the position, and size, and content of vehicle license plates in an image.  License plates should be within 15-20 degrees on-axis to the camera.  Supported image formats are JPG, PNG and BMP.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return VehicleLicensePlateDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public VehicleLicensePlateDetectionResult recognizeDetectVehicleLicensePlates(File imageFile) throws IOException {
        HttpResponse response = recognizeDetectVehicleLicensePlatesForHttpResponse(imageFile);
        TypeReference<VehicleLicensePlateDetectionResult> typeRef = new TypeReference<VehicleLicensePlateDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect vehicle license plates in an image
    * Identify the position, and size, and content of vehicle license plates in an image.  License plates should be within 15-20 degrees on-axis to the camera.  Supported image formats are JPG, PNG and BMP.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return VehicleLicensePlateDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public VehicleLicensePlateDetectionResult recognizeDetectVehicleLicensePlates(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = recognizeDetectVehicleLicensePlatesForHttpResponse(imageFile, params);
        TypeReference<VehicleLicensePlateDetectionResult> typeRef = new TypeReference<VehicleLicensePlateDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse recognizeDetectVehicleLicensePlatesForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling recognizeDetectVehicleLicensePlates");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/detect-vehicle-license-plates");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse recognizeDetectVehicleLicensePlatesForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling recognizeDetectVehicleLicensePlates");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/detect-vehicle-license-plates");

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
    * Find the location of a symbol in an image
    * Determine if an image contains a symbol, and if so, the location of that symbol in the image.
    * <p><b>200</b> - OK
    * @param inputImage Image file to search through for the target image.
    * @param targetImage Image to find in the input image.
    * @return FindSymbolResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FindSymbolResult recognizeFindSymbol(File inputImage, File targetImage) throws IOException {
        HttpResponse response = recognizeFindSymbolForHttpResponse(inputImage, targetImage);
        TypeReference<FindSymbolResult> typeRef = new TypeReference<FindSymbolResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Find the location of a symbol in an image
    * Determine if an image contains a symbol, and if so, the location of that symbol in the image.
    * <p><b>200</b> - OK
    * @param inputImage Image file to search through for the target image.
    * @param targetImage Image to find in the input image.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FindSymbolResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FindSymbolResult recognizeFindSymbol(File inputImage, File targetImage, Map<String, Object> params) throws IOException {
        HttpResponse response = recognizeFindSymbolForHttpResponse(inputImage, targetImage, params);
        TypeReference<FindSymbolResult> typeRef = new TypeReference<FindSymbolResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse recognizeFindSymbolForHttpResponse(File inputImage, File targetImage) throws IOException {
        // verify the required parameter 'inputImage' is set
        if (inputImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputImage' when calling recognizeFindSymbol");
        }// verify the required parameter 'targetImage' is set
        if (targetImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'targetImage' when calling recognizeFindSymbol");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/find/symbol");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse recognizeFindSymbolForHttpResponse(File inputImage, File targetImage, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputImage' is set
        if (inputImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputImage' when calling recognizeFindSymbol");
        }// verify the required parameter 'targetImage' is set
        if (targetImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'targetImage' when calling recognizeFindSymbol");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/find/symbol");

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
    * Compare two images for similarity
    * Generates an image similarity score using Deep Learning between 0.0 and 1.0, values closer to 1.0 indicate greater similarity
    * <p><b>200</b> - OK
    * @param baseImage Image file to compare against.  Common file formats such as PNG, JPEG are supported.
    * @param comparisonImage Image to compare to the base image.
    * @param recognitionMode Optional, specify the recognition mode; possible values are Normal, Basic and Advanced.  Default is Normal.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] recognizeSimilarityCompare(File baseImage, File comparisonImage, String recognitionMode) throws IOException {
        HttpResponse response = recognizeSimilarityCompareForHttpResponse(baseImage, comparisonImage, recognitionMode);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Compare two images for similarity
    * Generates an image similarity score using Deep Learning between 0.0 and 1.0, values closer to 1.0 indicate greater similarity
    * <p><b>200</b> - OK
    * @param baseImage Image file to compare against.  Common file formats such as PNG, JPEG are supported.
    * @param comparisonImage Image to compare to the base image.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] recognizeSimilarityCompare(File baseImage, File comparisonImage, Map<String, Object> params) throws IOException {
        HttpResponse response = recognizeSimilarityCompareForHttpResponse(baseImage, comparisonImage, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse recognizeSimilarityCompareForHttpResponse(File baseImage, File comparisonImage, String recognitionMode) throws IOException {
        // verify the required parameter 'baseImage' is set
        if (baseImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'baseImage' when calling recognizeSimilarityCompare");
        }// verify the required parameter 'comparisonImage' is set
        if (comparisonImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'comparisonImage' when calling recognizeSimilarityCompare");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/similarity/compare");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse recognizeSimilarityCompareForHttpResponse(File baseImage, File comparisonImage, Map<String, Object> params) throws IOException {
        // verify the required parameter 'baseImage' is set
        if (baseImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'baseImage' when calling recognizeSimilarityCompare");
        }// verify the required parameter 'comparisonImage' is set
        if (comparisonImage == null) {
            throw new IllegalArgumentException("Missing the required parameter 'comparisonImage' when calling recognizeSimilarityCompare");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/similarity/compare");

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
    * Generate a perceptual image hash
    * Generates a hash value for the image; hash values that are closer together in terms of Hamming Distance are more similar.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param recognitionMode Optional, specify the recognition mode; possible values are Normal, Basic and Advanced.  Default is Normal.
    * @return ImageSimilarityHashResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImageSimilarityHashResponse recognizeSimilarityHash(File imageFile, String recognitionMode) throws IOException {
        HttpResponse response = recognizeSimilarityHashForHttpResponse(imageFile, recognitionMode);
        TypeReference<ImageSimilarityHashResponse> typeRef = new TypeReference<ImageSimilarityHashResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Generate a perceptual image hash
    * Generates a hash value for the image; hash values that are closer together in terms of Hamming Distance are more similar.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ImageSimilarityHashResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImageSimilarityHashResponse recognizeSimilarityHash(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = recognizeSimilarityHashForHttpResponse(imageFile, params);
        TypeReference<ImageSimilarityHashResponse> typeRef = new TypeReference<ImageSimilarityHashResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse recognizeSimilarityHashForHttpResponse(File imageFile, String recognitionMode) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling recognizeSimilarityHash");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/similarity/hash");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse recognizeSimilarityHashForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling recognizeSimilarityHash");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/similarity/hash");

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
    * Calculates the similarity between two perceptual image hashes
    * Calculates the similarity between two perceptual image hashes by computing the Hamming Distance between them.
    * <p><b>200</b> - OK
    * @param request The request parameter
    * @return ImageSimilarityHashDistanceResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImageSimilarityHashDistanceResponse recognizeSimilarityHashDistance(ImageSimilarityHashDistanceRequest request) throws IOException {
        HttpResponse response = recognizeSimilarityHashDistanceForHttpResponse(request);
        TypeReference<ImageSimilarityHashDistanceResponse> typeRef = new TypeReference<ImageSimilarityHashDistanceResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Calculates the similarity between two perceptual image hashes
    * Calculates the similarity between two perceptual image hashes by computing the Hamming Distance between them.
    * <p><b>200</b> - OK
    * @param request The request parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ImageSimilarityHashDistanceResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImageSimilarityHashDistanceResponse recognizeSimilarityHashDistance(ImageSimilarityHashDistanceRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = recognizeSimilarityHashDistanceForHttpResponse(request, params);
        TypeReference<ImageSimilarityHashDistanceResponse> typeRef = new TypeReference<ImageSimilarityHashDistanceResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse recognizeSimilarityHashDistanceForHttpResponse(ImageSimilarityHashDistanceRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling recognizeSimilarityHashDistance");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/similarity/hash/distance");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse recognizeSimilarityHashDistanceForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling recognizeSimilarityHashDistance");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/similarity/hash/distance");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse recognizeSimilarityHashDistanceForHttpResponse(ImageSimilarityHashDistanceRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling recognizeSimilarityHashDistance");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/recognize/similarity/hash/distance");

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
