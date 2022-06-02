package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.CreateZipArchiveRequest;
import java.io.File;
import com.cloudmersive.client.gac.model.ZipEncryptionAdvancedRequest;
import com.cloudmersive.client.gac.model.ZipExtractResponse;

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
public class ZipArchiveApi {
    private ApiClient apiClient;

    public ZipArchiveApi() {
        this(new ApiClient());
    }

    public ZipArchiveApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Compress files to create a new zip archive
    * Create a new zip archive by compressing input files.
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
    public byte[] zipArchiveZipCreate(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        HttpResponse response = zipArchiveZipCreateForHttpResponse(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Compress files to create a new zip archive
    * Create a new zip archive by compressing input files.
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] zipArchiveZipCreate(File inputFile1, Map<String, Object> params) throws IOException {
        HttpResponse response = zipArchiveZipCreateForHttpResponse(inputFile1, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse zipArchiveZipCreateForHttpResponse(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling zipArchiveZipCreate");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/archive/zip/create");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse zipArchiveZipCreateForHttpResponse(File inputFile1, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling zipArchiveZipCreate");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/archive/zip/create");

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
    * Compress files and folders to create a new zip archive with advanced options
    * Create a new zip archive by compressing input files, folders and leverage advanced options to control the structure of the resulting zip archive.
    * <p><b>200</b> - OK
    * @param request Input request
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object zipArchiveZipCreateAdvanced(CreateZipArchiveRequest request) throws IOException {
        HttpResponse response = zipArchiveZipCreateAdvancedForHttpResponse(request);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Compress files and folders to create a new zip archive with advanced options
    * Create a new zip archive by compressing input files, folders and leverage advanced options to control the structure of the resulting zip archive.
    * <p><b>200</b> - OK
    * @param request Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object zipArchiveZipCreateAdvanced(CreateZipArchiveRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = zipArchiveZipCreateAdvancedForHttpResponse(request, params);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse zipArchiveZipCreateAdvancedForHttpResponse(CreateZipArchiveRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling zipArchiveZipCreateAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/archive/zip/create/advanced");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse zipArchiveZipCreateAdvancedForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling zipArchiveZipCreateAdvanced");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/archive/zip/create/advanced");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse zipArchiveZipCreateAdvancedForHttpResponse(CreateZipArchiveRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling zipArchiveZipCreateAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/archive/zip/create/advanced");

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
    * Compress files to create a new, encrypted and password-protected zip archive
    * Create a new zip archive by compressing input files, and also applies encryption and password protection to the zip.
    * <p><b>200</b> - OK
    * @param password Password to place on the Zip file; the longer the password, the more secure
    * @param inputFile1 First input file to perform the operation on.
    * @param encryptionAlgorithm Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm). Default is AES-256.
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
    public byte[] zipArchiveZipCreateEncrypted(String password, File inputFile1, String encryptionAlgorithm, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        HttpResponse response = zipArchiveZipCreateEncryptedForHttpResponse(password, inputFile1, encryptionAlgorithm, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Compress files to create a new, encrypted and password-protected zip archive
    * Create a new zip archive by compressing input files, and also applies encryption and password protection to the zip.
    * <p><b>200</b> - OK
    * @param password Password to place on the Zip file; the longer the password, the more secure
    * @param inputFile1 First input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] zipArchiveZipCreateEncrypted(String password, File inputFile1, Map<String, Object> params) throws IOException {
        HttpResponse response = zipArchiveZipCreateEncryptedForHttpResponse(password, inputFile1, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse zipArchiveZipCreateEncryptedForHttpResponse(String password, File inputFile1, String encryptionAlgorithm, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new IllegalArgumentException("Missing the required parameter 'password' when calling zipArchiveZipCreateEncrypted");
        }// verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling zipArchiveZipCreateEncrypted");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/archive/zip/create/encrypted");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse zipArchiveZipCreateEncryptedForHttpResponse(String password, File inputFile1, Map<String, Object> params) throws IOException {
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new IllegalArgumentException("Missing the required parameter 'password' when calling zipArchiveZipCreateEncrypted");
        }// verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling zipArchiveZipCreateEncrypted");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/archive/zip/create/encrypted");

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
    * Create an encrypted zip file to quarantine a dangerous file
    * Create a new zip archive by compressing input files, and also applies encryption and password protection to the zip, for the purposes of quarantining the underlyikng file.
    * <p><b>200</b> - OK
    * @param password Password to place on the Zip file; the longer the password, the more secure
    * @param inputFile1 First input file to perform the operation on.
    * @param encryptionAlgorithm Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm). Default is AES-256.
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object zipArchiveZipCreateQuarantine(String password, File inputFile1, String encryptionAlgorithm) throws IOException {
        HttpResponse response = zipArchiveZipCreateQuarantineForHttpResponse(password, inputFile1, encryptionAlgorithm);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create an encrypted zip file to quarantine a dangerous file
    * Create a new zip archive by compressing input files, and also applies encryption and password protection to the zip, for the purposes of quarantining the underlyikng file.
    * <p><b>200</b> - OK
    * @param password Password to place on the Zip file; the longer the password, the more secure
    * @param inputFile1 First input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object zipArchiveZipCreateQuarantine(String password, File inputFile1, Map<String, Object> params) throws IOException {
        HttpResponse response = zipArchiveZipCreateQuarantineForHttpResponse(password, inputFile1, params);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse zipArchiveZipCreateQuarantineForHttpResponse(String password, File inputFile1, String encryptionAlgorithm) throws IOException {
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new IllegalArgumentException("Missing the required parameter 'password' when calling zipArchiveZipCreateQuarantine");
        }// verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling zipArchiveZipCreateQuarantine");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/archive/zip/create/quarantine");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse zipArchiveZipCreateQuarantineForHttpResponse(String password, File inputFile1, Map<String, Object> params) throws IOException {
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new IllegalArgumentException("Missing the required parameter 'password' when calling zipArchiveZipCreateQuarantine");
        }// verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling zipArchiveZipCreateQuarantine");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/archive/zip/create/quarantine");

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
    * Decrypt and remove password protection on a zip file
    * Decrypts and removes password protection from an encrypted zip file with the specified password
    * <p><b>200</b> - OK
    * @param zipPassword Required; Password for the input archive
    * @param inputFile Input file to perform the operation on.
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object zipArchiveZipDecrypt(String zipPassword, File inputFile) throws IOException {
        HttpResponse response = zipArchiveZipDecryptForHttpResponse(zipPassword, inputFile);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Decrypt and remove password protection on a zip file
    * Decrypts and removes password protection from an encrypted zip file with the specified password
    * <p><b>200</b> - OK
    * @param zipPassword Required; Password for the input archive
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object zipArchiveZipDecrypt(String zipPassword, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = zipArchiveZipDecryptForHttpResponse(zipPassword, inputFile, params);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse zipArchiveZipDecryptForHttpResponse(String zipPassword, File inputFile) throws IOException {
        // verify the required parameter 'zipPassword' is set
        if (zipPassword == null) {
            throw new IllegalArgumentException("Missing the required parameter 'zipPassword' when calling zipArchiveZipDecrypt");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling zipArchiveZipDecrypt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/archive/zip/decrypt");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse zipArchiveZipDecryptForHttpResponse(String zipPassword, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'zipPassword' is set
        if (zipPassword == null) {
            throw new IllegalArgumentException("Missing the required parameter 'zipPassword' when calling zipArchiveZipDecrypt");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling zipArchiveZipDecrypt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/archive/zip/decrypt");

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
    * Encrypt and password protect a zip file
    * Encrypts and password protects an existing zip file with the specified password and encryption algorithm
    * <p><b>200</b> - OK
    * @param encryptionRequest Encryption request
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object zipArchiveZipEncryptAdvanced(ZipEncryptionAdvancedRequest encryptionRequest) throws IOException {
        HttpResponse response = zipArchiveZipEncryptAdvancedForHttpResponse(encryptionRequest);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Encrypt and password protect a zip file
    * Encrypts and password protects an existing zip file with the specified password and encryption algorithm
    * <p><b>200</b> - OK
    * @param encryptionRequest Encryption request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object zipArchiveZipEncryptAdvanced(ZipEncryptionAdvancedRequest encryptionRequest, Map<String, Object> params) throws IOException {
        HttpResponse response = zipArchiveZipEncryptAdvancedForHttpResponse(encryptionRequest, params);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse zipArchiveZipEncryptAdvancedForHttpResponse(ZipEncryptionAdvancedRequest encryptionRequest) throws IOException {
        // verify the required parameter 'encryptionRequest' is set
        if (encryptionRequest == null) {
            throw new IllegalArgumentException("Missing the required parameter 'encryptionRequest' when calling zipArchiveZipEncryptAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/archive/zip/encrypt/advanced");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(encryptionRequest);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse zipArchiveZipEncryptAdvancedForHttpResponse(java.io.InputStream encryptionRequest, String mediaType) throws IOException {
          // verify the required parameter 'encryptionRequest' is set
              if (encryptionRequest == null) {
              throw new IllegalArgumentException("Missing the required parameter 'encryptionRequest' when calling zipArchiveZipEncryptAdvanced");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/archive/zip/encrypt/advanced");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = encryptionRequest == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, encryptionRequest);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse zipArchiveZipEncryptAdvancedForHttpResponse(ZipEncryptionAdvancedRequest encryptionRequest, Map<String, Object> params) throws IOException {
        // verify the required parameter 'encryptionRequest' is set
        if (encryptionRequest == null) {
            throw new IllegalArgumentException("Missing the required parameter 'encryptionRequest' when calling zipArchiveZipEncryptAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/archive/zip/encrypt/advanced");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(encryptionRequest);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Extract, decompress files and folders from a zip archive
    * Extracts a zip archive by decompressing files, and folders.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return ZipExtractResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ZipExtractResponse zipArchiveZipExtract(File inputFile) throws IOException {
        HttpResponse response = zipArchiveZipExtractForHttpResponse(inputFile);
        TypeReference<ZipExtractResponse> typeRef = new TypeReference<ZipExtractResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Extract, decompress files and folders from a zip archive
    * Extracts a zip archive by decompressing files, and folders.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ZipExtractResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ZipExtractResponse zipArchiveZipExtract(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = zipArchiveZipExtractForHttpResponse(inputFile, params);
        TypeReference<ZipExtractResponse> typeRef = new TypeReference<ZipExtractResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse zipArchiveZipExtractForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling zipArchiveZipExtract");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/archive/zip/extract");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse zipArchiveZipExtractForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling zipArchiveZipExtract");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/archive/zip/extract");

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
