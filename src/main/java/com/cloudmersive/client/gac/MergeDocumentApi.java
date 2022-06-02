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
public class MergeDocumentApi {
    private ApiClient apiClient;

    public MergeDocumentApi() {
        this(new ApiClient());
    }

    public MergeDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Merge Two Word DOCX Together
    * Combine two Office Word Documents (docx) into one single Office Word document
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentDocx(File inputFile1, File inputFile2) throws IOException {
        HttpResponse response = mergeDocumentDocxForHttpResponse(inputFile1, inputFile2);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Merge Two Word DOCX Together
    * Combine two Office Word Documents (docx) into one single Office Word document
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentDocx(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        HttpResponse response = mergeDocumentDocxForHttpResponse(inputFile1, inputFile2, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse mergeDocumentDocxForHttpResponse(File inputFile1, File inputFile2) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentDocx");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentDocx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/docx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse mergeDocumentDocxForHttpResponse(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentDocx");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentDocx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/docx");

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
    * Merge Multple Word DOCX Together
    * Combine multiple Office Word Documents (docx) into one single Office Word document
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on.
    * @param inputFile3 Third input file to perform the operation on.
    * @param inputFile4 Fourth input file to perform the operation on.
    * @param inputFile5 Fifth input file to perform the operation on.
    * @param inputFile6 Sixth input file to perform the operation on.
    * @param inputFile7 Seventh input file to perform the operation on.
    * @param inputFile8 Eighth input file to perform the operation on.
    * @param inputFile9 Ninth input file to perform the operation on.
    * @param inputFile10 Tenth input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentDocxMulti(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        HttpResponse response = mergeDocumentDocxMultiForHttpResponse(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Merge Multple Word DOCX Together
    * Combine multiple Office Word Documents (docx) into one single Office Word document
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentDocxMulti(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        HttpResponse response = mergeDocumentDocxMultiForHttpResponse(inputFile1, inputFile2, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse mergeDocumentDocxMultiForHttpResponse(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentDocxMulti");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentDocxMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/docx/multi");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse mergeDocumentDocxMultiForHttpResponse(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentDocxMulti");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentDocxMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/docx/multi");

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
    * Merge Two HTML (HTM) Files Together
    * Combine two HTML (.HTM) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.  The title will be taken from the first document.
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentHtml(File inputFile1, File inputFile2) throws IOException {
        HttpResponse response = mergeDocumentHtmlForHttpResponse(inputFile1, inputFile2);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Merge Two HTML (HTM) Files Together
    * Combine two HTML (.HTM) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.  The title will be taken from the first document.
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentHtml(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        HttpResponse response = mergeDocumentHtmlForHttpResponse(inputFile1, inputFile2, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse mergeDocumentHtmlForHttpResponse(File inputFile1, File inputFile2) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentHtml");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentHtml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/html");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse mergeDocumentHtmlForHttpResponse(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentHtml");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentHtml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/html");

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
    * Merge Multple HTML (HTM) Files Together
    * Combine multiple HTML (.HTM) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.  The title will be taken from the first document.
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on.
    * @param inputFile3 Third input file to perform the operation on.
    * @param inputFile4 Fourth input file to perform the operation on.
    * @param inputFile5 Fifth input file to perform the operation on.
    * @param inputFile6 Sixth input file to perform the operation on.
    * @param inputFile7 Seventh input file to perform the operation on.
    * @param inputFile8 Eighth input file to perform the operation on.
    * @param inputFile9 Ninth input file to perform the operation on.
    * @param inputFile10 Tenth input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentHtmlMulti(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        HttpResponse response = mergeDocumentHtmlMultiForHttpResponse(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Merge Multple HTML (HTM) Files Together
    * Combine multiple HTML (.HTM) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.  The title will be taken from the first document.
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentHtmlMulti(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        HttpResponse response = mergeDocumentHtmlMultiForHttpResponse(inputFile1, inputFile2, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse mergeDocumentHtmlMultiForHttpResponse(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentHtmlMulti");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentHtmlMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/html/multi");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse mergeDocumentHtmlMultiForHttpResponse(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentHtmlMulti");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentHtmlMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/html/multi");

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
    * Merge Two PDF Files Together
    * Combine two PDF files (pdf) into a single PDF document, preserving the order of the input documents in the combined document
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentPdf(File inputFile1, File inputFile2) throws IOException {
        HttpResponse response = mergeDocumentPdfForHttpResponse(inputFile1, inputFile2);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Merge Two PDF Files Together
    * Combine two PDF files (pdf) into a single PDF document, preserving the order of the input documents in the combined document
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentPdf(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        HttpResponse response = mergeDocumentPdfForHttpResponse(inputFile1, inputFile2, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse mergeDocumentPdfForHttpResponse(File inputFile1, File inputFile2) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentPdf");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse mergeDocumentPdfForHttpResponse(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentPdf");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/pdf");

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
    * Merge Multple PDF Files Together
    * Combine multiple PDF files (pdf) into a single PDF document, preserving the order of the input documents in the combined document
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on.
    * @param inputFile3 Third input file to perform the operation on.
    * @param inputFile4 Fourth input file to perform the operation on.
    * @param inputFile5 Fifth input file to perform the operation on.
    * @param inputFile6 Sixth input file to perform the operation on.
    * @param inputFile7 Seventh input file to perform the operation on.
    * @param inputFile8 Eighth input file to perform the operation on.
    * @param inputFile9 Ninth input file to perform the operation on.
    * @param inputFile10 Tenth input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentPdfMulti(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        HttpResponse response = mergeDocumentPdfMultiForHttpResponse(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Merge Multple PDF Files Together
    * Combine multiple PDF files (pdf) into a single PDF document, preserving the order of the input documents in the combined document
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentPdfMulti(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        HttpResponse response = mergeDocumentPdfMultiForHttpResponse(inputFile1, inputFile2, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse mergeDocumentPdfMultiForHttpResponse(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentPdfMulti");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentPdfMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/pdf/multi");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse mergeDocumentPdfMultiForHttpResponse(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentPdfMulti");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentPdfMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/pdf/multi");

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
    * Merge Two PNG Files Together
    * Combine two PNG files into a single PNG document, preserving the order of the input documents in the combined document by stacking them vertically
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentPng(File inputFile1, File inputFile2) throws IOException {
        HttpResponse response = mergeDocumentPngForHttpResponse(inputFile1, inputFile2);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Merge Two PNG Files Together
    * Combine two PNG files into a single PNG document, preserving the order of the input documents in the combined document by stacking them vertically
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentPng(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        HttpResponse response = mergeDocumentPngForHttpResponse(inputFile1, inputFile2, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse mergeDocumentPngForHttpResponse(File inputFile1, File inputFile2) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentPng");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/png/vertical");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse mergeDocumentPngForHttpResponse(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentPng");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/png/vertical");

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
    * Merge Multple PNG Files Together
    * Combine multiple PNG files into a single PNG document, preserving the order of the input documents in the combined document by stacking them vertically
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on.
    * @param inputFile3 Third input file to perform the operation on.
    * @param inputFile4 Fourth input file to perform the operation on.
    * @param inputFile5 Fifth input file to perform the operation on.
    * @param inputFile6 Sixth input file to perform the operation on.
    * @param inputFile7 Seventh input file to perform the operation on.
    * @param inputFile8 Eighth input file to perform the operation on.
    * @param inputFile9 Ninth input file to perform the operation on.
    * @param inputFile10 Tenth input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentPngMulti(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        HttpResponse response = mergeDocumentPngMultiForHttpResponse(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Merge Multple PNG Files Together
    * Combine multiple PNG files into a single PNG document, preserving the order of the input documents in the combined document by stacking them vertically
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentPngMulti(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        HttpResponse response = mergeDocumentPngMultiForHttpResponse(inputFile1, inputFile2, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse mergeDocumentPngMultiForHttpResponse(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentPngMulti");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentPngMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/png/vertical/multi");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse mergeDocumentPngMultiForHttpResponse(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentPngMulti");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentPngMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/png/vertical/multi");

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
    * Merge Two PowerPoint PPTX Together
    * Combine two Office PowerPoint presentations (pptx) into one single Office PowerPoint presentation
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentPptx(File inputFile1, File inputFile2) throws IOException {
        HttpResponse response = mergeDocumentPptxForHttpResponse(inputFile1, inputFile2);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Merge Two PowerPoint PPTX Together
    * Combine two Office PowerPoint presentations (pptx) into one single Office PowerPoint presentation
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentPptx(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        HttpResponse response = mergeDocumentPptxForHttpResponse(inputFile1, inputFile2, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse mergeDocumentPptxForHttpResponse(File inputFile1, File inputFile2) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentPptx");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentPptx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/pptx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse mergeDocumentPptxForHttpResponse(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentPptx");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentPptx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/pptx");

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
    * Merge Multple PowerPoint PPTX Together
    * Combine multiple Office PowerPoint presentations (pptx) into one single Office PowerPoint presentation
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on.
    * @param inputFile3 Third input file to perform the operation on.
    * @param inputFile4 Fourth input file to perform the operation on.
    * @param inputFile5 Fifth input file to perform the operation on.
    * @param inputFile6 Sixth input file to perform the operation on.
    * @param inputFile7 Seventh input file to perform the operation on.
    * @param inputFile8 Eighth input file to perform the operation on.
    * @param inputFile9 Ninth input file to perform the operation on.
    * @param inputFile10 Tenth input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentPptxMulti(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        HttpResponse response = mergeDocumentPptxMultiForHttpResponse(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Merge Multple PowerPoint PPTX Together
    * Combine multiple Office PowerPoint presentations (pptx) into one single Office PowerPoint presentation
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentPptxMulti(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        HttpResponse response = mergeDocumentPptxMultiForHttpResponse(inputFile1, inputFile2, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse mergeDocumentPptxMultiForHttpResponse(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentPptxMulti");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentPptxMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/pptx/multi");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse mergeDocumentPptxMultiForHttpResponse(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentPptxMulti");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentPptxMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/pptx/multi");

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
    * Merge Two Text (TXT) Files Together
    * Combine two Text (.TXT) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object mergeDocumentTxt(File inputFile1, File inputFile2) throws IOException {
        HttpResponse response = mergeDocumentTxtForHttpResponse(inputFile1, inputFile2);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Merge Two Text (TXT) Files Together
    * Combine two Text (.TXT) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object mergeDocumentTxt(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        HttpResponse response = mergeDocumentTxtForHttpResponse(inputFile1, inputFile2, params);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse mergeDocumentTxtForHttpResponse(File inputFile1, File inputFile2) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentTxt");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentTxt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/txt");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse mergeDocumentTxtForHttpResponse(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentTxt");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentTxt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/txt");

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
    * Merge Multple Text (TXT) Files Together
    * Combine multiple Text (.TXT) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on.
    * @param inputFile3 Third input file to perform the operation on.
    * @param inputFile4 Fourth input file to perform the operation on.
    * @param inputFile5 Fifth input file to perform the operation on.
    * @param inputFile6 Sixth input file to perform the operation on.
    * @param inputFile7 Seventh input file to perform the operation on.
    * @param inputFile8 Eighth input file to perform the operation on.
    * @param inputFile9 Ninth input file to perform the operation on.
    * @param inputFile10 Tenth input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentTxtMulti(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        HttpResponse response = mergeDocumentTxtMultiForHttpResponse(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Merge Multple Text (TXT) Files Together
    * Combine multiple Text (.TXT) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentTxtMulti(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        HttpResponse response = mergeDocumentTxtMultiForHttpResponse(inputFile1, inputFile2, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse mergeDocumentTxtMultiForHttpResponse(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentTxtMulti");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentTxtMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/txt/multi");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse mergeDocumentTxtMultiForHttpResponse(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentTxtMulti");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentTxtMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/txt/multi");

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
    * Merge Two Excel XLSX Together
    * Combine two Office Excel spreadsheets (xlsx) into a single Office Excel spreadsheet
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentXlsx(File inputFile1, File inputFile2) throws IOException {
        HttpResponse response = mergeDocumentXlsxForHttpResponse(inputFile1, inputFile2);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Merge Two Excel XLSX Together
    * Combine two Office Excel spreadsheets (xlsx) into a single Office Excel spreadsheet
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentXlsx(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        HttpResponse response = mergeDocumentXlsxForHttpResponse(inputFile1, inputFile2, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse mergeDocumentXlsxForHttpResponse(File inputFile1, File inputFile2) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentXlsx");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentXlsx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/xlsx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse mergeDocumentXlsxForHttpResponse(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentXlsx");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentXlsx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/xlsx");

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
    * Merge Multple Excel XLSX Together
    * Combine multiple Office Excel spreadsheets (xlsx) into a single Office Excel spreadsheet
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on.
    * @param inputFile3 Third input file to perform the operation on.
    * @param inputFile4 Fourth input file to perform the operation on.
    * @param inputFile5 Fifth input file to perform the operation on.
    * @param inputFile6 Sixth input file to perform the operation on.
    * @param inputFile7 Seventh input file to perform the operation on.
    * @param inputFile8 Eighth input file to perform the operation on.
    * @param inputFile9 Ninth input file to perform the operation on.
    * @param inputFile10 Tenth input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentXlsxMulti(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        HttpResponse response = mergeDocumentXlsxMultiForHttpResponse(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Merge Multple Excel XLSX Together
    * Combine multiple Office Excel spreadsheets (xlsx) into a single Office Excel spreadsheet
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] mergeDocumentXlsxMulti(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        HttpResponse response = mergeDocumentXlsxMultiForHttpResponse(inputFile1, inputFile2, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse mergeDocumentXlsxMultiForHttpResponse(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentXlsxMulti");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentXlsxMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/xlsx/multi");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse mergeDocumentXlsxMultiForHttpResponse(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling mergeDocumentXlsxMulti");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling mergeDocumentXlsxMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/merge/xlsx/multi");

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
