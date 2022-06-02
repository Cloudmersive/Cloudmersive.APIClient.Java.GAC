package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.CountryListResult;
import com.cloudmersive.client.gac.model.GetTimezonesRequest;
import com.cloudmersive.client.gac.model.GetTimezonesResponse;
import com.cloudmersive.client.gac.model.NormalizeAddressResponse;
import com.cloudmersive.client.gac.model.ParseAddressRequest;
import com.cloudmersive.client.gac.model.ParseAddressResponse;
import com.cloudmersive.client.gac.model.ReverseGeocodeAddressRequest;
import com.cloudmersive.client.gac.model.ReverseGeocodeAddressResponse;
import com.cloudmersive.client.gac.model.ValidateAddressRequest;
import com.cloudmersive.client.gac.model.ValidateAddressResponse;
import com.cloudmersive.client.gac.model.ValidateCityRequest;
import com.cloudmersive.client.gac.model.ValidateCityResponse;
import com.cloudmersive.client.gac.model.ValidateCountryRequest;
import com.cloudmersive.client.gac.model.ValidateCountryResponse;
import com.cloudmersive.client.gac.model.ValidatePostalCodeRequest;
import com.cloudmersive.client.gac.model.ValidatePostalCodeResponse;
import com.cloudmersive.client.gac.model.ValidateStateRequest;
import com.cloudmersive.client.gac.model.ValidateStateResponse;

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
public class AddressApi {
    private ApiClient apiClient;

    public AddressApi() {
        this(new ApiClient());
    }

    public AddressApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Check if a country is a member of the European Union (EU)
    * Checks if the input country is a member of the European Union or not.
    * <p><b>200</b> - OK
    * @param input Input request
    * @return ValidateCountryResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateCountryResponse addressCheckEUMembership(ValidateCountryRequest input) throws IOException {
        HttpResponse response = addressCheckEUMembershipForHttpResponse(input);
        TypeReference<ValidateCountryResponse> typeRef = new TypeReference<ValidateCountryResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Check if a country is a member of the European Union (EU)
    * Checks if the input country is a member of the European Union or not.
    * <p><b>200</b> - OK
    * @param input Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ValidateCountryResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateCountryResponse addressCheckEUMembership(ValidateCountryRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = addressCheckEUMembershipForHttpResponse(input, params);
        TypeReference<ValidateCountryResponse> typeRef = new TypeReference<ValidateCountryResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse addressCheckEUMembershipForHttpResponse(ValidateCountryRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressCheckEUMembership");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/country/check-eu-membership");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse addressCheckEUMembershipForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressCheckEUMembership");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/country/check-eu-membership");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse addressCheckEUMembershipForHttpResponse(ValidateCountryRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressCheckEUMembership");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/country/check-eu-membership");

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
    * Validate and normalize country information, return ISO 3166-1 country codes and country name
    * Validates and normalizes country information, and returns key information about a country, as well as whether it is a member of the European Union.  Also returns distinct time zones in the country.
    * <p><b>200</b> - OK
    * @param input Input request
    * @return ValidateCountryResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateCountryResponse addressCountry(ValidateCountryRequest input) throws IOException {
        HttpResponse response = addressCountryForHttpResponse(input);
        TypeReference<ValidateCountryResponse> typeRef = new TypeReference<ValidateCountryResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate and normalize country information, return ISO 3166-1 country codes and country name
    * Validates and normalizes country information, and returns key information about a country, as well as whether it is a member of the European Union.  Also returns distinct time zones in the country.
    * <p><b>200</b> - OK
    * @param input Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ValidateCountryResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateCountryResponse addressCountry(ValidateCountryRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = addressCountryForHttpResponse(input, params);
        TypeReference<ValidateCountryResponse> typeRef = new TypeReference<ValidateCountryResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse addressCountryForHttpResponse(ValidateCountryRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressCountry");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/country");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse addressCountryForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressCountry");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/country");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse addressCountryForHttpResponse(ValidateCountryRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressCountry");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/country");

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
    * Get a list of ISO 3166-1 countries
    * Enumerates the list of ISO 3166-1 countries, including name, country codes, and more.
    * <p><b>200</b> - OK
    * @return CountryListResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CountryListResult addressCountryList() throws IOException {
        HttpResponse response = addressCountryListForHttpResponse();
        TypeReference<CountryListResult> typeRef = new TypeReference<CountryListResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get a list of ISO 3166-1 countries
    * Enumerates the list of ISO 3166-1 countries, including name, country codes, and more.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CountryListResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CountryListResult addressCountryList(Map<String, Object> params) throws IOException {
        HttpResponse response = addressCountryListForHttpResponse(params);
        TypeReference<CountryListResult> typeRef = new TypeReference<CountryListResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse addressCountryListForHttpResponse() throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/country/list");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse addressCountryListForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/country/list");

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
    * Geocode a street address into latitude and longitude
    * Geocodes a street address into latitude and longitude.
    * <p><b>200</b> - OK
    * @param input Input parse request
    * @return ValidateAddressResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateAddressResponse addressGeocode(ValidateAddressRequest input) throws IOException {
        HttpResponse response = addressGeocodeForHttpResponse(input);
        TypeReference<ValidateAddressResponse> typeRef = new TypeReference<ValidateAddressResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Geocode a street address into latitude and longitude
    * Geocodes a street address into latitude and longitude.
    * <p><b>200</b> - OK
    * @param input Input parse request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ValidateAddressResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateAddressResponse addressGeocode(ValidateAddressRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = addressGeocodeForHttpResponse(input, params);
        TypeReference<ValidateAddressResponse> typeRef = new TypeReference<ValidateAddressResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse addressGeocodeForHttpResponse(ValidateAddressRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressGeocode");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/geocode");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse addressGeocodeForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressGeocode");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/geocode");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse addressGeocodeForHttpResponse(ValidateAddressRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressGeocode");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/geocode");

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
    * Get the currency of the input country
    * Gets the currency information for the input country, including the ISO three-letter country code, currency symbol, and English currency name.
    * <p><b>200</b> - OK
    * @param input Input request
    * @return ValidateCountryResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateCountryResponse addressGetCountryCurrency(ValidateCountryRequest input) throws IOException {
        HttpResponse response = addressGetCountryCurrencyForHttpResponse(input);
        TypeReference<ValidateCountryResponse> typeRef = new TypeReference<ValidateCountryResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get the currency of the input country
    * Gets the currency information for the input country, including the ISO three-letter country code, currency symbol, and English currency name.
    * <p><b>200</b> - OK
    * @param input Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ValidateCountryResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateCountryResponse addressGetCountryCurrency(ValidateCountryRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = addressGetCountryCurrencyForHttpResponse(input, params);
        TypeReference<ValidateCountryResponse> typeRef = new TypeReference<ValidateCountryResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse addressGetCountryCurrencyForHttpResponse(ValidateCountryRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressGetCountryCurrency");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/country/get-currency");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse addressGetCountryCurrencyForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressGetCountryCurrency");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/country/get-currency");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse addressGetCountryCurrencyForHttpResponse(ValidateCountryRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressGetCountryCurrency");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/country/get-currency");

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
    * Get the region, subregion and continent of the country
    * Gets the continent information including region and subregion for the input country.
    * <p><b>200</b> - OK
    * @param input Input request
    * @return ValidateCountryResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateCountryResponse addressGetCountryRegion(ValidateCountryRequest input) throws IOException {
        HttpResponse response = addressGetCountryRegionForHttpResponse(input);
        TypeReference<ValidateCountryResponse> typeRef = new TypeReference<ValidateCountryResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get the region, subregion and continent of the country
    * Gets the continent information including region and subregion for the input country.
    * <p><b>200</b> - OK
    * @param input Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ValidateCountryResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateCountryResponse addressGetCountryRegion(ValidateCountryRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = addressGetCountryRegionForHttpResponse(input, params);
        TypeReference<ValidateCountryResponse> typeRef = new TypeReference<ValidateCountryResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse addressGetCountryRegionForHttpResponse(ValidateCountryRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressGetCountryRegion");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/country/get-region");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse addressGetCountryRegionForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressGetCountryRegion");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/country/get-region");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse addressGetCountryRegionForHttpResponse(ValidateCountryRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressGetCountryRegion");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/country/get-region");

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
    * Gets IANA/Olsen time zones for a country
    * Gets the IANA/Olsen time zones for a country.
    * <p><b>200</b> - OK
    * @param input Input request
    * @return GetTimezonesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetTimezonesResponse addressGetTimezone(GetTimezonesRequest input) throws IOException {
        HttpResponse response = addressGetTimezoneForHttpResponse(input);
        TypeReference<GetTimezonesResponse> typeRef = new TypeReference<GetTimezonesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Gets IANA/Olsen time zones for a country
    * Gets the IANA/Olsen time zones for a country.
    * <p><b>200</b> - OK
    * @param input Input request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return GetTimezonesResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public GetTimezonesResponse addressGetTimezone(GetTimezonesRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = addressGetTimezoneForHttpResponse(input, params);
        TypeReference<GetTimezonesResponse> typeRef = new TypeReference<GetTimezonesResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse addressGetTimezoneForHttpResponse(GetTimezonesRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressGetTimezone");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/country/get-timezones");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse addressGetTimezoneForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressGetTimezone");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/country/get-timezones");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse addressGetTimezoneForHttpResponse(GetTimezonesRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressGetTimezone");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/country/get-timezones");

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
    * Normalize a street address
    * Normalizes an input structured street address is valid or invalid.  If the address is valid, also returns the latitude and longitude of the address.  Supports all major international addresses.
    * <p><b>200</b> - OK
    * @param input Input parse request
    * @return NormalizeAddressResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public NormalizeAddressResponse addressNormalizeAddress(ValidateAddressRequest input) throws IOException {
        HttpResponse response = addressNormalizeAddressForHttpResponse(input);
        TypeReference<NormalizeAddressResponse> typeRef = new TypeReference<NormalizeAddressResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Normalize a street address
    * Normalizes an input structured street address is valid or invalid.  If the address is valid, also returns the latitude and longitude of the address.  Supports all major international addresses.
    * <p><b>200</b> - OK
    * @param input Input parse request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return NormalizeAddressResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public NormalizeAddressResponse addressNormalizeAddress(ValidateAddressRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = addressNormalizeAddressForHttpResponse(input, params);
        TypeReference<NormalizeAddressResponse> typeRef = new TypeReference<NormalizeAddressResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse addressNormalizeAddressForHttpResponse(ValidateAddressRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressNormalizeAddress");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/street-address/normalize");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse addressNormalizeAddressForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressNormalizeAddress");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/street-address/normalize");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse addressNormalizeAddressForHttpResponse(ValidateAddressRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressNormalizeAddress");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/street-address/normalize");

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
    * Parse an unstructured input text string into an international, formatted address
    * Uses machine learning and Natural Language Processing (NLP) to handle a wide array of cases, including non-standard and unstructured address strings across a wide array of countries and address formatting norms.
    * <p><b>200</b> - OK
    * @param input Input parse request
    * @return ParseAddressResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ParseAddressResponse addressParseString(ParseAddressRequest input) throws IOException {
        HttpResponse response = addressParseStringForHttpResponse(input);
        TypeReference<ParseAddressResponse> typeRef = new TypeReference<ParseAddressResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Parse an unstructured input text string into an international, formatted address
    * Uses machine learning and Natural Language Processing (NLP) to handle a wide array of cases, including non-standard and unstructured address strings across a wide array of countries and address formatting norms.
    * <p><b>200</b> - OK
    * @param input Input parse request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ParseAddressResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ParseAddressResponse addressParseString(ParseAddressRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = addressParseStringForHttpResponse(input, params);
        TypeReference<ParseAddressResponse> typeRef = new TypeReference<ParseAddressResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse addressParseStringForHttpResponse(ParseAddressRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressParseString");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/parse");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse addressParseStringForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressParseString");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/parse");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse addressParseStringForHttpResponse(ParseAddressRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressParseString");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/parse");

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
    * Reverse geocode a lattitude and longitude into an address
    * Converts lattitude and longitude coordinates into an address through reverse-geocoding.
    * <p><b>200</b> - OK
    * @param input Input reverse geocoding request
    * @return ReverseGeocodeAddressResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReverseGeocodeAddressResponse addressReverseGeocodeAddress(ReverseGeocodeAddressRequest input) throws IOException {
        HttpResponse response = addressReverseGeocodeAddressForHttpResponse(input);
        TypeReference<ReverseGeocodeAddressResponse> typeRef = new TypeReference<ReverseGeocodeAddressResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Reverse geocode a lattitude and longitude into an address
    * Converts lattitude and longitude coordinates into an address through reverse-geocoding.
    * <p><b>200</b> - OK
    * @param input Input reverse geocoding request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ReverseGeocodeAddressResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReverseGeocodeAddressResponse addressReverseGeocodeAddress(ReverseGeocodeAddressRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = addressReverseGeocodeAddressForHttpResponse(input, params);
        TypeReference<ReverseGeocodeAddressResponse> typeRef = new TypeReference<ReverseGeocodeAddressResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse addressReverseGeocodeAddressForHttpResponse(ReverseGeocodeAddressRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressReverseGeocodeAddress");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/geocode/reverse");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse addressReverseGeocodeAddressForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressReverseGeocodeAddress");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/geocode/reverse");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse addressReverseGeocodeAddressForHttpResponse(ReverseGeocodeAddressRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressReverseGeocodeAddress");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/geocode/reverse");

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
    * Validate a street address
    * Determines if an input structured street address is valid or invalid.  If the address is valid, also returns the latitude and longitude of the address.  Supports all major international addresses.
    * <p><b>200</b> - OK
    * @param input Input parse request
    * @return ValidateAddressResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateAddressResponse addressValidateAddress(ValidateAddressRequest input) throws IOException {
        HttpResponse response = addressValidateAddressForHttpResponse(input);
        TypeReference<ValidateAddressResponse> typeRef = new TypeReference<ValidateAddressResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a street address
    * Determines if an input structured street address is valid or invalid.  If the address is valid, also returns the latitude and longitude of the address.  Supports all major international addresses.
    * <p><b>200</b> - OK
    * @param input Input parse request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ValidateAddressResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateAddressResponse addressValidateAddress(ValidateAddressRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = addressValidateAddressForHttpResponse(input, params);
        TypeReference<ValidateAddressResponse> typeRef = new TypeReference<ValidateAddressResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse addressValidateAddressForHttpResponse(ValidateAddressRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressValidateAddress");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/street-address");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse addressValidateAddressForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressValidateAddress");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/street-address");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse addressValidateAddressForHttpResponse(ValidateAddressRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressValidateAddress");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/street-address");

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
    * Validate a City and State/Province combination, get location information about it
    * Checks if the input city and state name or code is valid, and returns information about it such as normalized City name, State name and more.  Supports all major international addresses.
    * <p><b>200</b> - OK
    * @param input Input parse request
    * @return ValidateCityResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateCityResponse addressValidateCity(ValidateCityRequest input) throws IOException {
        HttpResponse response = addressValidateCityForHttpResponse(input);
        TypeReference<ValidateCityResponse> typeRef = new TypeReference<ValidateCityResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a City and State/Province combination, get location information about it
    * Checks if the input city and state name or code is valid, and returns information about it such as normalized City name, State name and more.  Supports all major international addresses.
    * <p><b>200</b> - OK
    * @param input Input parse request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ValidateCityResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateCityResponse addressValidateCity(ValidateCityRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = addressValidateCityForHttpResponse(input, params);
        TypeReference<ValidateCityResponse> typeRef = new TypeReference<ValidateCityResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse addressValidateCityForHttpResponse(ValidateCityRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressValidateCity");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/city");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse addressValidateCityForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressValidateCity");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/city");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse addressValidateCityForHttpResponse(ValidateCityRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressValidateCity");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/city");

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
    * Validate a postal code, get location information about it
    * Checks if the input postal code is valid, and returns information about it such as City, State and more.  Supports all major countries.
    * <p><b>200</b> - OK
    * @param input Input parse request
    * @return ValidatePostalCodeResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidatePostalCodeResponse addressValidatePostalCode(ValidatePostalCodeRequest input) throws IOException {
        HttpResponse response = addressValidatePostalCodeForHttpResponse(input);
        TypeReference<ValidatePostalCodeResponse> typeRef = new TypeReference<ValidatePostalCodeResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a postal code, get location information about it
    * Checks if the input postal code is valid, and returns information about it such as City, State and more.  Supports all major countries.
    * <p><b>200</b> - OK
    * @param input Input parse request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ValidatePostalCodeResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidatePostalCodeResponse addressValidatePostalCode(ValidatePostalCodeRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = addressValidatePostalCodeForHttpResponse(input, params);
        TypeReference<ValidatePostalCodeResponse> typeRef = new TypeReference<ValidatePostalCodeResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse addressValidatePostalCodeForHttpResponse(ValidatePostalCodeRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressValidatePostalCode");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/postal-code");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse addressValidatePostalCodeForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressValidatePostalCode");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/postal-code");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse addressValidatePostalCodeForHttpResponse(ValidatePostalCodeRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressValidatePostalCode");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/postal-code");

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
    * Validate a state or province, name or abbreviation, get location information about it
    * Checks if the input state name or code is valid, and returns information about it such as normalized State name and more.  Supports all major countries.
    * <p><b>200</b> - OK
    * @param input Input parse request
    * @return ValidateStateResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateStateResponse addressValidateState(ValidateStateRequest input) throws IOException {
        HttpResponse response = addressValidateStateForHttpResponse(input);
        TypeReference<ValidateStateResponse> typeRef = new TypeReference<ValidateStateResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Validate a state or province, name or abbreviation, get location information about it
    * Checks if the input state name or code is valid, and returns information about it such as normalized State name and more.  Supports all major countries.
    * <p><b>200</b> - OK
    * @param input Input parse request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ValidateStateResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ValidateStateResponse addressValidateState(ValidateStateRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = addressValidateStateForHttpResponse(input, params);
        TypeReference<ValidateStateResponse> typeRef = new TypeReference<ValidateStateResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse addressValidateStateForHttpResponse(ValidateStateRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressValidateState");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/state");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse addressValidateStateForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressValidateState");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/state");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse addressValidateStateForHttpResponse(ValidateStateRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling addressValidateState");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/validate/address/state");

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
