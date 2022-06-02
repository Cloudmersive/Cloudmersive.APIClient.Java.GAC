package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.GetPageAngleResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:49.154-07:00[America/Los_Angeles]")
public class PreprocessingApi {
    private ApiClient apiClient;

    public PreprocessingApi() {
        this(new ApiClient());
    }

    public PreprocessingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Convert an image of text into a binarized (light and dark) view
    * Perform an adaptive binarization algorithm on the input image to prepare it for further OCR operations.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] preprocessingBinarize(File imageFile) throws IOException {
        HttpResponse response = preprocessingBinarizeForHttpResponse(imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert an image of text into a binarized (light and dark) view
    * Perform an adaptive binarization algorithm on the input image to prepare it for further OCR operations.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] preprocessingBinarize(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = preprocessingBinarizeForHttpResponse(imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse preprocessingBinarizeForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling preprocessingBinarize");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/preprocessing/image/binarize");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse preprocessingBinarizeForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling preprocessingBinarize");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/preprocessing/image/binarize");

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
    * Convert an image of text into a binary (light and dark) view with ML
    * Perform an advanced adaptive, Deep Learning-based binarization algorithm on the input image to prepare it for further OCR operations.  Provides enhanced accuracy than adaptive binarization.  Image will be upsampled to 300 DPI if it has a DPI below 300.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] preprocessingBinarizeAdvanced(File imageFile) throws IOException {
        HttpResponse response = preprocessingBinarizeAdvancedForHttpResponse(imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert an image of text into a binary (light and dark) view with ML
    * Perform an advanced adaptive, Deep Learning-based binarization algorithm on the input image to prepare it for further OCR operations.  Provides enhanced accuracy than adaptive binarization.  Image will be upsampled to 300 DPI if it has a DPI below 300.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] preprocessingBinarizeAdvanced(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = preprocessingBinarizeAdvancedForHttpResponse(imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse preprocessingBinarizeAdvancedForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling preprocessingBinarizeAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/preprocessing/image/binarize/advanced");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse preprocessingBinarizeAdvancedForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling preprocessingBinarizeAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/preprocessing/image/binarize/advanced");

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
    * Get the angle of the page / document / receipt
    * Analyzes a photo or image of a document and identifies the rotation angle of the page.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @return GetPageAngleResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetPageAngleResult preprocessingGetPageAngle(File imageFile) throws IOException {
        HttpResponse response = preprocessingGetPageAngleForHttpResponse(imageFile);
        TypeReference<GetPageAngleResult> typeRef = new TypeReference<GetPageAngleResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get the angle of the page / document / receipt
    * Analyzes a photo or image of a document and identifies the rotation angle of the page.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetPageAngleResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetPageAngleResult preprocessingGetPageAngle(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = preprocessingGetPageAngleForHttpResponse(imageFile, params);
        TypeReference<GetPageAngleResult> typeRef = new TypeReference<GetPageAngleResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse preprocessingGetPageAngleForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling preprocessingGetPageAngle");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/preprocessing/image/get-page-angle");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse preprocessingGetPageAngleForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling preprocessingGetPageAngle");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/preprocessing/image/get-page-angle");

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
    * Detect and unrotate a document image
    * Detect and unrotate an image of a document (e.g. that was scanned at an angle).  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] preprocessingUnrotate(File imageFile) throws IOException {
        HttpResponse response = preprocessingUnrotateForHttpResponse(imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect and unrotate a document image
    * Detect and unrotate an image of a document (e.g. that was scanned at an angle).  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] preprocessingUnrotate(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = preprocessingUnrotateForHttpResponse(imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse preprocessingUnrotateForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling preprocessingUnrotate");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/preprocessing/image/unrotate");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse preprocessingUnrotateForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling preprocessingUnrotate");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/preprocessing/image/unrotate");

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
    * Detect and unrotate a document image (advanced)
    * Detect and unrotate an image of a document (e.g. that was scanned at an angle) using deep learning.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] preprocessingUnrotateAdvanced(File imageFile) throws IOException {
        HttpResponse response = preprocessingUnrotateAdvancedForHttpResponse(imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect and unrotate a document image (advanced)
    * Detect and unrotate an image of a document (e.g. that was scanned at an angle) using deep learning.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] preprocessingUnrotateAdvanced(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = preprocessingUnrotateAdvancedForHttpResponse(imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse preprocessingUnrotateAdvancedForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling preprocessingUnrotateAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/preprocessing/image/unrotate/advanced");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse preprocessingUnrotateAdvancedForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling preprocessingUnrotateAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/preprocessing/image/unrotate/advanced");

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
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] preprocessingUnskew(File imageFile) throws IOException {
        HttpResponse response = preprocessingUnskewForHttpResponse(imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect and unskew a photo of a document
    * Detect and unskew a photo of a document (e.g. taken on a cell phone) into a perfectly square image.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] preprocessingUnskew(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = preprocessingUnskewForHttpResponse(imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse preprocessingUnskewForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling preprocessingUnskew");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/preprocessing/image/unskew");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse preprocessingUnskewForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling preprocessingUnskew");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/preprocessing/image/unskew");

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
