package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.DocumentTransformEditSession;
import com.cloudmersive.client.gac.model.DocxTableTableFillMultiRequest;
import com.cloudmersive.client.gac.model.DocxTableTableFillRequest;
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
public class TransformDocumentApi {
    private ApiClient apiClient;

    public TransformDocumentApi() {
        this(new ApiClient());
    }

    public TransformDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Replace string in Word DOCX document, return result
    * Replace all instances of a string in an Office Word Document (docx)
    * <p><b>200</b> - OK
    * @param matchString String to search for and match against, to be replaced
    * @param replaceString String to replace the matched values with
    * @param inputFileUrl Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
    * @param matchCase Optional: True if the case should be matched, false for case insensitive match. Default is false.
    * @param inputFile Optional: Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] transformDocumentDocxReplace(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, File inputFile) throws IOException {
        HttpResponse response = transformDocumentDocxReplaceForHttpResponse(matchString, replaceString, inputFileUrl, matchCase, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Replace string in Word DOCX document, return result
    * Replace all instances of a string in an Office Word Document (docx)
    * <p><b>200</b> - OK
    * @param matchString String to search for and match against, to be replaced
    * @param replaceString String to replace the matched values with
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] transformDocumentDocxReplace(String matchString, String replaceString, Map<String, Object> params) throws IOException {
        HttpResponse response = transformDocumentDocxReplaceForHttpResponse(matchString, replaceString, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse transformDocumentDocxReplaceForHttpResponse(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, File inputFile) throws IOException {
        // verify the required parameter 'matchString' is set
        if (matchString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'matchString' when calling transformDocumentDocxReplace");
        }// verify the required parameter 'replaceString' is set
        if (replaceString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'replaceString' when calling transformDocumentDocxReplace");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/transform/docx/replace-all");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse transformDocumentDocxReplaceForHttpResponse(String matchString, String replaceString, Map<String, Object> params) throws IOException {
        // verify the required parameter 'matchString' is set
        if (matchString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'matchString' when calling transformDocumentDocxReplace");
        }// verify the required parameter 'replaceString' is set
        if (replaceString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'replaceString' when calling transformDocumentDocxReplace");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/transform/docx/replace-all");

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
    * Replace string in Word DOCX document, return edit session
    * Replace all instances of a string in an Office Word Document (docx).  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
    * <p><b>200</b> - OK
    * @param matchString String to search for and match against, to be replaced
    * @param replaceString String to replace the matched values with
    * @param inputFileUrl Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
    * @param matchCase Optional: True if the case should be matched, false for case insensitive match. Default is false.
    * @param inputFile Optional: Input file to perform the operation on.
    * @return DocumentTransformEditSession
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentTransformEditSession transformDocumentDocxReplaceEditSession(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, File inputFile) throws IOException {
        HttpResponse response = transformDocumentDocxReplaceEditSessionForHttpResponse(matchString, replaceString, inputFileUrl, matchCase, inputFile);
        TypeReference<DocumentTransformEditSession> typeRef = new TypeReference<DocumentTransformEditSession>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Replace string in Word DOCX document, return edit session
    * Replace all instances of a string in an Office Word Document (docx).  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
    * <p><b>200</b> - OK
    * @param matchString String to search for and match against, to be replaced
    * @param replaceString String to replace the matched values with
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentTransformEditSession
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentTransformEditSession transformDocumentDocxReplaceEditSession(String matchString, String replaceString, Map<String, Object> params) throws IOException {
        HttpResponse response = transformDocumentDocxReplaceEditSessionForHttpResponse(matchString, replaceString, params);
        TypeReference<DocumentTransformEditSession> typeRef = new TypeReference<DocumentTransformEditSession>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse transformDocumentDocxReplaceEditSessionForHttpResponse(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, File inputFile) throws IOException {
        // verify the required parameter 'matchString' is set
        if (matchString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'matchString' when calling transformDocumentDocxReplaceEditSession");
        }// verify the required parameter 'replaceString' is set
        if (replaceString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'replaceString' when calling transformDocumentDocxReplaceEditSession");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/transform/docx/replace-all/edit-session");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse transformDocumentDocxReplaceEditSessionForHttpResponse(String matchString, String replaceString, Map<String, Object> params) throws IOException {
        // verify the required parameter 'matchString' is set
        if (matchString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'matchString' when calling transformDocumentDocxReplaceEditSession");
        }// verify the required parameter 'replaceString' is set
        if (replaceString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'replaceString' when calling transformDocumentDocxReplaceEditSession");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/transform/docx/replace-all/edit-session");

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
    * Fill in data in a table in a Word DOCX document, return result
    * Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates
    * <p><b>200</b> - OK
    * @param request The request parameter
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] transformDocumentDocxTableFillIn(DocxTableTableFillRequest request) throws IOException {
        HttpResponse response = transformDocumentDocxTableFillInForHttpResponse(request);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Fill in data in a table in a Word DOCX document, return result
    * Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates
    * <p><b>200</b> - OK
    * @param request The request parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] transformDocumentDocxTableFillIn(DocxTableTableFillRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = transformDocumentDocxTableFillInForHttpResponse(request, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse transformDocumentDocxTableFillInForHttpResponse(DocxTableTableFillRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling transformDocumentDocxTableFillIn");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/transform/docx/table/fill/data");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse transformDocumentDocxTableFillInForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling transformDocumentDocxTableFillIn");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/transform/docx/table/fill/data");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse transformDocumentDocxTableFillInForHttpResponse(DocxTableTableFillRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling transformDocumentDocxTableFillIn");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/transform/docx/table/fill/data");

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
    * Fill in data in a table in a Word DOCX document, return edit session
    * Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates.  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
    * <p><b>200</b> - OK
    * @param request The request parameter
    * @return DocumentTransformEditSession
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentTransformEditSession transformDocumentDocxTableFillInEditSession(DocxTableTableFillRequest request) throws IOException {
        HttpResponse response = transformDocumentDocxTableFillInEditSessionForHttpResponse(request);
        TypeReference<DocumentTransformEditSession> typeRef = new TypeReference<DocumentTransformEditSession>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Fill in data in a table in a Word DOCX document, return edit session
    * Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates.  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
    * <p><b>200</b> - OK
    * @param request The request parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentTransformEditSession
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentTransformEditSession transformDocumentDocxTableFillInEditSession(DocxTableTableFillRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = transformDocumentDocxTableFillInEditSessionForHttpResponse(request, params);
        TypeReference<DocumentTransformEditSession> typeRef = new TypeReference<DocumentTransformEditSession>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse transformDocumentDocxTableFillInEditSessionForHttpResponse(DocxTableTableFillRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling transformDocumentDocxTableFillInEditSession");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/transform/docx/table/fill/data/edit-session");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse transformDocumentDocxTableFillInEditSessionForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling transformDocumentDocxTableFillInEditSession");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/transform/docx/table/fill/data/edit-session");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse transformDocumentDocxTableFillInEditSessionForHttpResponse(DocxTableTableFillRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling transformDocumentDocxTableFillInEditSession");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/transform/docx/table/fill/data/edit-session");

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
    * Fill in data in multiple tables in a Word DOCX document, return result
    * Replace placeholder rows in multiple tables in an Office Word Document (docx) using one or more templates
    * <p><b>200</b> - OK
    * @param request The request parameter
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] transformDocumentDocxTableFillInMulti(DocxTableTableFillMultiRequest request) throws IOException {
        HttpResponse response = transformDocumentDocxTableFillInMultiForHttpResponse(request);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Fill in data in multiple tables in a Word DOCX document, return result
    * Replace placeholder rows in multiple tables in an Office Word Document (docx) using one or more templates
    * <p><b>200</b> - OK
    * @param request The request parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] transformDocumentDocxTableFillInMulti(DocxTableTableFillMultiRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = transformDocumentDocxTableFillInMultiForHttpResponse(request, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse transformDocumentDocxTableFillInMultiForHttpResponse(DocxTableTableFillMultiRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling transformDocumentDocxTableFillInMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/transform/docx/table/fill/data/multi");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse transformDocumentDocxTableFillInMultiForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling transformDocumentDocxTableFillInMulti");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/transform/docx/table/fill/data/multi");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse transformDocumentDocxTableFillInMultiForHttpResponse(DocxTableTableFillMultiRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling transformDocumentDocxTableFillInMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/transform/docx/table/fill/data/multi");

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
    * Replace string in PowerPoint PPTX presentation, return result
    * Replace all instances of a string in an Office PowerPoint Document (pptx)
    * <p><b>200</b> - OK
    * @param matchString String to search for and match against, to be replaced
    * @param replaceString String to replace the matched values with
    * @param inputFileUrl Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
    * @param matchCase Optional: True if the case should be matched, false for case insensitive match. Default is false.
    * @param inputFile Optional: Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] transformDocumentPptxReplace(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, File inputFile) throws IOException {
        HttpResponse response = transformDocumentPptxReplaceForHttpResponse(matchString, replaceString, inputFileUrl, matchCase, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Replace string in PowerPoint PPTX presentation, return result
    * Replace all instances of a string in an Office PowerPoint Document (pptx)
    * <p><b>200</b> - OK
    * @param matchString String to search for and match against, to be replaced
    * @param replaceString String to replace the matched values with
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] transformDocumentPptxReplace(String matchString, String replaceString, Map<String, Object> params) throws IOException {
        HttpResponse response = transformDocumentPptxReplaceForHttpResponse(matchString, replaceString, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse transformDocumentPptxReplaceForHttpResponse(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, File inputFile) throws IOException {
        // verify the required parameter 'matchString' is set
        if (matchString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'matchString' when calling transformDocumentPptxReplace");
        }// verify the required parameter 'replaceString' is set
        if (replaceString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'replaceString' when calling transformDocumentPptxReplace");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/transform/pptx/replace-all");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse transformDocumentPptxReplaceForHttpResponse(String matchString, String replaceString, Map<String, Object> params) throws IOException {
        // verify the required parameter 'matchString' is set
        if (matchString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'matchString' when calling transformDocumentPptxReplace");
        }// verify the required parameter 'replaceString' is set
        if (replaceString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'replaceString' when calling transformDocumentPptxReplace");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/transform/pptx/replace-all");

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
