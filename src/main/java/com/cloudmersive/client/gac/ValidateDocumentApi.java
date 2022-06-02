package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.AutodetectDocumentValidationResult;
import com.cloudmersive.client.gac.model.DocumentValidationResult;
import java.io.File;
import com.cloudmersive.client.gac.model.HtmlSsrfThreatCheckResult;
import com.cloudmersive.client.gac.model.XxeThreatDetectionResult;

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
public class ValidateDocumentApi {
    private ApiClient apiClient;

    public ValidateDocumentApi() {
        this(new ApiClient());
    }

    public ValidateDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Autodetect content type and validate
    * Automatically detect the type of content, verify and validate that the content is indeed fully valid at depth, and then report the validation result.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return AutodetectDocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AutodetectDocumentValidationResult validateDocumentAutodetectValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentAutodetectValidationForHttpResponse(inputFile);
        TypeReference<AutodetectDocumentValidationResult> typeRef = new TypeReference<AutodetectDocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Autodetect content type and validate
    * Automatically detect the type of content, verify and validate that the content is indeed fully valid at depth, and then report the validation result.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AutodetectDocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AutodetectDocumentValidationResult validateDocumentAutodetectValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentAutodetectValidationForHttpResponse(inputFile, params);
        TypeReference<AutodetectDocumentValidationResult> typeRef = new TypeReference<AutodetectDocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentAutodetectValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentAutodetectValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/autodetect");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentAutodetectValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentAutodetectValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/autodetect");

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
    * Validate a CSV file document (CSV)
    * Validate a CSV file document (CSV); if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentCsvValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentCsvValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a CSV file document (CSV)
    * Validate a CSV file document (CSV); if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentCsvValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentCsvValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentCsvValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentCsvValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/csv");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentCsvValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentCsvValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/csv");

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
    * Validate a Word 97-2003 Legacy document (DOC)
    * Validate a Word 97-2003 Legacy document (DOC)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentDocValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentDocValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a Word 97-2003 Legacy document (DOC)
    * Validate a Word 97-2003 Legacy document (DOC)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentDocValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentDocValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentDocValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentDocValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/doc");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentDocValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentDocValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/doc");

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
    * Validate a Word document (DOCX)
    * Validate a Word document (DOCX); if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentDocxValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentDocxValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a Word document (DOCX)
    * Validate a Word document (DOCX); if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentDocxValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentDocxValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentDocxValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentDocxValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/docx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentDocxValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentDocxValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/docx");

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
    * Validate if an EML file is executable
    * Validate if an input file is an EML email file; if the document is not valid
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentEmlValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentEmlValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate if an EML file is executable
    * Validate if an input file is an EML email file; if the document is not valid
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentEmlValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentEmlValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentEmlValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentEmlValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/eml");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentEmlValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentEmlValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/eml");

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
    * Validate if a file is executable
    * Validate if an input file is a binary executable file; if the document is not valid
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentExecutableValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentExecutableValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate if a file is executable
    * Validate if an input file is a binary executable file; if the document is not valid
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentExecutableValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentExecutableValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentExecutableValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentExecutableValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/executable");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentExecutableValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentExecutableValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/executable");

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
    * Validate a GZip Archive file (gzip or gz)
    * Validate a GZip archive file (GZIP or GZ)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentGZipValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentGZipValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a GZip Archive file (gzip or gz)
    * Validate a GZip archive file (GZIP or GZ)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentGZipValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentGZipValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentGZipValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentGZipValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/gzip");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentGZipValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentGZipValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/gzip");

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
    * Validate an HTML file and checks for SSRF threats
    * Validate an HTML document file and checks for SSRF (Server-side Request Forgery) threats in the file; if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return HtmlSsrfThreatCheckResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public HtmlSsrfThreatCheckResult validateDocumentHtmlSsrfValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentHtmlSsrfValidationForHttpResponse(inputFile);
        TypeReference<HtmlSsrfThreatCheckResult> typeRef = new TypeReference<HtmlSsrfThreatCheckResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate an HTML file and checks for SSRF threats
    * Validate an HTML document file and checks for SSRF (Server-side Request Forgery) threats in the file; if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return HtmlSsrfThreatCheckResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public HtmlSsrfThreatCheckResult validateDocumentHtmlSsrfValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentHtmlSsrfValidationForHttpResponse(inputFile, params);
        TypeReference<HtmlSsrfThreatCheckResult> typeRef = new TypeReference<HtmlSsrfThreatCheckResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentHtmlSsrfValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentHtmlSsrfValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/html/ssrf-threat-check");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentHtmlSsrfValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentHtmlSsrfValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/html/ssrf-threat-check");

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
    * Validate an HTML file
    * Validate an HTML document file; if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentHtmlValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentHtmlValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate an HTML file
    * Validate an HTML document file; if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentHtmlValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentHtmlValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentHtmlValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentHtmlValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/html");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentHtmlValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentHtmlValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/html");

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
    * Validate an Image File
    * Validate an image file; if the document is not valid, identifies the errors in the document.  Formats supported include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentImageValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentImageValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate an Image File
    * Validate an image file; if the document is not valid, identifies the errors in the document.  Formats supported include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentImageValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentImageValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentImageValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentImageValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/image");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentImageValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentImageValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/image");

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
    * Validate a JPG File
    * Validate a JPEG image file; if the document is not valid, identifies the errors in the document..
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentJpgValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentJpgValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a JPG File
    * Validate a JPEG image file; if the document is not valid, identifies the errors in the document..
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentJpgValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentJpgValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentJpgValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentJpgValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/jpg");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentJpgValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentJpgValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/jpg");

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
    * Validate a JSON file
    * Validate a JSON (JavaScript Object Notation) document file; if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentJsonValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentJsonValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a JSON file
    * Validate a JSON (JavaScript Object Notation) document file; if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentJsonValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentJsonValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentJsonValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentJsonValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/json");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentJsonValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentJsonValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/json");

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
    * Validate if an MSG file is executable
    * Validate if an input file is an MSG email file; if the document is not valid
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentMsgValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentMsgValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate if an MSG file is executable
    * Validate if an input file is an MSG email file; if the document is not valid
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentMsgValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentMsgValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentMsgValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentMsgValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/msg");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentMsgValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentMsgValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/msg");

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
    * Validate a PDF document file
    * Validate a PDF document; if the document is not valid, identifies the errors in the document.  Also checks if the PDF is password protected.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentPdfValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentPdfValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a PDF document file
    * Validate a PDF document; if the document is not valid, identifies the errors in the document.  Also checks if the PDF is password protected.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentPdfValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentPdfValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentPdfValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentPdfValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentPdfValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentPdfValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/pdf");

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
    * Validate a PNG File
    * Validate a PNG image file; if the document is not valid, identifies the errors in the document.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentPngValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentPngValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a PNG File
    * Validate a PNG image file; if the document is not valid, identifies the errors in the document.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentPngValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentPngValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentPngValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentPngValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/png");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentPngValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentPngValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/png");

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
    * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
    * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentPptValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentPptValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
    * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentPptValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentPptValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentPptValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentPptValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/ppt");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentPptValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentPptValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/ppt");

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
    * Validate a PowerPoint presentation (PPTX)
    * Validate a PowerPoint presentation (PPTX); if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentPptxValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentPptxValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a PowerPoint presentation (PPTX)
    * Validate a PowerPoint presentation (PPTX); if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentPptxValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentPptxValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentPptxValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentPptxValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/pptx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentPptxValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentPptxValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/pptx");

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
    * Validate a RAR Archive file (RAR)
    * Validate a RAR archive file (RAR)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentRarValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentRarValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a RAR Archive file (RAR)
    * Validate a RAR archive file (RAR)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentRarValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentRarValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentRarValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentRarValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/rar");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentRarValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentRarValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/rar");

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
    * Validate a Rich Text Format document (RTF)
    * Validate a Rich Text Format document (RTF)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentRtfValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentRtfValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a Rich Text Format document (RTF)
    * Validate a Rich Text Format document (RTF)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentRtfValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentRtfValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentRtfValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentRtfValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/rtf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentRtfValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentRtfValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/rtf");

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
    * Validate a TAR Tarball Archive file (TAR)
    * Validate a TAR tarball archive file (TAR)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentTarValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentTarValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a TAR Tarball Archive file (TAR)
    * Validate a TAR tarball archive file (TAR)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentTarValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentTarValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentTarValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentTarValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/tar");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentTarValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentTarValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/tar");

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
    * Validate an TXT file
    * Validate an TXT document file; if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentTxtValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentTxtValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate an TXT file
    * Validate an TXT document file; if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentTxtValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentTxtValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentTxtValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentTxtValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/txt");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentTxtValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentTxtValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/txt");

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
    * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
    * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentXlsValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentXlsValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
    * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentXlsValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentXlsValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentXlsValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentXlsValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/xls");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentXlsValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentXlsValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/xls");

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
    * Validate a Excel document (XLSX)
    * Validate a Excel document (XLSX); if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentXlsxValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentXlsxValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a Excel document (XLSX)
    * Validate a Excel document (XLSX); if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentXlsxValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentXlsxValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentXlsxValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentXlsxValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/xlsx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentXlsxValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentXlsxValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/xlsx");

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
    * Validate an XML file
    * Validate an XML document file; if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentXmlValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentXmlValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate an XML file
    * Validate an XML document file; if the document is not valid, identifies the errors in the document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentXmlValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentXmlValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentXmlValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentXmlValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/xml");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentXmlValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentXmlValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/xml");

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
    * Validate an XML file for XML External Entity (XXE) threats
    * Validate an XML document file for XML External Entity (XXE) threats; if the document is not valid, identifies the errors in the document.  XXE threats are a type of threat that exploits vulnerabilities in the XML standard relating to external or local entity URIs in XML documents.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return XxeThreatDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XxeThreatDetectionResult validateDocumentXmlXxeThreatValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentXmlXxeThreatValidationForHttpResponse(inputFile);
        TypeReference<XxeThreatDetectionResult> typeRef = new TypeReference<XxeThreatDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate an XML file for XML External Entity (XXE) threats
    * Validate an XML document file for XML External Entity (XXE) threats; if the document is not valid, identifies the errors in the document.  XXE threats are a type of threat that exploits vulnerabilities in the XML standard relating to external or local entity URIs in XML documents.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XxeThreatDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XxeThreatDetectionResult validateDocumentXmlXxeThreatValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentXmlXxeThreatValidationForHttpResponse(inputFile, params);
        TypeReference<XxeThreatDetectionResult> typeRef = new TypeReference<XxeThreatDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentXmlXxeThreatValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentXmlXxeThreatValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/xml/xxe-threats");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentXmlXxeThreatValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentXmlXxeThreatValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/xml/xxe-threats");

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
    * Validate a Zip Archive file (zip)
    * Validate a Zip archive file (ZIP)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentZipValidation(File inputFile) throws IOException {
        HttpResponse response = validateDocumentZipValidationForHttpResponse(inputFile);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a Zip Archive file (zip)
    * Validate a Zip archive file (ZIP)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentValidationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentValidationResult validateDocumentZipValidation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = validateDocumentZipValidationForHttpResponse(inputFile, params);
        TypeReference<DocumentValidationResult> typeRef = new TypeReference<DocumentValidationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse validateDocumentZipValidationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentZipValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/zip");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse validateDocumentZipValidationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling validateDocumentZipValidation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/validate/zip");

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
