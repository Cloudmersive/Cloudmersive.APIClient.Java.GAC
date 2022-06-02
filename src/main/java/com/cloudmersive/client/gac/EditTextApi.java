package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.Base64DecodeRequest;
import com.cloudmersive.client.gac.model.Base64DecodeResponse;
import com.cloudmersive.client.gac.model.Base64DetectRequest;
import com.cloudmersive.client.gac.model.Base64DetectResponse;
import com.cloudmersive.client.gac.model.Base64EncodeRequest;
import com.cloudmersive.client.gac.model.Base64EncodeResponse;
import com.cloudmersive.client.gac.model.ChangeLineEndingResponse;
import com.cloudmersive.client.gac.model.DetectLineEndingsResponse;
import java.io.File;
import com.cloudmersive.client.gac.model.FindStringRegexRequest;
import com.cloudmersive.client.gac.model.FindStringRegexResponse;
import com.cloudmersive.client.gac.model.FindStringSimpleRequest;
import com.cloudmersive.client.gac.model.FindStringSimpleResponse;
import com.cloudmersive.client.gac.model.RemoveHtmlFromTextRequest;
import com.cloudmersive.client.gac.model.RemoveHtmlFromTextResponse;
import com.cloudmersive.client.gac.model.RemoveWhitespaceFromTextRequest;
import com.cloudmersive.client.gac.model.RemoveWhitespaceFromTextResponse;
import com.cloudmersive.client.gac.model.ReplaceStringRegexRequest;
import com.cloudmersive.client.gac.model.ReplaceStringRegexResponse;
import com.cloudmersive.client.gac.model.ReplaceStringSimpleRequest;
import com.cloudmersive.client.gac.model.ReplaceStringSimpleResponse;
import com.cloudmersive.client.gac.model.TextEncodingDetectResponse;

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
public class EditTextApi {
    private ApiClient apiClient;

    public EditTextApi() {
        this(new ApiClient());
    }

    public EditTextApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Base 64 decode, convert base 64 string to binary content
    * Decodes / converts base 64 UTF-8 text string to binary content
    * <p><b>200</b> - OK
    * @param request Input request
    * @return Base64DecodeResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Base64DecodeResponse editTextBase64Decode(Base64DecodeRequest request) throws IOException {
        HttpResponse response = editTextBase64DecodeForHttpResponse(request);
        TypeReference<Base64DecodeResponse> typeRef = new TypeReference<Base64DecodeResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Base 64 decode, convert base 64 string to binary content
    * Decodes / converts base 64 UTF-8 text string to binary content
    * <p><b>200</b> - OK
    * @param request Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Base64DecodeResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Base64DecodeResponse editTextBase64Decode(Base64DecodeRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = editTextBase64DecodeForHttpResponse(request, params);
        TypeReference<Base64DecodeResponse> typeRef = new TypeReference<Base64DecodeResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editTextBase64DecodeForHttpResponse(Base64DecodeRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextBase64Decode");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/encoding/base64/decode");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editTextBase64DecodeForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextBase64Decode");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/encoding/base64/decode");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editTextBase64DecodeForHttpResponse(Base64DecodeRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextBase64Decode");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/encoding/base64/decode");

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
    * Detect, check if text string is base 64 encoded
    * Checks, detects if input string is base 64 encoded
    * <p><b>200</b> - OK
    * @param request Input request
    * @return Base64DetectResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Base64DetectResponse editTextBase64Detect(Base64DetectRequest request) throws IOException {
        HttpResponse response = editTextBase64DetectForHttpResponse(request);
        TypeReference<Base64DetectResponse> typeRef = new TypeReference<Base64DetectResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect, check if text string is base 64 encoded
    * Checks, detects if input string is base 64 encoded
    * <p><b>200</b> - OK
    * @param request Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Base64DetectResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Base64DetectResponse editTextBase64Detect(Base64DetectRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = editTextBase64DetectForHttpResponse(request, params);
        TypeReference<Base64DetectResponse> typeRef = new TypeReference<Base64DetectResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editTextBase64DetectForHttpResponse(Base64DetectRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextBase64Detect");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/encoding/base64/detect");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editTextBase64DetectForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextBase64Detect");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/encoding/base64/detect");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editTextBase64DetectForHttpResponse(Base64DetectRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextBase64Detect");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/encoding/base64/detect");

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
    * Base 64 encode, convert binary or file data to a text string
    * Encodes / converts binary or file data to a text string
    * <p><b>200</b> - OK
    * @param request Input request
    * @return Base64EncodeResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Base64EncodeResponse editTextBase64Encode(Base64EncodeRequest request) throws IOException {
        HttpResponse response = editTextBase64EncodeForHttpResponse(request);
        TypeReference<Base64EncodeResponse> typeRef = new TypeReference<Base64EncodeResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Base 64 encode, convert binary or file data to a text string
    * Encodes / converts binary or file data to a text string
    * <p><b>200</b> - OK
    * @param request Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Base64EncodeResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Base64EncodeResponse editTextBase64Encode(Base64EncodeRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = editTextBase64EncodeForHttpResponse(request, params);
        TypeReference<Base64EncodeResponse> typeRef = new TypeReference<Base64EncodeResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editTextBase64EncodeForHttpResponse(Base64EncodeRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextBase64Encode");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/encoding/base64/encode");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editTextBase64EncodeForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextBase64Encode");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/encoding/base64/encode");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editTextBase64EncodeForHttpResponse(Base64EncodeRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextBase64Encode");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/encoding/base64/encode");

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
    * Set, change line endings of a text file
    * Sets the line ending type of a text file; set to Windows, Unix or Mac.
    * <p><b>200</b> - OK
    * @param lineEndingType Required; &#39;Windows&#39; will use carriage return and line feed, &#39;Unix&#39; will use newline, and &#39;Mac&#39; will use carriage return
    * @param inputFile Input file to perform the operation on.
    * @return ChangeLineEndingResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ChangeLineEndingResponse editTextChangeLineEndings(String lineEndingType, File inputFile) throws IOException {
        HttpResponse response = editTextChangeLineEndingsForHttpResponse(lineEndingType, inputFile);
        TypeReference<ChangeLineEndingResponse> typeRef = new TypeReference<ChangeLineEndingResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Set, change line endings of a text file
    * Sets the line ending type of a text file; set to Windows, Unix or Mac.
    * <p><b>200</b> - OK
    * @param lineEndingType Required; &#39;Windows&#39; will use carriage return and line feed, &#39;Unix&#39; will use newline, and &#39;Mac&#39; will use carriage return
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ChangeLineEndingResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ChangeLineEndingResponse editTextChangeLineEndings(String lineEndingType, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editTextChangeLineEndingsForHttpResponse(lineEndingType, inputFile, params);
        TypeReference<ChangeLineEndingResponse> typeRef = new TypeReference<ChangeLineEndingResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editTextChangeLineEndingsForHttpResponse(String lineEndingType, File inputFile) throws IOException {
        // verify the required parameter 'lineEndingType' is set
        if (lineEndingType == null) {
            throw new IllegalArgumentException("Missing the required parameter 'lineEndingType' when calling editTextChangeLineEndings");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editTextChangeLineEndings");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/line-endings/change");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editTextChangeLineEndingsForHttpResponse(String lineEndingType, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'lineEndingType' is set
        if (lineEndingType == null) {
            throw new IllegalArgumentException("Missing the required parameter 'lineEndingType' when calling editTextChangeLineEndings");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editTextChangeLineEndings");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/line-endings/change");

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
    * Detect line endings of a text file
    * Detect line ending type (Windows, Unix or Mac) of an input file.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DetectLineEndingsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DetectLineEndingsResponse editTextDetectLineEndings(File inputFile) throws IOException {
        HttpResponse response = editTextDetectLineEndingsForHttpResponse(inputFile);
        TypeReference<DetectLineEndingsResponse> typeRef = new TypeReference<DetectLineEndingsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect line endings of a text file
    * Detect line ending type (Windows, Unix or Mac) of an input file.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DetectLineEndingsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DetectLineEndingsResponse editTextDetectLineEndings(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editTextDetectLineEndingsForHttpResponse(inputFile, params);
        TypeReference<DetectLineEndingsResponse> typeRef = new TypeReference<DetectLineEndingsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editTextDetectLineEndingsForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editTextDetectLineEndings");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/line-endings/detect");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editTextDetectLineEndingsForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editTextDetectLineEndings");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/line-endings/detect");

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
    * Find a regular expression regex in text input
    * Find all occurrences of the input regular expression in the input content, and returns the matches
    * <p><b>200</b> - OK
    * @param request Input request
    * @return FindStringRegexResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FindStringRegexResponse editTextFindRegex(FindStringRegexRequest request) throws IOException {
        HttpResponse response = editTextFindRegexForHttpResponse(request);
        TypeReference<FindStringRegexResponse> typeRef = new TypeReference<FindStringRegexResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Find a regular expression regex in text input
    * Find all occurrences of the input regular expression in the input content, and returns the matches
    * <p><b>200</b> - OK
    * @param request Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FindStringRegexResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FindStringRegexResponse editTextFindRegex(FindStringRegexRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = editTextFindRegexForHttpResponse(request, params);
        TypeReference<FindStringRegexResponse> typeRef = new TypeReference<FindStringRegexResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editTextFindRegexForHttpResponse(FindStringRegexRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextFindRegex");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/find/regex");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editTextFindRegexForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextFindRegex");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/find/regex");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editTextFindRegexForHttpResponse(FindStringRegexRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextFindRegex");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/find/regex");

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
    * Find a string in text input
    * Finds all occurrences of the input string in the input content, and returns the matches
    * <p><b>200</b> - OK
    * @param request Input request
    * @return FindStringSimpleResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FindStringSimpleResponse editTextFindSimple(FindStringSimpleRequest request) throws IOException {
        HttpResponse response = editTextFindSimpleForHttpResponse(request);
        TypeReference<FindStringSimpleResponse> typeRef = new TypeReference<FindStringSimpleResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Find a string in text input
    * Finds all occurrences of the input string in the input content, and returns the matches
    * <p><b>200</b> - OK
    * @param request Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FindStringSimpleResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FindStringSimpleResponse editTextFindSimple(FindStringSimpleRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = editTextFindSimpleForHttpResponse(request, params);
        TypeReference<FindStringSimpleResponse> typeRef = new TypeReference<FindStringSimpleResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editTextFindSimpleForHttpResponse(FindStringSimpleRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextFindSimple");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/find/string");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editTextFindSimpleForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextFindSimple");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/find/string");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editTextFindSimpleForHttpResponse(FindStringSimpleRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextFindSimple");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/find/string");

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
    * Remove whitespace from text string
    * Removes all whitespace from text, leaving behind only non-whitespace characters.  Whitespace includes newlines, spaces and other whitespace characters.
    * <p><b>200</b> - OK
    * @param request Input request
    * @return RemoveWhitespaceFromTextResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public RemoveWhitespaceFromTextResponse editTextRemoveAllWhitespace(RemoveWhitespaceFromTextRequest request) throws IOException {
        HttpResponse response = editTextRemoveAllWhitespaceForHttpResponse(request);
        TypeReference<RemoveWhitespaceFromTextResponse> typeRef = new TypeReference<RemoveWhitespaceFromTextResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Remove whitespace from text string
    * Removes all whitespace from text, leaving behind only non-whitespace characters.  Whitespace includes newlines, spaces and other whitespace characters.
    * <p><b>200</b> - OK
    * @param request Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return RemoveWhitespaceFromTextResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public RemoveWhitespaceFromTextResponse editTextRemoveAllWhitespace(RemoveWhitespaceFromTextRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = editTextRemoveAllWhitespaceForHttpResponse(request, params);
        TypeReference<RemoveWhitespaceFromTextResponse> typeRef = new TypeReference<RemoveWhitespaceFromTextResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editTextRemoveAllWhitespaceForHttpResponse(RemoveWhitespaceFromTextRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextRemoveAllWhitespace");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/remove/whitespace/all");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editTextRemoveAllWhitespaceForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextRemoveAllWhitespace");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/remove/whitespace/all");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editTextRemoveAllWhitespaceForHttpResponse(RemoveWhitespaceFromTextRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextRemoveAllWhitespace");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/remove/whitespace/all");

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
    * Remove HTML from text string
    * Removes HTML from text, leaving behind only text.  Formatted text will become plain text.  Important for protecting against HTML and Cross-Site-Scripting attacks.
    * <p><b>200</b> - OK
    * @param request Input request
    * @return RemoveHtmlFromTextResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public RemoveHtmlFromTextResponse editTextRemoveHtml(RemoveHtmlFromTextRequest request) throws IOException {
        HttpResponse response = editTextRemoveHtmlForHttpResponse(request);
        TypeReference<RemoveHtmlFromTextResponse> typeRef = new TypeReference<RemoveHtmlFromTextResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Remove HTML from text string
    * Removes HTML from text, leaving behind only text.  Formatted text will become plain text.  Important for protecting against HTML and Cross-Site-Scripting attacks.
    * <p><b>200</b> - OK
    * @param request Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return RemoveHtmlFromTextResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public RemoveHtmlFromTextResponse editTextRemoveHtml(RemoveHtmlFromTextRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = editTextRemoveHtmlForHttpResponse(request, params);
        TypeReference<RemoveHtmlFromTextResponse> typeRef = new TypeReference<RemoveHtmlFromTextResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editTextRemoveHtmlForHttpResponse(RemoveHtmlFromTextRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextRemoveHtml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/remove/html");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editTextRemoveHtmlForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextRemoveHtml");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/remove/html");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editTextRemoveHtmlForHttpResponse(RemoveHtmlFromTextRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextRemoveHtml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/remove/html");

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
    * Replace a string in text with a regex regular expression string
    * Replaces all occurrences of the input regular expression regex string in the input content, and returns the result
    * <p><b>200</b> - OK
    * @param request Input request
    * @return ReplaceStringRegexResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReplaceStringRegexResponse editTextReplaceRegex(ReplaceStringRegexRequest request) throws IOException {
        HttpResponse response = editTextReplaceRegexForHttpResponse(request);
        TypeReference<ReplaceStringRegexResponse> typeRef = new TypeReference<ReplaceStringRegexResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Replace a string in text with a regex regular expression string
    * Replaces all occurrences of the input regular expression regex string in the input content, and returns the result
    * <p><b>200</b> - OK
    * @param request Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ReplaceStringRegexResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReplaceStringRegexResponse editTextReplaceRegex(ReplaceStringRegexRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = editTextReplaceRegexForHttpResponse(request, params);
        TypeReference<ReplaceStringRegexResponse> typeRef = new TypeReference<ReplaceStringRegexResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editTextReplaceRegexForHttpResponse(ReplaceStringRegexRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextReplaceRegex");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/replace/regex");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editTextReplaceRegexForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextReplaceRegex");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/replace/regex");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editTextReplaceRegexForHttpResponse(ReplaceStringRegexRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextReplaceRegex");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/replace/regex");

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
    * Replace a string in text with another string value
    * Replaces all occurrences of the input string in the input content, and returns the result
    * <p><b>200</b> - OK
    * @param request Input request
    * @return ReplaceStringSimpleResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReplaceStringSimpleResponse editTextReplaceSimple(ReplaceStringSimpleRequest request) throws IOException {
        HttpResponse response = editTextReplaceSimpleForHttpResponse(request);
        TypeReference<ReplaceStringSimpleResponse> typeRef = new TypeReference<ReplaceStringSimpleResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Replace a string in text with another string value
    * Replaces all occurrences of the input string in the input content, and returns the result
    * <p><b>200</b> - OK
    * @param request Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ReplaceStringSimpleResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReplaceStringSimpleResponse editTextReplaceSimple(ReplaceStringSimpleRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = editTextReplaceSimpleForHttpResponse(request, params);
        TypeReference<ReplaceStringSimpleResponse> typeRef = new TypeReference<ReplaceStringSimpleResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editTextReplaceSimpleForHttpResponse(ReplaceStringSimpleRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextReplaceSimple");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/replace/string");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editTextReplaceSimpleForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextReplaceSimple");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/replace/string");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editTextReplaceSimpleForHttpResponse(ReplaceStringSimpleRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextReplaceSimple");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/replace/string");

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
    * Detect text encoding of file
    * Checks text encoding of file
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return TextEncodingDetectResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextEncodingDetectResponse editTextTextEncodingDetect(File inputFile) throws IOException {
        HttpResponse response = editTextTextEncodingDetectForHttpResponse(inputFile);
        TypeReference<TextEncodingDetectResponse> typeRef = new TypeReference<TextEncodingDetectResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Detect text encoding of file
    * Checks text encoding of file
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TextEncodingDetectResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextEncodingDetectResponse editTextTextEncodingDetect(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editTextTextEncodingDetectForHttpResponse(inputFile, params);
        TypeReference<TextEncodingDetectResponse> typeRef = new TypeReference<TextEncodingDetectResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editTextTextEncodingDetectForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editTextTextEncodingDetect");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/encoding/detect");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editTextTextEncodingDetectForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editTextTextEncodingDetect");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/encoding/detect");

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
    * Trim leading and trailing whitespace from text string
    * Trim leading and trailing whitespace from text, leaving behind a trimmed string.  Whitespace includes newlines, spaces and other whitespace characters.
    * <p><b>200</b> - OK
    * @param request Input request
    * @return RemoveWhitespaceFromTextResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public RemoveWhitespaceFromTextResponse editTextTrimWhitespace(RemoveWhitespaceFromTextRequest request) throws IOException {
        HttpResponse response = editTextTrimWhitespaceForHttpResponse(request);
        TypeReference<RemoveWhitespaceFromTextResponse> typeRef = new TypeReference<RemoveWhitespaceFromTextResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Trim leading and trailing whitespace from text string
    * Trim leading and trailing whitespace from text, leaving behind a trimmed string.  Whitespace includes newlines, spaces and other whitespace characters.
    * <p><b>200</b> - OK
    * @param request Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return RemoveWhitespaceFromTextResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public RemoveWhitespaceFromTextResponse editTextTrimWhitespace(RemoveWhitespaceFromTextRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = editTextTrimWhitespaceForHttpResponse(request, params);
        TypeReference<RemoveWhitespaceFromTextResponse> typeRef = new TypeReference<RemoveWhitespaceFromTextResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editTextTrimWhitespaceForHttpResponse(RemoveWhitespaceFromTextRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextTrimWhitespace");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/remove/whitespace/trim");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editTextTrimWhitespaceForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextTrimWhitespace");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/remove/whitespace/trim");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editTextTrimWhitespaceForHttpResponse(RemoveWhitespaceFromTextRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editTextTrimWhitespace");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/text/remove/whitespace/trim");

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
