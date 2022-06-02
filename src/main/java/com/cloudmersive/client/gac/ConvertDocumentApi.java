package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.AutodetectGetInfoResult;
import com.cloudmersive.client.gac.model.AutodetectToJpgResult;
import com.cloudmersive.client.gac.model.AutodetectToPngResult;
import com.cloudmersive.client.gac.model.AutodetectToThumbnailsResult;
import com.cloudmersive.client.gac.model.CsvCollection;
import com.cloudmersive.client.gac.model.DocxToJpgResult;
import com.cloudmersive.client.gac.model.DocxToPngResult;
import com.cloudmersive.client.gac.model.EmlToHtmlResult;
import com.cloudmersive.client.gac.model.EmlToJpgResult;
import com.cloudmersive.client.gac.model.EmlToPngResult;
import java.io.File;
import com.cloudmersive.client.gac.model.GetFileTypeIconResult;
import com.cloudmersive.client.gac.model.KeynoteToJpgResult;
import com.cloudmersive.client.gac.model.KeynoteToPngResult;
import com.cloudmersive.client.gac.model.MsgToHtmlResult;
import com.cloudmersive.client.gac.model.MsgToJpgResult;
import com.cloudmersive.client.gac.model.MsgToPngResult;
import com.cloudmersive.client.gac.model.OdpToJpgResult;
import com.cloudmersive.client.gac.model.OdpToPngResult;
import com.cloudmersive.client.gac.model.OdsToJpgResult;
import com.cloudmersive.client.gac.model.OdsToPngResult;
import com.cloudmersive.client.gac.model.OdtToJpgResult;
import com.cloudmersive.client.gac.model.OdtToPngResult;
import com.cloudmersive.client.gac.model.PdfToJpgResult;
import com.cloudmersive.client.gac.model.PdfToPngResult;
import com.cloudmersive.client.gac.model.PptxToPngResult;
import com.cloudmersive.client.gac.model.RtfToJpgResult;
import com.cloudmersive.client.gac.model.RtfToPngResult;
import com.cloudmersive.client.gac.model.TextConversionResult;
import com.cloudmersive.client.gac.model.XlsxToPngResult;

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
public class ConvertDocumentApi {
    private ApiClient apiClient;

    public ConvertDocumentApi() {
        this(new ApiClient());
    }

    public ConvertDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Get document type information
    * Auto-detects a document&#39;s type information; does not require file extension.  Analyzes file contents to confirm file type.  Even if no file extension is present, the auto-detect system will reliably analyze the contents of the file and identify its file type.  Supports over 100 image file formats, Office document file formats, PDF, and more.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return AutodetectGetInfoResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AutodetectGetInfoResult convertDocumentAutodetectGetInfo(File inputFile) throws IOException {
        HttpResponse response = convertDocumentAutodetectGetInfoForHttpResponse(inputFile);
        TypeReference<AutodetectGetInfoResult> typeRef = new TypeReference<AutodetectGetInfoResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get document type information
    * Auto-detects a document&#39;s type information; does not require file extension.  Analyzes file contents to confirm file type.  Even if no file extension is present, the auto-detect system will reliably analyze the contents of the file and identify its file type.  Supports over 100 image file formats, Office document file formats, PDF, and more.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AutodetectGetInfoResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AutodetectGetInfoResult convertDocumentAutodetectGetInfo(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentAutodetectGetInfoForHttpResponse(inputFile, params);
        TypeReference<AutodetectGetInfoResult> typeRef = new TypeReference<AutodetectGetInfoResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentAutodetectGetInfoForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectGetInfo");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/get-info");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentAutodetectGetInfoForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectGetInfo");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/get-info");

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
    * Convert Document to JPG/JPEG image array
    * Automatically detect file type and convert it to an array of JPG/JPEG Images.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
    * @return AutodetectToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AutodetectToJpgResult convertDocumentAutodetectToJpg(File inputFile, Integer quality) throws IOException {
        HttpResponse response = convertDocumentAutodetectToJpgForHttpResponse(inputFile, quality);
        TypeReference<AutodetectToJpgResult> typeRef = new TypeReference<AutodetectToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Document to JPG/JPEG image array
    * Automatically detect file type and convert it to an array of JPG/JPEG Images.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AutodetectToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AutodetectToJpgResult convertDocumentAutodetectToJpg(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentAutodetectToJpgForHttpResponse(inputFile, params);
        TypeReference<AutodetectToJpgResult> typeRef = new TypeReference<AutodetectToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentAutodetectToJpgForHttpResponse(File inputFile, Integer quality) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/to/jpg");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentAutodetectToJpgForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/to/jpg");

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
    * Convert Document to PDF
    * Automatically detect file type and convert it to PDF.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentAutodetectToPdf(File inputFile) throws IOException {
        HttpResponse response = convertDocumentAutodetectToPdfForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Document to PDF
    * Automatically detect file type and convert it to PDF.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentAutodetectToPdf(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentAutodetectToPdfForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentAutodetectToPdfForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/to/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentAutodetectToPdfForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/to/pdf");

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
    * Convert Document to PNG array
    * Automatically detect file type and convert it to an array of PNG images.  Supports all of the major Office document file formats, over 100 image formats, and even multi-page TIFF files.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return AutodetectToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AutodetectToPngResult convertDocumentAutodetectToPngArray(File inputFile) throws IOException {
        HttpResponse response = convertDocumentAutodetectToPngArrayForHttpResponse(inputFile);
        TypeReference<AutodetectToPngResult> typeRef = new TypeReference<AutodetectToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Document to PNG array
    * Automatically detect file type and convert it to an array of PNG images.  Supports all of the major Office document file formats, over 100 image formats, and even multi-page TIFF files.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AutodetectToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AutodetectToPngResult convertDocumentAutodetectToPngArray(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentAutodetectToPngArrayForHttpResponse(inputFile, params);
        TypeReference<AutodetectToPngResult> typeRef = new TypeReference<AutodetectToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentAutodetectToPngArrayForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToPngArray");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/to/png");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentAutodetectToPngArrayForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToPngArray");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/to/png");

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
    * Convert File to Thumbnail Image
    * Automatically detect file type and convert it to a PNG thumbnail. Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Returns a generic PNG thumbnail for unsupported formats. Maximum thumbnail size is 2048x2048.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param maxWidth Optional; Maximum width of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128.
    * @param maxHeight Optional; Maximum height of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128.
    * @param extension Optional; Specify the file extension of the inputFile. This will improve the response time in most cases. Also allows unsupported files without extensions to still return a corresponding generic icon.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentAutodetectToThumbnail(File inputFile, Integer maxWidth, Integer maxHeight, String extension) throws IOException {
        HttpResponse response = convertDocumentAutodetectToThumbnailForHttpResponse(inputFile, maxWidth, maxHeight, extension);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert File to Thumbnail Image
    * Automatically detect file type and convert it to a PNG thumbnail. Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Returns a generic PNG thumbnail for unsupported formats. Maximum thumbnail size is 2048x2048.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentAutodetectToThumbnail(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentAutodetectToThumbnailForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentAutodetectToThumbnailForHttpResponse(File inputFile, Integer maxWidth, Integer maxHeight, String extension) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToThumbnail");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/to/thumbnail");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentAutodetectToThumbnailForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToThumbnail");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/to/thumbnail");

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
    * Convert File to Thumbnail Image Object
    * Automatically detect file type and convert it to an array of PNG thumbnails, returned as an object. May specify the number of pages for multiple thumbnails; default is one thumbnail. Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Returns a generic PNG thumbnail for unsupported formats. Maximum thumbnail size is 2048x2048.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param pages Optional; Specify how many pages of the document will be converted to thumbnails. Default is 1 page.
    * @param maxWidth Optional; Maximum width of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128.
    * @param maxHeight Optional; Maximum height of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128.
    * @param extension Optional; Specify the file extension of the inputFile. This will improve the response time in most cases. Also allows unsupported files without extensions to still return a corresponding generic icon.
    * @return AutodetectToThumbnailsResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AutodetectToThumbnailsResult convertDocumentAutodetectToThumbnailsAdvanced(File inputFile, Integer pages, Integer maxWidth, Integer maxHeight, String extension) throws IOException {
        HttpResponse response = convertDocumentAutodetectToThumbnailsAdvancedForHttpResponse(inputFile, pages, maxWidth, maxHeight, extension);
        TypeReference<AutodetectToThumbnailsResult> typeRef = new TypeReference<AutodetectToThumbnailsResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert File to Thumbnail Image Object
    * Automatically detect file type and convert it to an array of PNG thumbnails, returned as an object. May specify the number of pages for multiple thumbnails; default is one thumbnail. Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Returns a generic PNG thumbnail for unsupported formats. Maximum thumbnail size is 2048x2048.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AutodetectToThumbnailsResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AutodetectToThumbnailsResult convertDocumentAutodetectToThumbnailsAdvanced(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentAutodetectToThumbnailsAdvancedForHttpResponse(inputFile, params);
        TypeReference<AutodetectToThumbnailsResult> typeRef = new TypeReference<AutodetectToThumbnailsResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentAutodetectToThumbnailsAdvancedForHttpResponse(File inputFile, Integer pages, Integer maxWidth, Integer maxHeight, String extension) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToThumbnailsAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/to/thumbnail/advanced");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentAutodetectToThumbnailsAdvancedForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToThumbnailsAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/to/thumbnail/advanced");

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
    * Convert Document to Text (txt)
    * Automatically detect file type and convert it to Text.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT) and PDF files.  For spreadsheets, all worksheets will be included.  If you wish to exclude certain pages, worksheets, slides, etc. use the Split document API first, or the delete pages/slides/worksheet APIs first to adjust the document to the target state prior to converting to text.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param textFormattingMode Optional; specify how whitespace should be handled when converting the document to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;preserveWhitespace&#39;.
    * @return TextConversionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextConversionResult convertDocumentAutodetectToTxt(File inputFile, String textFormattingMode) throws IOException {
        HttpResponse response = convertDocumentAutodetectToTxtForHttpResponse(inputFile, textFormattingMode);
        TypeReference<TextConversionResult> typeRef = new TypeReference<TextConversionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Document to Text (txt)
    * Automatically detect file type and convert it to Text.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT) and PDF files.  For spreadsheets, all worksheets will be included.  If you wish to exclude certain pages, worksheets, slides, etc. use the Split document API first, or the delete pages/slides/worksheet APIs first to adjust the document to the target state prior to converting to text.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TextConversionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextConversionResult convertDocumentAutodetectToTxt(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentAutodetectToTxtForHttpResponse(inputFile, params);
        TypeReference<TextConversionResult> typeRef = new TypeReference<TextConversionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentAutodetectToTxtForHttpResponse(File inputFile, String textFormattingMode) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToTxt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/to/txt");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentAutodetectToTxtForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToTxt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/to/txt");

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
    * Convert Multiple CSV Files into a Single XLSX Spreadsheet
    * Convert multiple Comma-Separated Values (CSV) files into a single Excel XLSX Spreadsheet, with one worksheet corresponding to each CSV file.
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on.
    * @param worksheetNames Optional; Specify the name of each CSV&#39;s worksheet in order, separated with commas (e.g. \&quot;worksheet1,worksheet2,worksheet3\&quot;). Defaults to the names of the input CSV files. Recommended when inputting the files directly, without file names.
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
    public byte[] convertDocumentCsvMultiToXlsx(File inputFile1, File inputFile2, String worksheetNames, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        HttpResponse response = convertDocumentCsvMultiToXlsxForHttpResponse(inputFile1, inputFile2, worksheetNames, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Multiple CSV Files into a Single XLSX Spreadsheet
    * Convert multiple Comma-Separated Values (CSV) files into a single Excel XLSX Spreadsheet, with one worksheet corresponding to each CSV file.
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentCsvMultiToXlsx(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentCsvMultiToXlsxForHttpResponse(inputFile1, inputFile2, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentCsvMultiToXlsxForHttpResponse(File inputFile1, File inputFile2, String worksheetNames, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling convertDocumentCsvMultiToXlsx");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling convertDocumentCsvMultiToXlsx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/csv/multi/to/xlsx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentCsvMultiToXlsxForHttpResponse(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling convertDocumentCsvMultiToXlsx");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling convertDocumentCsvMultiToXlsx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/csv/multi/to/xlsx");

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
    * Convert CSV to HTML document
    * Convert Comma-Separated Values (CSV) file to HTML document.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentCsvToHtml(File inputFile) throws IOException {
        HttpResponse response = convertDocumentCsvToHtmlForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert CSV to HTML document
    * Convert Comma-Separated Values (CSV) file to HTML document.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentCsvToHtml(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentCsvToHtmlForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentCsvToHtmlForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentCsvToHtml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/csv/to/html");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentCsvToHtmlForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentCsvToHtml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/csv/to/html");

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
    * Convert CSV to PDF document
    * Convert Comma-Separated Values (CSV) file to PDF document.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentCsvToPdf(File inputFile) throws IOException {
        HttpResponse response = convertDocumentCsvToPdfForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert CSV to PDF document
    * Convert Comma-Separated Values (CSV) file to PDF document.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentCsvToPdf(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentCsvToPdfForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentCsvToPdfForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentCsvToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/csv/to/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentCsvToPdfForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentCsvToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/csv/to/pdf");

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
    * Convert CSV to Excel XLSX Spreadsheet
    * Convert CSV file to Office Excel XLSX Workbooks file format.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentCsvToXlsx(File inputFile) throws IOException {
        HttpResponse response = convertDocumentCsvToXlsxForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert CSV to Excel XLSX Spreadsheet
    * Convert CSV file to Office Excel XLSX Workbooks file format.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentCsvToXlsx(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentCsvToXlsxForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentCsvToXlsxForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentCsvToXlsx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/csv/to/xlsx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentCsvToXlsxForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentCsvToXlsx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/csv/to/xlsx");

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
    * Convert Word DOC (97-03) Document to DOCX
    * Convert/upgrade Office Word (97-2003 Format) Documents (doc) to the modern DOCX format
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentDocToDocx(File inputFile) throws IOException {
        HttpResponse response = convertDocumentDocToDocxForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Word DOC (97-03) Document to DOCX
    * Convert/upgrade Office Word (97-2003 Format) Documents (doc) to the modern DOCX format
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentDocToDocx(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentDocToDocxForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentDocToDocxForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocToDocx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/doc/to/docx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentDocToDocxForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocToDocx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/doc/to/docx");

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
    * Convert Word DOC (97-03) Document to PDF
    * Convert Office Word (97-2003 Format) Documents (doc) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentDocToPdf(File inputFile) throws IOException {
        HttpResponse response = convertDocumentDocToPdfForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Word DOC (97-03) Document to PDF
    * Convert Office Word (97-2003 Format) Documents (doc) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentDocToPdf(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentDocToPdfForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentDocToPdfForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/doc/to/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentDocToPdfForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/doc/to/pdf");

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
    * Convert Word DOC (97-03) Document to Text (txt)
    * Convert Office Word DOC (97-03) Document (doc) to text
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return TextConversionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextConversionResult convertDocumentDocToTxt(File inputFile) throws IOException {
        HttpResponse response = convertDocumentDocToTxtForHttpResponse(inputFile);
        TypeReference<TextConversionResult> typeRef = new TypeReference<TextConversionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Word DOC (97-03) Document to Text (txt)
    * Convert Office Word DOC (97-03) Document (doc) to text
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TextConversionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextConversionResult convertDocumentDocToTxt(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentDocToTxtForHttpResponse(inputFile, params);
        TypeReference<TextConversionResult> typeRef = new TypeReference<TextConversionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentDocToTxtForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocToTxt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/doc/to/txt");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentDocToTxtForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocToTxt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/doc/to/txt");

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
    * Convert Word DOCX Document to Legacy Word DOC (97-03)
    * Convert/downgrade modern Office Word DOCX Documents (DOCX) to the legacy Word DOC (97-2003 Format) format
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentDocxToDoc(File inputFile) throws IOException {
        HttpResponse response = convertDocumentDocxToDocForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Word DOCX Document to Legacy Word DOC (97-03)
    * Convert/downgrade modern Office Word DOCX Documents (DOCX) to the legacy Word DOC (97-2003 Format) format
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentDocxToDoc(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentDocxToDocForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentDocxToDocForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToDoc");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/docx/to/doc");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentDocxToDocForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToDoc");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/docx/to/doc");

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
    * Convert Word DOCX Document to HTML Document
    * Convert Office Word Document (DOCX) to HTML Document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentDocxToHtml(File inputFile) throws IOException {
        HttpResponse response = convertDocumentDocxToHtmlForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Word DOCX Document to HTML Document
    * Convert Office Word Document (DOCX) to HTML Document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentDocxToHtml(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentDocxToHtmlForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentDocxToHtmlForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToHtml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/docx/to/html");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentDocxToHtmlForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToHtml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/docx/to/html");

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
    * Convert Word DOCX Document to JPG/JPEG image array
    * Converts an Office Word Document (DOCX) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
    * @return DocxToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocxToJpgResult convertDocumentDocxToJpg(File inputFile, Integer quality) throws IOException {
        HttpResponse response = convertDocumentDocxToJpgForHttpResponse(inputFile, quality);
        TypeReference<DocxToJpgResult> typeRef = new TypeReference<DocxToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Word DOCX Document to JPG/JPEG image array
    * Converts an Office Word Document (DOCX) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocxToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocxToJpgResult convertDocumentDocxToJpg(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentDocxToJpgForHttpResponse(inputFile, params);
        TypeReference<DocxToJpgResult> typeRef = new TypeReference<DocxToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentDocxToJpgForHttpResponse(File inputFile, Integer quality) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/docx/to/jpg");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentDocxToJpgForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/docx/to/jpg");

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
    * Convert Word DOCX Document to PDF
    * Convert Office Word Documents (docx) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentDocxToPdf(File inputFile) throws IOException {
        HttpResponse response = convertDocumentDocxToPdfForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Word DOCX Document to PDF
    * Convert Office Word Documents (docx) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentDocxToPdf(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentDocxToPdfForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentDocxToPdfForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/docx/to/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentDocxToPdfForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/docx/to/pdf");

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
    * Convert Word DOCX Document to PNG image array
    * Converts an Office Word Document (DOCX) file to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return DocxToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocxToPngResult convertDocumentDocxToPng(File inputFile) throws IOException {
        HttpResponse response = convertDocumentDocxToPngForHttpResponse(inputFile);
        TypeReference<DocxToPngResult> typeRef = new TypeReference<DocxToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Word DOCX Document to PNG image array
    * Converts an Office Word Document (DOCX) file to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DocxToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DocxToPngResult convertDocumentDocxToPng(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentDocxToPngForHttpResponse(inputFile, params);
        TypeReference<DocxToPngResult> typeRef = new TypeReference<DocxToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentDocxToPngForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/docx/to/png");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentDocxToPngForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/docx/to/png");

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
    * Convert Word DOCX Document to RTF
    * Convert an Office Word Document (DOCX) to Rich Text Format Document (RTF)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentDocxToRtf(File inputFile) throws IOException {
        HttpResponse response = convertDocumentDocxToRtfForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Word DOCX Document to RTF
    * Convert an Office Word Document (DOCX) to Rich Text Format Document (RTF)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentDocxToRtf(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentDocxToRtfForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentDocxToRtfForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToRtf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/docx/to/rtf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentDocxToRtfForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToRtf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/docx/to/rtf");

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
    * Convert Word DOCX Document to Text (txt)
    * Convert Office Word Documents (docx) to text
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param textFormattingMode Optional; specify how whitespace should be handled when converting the document to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;minimizeWhitespace&#39;.
    * @return TextConversionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextConversionResult convertDocumentDocxToTxt(File inputFile, String textFormattingMode) throws IOException {
        HttpResponse response = convertDocumentDocxToTxtForHttpResponse(inputFile, textFormattingMode);
        TypeReference<TextConversionResult> typeRef = new TypeReference<TextConversionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Word DOCX Document to Text (txt)
    * Convert Office Word Documents (docx) to text
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TextConversionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextConversionResult convertDocumentDocxToTxt(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentDocxToTxtForHttpResponse(inputFile, params);
        TypeReference<TextConversionResult> typeRef = new TypeReference<TextConversionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentDocxToTxtForHttpResponse(File inputFile, String textFormattingMode) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToTxt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/docx/to/txt");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentDocxToTxtForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToTxt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/docx/to/txt");

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
    * Convert Email EML file to HTML string
    * Convert Outlook Email EML file to HTML string and attachments. Supports images if they are base 64 inline.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param bodyOnly Optional; If true, the HTML string will only include the body of the email. Other information such as subject will still be given as properties in the response object. Default is false.
    * @param includeAttachments Optional; If false, the response object will not include any attachment files from the input file. Default is true.
    * @return EmlToHtmlResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public EmlToHtmlResult convertDocumentEmlToHtml(File inputFile, Boolean bodyOnly, Boolean includeAttachments) throws IOException {
        HttpResponse response = convertDocumentEmlToHtmlForHttpResponse(inputFile, bodyOnly, includeAttachments);
        TypeReference<EmlToHtmlResult> typeRef = new TypeReference<EmlToHtmlResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Email EML file to HTML string
    * Convert Outlook Email EML file to HTML string and attachments. Supports images if they are base 64 inline.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return EmlToHtmlResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public EmlToHtmlResult convertDocumentEmlToHtml(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentEmlToHtmlForHttpResponse(inputFile, params);
        TypeReference<EmlToHtmlResult> typeRef = new TypeReference<EmlToHtmlResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentEmlToHtmlForHttpResponse(File inputFile, Boolean bodyOnly, Boolean includeAttachments) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentEmlToHtml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/eml/to/html");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentEmlToHtmlForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentEmlToHtml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/eml/to/html");

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
    * Convert Email EML file to JPG/JPEG image array
    * Converts an Outlook Email File (EML) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
    * @return EmlToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public EmlToJpgResult convertDocumentEmlToJpg(File inputFile, Integer quality) throws IOException {
        HttpResponse response = convertDocumentEmlToJpgForHttpResponse(inputFile, quality);
        TypeReference<EmlToJpgResult> typeRef = new TypeReference<EmlToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Email EML file to JPG/JPEG image array
    * Converts an Outlook Email File (EML) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return EmlToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public EmlToJpgResult convertDocumentEmlToJpg(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentEmlToJpgForHttpResponse(inputFile, params);
        TypeReference<EmlToJpgResult> typeRef = new TypeReference<EmlToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentEmlToJpgForHttpResponse(File inputFile, Integer quality) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentEmlToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/eml/to/jpg");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentEmlToJpgForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentEmlToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/eml/to/jpg");

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
    * Convert Email EML file to PDF document
    * Convert Outlook Email EML file to PDF document. Supports images if they are base 64 inline.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param bodyOnly Optional; If true, the HTML string will only include the body of the email. Other information such as subject will still be given as properties in the response object. Default is false.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentEmlToPdf(File inputFile, Boolean bodyOnly) throws IOException {
        HttpResponse response = convertDocumentEmlToPdfForHttpResponse(inputFile, bodyOnly);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Email EML file to PDF document
    * Convert Outlook Email EML file to PDF document. Supports images if they are base 64 inline.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentEmlToPdf(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentEmlToPdfForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentEmlToPdfForHttpResponse(File inputFile, Boolean bodyOnly) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentEmlToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/eml/to/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentEmlToPdfForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentEmlToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/eml/to/pdf");

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
    * Convert Email EML file to PNG image array
    * Converts an Outlook Email File (EML) to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return EmlToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public EmlToPngResult convertDocumentEmlToPng(File inputFile) throws IOException {
        HttpResponse response = convertDocumentEmlToPngForHttpResponse(inputFile);
        TypeReference<EmlToPngResult> typeRef = new TypeReference<EmlToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Email EML file to PNG image array
    * Converts an Outlook Email File (EML) to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return EmlToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public EmlToPngResult convertDocumentEmlToPng(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentEmlToPngForHttpResponse(inputFile, params);
        TypeReference<EmlToPngResult> typeRef = new TypeReference<EmlToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentEmlToPngForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentEmlToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/eml/to/png");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentEmlToPngForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentEmlToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/eml/to/png");

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
    * Get PNG icon file for the file extension
    * Returns a PNG icon for the given file format extension as a file for download. User may specify the icon size. Supports over 100 file formats, with a generic icon for unsupported formats.
    * <p><b>200</b> - OK
    * @param fileExtension Required; The file extension to be used for the icon. Limited to 4 AlphaNumeric characters.
    * @param iconSize Optional; The desired width of the icon, preserving its aspect ratio.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentGetFileTypeIcon(String fileExtension, Integer iconSize) throws IOException {
        HttpResponse response = convertDocumentGetFileTypeIconForHttpResponse(fileExtension, iconSize);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get PNG icon file for the file extension
    * Returns a PNG icon for the given file format extension as a file for download. User may specify the icon size. Supports over 100 file formats, with a generic icon for unsupported formats.
    * <p><b>200</b> - OK
    * @param fileExtension Required; The file extension to be used for the icon. Limited to 4 AlphaNumeric characters.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentGetFileTypeIcon(String fileExtension, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentGetFileTypeIconForHttpResponse(fileExtension, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentGetFileTypeIconForHttpResponse(String fileExtension, Integer iconSize) throws IOException {
        // verify the required parameter 'fileExtension' is set
        if (fileExtension == null) {
            throw new IllegalArgumentException("Missing the required parameter 'fileExtension' when calling convertDocumentGetFileTypeIcon");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/get-icon");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentGetFileTypeIconForHttpResponse(String fileExtension, Map<String, Object> params) throws IOException {
        // verify the required parameter 'fileExtension' is set
        if (fileExtension == null) {
            throw new IllegalArgumentException("Missing the required parameter 'fileExtension' when calling convertDocumentGetFileTypeIcon");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/get-icon");

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
    * Get PNG icon byte array for the file extension
    * Returns a PNG icon for the given file format extension directly as a byte array. User may specify the icon size. Supports over 100 file formats, with a generic icon for unsupported formats.
    * <p><b>200</b> - OK
    * @param fileExtension Required; The file extension to be used for the icon. Limited to 4 AlphaNumeric characters.
    * @param iconSize Optional; The desired width of the icon, preserving its aspect ratio.
    * @return GetFileTypeIconResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetFileTypeIconResult convertDocumentGetFileTypeIconAdvanced(String fileExtension, Integer iconSize) throws IOException {
        HttpResponse response = convertDocumentGetFileTypeIconAdvancedForHttpResponse(fileExtension, iconSize);
        TypeReference<GetFileTypeIconResult> typeRef = new TypeReference<GetFileTypeIconResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get PNG icon byte array for the file extension
    * Returns a PNG icon for the given file format extension directly as a byte array. User may specify the icon size. Supports over 100 file formats, with a generic icon for unsupported formats.
    * <p><b>200</b> - OK
    * @param fileExtension Required; The file extension to be used for the icon. Limited to 4 AlphaNumeric characters.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetFileTypeIconResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetFileTypeIconResult convertDocumentGetFileTypeIconAdvanced(String fileExtension, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentGetFileTypeIconAdvancedForHttpResponse(fileExtension, params);
        TypeReference<GetFileTypeIconResult> typeRef = new TypeReference<GetFileTypeIconResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentGetFileTypeIconAdvancedForHttpResponse(String fileExtension, Integer iconSize) throws IOException {
        // verify the required parameter 'fileExtension' is set
        if (fileExtension == null) {
            throw new IllegalArgumentException("Missing the required parameter 'fileExtension' when calling convertDocumentGetFileTypeIconAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/get-icon/advanced");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentGetFileTypeIconAdvancedForHttpResponse(String fileExtension, Map<String, Object> params) throws IOException {
        // verify the required parameter 'fileExtension' is set
        if (fileExtension == null) {
            throw new IllegalArgumentException("Missing the required parameter 'fileExtension' when calling convertDocumentGetFileTypeIconAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/autodetect/get-icon/advanced");

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
    * Convert HTML document file to PDF Document
    * Convert standard HTML, with full support for CSS, JavaScript, Images, and other complex behavior to PDF.  To use external files such as images, use an absolute URL to the file.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param includeBackgroundGraphics Optional: Set to true to include background graphics in the PDF, or false to not include.  Default is true.
    * @param scaleFactor Optional: Set to 100 to scale at 100%, set to 50% to scale down to 50% scale, set to 200% to scale up to 200% scale, etc.  Default is 100%. Maximum is 1000%.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentHtmlToPdf(File inputFile, Boolean includeBackgroundGraphics, Integer scaleFactor) throws IOException {
        HttpResponse response = convertDocumentHtmlToPdfForHttpResponse(inputFile, includeBackgroundGraphics, scaleFactor);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert HTML document file to PDF Document
    * Convert standard HTML, with full support for CSS, JavaScript, Images, and other complex behavior to PDF.  To use external files such as images, use an absolute URL to the file.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentHtmlToPdf(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentHtmlToPdfForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentHtmlToPdfForHttpResponse(File inputFile, Boolean includeBackgroundGraphics, Integer scaleFactor) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentHtmlToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/html/to/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentHtmlToPdfForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentHtmlToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/html/to/pdf");

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
    * Convert HTML document file to PNG image array
    * Convert standard HTML, with full support for CSS, JavaScript, Images, and other complex behavior to an array of PNG images, one for each page.  To use external files in your HTML such as images, use an absolute URL to the file.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return PdfToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PdfToPngResult convertDocumentHtmlToPng(File inputFile) throws IOException {
        HttpResponse response = convertDocumentHtmlToPngForHttpResponse(inputFile);
        TypeReference<PdfToPngResult> typeRef = new TypeReference<PdfToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert HTML document file to PNG image array
    * Convert standard HTML, with full support for CSS, JavaScript, Images, and other complex behavior to an array of PNG images, one for each page.  To use external files in your HTML such as images, use an absolute URL to the file.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PdfToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PdfToPngResult convertDocumentHtmlToPng(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentHtmlToPngForHttpResponse(inputFile, params);
        TypeReference<PdfToPngResult> typeRef = new TypeReference<PdfToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentHtmlToPngForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentHtmlToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/html/to/png");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentHtmlToPngForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentHtmlToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/html/to/png");

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
    * HTML Document file to Text (txt)
    * HTML document to text
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return TextConversionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextConversionResult convertDocumentHtmlToTxt(File inputFile) throws IOException {
        HttpResponse response = convertDocumentHtmlToTxtForHttpResponse(inputFile);
        TypeReference<TextConversionResult> typeRef = new TypeReference<TextConversionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * HTML Document file to Text (txt)
    * HTML document to text
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TextConversionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextConversionResult convertDocumentHtmlToTxt(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentHtmlToTxtForHttpResponse(inputFile, params);
        TypeReference<TextConversionResult> typeRef = new TypeReference<TextConversionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentHtmlToTxtForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentHtmlToTxt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/html/to/txt");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentHtmlToTxtForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentHtmlToTxt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/html/to/txt");

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
    * Convert Keynote Presentation (KEY) to JPG/JPEG image array
    * Converts a Mac Keynote Presentation (KEY) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
    * @return KeynoteToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public KeynoteToJpgResult convertDocumentKeynoteToJpg(File inputFile, Integer quality) throws IOException {
        HttpResponse response = convertDocumentKeynoteToJpgForHttpResponse(inputFile, quality);
        TypeReference<KeynoteToJpgResult> typeRef = new TypeReference<KeynoteToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Keynote Presentation (KEY) to JPG/JPEG image array
    * Converts a Mac Keynote Presentation (KEY) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return KeynoteToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public KeynoteToJpgResult convertDocumentKeynoteToJpg(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentKeynoteToJpgForHttpResponse(inputFile, params);
        TypeReference<KeynoteToJpgResult> typeRef = new TypeReference<KeynoteToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentKeynoteToJpgForHttpResponse(File inputFile, Integer quality) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentKeynoteToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/key/to/jpg");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentKeynoteToJpgForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentKeynoteToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/key/to/jpg");

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
    * Convert Keynote Presentation (KEY) to PDF
    * Convert Mac Keynote Presentation (KEY) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentKeynoteToPdf(File inputFile) throws IOException {
        HttpResponse response = convertDocumentKeynoteToPdfForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Keynote Presentation (KEY) to PDF
    * Convert Mac Keynote Presentation (KEY) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentKeynoteToPdf(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentKeynoteToPdfForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentKeynoteToPdfForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentKeynoteToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/key/to/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentKeynoteToPdfForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentKeynoteToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/key/to/pdf");

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
    * Convert Keynote Presentation (KEY) to PNG image array
    * Converts a Mac Keynote Presentation (KEY) to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return KeynoteToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public KeynoteToPngResult convertDocumentKeynoteToPng(File inputFile) throws IOException {
        HttpResponse response = convertDocumentKeynoteToPngForHttpResponse(inputFile);
        TypeReference<KeynoteToPngResult> typeRef = new TypeReference<KeynoteToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Keynote Presentation (KEY) to PNG image array
    * Converts a Mac Keynote Presentation (KEY) to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return KeynoteToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public KeynoteToPngResult convertDocumentKeynoteToPng(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentKeynoteToPngForHttpResponse(inputFile, params);
        TypeReference<KeynoteToPngResult> typeRef = new TypeReference<KeynoteToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentKeynoteToPngForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentKeynoteToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/key/to/png");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentKeynoteToPngForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentKeynoteToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/key/to/png");

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
    * Convert Keynote Presentation (KEY) to PPTX
    * Convert Mac Keynote Presentation (KEY) to PowerPoint Presentation (PPTX)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentKeynoteToPptx(File inputFile) throws IOException {
        HttpResponse response = convertDocumentKeynoteToPptxForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Keynote Presentation (KEY) to PPTX
    * Convert Mac Keynote Presentation (KEY) to PowerPoint Presentation (PPTX)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentKeynoteToPptx(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentKeynoteToPptxForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentKeynoteToPptxForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentKeynoteToPptx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/key/to/pptx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentKeynoteToPptxForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentKeynoteToPptx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/key/to/pptx");

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
    * Convert Email MSG file to HTML string
    * Convert Outlook Email MSG file to HTML string and attachments. Supports images if they are base 64 inline. Supports most, but not all, RTF bodied MSG files.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param bodyOnly Optional; If true, the HTML string will only include the body of the MSG. Other information such as subject will still be given as properties in the response object. Default is false.
    * @param includeAttachments Optional; If false, the response object will not include any attachment files from the input file. Default is true.
    * @return MsgToHtmlResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public MsgToHtmlResult convertDocumentMsgToHtml(File inputFile, Boolean bodyOnly, Boolean includeAttachments) throws IOException {
        HttpResponse response = convertDocumentMsgToHtmlForHttpResponse(inputFile, bodyOnly, includeAttachments);
        TypeReference<MsgToHtmlResult> typeRef = new TypeReference<MsgToHtmlResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Email MSG file to HTML string
    * Convert Outlook Email MSG file to HTML string and attachments. Supports images if they are base 64 inline. Supports most, but not all, RTF bodied MSG files.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return MsgToHtmlResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public MsgToHtmlResult convertDocumentMsgToHtml(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentMsgToHtmlForHttpResponse(inputFile, params);
        TypeReference<MsgToHtmlResult> typeRef = new TypeReference<MsgToHtmlResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentMsgToHtmlForHttpResponse(File inputFile, Boolean bodyOnly, Boolean includeAttachments) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentMsgToHtml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/msg/to/html");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentMsgToHtmlForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentMsgToHtml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/msg/to/html");

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
    * Convert Email MSG file to JPG/JPEG image array
    * Converts an Outlook Message File (MSG) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
    * @return MsgToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public MsgToJpgResult convertDocumentMsgToJpg(File inputFile, Integer quality) throws IOException {
        HttpResponse response = convertDocumentMsgToJpgForHttpResponse(inputFile, quality);
        TypeReference<MsgToJpgResult> typeRef = new TypeReference<MsgToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Email MSG file to JPG/JPEG image array
    * Converts an Outlook Message File (MSG) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return MsgToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public MsgToJpgResult convertDocumentMsgToJpg(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentMsgToJpgForHttpResponse(inputFile, params);
        TypeReference<MsgToJpgResult> typeRef = new TypeReference<MsgToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentMsgToJpgForHttpResponse(File inputFile, Integer quality) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentMsgToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/msg/to/jpg");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentMsgToJpgForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentMsgToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/msg/to/jpg");

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
    * Convert Email MSG file to PDF document
    * Convert Outlook Email MSG file to PDF document. Supports images if they are base 64 inline. Supports most, but not all, RTF bodied MSG files.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param bodyOnly Optional; If true, the HTML string will only include the body of the email. Other information such as subject will still be given as properties in the response object. Default is false.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentMsgToPdf(File inputFile, Boolean bodyOnly) throws IOException {
        HttpResponse response = convertDocumentMsgToPdfForHttpResponse(inputFile, bodyOnly);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Email MSG file to PDF document
    * Convert Outlook Email MSG file to PDF document. Supports images if they are base 64 inline. Supports most, but not all, RTF bodied MSG files.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentMsgToPdf(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentMsgToPdfForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentMsgToPdfForHttpResponse(File inputFile, Boolean bodyOnly) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentMsgToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/msg/to/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentMsgToPdfForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentMsgToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/msg/to/pdf");

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
    * Convert Email MSG file to PNG image array
    * Converts an Outlook Email Message File (MSG) to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return MsgToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public MsgToPngResult convertDocumentMsgToPng(File inputFile) throws IOException {
        HttpResponse response = convertDocumentMsgToPngForHttpResponse(inputFile);
        TypeReference<MsgToPngResult> typeRef = new TypeReference<MsgToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Email MSG file to PNG image array
    * Converts an Outlook Email Message File (MSG) to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return MsgToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public MsgToPngResult convertDocumentMsgToPng(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentMsgToPngForHttpResponse(inputFile, params);
        TypeReference<MsgToPngResult> typeRef = new TypeReference<MsgToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentMsgToPngForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentMsgToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/msg/to/png");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentMsgToPngForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentMsgToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/msg/to/png");

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
    * Convert ODP Presentation to JPG/JPEG image array
    * Converts an Open Document Presentation (ODP) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
    * @return OdpToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public OdpToJpgResult convertDocumentOdpToJpg(File inputFile, Integer quality) throws IOException {
        HttpResponse response = convertDocumentOdpToJpgForHttpResponse(inputFile, quality);
        TypeReference<OdpToJpgResult> typeRef = new TypeReference<OdpToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert ODP Presentation to JPG/JPEG image array
    * Converts an Open Document Presentation (ODP) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return OdpToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public OdpToJpgResult convertDocumentOdpToJpg(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentOdpToJpgForHttpResponse(inputFile, params);
        TypeReference<OdpToJpgResult> typeRef = new TypeReference<OdpToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentOdpToJpgForHttpResponse(File inputFile, Integer quality) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdpToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/odp/to/jpg");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentOdpToJpgForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdpToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/odp/to/jpg");

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
    * Convert ODP Presentation to PDF
    * Convert Office Open Document Presentation (ODP) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentOdpToPdf(File inputFile) throws IOException {
        HttpResponse response = convertDocumentOdpToPdfForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert ODP Presentation to PDF
    * Convert Office Open Document Presentation (ODP) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentOdpToPdf(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentOdpToPdfForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentOdpToPdfForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdpToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/odp/to/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentOdpToPdfForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdpToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/odp/to/pdf");

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
    * Convert ODP Presentation to PNG image array
    * Converts an Office Open Document Presentation (ODP) to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return OdpToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public OdpToPngResult convertDocumentOdpToPng(File inputFile) throws IOException {
        HttpResponse response = convertDocumentOdpToPngForHttpResponse(inputFile);
        TypeReference<OdpToPngResult> typeRef = new TypeReference<OdpToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert ODP Presentation to PNG image array
    * Converts an Office Open Document Presentation (ODP) to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return OdpToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public OdpToPngResult convertDocumentOdpToPng(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentOdpToPngForHttpResponse(inputFile, params);
        TypeReference<OdpToPngResult> typeRef = new TypeReference<OdpToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentOdpToPngForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdpToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/odp/to/png");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentOdpToPngForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdpToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/odp/to/png");

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
    * Convert ODP Presentation to PPTX
    * Convert Office Open Document Presentation (ODP) to PowerPoint Presentation (PPTX)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentOdpToPptx(File inputFile) throws IOException {
        HttpResponse response = convertDocumentOdpToPptxForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert ODP Presentation to PPTX
    * Convert Office Open Document Presentation (ODP) to PowerPoint Presentation (PPTX)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentOdpToPptx(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentOdpToPptxForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentOdpToPptxForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdpToPptx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/odp/to/pptx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentOdpToPptxForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdpToPptx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/odp/to/pptx");

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
    * Convert ODS Spreadsheet to JPG/JPEG image array
    * Converts an Open Document Spreadsheet (ODS) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
    * @return OdsToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public OdsToJpgResult convertDocumentOdsToJpg(File inputFile, Integer quality) throws IOException {
        HttpResponse response = convertDocumentOdsToJpgForHttpResponse(inputFile, quality);
        TypeReference<OdsToJpgResult> typeRef = new TypeReference<OdsToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert ODS Spreadsheet to JPG/JPEG image array
    * Converts an Open Document Spreadsheet (ODS) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return OdsToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public OdsToJpgResult convertDocumentOdsToJpg(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentOdsToJpgForHttpResponse(inputFile, params);
        TypeReference<OdsToJpgResult> typeRef = new TypeReference<OdsToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentOdsToJpgForHttpResponse(File inputFile, Integer quality) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdsToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/ods/to/jpg");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentOdsToJpgForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdsToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/ods/to/jpg");

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
    * Convert ODS Spreadsheet to PDF
    * Convert Office Open Document Spreadsheet (ODS) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentOdsToPdf(File inputFile) throws IOException {
        HttpResponse response = convertDocumentOdsToPdfForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert ODS Spreadsheet to PDF
    * Convert Office Open Document Spreadsheet (ODS) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentOdsToPdf(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentOdsToPdfForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentOdsToPdfForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdsToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/ods/to/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentOdsToPdfForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdsToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/ods/to/pdf");

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
    * Convert ODS Spreadsheet to PNG image array
    * Converts an Office Open Document Spreadsheet (ODS) to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return OdsToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public OdsToPngResult convertDocumentOdsToPng(File inputFile) throws IOException {
        HttpResponse response = convertDocumentOdsToPngForHttpResponse(inputFile);
        TypeReference<OdsToPngResult> typeRef = new TypeReference<OdsToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert ODS Spreadsheet to PNG image array
    * Converts an Office Open Document Spreadsheet (ODS) to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return OdsToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public OdsToPngResult convertDocumentOdsToPng(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentOdsToPngForHttpResponse(inputFile, params);
        TypeReference<OdsToPngResult> typeRef = new TypeReference<OdsToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentOdsToPngForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdsToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/ods/to/png");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentOdsToPngForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdsToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/ods/to/png");

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
    * Convert ODS Spreadsheet to XLSX
    * Convert Office Open Document Spreadsheet (ODS) to Excel Spreadsheet (XLSX)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentOdsToXlsx(File inputFile) throws IOException {
        HttpResponse response = convertDocumentOdsToXlsxForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert ODS Spreadsheet to XLSX
    * Convert Office Open Document Spreadsheet (ODS) to Excel Spreadsheet (XLSX)
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentOdsToXlsx(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentOdsToXlsxForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentOdsToXlsxForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdsToXlsx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/ods/to/xlsx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentOdsToXlsxForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdsToXlsx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/ods/to/xlsx");

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
    * Convert ODT Text File to Word DOCX
    * Convert Office Open Document Text File (ODT) to Word DOCX Document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentOdtToDocx(File inputFile) throws IOException {
        HttpResponse response = convertDocumentOdtToDocxForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert ODT Text File to Word DOCX
    * Convert Office Open Document Text File (ODT) to Word DOCX Document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentOdtToDocx(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentOdtToDocxForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentOdtToDocxForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdtToDocx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/odt/to/docx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentOdtToDocxForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdtToDocx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/odt/to/docx");

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
    * Convert ODT Text File to JPG/JPEG image array
    * Converts an Open Document Text File (ODT) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
    * @return OdtToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public OdtToJpgResult convertDocumentOdtToJpg(File inputFile, Integer quality) throws IOException {
        HttpResponse response = convertDocumentOdtToJpgForHttpResponse(inputFile, quality);
        TypeReference<OdtToJpgResult> typeRef = new TypeReference<OdtToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert ODT Text File to JPG/JPEG image array
    * Converts an Open Document Text File (ODT) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return OdtToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public OdtToJpgResult convertDocumentOdtToJpg(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentOdtToJpgForHttpResponse(inputFile, params);
        TypeReference<OdtToJpgResult> typeRef = new TypeReference<OdtToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentOdtToJpgForHttpResponse(File inputFile, Integer quality) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdtToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/odt/to/jpg");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentOdtToJpgForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdtToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/odt/to/jpg");

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
    * Convert ODT Text File to PDF
    * Convert Office Open Document Text File (ODT) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentOdtToPdf(File inputFile) throws IOException {
        HttpResponse response = convertDocumentOdtToPdfForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert ODT Text File to PDF
    * Convert Office Open Document Text File (ODT) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentOdtToPdf(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentOdtToPdfForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentOdtToPdfForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdtToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/odt/to/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentOdtToPdfForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdtToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/odt/to/pdf");

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
    * Convert ODT Text File to PNG image array
    * Converts an Office Open Document Text File (ODT) to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return OdtToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public OdtToPngResult convertDocumentOdtToPng(File inputFile) throws IOException {
        HttpResponse response = convertDocumentOdtToPngForHttpResponse(inputFile);
        TypeReference<OdtToPngResult> typeRef = new TypeReference<OdtToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert ODT Text File to PNG image array
    * Converts an Office Open Document Text File (ODT) to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return OdtToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public OdtToPngResult convertDocumentOdtToPng(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentOdtToPngForHttpResponse(inputFile, params);
        TypeReference<OdtToPngResult> typeRef = new TypeReference<OdtToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentOdtToPngForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdtToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/odt/to/png");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentOdtToPngForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentOdtToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/odt/to/png");

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
    * Convert PDF to Word DOCX Document
    * Convert standard PDF to Office Word Documents (docx).    Converts a PDF at high fidelity into Word format, where it can be easily edited and processed.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentPdfToDocx(File inputFile) throws IOException {
        HttpResponse response = convertDocumentPdfToDocxForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert PDF to Word DOCX Document
    * Convert standard PDF to Office Word Documents (docx).    Converts a PDF at high fidelity into Word format, where it can be easily edited and processed.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentPdfToDocx(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentPdfToDocxForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentPdfToDocxForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToDocx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pdf/to/docx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentPdfToDocxForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToDocx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pdf/to/docx");

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
    * Convert PDF to Word DOCX Document based on rasterized version of the PDF
    * Convert standard PDF to Office Word Documents (docx), but first rasterize the PDF.    Converts a PDF at high fidelity into Word format.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentPdfToDocxRasterize(File inputFile) throws IOException {
        HttpResponse response = convertDocumentPdfToDocxRasterizeForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert PDF to Word DOCX Document based on rasterized version of the PDF
    * Convert standard PDF to Office Word Documents (docx), but first rasterize the PDF.    Converts a PDF at high fidelity into Word format.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentPdfToDocxRasterize(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentPdfToDocxRasterizeForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentPdfToDocxRasterizeForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToDocxRasterize");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pdf/to/docx/rasterize");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentPdfToDocxRasterizeForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToDocxRasterize");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pdf/to/docx/rasterize");

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
    * Convert PDF to JPG/JPEG image array
    * Converts a PDF Document to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
    * @return PdfToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PdfToJpgResult convertDocumentPdfToJpg(File inputFile, Integer quality) throws IOException {
        HttpResponse response = convertDocumentPdfToJpgForHttpResponse(inputFile, quality);
        TypeReference<PdfToJpgResult> typeRef = new TypeReference<PdfToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert PDF to JPG/JPEG image array
    * Converts a PDF Document to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PdfToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PdfToJpgResult convertDocumentPdfToJpg(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentPdfToJpgForHttpResponse(inputFile, params);
        TypeReference<PdfToJpgResult> typeRef = new TypeReference<PdfToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentPdfToJpgForHttpResponse(File inputFile, Integer quality) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pdf/to/jpg");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentPdfToJpgForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pdf/to/jpg");

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
    * Convert PDF to PNG Image Array
    * Convert PDF document to PNG array, one image per page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return PdfToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PdfToPngResult convertDocumentPdfToPngArray(File inputFile) throws IOException {
        HttpResponse response = convertDocumentPdfToPngArrayForHttpResponse(inputFile);
        TypeReference<PdfToPngResult> typeRef = new TypeReference<PdfToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert PDF to PNG Image Array
    * Convert PDF document to PNG array, one image per page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PdfToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PdfToPngResult convertDocumentPdfToPngArray(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentPdfToPngArrayForHttpResponse(inputFile, params);
        TypeReference<PdfToPngResult> typeRef = new TypeReference<PdfToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentPdfToPngArrayForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToPngArray");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pdf/to/png");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentPdfToPngArrayForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToPngArray");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pdf/to/png");

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
    * Convert PDF to Single PNG image
    * Convert PDF document to a single tall PNG image, by stacking/concatenating the images vertically into a single \&quot;tall\&quot; image
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentPdfToPngSingle(File inputFile) throws IOException {
        HttpResponse response = convertDocumentPdfToPngSingleForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert PDF to Single PNG image
    * Convert PDF document to a single tall PNG image, by stacking/concatenating the images vertically into a single \&quot;tall\&quot; image
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentPdfToPngSingle(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentPdfToPngSingleForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentPdfToPngSingleForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToPngSingle");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pdf/to/png/merge-single");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentPdfToPngSingleForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToPngSingle");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pdf/to/png/merge-single");

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
    * Convert PDF to PowerPoint PPTX Presentation
    * Convert standard PDF to Office PowerPoint Presentation (pptx).  Converts a PDF file at high fidelity into PowerPoint format, where it can be easily edited and processed.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentPdfToPptx(File inputFile) throws IOException {
        HttpResponse response = convertDocumentPdfToPptxForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert PDF to PowerPoint PPTX Presentation
    * Convert standard PDF to Office PowerPoint Presentation (pptx).  Converts a PDF file at high fidelity into PowerPoint format, where it can be easily edited and processed.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentPdfToPptx(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentPdfToPptxForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentPdfToPptxForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToPptx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pdf/to/pptx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentPdfToPptxForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToPptx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pdf/to/pptx");

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
    * Convert PDF Document to Text (txt)
    * PDF document to text
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param textFormattingMode Optional; specify how whitespace should be handled when converting PDF to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;preserveWhitespace&#39;.
    * @return TextConversionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextConversionResult convertDocumentPdfToTxt(File inputFile, String textFormattingMode) throws IOException {
        HttpResponse response = convertDocumentPdfToTxtForHttpResponse(inputFile, textFormattingMode);
        TypeReference<TextConversionResult> typeRef = new TypeReference<TextConversionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert PDF Document to Text (txt)
    * PDF document to text
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TextConversionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextConversionResult convertDocumentPdfToTxt(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentPdfToTxtForHttpResponse(inputFile, params);
        TypeReference<TextConversionResult> typeRef = new TypeReference<TextConversionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentPdfToTxtForHttpResponse(File inputFile, String textFormattingMode) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToTxt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pdf/to/txt");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentPdfToTxtForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToTxt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pdf/to/txt");

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
    * Convert PNG Array to PDF
    * Convert an array of PNG images, one image per page, into a newly-created PDF.  Supports images of different sizes as input.
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
    public byte[] convertDocumentPngArrayToPdf(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        HttpResponse response = convertDocumentPngArrayToPdfForHttpResponse(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert PNG Array to PDF
    * Convert an array of PNG images, one image per page, into a newly-created PDF.  Supports images of different sizes as input.
    * <p><b>200</b> - OK
    * @param inputFile1 First input file to perform the operation on.
    * @param inputFile2 Second input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentPngArrayToPdf(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentPngArrayToPdfForHttpResponse(inputFile1, inputFile2, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentPngArrayToPdfForHttpResponse(File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling convertDocumentPngArrayToPdf");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling convertDocumentPngArrayToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/png/to/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentPngArrayToPdfForHttpResponse(File inputFile1, File inputFile2, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling convertDocumentPngArrayToPdf");
        }// verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile2' when calling convertDocumentPngArrayToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/png/to/pdf");

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
    * Convert PowerPoint PPT (97-03) Presentation to PDF
    * Convert Office PowerPoint (97-2003) Documents (ppt) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentPptToPdf(File inputFile) throws IOException {
        HttpResponse response = convertDocumentPptToPdfForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert PowerPoint PPT (97-03) Presentation to PDF
    * Convert Office PowerPoint (97-2003) Documents (ppt) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentPptToPdf(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentPptToPdfForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentPptToPdfForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPptToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/ppt/to/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentPptToPdfForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPptToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/ppt/to/pdf");

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
    * Convert PowerPoint PPT (97-03) Presentation to PPTX
    * Convert/upgrade Office PowerPoint (97-2003) Documents (ppt) to modern PPTX
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentPptToPptx(File inputFile) throws IOException {
        HttpResponse response = convertDocumentPptToPptxForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert PowerPoint PPT (97-03) Presentation to PPTX
    * Convert/upgrade Office PowerPoint (97-2003) Documents (ppt) to modern PPTX
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentPptToPptx(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentPptToPptxForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentPptToPptxForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPptToPptx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/ppt/to/pptx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentPptToPptxForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPptToPptx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/ppt/to/pptx");

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
    * Convert PowerPoint PPTX Presentation to PDF
    * Convert Office PowerPoint Documents (pptx) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentPptxToPdf(File inputFile) throws IOException {
        HttpResponse response = convertDocumentPptxToPdfForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert PowerPoint PPTX Presentation to PDF
    * Convert Office PowerPoint Documents (pptx) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentPptxToPdf(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentPptxToPdfForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentPptxToPdfForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPptxToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pptx/to/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentPptxToPdfForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPptxToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pptx/to/pdf");

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
    * Convert PowerPoint PPTX to PNG image array
    * Converts a PowerPoint Presentation (PPTX) file to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return PptxToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PptxToPngResult convertDocumentPptxToPng(File inputFile) throws IOException {
        HttpResponse response = convertDocumentPptxToPngForHttpResponse(inputFile);
        TypeReference<PptxToPngResult> typeRef = new TypeReference<PptxToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert PowerPoint PPTX to PNG image array
    * Converts a PowerPoint Presentation (PPTX) file to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PptxToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PptxToPngResult convertDocumentPptxToPng(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentPptxToPngForHttpResponse(inputFile, params);
        TypeReference<PptxToPngResult> typeRef = new TypeReference<PptxToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentPptxToPngForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPptxToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pptx/to/png");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentPptxToPngForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPptxToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pptx/to/png");

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
    * Convert PowerPoint PPTX presentation to Legacy PowerPoint PPT (97-03)
    * Convert/downgrade modern Office PowerPoint PPTX Presentation to the legacy PowerPoint PPT (97-2003 Format) format
    * <p><b>200</b> - OK
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object convertDocumentPptxToPpt() throws IOException {
        HttpResponse response = convertDocumentPptxToPptForHttpResponse();
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert PowerPoint PPTX presentation to Legacy PowerPoint PPT (97-03)
    * Convert/downgrade modern Office PowerPoint PPTX Presentation to the legacy PowerPoint PPT (97-2003 Format) format
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object convertDocumentPptxToPpt(Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentPptxToPptForHttpResponse(params);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentPptxToPptForHttpResponse() throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pptx/to/ppt");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentPptxToPptForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pptx/to/ppt");

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
    * Convert PowerPoint PPTX Presentation to Text (txt)
    * Convert Office PowerPoint Documents (pptx) to standard Text
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return TextConversionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextConversionResult convertDocumentPptxToTxt(File inputFile) throws IOException {
        HttpResponse response = convertDocumentPptxToTxtForHttpResponse(inputFile);
        TypeReference<TextConversionResult> typeRef = new TypeReference<TextConversionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert PowerPoint PPTX Presentation to Text (txt)
    * Convert Office PowerPoint Documents (pptx) to standard Text
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TextConversionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextConversionResult convertDocumentPptxToTxt(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentPptxToTxtForHttpResponse(inputFile, params);
        TypeReference<TextConversionResult> typeRef = new TypeReference<TextConversionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentPptxToTxtForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPptxToTxt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pptx/to/txt");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentPptxToTxtForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentPptxToTxt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/pptx/to/txt");

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
    * Convert Rich Text Format RTF to DOCX Document
    * Convert Rich Text Format Document (RTF) to Word DOCX Document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentRtfToDocx(File inputFile) throws IOException {
        HttpResponse response = convertDocumentRtfToDocxForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Rich Text Format RTF to DOCX Document
    * Convert Rich Text Format Document (RTF) to Word DOCX Document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentRtfToDocx(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentRtfToDocxForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentRtfToDocxForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentRtfToDocx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/rtf/to/docx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentRtfToDocxForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentRtfToDocx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/rtf/to/docx");

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
    * Convert Rich Text Format RTF to HTML Document
    * Convert Rich Text Format Document (RTF) to HTML Document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentRtfToHtml(File inputFile) throws IOException {
        HttpResponse response = convertDocumentRtfToHtmlForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Rich Text Format RTF to HTML Document
    * Convert Rich Text Format Document (RTF) to HTML Document
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentRtfToHtml(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentRtfToHtmlForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentRtfToHtmlForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentRtfToHtml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/rtf/to/html");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentRtfToHtmlForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentRtfToHtml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/rtf/to/html");

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
    * Convert Rich Text Format RTF to JPG/JPEG image array
    * Converts a Rich Text Format Document (RTF) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
    * @return RtfToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public RtfToJpgResult convertDocumentRtfToJpg(File inputFile, Integer quality) throws IOException {
        HttpResponse response = convertDocumentRtfToJpgForHttpResponse(inputFile, quality);
        TypeReference<RtfToJpgResult> typeRef = new TypeReference<RtfToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Rich Text Format RTF to JPG/JPEG image array
    * Converts a Rich Text Format Document (RTF) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return RtfToJpgResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public RtfToJpgResult convertDocumentRtfToJpg(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentRtfToJpgForHttpResponse(inputFile, params);
        TypeReference<RtfToJpgResult> typeRef = new TypeReference<RtfToJpgResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentRtfToJpgForHttpResponse(File inputFile, Integer quality) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentRtfToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/rtf/to/jpg");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentRtfToJpgForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentRtfToJpg");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/rtf/to/jpg");

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
    * Convert Rich Text Format RTF to PDF
    * Convert Rich Text Format Document (RTF) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentRtfToPdf(File inputFile) throws IOException {
        HttpResponse response = convertDocumentRtfToPdfForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Rich Text Format RTF to PDF
    * Convert Rich Text Format Document (RTF) to standard PDF
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentRtfToPdf(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentRtfToPdfForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentRtfToPdfForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentRtfToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/rtf/to/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentRtfToPdfForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentRtfToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/rtf/to/pdf");

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
    * Convert Rich Text Format RTF to PNG image array
    * Converts a Rich Text Format Document (RTF) to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return RtfToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public RtfToPngResult convertDocumentRtfToPng(File inputFile) throws IOException {
        HttpResponse response = convertDocumentRtfToPngForHttpResponse(inputFile);
        TypeReference<RtfToPngResult> typeRef = new TypeReference<RtfToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Rich Text Format RTF to PNG image array
    * Converts a Rich Text Format Document (RTF) to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return RtfToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public RtfToPngResult convertDocumentRtfToPng(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentRtfToPngForHttpResponse(inputFile, params);
        TypeReference<RtfToPngResult> typeRef = new TypeReference<RtfToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentRtfToPngForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentRtfToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/rtf/to/png");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentRtfToPngForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentRtfToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/rtf/to/png");

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
    * Convert Excel XLS (97-03) Spreadsheet to CSV
    * Convert/upgrade Office Excel (97-2003) Workbooks (xls) to standard CSV format.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentXlsToCsv(File inputFile) throws IOException {
        HttpResponse response = convertDocumentXlsToCsvForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Excel XLS (97-03) Spreadsheet to CSV
    * Convert/upgrade Office Excel (97-2003) Workbooks (xls) to standard CSV format.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentXlsToCsv(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentXlsToCsvForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentXlsToCsvForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsToCsv");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xls/to/csv");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentXlsToCsvForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsToCsv");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xls/to/csv");

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
    * Convert Excel XLS (97-03) Spreadsheet to PDF
    * Convert Office Excel (97-2003) Workbooks (xls) to standard PDF.  Converts all worksheets in the workbook to PDF.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentXlsToPdf(File inputFile) throws IOException {
        HttpResponse response = convertDocumentXlsToPdfForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Excel XLS (97-03) Spreadsheet to PDF
    * Convert Office Excel (97-2003) Workbooks (xls) to standard PDF.  Converts all worksheets in the workbook to PDF.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentXlsToPdf(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentXlsToPdfForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentXlsToPdfForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xls/to/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentXlsToPdfForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xls/to/pdf");

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
    * Convert Excel XLS (97-03) Spreadsheet to XLSX
    * Convert/upgrade Office Excel (97-2003) Workbooks (xls) to modern XLSX format.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentXlsToXlsx(File inputFile) throws IOException {
        HttpResponse response = convertDocumentXlsToXlsxForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Excel XLS (97-03) Spreadsheet to XLSX
    * Convert/upgrade Office Excel (97-2003) Workbooks (xls) to modern XLSX format.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentXlsToXlsx(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentXlsToXlsxForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentXlsToXlsxForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsToXlsx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xls/to/xlsx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentXlsToXlsxForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsToXlsx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xls/to/xlsx");

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
    * Convert Excel XLSX Spreadsheet to CSV, Single Worksheet
    * Convert Office Excel Workbooks (XLSX) to standard Comma-Separated Values (CSV) format.  Supports both XLSX and XLSB file Excel formats.  If the input file contains multiple worksheets, the first one is used.  If you wish to convert all of the worksheets (not just the first one), be sure to use the xlsx/to/csv/multi API.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param outputEncoding Optional, set the output text encoding for the result; possible values are UTF-8, ASCII and UTF-32.  Default is UTF-8.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentXlsxToCsv(File inputFile, String outputEncoding) throws IOException {
        HttpResponse response = convertDocumentXlsxToCsvForHttpResponse(inputFile, outputEncoding);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Excel XLSX Spreadsheet to CSV, Single Worksheet
    * Convert Office Excel Workbooks (XLSX) to standard Comma-Separated Values (CSV) format.  Supports both XLSX and XLSB file Excel formats.  If the input file contains multiple worksheets, the first one is used.  If you wish to convert all of the worksheets (not just the first one), be sure to use the xlsx/to/csv/multi API.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentXlsxToCsv(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentXlsxToCsvForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentXlsxToCsvForHttpResponse(File inputFile, String outputEncoding) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToCsv");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/csv");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentXlsxToCsvForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToCsv");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/csv");

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
    * Convert Excel XLSX Spreadsheet to CSV, Multiple Worksheets
    * Convert Office Excel Workbooks (XLSX) to standard Comma-Separated Values (CSV) format, with support for multiple worksheets.  Supports both XLSX and XLSB file Excel formats.  Returns multiple CSV files, one for each worksheet (tab) in the spreadsheet.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param outputEncoding Optional, set the output text encoding for the result; possible values are UTF-8, ASCII and UTF-32.  Default is UTF-8.
    * @return CsvCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CsvCollection convertDocumentXlsxToCsvMulti(File inputFile, String outputEncoding) throws IOException {
        HttpResponse response = convertDocumentXlsxToCsvMultiForHttpResponse(inputFile, outputEncoding);
        TypeReference<CsvCollection> typeRef = new TypeReference<CsvCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Excel XLSX Spreadsheet to CSV, Multiple Worksheets
    * Convert Office Excel Workbooks (XLSX) to standard Comma-Separated Values (CSV) format, with support for multiple worksheets.  Supports both XLSX and XLSB file Excel formats.  Returns multiple CSV files, one for each worksheet (tab) in the spreadsheet.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CsvCollection
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CsvCollection convertDocumentXlsxToCsvMulti(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentXlsxToCsvMultiForHttpResponse(inputFile, params);
        TypeReference<CsvCollection> typeRef = new TypeReference<CsvCollection>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentXlsxToCsvMultiForHttpResponse(File inputFile, String outputEncoding) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToCsvMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/csv/multi");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentXlsxToCsvMultiForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToCsvMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/csv/multi");

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
    * Convert Excel XLSX Spreadsheet to HTML Document
    * Convert Office Excel Spreadsheet (XLSX) to HTML Document.  Converts all worksheets to HTML.  Supports both XLSX and XLSB Excel file formats.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentXlsxToHtml(File inputFile) throws IOException {
        HttpResponse response = convertDocumentXlsxToHtmlForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Excel XLSX Spreadsheet to HTML Document
    * Convert Office Excel Spreadsheet (XLSX) to HTML Document.  Converts all worksheets to HTML.  Supports both XLSX and XLSB Excel file formats.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentXlsxToHtml(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentXlsxToHtmlForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentXlsxToHtmlForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToHtml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/html");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentXlsxToHtmlForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToHtml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/html");

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
    * Convert Excel XLSX Spreadsheet to PDF
    * Convert Office Excel Workbooks (XLSX) to standard PDF.  Converts all worksheets in the workbook to PDF.  Supports both XLSX and XLSB Excel file formats.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentXlsxToPdf(File inputFile) throws IOException {
        HttpResponse response = convertDocumentXlsxToPdfForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Excel XLSX Spreadsheet to PDF
    * Convert Office Excel Workbooks (XLSX) to standard PDF.  Converts all worksheets in the workbook to PDF.  Supports both XLSX and XLSB Excel file formats.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentXlsxToPdf(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentXlsxToPdfForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentXlsxToPdfForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentXlsxToPdfForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToPdf");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/pdf");

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
    * Convert Excel XLSX spreadsheet to PNG image array
    * Converts an Excel Spreadsheet (XLSX) file to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return XlsxToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XlsxToPngResult convertDocumentXlsxToPng(File inputFile) throws IOException {
        HttpResponse response = convertDocumentXlsxToPngForHttpResponse(inputFile);
        TypeReference<XlsxToPngResult> typeRef = new TypeReference<XlsxToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Excel XLSX spreadsheet to PNG image array
    * Converts an Excel Spreadsheet (XLSX) file to an array of PNG images, one for each page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XlsxToPngResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XlsxToPngResult convertDocumentXlsxToPng(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentXlsxToPngForHttpResponse(inputFile, params);
        TypeReference<XlsxToPngResult> typeRef = new TypeReference<XlsxToPngResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentXlsxToPngForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/png");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentXlsxToPngForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToPng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/png");

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
    * Convert Excel XLSX Spreadsheet to Text (txt)
    * Convert Office Excel Workbooks (XLSX) to standard Text.  Converts all worksheets in the workbook to Text.  Supports both XLSX and XLSB file formats.  When a spreadsheet contains multiple worksheets, will export all of the text from all of the worksheets.  If you wish to export the text from only one worksheet, try using the Split XLSX API to split the spreadsheet into multiple worksheet files, and then run XLSX to Text on the individual worksheet file that you need to extract the text from.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return TextConversionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextConversionResult convertDocumentXlsxToTxt(File inputFile) throws IOException {
        HttpResponse response = convertDocumentXlsxToTxtForHttpResponse(inputFile);
        TypeReference<TextConversionResult> typeRef = new TypeReference<TextConversionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Excel XLSX Spreadsheet to Text (txt)
    * Convert Office Excel Workbooks (XLSX) to standard Text.  Converts all worksheets in the workbook to Text.  Supports both XLSX and XLSB file formats.  When a spreadsheet contains multiple worksheets, will export all of the text from all of the worksheets.  If you wish to export the text from only one worksheet, try using the Split XLSX API to split the spreadsheet into multiple worksheet files, and then run XLSX to Text on the individual worksheet file that you need to extract the text from.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return TextConversionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public TextConversionResult convertDocumentXlsxToTxt(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentXlsxToTxtForHttpResponse(inputFile, params);
        TypeReference<TextConversionResult> typeRef = new TypeReference<TextConversionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentXlsxToTxtForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToTxt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/txt");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentXlsxToTxtForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToTxt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/txt");

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
    * Convert Excel XLSX Spreadsheet to Legacy Excel XLS (97-03)
    * Convert/downgrade modern Office Excel XLSX Spreadsheet to the legacy Excel XLS (97-2003 Format) format
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentXlsxToXls(File inputFile) throws IOException {
        HttpResponse response = convertDocumentXlsxToXlsForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Excel XLSX Spreadsheet to Legacy Excel XLS (97-03)
    * Convert/downgrade modern Office Excel XLSX Spreadsheet to the legacy Excel XLS (97-2003 Format) format
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDocumentXlsxToXls(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDocumentXlsxToXlsForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDocumentXlsxToXlsForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToXls");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/xls");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDocumentXlsxToXlsForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToXls");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/xls");

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
