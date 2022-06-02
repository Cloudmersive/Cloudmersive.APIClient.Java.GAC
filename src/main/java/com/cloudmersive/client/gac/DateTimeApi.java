package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.DateTimeNaturalLanguageParseRequest;
import com.cloudmersive.client.gac.model.DateTimeNowResult;
import com.cloudmersive.client.gac.model.DateTimeStandardizedParseRequest;
import com.cloudmersive.client.gac.model.DateTimeStandardizedParseResponse;
import com.cloudmersive.client.gac.model.GetPublicHolidaysRequest;
import com.cloudmersive.client.gac.model.PublicHolidaysResponse;

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
public class DateTimeApi {
    private ApiClient apiClient;

    public DateTimeApi() {
        this(new ApiClient());
    }

    public DateTimeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Get current date and time as of now
    * Gets the current date and time.  Response time is syncronized with atomic clocks, and represents a monotonic, centrally available, consistent clock.
    * <p><b>200</b> - OK
    * @return DateTimeNowResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DateTimeNowResult dateTimeGetNowSimple() throws IOException {
        HttpResponse response = dateTimeGetNowSimpleForHttpResponse();
        TypeReference<DateTimeNowResult> typeRef = new TypeReference<DateTimeNowResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get current date and time as of now
    * Gets the current date and time.  Response time is syncronized with atomic clocks, and represents a monotonic, centrally available, consistent clock.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DateTimeNowResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DateTimeNowResult dateTimeGetNowSimple(Map<String, Object> params) throws IOException {
        HttpResponse response = dateTimeGetNowSimpleForHttpResponse(params);
        TypeReference<DateTimeNowResult> typeRef = new TypeReference<DateTimeNowResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dateTimeGetNowSimpleForHttpResponse() throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/date-time/get/now");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }

    public HttpResponse dateTimeGetNowSimpleForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/date-time/get/now");

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

        HttpContent content = null;
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.GET, genericUrl, content).execute();
    }


  /**
    * Get public holidays in the specified country and year
    * Enumerates all public holidays in a given country for a given year.  Supports over 100 countries.
    * <p><b>200</b> - OK
    * @param input Input request
    * @return PublicHolidaysResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PublicHolidaysResponse dateTimeGetPublicHolidays(GetPublicHolidaysRequest input) throws IOException {
        HttpResponse response = dateTimeGetPublicHolidaysForHttpResponse(input);
        TypeReference<PublicHolidaysResponse> typeRef = new TypeReference<PublicHolidaysResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get public holidays in the specified country and year
    * Enumerates all public holidays in a given country for a given year.  Supports over 100 countries.
    * <p><b>200</b> - OK
    * @param input Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PublicHolidaysResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PublicHolidaysResponse dateTimeGetPublicHolidays(GetPublicHolidaysRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = dateTimeGetPublicHolidaysForHttpResponse(input, params);
        TypeReference<PublicHolidaysResponse> typeRef = new TypeReference<PublicHolidaysResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dateTimeGetPublicHolidaysForHttpResponse(GetPublicHolidaysRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling dateTimeGetPublicHolidays");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/date-time/get/holidays");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse dateTimeGetPublicHolidaysForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling dateTimeGetPublicHolidays");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/date-time/get/holidays");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse dateTimeGetPublicHolidaysForHttpResponse(GetPublicHolidaysRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling dateTimeGetPublicHolidays");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/date-time/get/holidays");

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
    * Parses a free-form natural language date and time string into a date and time
    * Parses an unstructured, free-form, natural language date and time string into a date time object.  This is intended for lightweight human-entered input, such as \&quot;tomorrow at 3pm\&quot; or \&quot;tuesday\&quot;.
    * <p><b>200</b> - OK
    * @param input Input request
    * @return DateTimeStandardizedParseResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DateTimeStandardizedParseResponse dateTimeParseNaturalLanguageDateTime(DateTimeNaturalLanguageParseRequest input) throws IOException {
        HttpResponse response = dateTimeParseNaturalLanguageDateTimeForHttpResponse(input);
        TypeReference<DateTimeStandardizedParseResponse> typeRef = new TypeReference<DateTimeStandardizedParseResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Parses a free-form natural language date and time string into a date and time
    * Parses an unstructured, free-form, natural language date and time string into a date time object.  This is intended for lightweight human-entered input, such as \&quot;tomorrow at 3pm\&quot; or \&quot;tuesday\&quot;.
    * <p><b>200</b> - OK
    * @param input Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DateTimeStandardizedParseResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DateTimeStandardizedParseResponse dateTimeParseNaturalLanguageDateTime(DateTimeNaturalLanguageParseRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = dateTimeParseNaturalLanguageDateTimeForHttpResponse(input, params);
        TypeReference<DateTimeStandardizedParseResponse> typeRef = new TypeReference<DateTimeStandardizedParseResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dateTimeParseNaturalLanguageDateTimeForHttpResponse(DateTimeNaturalLanguageParseRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling dateTimeParseNaturalLanguageDateTime");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/date-time/parse/date-time/natural-language");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse dateTimeParseNaturalLanguageDateTimeForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling dateTimeParseNaturalLanguageDateTime");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/date-time/parse/date-time/natural-language");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse dateTimeParseNaturalLanguageDateTimeForHttpResponse(DateTimeNaturalLanguageParseRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling dateTimeParseNaturalLanguageDateTime");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/date-time/parse/date-time/natural-language");

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
    * Parses a standardized date and time string into a date and time
    * Parses a structured date and time string into a date time object.  This is intended for standardized date strings that adhere to formatting conventions, rather than natural language input.
    * <p><b>200</b> - OK
    * @param input Input request
    * @return DateTimeStandardizedParseResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DateTimeStandardizedParseResponse dateTimeParseStandardDateTime(DateTimeStandardizedParseRequest input) throws IOException {
        HttpResponse response = dateTimeParseStandardDateTimeForHttpResponse(input);
        TypeReference<DateTimeStandardizedParseResponse> typeRef = new TypeReference<DateTimeStandardizedParseResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Parses a standardized date and time string into a date and time
    * Parses a structured date and time string into a date time object.  This is intended for standardized date strings that adhere to formatting conventions, rather than natural language input.
    * <p><b>200</b> - OK
    * @param input Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return DateTimeStandardizedParseResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public DateTimeStandardizedParseResponse dateTimeParseStandardDateTime(DateTimeStandardizedParseRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = dateTimeParseStandardDateTimeForHttpResponse(input, params);
        TypeReference<DateTimeStandardizedParseResponse> typeRef = new TypeReference<DateTimeStandardizedParseResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dateTimeParseStandardDateTimeForHttpResponse(DateTimeStandardizedParseRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling dateTimeParseStandardDateTime");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/date-time/parse/date-time/structured");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse dateTimeParseStandardDateTimeForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling dateTimeParseStandardDateTime");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/date-time/parse/date-time/structured");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse dateTimeParseStandardDateTimeForHttpResponse(DateTimeStandardizedParseRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling dateTimeParseStandardDateTime");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/date-time/parse/date-time/structured");

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
