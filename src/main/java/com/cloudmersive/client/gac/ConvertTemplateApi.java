package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.HtmlTemplateApplicationRequest;
import com.cloudmersive.client.gac.model.HtmlTemplateApplicationResponse;

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
public class ConvertTemplateApi {
    private ApiClient apiClient;

    public ConvertTemplateApi() {
        this(new ApiClient());
    }

    public ConvertTemplateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Apply Word DOCX template
    * Apply operations to fill in a Word DOCX template by replacing target template/placeholder strings in the DOCX with values, generating a final Word DOCX result.  For example, you could create a Word Document invoice containing strings such as \&quot;{FirstName}\&quot; and \&quot;{LastName}\&quot; and then replace these values with \&quot;John\&quot; and \&quot;Smith\&quot;.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param templateDefinition Template definition for the document, including what values to replace
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertTemplateApplyDocxTemplate(File inputFile, Object templateDefinition) throws IOException {
        HttpResponse response = convertTemplateApplyDocxTemplateForHttpResponse(inputFile, templateDefinition);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Apply Word DOCX template
    * Apply operations to fill in a Word DOCX template by replacing target template/placeholder strings in the DOCX with values, generating a final Word DOCX result.  For example, you could create a Word Document invoice containing strings such as \&quot;{FirstName}\&quot; and \&quot;{LastName}\&quot; and then replace these values with \&quot;John\&quot; and \&quot;Smith\&quot;.
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertTemplateApplyDocxTemplate(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertTemplateApplyDocxTemplateForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertTemplateApplyDocxTemplateForHttpResponse(File inputFile, Object templateDefinition) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertTemplateApplyDocxTemplate");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/template/docx/apply");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertTemplateApplyDocxTemplateForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertTemplateApplyDocxTemplate");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/template/docx/apply");

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
    * Apply HTML template
    * Apply operations to fill in an HTML template, generating a final HTML result
    * <p><b>200</b> - OK
    * @param value Operations to apply to template
    * @return HtmlTemplateApplicationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public HtmlTemplateApplicationResponse convertTemplateApplyHtmlTemplate(HtmlTemplateApplicationRequest value) throws IOException {
        HttpResponse response = convertTemplateApplyHtmlTemplateForHttpResponse(value);
        TypeReference<HtmlTemplateApplicationResponse> typeRef = new TypeReference<HtmlTemplateApplicationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Apply HTML template
    * Apply operations to fill in an HTML template, generating a final HTML result
    * <p><b>200</b> - OK
    * @param value Operations to apply to template
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return HtmlTemplateApplicationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public HtmlTemplateApplicationResponse convertTemplateApplyHtmlTemplate(HtmlTemplateApplicationRequest value, Map<String, Object> params) throws IOException {
        HttpResponse response = convertTemplateApplyHtmlTemplateForHttpResponse(value, params);
        TypeReference<HtmlTemplateApplicationResponse> typeRef = new TypeReference<HtmlTemplateApplicationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertTemplateApplyHtmlTemplateForHttpResponse(HtmlTemplateApplicationRequest value) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling convertTemplateApplyHtmlTemplate");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/template/html/apply");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse convertTemplateApplyHtmlTemplateForHttpResponse(java.io.InputStream value, String mediaType) throws IOException {
          // verify the required parameter 'value' is set
              if (value == null) {
              throw new IllegalArgumentException("Missing the required parameter 'value' when calling convertTemplateApplyHtmlTemplate");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/template/html/apply");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = value == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, value);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse convertTemplateApplyHtmlTemplateForHttpResponse(HtmlTemplateApplicationRequest value, Map<String, Object> params) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling convertTemplateApplyHtmlTemplate");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/template/html/apply");

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
