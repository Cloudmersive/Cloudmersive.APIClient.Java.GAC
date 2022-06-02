package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.AppendXlsxRowRequest;
import com.cloudmersive.client.gac.model.AppendXlsxRowResponse;
import com.cloudmersive.client.gac.model.ClearXlsxCellRequest;
import com.cloudmersive.client.gac.model.ClearXlsxCellResponse;
import com.cloudmersive.client.gac.model.ClearXlsxRowRequest;
import com.cloudmersive.client.gac.model.ClearXlsxRowResponse;
import com.cloudmersive.client.gac.model.CreateBlankDocxRequest;
import com.cloudmersive.client.gac.model.CreateBlankDocxResponse;
import com.cloudmersive.client.gac.model.CreateBlankSpreadsheetRequest;
import com.cloudmersive.client.gac.model.CreateBlankSpreadsheetResponse;
import com.cloudmersive.client.gac.model.CreateSpreadsheetFromDataRequest;
import com.cloudmersive.client.gac.model.CreateSpreadsheetFromDataResponse;
import com.cloudmersive.client.gac.model.DeleteDocxTableRowRangeRequest;
import com.cloudmersive.client.gac.model.DeleteDocxTableRowRangeResponse;
import com.cloudmersive.client.gac.model.DeleteDocxTableRowRequest;
import com.cloudmersive.client.gac.model.DeleteDocxTableRowResponse;
import com.cloudmersive.client.gac.model.DisableSharedWorkbookRequest;
import com.cloudmersive.client.gac.model.DisableSharedWorkbookResponse;
import com.cloudmersive.client.gac.model.DocumentEditingEditSession;
import com.cloudmersive.client.gac.model.DocxInsertCommentOnParagraphRequest;
import com.cloudmersive.client.gac.model.DocxInsertImageRequest;
import com.cloudmersive.client.gac.model.DocxInsertImageResponse;
import com.cloudmersive.client.gac.model.DocxRemoveObjectRequest;
import com.cloudmersive.client.gac.model.DocxRemoveObjectResponse;
import com.cloudmersive.client.gac.model.DocxSetCustomMetadataPropertiesRequest;
import com.cloudmersive.client.gac.model.DocxSetFooterAddPageNumberRequest;
import com.cloudmersive.client.gac.model.DocxSetFooterRequest;
import com.cloudmersive.client.gac.model.DocxSetFooterResponse;
import com.cloudmersive.client.gac.model.DocxSetFormFieldsRequest;
import com.cloudmersive.client.gac.model.DocxSetHeaderRequest;
import com.cloudmersive.client.gac.model.DocxSetHeaderResponse;
import com.cloudmersive.client.gac.model.EnableSharedWorkbookRequest;
import com.cloudmersive.client.gac.model.EnableSharedWorkbookResponse;
import java.io.File;
import com.cloudmersive.client.gac.model.FindDocxParagraphRequest;
import com.cloudmersive.client.gac.model.FindDocxParagraphResponse;
import com.cloudmersive.client.gac.model.FinishEditingRequest;
import com.cloudmersive.client.gac.model.GetDocxBodyRequest;
import com.cloudmersive.client.gac.model.GetDocxBodyResponse;
import com.cloudmersive.client.gac.model.GetDocxCommentsHierarchicalResponse;
import com.cloudmersive.client.gac.model.GetDocxCommentsResponse;
import com.cloudmersive.client.gac.model.GetDocxContentControlsResponse;
import com.cloudmersive.client.gac.model.GetDocxGetCommentsHierarchicalRequest;
import com.cloudmersive.client.gac.model.GetDocxGetCommentsRequest;
import com.cloudmersive.client.gac.model.GetDocxGetFormFieldsResponse;
import com.cloudmersive.client.gac.model.GetDocxHeadersAndFootersRequest;
import com.cloudmersive.client.gac.model.GetDocxHeadersAndFootersResponse;
import com.cloudmersive.client.gac.model.GetDocxImagesRequest;
import com.cloudmersive.client.gac.model.GetDocxImagesResponse;
import com.cloudmersive.client.gac.model.GetDocxMetadataPropertiesResponse;
import com.cloudmersive.client.gac.model.GetDocxPagesRequest;
import com.cloudmersive.client.gac.model.GetDocxPagesResponse;
import com.cloudmersive.client.gac.model.GetDocxSectionsRequest;
import com.cloudmersive.client.gac.model.GetDocxSectionsResponse;
import com.cloudmersive.client.gac.model.GetDocxStylesRequest;
import com.cloudmersive.client.gac.model.GetDocxStylesResponse;
import com.cloudmersive.client.gac.model.GetDocxTableByIndexRequest;
import com.cloudmersive.client.gac.model.GetDocxTableByIndexResponse;
import com.cloudmersive.client.gac.model.GetDocxTableRowRequest;
import com.cloudmersive.client.gac.model.GetDocxTableRowResponse;
import com.cloudmersive.client.gac.model.GetDocxTablesRequest;
import com.cloudmersive.client.gac.model.GetDocxTablesResponse;
import com.cloudmersive.client.gac.model.GetMacrosResponse;
import com.cloudmersive.client.gac.model.GetXlsxCellByIdentifierRequest;
import com.cloudmersive.client.gac.model.GetXlsxCellByIdentifierResponse;
import com.cloudmersive.client.gac.model.GetXlsxCellRequest;
import com.cloudmersive.client.gac.model.GetXlsxCellResponse;
import com.cloudmersive.client.gac.model.GetXlsxColumnsRequest;
import com.cloudmersive.client.gac.model.GetXlsxColumnsResponse;
import com.cloudmersive.client.gac.model.GetXlsxImagesRequest;
import com.cloudmersive.client.gac.model.GetXlsxImagesResponse;
import com.cloudmersive.client.gac.model.GetXlsxRowsAndCellsRequest;
import com.cloudmersive.client.gac.model.GetXlsxRowsAndCellsResponse;
import com.cloudmersive.client.gac.model.GetXlsxSpecificRowRequest;
import com.cloudmersive.client.gac.model.GetXlsxSpecificRowResponse;
import com.cloudmersive.client.gac.model.GetXlsxStylesRequest;
import com.cloudmersive.client.gac.model.GetXlsxStylesResponse;
import com.cloudmersive.client.gac.model.GetXlsxWorksheetsRequest;
import com.cloudmersive.client.gac.model.GetXlsxWorksheetsResponse;
import com.cloudmersive.client.gac.model.InsertDocxCommentOnParagraphResponse;
import com.cloudmersive.client.gac.model.InsertDocxInsertParagraphRequest;
import com.cloudmersive.client.gac.model.InsertDocxInsertParagraphResponse;
import com.cloudmersive.client.gac.model.InsertDocxTableRowRequest;
import com.cloudmersive.client.gac.model.InsertDocxTableRowResponse;
import com.cloudmersive.client.gac.model.InsertDocxTablesRequest;
import com.cloudmersive.client.gac.model.InsertDocxTablesResponse;
import com.cloudmersive.client.gac.model.InsertXlsxWorksheetRequest;
import com.cloudmersive.client.gac.model.InsertXlsxWorksheetResponse;
import com.cloudmersive.client.gac.model.MultiReplaceStringRequest;
import com.cloudmersive.client.gac.model.RemoveDocxHeadersAndFootersRequest;
import com.cloudmersive.client.gac.model.RemoveDocxHeadersAndFootersResponse;
import com.cloudmersive.client.gac.model.RemoveDocxPagesRequest;
import com.cloudmersive.client.gac.model.RemovePptxSlidesRequest;
import com.cloudmersive.client.gac.model.RemoveXlsxWorksheetRequest;
import com.cloudmersive.client.gac.model.RenameXlsxWorksheetRequest;
import com.cloudmersive.client.gac.model.RenameXlsxWorksheetResponse;
import com.cloudmersive.client.gac.model.ReplaceDocxParagraphRequest;
import com.cloudmersive.client.gac.model.ReplaceDocxParagraphResponse;
import com.cloudmersive.client.gac.model.ReplaceStringRequest;
import com.cloudmersive.client.gac.model.SetXlsxCellByIdentifierRequest;
import com.cloudmersive.client.gac.model.SetXlsxCellByIdentifierResponse;
import com.cloudmersive.client.gac.model.SetXlsxCellRequest;
import com.cloudmersive.client.gac.model.SetXlsxCellResponse;
import com.cloudmersive.client.gac.model.UpdateDocxTableCellRequest;
import com.cloudmersive.client.gac.model.UpdateDocxTableCellResponse;
import com.cloudmersive.client.gac.model.UpdateDocxTableRowRequest;
import com.cloudmersive.client.gac.model.UpdateDocxTableRowResponse;

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
public class EditDocumentApi {
    private ApiClient apiClient;

    public EditDocumentApi() {
        this(new ApiClient());
    }

    public EditDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Begin editing a document
    * Uploads a document to Cloudmersive to begin a series of one or more editing operations.  To edit a document, first call Begin Editing on the document.  Then perform operations on the document using the secure URL returned from BeginEditing, such as Word DOCX Delete Pages and Insert Table.  Finally, perform finish editing on the URL to return the resulting edited document.  The editing URL is temporary and only stored in-memory cache, and will automatically expire from the cache after 30 minutes, and cannot be directly accessed.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return String
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public String editDocumentBeginEditing(File inputFile) throws IOException {
        HttpResponse response = editDocumentBeginEditingForHttpResponse(inputFile);
        TypeReference<String> typeRef = new TypeReference<String>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Begin editing a document
    * Uploads a document to Cloudmersive to begin a series of one or more editing operations.  To edit a document, first call Begin Editing on the document.  Then perform operations on the document using the secure URL returned from BeginEditing, such as Word DOCX Delete Pages and Insert Table.  Finally, perform finish editing on the URL to return the resulting edited document.  The editing URL is temporary and only stored in-memory cache, and will automatically expire from the cache after 30 minutes, and cannot be directly accessed.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return String
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public String editDocumentBeginEditing(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentBeginEditingForHttpResponse(inputFile, params);
        TypeReference<String> typeRef = new TypeReference<String>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentBeginEditingForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentBeginEditing");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/begin-editing");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editDocumentBeginEditingForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentBeginEditing");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/begin-editing");

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
    * Accept all tracked changes, revisions in a Word DOCX document
    * Accepts all tracked changes and revisions in a Word DOCX document.  This will accept all pending changes in the document when tracked changes is turned on.  Track changes will remain on (if it is on) after this oepration is completed.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxAcceptAllTrackChanges(File inputFile) throws IOException {
        HttpResponse response = editDocumentDocxAcceptAllTrackChangesForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Accept all tracked changes, revisions in a Word DOCX document
    * Accepts all tracked changes and revisions in a Word DOCX document.  This will accept all pending changes in the document when tracked changes is turned on.  Track changes will remain on (if it is on) after this oepration is completed.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxAcceptAllTrackChanges(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxAcceptAllTrackChangesForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxAcceptAllTrackChangesForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentDocxAcceptAllTrackChanges");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/track-changes/accept-all");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editDocumentDocxAcceptAllTrackChangesForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentDocxAcceptAllTrackChanges");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/track-changes/accept-all");

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
    * Get body from a Word DOCX document
    * Returns the body defined in the Word Document (DOCX) format file; this is the main content part of a DOCX document
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return GetDocxBodyResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxBodyResponse editDocumentDocxBody(GetDocxBodyRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxBodyForHttpResponse(reqConfig);
        TypeReference<GetDocxBodyResponse> typeRef = new TypeReference<GetDocxBodyResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get body from a Word DOCX document
    * Returns the body defined in the Word Document (DOCX) format file; this is the main content part of a DOCX document
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetDocxBodyResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxBodyResponse editDocumentDocxBody(GetDocxBodyRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxBodyForHttpResponse(reqConfig, params);
        TypeReference<GetDocxBodyResponse> typeRef = new TypeReference<GetDocxBodyResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxBodyForHttpResponse(GetDocxBodyRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxBody");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-body");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxBodyForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxBody");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-body");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxBodyForHttpResponse(GetDocxBodyRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxBody");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-body");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Create a blank Word DOCX document
    * Returns a blank Word DOCX Document format file.  The file is blank, with no contents.  Use additional editing commands such as Insert Paragraph or Insert Table or Insert Image to populate the document.
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return CreateBlankDocxResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CreateBlankDocxResponse editDocumentDocxCreateBlankDocument(CreateBlankDocxRequest input) throws IOException {
        HttpResponse response = editDocumentDocxCreateBlankDocumentForHttpResponse(input);
        TypeReference<CreateBlankDocxResponse> typeRef = new TypeReference<CreateBlankDocxResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create a blank Word DOCX document
    * Returns a blank Word DOCX Document format file.  The file is blank, with no contents.  Use additional editing commands such as Insert Paragraph or Insert Table or Insert Image to populate the document.
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CreateBlankDocxResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CreateBlankDocxResponse editDocumentDocxCreateBlankDocument(CreateBlankDocxRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxCreateBlankDocumentForHttpResponse(input, params);
        TypeReference<CreateBlankDocxResponse> typeRef = new TypeReference<CreateBlankDocxResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxCreateBlankDocumentForHttpResponse(CreateBlankDocxRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentDocxCreateBlankDocument");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/create/blank");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxCreateBlankDocumentForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentDocxCreateBlankDocument");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/create/blank");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxCreateBlankDocumentForHttpResponse(CreateBlankDocxRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentDocxCreateBlankDocument");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/create/blank");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Delete, remove pages from a Word DOCX document
    * Returns the edited Word Document in the Word Document (DOCX) format file with the specified pages removed
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxDeletePages(RemoveDocxPagesRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxDeletePagesForHttpResponse(reqConfig);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Delete, remove pages from a Word DOCX document
    * Returns the edited Word Document in the Word Document (DOCX) format file with the specified pages removed
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxDeletePages(RemoveDocxPagesRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxDeletePagesForHttpResponse(reqConfig, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxDeletePagesForHttpResponse(RemoveDocxPagesRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxDeletePages");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/delete-pages");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxDeletePagesForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxDeletePages");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/delete-pages");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxDeletePagesForHttpResponse(RemoveDocxPagesRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxDeletePages");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/delete-pages");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Deletes a table row in an existing table in a Word DOCX document
    * Deletes an existing table row in a Word DOCX Document and returns the result.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return DeleteDocxTableRowResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DeleteDocxTableRowResponse editDocumentDocxDeleteTableRow(DeleteDocxTableRowRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxDeleteTableRowForHttpResponse(reqConfig);
        TypeReference<DeleteDocxTableRowResponse> typeRef = new TypeReference<DeleteDocxTableRowResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Deletes a table row in an existing table in a Word DOCX document
    * Deletes an existing table row in a Word DOCX Document and returns the result.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DeleteDocxTableRowResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DeleteDocxTableRowResponse editDocumentDocxDeleteTableRow(DeleteDocxTableRowRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxDeleteTableRowForHttpResponse(reqConfig, params);
        TypeReference<DeleteDocxTableRowResponse> typeRef = new TypeReference<DeleteDocxTableRowResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxDeleteTableRowForHttpResponse(DeleteDocxTableRowRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxDeleteTableRow");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/delete-table-row");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxDeleteTableRowForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxDeleteTableRow");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/delete-table-row");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxDeleteTableRowForHttpResponse(DeleteDocxTableRowRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxDeleteTableRow");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/delete-table-row");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Deletes a range of multiple table rows in an existing table in a Word DOCX document
    * Deletes a range of 1 or more existing table rows in a Word DOCX Document and returns the result.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return DeleteDocxTableRowRangeResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DeleteDocxTableRowRangeResponse editDocumentDocxDeleteTableRowRange(DeleteDocxTableRowRangeRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxDeleteTableRowRangeForHttpResponse(reqConfig);
        TypeReference<DeleteDocxTableRowRangeResponse> typeRef = new TypeReference<DeleteDocxTableRowRangeResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Deletes a range of multiple table rows in an existing table in a Word DOCX document
    * Deletes a range of 1 or more existing table rows in a Word DOCX Document and returns the result.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DeleteDocxTableRowRangeResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DeleteDocxTableRowRangeResponse editDocumentDocxDeleteTableRowRange(DeleteDocxTableRowRangeRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxDeleteTableRowRangeForHttpResponse(reqConfig, params);
        TypeReference<DeleteDocxTableRowRangeResponse> typeRef = new TypeReference<DeleteDocxTableRowRangeResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxDeleteTableRowRangeForHttpResponse(DeleteDocxTableRowRangeRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxDeleteTableRowRange");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/delete-table-row/range");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxDeleteTableRowRangeForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxDeleteTableRowRange");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/delete-table-row/range");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxDeleteTableRowRangeForHttpResponse(DeleteDocxTableRowRangeRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxDeleteTableRowRange");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/delete-table-row/range");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Disable track changes, revisions in a Word DOCX document
    * Diables tracking of changes and revisions in a Word DOCX document, and accepts any pending changes.  Users editing the document will no longer see changes tracked automatically.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxDisableTrackChanges(File inputFile) throws IOException {
        HttpResponse response = editDocumentDocxDisableTrackChangesForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Disable track changes, revisions in a Word DOCX document
    * Diables tracking of changes and revisions in a Word DOCX document, and accepts any pending changes.  Users editing the document will no longer see changes tracked automatically.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxDisableTrackChanges(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxDisableTrackChangesForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxDisableTrackChangesForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentDocxDisableTrackChanges");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/track-changes/disable");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editDocumentDocxDisableTrackChangesForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentDocxDisableTrackChanges");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/track-changes/disable");

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
    * Enable track changes, revisions in a Word DOCX document
    * Enables tracking of changes and revisions in a Word DOCX document.  Users editing the document will see changes tracked automatically, with edits highlighted, and the ability to accept or reject changes made to the document.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxEnableTrackChanges(File inputFile) throws IOException {
        HttpResponse response = editDocumentDocxEnableTrackChangesForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Enable track changes, revisions in a Word DOCX document
    * Enables tracking of changes and revisions in a Word DOCX document.  Users editing the document will see changes tracked automatically, with edits highlighted, and the ability to accept or reject changes made to the document.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxEnableTrackChanges(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxEnableTrackChangesForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxEnableTrackChangesForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentDocxEnableTrackChanges");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/track-changes/enable");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editDocumentDocxEnableTrackChangesForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentDocxEnableTrackChanges");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/track-changes/enable");

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
    * Find matching paragraphs in a Word DOCX document
    * Returns the paragraphs defined in the Word Document (DOCX) format file that match the input criteria
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return FindDocxParagraphResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FindDocxParagraphResponse editDocumentDocxFindParagraph(FindDocxParagraphRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxFindParagraphForHttpResponse(reqConfig);
        TypeReference<FindDocxParagraphResponse> typeRef = new TypeReference<FindDocxParagraphResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Find matching paragraphs in a Word DOCX document
    * Returns the paragraphs defined in the Word Document (DOCX) format file that match the input criteria
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FindDocxParagraphResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FindDocxParagraphResponse editDocumentDocxFindParagraph(FindDocxParagraphRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxFindParagraphForHttpResponse(reqConfig, params);
        TypeReference<FindDocxParagraphResponse> typeRef = new TypeReference<FindDocxParagraphResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxFindParagraphForHttpResponse(FindDocxParagraphRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxFindParagraph");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/find/paragraph");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxFindParagraphForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxFindParagraph");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/find/paragraph");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxFindParagraphForHttpResponse(FindDocxParagraphRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxFindParagraph");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/find/paragraph");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get comments from a Word DOCX document as a flat list
    * Returns the comments and review annotations stored in the Word Document (DOCX) format file as a flattened list (not as a hierarchy of comments and replies).
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return GetDocxCommentsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxCommentsResponse editDocumentDocxGetComments(GetDocxGetCommentsRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxGetCommentsForHttpResponse(reqConfig);
        TypeReference<GetDocxCommentsResponse> typeRef = new TypeReference<GetDocxCommentsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get comments from a Word DOCX document as a flat list
    * Returns the comments and review annotations stored in the Word Document (DOCX) format file as a flattened list (not as a hierarchy of comments and replies).
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetDocxCommentsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxCommentsResponse editDocumentDocxGetComments(GetDocxGetCommentsRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxGetCommentsForHttpResponse(reqConfig, params);
        TypeReference<GetDocxCommentsResponse> typeRef = new TypeReference<GetDocxCommentsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxGetCommentsForHttpResponse(GetDocxGetCommentsRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetComments");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-comments/flat-list");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxGetCommentsForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetComments");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-comments/flat-list");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxGetCommentsForHttpResponse(GetDocxGetCommentsRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetComments");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-comments/flat-list");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get comments from a Word DOCX document hierarchically
    * Returns the comments and review annotations stored in the Word Document (DOCX) format file hierarchically, where reply comments are nested as children under top-level comments in the results returned.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return GetDocxCommentsHierarchicalResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxCommentsHierarchicalResponse editDocumentDocxGetCommentsHierarchical(GetDocxGetCommentsHierarchicalRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxGetCommentsHierarchicalForHttpResponse(reqConfig);
        TypeReference<GetDocxCommentsHierarchicalResponse> typeRef = new TypeReference<GetDocxCommentsHierarchicalResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get comments from a Word DOCX document hierarchically
    * Returns the comments and review annotations stored in the Word Document (DOCX) format file hierarchically, where reply comments are nested as children under top-level comments in the results returned.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetDocxCommentsHierarchicalResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxCommentsHierarchicalResponse editDocumentDocxGetCommentsHierarchical(GetDocxGetCommentsHierarchicalRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxGetCommentsHierarchicalForHttpResponse(reqConfig, params);
        TypeReference<GetDocxCommentsHierarchicalResponse> typeRef = new TypeReference<GetDocxCommentsHierarchicalResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxGetCommentsHierarchicalForHttpResponse(GetDocxGetCommentsHierarchicalRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetCommentsHierarchical");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-comments/hierarchical");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxGetCommentsHierarchicalForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetCommentsHierarchical");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-comments/hierarchical");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxGetCommentsHierarchicalForHttpResponse(GetDocxGetCommentsHierarchicalRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetCommentsHierarchical");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-comments/hierarchical");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get all content controls (form fields) and values in a Word DOCX document
    * Returns all the content controls, used for creating form fields, in a Office Word Document (docx)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return GetDocxContentControlsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxContentControlsResponse editDocumentDocxGetContentControls(File inputFile) throws IOException {
        HttpResponse response = editDocumentDocxGetContentControlsForHttpResponse(inputFile);
        TypeReference<GetDocxContentControlsResponse> typeRef = new TypeReference<GetDocxContentControlsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all content controls (form fields) and values in a Word DOCX document
    * Returns all the content controls, used for creating form fields, in a Office Word Document (docx)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetDocxContentControlsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxContentControlsResponse editDocumentDocxGetContentControls(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxGetContentControlsForHttpResponse(inputFile, params);
        TypeReference<GetDocxContentControlsResponse> typeRef = new TypeReference<GetDocxContentControlsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxGetContentControlsForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentDocxGetContentControls");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-content-controls");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editDocumentDocxGetContentControlsForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentDocxGetContentControls");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-content-controls");

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
    * Get all form fields in a Word DOCX document
    * Returns all the content controls, used for creating form fields, as well as handlebar style text-based form fields such as \&quot;{{FieldName}}\&quot;, in a Office Word Document (docx)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return GetDocxGetFormFieldsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxGetFormFieldsResponse editDocumentDocxGetFormFields(File inputFile) throws IOException {
        HttpResponse response = editDocumentDocxGetFormFieldsForHttpResponse(inputFile);
        TypeReference<GetDocxGetFormFieldsResponse> typeRef = new TypeReference<GetDocxGetFormFieldsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all form fields in a Word DOCX document
    * Returns all the content controls, used for creating form fields, as well as handlebar style text-based form fields such as \&quot;{{FieldName}}\&quot;, in a Office Word Document (docx)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetDocxGetFormFieldsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxGetFormFieldsResponse editDocumentDocxGetFormFields(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxGetFormFieldsForHttpResponse(inputFile, params);
        TypeReference<GetDocxGetFormFieldsResponse> typeRef = new TypeReference<GetDocxGetFormFieldsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxGetFormFieldsForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentDocxGetFormFields");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-form-fields");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editDocumentDocxGetFormFieldsForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentDocxGetFormFields");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-form-fields");

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
    * Get content of a footer from a Word DOCX document
    * Returns the footer content from a Word Document (DOCX) format file
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return GetDocxHeadersAndFootersResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxHeadersAndFootersResponse editDocumentDocxGetHeadersAndFooters(GetDocxHeadersAndFootersRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxGetHeadersAndFootersForHttpResponse(reqConfig);
        TypeReference<GetDocxHeadersAndFootersResponse> typeRef = new TypeReference<GetDocxHeadersAndFootersResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get content of a footer from a Word DOCX document
    * Returns the footer content from a Word Document (DOCX) format file
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetDocxHeadersAndFootersResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxHeadersAndFootersResponse editDocumentDocxGetHeadersAndFooters(GetDocxHeadersAndFootersRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxGetHeadersAndFootersForHttpResponse(reqConfig, params);
        TypeReference<GetDocxHeadersAndFootersResponse> typeRef = new TypeReference<GetDocxHeadersAndFootersResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxGetHeadersAndFootersForHttpResponse(GetDocxHeadersAndFootersRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetHeadersAndFooters");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-headers-and-footers");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxGetHeadersAndFootersForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetHeadersAndFooters");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-headers-and-footers");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxGetHeadersAndFootersForHttpResponse(GetDocxHeadersAndFootersRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetHeadersAndFooters");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-headers-and-footers");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get images from a Word DOCX document
    * Returns the images defined in the Word Document (DOCX) format file
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return GetDocxImagesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxImagesResponse editDocumentDocxGetImages(GetDocxImagesRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxGetImagesForHttpResponse(reqConfig);
        TypeReference<GetDocxImagesResponse> typeRef = new TypeReference<GetDocxImagesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get images from a Word DOCX document
    * Returns the images defined in the Word Document (DOCX) format file
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetDocxImagesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxImagesResponse editDocumentDocxGetImages(GetDocxImagesRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxGetImagesForHttpResponse(reqConfig, params);
        TypeReference<GetDocxImagesResponse> typeRef = new TypeReference<GetDocxImagesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxGetImagesForHttpResponse(GetDocxImagesRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetImages");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-images");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxGetImagesForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetImages");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-images");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxGetImagesForHttpResponse(GetDocxImagesRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetImages");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-images");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get macro information from a Word DOCX/DOCM document
    * Returns information about the Macros (e.g. VBA) defined in the Word Document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return GetMacrosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetMacrosResponse editDocumentDocxGetMacroInformation(File inputFile) throws IOException {
        HttpResponse response = editDocumentDocxGetMacroInformationForHttpResponse(inputFile);
        TypeReference<GetMacrosResponse> typeRef = new TypeReference<GetMacrosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get macro information from a Word DOCX/DOCM document
    * Returns information about the Macros (e.g. VBA) defined in the Word Document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetMacrosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetMacrosResponse editDocumentDocxGetMacroInformation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxGetMacroInformationForHttpResponse(inputFile, params);
        TypeReference<GetMacrosResponse> typeRef = new TypeReference<GetMacrosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxGetMacroInformationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentDocxGetMacroInformation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-macros");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editDocumentDocxGetMacroInformationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentDocxGetMacroInformation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-macros");

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
    * Get all metadata properties in Word DOCX document
    * Returns all the metadata properties in an Office Word Document (docx)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return GetDocxMetadataPropertiesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxMetadataPropertiesResponse editDocumentDocxGetMetadataProperties(File inputFile) throws IOException {
        HttpResponse response = editDocumentDocxGetMetadataPropertiesForHttpResponse(inputFile);
        TypeReference<GetDocxMetadataPropertiesResponse> typeRef = new TypeReference<GetDocxMetadataPropertiesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all metadata properties in Word DOCX document
    * Returns all the metadata properties in an Office Word Document (docx)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetDocxMetadataPropertiesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxMetadataPropertiesResponse editDocumentDocxGetMetadataProperties(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxGetMetadataPropertiesForHttpResponse(inputFile, params);
        TypeReference<GetDocxMetadataPropertiesResponse> typeRef = new TypeReference<GetDocxMetadataPropertiesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxGetMetadataPropertiesForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentDocxGetMetadataProperties");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-metadata");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editDocumentDocxGetMetadataPropertiesForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentDocxGetMetadataProperties");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-metadata");

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
    * Get sections from a Word DOCX document
    * Returns the sections defined in the Word Document (DOCX) format file
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return GetDocxSectionsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxSectionsResponse editDocumentDocxGetSections(GetDocxSectionsRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxGetSectionsForHttpResponse(reqConfig);
        TypeReference<GetDocxSectionsResponse> typeRef = new TypeReference<GetDocxSectionsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get sections from a Word DOCX document
    * Returns the sections defined in the Word Document (DOCX) format file
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetDocxSectionsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxSectionsResponse editDocumentDocxGetSections(GetDocxSectionsRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxGetSectionsForHttpResponse(reqConfig, params);
        TypeReference<GetDocxSectionsResponse> typeRef = new TypeReference<GetDocxSectionsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxGetSectionsForHttpResponse(GetDocxSectionsRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetSections");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-sections");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxGetSectionsForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetSections");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-sections");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxGetSectionsForHttpResponse(GetDocxSectionsRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetSections");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-sections");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get styles from a Word DOCX document
    * Returns the styles defined in the Word Document (DOCX) format file
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return GetDocxStylesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxStylesResponse editDocumentDocxGetStyles(GetDocxStylesRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxGetStylesForHttpResponse(reqConfig);
        TypeReference<GetDocxStylesResponse> typeRef = new TypeReference<GetDocxStylesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get styles from a Word DOCX document
    * Returns the styles defined in the Word Document (DOCX) format file
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetDocxStylesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxStylesResponse editDocumentDocxGetStyles(GetDocxStylesRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxGetStylesForHttpResponse(reqConfig, params);
        TypeReference<GetDocxStylesResponse> typeRef = new TypeReference<GetDocxStylesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxGetStylesForHttpResponse(GetDocxStylesRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetStyles");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-styles");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxGetStylesForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetStyles");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-styles");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxGetStylesForHttpResponse(GetDocxStylesRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetStyles");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-styles");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get a specific table by index in a Word DOCX document
    * Returns the specific table object by its 0-based index in an Office Word Document (DOCX)
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return GetDocxTableByIndexResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxTableByIndexResponse editDocumentDocxGetTableByIndex(GetDocxTableByIndexRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxGetTableByIndexForHttpResponse(reqConfig);
        TypeReference<GetDocxTableByIndexResponse> typeRef = new TypeReference<GetDocxTableByIndexResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get a specific table by index in a Word DOCX document
    * Returns the specific table object by its 0-based index in an Office Word Document (DOCX)
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetDocxTableByIndexResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxTableByIndexResponse editDocumentDocxGetTableByIndex(GetDocxTableByIndexRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxGetTableByIndexForHttpResponse(reqConfig, params);
        TypeReference<GetDocxTableByIndexResponse> typeRef = new TypeReference<GetDocxTableByIndexResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxGetTableByIndexForHttpResponse(GetDocxTableByIndexRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetTableByIndex");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-table/by-index");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxGetTableByIndexForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetTableByIndex");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-table/by-index");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxGetTableByIndexForHttpResponse(GetDocxTableByIndexRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetTableByIndex");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-table/by-index");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Gets the contents of an existing table row in an existing table in a Word DOCX document
    * Gets the contents of an existing table row in a Word DOCX Document and returns the result.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return GetDocxTableRowResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxTableRowResponse editDocumentDocxGetTableRow(GetDocxTableRowRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxGetTableRowForHttpResponse(reqConfig);
        TypeReference<GetDocxTableRowResponse> typeRef = new TypeReference<GetDocxTableRowResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Gets the contents of an existing table row in an existing table in a Word DOCX document
    * Gets the contents of an existing table row in a Word DOCX Document and returns the result.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetDocxTableRowResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxTableRowResponse editDocumentDocxGetTableRow(GetDocxTableRowRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxGetTableRowForHttpResponse(reqConfig, params);
        TypeReference<GetDocxTableRowResponse> typeRef = new TypeReference<GetDocxTableRowResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxGetTableRowForHttpResponse(GetDocxTableRowRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetTableRow");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-table-row");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxGetTableRowForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetTableRow");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-table-row");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxGetTableRowForHttpResponse(GetDocxTableRowRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetTableRow");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-table-row");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get all tables in Word DOCX document
    * Returns all the table objects in an Office Word Document (docx)
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return GetDocxTablesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxTablesResponse editDocumentDocxGetTables(GetDocxTablesRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxGetTablesForHttpResponse(reqConfig);
        TypeReference<GetDocxTablesResponse> typeRef = new TypeReference<GetDocxTablesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get all tables in Word DOCX document
    * Returns all the table objects in an Office Word Document (docx)
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetDocxTablesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxTablesResponse editDocumentDocxGetTables(GetDocxTablesRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxGetTablesForHttpResponse(reqConfig, params);
        TypeReference<GetDocxTablesResponse> typeRef = new TypeReference<GetDocxTablesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxGetTablesForHttpResponse(GetDocxTablesRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetTables");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-tables");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxGetTablesForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetTables");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-tables");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxGetTablesForHttpResponse(GetDocxTablesRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetTables");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-tables");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Insert a new comment into a Word DOCX document attached to a paragraph
    * Adds a new comment into a Word DOCX document attached to a paragraph and returns the result.  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return InsertDocxCommentOnParagraphResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public InsertDocxCommentOnParagraphResponse editDocumentDocxInsertCommentOnParagraph(DocxInsertCommentOnParagraphRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxInsertCommentOnParagraphForHttpResponse(reqConfig);
        TypeReference<InsertDocxCommentOnParagraphResponse> typeRef = new TypeReference<InsertDocxCommentOnParagraphResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Insert a new comment into a Word DOCX document attached to a paragraph
    * Adds a new comment into a Word DOCX document attached to a paragraph and returns the result.  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return InsertDocxCommentOnParagraphResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public InsertDocxCommentOnParagraphResponse editDocumentDocxInsertCommentOnParagraph(DocxInsertCommentOnParagraphRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxInsertCommentOnParagraphForHttpResponse(reqConfig, params);
        TypeReference<InsertDocxCommentOnParagraphResponse> typeRef = new TypeReference<InsertDocxCommentOnParagraphResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxInsertCommentOnParagraphForHttpResponse(DocxInsertCommentOnParagraphRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertCommentOnParagraph");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/insert-comment/on/paragraph");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxInsertCommentOnParagraphForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertCommentOnParagraph");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/insert-comment/on/paragraph");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxInsertCommentOnParagraphForHttpResponse(DocxInsertCommentOnParagraphRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertCommentOnParagraph");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/insert-comment/on/paragraph");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Insert image into a Word DOCX document
    * Set the footer in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return DocxInsertImageResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocxInsertImageResponse editDocumentDocxInsertImage(DocxInsertImageRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxInsertImageForHttpResponse(reqConfig);
        TypeReference<DocxInsertImageResponse> typeRef = new TypeReference<DocxInsertImageResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Insert image into a Word DOCX document
    * Set the footer in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocxInsertImageResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocxInsertImageResponse editDocumentDocxInsertImage(DocxInsertImageRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxInsertImageForHttpResponse(reqConfig, params);
        TypeReference<DocxInsertImageResponse> typeRef = new TypeReference<DocxInsertImageResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxInsertImageForHttpResponse(DocxInsertImageRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertImage");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/insert-image");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxInsertImageForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertImage");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/insert-image");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxInsertImageForHttpResponse(DocxInsertImageRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertImage");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/insert-image");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Insert a new paragraph into a Word DOCX document
    * Adds a new paragraph into a DOCX and returns the result.  You can insert at the beginning/end of a document, or before/after an existing object using its Path (location within the document).  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return InsertDocxInsertParagraphResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public InsertDocxInsertParagraphResponse editDocumentDocxInsertParagraph(InsertDocxInsertParagraphRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxInsertParagraphForHttpResponse(reqConfig);
        TypeReference<InsertDocxInsertParagraphResponse> typeRef = new TypeReference<InsertDocxInsertParagraphResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Insert a new paragraph into a Word DOCX document
    * Adds a new paragraph into a DOCX and returns the result.  You can insert at the beginning/end of a document, or before/after an existing object using its Path (location within the document).  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return InsertDocxInsertParagraphResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public InsertDocxInsertParagraphResponse editDocumentDocxInsertParagraph(InsertDocxInsertParagraphRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxInsertParagraphForHttpResponse(reqConfig, params);
        TypeReference<InsertDocxInsertParagraphResponse> typeRef = new TypeReference<InsertDocxInsertParagraphResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxInsertParagraphForHttpResponse(InsertDocxInsertParagraphRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertParagraph");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/insert-paragraph");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxInsertParagraphForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertParagraph");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/insert-paragraph");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxInsertParagraphForHttpResponse(InsertDocxInsertParagraphRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertParagraph");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/insert-paragraph");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Insert a new table into a Word DOCX document
    * Adds a new table into a DOCX and returns the result.  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return InsertDocxTablesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public InsertDocxTablesResponse editDocumentDocxInsertTable(InsertDocxTablesRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxInsertTableForHttpResponse(reqConfig);
        TypeReference<InsertDocxTablesResponse> typeRef = new TypeReference<InsertDocxTablesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Insert a new table into a Word DOCX document
    * Adds a new table into a DOCX and returns the result.  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return InsertDocxTablesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public InsertDocxTablesResponse editDocumentDocxInsertTable(InsertDocxTablesRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxInsertTableForHttpResponse(reqConfig, params);
        TypeReference<InsertDocxTablesResponse> typeRef = new TypeReference<InsertDocxTablesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxInsertTableForHttpResponse(InsertDocxTablesRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertTable");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/insert-table");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxInsertTableForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertTable");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/insert-table");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxInsertTableForHttpResponse(InsertDocxTablesRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertTable");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/insert-table");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Insert a new row into an existing table in a Word DOCX document
    * Adds a new table row into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return InsertDocxTableRowResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public InsertDocxTableRowResponse editDocumentDocxInsertTableRow(InsertDocxTableRowRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxInsertTableRowForHttpResponse(reqConfig);
        TypeReference<InsertDocxTableRowResponse> typeRef = new TypeReference<InsertDocxTableRowResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Insert a new row into an existing table in a Word DOCX document
    * Adds a new table row into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return InsertDocxTableRowResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public InsertDocxTableRowResponse editDocumentDocxInsertTableRow(InsertDocxTableRowRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxInsertTableRowForHttpResponse(reqConfig, params);
        TypeReference<InsertDocxTableRowResponse> typeRef = new TypeReference<InsertDocxTableRowResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxInsertTableRowForHttpResponse(InsertDocxTableRowRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertTableRow");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/insert-table-row");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxInsertTableRowForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertTableRow");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/insert-table-row");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxInsertTableRowForHttpResponse(InsertDocxTableRowRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertTableRow");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/insert-table-row");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get pages and content from a Word DOCX document
    * Returns the pages and contents of each page defined in the Word Document (DOCX) format file
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return GetDocxPagesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxPagesResponse editDocumentDocxPages(GetDocxPagesRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxPagesForHttpResponse(reqConfig);
        TypeReference<GetDocxPagesResponse> typeRef = new TypeReference<GetDocxPagesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get pages and content from a Word DOCX document
    * Returns the pages and contents of each page defined in the Word Document (DOCX) format file
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetDocxPagesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetDocxPagesResponse editDocumentDocxPages(GetDocxPagesRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxPagesForHttpResponse(reqConfig, params);
        TypeReference<GetDocxPagesResponse> typeRef = new TypeReference<GetDocxPagesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxPagesForHttpResponse(GetDocxPagesRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxPages");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-pages");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxPagesForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxPages");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-pages");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxPagesForHttpResponse(GetDocxPagesRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxPages");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/get-pages");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Remove all comments from a Word DOCX document
    * Removes all of the comments from a Word Document.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxRemoveAllComments(File inputFile) throws IOException {
        HttpResponse response = editDocumentDocxRemoveAllCommentsForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Remove all comments from a Word DOCX document
    * Removes all of the comments from a Word Document.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxRemoveAllComments(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxRemoveAllCommentsForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxRemoveAllCommentsForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentDocxRemoveAllComments");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/comments/remove-all");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editDocumentDocxRemoveAllCommentsForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentDocxRemoveAllComments");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/comments/remove-all");

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
    * Remove headers and footers from Word DOCX document
    * Remove all headers, or footers, or both from a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return RemoveDocxHeadersAndFootersResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public RemoveDocxHeadersAndFootersResponse editDocumentDocxRemoveHeadersAndFooters(RemoveDocxHeadersAndFootersRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxRemoveHeadersAndFootersForHttpResponse(reqConfig);
        TypeReference<RemoveDocxHeadersAndFootersResponse> typeRef = new TypeReference<RemoveDocxHeadersAndFootersResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Remove headers and footers from Word DOCX document
    * Remove all headers, or footers, or both from a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return RemoveDocxHeadersAndFootersResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public RemoveDocxHeadersAndFootersResponse editDocumentDocxRemoveHeadersAndFooters(RemoveDocxHeadersAndFootersRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxRemoveHeadersAndFootersForHttpResponse(reqConfig, params);
        TypeReference<RemoveDocxHeadersAndFootersResponse> typeRef = new TypeReference<RemoveDocxHeadersAndFootersResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxRemoveHeadersAndFootersForHttpResponse(RemoveDocxHeadersAndFootersRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxRemoveHeadersAndFooters");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/remove-headers-and-footers");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxRemoveHeadersAndFootersForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxRemoveHeadersAndFooters");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/remove-headers-and-footers");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxRemoveHeadersAndFootersForHttpResponse(RemoveDocxHeadersAndFootersRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxRemoveHeadersAndFooters");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/remove-headers-and-footers");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Delete any object in a Word DOCX document
    * Delete any object, such as a paragraph, table, image, etc. from a Word Document (DOCX).  Pass in the Path of the object you would like to delete.  You can call other functions such as Get-Tables, Get-Images, Get-Body, etc. to get the paths of the objects in the document.  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return DocxRemoveObjectResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocxRemoveObjectResponse editDocumentDocxRemoveObject(DocxRemoveObjectRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxRemoveObjectForHttpResponse(reqConfig);
        TypeReference<DocxRemoveObjectResponse> typeRef = new TypeReference<DocxRemoveObjectResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Delete any object in a Word DOCX document
    * Delete any object, such as a paragraph, table, image, etc. from a Word Document (DOCX).  Pass in the Path of the object you would like to delete.  You can call other functions such as Get-Tables, Get-Images, Get-Body, etc. to get the paths of the objects in the document.  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocxRemoveObjectResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocxRemoveObjectResponse editDocumentDocxRemoveObject(DocxRemoveObjectRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxRemoveObjectForHttpResponse(reqConfig, params);
        TypeReference<DocxRemoveObjectResponse> typeRef = new TypeReference<DocxRemoveObjectResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxRemoveObjectForHttpResponse(DocxRemoveObjectRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxRemoveObject");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/remove-object");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxRemoveObjectForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxRemoveObject");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/remove-object");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxRemoveObjectForHttpResponse(DocxRemoveObjectRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxRemoveObject");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/remove-object");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Replace string in Word DOCX document
    * Replace all instances of a string in an Office Word Document (docx)
    * <p><b>200</b> - OK
    * @param reqConfig Document string replacement configuration input
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxReplace(ReplaceStringRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxReplaceForHttpResponse(reqConfig);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Replace string in Word DOCX document
    * Replace all instances of a string in an Office Word Document (docx)
    * <p><b>200</b> - OK
    * @param reqConfig Document string replacement configuration input
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxReplace(ReplaceStringRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxReplaceForHttpResponse(reqConfig, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxReplaceForHttpResponse(ReplaceStringRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxReplace");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/replace-all");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxReplaceForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxReplace");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/replace-all");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxReplaceForHttpResponse(ReplaceStringRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxReplace");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/replace-all");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Replace multiple strings in Word DOCX document, return result
    * Replace all instances of multiple strings in an Office Word Document (docx)
    * <p><b>200</b> - OK
    * @param reqConfig Document string replacement configuration input
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxReplaceMulti(MultiReplaceStringRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxReplaceMultiForHttpResponse(reqConfig);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Replace multiple strings in Word DOCX document, return result
    * Replace all instances of multiple strings in an Office Word Document (docx)
    * <p><b>200</b> - OK
    * @param reqConfig Document string replacement configuration input
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxReplaceMulti(MultiReplaceStringRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxReplaceMultiForHttpResponse(reqConfig, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxReplaceMultiForHttpResponse(MultiReplaceStringRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxReplaceMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/replace-all/multi");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxReplaceMultiForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxReplaceMulti");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/replace-all/multi");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxReplaceMultiForHttpResponse(MultiReplaceStringRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxReplaceMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/replace-all/multi");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Replace multiple strings in Word DOCX document, return edit session
    * Replace all instances of multiple strings in an Office Word Document (docx).  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
    * <p><b>200</b> - OK
    * @param reqConfig Document string replacement configuration input
    * @return DocumentEditingEditSession
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentEditingEditSession editDocumentDocxReplaceMultiEditSession(MultiReplaceStringRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxReplaceMultiEditSessionForHttpResponse(reqConfig);
        TypeReference<DocumentEditingEditSession> typeRef = new TypeReference<DocumentEditingEditSession>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Replace multiple strings in Word DOCX document, return edit session
    * Replace all instances of multiple strings in an Office Word Document (docx).  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
    * <p><b>200</b> - OK
    * @param reqConfig Document string replacement configuration input
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocumentEditingEditSession
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocumentEditingEditSession editDocumentDocxReplaceMultiEditSession(MultiReplaceStringRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxReplaceMultiEditSessionForHttpResponse(reqConfig, params);
        TypeReference<DocumentEditingEditSession> typeRef = new TypeReference<DocumentEditingEditSession>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxReplaceMultiEditSessionForHttpResponse(MultiReplaceStringRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxReplaceMultiEditSession");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/replace-all/multi/edit-session");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxReplaceMultiEditSessionForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxReplaceMultiEditSession");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/replace-all/multi/edit-session");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxReplaceMultiEditSessionForHttpResponse(MultiReplaceStringRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxReplaceMultiEditSession");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/replace-all/multi/edit-session");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Replace matching paragraphs in a Word DOCX document
    * Returns the edited Word Document (DOCX) format file with the matching paragraphs replaced as requested.  Replace a paragraph with another object such as an image.  Useful for performing templating operations.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return ReplaceDocxParagraphResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReplaceDocxParagraphResponse editDocumentDocxReplaceParagraph(ReplaceDocxParagraphRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxReplaceParagraphForHttpResponse(reqConfig);
        TypeReference<ReplaceDocxParagraphResponse> typeRef = new TypeReference<ReplaceDocxParagraphResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Replace matching paragraphs in a Word DOCX document
    * Returns the edited Word Document (DOCX) format file with the matching paragraphs replaced as requested.  Replace a paragraph with another object such as an image.  Useful for performing templating operations.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ReplaceDocxParagraphResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReplaceDocxParagraphResponse editDocumentDocxReplaceParagraph(ReplaceDocxParagraphRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxReplaceParagraphForHttpResponse(reqConfig, params);
        TypeReference<ReplaceDocxParagraphResponse> typeRef = new TypeReference<ReplaceDocxParagraphResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxReplaceParagraphForHttpResponse(ReplaceDocxParagraphRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxReplaceParagraph");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/replace/paragraph");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxReplaceParagraphForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxReplaceParagraph");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/replace/paragraph");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxReplaceParagraphForHttpResponse(ReplaceDocxParagraphRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxReplaceParagraph");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/replace/paragraph");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Set custom property metadata properties in Word DOCX document
    * Sets the custom property metadata for the metadata properties in an Office Word Document (docx)
    * <p><b>200</b> - OK
    * @param input The input parameter
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxSetCustomMetadataProperties(DocxSetCustomMetadataPropertiesRequest input) throws IOException {
        HttpResponse response = editDocumentDocxSetCustomMetadataPropertiesForHttpResponse(input);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Set custom property metadata properties in Word DOCX document
    * Sets the custom property metadata for the metadata properties in an Office Word Document (docx)
    * <p><b>200</b> - OK
    * @param input The input parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxSetCustomMetadataProperties(DocxSetCustomMetadataPropertiesRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxSetCustomMetadataPropertiesForHttpResponse(input, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxSetCustomMetadataPropertiesForHttpResponse(DocxSetCustomMetadataPropertiesRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentDocxSetCustomMetadataProperties");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/set-metadata/custom-property");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxSetCustomMetadataPropertiesForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentDocxSetCustomMetadataProperties");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/set-metadata/custom-property");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxSetCustomMetadataPropertiesForHttpResponse(DocxSetCustomMetadataPropertiesRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentDocxSetCustomMetadataProperties");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/set-metadata/custom-property");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Set the footer in a Word DOCX document
    * Set the footer in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return DocxSetFooterResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocxSetFooterResponse editDocumentDocxSetFooter(DocxSetFooterRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxSetFooterForHttpResponse(reqConfig);
        TypeReference<DocxSetFooterResponse> typeRef = new TypeReference<DocxSetFooterResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Set the footer in a Word DOCX document
    * Set the footer in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocxSetFooterResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocxSetFooterResponse editDocumentDocxSetFooter(DocxSetFooterRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxSetFooterForHttpResponse(reqConfig, params);
        TypeReference<DocxSetFooterResponse> typeRef = new TypeReference<DocxSetFooterResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxSetFooterForHttpResponse(DocxSetFooterRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxSetFooter");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/set-footer");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxSetFooterForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxSetFooter");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/set-footer");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxSetFooterForHttpResponse(DocxSetFooterRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxSetFooter");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/set-footer");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Add page number to footer in a Word DOCX document
    * Set the footer in a Word Document (DOCX) to contain a page number.  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return DocxSetFooterResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocxSetFooterResponse editDocumentDocxSetFooterAddPageNumber(DocxSetFooterAddPageNumberRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxSetFooterAddPageNumberForHttpResponse(reqConfig);
        TypeReference<DocxSetFooterResponse> typeRef = new TypeReference<DocxSetFooterResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Add page number to footer in a Word DOCX document
    * Set the footer in a Word Document (DOCX) to contain a page number.  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocxSetFooterResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocxSetFooterResponse editDocumentDocxSetFooterAddPageNumber(DocxSetFooterAddPageNumberRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxSetFooterAddPageNumberForHttpResponse(reqConfig, params);
        TypeReference<DocxSetFooterResponse> typeRef = new TypeReference<DocxSetFooterResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxSetFooterAddPageNumberForHttpResponse(DocxSetFooterAddPageNumberRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxSetFooterAddPageNumber");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/set-footer/add-page-number");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxSetFooterAddPageNumberForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxSetFooterAddPageNumber");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/set-footer/add-page-number");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxSetFooterAddPageNumberForHttpResponse(DocxSetFooterAddPageNumberRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxSetFooterAddPageNumber");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/set-footer/add-page-number");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Set and fill values for form fields in a Word DOCX document
    * Modifies a Office Word Document (docx) by filling in form fields using the provided values.
    * <p><b>200</b> - OK
    * @param reqConfig The reqConfig parameter
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxSetFormFields(DocxSetFormFieldsRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxSetFormFieldsForHttpResponse(reqConfig);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Set and fill values for form fields in a Word DOCX document
    * Modifies a Office Word Document (docx) by filling in form fields using the provided values.
    * <p><b>200</b> - OK
    * @param reqConfig The reqConfig parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentDocxSetFormFields(DocxSetFormFieldsRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxSetFormFieldsForHttpResponse(reqConfig, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxSetFormFieldsForHttpResponse(DocxSetFormFieldsRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxSetFormFields");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/set-form-fields");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxSetFormFieldsForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxSetFormFields");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/set-form-fields");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxSetFormFieldsForHttpResponse(DocxSetFormFieldsRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxSetFormFields");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/set-form-fields");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Set the header in a Word DOCX document
    * Set the header in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return DocxSetHeaderResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocxSetHeaderResponse editDocumentDocxSetHeader(DocxSetHeaderRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxSetHeaderForHttpResponse(reqConfig);
        TypeReference<DocxSetHeaderResponse> typeRef = new TypeReference<DocxSetHeaderResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Set the header in a Word DOCX document
    * Set the header in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocxSetHeaderResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocxSetHeaderResponse editDocumentDocxSetHeader(DocxSetHeaderRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxSetHeaderForHttpResponse(reqConfig, params);
        TypeReference<DocxSetHeaderResponse> typeRef = new TypeReference<DocxSetHeaderResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxSetHeaderForHttpResponse(DocxSetHeaderRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxSetHeader");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/set-header");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxSetHeaderForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxSetHeader");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/set-header");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxSetHeaderForHttpResponse(DocxSetHeaderRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxSetHeader");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/set-header");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Update, set contents of a table cell in an existing table in a Word DOCX document
    * Sets the contents of a table cell into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return UpdateDocxTableCellResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UpdateDocxTableCellResponse editDocumentDocxUpdateTableCell(UpdateDocxTableCellRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxUpdateTableCellForHttpResponse(reqConfig);
        TypeReference<UpdateDocxTableCellResponse> typeRef = new TypeReference<UpdateDocxTableCellResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update, set contents of a table cell in an existing table in a Word DOCX document
    * Sets the contents of a table cell into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return UpdateDocxTableCellResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UpdateDocxTableCellResponse editDocumentDocxUpdateTableCell(UpdateDocxTableCellRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxUpdateTableCellForHttpResponse(reqConfig, params);
        TypeReference<UpdateDocxTableCellResponse> typeRef = new TypeReference<UpdateDocxTableCellResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxUpdateTableCellForHttpResponse(UpdateDocxTableCellRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxUpdateTableCell");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/update-table-cell");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxUpdateTableCellForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxUpdateTableCell");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/update-table-cell");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxUpdateTableCellForHttpResponse(UpdateDocxTableCellRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxUpdateTableCell");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/update-table-cell");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Update, set contents of a table row in an existing table in a Word DOCX document
    * Sets the contents of a table row into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @return UpdateDocxTableRowResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UpdateDocxTableRowResponse editDocumentDocxUpdateTableRow(UpdateDocxTableRowRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentDocxUpdateTableRowForHttpResponse(reqConfig);
        TypeReference<UpdateDocxTableRowResponse> typeRef = new TypeReference<UpdateDocxTableRowResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update, set contents of a table row in an existing table in a Word DOCX document
    * Sets the contents of a table row into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
    * <p><b>200</b> - OK
    * @param reqConfig Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return UpdateDocxTableRowResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UpdateDocxTableRowResponse editDocumentDocxUpdateTableRow(UpdateDocxTableRowRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentDocxUpdateTableRowForHttpResponse(reqConfig, params);
        TypeReference<UpdateDocxTableRowResponse> typeRef = new TypeReference<UpdateDocxTableRowResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentDocxUpdateTableRowForHttpResponse(UpdateDocxTableRowRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxUpdateTableRow");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/update-table-row");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentDocxUpdateTableRowForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxUpdateTableRow");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/update-table-row");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentDocxUpdateTableRowForHttpResponse(UpdateDocxTableRowRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentDocxUpdateTableRow");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/docx/update-table-row");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Finish editing document, and download result from document editing
    * Once done editing a document, download the result.  Begin editing a document by calling begin-editing, then perform operations, then call finish-editing to get the result.
    * <p><b>200</b> - OK
    * @param reqConfig Cloudmersive Document URL to complete editing on
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentFinishEditing(FinishEditingRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentFinishEditingForHttpResponse(reqConfig);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Finish editing document, and download result from document editing
    * Once done editing a document, download the result.  Begin editing a document by calling begin-editing, then perform operations, then call finish-editing to get the result.
    * <p><b>200</b> - OK
    * @param reqConfig Cloudmersive Document URL to complete editing on
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentFinishEditing(FinishEditingRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentFinishEditingForHttpResponse(reqConfig, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentFinishEditingForHttpResponse(FinishEditingRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentFinishEditing");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/finish-editing");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentFinishEditingForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentFinishEditing");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/finish-editing");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentFinishEditingForHttpResponse(FinishEditingRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentFinishEditing");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/finish-editing");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Delete, remove slides from a PowerPoint PPTX presentation document
    * Edits the input PowerPoint PPTX presentation document to remove the specified slides
    * <p><b>200</b> - OK
    * @param reqConfig Presentation input request
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentPptxDeleteSlides(RemovePptxSlidesRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentPptxDeleteSlidesForHttpResponse(reqConfig);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Delete, remove slides from a PowerPoint PPTX presentation document
    * Edits the input PowerPoint PPTX presentation document to remove the specified slides
    * <p><b>200</b> - OK
    * @param reqConfig Presentation input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentPptxDeleteSlides(RemovePptxSlidesRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentPptxDeleteSlidesForHttpResponse(reqConfig, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentPptxDeleteSlidesForHttpResponse(RemovePptxSlidesRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentPptxDeleteSlides");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pptx/delete-slides");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentPptxDeleteSlidesForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentPptxDeleteSlides");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pptx/delete-slides");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentPptxDeleteSlidesForHttpResponse(RemovePptxSlidesRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentPptxDeleteSlides");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pptx/delete-slides");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get macro information from a PowerPoint PPTX/PPTM presentation document
    * Returns information about the Macros (e.g. VBA) defined in the PowerPoint Document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return GetMacrosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetMacrosResponse editDocumentPptxGetMacroInformation(File inputFile) throws IOException {
        HttpResponse response = editDocumentPptxGetMacroInformationForHttpResponse(inputFile);
        TypeReference<GetMacrosResponse> typeRef = new TypeReference<GetMacrosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get macro information from a PowerPoint PPTX/PPTM presentation document
    * Returns information about the Macros (e.g. VBA) defined in the PowerPoint Document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetMacrosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetMacrosResponse editDocumentPptxGetMacroInformation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentPptxGetMacroInformationForHttpResponse(inputFile, params);
        TypeReference<GetMacrosResponse> typeRef = new TypeReference<GetMacrosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentPptxGetMacroInformationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentPptxGetMacroInformation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pptx/get-macros");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editDocumentPptxGetMacroInformationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentPptxGetMacroInformation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pptx/get-macros");

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
    * Replace string in PowerPoint PPTX presentation
    * Replace all instances of a string in an Office PowerPoint Document (pptx)
    * <p><b>200</b> - OK
    * @param reqConfig Replacement document configuration input
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentPptxReplace(ReplaceStringRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentPptxReplaceForHttpResponse(reqConfig);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Replace string in PowerPoint PPTX presentation
    * Replace all instances of a string in an Office PowerPoint Document (pptx)
    * <p><b>200</b> - OK
    * @param reqConfig Replacement document configuration input
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentPptxReplace(ReplaceStringRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentPptxReplaceForHttpResponse(reqConfig, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentPptxReplaceForHttpResponse(ReplaceStringRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentPptxReplace");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pptx/replace-all");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentPptxReplaceForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentPptxReplace");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pptx/replace-all");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentPptxReplaceForHttpResponse(ReplaceStringRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentPptxReplace");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pptx/replace-all");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Append row to a Excel XLSX spreadsheet, worksheet
    * Appends a row to the end of an Excel Spreadsheet worksheet.
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return AppendXlsxRowResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AppendXlsxRowResponse editDocumentXlsxAppendRow(AppendXlsxRowRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxAppendRowForHttpResponse(input);
        TypeReference<AppendXlsxRowResponse> typeRef = new TypeReference<AppendXlsxRowResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Append row to a Excel XLSX spreadsheet, worksheet
    * Appends a row to the end of an Excel Spreadsheet worksheet.
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AppendXlsxRowResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AppendXlsxRowResponse editDocumentXlsxAppendRow(AppendXlsxRowRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxAppendRowForHttpResponse(input, params);
        TypeReference<AppendXlsxRowResponse> typeRef = new TypeReference<AppendXlsxRowResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxAppendRowForHttpResponse(AppendXlsxRowRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxAppendRow");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/append-row");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxAppendRowForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxAppendRow");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/append-row");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxAppendRowForHttpResponse(AppendXlsxRowRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxAppendRow");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/append-row");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Clear cell contents in an Excel XLSX spreadsheet, worksheet by index
    * Clears, sets to blank, the contents of a specific cell in an Excel XLSX spreadsheet, worksheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return ClearXlsxCellResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ClearXlsxCellResponse editDocumentXlsxClearCellByIndex(ClearXlsxCellRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxClearCellByIndexForHttpResponse(input);
        TypeReference<ClearXlsxCellResponse> typeRef = new TypeReference<ClearXlsxCellResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Clear cell contents in an Excel XLSX spreadsheet, worksheet by index
    * Clears, sets to blank, the contents of a specific cell in an Excel XLSX spreadsheet, worksheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ClearXlsxCellResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ClearXlsxCellResponse editDocumentXlsxClearCellByIndex(ClearXlsxCellRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxClearCellByIndexForHttpResponse(input, params);
        TypeReference<ClearXlsxCellResponse> typeRef = new TypeReference<ClearXlsxCellResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxClearCellByIndexForHttpResponse(ClearXlsxCellRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxClearCellByIndex");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/clear-cell/by-index");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxClearCellByIndexForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxClearCellByIndex");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/clear-cell/by-index");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxClearCellByIndexForHttpResponse(ClearXlsxCellRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxClearCellByIndex");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/clear-cell/by-index");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Clear row from a Excel XLSX spreadsheet, worksheet
    * Clears data from a specific row in the Excel Spreadsheet worksheet, leaving a blank row. Use the Get Rows And Cells API to enumerate available rows in a spreadsheet.
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return ClearXlsxRowResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ClearXlsxRowResponse editDocumentXlsxClearRow(ClearXlsxRowRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxClearRowForHttpResponse(input);
        TypeReference<ClearXlsxRowResponse> typeRef = new TypeReference<ClearXlsxRowResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Clear row from a Excel XLSX spreadsheet, worksheet
    * Clears data from a specific row in the Excel Spreadsheet worksheet, leaving a blank row. Use the Get Rows And Cells API to enumerate available rows in a spreadsheet.
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ClearXlsxRowResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ClearXlsxRowResponse editDocumentXlsxClearRow(ClearXlsxRowRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxClearRowForHttpResponse(input, params);
        TypeReference<ClearXlsxRowResponse> typeRef = new TypeReference<ClearXlsxRowResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxClearRowForHttpResponse(ClearXlsxRowRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxClearRow");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/clear-row");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxClearRowForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxClearRow");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/clear-row");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxClearRowForHttpResponse(ClearXlsxRowRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxClearRow");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/clear-row");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Create a blank Excel XLSX spreadsheet
    * Returns a blank Excel XLSX Spreadsheet (XLSX) format file
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return CreateBlankSpreadsheetResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CreateBlankSpreadsheetResponse editDocumentXlsxCreateBlankSpreadsheet(CreateBlankSpreadsheetRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxCreateBlankSpreadsheetForHttpResponse(input);
        TypeReference<CreateBlankSpreadsheetResponse> typeRef = new TypeReference<CreateBlankSpreadsheetResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create a blank Excel XLSX spreadsheet
    * Returns a blank Excel XLSX Spreadsheet (XLSX) format file
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CreateBlankSpreadsheetResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CreateBlankSpreadsheetResponse editDocumentXlsxCreateBlankSpreadsheet(CreateBlankSpreadsheetRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxCreateBlankSpreadsheetForHttpResponse(input, params);
        TypeReference<CreateBlankSpreadsheetResponse> typeRef = new TypeReference<CreateBlankSpreadsheetResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxCreateBlankSpreadsheetForHttpResponse(CreateBlankSpreadsheetRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxCreateBlankSpreadsheet");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/create/blank");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxCreateBlankSpreadsheetForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxCreateBlankSpreadsheet");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/create/blank");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxCreateBlankSpreadsheetForHttpResponse(CreateBlankSpreadsheetRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxCreateBlankSpreadsheet");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/create/blank");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Create a new Excel XLSX spreadsheet from column and row data
    * Returns a new Excel XLSX Spreadsheet (XLSX) format file populated with column and row data specified as input
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return CreateSpreadsheetFromDataResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CreateSpreadsheetFromDataResponse editDocumentXlsxCreateSpreadsheetFromData(CreateSpreadsheetFromDataRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxCreateSpreadsheetFromDataForHttpResponse(input);
        TypeReference<CreateSpreadsheetFromDataResponse> typeRef = new TypeReference<CreateSpreadsheetFromDataResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create a new Excel XLSX spreadsheet from column and row data
    * Returns a new Excel XLSX Spreadsheet (XLSX) format file populated with column and row data specified as input
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CreateSpreadsheetFromDataResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CreateSpreadsheetFromDataResponse editDocumentXlsxCreateSpreadsheetFromData(CreateSpreadsheetFromDataRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxCreateSpreadsheetFromDataForHttpResponse(input, params);
        TypeReference<CreateSpreadsheetFromDataResponse> typeRef = new TypeReference<CreateSpreadsheetFromDataResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxCreateSpreadsheetFromDataForHttpResponse(CreateSpreadsheetFromDataRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxCreateSpreadsheetFromData");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/create/from/data");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxCreateSpreadsheetFromDataForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxCreateSpreadsheetFromData");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/create/from/data");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxCreateSpreadsheetFromDataForHttpResponse(CreateSpreadsheetFromDataRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxCreateSpreadsheetFromData");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/create/from/data");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Delete, remove worksheet from an Excel XLSX spreadsheet document
    * Edits the input Excel XLSX spreadsheet document to remove the specified worksheet (tab).  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.
    * <p><b>200</b> - OK
    * @param reqConfig Spreadsheet input request
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentXlsxDeleteWorksheet(RemoveXlsxWorksheetRequest reqConfig) throws IOException {
        HttpResponse response = editDocumentXlsxDeleteWorksheetForHttpResponse(reqConfig);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Delete, remove worksheet from an Excel XLSX spreadsheet document
    * Edits the input Excel XLSX spreadsheet document to remove the specified worksheet (tab).  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.
    * <p><b>200</b> - OK
    * @param reqConfig Spreadsheet input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editDocumentXlsxDeleteWorksheet(RemoveXlsxWorksheetRequest reqConfig, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxDeleteWorksheetForHttpResponse(reqConfig, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxDeleteWorksheetForHttpResponse(RemoveXlsxWorksheetRequest reqConfig) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentXlsxDeleteWorksheet");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/delete-worksheet");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxDeleteWorksheetForHttpResponse(java.io.InputStream reqConfig, String mediaType) throws IOException {
          // verify the required parameter 'reqConfig' is set
              if (reqConfig == null) {
              throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentXlsxDeleteWorksheet");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/delete-worksheet");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = reqConfig == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, reqConfig);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxDeleteWorksheetForHttpResponse(RemoveXlsxWorksheetRequest reqConfig, Map<String, Object> params) throws IOException {
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new IllegalArgumentException("Missing the required parameter 'reqConfig' when calling editDocumentXlsxDeleteWorksheet");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/delete-worksheet");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(reqConfig);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Disable Shared Workbook (legacy) in Excel XLSX spreadsheet
    * Disable the Shared Workbook (legacy) mode in an Excel XLSX spreadsheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return DisableSharedWorkbookResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DisableSharedWorkbookResponse editDocumentXlsxDisableSharedWorkbook(DisableSharedWorkbookRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxDisableSharedWorkbookForHttpResponse(input);
        TypeReference<DisableSharedWorkbookResponse> typeRef = new TypeReference<DisableSharedWorkbookResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Disable Shared Workbook (legacy) in Excel XLSX spreadsheet
    * Disable the Shared Workbook (legacy) mode in an Excel XLSX spreadsheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DisableSharedWorkbookResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DisableSharedWorkbookResponse editDocumentXlsxDisableSharedWorkbook(DisableSharedWorkbookRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxDisableSharedWorkbookForHttpResponse(input, params);
        TypeReference<DisableSharedWorkbookResponse> typeRef = new TypeReference<DisableSharedWorkbookResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxDisableSharedWorkbookForHttpResponse(DisableSharedWorkbookRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxDisableSharedWorkbook");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/configuration/disable-shared-workbook");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxDisableSharedWorkbookForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxDisableSharedWorkbook");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/configuration/disable-shared-workbook");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxDisableSharedWorkbookForHttpResponse(DisableSharedWorkbookRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxDisableSharedWorkbook");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/configuration/disable-shared-workbook");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Enable Shared Workbook (legacy) in Excel XLSX spreadsheet
    * Enables the Shared Workbook (legacy) mode in an Excel XLSX spreadsheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return EnableSharedWorkbookResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public EnableSharedWorkbookResponse editDocumentXlsxEnableSharedWorkbook(EnableSharedWorkbookRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxEnableSharedWorkbookForHttpResponse(input);
        TypeReference<EnableSharedWorkbookResponse> typeRef = new TypeReference<EnableSharedWorkbookResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Enable Shared Workbook (legacy) in Excel XLSX spreadsheet
    * Enables the Shared Workbook (legacy) mode in an Excel XLSX spreadsheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return EnableSharedWorkbookResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public EnableSharedWorkbookResponse editDocumentXlsxEnableSharedWorkbook(EnableSharedWorkbookRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxEnableSharedWorkbookForHttpResponse(input, params);
        TypeReference<EnableSharedWorkbookResponse> typeRef = new TypeReference<EnableSharedWorkbookResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxEnableSharedWorkbookForHttpResponse(EnableSharedWorkbookRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxEnableSharedWorkbook");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/configuration/enable-shared-workbook");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxEnableSharedWorkbookForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxEnableSharedWorkbook");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/configuration/enable-shared-workbook");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxEnableSharedWorkbookForHttpResponse(EnableSharedWorkbookRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxEnableSharedWorkbook");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/configuration/enable-shared-workbook");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get cell from an Excel XLSX spreadsheet, worksheet by cell identifier
    * Returns the value of a specific cell based on its identifier (e.g. A1, B22, C33, etc.) in the Excel Spreadsheet worksheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return GetXlsxCellByIdentifierResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetXlsxCellByIdentifierResponse editDocumentXlsxGetCellByIdentifier(GetXlsxCellByIdentifierRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxGetCellByIdentifierForHttpResponse(input);
        TypeReference<GetXlsxCellByIdentifierResponse> typeRef = new TypeReference<GetXlsxCellByIdentifierResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get cell from an Excel XLSX spreadsheet, worksheet by cell identifier
    * Returns the value of a specific cell based on its identifier (e.g. A1, B22, C33, etc.) in the Excel Spreadsheet worksheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetXlsxCellByIdentifierResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetXlsxCellByIdentifierResponse editDocumentXlsxGetCellByIdentifier(GetXlsxCellByIdentifierRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxGetCellByIdentifierForHttpResponse(input, params);
        TypeReference<GetXlsxCellByIdentifierResponse> typeRef = new TypeReference<GetXlsxCellByIdentifierResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxGetCellByIdentifierForHttpResponse(GetXlsxCellByIdentifierRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetCellByIdentifier");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-cell/by-identifier");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxGetCellByIdentifierForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetCellByIdentifier");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-cell/by-identifier");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxGetCellByIdentifierForHttpResponse(GetXlsxCellByIdentifierRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetCellByIdentifier");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-cell/by-identifier");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get cell from an Excel XLSX spreadsheet, worksheet by index
    * Returns the value and definition of a specific cell in a specific row in the Excel Spreadsheet worksheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return GetXlsxCellResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetXlsxCellResponse editDocumentXlsxGetCellByIndex(GetXlsxCellRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxGetCellByIndexForHttpResponse(input);
        TypeReference<GetXlsxCellResponse> typeRef = new TypeReference<GetXlsxCellResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get cell from an Excel XLSX spreadsheet, worksheet by index
    * Returns the value and definition of a specific cell in a specific row in the Excel Spreadsheet worksheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetXlsxCellResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetXlsxCellResponse editDocumentXlsxGetCellByIndex(GetXlsxCellRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxGetCellByIndexForHttpResponse(input, params);
        TypeReference<GetXlsxCellResponse> typeRef = new TypeReference<GetXlsxCellResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxGetCellByIndexForHttpResponse(GetXlsxCellRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetCellByIndex");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-cell/by-index");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxGetCellByIndexForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetCellByIndex");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-cell/by-index");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxGetCellByIndexForHttpResponse(GetXlsxCellRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetCellByIndex");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-cell/by-index");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get columns from a Excel XLSX spreadsheet, worksheet
    * Returns the columns defined in the Excel Spreadsheet worksheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return GetXlsxColumnsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetXlsxColumnsResponse editDocumentXlsxGetColumns(GetXlsxColumnsRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxGetColumnsForHttpResponse(input);
        TypeReference<GetXlsxColumnsResponse> typeRef = new TypeReference<GetXlsxColumnsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get columns from a Excel XLSX spreadsheet, worksheet
    * Returns the columns defined in the Excel Spreadsheet worksheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetXlsxColumnsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetXlsxColumnsResponse editDocumentXlsxGetColumns(GetXlsxColumnsRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxGetColumnsForHttpResponse(input, params);
        TypeReference<GetXlsxColumnsResponse> typeRef = new TypeReference<GetXlsxColumnsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxGetColumnsForHttpResponse(GetXlsxColumnsRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetColumns");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-columns");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxGetColumnsForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetColumns");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-columns");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxGetColumnsForHttpResponse(GetXlsxColumnsRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetColumns");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-columns");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get images from a Excel XLSX spreadsheet, worksheet
    * Returns the images defined in the Excel Spreadsheet worksheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return GetXlsxImagesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetXlsxImagesResponse editDocumentXlsxGetImages(GetXlsxImagesRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxGetImagesForHttpResponse(input);
        TypeReference<GetXlsxImagesResponse> typeRef = new TypeReference<GetXlsxImagesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get images from a Excel XLSX spreadsheet, worksheet
    * Returns the images defined in the Excel Spreadsheet worksheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetXlsxImagesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetXlsxImagesResponse editDocumentXlsxGetImages(GetXlsxImagesRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxGetImagesForHttpResponse(input, params);
        TypeReference<GetXlsxImagesResponse> typeRef = new TypeReference<GetXlsxImagesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxGetImagesForHttpResponse(GetXlsxImagesRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetImages");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-images");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxGetImagesForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetImages");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-images");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxGetImagesForHttpResponse(GetXlsxImagesRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetImages");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-images");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get macro information from a Excel XLSX/XLSM spreadsheet, worksheet
    * Returns information about the Macros (e.g. VBA) defined in the Excel Spreadsheet
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return GetMacrosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetMacrosResponse editDocumentXlsxGetMacroInformation(File inputFile) throws IOException {
        HttpResponse response = editDocumentXlsxGetMacroInformationForHttpResponse(inputFile);
        TypeReference<GetMacrosResponse> typeRef = new TypeReference<GetMacrosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get macro information from a Excel XLSX/XLSM spreadsheet, worksheet
    * Returns information about the Macros (e.g. VBA) defined in the Excel Spreadsheet
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetMacrosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetMacrosResponse editDocumentXlsxGetMacroInformation(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxGetMacroInformationForHttpResponse(inputFile, params);
        TypeReference<GetMacrosResponse> typeRef = new TypeReference<GetMacrosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxGetMacroInformationForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentXlsxGetMacroInformation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-macros");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editDocumentXlsxGetMacroInformationForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editDocumentXlsxGetMacroInformation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-macros");

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
    * Get rows and cells from a Excel XLSX spreadsheet, worksheet
    * Returns the rows and cells defined in the Excel Spreadsheet worksheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return GetXlsxRowsAndCellsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetXlsxRowsAndCellsResponse editDocumentXlsxGetRowsAndCells(GetXlsxRowsAndCellsRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxGetRowsAndCellsForHttpResponse(input);
        TypeReference<GetXlsxRowsAndCellsResponse> typeRef = new TypeReference<GetXlsxRowsAndCellsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get rows and cells from a Excel XLSX spreadsheet, worksheet
    * Returns the rows and cells defined in the Excel Spreadsheet worksheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetXlsxRowsAndCellsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetXlsxRowsAndCellsResponse editDocumentXlsxGetRowsAndCells(GetXlsxRowsAndCellsRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxGetRowsAndCellsForHttpResponse(input, params);
        TypeReference<GetXlsxRowsAndCellsResponse> typeRef = new TypeReference<GetXlsxRowsAndCellsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxGetRowsAndCellsForHttpResponse(GetXlsxRowsAndCellsRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetRowsAndCells");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-rows-and-cells");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxGetRowsAndCellsForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetRowsAndCells");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-rows-and-cells");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxGetRowsAndCellsForHttpResponse(GetXlsxRowsAndCellsRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetRowsAndCells");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-rows-and-cells");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get a specific row from a Excel XLSX spreadsheet, worksheet by path
    * Returns the specific row and its cells defined in the Excel Spreadsheet worksheet based on the specified path.
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return GetXlsxSpecificRowResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetXlsxSpecificRowResponse editDocumentXlsxGetSpecificRow(GetXlsxSpecificRowRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxGetSpecificRowForHttpResponse(input);
        TypeReference<GetXlsxSpecificRowResponse> typeRef = new TypeReference<GetXlsxSpecificRowResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get a specific row from a Excel XLSX spreadsheet, worksheet by path
    * Returns the specific row and its cells defined in the Excel Spreadsheet worksheet based on the specified path.
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetXlsxSpecificRowResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetXlsxSpecificRowResponse editDocumentXlsxGetSpecificRow(GetXlsxSpecificRowRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxGetSpecificRowForHttpResponse(input, params);
        TypeReference<GetXlsxSpecificRowResponse> typeRef = new TypeReference<GetXlsxSpecificRowResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxGetSpecificRowForHttpResponse(GetXlsxSpecificRowRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetSpecificRow");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-specific-row");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxGetSpecificRowForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetSpecificRow");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-specific-row");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxGetSpecificRowForHttpResponse(GetXlsxSpecificRowRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetSpecificRow");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-specific-row");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get styles from a Excel XLSX spreadsheet, worksheet
    * Returns the style defined in the Excel Spreadsheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return GetXlsxStylesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetXlsxStylesResponse editDocumentXlsxGetStyles(GetXlsxStylesRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxGetStylesForHttpResponse(input);
        TypeReference<GetXlsxStylesResponse> typeRef = new TypeReference<GetXlsxStylesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get styles from a Excel XLSX spreadsheet, worksheet
    * Returns the style defined in the Excel Spreadsheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetXlsxStylesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetXlsxStylesResponse editDocumentXlsxGetStyles(GetXlsxStylesRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxGetStylesForHttpResponse(input, params);
        TypeReference<GetXlsxStylesResponse> typeRef = new TypeReference<GetXlsxStylesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxGetStylesForHttpResponse(GetXlsxStylesRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetStyles");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-styles");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxGetStylesForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetStyles");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-styles");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxGetStylesForHttpResponse(GetXlsxStylesRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetStyles");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-styles");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get worksheets from a Excel XLSX spreadsheet
    * Returns the worksheets (tabs) defined in the Excel Spreadsheet (XLSX) format file
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return GetXlsxWorksheetsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetXlsxWorksheetsResponse editDocumentXlsxGetWorksheets(GetXlsxWorksheetsRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxGetWorksheetsForHttpResponse(input);
        TypeReference<GetXlsxWorksheetsResponse> typeRef = new TypeReference<GetXlsxWorksheetsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get worksheets from a Excel XLSX spreadsheet
    * Returns the worksheets (tabs) defined in the Excel Spreadsheet (XLSX) format file
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetXlsxWorksheetsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetXlsxWorksheetsResponse editDocumentXlsxGetWorksheets(GetXlsxWorksheetsRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxGetWorksheetsForHttpResponse(input, params);
        TypeReference<GetXlsxWorksheetsResponse> typeRef = new TypeReference<GetXlsxWorksheetsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxGetWorksheetsForHttpResponse(GetXlsxWorksheetsRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetWorksheets");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-worksheets");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxGetWorksheetsForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetWorksheets");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-worksheets");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxGetWorksheetsForHttpResponse(GetXlsxWorksheetsRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxGetWorksheets");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/get-worksheets");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Insert a new worksheet into an Excel XLSX spreadsheet
    * Inserts a new worksheet into an Excel Spreadsheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return InsertXlsxWorksheetResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public InsertXlsxWorksheetResponse editDocumentXlsxInsertWorksheet(InsertXlsxWorksheetRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxInsertWorksheetForHttpResponse(input);
        TypeReference<InsertXlsxWorksheetResponse> typeRef = new TypeReference<InsertXlsxWorksheetResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Insert a new worksheet into an Excel XLSX spreadsheet
    * Inserts a new worksheet into an Excel Spreadsheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return InsertXlsxWorksheetResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public InsertXlsxWorksheetResponse editDocumentXlsxInsertWorksheet(InsertXlsxWorksheetRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxInsertWorksheetForHttpResponse(input, params);
        TypeReference<InsertXlsxWorksheetResponse> typeRef = new TypeReference<InsertXlsxWorksheetResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxInsertWorksheetForHttpResponse(InsertXlsxWorksheetRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxInsertWorksheet");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/insert-worksheet");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxInsertWorksheetForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxInsertWorksheet");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/insert-worksheet");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxInsertWorksheetForHttpResponse(InsertXlsxWorksheetRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxInsertWorksheet");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/insert-worksheet");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Rename a specific worksheet in a Excel XLSX spreadsheet
    * Edits the input Excel XLSX spreadsheet document to rename a specified worksheet (tab).  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return RenameXlsxWorksheetResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public RenameXlsxWorksheetResponse editDocumentXlsxRenameWorksheet(RenameXlsxWorksheetRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxRenameWorksheetForHttpResponse(input);
        TypeReference<RenameXlsxWorksheetResponse> typeRef = new TypeReference<RenameXlsxWorksheetResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Rename a specific worksheet in a Excel XLSX spreadsheet
    * Edits the input Excel XLSX spreadsheet document to rename a specified worksheet (tab).  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return RenameXlsxWorksheetResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public RenameXlsxWorksheetResponse editDocumentXlsxRenameWorksheet(RenameXlsxWorksheetRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxRenameWorksheetForHttpResponse(input, params);
        TypeReference<RenameXlsxWorksheetResponse> typeRef = new TypeReference<RenameXlsxWorksheetResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxRenameWorksheetForHttpResponse(RenameXlsxWorksheetRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxRenameWorksheet");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/rename-worksheet");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxRenameWorksheetForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxRenameWorksheet");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/rename-worksheet");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxRenameWorksheetForHttpResponse(RenameXlsxWorksheetRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxRenameWorksheet");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/rename-worksheet");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Set, update cell contents in an Excel XLSX spreadsheet, worksheet by cell identifier
    * Sets, updates the contents of a specific cell in an Excel XLSX spreadsheet, worksheet using its cell identifier (e.g. A1, B22, C33) in the worksheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return SetXlsxCellByIdentifierResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SetXlsxCellByIdentifierResponse editDocumentXlsxSetCellByIdentifier(SetXlsxCellByIdentifierRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxSetCellByIdentifierForHttpResponse(input);
        TypeReference<SetXlsxCellByIdentifierResponse> typeRef = new TypeReference<SetXlsxCellByIdentifierResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Set, update cell contents in an Excel XLSX spreadsheet, worksheet by cell identifier
    * Sets, updates the contents of a specific cell in an Excel XLSX spreadsheet, worksheet using its cell identifier (e.g. A1, B22, C33) in the worksheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SetXlsxCellByIdentifierResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SetXlsxCellByIdentifierResponse editDocumentXlsxSetCellByIdentifier(SetXlsxCellByIdentifierRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxSetCellByIdentifierForHttpResponse(input, params);
        TypeReference<SetXlsxCellByIdentifierResponse> typeRef = new TypeReference<SetXlsxCellByIdentifierResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxSetCellByIdentifierForHttpResponse(SetXlsxCellByIdentifierRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxSetCellByIdentifier");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/set-cell/by-identifier");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxSetCellByIdentifierForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxSetCellByIdentifier");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/set-cell/by-identifier");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxSetCellByIdentifierForHttpResponse(SetXlsxCellByIdentifierRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxSetCellByIdentifier");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/set-cell/by-identifier");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Set, update cell contents in an Excel XLSX spreadsheet, worksheet by index
    * Sets, updates the contents of a specific cell in an Excel XLSX spreadsheet, worksheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @return SetXlsxCellResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SetXlsxCellResponse editDocumentXlsxSetCellByIndex(SetXlsxCellRequest input) throws IOException {
        HttpResponse response = editDocumentXlsxSetCellByIndexForHttpResponse(input);
        TypeReference<SetXlsxCellResponse> typeRef = new TypeReference<SetXlsxCellResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Set, update cell contents in an Excel XLSX spreadsheet, worksheet by index
    * Sets, updates the contents of a specific cell in an Excel XLSX spreadsheet, worksheet
    * <p><b>200</b> - OK
    * @param input Document input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SetXlsxCellResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SetXlsxCellResponse editDocumentXlsxSetCellByIndex(SetXlsxCellRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = editDocumentXlsxSetCellByIndexForHttpResponse(input, params);
        TypeReference<SetXlsxCellResponse> typeRef = new TypeReference<SetXlsxCellResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editDocumentXlsxSetCellByIndexForHttpResponse(SetXlsxCellRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxSetCellByIndex");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/set-cell/by-index");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editDocumentXlsxSetCellByIndexForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxSetCellByIndex");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/set-cell/by-index");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editDocumentXlsxSetCellByIndexForHttpResponse(SetXlsxCellRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling editDocumentXlsxSetCellByIndex");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/xlsx/set-cell/by-index");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
