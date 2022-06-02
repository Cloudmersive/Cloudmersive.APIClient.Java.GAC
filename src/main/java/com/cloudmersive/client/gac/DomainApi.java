package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.CheckResponse;
import com.cloudmersive.client.gac.model.DomainQualityResponse;
import com.cloudmersive.client.gac.model.IsAdminPathResponse;
import com.cloudmersive.client.gac.model.PhishingCheckRequest;
import com.cloudmersive.client.gac.model.PhishingCheckResponse;
import com.cloudmersive.client.gac.model.UrlHtmlSsrfRequestFull;
import com.cloudmersive.client.gac.model.UrlHtmlSsrfResponseFull;
import com.cloudmersive.client.gac.model.UrlSafetyCheckRequestFull;
import com.cloudmersive.client.gac.model.UrlSafetyCheckResponseFull;
import com.cloudmersive.client.gac.model.UrlSsrfRequestBatch;
import com.cloudmersive.client.gac.model.UrlSsrfRequestFull;
import com.cloudmersive.client.gac.model.UrlSsrfResponseBatch;
import com.cloudmersive.client.gac.model.UrlSsrfResponseFull;
import com.cloudmersive.client.gac.model.ValidateUrlRequestFull;
import com.cloudmersive.client.gac.model.ValidateUrlRequestSyntaxOnly;
import com.cloudmersive.client.gac.model.ValidateUrlResponseFull;
import com.cloudmersive.client.gac.model.ValidateUrlResponseSyntaxOnly;
import com.cloudmersive.client.gac.model.WhoisResponse;

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
public class DomainApi {
    private ApiClient apiClient;

    public DomainApi() {
        this(new ApiClient());
    }

    public DomainApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Validate a domain name
    * Check whether a domain name is valid or not.  API performs a live validation by contacting DNS services to validate the existence of the domain name.
    * <p><b>200</b> - OK
    * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.  The input is a string so be sure to enclose it in double-quotes.
    * @return CheckResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CheckResponse domainCheck(String domain) throws IOException {
        HttpResponse response = domainCheckForHttpResponse(domain);
        TypeReference<CheckResponse> typeRef = new TypeReference<CheckResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a domain name
    * Check whether a domain name is valid or not.  API performs a live validation by contacting DNS services to validate the existence of the domain name.
    * <p><b>200</b> - OK
    * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.  The input is a string so be sure to enclose it in double-quotes.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CheckResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CheckResponse domainCheck(String domain, Map<String, Object> params) throws IOException {
        HttpResponse response = domainCheckForHttpResponse(domain, params);
        TypeReference<CheckResponse> typeRef = new TypeReference<CheckResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse domainCheckForHttpResponse(String domain) throws IOException {
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new IllegalArgumentException("Missing the required parameter 'domain' when calling domainCheck");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/check");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(domain);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse domainCheckForHttpResponse(java.io.InputStream domain, String mediaType) throws IOException {
          // verify the required parameter 'domain' is set
              if (domain == null) {
              throw new IllegalArgumentException("Missing the required parameter 'domain' when calling domainCheck");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/check");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = domain == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, domain);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse domainCheckForHttpResponse(String domain, Map<String, Object> params) throws IOException {
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new IllegalArgumentException("Missing the required parameter 'domain' when calling domainCheck");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/check");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(domain);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get top-level domain name from URL
    * Gets the top-level domain name from a URL, such as mydomain.com.
    * <p><b>200</b> - OK
    * @param request Input URL information
    * @return ValidateUrlResponseSyntaxOnly
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateUrlResponseSyntaxOnly domainGetTopLevelDomainFromUrl(ValidateUrlRequestSyntaxOnly request) throws IOException {
        HttpResponse response = domainGetTopLevelDomainFromUrlForHttpResponse(request);
        TypeReference<ValidateUrlResponseSyntaxOnly> typeRef = new TypeReference<ValidateUrlResponseSyntaxOnly>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get top-level domain name from URL
    * Gets the top-level domain name from a URL, such as mydomain.com.
    * <p><b>200</b> - OK
    * @param request Input URL information
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ValidateUrlResponseSyntaxOnly
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateUrlResponseSyntaxOnly domainGetTopLevelDomainFromUrl(ValidateUrlRequestSyntaxOnly request, Map<String, Object> params) throws IOException {
        HttpResponse response = domainGetTopLevelDomainFromUrlForHttpResponse(request, params);
        TypeReference<ValidateUrlResponseSyntaxOnly> typeRef = new TypeReference<ValidateUrlResponseSyntaxOnly>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse domainGetTopLevelDomainFromUrlForHttpResponse(ValidateUrlRequestSyntaxOnly request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainGetTopLevelDomainFromUrl");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/get-top-level-domain");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse domainGetTopLevelDomainFromUrlForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainGetTopLevelDomainFromUrl");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/get-top-level-domain");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse domainGetTopLevelDomainFromUrlForHttpResponse(ValidateUrlRequestSyntaxOnly request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainGetTopLevelDomainFromUrl");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/get-top-level-domain");

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
    * Check if path is a high-risk or vulnerable server administration path
    * Check if the input URL or relative path is a server Administration Path, and therefore a risk or vulnerability for remote access.
    * <p><b>200</b> - OK
    * @param value URL or relative path to check, e.g. \&quot;/admin/login\&quot;.  The input is a string so be sure to enclose it in double-quotes.
    * @return IsAdminPathResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public IsAdminPathResponse domainIsAdminPath(String value) throws IOException {
        HttpResponse response = domainIsAdminPathForHttpResponse(value);
        TypeReference<IsAdminPathResponse> typeRef = new TypeReference<IsAdminPathResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Check if path is a high-risk or vulnerable server administration path
    * Check if the input URL or relative path is a server Administration Path, and therefore a risk or vulnerability for remote access.
    * <p><b>200</b> - OK
    * @param value URL or relative path to check, e.g. \&quot;/admin/login\&quot;.  The input is a string so be sure to enclose it in double-quotes.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return IsAdminPathResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public IsAdminPathResponse domainIsAdminPath(String value, Map<String, Object> params) throws IOException {
        HttpResponse response = domainIsAdminPathForHttpResponse(value, params);
        TypeReference<IsAdminPathResponse> typeRef = new TypeReference<IsAdminPathResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse domainIsAdminPathForHttpResponse(String value) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling domainIsAdminPath");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/is-admin-path");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(value);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse domainIsAdminPathForHttpResponse(java.io.InputStream value, String mediaType) throws IOException {
          // verify the required parameter 'value' is set
              if (value == null) {
              throw new IllegalArgumentException("Missing the required parameter 'value' when calling domainIsAdminPath");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/is-admin-path");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = value == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, value);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse domainIsAdminPathForHttpResponse(String value, Map<String, Object> params) throws IOException {
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new IllegalArgumentException("Missing the required parameter 'value' when calling domainIsAdminPath");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/is-admin-path");

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


  /**
    * Check a URL for Phishing threats
    * Checks if an input URL is at risk of being an Phishing (fake login page, or other page designed to collect information via social engineering) threat or attack.
    * <p><b>200</b> - OK
    * @param request Input URL request
    * @return PhishingCheckResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PhishingCheckResponse domainPhishingCheck(PhishingCheckRequest request) throws IOException {
        HttpResponse response = domainPhishingCheckForHttpResponse(request);
        TypeReference<PhishingCheckResponse> typeRef = new TypeReference<PhishingCheckResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Check a URL for Phishing threats
    * Checks if an input URL is at risk of being an Phishing (fake login page, or other page designed to collect information via social engineering) threat or attack.
    * <p><b>200</b> - OK
    * @param request Input URL request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PhishingCheckResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PhishingCheckResponse domainPhishingCheck(PhishingCheckRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = domainPhishingCheckForHttpResponse(request, params);
        TypeReference<PhishingCheckResponse> typeRef = new TypeReference<PhishingCheckResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse domainPhishingCheckForHttpResponse(PhishingCheckRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainPhishingCheck");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/phishing-threat-check");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse domainPhishingCheckForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainPhishingCheck");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/phishing-threat-check");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse domainPhishingCheckForHttpResponse(PhishingCheckRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainPhishingCheck");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/phishing-threat-check");

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
    * Get WHOIS information for a domain
    * Validate whether a domain name exists, and also return the full WHOIS record for that domain name.  WHOIS records include all the registration details of the domain name, such as information about the domain&#39;s owners.
    * <p><b>200</b> - OK
    * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.   The input is a string so be sure to enclose it in double-quotes.
    * @return WhoisResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public WhoisResponse domainPost(String domain) throws IOException {
        HttpResponse response = domainPostForHttpResponse(domain);
        TypeReference<WhoisResponse> typeRef = new TypeReference<WhoisResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get WHOIS information for a domain
    * Validate whether a domain name exists, and also return the full WHOIS record for that domain name.  WHOIS records include all the registration details of the domain name, such as information about the domain&#39;s owners.
    * <p><b>200</b> - OK
    * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.   The input is a string so be sure to enclose it in double-quotes.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return WhoisResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public WhoisResponse domainPost(String domain, Map<String, Object> params) throws IOException {
        HttpResponse response = domainPostForHttpResponse(domain, params);
        TypeReference<WhoisResponse> typeRef = new TypeReference<WhoisResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse domainPostForHttpResponse(String domain) throws IOException {
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new IllegalArgumentException("Missing the required parameter 'domain' when calling domainPost");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/whois");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(domain);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse domainPostForHttpResponse(java.io.InputStream domain, String mediaType) throws IOException {
          // verify the required parameter 'domain' is set
              if (domain == null) {
              throw new IllegalArgumentException("Missing the required parameter 'domain' when calling domainPost");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/whois");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = domain == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, domain);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse domainPostForHttpResponse(String domain, Map<String, Object> params) throws IOException {
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new IllegalArgumentException("Missing the required parameter 'domain' when calling domainPost");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/whois");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(domain);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Validate a domain name&#39;s quality score
    * Check the quality of a domain name.  Supports over 9 million domain names.  Higher quality scores indicate more trust and authority in the domain name, with values ranging from 0.0 (low quality) to 10.0 (maximum quality).
    * <p><b>200</b> - OK
    * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.
    * @return DomainQualityResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DomainQualityResponse domainQualityScore(String domain) throws IOException {
        HttpResponse response = domainQualityScoreForHttpResponse(domain);
        TypeReference<DomainQualityResponse> typeRef = new TypeReference<DomainQualityResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a domain name&#39;s quality score
    * Check the quality of a domain name.  Supports over 9 million domain names.  Higher quality scores indicate more trust and authority in the domain name, with values ranging from 0.0 (low quality) to 10.0 (maximum quality).
    * <p><b>200</b> - OK
    * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DomainQualityResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DomainQualityResponse domainQualityScore(String domain, Map<String, Object> params) throws IOException {
        HttpResponse response = domainQualityScoreForHttpResponse(domain, params);
        TypeReference<DomainQualityResponse> typeRef = new TypeReference<DomainQualityResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse domainQualityScoreForHttpResponse(String domain) throws IOException {
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new IllegalArgumentException("Missing the required parameter 'domain' when calling domainQualityScore");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/quality-score");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(domain);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse domainQualityScoreForHttpResponse(java.io.InputStream domain, String mediaType) throws IOException {
          // verify the required parameter 'domain' is set
              if (domain == null) {
              throw new IllegalArgumentException("Missing the required parameter 'domain' when calling domainQualityScore");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/quality-score");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = domain == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, domain);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse domainQualityScoreForHttpResponse(String domain, Map<String, Object> params) throws IOException {
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new IllegalArgumentException("Missing the required parameter 'domain' when calling domainQualityScore");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/quality-score");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(domain);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Check a URL for safety threats
    * Checks if an input URL is at risk of being a safety threat through malware, unwanted software, or social engineering threats.
    * <p><b>200</b> - OK
    * @param request Input URL request
    * @return UrlSafetyCheckResponseFull
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UrlSafetyCheckResponseFull domainSafetyCheck(UrlSafetyCheckRequestFull request) throws IOException {
        HttpResponse response = domainSafetyCheckForHttpResponse(request);
        TypeReference<UrlSafetyCheckResponseFull> typeRef = new TypeReference<UrlSafetyCheckResponseFull>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Check a URL for safety threats
    * Checks if an input URL is at risk of being a safety threat through malware, unwanted software, or social engineering threats.
    * <p><b>200</b> - OK
    * @param request Input URL request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return UrlSafetyCheckResponseFull
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UrlSafetyCheckResponseFull domainSafetyCheck(UrlSafetyCheckRequestFull request, Map<String, Object> params) throws IOException {
        HttpResponse response = domainSafetyCheckForHttpResponse(request, params);
        TypeReference<UrlSafetyCheckResponseFull> typeRef = new TypeReference<UrlSafetyCheckResponseFull>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse domainSafetyCheckForHttpResponse(UrlSafetyCheckRequestFull request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainSafetyCheck");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/safety-threat-check");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse domainSafetyCheckForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainSafetyCheck");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/safety-threat-check");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse domainSafetyCheckForHttpResponse(UrlSafetyCheckRequestFull request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainSafetyCheck");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/safety-threat-check");

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
    * Check a URL for SSRF threats
    * Checks if an input URL is at risk of being an SSRF (Server-side request forgery) threat or attack.
    * <p><b>200</b> - OK
    * @param request Input URL request
    * @return UrlSsrfResponseFull
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UrlSsrfResponseFull domainSsrfCheck(UrlSsrfRequestFull request) throws IOException {
        HttpResponse response = domainSsrfCheckForHttpResponse(request);
        TypeReference<UrlSsrfResponseFull> typeRef = new TypeReference<UrlSsrfResponseFull>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Check a URL for SSRF threats
    * Checks if an input URL is at risk of being an SSRF (Server-side request forgery) threat or attack.
    * <p><b>200</b> - OK
    * @param request Input URL request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return UrlSsrfResponseFull
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UrlSsrfResponseFull domainSsrfCheck(UrlSsrfRequestFull request, Map<String, Object> params) throws IOException {
        HttpResponse response = domainSsrfCheckForHttpResponse(request, params);
        TypeReference<UrlSsrfResponseFull> typeRef = new TypeReference<UrlSsrfResponseFull>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse domainSsrfCheckForHttpResponse(UrlSsrfRequestFull request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainSsrfCheck");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/ssrf-threat-check");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse domainSsrfCheckForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainSsrfCheck");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/ssrf-threat-check");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse domainSsrfCheckForHttpResponse(UrlSsrfRequestFull request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainSsrfCheck");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/ssrf-threat-check");

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
    * Check a URL for SSRF threats in batches
    * Batch-checks if input URLs are at risk of being an SSRF (Server-side request forgery) threat or attack.
    * <p><b>200</b> - OK
    * @param request Input URL request as a batch of multiple URLs
    * @return UrlSsrfResponseBatch
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UrlSsrfResponseBatch domainSsrfCheckBatch(UrlSsrfRequestBatch request) throws IOException {
        HttpResponse response = domainSsrfCheckBatchForHttpResponse(request);
        TypeReference<UrlSsrfResponseBatch> typeRef = new TypeReference<UrlSsrfResponseBatch>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Check a URL for SSRF threats in batches
    * Batch-checks if input URLs are at risk of being an SSRF (Server-side request forgery) threat or attack.
    * <p><b>200</b> - OK
    * @param request Input URL request as a batch of multiple URLs
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return UrlSsrfResponseBatch
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UrlSsrfResponseBatch domainSsrfCheckBatch(UrlSsrfRequestBatch request, Map<String, Object> params) throws IOException {
        HttpResponse response = domainSsrfCheckBatchForHttpResponse(request, params);
        TypeReference<UrlSsrfResponseBatch> typeRef = new TypeReference<UrlSsrfResponseBatch>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse domainSsrfCheckBatchForHttpResponse(UrlSsrfRequestBatch request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainSsrfCheckBatch");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/ssrf-threat-check/batch");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse domainSsrfCheckBatchForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainSsrfCheckBatch");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/ssrf-threat-check/batch");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse domainSsrfCheckBatchForHttpResponse(UrlSsrfRequestBatch request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainSsrfCheckBatch");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/ssrf-threat-check/batch");

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
    * Validate a URL fully
    * Validate whether a URL is syntactically valid (does not check endpoint for validity), whether it exists, and whether the endpoint is up and passes virus scan checks.  Accepts various types of input and produces a well-formed URL as output.
    * <p><b>200</b> - OK
    * @param request Input URL request
    * @return ValidateUrlResponseFull
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateUrlResponseFull domainUrlFull(ValidateUrlRequestFull request) throws IOException {
        HttpResponse response = domainUrlFullForHttpResponse(request);
        TypeReference<ValidateUrlResponseFull> typeRef = new TypeReference<ValidateUrlResponseFull>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a URL fully
    * Validate whether a URL is syntactically valid (does not check endpoint for validity), whether it exists, and whether the endpoint is up and passes virus scan checks.  Accepts various types of input and produces a well-formed URL as output.
    * <p><b>200</b> - OK
    * @param request Input URL request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ValidateUrlResponseFull
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateUrlResponseFull domainUrlFull(ValidateUrlRequestFull request, Map<String, Object> params) throws IOException {
        HttpResponse response = domainUrlFullForHttpResponse(request, params);
        TypeReference<ValidateUrlResponseFull> typeRef = new TypeReference<ValidateUrlResponseFull>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse domainUrlFullForHttpResponse(ValidateUrlRequestFull request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainUrlFull");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/full");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse domainUrlFullForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainUrlFull");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/full");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse domainUrlFullForHttpResponse(ValidateUrlRequestFull request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainUrlFull");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/full");

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
    * Check a URL for HTML embedded SSRF threats
    * Checks if an input URL HTML is at risk of containing one or more embedded SSRF (Server-side request forgery) threats or attacks.
    * <p><b>200</b> - OK
    * @param request Input URL request
    * @return UrlHtmlSsrfResponseFull
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UrlHtmlSsrfResponseFull domainUrlHtmlSsrfCheck(UrlHtmlSsrfRequestFull request) throws IOException {
        HttpResponse response = domainUrlHtmlSsrfCheckForHttpResponse(request);
        TypeReference<UrlHtmlSsrfResponseFull> typeRef = new TypeReference<UrlHtmlSsrfResponseFull>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Check a URL for HTML embedded SSRF threats
    * Checks if an input URL HTML is at risk of containing one or more embedded SSRF (Server-side request forgery) threats or attacks.
    * <p><b>200</b> - OK
    * @param request Input URL request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return UrlHtmlSsrfResponseFull
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UrlHtmlSsrfResponseFull domainUrlHtmlSsrfCheck(UrlHtmlSsrfRequestFull request, Map<String, Object> params) throws IOException {
        HttpResponse response = domainUrlHtmlSsrfCheckForHttpResponse(request, params);
        TypeReference<UrlHtmlSsrfResponseFull> typeRef = new TypeReference<UrlHtmlSsrfResponseFull>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse domainUrlHtmlSsrfCheckForHttpResponse(UrlHtmlSsrfRequestFull request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainUrlHtmlSsrfCheck");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/ssrf-threat-check/html-embedded");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse domainUrlHtmlSsrfCheckForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainUrlHtmlSsrfCheck");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/ssrf-threat-check/html-embedded");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse domainUrlHtmlSsrfCheckForHttpResponse(UrlHtmlSsrfRequestFull request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainUrlHtmlSsrfCheck");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/ssrf-threat-check/html-embedded");

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
    * Validate a URL syntactically
    * Validate whether a URL is syntactically valid (does not check endpoint for validity).  Accepts various types of input and produces a well-formed URL as output.
    * <p><b>200</b> - OK
    * @param request Input URL information
    * @return ValidateUrlResponseSyntaxOnly
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateUrlResponseSyntaxOnly domainUrlSyntaxOnly(ValidateUrlRequestSyntaxOnly request) throws IOException {
        HttpResponse response = domainUrlSyntaxOnlyForHttpResponse(request);
        TypeReference<ValidateUrlResponseSyntaxOnly> typeRef = new TypeReference<ValidateUrlResponseSyntaxOnly>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a URL syntactically
    * Validate whether a URL is syntactically valid (does not check endpoint for validity).  Accepts various types of input and produces a well-formed URL as output.
    * <p><b>200</b> - OK
    * @param request Input URL information
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ValidateUrlResponseSyntaxOnly
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateUrlResponseSyntaxOnly domainUrlSyntaxOnly(ValidateUrlRequestSyntaxOnly request, Map<String, Object> params) throws IOException {
        HttpResponse response = domainUrlSyntaxOnlyForHttpResponse(request, params);
        TypeReference<ValidateUrlResponseSyntaxOnly> typeRef = new TypeReference<ValidateUrlResponseSyntaxOnly>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse domainUrlSyntaxOnlyForHttpResponse(ValidateUrlRequestSyntaxOnly request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainUrlSyntaxOnly");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/syntax-only");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse domainUrlSyntaxOnlyForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainUrlSyntaxOnly");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/syntax-only");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse domainUrlSyntaxOnlyForHttpResponse(ValidateUrlRequestSyntaxOnly request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling domainUrlSyntaxOnly");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/domain/url/syntax-only");

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
