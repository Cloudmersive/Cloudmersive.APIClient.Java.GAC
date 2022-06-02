package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.EmailLead;
import com.cloudmersive.client.gac.model.LeadEnrichmentRequest;
import com.cloudmersive.client.gac.model.LeadEnrichmentResponse;

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
public class LeadEnrichmentApi {
    private ApiClient apiClient;

    public LeadEnrichmentApi() {
        this(new ApiClient());
    }

    public LeadEnrichmentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Enrich an input lead with additional fields of data
    * <p><b>200</b> - OK
    * @param request Input lead with known fields set, and unknown fields left blank (null)
    * @return LeadEnrichmentResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LeadEnrichmentResponse leadEnrichmentEnrichLead(LeadEnrichmentRequest request) throws IOException {
        HttpResponse response = leadEnrichmentEnrichLeadForHttpResponse(request);
        TypeReference<LeadEnrichmentResponse> typeRef = new TypeReference<LeadEnrichmentResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Enrich an input lead with additional fields of data
    * <p><b>200</b> - OK
    * @param request Input lead with known fields set, and unknown fields left blank (null)
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return LeadEnrichmentResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LeadEnrichmentResponse leadEnrichmentEnrichLead(LeadEnrichmentRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = leadEnrichmentEnrichLeadForHttpResponse(request, params);
        TypeReference<LeadEnrichmentResponse> typeRef = new TypeReference<LeadEnrichmentResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse leadEnrichmentEnrichLeadForHttpResponse(LeadEnrichmentRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling leadEnrichmentEnrichLead");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/lead-enrichment/lead/enrich");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse leadEnrichmentEnrichLeadForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling leadEnrichmentEnrichLead");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/lead-enrichment/lead/enrich");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse leadEnrichmentEnrichLeadForHttpResponse(LeadEnrichmentRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling leadEnrichmentEnrichLead");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/lead-enrichment/lead/enrich");

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
    * Get company information from email address
    * <p><b>200</b> - OK
    * @param request Input email address lead
    * @return LeadEnrichmentResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LeadEnrichmentResponse leadEnrichmentGetCompanyInformation(EmailLead request) throws IOException {
        HttpResponse response = leadEnrichmentGetCompanyInformationForHttpResponse(request);
        TypeReference<LeadEnrichmentResponse> typeRef = new TypeReference<LeadEnrichmentResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get company information from email address
    * <p><b>200</b> - OK
    * @param request Input email address lead
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return LeadEnrichmentResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LeadEnrichmentResponse leadEnrichmentGetCompanyInformation(EmailLead request, Map<String, Object> params) throws IOException {
        HttpResponse response = leadEnrichmentGetCompanyInformationForHttpResponse(request, params);
        TypeReference<LeadEnrichmentResponse> typeRef = new TypeReference<LeadEnrichmentResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse leadEnrichmentGetCompanyInformationForHttpResponse(EmailLead request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling leadEnrichmentGetCompanyInformation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/lead-enrichment/lead/email/company-information");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse leadEnrichmentGetCompanyInformationForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling leadEnrichmentGetCompanyInformation");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/lead-enrichment/lead/email/company-information");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse leadEnrichmentGetCompanyInformationForHttpResponse(EmailLead request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling leadEnrichmentGetCompanyInformation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/lead-enrichment/lead/email/company-information");

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
