package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.HtmlSsrfDetectionResult;
import com.cloudmersive.client.gac.model.SqlInjectionCheckBatchRequest;
import com.cloudmersive.client.gac.model.SqlInjectionCheckBatchResponse;
import com.cloudmersive.client.gac.model.SqlInjectionDetectionResult;
import com.cloudmersive.client.gac.model.XssProtectionBatchRequest;
import com.cloudmersive.client.gac.model.XssProtectionBatchResponse;
import com.cloudmersive.client.gac.model.XssProtectionResult;
import com.cloudmersive.client.gac.model.XxeDetectionBatchRequest;
import com.cloudmersive.client.gac.model.XxeDetectionBatchResponse;
import com.cloudmersive.client.gac.model.XxeDetectionResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:36.624-07:00[America/Los_Angeles]")
public class TextInputApi {
    private ApiClient apiClient;

    public TextInputApi() {
        this(new ApiClient());
    }

    public TextInputApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Protect html input from Server-side Request Forgery (SSRF) attacks
    * Detects SSRF (Server-side request forgery) attacks and unsafe URL attacks from HTML text input, where attackers can attempt to access unsafe local or network paths in the server environment by injecting them into HTML.
    * <p><b>200</b> - OK
    * @param value User-facing HTML input.
    * @return HtmlSsrfDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public HtmlSsrfDetectionResult textInputCheckHtmlSsrf(String value) throws IOException {
        HttpResponse response = textInputCheckHtmlSsrfForHttpResponse(value);
        TypeReference<HtmlSsrfDetectionResult> typeRef = new TypeReference<HtmlSsrfDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Protect html input from Server-side Request Forgery (SSRF) attacks
    * Detects SSRF (Server-side request forgery) attacks and unsafe URL attacks from HTML text input, where attackers can attempt to access unsafe local or network paths in the server environment by injecting them into HTML.
    * <p><b>200</b> - OK
    * @param value User-facing HTML input.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return HtmlSsrfDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public HtmlSsrfDetectionResult textInputCheckHtmlSsrf(String value, Map<String, Object> params) throws IOException {
        HttpResponse response = textInputCheckHtmlSsrfForHttpResponse(value, params);
        TypeReference<HtmlSsrfDetectionResult> typeRef = new TypeReference<HtmlSsrfDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse textInputCheckHtmlSsrfForHttpResponse(String value) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckHtmlSsrf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/html/check/ssrf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse textInputCheckHtmlSsrfForHttpResponse(java.io.InputStream value, String mediaType) throws IOException {
          // verify the required parameter 'value' is set
              if (value == null) {
              throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckHtmlSsrf");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/html/check/ssrf");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = value == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, value);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse textInputCheckHtmlSsrfForHttpResponse(String value, Map<String, Object> params) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckHtmlSsrf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/html/check/ssrf");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Check text input for SQL Injection (SQLI) attacks
    * Detects SQL Injection (SQLI) attacks from text input.
    * <p><b>200</b> - OK
    * @param value User-facing text input.
    * @param detectionLevel Set to Normal to target a high-security SQL Injection detection level with a very low false positive rate; select High to target a very-high security SQL Injection detection level with higher false positives.  Default is Normal (recommended).
    * @return SqlInjectionDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SqlInjectionDetectionResult textInputCheckSqlInjection(String value, String detectionLevel) throws IOException {
        HttpResponse response = textInputCheckSqlInjectionForHttpResponse(value, detectionLevel);
        TypeReference<SqlInjectionDetectionResult> typeRef = new TypeReference<SqlInjectionDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Check text input for SQL Injection (SQLI) attacks
    * Detects SQL Injection (SQLI) attacks from text input.
    * <p><b>200</b> - OK
    * @param value User-facing text input.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SqlInjectionDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SqlInjectionDetectionResult textInputCheckSqlInjection(String value, Map<String, Object> params) throws IOException {
        HttpResponse response = textInputCheckSqlInjectionForHttpResponse(value, params);
        TypeReference<SqlInjectionDetectionResult> typeRef = new TypeReference<SqlInjectionDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse textInputCheckSqlInjectionForHttpResponse(String value, String detectionLevel) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckSqlInjection");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check/sql-injection");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse textInputCheckSqlInjectionForHttpResponse(java.io.InputStream value, String detectionLevel, String mediaType) throws IOException {
          // verify the required parameter 'value' is set
              if (value == null) {
              throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckSqlInjection");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check/sql-injection");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = value == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, value);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse textInputCheckSqlInjectionForHttpResponse(String value, Map<String, Object> params) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckSqlInjection");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check/sql-injection");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Check and protect multiple text inputs for SQL Injection (SQLI) attacks in batch
    * Detects SQL Injection (SQLI) attacks from multiple text inputs.  Output preverses order of input items.
    * <p><b>200</b> - OK
    * @param value User-facing text input.
    * @return SqlInjectionCheckBatchResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SqlInjectionCheckBatchResponse textInputCheckSqlInjectionBatch(SqlInjectionCheckBatchRequest value) throws IOException {
        HttpResponse response = textInputCheckSqlInjectionBatchForHttpResponse(value);
        TypeReference<SqlInjectionCheckBatchResponse> typeRef = new TypeReference<SqlInjectionCheckBatchResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Check and protect multiple text inputs for SQL Injection (SQLI) attacks in batch
    * Detects SQL Injection (SQLI) attacks from multiple text inputs.  Output preverses order of input items.
    * <p><b>200</b> - OK
    * @param value User-facing text input.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SqlInjectionCheckBatchResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SqlInjectionCheckBatchResponse textInputCheckSqlInjectionBatch(SqlInjectionCheckBatchRequest value, Map<String, Object> params) throws IOException {
        HttpResponse response = textInputCheckSqlInjectionBatchForHttpResponse(value, params);
        TypeReference<SqlInjectionCheckBatchResponse> typeRef = new TypeReference<SqlInjectionCheckBatchResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse textInputCheckSqlInjectionBatchForHttpResponse(SqlInjectionCheckBatchRequest value) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckSqlInjectionBatch");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check/sql-injection/batch");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse textInputCheckSqlInjectionBatchForHttpResponse(java.io.InputStream value, String mediaType) throws IOException {
          // verify the required parameter 'value' is set
              if (value == null) {
              throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckSqlInjectionBatch");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check/sql-injection/batch");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = value == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, value);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse textInputCheckSqlInjectionBatchForHttpResponse(SqlInjectionCheckBatchRequest value, Map<String, Object> params) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckSqlInjectionBatch");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check/sql-injection/batch");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Check text input for Cross-Site-Scripting (XSS) attacks
    * Detects XSS (Cross-Site-Scripting) attacks from text input.
    * <p><b>200</b> - OK
    * @param value User-facing text input.
    * @return XssProtectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XssProtectionResult textInputCheckXss(String value) throws IOException {
        HttpResponse response = textInputCheckXssForHttpResponse(value);
        TypeReference<XssProtectionResult> typeRef = new TypeReference<XssProtectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Check text input for Cross-Site-Scripting (XSS) attacks
    * Detects XSS (Cross-Site-Scripting) attacks from text input.
    * <p><b>200</b> - OK
    * @param value User-facing text input.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XssProtectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XssProtectionResult textInputCheckXss(String value, Map<String, Object> params) throws IOException {
        HttpResponse response = textInputCheckXssForHttpResponse(value, params);
        TypeReference<XssProtectionResult> typeRef = new TypeReference<XssProtectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse textInputCheckXssForHttpResponse(String value) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckXss");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check/xss");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse textInputCheckXssForHttpResponse(java.io.InputStream value, String mediaType) throws IOException {
          // verify the required parameter 'value' is set
              if (value == null) {
              throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckXss");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check/xss");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = value == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, value);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse textInputCheckXssForHttpResponse(String value, Map<String, Object> params) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckXss");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check/xss");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Check and protect multiple text inputs for Cross-Site-Scripting (XSS) attacks in batch
    * Detects XSS (Cross-Site-Scripting) attacks from multiple text inputs.  Output preverses order of input items.
    * <p><b>200</b> - OK
    * @param value User-facing text input.
    * @return XssProtectionBatchResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XssProtectionBatchResponse textInputCheckXssBatch(XssProtectionBatchRequest value) throws IOException {
        HttpResponse response = textInputCheckXssBatchForHttpResponse(value);
        TypeReference<XssProtectionBatchResponse> typeRef = new TypeReference<XssProtectionBatchResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Check and protect multiple text inputs for Cross-Site-Scripting (XSS) attacks in batch
    * Detects XSS (Cross-Site-Scripting) attacks from multiple text inputs.  Output preverses order of input items.
    * <p><b>200</b> - OK
    * @param value User-facing text input.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XssProtectionBatchResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XssProtectionBatchResponse textInputCheckXssBatch(XssProtectionBatchRequest value, Map<String, Object> params) throws IOException {
        HttpResponse response = textInputCheckXssBatchForHttpResponse(value, params);
        TypeReference<XssProtectionBatchResponse> typeRef = new TypeReference<XssProtectionBatchResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse textInputCheckXssBatchForHttpResponse(XssProtectionBatchRequest value) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckXssBatch");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check-and-protect/xss/batch");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse textInputCheckXssBatchForHttpResponse(java.io.InputStream value, String mediaType) throws IOException {
          // verify the required parameter 'value' is set
              if (value == null) {
              throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckXssBatch");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check-and-protect/xss/batch");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = value == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, value);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse textInputCheckXssBatchForHttpResponse(XssProtectionBatchRequest value, Map<String, Object> params) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckXssBatch");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check-and-protect/xss/batch");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Protect text input from XML External Entity (XXE) attacks
    * Detects XXE (XML External Entity) attacks from text input.
    * <p><b>200</b> - OK
    * @param value User-facing text input.
    * @param allowInternetUrls Optional: Set to true to allow Internet-based dependency URLs for DTDs and other XML External Entitites, set to false to block.  Default is false.
    * @param knownSafeUrls Optional: Comma separated list of fully-qualified URLs that will automatically be considered safe.
    * @param knownUnsafeUrls Optional: Comma separated list of fully-qualified URLs that will automatically be considered unsafe.
    * @return XxeDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XxeDetectionResult textInputCheckXxe(String value, Boolean allowInternetUrls, String knownSafeUrls, String knownUnsafeUrls) throws IOException {
        HttpResponse response = textInputCheckXxeForHttpResponse(value, allowInternetUrls, knownSafeUrls, knownUnsafeUrls);
        TypeReference<XxeDetectionResult> typeRef = new TypeReference<XxeDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Protect text input from XML External Entity (XXE) attacks
    * Detects XXE (XML External Entity) attacks from text input.
    * <p><b>200</b> - OK
    * @param value User-facing text input.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XxeDetectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XxeDetectionResult textInputCheckXxe(String value, Map<String, Object> params) throws IOException {
        HttpResponse response = textInputCheckXxeForHttpResponse(value, params);
        TypeReference<XxeDetectionResult> typeRef = new TypeReference<XxeDetectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse textInputCheckXxeForHttpResponse(String value, Boolean allowInternetUrls, String knownSafeUrls, String knownUnsafeUrls) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckXxe");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check/xxe");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse textInputCheckXxeForHttpResponse(java.io.InputStream value, Boolean allowInternetUrls, String knownSafeUrls, String knownUnsafeUrls, String mediaType) throws IOException {
          // verify the required parameter 'value' is set
              if (value == null) {
              throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckXxe");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check/xxe");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = value == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, value);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse textInputCheckXxeForHttpResponse(String value, Map<String, Object> params) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputCheckXxe");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check/xxe");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Protect text input from XML External Entity (XXE) attacks
    * Detects XXE (XML External Entity) attacks from text input.
    * <p><b>200</b> - OK
    * @param request The request parameter
    * @return XxeDetectionBatchResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XxeDetectionBatchResponse textInputCheckXxeBatch(XxeDetectionBatchRequest request) throws IOException {
        HttpResponse response = textInputCheckXxeBatchForHttpResponse(request);
        TypeReference<XxeDetectionBatchResponse> typeRef = new TypeReference<XxeDetectionBatchResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Protect text input from XML External Entity (XXE) attacks
    * Detects XXE (XML External Entity) attacks from text input.
    * <p><b>200</b> - OK
    * @param request The request parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XxeDetectionBatchResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XxeDetectionBatchResponse textInputCheckXxeBatch(XxeDetectionBatchRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = textInputCheckXxeBatchForHttpResponse(request, params);
        TypeReference<XxeDetectionBatchResponse> typeRef = new TypeReference<XxeDetectionBatchResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse textInputCheckXxeBatchForHttpResponse(XxeDetectionBatchRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling textInputCheckXxeBatch");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check/xxe/batch");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse textInputCheckXxeBatchForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling textInputCheckXxeBatch");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check/xxe/batch");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse textInputCheckXxeBatchForHttpResponse(XxeDetectionBatchRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling textInputCheckXxeBatch");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/check/xxe/batch");

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
    * Protect text input from Cross-Site-Scripting (XSS) attacks through normalization
    * Detects and removes XSS (Cross-Site-Scripting) attacks from text input through normalization.  Returns the normalized result, as well as information on whether the original input contained an XSS risk.
    * <p><b>200</b> - OK
    * @param value User-facing text input.
    * @return XssProtectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XssProtectionResult textInputProtectXss(String value) throws IOException {
        HttpResponse response = textInputProtectXssForHttpResponse(value);
        TypeReference<XssProtectionResult> typeRef = new TypeReference<XssProtectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Protect text input from Cross-Site-Scripting (XSS) attacks through normalization
    * Detects and removes XSS (Cross-Site-Scripting) attacks from text input through normalization.  Returns the normalized result, as well as information on whether the original input contained an XSS risk.
    * <p><b>200</b> - OK
    * @param value User-facing text input.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XssProtectionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XssProtectionResult textInputProtectXss(String value, Map<String, Object> params) throws IOException {
        HttpResponse response = textInputProtectXssForHttpResponse(value, params);
        TypeReference<XssProtectionResult> typeRef = new TypeReference<XssProtectionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse textInputProtectXssForHttpResponse(String value) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputProtectXss");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/protect/xss");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse textInputProtectXssForHttpResponse(java.io.InputStream value, String mediaType) throws IOException {
          // verify the required parameter 'value' is set
              if (value == null) {
              throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputProtectXss");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/protect/xss");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = value == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, value);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse textInputProtectXssForHttpResponse(String value, Map<String, Object> params) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling textInputProtectXss");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/text-input/protect/xss");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
