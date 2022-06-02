package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.AddPdfAnnotationRequest;
import java.math.BigDecimal;
import java.io.File;
import com.cloudmersive.client.gac.model.GetPdfAnnotationsResult;
import com.cloudmersive.client.gac.model.PdfFormFields;
import com.cloudmersive.client.gac.model.PdfMetadata;
import com.cloudmersive.client.gac.model.PdfTextByPageResult;
import com.cloudmersive.client.gac.model.SetPdfFormFieldsRequest;
import com.cloudmersive.client.gac.model.SetPdfMetadataRequest;

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
public class EditPdfApi {
    private ApiClient apiClient;

    public EditPdfApi() {
        this(new ApiClient());
    }

    public EditPdfApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Add one or more PDF annotations, comments in the PDF document
    * Adds one or more annotations, comments to a PDF document.
    * <p><b>200</b> - OK
    * @param request The request parameter
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfAddAnnotations(AddPdfAnnotationRequest request) throws IOException {
        HttpResponse response = editPdfAddAnnotationsForHttpResponse(request);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Add one or more PDF annotations, comments in the PDF document
    * Adds one or more annotations, comments to a PDF document.
    * <p><b>200</b> - OK
    * @param request The request parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfAddAnnotations(AddPdfAnnotationRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfAddAnnotationsForHttpResponse(request, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfAddAnnotationsForHttpResponse(AddPdfAnnotationRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editPdfAddAnnotations");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/annotations/add-item");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editPdfAddAnnotationsForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling editPdfAddAnnotations");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/annotations/add-item");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editPdfAddAnnotationsForHttpResponse(AddPdfAnnotationRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editPdfAddAnnotations");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/annotations/add-item");

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
    * Convert a PDF file to PDF/A
    * Converts the input PDF file to a PDF/A-1b or PDF/A-2b standardized PDF.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param conformanceLevel Optional: Select the conformance level for PDF/A - specify &#39;1b&#39; for PDF/A-1b or specify &#39;2b&#39; for PDF/A-2b; default is PDF/A-1b
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfConvertToPdfA(File inputFile, String conformanceLevel) throws IOException {
        HttpResponse response = editPdfConvertToPdfAForHttpResponse(inputFile, conformanceLevel);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert a PDF file to PDF/A
    * Converts the input PDF file to a PDF/A-1b or PDF/A-2b standardized PDF.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfConvertToPdfA(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfConvertToPdfAForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfConvertToPdfAForHttpResponse(File inputFile, String conformanceLevel) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfConvertToPdfA");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/optimize/pdf-a");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfConvertToPdfAForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfConvertToPdfA");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/optimize/pdf-a");

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
    * Decrypt and password-protect a PDF
    * Decrypt a PDF document with a password.  Decrypted PDF will no longer require a password to open.
    * <p><b>200</b> - OK
    * @param password Valid password for the PDF file
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfDecrypt(String password, File inputFile) throws IOException {
        HttpResponse response = editPdfDecryptForHttpResponse(password, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Decrypt and password-protect a PDF
    * Decrypt a PDF document with a password.  Decrypted PDF will no longer require a password to open.
    * <p><b>200</b> - OK
    * @param password Valid password for the PDF file
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfDecrypt(String password, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfDecryptForHttpResponse(password, inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfDecryptForHttpResponse(String password, File inputFile) throws IOException {
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new IllegalArgumentException("Missing the required parameter 'password' when calling editPdfDecrypt");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfDecrypt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/decrypt");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfDecryptForHttpResponse(String password, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new IllegalArgumentException("Missing the required parameter 'password' when calling editPdfDecrypt");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfDecrypt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/decrypt");

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
    * Remove, delete pages from a PDF document
    * Remove one or more pages from a PDF document
    * <p><b>200</b> - OK
    * @param pageStart Page number (1 based) to start deleting pages from (inclusive).
    * @param pageEnd Page number (1 based) to stop deleting pages from (inclusive).
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfDeletePages(Integer pageStart, Integer pageEnd, File inputFile) throws IOException {
        HttpResponse response = editPdfDeletePagesForHttpResponse(pageStart, pageEnd, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Remove, delete pages from a PDF document
    * Remove one or more pages from a PDF document
    * <p><b>200</b> - OK
    * @param pageStart Page number (1 based) to start deleting pages from (inclusive).
    * @param pageEnd Page number (1 based) to stop deleting pages from (inclusive).
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfDeletePages(Integer pageStart, Integer pageEnd, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfDeletePagesForHttpResponse(pageStart, pageEnd, inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfDeletePagesForHttpResponse(Integer pageStart, Integer pageEnd, File inputFile) throws IOException {
        // verify the required parameter 'pageStart' is set
        if (pageStart == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pageStart' when calling editPdfDeletePages");
        }// verify the required parameter 'pageEnd' is set
        if (pageEnd == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pageEnd' when calling editPdfDeletePages");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfDeletePages");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/pages/delete");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfDeletePagesForHttpResponse(Integer pageStart, Integer pageEnd, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'pageStart' is set
        if (pageStart == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pageStart' when calling editPdfDeletePages");
        }// verify the required parameter 'pageEnd' is set
        if (pageEnd == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pageEnd' when calling editPdfDeletePages");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfDeletePages");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/pages/delete");

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
    * Encrypt and password-protect a PDF
    * Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param userPassword Password of a user (reader) of the PDF file
    * @param ownerPassword Password of a owner (creator/editor) of the PDF file
    * @param encryptionKeyLength Possible values are \&quot;128\&quot; (128-bit RC4 encryption) and \&quot;256\&quot; (256-bit AES encryption).  Default is 256.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfEncrypt(File inputFile, String userPassword, String ownerPassword, String encryptionKeyLength) throws IOException {
        HttpResponse response = editPdfEncryptForHttpResponse(inputFile, userPassword, ownerPassword, encryptionKeyLength);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Encrypt and password-protect a PDF
    * Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfEncrypt(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfEncryptForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfEncryptForHttpResponse(File inputFile, String userPassword, String ownerPassword, String encryptionKeyLength) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfEncrypt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/encrypt");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfEncryptForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfEncrypt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/encrypt");

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
    * Get PDF annotations, including comments in the document
    * Enumerates the annotations, including comments and notes, in a PDF document.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return GetPdfAnnotationsResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetPdfAnnotationsResult editPdfGetAnnotations(File inputFile) throws IOException {
        HttpResponse response = editPdfGetAnnotationsForHttpResponse(inputFile);
        TypeReference<GetPdfAnnotationsResult> typeRef = new TypeReference<GetPdfAnnotationsResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get PDF annotations, including comments in the document
    * Enumerates the annotations, including comments and notes, in a PDF document.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetPdfAnnotationsResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetPdfAnnotationsResult editPdfGetAnnotations(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfGetAnnotationsForHttpResponse(inputFile, params);
        TypeReference<GetPdfAnnotationsResult> typeRef = new TypeReference<GetPdfAnnotationsResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfGetAnnotationsForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfGetAnnotations");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/annotations/list");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfGetAnnotationsForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfGetAnnotations");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/annotations/list");

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
    * Gets PDF Form fields and values
    * Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return PdfFormFields
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PdfFormFields editPdfGetFormFields(File inputFile) throws IOException {
        HttpResponse response = editPdfGetFormFieldsForHttpResponse(inputFile);
        TypeReference<PdfFormFields> typeRef = new TypeReference<PdfFormFields>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Gets PDF Form fields and values
    * Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PdfFormFields
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PdfFormFields editPdfGetFormFields(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfGetFormFieldsForHttpResponse(inputFile, params);
        TypeReference<PdfFormFields> typeRef = new TypeReference<PdfFormFields>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfGetFormFieldsForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfGetFormFields");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/form/get-fields");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfGetFormFieldsForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfGetFormFields");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/form/get-fields");

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
    * Get PDF document metadata
    * Returns the metadata from the PDF document, including Title, Author, etc.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return PdfMetadata
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PdfMetadata editPdfGetMetadata(File inputFile) throws IOException {
        HttpResponse response = editPdfGetMetadataForHttpResponse(inputFile);
        TypeReference<PdfMetadata> typeRef = new TypeReference<PdfMetadata>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get PDF document metadata
    * Returns the metadata from the PDF document, including Title, Author, etc.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PdfMetadata
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PdfMetadata editPdfGetMetadata(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfGetMetadataForHttpResponse(inputFile, params);
        TypeReference<PdfMetadata> typeRef = new TypeReference<PdfMetadata>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfGetMetadataForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfGetMetadata");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/get-metadata");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfGetMetadataForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfGetMetadata");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/get-metadata");

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
    * Get text in a PDF document by page
    * Gets the text in a PDF by page
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param textFormattingMode Optional; specify how whitespace should be handled when converting the document to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;preserveWhitespace&#39;.
    * @return PdfTextByPageResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PdfTextByPageResult editPdfGetPdfTextByPages(File inputFile, String textFormattingMode) throws IOException {
        HttpResponse response = editPdfGetPdfTextByPagesForHttpResponse(inputFile, textFormattingMode);
        TypeReference<PdfTextByPageResult> typeRef = new TypeReference<PdfTextByPageResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get text in a PDF document by page
    * Gets the text in a PDF by page
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PdfTextByPageResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PdfTextByPageResult editPdfGetPdfTextByPages(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfGetPdfTextByPagesForHttpResponse(inputFile, params);
        TypeReference<PdfTextByPageResult> typeRef = new TypeReference<PdfTextByPageResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfGetPdfTextByPagesForHttpResponse(File inputFile, String textFormattingMode) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfGetPdfTextByPages");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/pages/get-text");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfGetPdfTextByPagesForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfGetPdfTextByPages");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/pages/get-text");

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
    * Insert, copy pages from one PDF document into another
    * Copy one or more pages from one PDF document (source document) and insert them into a second PDF document (destination document).
    * <p><b>200</b> - OK
    * @param pageStartSource Page number (1 based) to start copying pages from (inclusive) in the Source file.
    * @param pageEndSource Page number (1 based) to stop copying pages pages from (inclusive) in the Source file.
    * @param pageInsertBeforeDesitnation Page number (1 based) to insert the pages before in the Destination file.
    * @param sourceFile Source PDF file to copy pages from.
    * @param destinationFile Destination PDF file to copy pages into.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfInsertPages(Integer pageStartSource, Integer pageEndSource, Integer pageInsertBeforeDesitnation, File sourceFile, File destinationFile) throws IOException {
        HttpResponse response = editPdfInsertPagesForHttpResponse(pageStartSource, pageEndSource, pageInsertBeforeDesitnation, sourceFile, destinationFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Insert, copy pages from one PDF document into another
    * Copy one or more pages from one PDF document (source document) and insert them into a second PDF document (destination document).
    * <p><b>200</b> - OK
    * @param pageStartSource Page number (1 based) to start copying pages from (inclusive) in the Source file.
    * @param pageEndSource Page number (1 based) to stop copying pages pages from (inclusive) in the Source file.
    * @param pageInsertBeforeDesitnation Page number (1 based) to insert the pages before in the Destination file.
    * @param sourceFile Source PDF file to copy pages from.
    * @param destinationFile Destination PDF file to copy pages into.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfInsertPages(Integer pageStartSource, Integer pageEndSource, Integer pageInsertBeforeDesitnation, File sourceFile, File destinationFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfInsertPagesForHttpResponse(pageStartSource, pageEndSource, pageInsertBeforeDesitnation, sourceFile, destinationFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfInsertPagesForHttpResponse(Integer pageStartSource, Integer pageEndSource, Integer pageInsertBeforeDesitnation, File sourceFile, File destinationFile) throws IOException {
        // verify the required parameter 'pageStartSource' is set
        if (pageStartSource == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pageStartSource' when calling editPdfInsertPages");
        }// verify the required parameter 'pageEndSource' is set
        if (pageEndSource == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pageEndSource' when calling editPdfInsertPages");
        }// verify the required parameter 'pageInsertBeforeDesitnation' is set
        if (pageInsertBeforeDesitnation == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pageInsertBeforeDesitnation' when calling editPdfInsertPages");
        }// verify the required parameter 'sourceFile' is set
        if (sourceFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sourceFile' when calling editPdfInsertPages");
        }// verify the required parameter 'destinationFile' is set
        if (destinationFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'destinationFile' when calling editPdfInsertPages");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/pages/insert");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfInsertPagesForHttpResponse(Integer pageStartSource, Integer pageEndSource, Integer pageInsertBeforeDesitnation, File sourceFile, File destinationFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'pageStartSource' is set
        if (pageStartSource == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pageStartSource' when calling editPdfInsertPages");
        }// verify the required parameter 'pageEndSource' is set
        if (pageEndSource == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pageEndSource' when calling editPdfInsertPages");
        }// verify the required parameter 'pageInsertBeforeDesitnation' is set
        if (pageInsertBeforeDesitnation == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pageInsertBeforeDesitnation' when calling editPdfInsertPages");
        }// verify the required parameter 'sourceFile' is set
        if (sourceFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sourceFile' when calling editPdfInsertPages");
        }// verify the required parameter 'destinationFile' is set
        if (destinationFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'destinationFile' when calling editPdfInsertPages");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/pages/insert");

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
    * Linearize and optimize a PDF for streaming download
    * Linearizes the content of a PDF to optimize it for streaming download, particularly over web streaming.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfLinearize(File inputFile) throws IOException {
        HttpResponse response = editPdfLinearizeForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Linearize and optimize a PDF for streaming download
    * Linearizes the content of a PDF to optimize it for streaming download, particularly over web streaming.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfLinearize(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfLinearizeForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfLinearizeForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfLinearize");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/optimize/linearize");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfLinearizeForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfLinearize");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/optimize/linearize");

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
    * Rasterize a PDF to an image-based PDF
    * Rasterize a PDF into an image-based PDF.  The output is a PDF where each page is comprised of a high-resolution image, with all text, figures and other components removed.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfRasterize(File inputFile) throws IOException {
        HttpResponse response = editPdfRasterizeForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Rasterize a PDF to an image-based PDF
    * Rasterize a PDF into an image-based PDF.  The output is a PDF where each page is comprised of a high-resolution image, with all text, figures and other components removed.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfRasterize(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfRasterizeForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfRasterizeForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfRasterize");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/rasterize");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfRasterizeForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfRasterize");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/rasterize");

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
    * Reduce the file size and optimize a PDF
    * Reduces the file size and optimizes the content of a PDF to minimize its file size.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param quality Quality level for the images in the PDF, ranging from 0.0 (low quality) to 1.0 (high quality); default is 0.3
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfReduceFileSize(File inputFile, BigDecimal quality) throws IOException {
        HttpResponse response = editPdfReduceFileSizeForHttpResponse(inputFile, quality);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Reduce the file size and optimize a PDF
    * Reduces the file size and optimizes the content of a PDF to minimize its file size.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfReduceFileSize(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfReduceFileSizeForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfReduceFileSizeForHttpResponse(File inputFile, BigDecimal quality) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfReduceFileSize");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/optimize/reduce-file-size");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfReduceFileSizeForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfReduceFileSize");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/optimize/reduce-file-size");

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
    * Remove all PDF annotations, including comments in the document
    * Removes all of the annotations, including comments and notes, in a PDF document.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfRemoveAllAnnotations(File inputFile) throws IOException {
        HttpResponse response = editPdfRemoveAllAnnotationsForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Remove all PDF annotations, including comments in the document
    * Removes all of the annotations, including comments and notes, in a PDF document.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfRemoveAllAnnotations(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfRemoveAllAnnotationsForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfRemoveAllAnnotationsForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfRemoveAllAnnotations");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/annotations/remove-all");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfRemoveAllAnnotationsForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfRemoveAllAnnotations");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/annotations/remove-all");

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
    * Remove a specific PDF annotation, comment in the document
    * Removes a specific annotation in a PDF document, using the AnnotationIndex.  To enumerate AnnotationIndex for all of the annotations in the PDF document, use the /edit/pdf/annotations/list API.
    * <p><b>200</b> - OK
    * @param annotationIndex The 0-based index of the annotation in the document
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfRemoveAnnotationItem(Integer annotationIndex, File inputFile) throws IOException {
        HttpResponse response = editPdfRemoveAnnotationItemForHttpResponse(annotationIndex, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Remove a specific PDF annotation, comment in the document
    * Removes a specific annotation in a PDF document, using the AnnotationIndex.  To enumerate AnnotationIndex for all of the annotations in the PDF document, use the /edit/pdf/annotations/list API.
    * <p><b>200</b> - OK
    * @param annotationIndex The 0-based index of the annotation in the document
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfRemoveAnnotationItem(Integer annotationIndex, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfRemoveAnnotationItemForHttpResponse(annotationIndex, inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfRemoveAnnotationItemForHttpResponse(Integer annotationIndex, File inputFile) throws IOException {
        // verify the required parameter 'annotationIndex' is set
        if (annotationIndex == null) {
            throw new IllegalArgumentException("Missing the required parameter 'annotationIndex' when calling editPdfRemoveAnnotationItem");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfRemoveAnnotationItem");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/annotations/remove-item");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfRemoveAnnotationItemForHttpResponse(Integer annotationIndex, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'annotationIndex' is set
        if (annotationIndex == null) {
            throw new IllegalArgumentException("Missing the required parameter 'annotationIndex' when calling editPdfRemoveAnnotationItem");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfRemoveAnnotationItem");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/annotations/remove-item");

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
    * Change PDF Document&#39;s Paper Size
    * Resizes a PDF document&#39;s paper size.
    * <p><b>200</b> - OK
    * @param paperSize The desired paper size for the resized PDF document. Size ranges from A7 (smallest) to A0 (largest).
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfResize(String paperSize, File inputFile) throws IOException {
        HttpResponse response = editPdfResizeForHttpResponse(paperSize, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Change PDF Document&#39;s Paper Size
    * Resizes a PDF document&#39;s paper size.
    * <p><b>200</b> - OK
    * @param paperSize The desired paper size for the resized PDF document. Size ranges from A7 (smallest) to A0 (largest).
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfResize(String paperSize, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfResizeForHttpResponse(paperSize, inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfResizeForHttpResponse(String paperSize, File inputFile) throws IOException {
        // verify the required parameter 'paperSize' is set
        if (paperSize == null) {
            throw new IllegalArgumentException("Missing the required parameter 'paperSize' when calling editPdfResize");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfResize");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/resize");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfResizeForHttpResponse(String paperSize, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'paperSize' is set
        if (paperSize == null) {
            throw new IllegalArgumentException("Missing the required parameter 'paperSize' when calling editPdfResize");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfResize");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/resize");

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
    * Rotate all pages in a PDF document
    * Rotate all of the pages in a PDF document by a multiple of 90 degrees
    * <p><b>200</b> - OK
    * @param rotationAngle The angle to rotate the page in degrees, must be a multiple of 90 degrees, e.g. 90, 180, 270, or -90, -180, -270, etc.
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfRotateAllPages(Integer rotationAngle, File inputFile) throws IOException {
        HttpResponse response = editPdfRotateAllPagesForHttpResponse(rotationAngle, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Rotate all pages in a PDF document
    * Rotate all of the pages in a PDF document by a multiple of 90 degrees
    * <p><b>200</b> - OK
    * @param rotationAngle The angle to rotate the page in degrees, must be a multiple of 90 degrees, e.g. 90, 180, 270, or -90, -180, -270, etc.
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfRotateAllPages(Integer rotationAngle, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfRotateAllPagesForHttpResponse(rotationAngle, inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfRotateAllPagesForHttpResponse(Integer rotationAngle, File inputFile) throws IOException {
        // verify the required parameter 'rotationAngle' is set
        if (rotationAngle == null) {
            throw new IllegalArgumentException("Missing the required parameter 'rotationAngle' when calling editPdfRotateAllPages");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfRotateAllPages");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/pages/rotate/all");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfRotateAllPagesForHttpResponse(Integer rotationAngle, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'rotationAngle' is set
        if (rotationAngle == null) {
            throw new IllegalArgumentException("Missing the required parameter 'rotationAngle' when calling editPdfRotateAllPages");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfRotateAllPages");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/pages/rotate/all");

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
    * Rotate a range, subset of pages in a PDF document
    * Rotate a range of specific pages in a PDF document by a multiple of 90 degrees
    * <p><b>200</b> - OK
    * @param rotationAngle The angle to rotate the page in degrees, must be a multiple of 90 degrees, e.g. 90, 180, 270, or -90, -180, -270, etc.
    * @param pageStart Page number (1 based) to start rotating pages from (inclusive).
    * @param pageEnd Page number (1 based) to stop rotating pages from (inclusive).
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfRotatePageRange(Integer rotationAngle, Integer pageStart, Integer pageEnd, File inputFile) throws IOException {
        HttpResponse response = editPdfRotatePageRangeForHttpResponse(rotationAngle, pageStart, pageEnd, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Rotate a range, subset of pages in a PDF document
    * Rotate a range of specific pages in a PDF document by a multiple of 90 degrees
    * <p><b>200</b> - OK
    * @param rotationAngle The angle to rotate the page in degrees, must be a multiple of 90 degrees, e.g. 90, 180, 270, or -90, -180, -270, etc.
    * @param pageStart Page number (1 based) to start rotating pages from (inclusive).
    * @param pageEnd Page number (1 based) to stop rotating pages from (inclusive).
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfRotatePageRange(Integer rotationAngle, Integer pageStart, Integer pageEnd, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfRotatePageRangeForHttpResponse(rotationAngle, pageStart, pageEnd, inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfRotatePageRangeForHttpResponse(Integer rotationAngle, Integer pageStart, Integer pageEnd, File inputFile) throws IOException {
        // verify the required parameter 'rotationAngle' is set
        if (rotationAngle == null) {
            throw new IllegalArgumentException("Missing the required parameter 'rotationAngle' when calling editPdfRotatePageRange");
        }// verify the required parameter 'pageStart' is set
        if (pageStart == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pageStart' when calling editPdfRotatePageRange");
        }// verify the required parameter 'pageEnd' is set
        if (pageEnd == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pageEnd' when calling editPdfRotatePageRange");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfRotatePageRange");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/pages/rotate/page-range");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfRotatePageRangeForHttpResponse(Integer rotationAngle, Integer pageStart, Integer pageEnd, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'rotationAngle' is set
        if (rotationAngle == null) {
            throw new IllegalArgumentException("Missing the required parameter 'rotationAngle' when calling editPdfRotatePageRange");
        }// verify the required parameter 'pageStart' is set
        if (pageStart == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pageStart' when calling editPdfRotatePageRange");
        }// verify the required parameter 'pageEnd' is set
        if (pageEnd == null) {
            throw new IllegalArgumentException("Missing the required parameter 'pageEnd' when calling editPdfRotatePageRange");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfRotatePageRange");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/pages/rotate/page-range");

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
    * Sets ands fills PDF Form field values
    * Fill in the form fields in a PDF form with specific values.  Use form/get-fields to enumerate the available fields and their data types in an input form.
    * <p><b>200</b> - OK
    * @param fieldValues The fieldValues parameter
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfSetFormFields(SetPdfFormFieldsRequest fieldValues) throws IOException {
        HttpResponse response = editPdfSetFormFieldsForHttpResponse(fieldValues);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Sets ands fills PDF Form field values
    * Fill in the form fields in a PDF form with specific values.  Use form/get-fields to enumerate the available fields and their data types in an input form.
    * <p><b>200</b> - OK
    * @param fieldValues The fieldValues parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfSetFormFields(SetPdfFormFieldsRequest fieldValues, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfSetFormFieldsForHttpResponse(fieldValues, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfSetFormFieldsForHttpResponse(SetPdfFormFieldsRequest fieldValues) throws IOException {
        // verify the required parameter 'fieldValues' is set
        if (fieldValues == null) {
            throw new IllegalArgumentException("Missing the required parameter 'fieldValues' when calling editPdfSetFormFields");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/form/set-fields");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(fieldValues);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editPdfSetFormFieldsForHttpResponse(java.io.InputStream fieldValues, String mediaType) throws IOException {
          // verify the required parameter 'fieldValues' is set
              if (fieldValues == null) {
              throw new IllegalArgumentException("Missing the required parameter 'fieldValues' when calling editPdfSetFormFields");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/form/set-fields");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = fieldValues == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, fieldValues);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editPdfSetFormFieldsForHttpResponse(SetPdfFormFieldsRequest fieldValues, Map<String, Object> params) throws IOException {
        // verify the required parameter 'fieldValues' is set
        if (fieldValues == null) {
            throw new IllegalArgumentException("Missing the required parameter 'fieldValues' when calling editPdfSetFormFields");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/form/set-fields");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(fieldValues);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Sets PDF document metadata
    * Sets (writes) metadata into the input PDF document, including Title, Author, etc.
    * <p><b>200</b> - OK
    * @param request The request parameter
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfSetMetadata(SetPdfMetadataRequest request) throws IOException {
        HttpResponse response = editPdfSetMetadataForHttpResponse(request);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Sets PDF document metadata
    * Sets (writes) metadata into the input PDF document, including Title, Author, etc.
    * <p><b>200</b> - OK
    * @param request The request parameter
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfSetMetadata(SetPdfMetadataRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfSetMetadataForHttpResponse(request, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfSetMetadataForHttpResponse(SetPdfMetadataRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editPdfSetMetadata");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/set-metadata");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse editPdfSetMetadataForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling editPdfSetMetadata");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/set-metadata");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse editPdfSetMetadataForHttpResponse(SetPdfMetadataRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling editPdfSetMetadata");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/set-metadata");

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
    * Encrypt, password-protect and set restricted permissions on a PDF
    * Encrypt a PDF document with a password, and set permissions on the PDF.  Set an owner password to control owner (editor/creator) permissions [required], and set a user (reader) password to control the viewer of the PDF [optional].  Set the reader password to null to omit the password.  Restrict or allow printing, copying content, document assembly, editing (read-only), form filling, modification of annotations, and degraded printing through document Digital Rights Management (DRM).
    * <p><b>200</b> - OK
    * @param ownerPassword Password of a owner (creator/editor) of the PDF file (required)
    * @param userPassword Password of a user (reader) of the PDF file (optional)
    * @param inputFile Input file to perform the operation on.
    * @param encryptionKeyLength Possible values are \&quot;128\&quot; (128-bit RC4 encryption) and \&quot;256\&quot; (256-bit AES encryption).  Default is 256.
    * @param allowPrinting Set to false to disable printing through DRM.  Default is true.
    * @param allowDocumentAssembly Set to false to disable document assembly through DRM.  Default is true.
    * @param allowContentExtraction Set to false to disable copying/extracting content out of the PDF through DRM.  Default is true.
    * @param allowFormFilling Set to false to disable filling out form fields in the PDF through DRM.  Default is true.
    * @param allowEditing Set to false to disable editing in the PDF through DRM (making the PDF read-only).  Default is true.
    * @param allowAnnotations Set to false to disable annotations and editing of annotations in the PDF through DRM.  Default is true.
    * @param allowDegradedPrinting Set to false to disable degraded printing of the PDF through DRM.  Default is true.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfSetPermissions(String ownerPassword, String userPassword, File inputFile, String encryptionKeyLength, Boolean allowPrinting, Boolean allowDocumentAssembly, Boolean allowContentExtraction, Boolean allowFormFilling, Boolean allowEditing, Boolean allowAnnotations, Boolean allowDegradedPrinting) throws IOException {
        HttpResponse response = editPdfSetPermissionsForHttpResponse(ownerPassword, userPassword, inputFile, encryptionKeyLength, allowPrinting, allowDocumentAssembly, allowContentExtraction, allowFormFilling, allowEditing, allowAnnotations, allowDegradedPrinting);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Encrypt, password-protect and set restricted permissions on a PDF
    * Encrypt a PDF document with a password, and set permissions on the PDF.  Set an owner password to control owner (editor/creator) permissions [required], and set a user (reader) password to control the viewer of the PDF [optional].  Set the reader password to null to omit the password.  Restrict or allow printing, copying content, document assembly, editing (read-only), form filling, modification of annotations, and degraded printing through document Digital Rights Management (DRM).
    * <p><b>200</b> - OK
    * @param ownerPassword Password of a owner (creator/editor) of the PDF file (required)
    * @param userPassword Password of a user (reader) of the PDF file (optional)
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfSetPermissions(String ownerPassword, String userPassword, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfSetPermissionsForHttpResponse(ownerPassword, userPassword, inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfSetPermissionsForHttpResponse(String ownerPassword, String userPassword, File inputFile, String encryptionKeyLength, Boolean allowPrinting, Boolean allowDocumentAssembly, Boolean allowContentExtraction, Boolean allowFormFilling, Boolean allowEditing, Boolean allowAnnotations, Boolean allowDegradedPrinting) throws IOException {
        // verify the required parameter 'ownerPassword' is set
        if (ownerPassword == null) {
            throw new IllegalArgumentException("Missing the required parameter 'ownerPassword' when calling editPdfSetPermissions");
        }// verify the required parameter 'userPassword' is set
        if (userPassword == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userPassword' when calling editPdfSetPermissions");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfSetPermissions");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/encrypt/set-permissions");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfSetPermissionsForHttpResponse(String ownerPassword, String userPassword, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'ownerPassword' is set
        if (ownerPassword == null) {
            throw new IllegalArgumentException("Missing the required parameter 'ownerPassword' when calling editPdfSetPermissions");
        }// verify the required parameter 'userPassword' is set
        if (userPassword == null) {
            throw new IllegalArgumentException("Missing the required parameter 'userPassword' when calling editPdfSetPermissions");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfSetPermissions");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/encrypt/set-permissions");

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
    * Add a text watermark to a PDF
    * Adds a text watermark to a PDF
    * <p><b>200</b> - OK
    * @param watermarkText Watermark text to add to the PDF (required)
    * @param inputFile Input file to perform the operation on.
    * @param fontName Font Family Name for the watermark text; default is Times New Roman
    * @param fontSize Font Size in points of the text; default is 150
    * @param fontColor Font color in hexadecimal or HTML color name; default is Red
    * @param fontTransparency Font transparency between 0.0 (completely transparent) to 1.0 (fully opaque); default is 0.5
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfWatermarkText(String watermarkText, File inputFile, String fontName, BigDecimal fontSize, String fontColor, BigDecimal fontTransparency) throws IOException {
        HttpResponse response = editPdfWatermarkTextForHttpResponse(watermarkText, inputFile, fontName, fontSize, fontColor, fontTransparency);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Add a text watermark to a PDF
    * Adds a text watermark to a PDF
    * <p><b>200</b> - OK
    * @param watermarkText Watermark text to add to the PDF (required)
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editPdfWatermarkText(String watermarkText, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = editPdfWatermarkTextForHttpResponse(watermarkText, inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editPdfWatermarkTextForHttpResponse(String watermarkText, File inputFile, String fontName, BigDecimal fontSize, String fontColor, BigDecimal fontTransparency) throws IOException {
        // verify the required parameter 'watermarkText' is set
        if (watermarkText == null) {
            throw new IllegalArgumentException("Missing the required parameter 'watermarkText' when calling editPdfWatermarkText");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfWatermarkText");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/watermark/text");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editPdfWatermarkTextForHttpResponse(String watermarkText, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'watermarkText' is set
        if (watermarkText == null) {
            throw new IllegalArgumentException("Missing the required parameter 'watermarkText' when calling editPdfWatermarkText");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling editPdfWatermarkText");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/pdf/watermark/text");

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
