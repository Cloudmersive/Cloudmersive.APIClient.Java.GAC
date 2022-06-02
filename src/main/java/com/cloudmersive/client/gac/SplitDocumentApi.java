package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.SplitDocxDocumentResult;
import com.cloudmersive.client.gac.model.SplitPdfResult;
import com.cloudmersive.client.gac.model.SplitPptxPresentationResult;
import com.cloudmersive.client.gac.model.SplitTextDocumentByLinesResult;
import com.cloudmersive.client.gac.model.SplitTextDocumentByStringResult;
import com.cloudmersive.client.gac.model.SplitXlsxWorksheetResult;

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
public class SplitDocumentApi {
    private ApiClient apiClient;

    public SplitDocumentApi() {
        this(new ApiClient());
    }

    public SplitDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Split a single Word Document DOCX into Separate Documents by Page
    * Split a Word DOCX Document, comprised of multiple pages into separate Word DOCX document files, with each containing exactly one page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param returnDocumentContents Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting document.  Default is true.
    * @return SplitDocxDocumentResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SplitDocxDocumentResult splitDocumentDocx(File inputFile, Boolean returnDocumentContents) throws IOException {
        HttpResponse response = splitDocumentDocxForHttpResponse(inputFile, returnDocumentContents);
        TypeReference<SplitDocxDocumentResult> typeRef = new TypeReference<SplitDocxDocumentResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Split a single Word Document DOCX into Separate Documents by Page
    * Split a Word DOCX Document, comprised of multiple pages into separate Word DOCX document files, with each containing exactly one page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SplitDocxDocumentResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SplitDocxDocumentResult splitDocumentDocx(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = splitDocumentDocxForHttpResponse(inputFile, params);
        TypeReference<SplitDocxDocumentResult> typeRef = new TypeReference<SplitDocxDocumentResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse splitDocumentDocxForHttpResponse(File inputFile, Boolean returnDocumentContents) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling splitDocumentDocx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/split/docx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse splitDocumentDocxForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling splitDocumentDocx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/split/docx");

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
    * Split a PDF file into separate PDF files, one per page
    * Split an input PDF file into separate pages, comprised of one PDF file per page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param returnDocumentContents Set to true to directly return all of the document contents in the DocumentContents field; set to false to return contents as temporary URLs (more efficient for large operations).  Default is false.
    * @return SplitPdfResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SplitPdfResult splitDocumentPdfByPage(File inputFile, Boolean returnDocumentContents) throws IOException {
        HttpResponse response = splitDocumentPdfByPageForHttpResponse(inputFile, returnDocumentContents);
        TypeReference<SplitPdfResult> typeRef = new TypeReference<SplitPdfResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Split a PDF file into separate PDF files, one per page
    * Split an input PDF file into separate pages, comprised of one PDF file per page.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SplitPdfResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SplitPdfResult splitDocumentPdfByPage(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = splitDocumentPdfByPageForHttpResponse(inputFile, params);
        TypeReference<SplitPdfResult> typeRef = new TypeReference<SplitPdfResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse splitDocumentPdfByPageForHttpResponse(File inputFile, Boolean returnDocumentContents) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling splitDocumentPdfByPage");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/split/pdf");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse splitDocumentPdfByPageForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling splitDocumentPdfByPage");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/split/pdf");

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
    * Split a single PowerPoint Presentation PPTX into Separate Slides
    * Split an PowerPoint PPTX Presentation, comprised of multiple slides into separate PowerPoint PPTX presentation files, with each containing exactly one slide.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param returnDocumentContents Set to true to return the contents of each presentation directly, set to false to only return URLs to each resulting presentation.  Default is true.
    * @return SplitPptxPresentationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SplitPptxPresentationResult splitDocumentPptx(File inputFile, Boolean returnDocumentContents) throws IOException {
        HttpResponse response = splitDocumentPptxForHttpResponse(inputFile, returnDocumentContents);
        TypeReference<SplitPptxPresentationResult> typeRef = new TypeReference<SplitPptxPresentationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Split a single PowerPoint Presentation PPTX into Separate Slides
    * Split an PowerPoint PPTX Presentation, comprised of multiple slides into separate PowerPoint PPTX presentation files, with each containing exactly one slide.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SplitPptxPresentationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SplitPptxPresentationResult splitDocumentPptx(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = splitDocumentPptxForHttpResponse(inputFile, params);
        TypeReference<SplitPptxPresentationResult> typeRef = new TypeReference<SplitPptxPresentationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse splitDocumentPptxForHttpResponse(File inputFile, Boolean returnDocumentContents) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling splitDocumentPptx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/split/pptx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse splitDocumentPptxForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling splitDocumentPptx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/split/pptx");

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
    * Split a single Text file (txt) into lines
    * Split a Text (txt) Document by line, returning each line separately in order.  Supports multiple types of newlines.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return SplitTextDocumentByLinesResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SplitTextDocumentByLinesResult splitDocumentTxtByLine(File inputFile) throws IOException {
        HttpResponse response = splitDocumentTxtByLineForHttpResponse(inputFile);
        TypeReference<SplitTextDocumentByLinesResult> typeRef = new TypeReference<SplitTextDocumentByLinesResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Split a single Text file (txt) into lines
    * Split a Text (txt) Document by line, returning each line separately in order.  Supports multiple types of newlines.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SplitTextDocumentByLinesResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SplitTextDocumentByLinesResult splitDocumentTxtByLine(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = splitDocumentTxtByLineForHttpResponse(inputFile, params);
        TypeReference<SplitTextDocumentByLinesResult> typeRef = new TypeReference<SplitTextDocumentByLinesResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse splitDocumentTxtByLineForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling splitDocumentTxtByLine");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/split/txt/by-line");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse splitDocumentTxtByLineForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling splitDocumentTxtByLine");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/split/txt/by-line");

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
    * Split a single Text file (txt) by a string delimiter
    * Split a Text (txt) Document by a string delimiter, returning each component of the string as an array of strings.
    * <p><b>200</b> - OK
    * @param splitDelimiter Required; String to split up the input file on
    * @param inputFile Input file to perform the operation on.
    * @param skipEmptyElements Optional; If true, empty elements will be skipped in the output
    * @return SplitTextDocumentByStringResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SplitTextDocumentByStringResult splitDocumentTxtByString(String splitDelimiter, File inputFile, Boolean skipEmptyElements) throws IOException {
        HttpResponse response = splitDocumentTxtByStringForHttpResponse(splitDelimiter, inputFile, skipEmptyElements);
        TypeReference<SplitTextDocumentByStringResult> typeRef = new TypeReference<SplitTextDocumentByStringResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Split a single Text file (txt) by a string delimiter
    * Split a Text (txt) Document by a string delimiter, returning each component of the string as an array of strings.
    * <p><b>200</b> - OK
    * @param splitDelimiter Required; String to split up the input file on
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SplitTextDocumentByStringResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SplitTextDocumentByStringResult splitDocumentTxtByString(String splitDelimiter, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = splitDocumentTxtByStringForHttpResponse(splitDelimiter, inputFile, params);
        TypeReference<SplitTextDocumentByStringResult> typeRef = new TypeReference<SplitTextDocumentByStringResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse splitDocumentTxtByStringForHttpResponse(String splitDelimiter, File inputFile, Boolean skipEmptyElements) throws IOException {
        // verify the required parameter 'splitDelimiter' is set
        if (splitDelimiter == null) {
            throw new IllegalArgumentException("Missing the required parameter 'splitDelimiter' when calling splitDocumentTxtByString");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling splitDocumentTxtByString");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/split/txt/by-string");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse splitDocumentTxtByStringForHttpResponse(String splitDelimiter, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'splitDelimiter' is set
        if (splitDelimiter == null) {
            throw new IllegalArgumentException("Missing the required parameter 'splitDelimiter' when calling splitDocumentTxtByString");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling splitDocumentTxtByString");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/split/txt/by-string");

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
    * Split a single Excel XLSX into Separate Worksheets
    * Split an Excel XLSX Spreadsheet, comprised of multiple Worksheets (or Tabs) into separate Excel XLSX spreadsheet files, with each containing exactly one Worksheet.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param returnDocumentContents Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting worksheet.  Default is true.
    * @return SplitXlsxWorksheetResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SplitXlsxWorksheetResult splitDocumentXlsx(File inputFile, Boolean returnDocumentContents) throws IOException {
        HttpResponse response = splitDocumentXlsxForHttpResponse(inputFile, returnDocumentContents);
        TypeReference<SplitXlsxWorksheetResult> typeRef = new TypeReference<SplitXlsxWorksheetResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Split a single Excel XLSX into Separate Worksheets
    * Split an Excel XLSX Spreadsheet, comprised of multiple Worksheets (or Tabs) into separate Excel XLSX spreadsheet files, with each containing exactly one Worksheet.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SplitXlsxWorksheetResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SplitXlsxWorksheetResult splitDocumentXlsx(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = splitDocumentXlsxForHttpResponse(inputFile, params);
        TypeReference<SplitXlsxWorksheetResult> typeRef = new TypeReference<SplitXlsxWorksheetResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse splitDocumentXlsxForHttpResponse(File inputFile, Boolean returnDocumentContents) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling splitDocumentXlsx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/split/xlsx");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse splitDocumentXlsxForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling splitDocumentXlsx");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/split/xlsx");

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
