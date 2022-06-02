package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.HtmlGetLanguageResult;
import com.cloudmersive.client.gac.model.HtmlGetLinksResponse;
import com.cloudmersive.client.gac.model.HtmlGetRelCanonicalUrlResult;
import com.cloudmersive.client.gac.model.HtmlGetSitemapUrlResult;

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
public class EditHtmlApi {
    private ApiClient apiClient;

    public EditHtmlApi() {
        this(new ApiClient());
    }

    public EditHtmlApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Append an HTML tag to the HEAD section of an HTML Document
    * Appends an HTML tag to the HEAD section of an HTML document.
    * <p><b>200</b> - OK
    * @param htmlTag The HTML tag to append.
    * @param inputFileUrl Optional: URL of a file to operate on as input.
    * @param inputFile Optional: Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlAppendHeaderTag(String htmlTag, String inputFileUrl, File inputFile) throws IOException {
        HttpResponse response = editHtmlHtmlAppendHeaderTagForHttpResponse(htmlTag, inputFileUrl, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Append an HTML tag to the HEAD section of an HTML Document
    * Appends an HTML tag to the HEAD section of an HTML document.
    * <p><b>200</b> - OK
    * @param htmlTag The HTML tag to append.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlAppendHeaderTag(String htmlTag, Map<String, Object> params) throws IOException {
        HttpResponse response = editHtmlHtmlAppendHeaderTagForHttpResponse(htmlTag, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editHtmlHtmlAppendHeaderTagForHttpResponse(String htmlTag, String inputFileUrl, File inputFile) throws IOException {
        // verify the required parameter 'htmlTag' is set
        if (htmlTag == null) {
            throw new IllegalArgumentException("Missing the required parameter 'htmlTag' when calling editHtmlHtmlAppendHeaderTag");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/head/append/tag");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editHtmlHtmlAppendHeaderTagForHttpResponse(String htmlTag, Map<String, Object> params) throws IOException {
        // verify the required parameter 'htmlTag' is set
        if (htmlTag == null) {
            throw new IllegalArgumentException("Missing the required parameter 'htmlTag' when calling editHtmlHtmlAppendHeaderTag");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/head/append/tag");

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
    * Append a Heading to an HTML Document
    * Appends a heading to the end of an HTML document.
    * <p><b>200</b> - OK
    * @param headingText The text content to be used in the header.
    * @param inputFileUrl Optional: URL of a file to operate on as input.
    * @param headingSize Optional: The heading size number. Default is 1. Accepts values between 1 and 6.
    * @param cssStyle Optional: The CSS style for the heading.
    * @param inputFile Optional: Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlAppendHeading(String headingText, String inputFileUrl, Integer headingSize, String cssStyle, File inputFile) throws IOException {
        HttpResponse response = editHtmlHtmlAppendHeadingForHttpResponse(headingText, inputFileUrl, headingSize, cssStyle, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Append a Heading to an HTML Document
    * Appends a heading to the end of an HTML document.
    * <p><b>200</b> - OK
    * @param headingText The text content to be used in the header.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlAppendHeading(String headingText, Map<String, Object> params) throws IOException {
        HttpResponse response = editHtmlHtmlAppendHeadingForHttpResponse(headingText, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editHtmlHtmlAppendHeadingForHttpResponse(String headingText, String inputFileUrl, Integer headingSize, String cssStyle, File inputFile) throws IOException {
        // verify the required parameter 'headingText' is set
        if (headingText == null) {
            throw new IllegalArgumentException("Missing the required parameter 'headingText' when calling editHtmlHtmlAppendHeading");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/append/heading");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editHtmlHtmlAppendHeadingForHttpResponse(String headingText, Map<String, Object> params) throws IOException {
        // verify the required parameter 'headingText' is set
        if (headingText == null) {
            throw new IllegalArgumentException("Missing the required parameter 'headingText' when calling editHtmlHtmlAppendHeading");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/append/heading");

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
    * Append an Image to an HTML Document from a URL
    * Appends an image to the end of an HTML document using a URL.
    * <p><b>200</b> - OK
    * @param imageUrl The URL for the image.
    * @param inputFileUrl Optional: URL of a file to operate on as input.
    * @param cssStyle Optional: CSS style for the image.
    * @param inputFile Optional: Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlAppendImageFromUrl(String imageUrl, String inputFileUrl, String cssStyle, File inputFile) throws IOException {
        HttpResponse response = editHtmlHtmlAppendImageFromUrlForHttpResponse(imageUrl, inputFileUrl, cssStyle, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Append an Image to an HTML Document from a URL
    * Appends an image to the end of an HTML document using a URL.
    * <p><b>200</b> - OK
    * @param imageUrl The URL for the image.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlAppendImageFromUrl(String imageUrl, Map<String, Object> params) throws IOException {
        HttpResponse response = editHtmlHtmlAppendImageFromUrlForHttpResponse(imageUrl, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editHtmlHtmlAppendImageFromUrlForHttpResponse(String imageUrl, String inputFileUrl, String cssStyle, File inputFile) throws IOException {
        // verify the required parameter 'imageUrl' is set
        if (imageUrl == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageUrl' when calling editHtmlHtmlAppendImageFromUrl");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/append/image/from-url");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editHtmlHtmlAppendImageFromUrlForHttpResponse(String imageUrl, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageUrl' is set
        if (imageUrl == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageUrl' when calling editHtmlHtmlAppendImageFromUrl");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/append/image/from-url");

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
    * Append a Base64 Inline Image to an HTML Document
    * Appends a base64 inline image to the end of an HTML document from an input file or URL.
    * <p><b>200</b> - OK
    * @param inputFileUrl Optional: URL of a file to operate on as input.
    * @param imageUrl Optional: Image URL to be appended as base64 inline image.
    * @param cssStyle Optional: CSS style for the image.
    * @param imageExtension Optional: The extension (JPG, PNG, GIF, etc.) of the image file. Recommended if uploading an imageFile directly, instead of using imageUrl. If no extension can be determined, will default to JPG.
    * @param inputFile Optional: Input file to perform the operation on.
    * @param imageFile Optional: Image file to be appended as base64 inline image.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlAppendImageInline(String inputFileUrl, String imageUrl, String cssStyle, String imageExtension, File inputFile, File imageFile) throws IOException {
        HttpResponse response = editHtmlHtmlAppendImageInlineForHttpResponse(inputFileUrl, imageUrl, cssStyle, imageExtension, inputFile, imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Append a Base64 Inline Image to an HTML Document
    * Appends a base64 inline image to the end of an HTML document from an input file or URL.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlAppendImageInline(Map<String, Object> params) throws IOException {
        HttpResponse response = editHtmlHtmlAppendImageInlineForHttpResponse(params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editHtmlHtmlAppendImageInlineForHttpResponse(String inputFileUrl, String imageUrl, String cssStyle, String imageExtension, File inputFile, File imageFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/append/image/inline");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editHtmlHtmlAppendImageInlineForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/append/image/inline");

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
    * Append a Paragraph to an HTML Document
    * Appends a paragraph to the end of an HTML document.
    * <p><b>200</b> - OK
    * @param paragraphText The text content to be used in the paragraph.
    * @param inputFileUrl Optional: URL of a file to operate on as input.
    * @param cssStyle Optional: The CSS style for the paragraph.
    * @param inputFile Optional: Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlAppendParagraph(String paragraphText, String inputFileUrl, String cssStyle, File inputFile) throws IOException {
        HttpResponse response = editHtmlHtmlAppendParagraphForHttpResponse(paragraphText, inputFileUrl, cssStyle, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Append a Paragraph to an HTML Document
    * Appends a paragraph to the end of an HTML document.
    * <p><b>200</b> - OK
    * @param paragraphText The text content to be used in the paragraph.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlAppendParagraph(String paragraphText, Map<String, Object> params) throws IOException {
        HttpResponse response = editHtmlHtmlAppendParagraphForHttpResponse(paragraphText, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editHtmlHtmlAppendParagraphForHttpResponse(String paragraphText, String inputFileUrl, String cssStyle, File inputFile) throws IOException {
        // verify the required parameter 'paragraphText' is set
        if (paragraphText == null) {
            throw new IllegalArgumentException("Missing the required parameter 'paragraphText' when calling editHtmlHtmlAppendParagraph");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/append/paragraph");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editHtmlHtmlAppendParagraphForHttpResponse(String paragraphText, Map<String, Object> params) throws IOException {
        // verify the required parameter 'paragraphText' is set
        if (paragraphText == null) {
            throw new IllegalArgumentException("Missing the required parameter 'paragraphText' when calling editHtmlHtmlAppendParagraph");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/append/paragraph");

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
    * Create a Blank HTML Document
    * Returns a blank HTML Document format file.  The file is blank, with no contents by default.  Use the optional input parameters to add various starting elements.  Use additional editing commands such as Append Header, Append Paragraph or Append Image from URL to populate the document.
    * <p><b>200</b> - OK
    * @param title Optional: The title of the HTML document
    * @param cssUrl Optional: A CSS style URL to be added to the document.
    * @param cssInline Optional: An inline CSS style to be added to the document.
    * @param javascriptUrl Optional: Javascript URL to be added to the document.
    * @param javascriptInline Optional: Inline Javascript to be added to the document.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlCreateBlankDocument(String title, String cssUrl, String cssInline, String javascriptUrl, String javascriptInline) throws IOException {
        HttpResponse response = editHtmlHtmlCreateBlankDocumentForHttpResponse(title, cssUrl, cssInline, javascriptUrl, javascriptInline);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create a Blank HTML Document
    * Returns a blank HTML Document format file.  The file is blank, with no contents by default.  Use the optional input parameters to add various starting elements.  Use additional editing commands such as Append Header, Append Paragraph or Append Image from URL to populate the document.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlCreateBlankDocument(Map<String, Object> params) throws IOException {
        HttpResponse response = editHtmlHtmlCreateBlankDocumentForHttpResponse(params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editHtmlHtmlCreateBlankDocumentForHttpResponse(String title, String cssUrl, String cssInline, String javascriptUrl, String javascriptInline) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/create/blank");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editHtmlHtmlCreateBlankDocumentForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/create/blank");

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
    * Gets the language for the HTML document
    * Retrieves the language code (e.g. \&quot;en\&quot; or \&quot;de\&quot;) of an HTML document.
    * <p><b>200</b> - OK
    * @param inputFileUrl Optional: URL of a file to operate on as input.
    * @param inputFile Optional: Input file to perform the operation on.
    * @return HtmlGetLanguageResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public HtmlGetLanguageResult editHtmlHtmlGetLanguage(String inputFileUrl, File inputFile) throws IOException {
        HttpResponse response = editHtmlHtmlGetLanguageForHttpResponse(inputFileUrl, inputFile);
        TypeReference<HtmlGetLanguageResult> typeRef = new TypeReference<HtmlGetLanguageResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Gets the language for the HTML document
    * Retrieves the language code (e.g. \&quot;en\&quot; or \&quot;de\&quot;) of an HTML document.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return HtmlGetLanguageResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public HtmlGetLanguageResult editHtmlHtmlGetLanguage(Map<String, Object> params) throws IOException {
        HttpResponse response = editHtmlHtmlGetLanguageForHttpResponse(params);
        TypeReference<HtmlGetLanguageResult> typeRef = new TypeReference<HtmlGetLanguageResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editHtmlHtmlGetLanguageForHttpResponse(String inputFileUrl, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/head/get/language");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editHtmlHtmlGetLanguageForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/head/get/language");

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
    * Extract resolved link URLs from HTML File
    * Extracts the resolved link URLs, fully-qualified if possible, from an input HTML file.
    * <p><b>200</b> - OK
    * @param inputFileUrl Optional: URL of a file to operate on as input.
    * @param baseUrl Optional: Base URL of the page, such as https://mydomain.com
    * @param inputFile Optional: Input file to perform the operation on.
    * @return HtmlGetLinksResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public HtmlGetLinksResponse editHtmlHtmlGetLinks(String inputFileUrl, String baseUrl, File inputFile) throws IOException {
        HttpResponse response = editHtmlHtmlGetLinksForHttpResponse(inputFileUrl, baseUrl, inputFile);
        TypeReference<HtmlGetLinksResponse> typeRef = new TypeReference<HtmlGetLinksResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Extract resolved link URLs from HTML File
    * Extracts the resolved link URLs, fully-qualified if possible, from an input HTML file.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return HtmlGetLinksResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public HtmlGetLinksResponse editHtmlHtmlGetLinks(Map<String, Object> params) throws IOException {
        HttpResponse response = editHtmlHtmlGetLinksForHttpResponse(params);
        TypeReference<HtmlGetLinksResponse> typeRef = new TypeReference<HtmlGetLinksResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editHtmlHtmlGetLinksForHttpResponse(String inputFileUrl, String baseUrl, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/extract/links");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editHtmlHtmlGetLinksForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/extract/links");

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
    * Gets the rel canonical URL for the HTML document
    * Gets the rel canonical URL of an HTML document.
    * <p><b>200</b> - OK
    * @param inputFileUrl Optional: URL of a file to operate on as input.
    * @param inputFile Optional: Input file to perform the operation on.
    * @return HtmlGetRelCanonicalUrlResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public HtmlGetRelCanonicalUrlResult editHtmlHtmlGetRelCanonical(String inputFileUrl, File inputFile) throws IOException {
        HttpResponse response = editHtmlHtmlGetRelCanonicalForHttpResponse(inputFileUrl, inputFile);
        TypeReference<HtmlGetRelCanonicalUrlResult> typeRef = new TypeReference<HtmlGetRelCanonicalUrlResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Gets the rel canonical URL for the HTML document
    * Gets the rel canonical URL of an HTML document.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return HtmlGetRelCanonicalUrlResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public HtmlGetRelCanonicalUrlResult editHtmlHtmlGetRelCanonical(Map<String, Object> params) throws IOException {
        HttpResponse response = editHtmlHtmlGetRelCanonicalForHttpResponse(params);
        TypeReference<HtmlGetRelCanonicalUrlResult> typeRef = new TypeReference<HtmlGetRelCanonicalUrlResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editHtmlHtmlGetRelCanonicalForHttpResponse(String inputFileUrl, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/head/get/rel-canonical-url");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editHtmlHtmlGetRelCanonicalForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/head/get/rel-canonical-url");

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
    * Gets the sitemap URL for the HTML document
    * Gets the sitemap link URL of an HTML document.
    * <p><b>200</b> - OK
    * @param inputFileUrl Optional: URL of a file to operate on as input.
    * @param inputFile Optional: Input file to perform the operation on.
    * @return HtmlGetSitemapUrlResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public HtmlGetSitemapUrlResult editHtmlHtmlGetSitemap(String inputFileUrl, File inputFile) throws IOException {
        HttpResponse response = editHtmlHtmlGetSitemapForHttpResponse(inputFileUrl, inputFile);
        TypeReference<HtmlGetSitemapUrlResult> typeRef = new TypeReference<HtmlGetSitemapUrlResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Gets the sitemap URL for the HTML document
    * Gets the sitemap link URL of an HTML document.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return HtmlGetSitemapUrlResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public HtmlGetSitemapUrlResult editHtmlHtmlGetSitemap(Map<String, Object> params) throws IOException {
        HttpResponse response = editHtmlHtmlGetSitemapForHttpResponse(params);
        TypeReference<HtmlGetSitemapUrlResult> typeRef = new TypeReference<HtmlGetSitemapUrlResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editHtmlHtmlGetSitemapForHttpResponse(String inputFileUrl, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/head/get/sitemap-url");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editHtmlHtmlGetSitemapForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/head/get/sitemap-url");

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
    * Sets the language for the HTML document
    * Sets the language code of an HTML document.
    * <p><b>200</b> - OK
    * @param languageCode The HTML langauge code to set.
    * @param inputFileUrl Optional: URL of a file to operate on as input.
    * @param inputFile Optional: Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlSetLanguage(String languageCode, String inputFileUrl, File inputFile) throws IOException {
        HttpResponse response = editHtmlHtmlSetLanguageForHttpResponse(languageCode, inputFileUrl, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Sets the language for the HTML document
    * Sets the language code of an HTML document.
    * <p><b>200</b> - OK
    * @param languageCode The HTML langauge code to set.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlSetLanguage(String languageCode, Map<String, Object> params) throws IOException {
        HttpResponse response = editHtmlHtmlSetLanguageForHttpResponse(languageCode, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editHtmlHtmlSetLanguageForHttpResponse(String languageCode, String inputFileUrl, File inputFile) throws IOException {
        // verify the required parameter 'languageCode' is set
        if (languageCode == null) {
            throw new IllegalArgumentException("Missing the required parameter 'languageCode' when calling editHtmlHtmlSetLanguage");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/head/set/language");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editHtmlHtmlSetLanguageForHttpResponse(String languageCode, Map<String, Object> params) throws IOException {
        // verify the required parameter 'languageCode' is set
        if (languageCode == null) {
            throw new IllegalArgumentException("Missing the required parameter 'languageCode' when calling editHtmlHtmlSetLanguage");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/head/set/language");

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
    * Sets the rel canonical URL for the HTML document
    * Sets the rel canonical URL of an HTML document.  This is useful for telling search engines and other indexers which pages are duplicates of eachother; any pages with the rel&#x3D;canonical tag will be treated as duplicates of the canonical URL.
    * <p><b>200</b> - OK
    * @param canonicalUrl The HTML canonical URL to set.
    * @param inputFileUrl Optional: URL of a file to operate on as input.
    * @param inputFile Optional: Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlSetRelCanonical(String canonicalUrl, String inputFileUrl, File inputFile) throws IOException {
        HttpResponse response = editHtmlHtmlSetRelCanonicalForHttpResponse(canonicalUrl, inputFileUrl, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Sets the rel canonical URL for the HTML document
    * Sets the rel canonical URL of an HTML document.  This is useful for telling search engines and other indexers which pages are duplicates of eachother; any pages with the rel&#x3D;canonical tag will be treated as duplicates of the canonical URL.
    * <p><b>200</b> - OK
    * @param canonicalUrl The HTML canonical URL to set.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlSetRelCanonical(String canonicalUrl, Map<String, Object> params) throws IOException {
        HttpResponse response = editHtmlHtmlSetRelCanonicalForHttpResponse(canonicalUrl, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editHtmlHtmlSetRelCanonicalForHttpResponse(String canonicalUrl, String inputFileUrl, File inputFile) throws IOException {
        // verify the required parameter 'canonicalUrl' is set
        if (canonicalUrl == null) {
            throw new IllegalArgumentException("Missing the required parameter 'canonicalUrl' when calling editHtmlHtmlSetRelCanonical");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/head/set/rel-canonical-url");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editHtmlHtmlSetRelCanonicalForHttpResponse(String canonicalUrl, Map<String, Object> params) throws IOException {
        // verify the required parameter 'canonicalUrl' is set
        if (canonicalUrl == null) {
            throw new IllegalArgumentException("Missing the required parameter 'canonicalUrl' when calling editHtmlHtmlSetRelCanonical");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/head/set/rel-canonical-url");

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
    * Sets the sitemap URL for the HTML document
    * Sets the sitemap URL of an HTML document.
    * <p><b>200</b> - OK
    * @param sitemapUrl The HTML sitemap URL to set.
    * @param inputFileUrl Optional: URL of a file to operate on as input.
    * @param inputFile Optional: Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlSetSitemapUrl(String sitemapUrl, String inputFileUrl, File inputFile) throws IOException {
        HttpResponse response = editHtmlHtmlSetSitemapUrlForHttpResponse(sitemapUrl, inputFileUrl, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Sets the sitemap URL for the HTML document
    * Sets the sitemap URL of an HTML document.
    * <p><b>200</b> - OK
    * @param sitemapUrl The HTML sitemap URL to set.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] editHtmlHtmlSetSitemapUrl(String sitemapUrl, Map<String, Object> params) throws IOException {
        HttpResponse response = editHtmlHtmlSetSitemapUrlForHttpResponse(sitemapUrl, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse editHtmlHtmlSetSitemapUrlForHttpResponse(String sitemapUrl, String inputFileUrl, File inputFile) throws IOException {
        // verify the required parameter 'sitemapUrl' is set
        if (sitemapUrl == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sitemapUrl' when calling editHtmlHtmlSetSitemapUrl");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/head/set/sitemap-url");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse editHtmlHtmlSetSitemapUrlForHttpResponse(String sitemapUrl, Map<String, Object> params) throws IOException {
        // verify the required parameter 'sitemapUrl' is set
        if (sitemapUrl == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sitemapUrl' when calling editHtmlHtmlSetSitemapUrl");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/edit/html/head/set/sitemap-url");

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
