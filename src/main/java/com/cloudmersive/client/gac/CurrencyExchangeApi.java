package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.AvailableCurrencyResponse;
import com.cloudmersive.client.gac.model.ConvertedCurrencyResult;
import com.cloudmersive.client.gac.model.ExchangeRateResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:31.721-07:00[America/Los_Angeles]")
public class CurrencyExchangeApi {
    private ApiClient apiClient;

    public CurrencyExchangeApi() {
        this(new ApiClient());
    }

    public CurrencyExchangeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Converts a price from the source currency into the destination currency
    * Automatically converts the price in the source currency into the destination currency using the latest available currency exchange rate data.
    * <p><b>200</b> - OK
    * @param source Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
    * @param destination Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
    * @param sourcePrice Input price, such as 19.99 in source currency
    * @return ConvertedCurrencyResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ConvertedCurrencyResult currencyExchangeConvertCurrency(String source, String destination, Double sourcePrice) throws IOException {
        HttpResponse response = currencyExchangeConvertCurrencyForHttpResponse(source, destination, sourcePrice);
        TypeReference<ConvertedCurrencyResult> typeRef = new TypeReference<ConvertedCurrencyResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Converts a price from the source currency into the destination currency
    * Automatically converts the price in the source currency into the destination currency using the latest available currency exchange rate data.
    * <p><b>200</b> - OK
    * @param source Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
    * @param destination Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
    * @param sourcePrice Input price, such as 19.99 in source currency
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ConvertedCurrencyResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ConvertedCurrencyResult currencyExchangeConvertCurrency(String source, String destination, Double sourcePrice, Map<String, Object> params) throws IOException {
        HttpResponse response = currencyExchangeConvertCurrencyForHttpResponse(source, destination, sourcePrice, params);
        TypeReference<ConvertedCurrencyResult> typeRef = new TypeReference<ConvertedCurrencyResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse currencyExchangeConvertCurrencyForHttpResponse(String source, String destination, Double sourcePrice) throws IOException {
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new IllegalArgumentException("Missing the required parameter 'source' when calling currencyExchangeConvertCurrency");
        }// verify the required parameter 'destination' is set
        if (destination == null) {
            throw new IllegalArgumentException("Missing the required parameter 'destination' when calling currencyExchangeConvertCurrency");
        }// verify the required parameter 'sourcePrice' is set
        if (sourcePrice == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sourcePrice' when calling currencyExchangeConvertCurrency");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("source", source);
        uriVariables.put("destination", destination);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/currency/exchange-rates/convert/{source}/to/{destination}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(sourcePrice);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse currencyExchangeConvertCurrencyForHttpResponse(String source, String destination, java.io.InputStream sourcePrice, String mediaType) throws IOException {
          // verify the required parameter 'source' is set
              if (source == null) {
              throw new IllegalArgumentException("Missing the required parameter 'source' when calling currencyExchangeConvertCurrency");
              }// verify the required parameter 'destination' is set
              if (destination == null) {
              throw new IllegalArgumentException("Missing the required parameter 'destination' when calling currencyExchangeConvertCurrency");
              }// verify the required parameter 'sourcePrice' is set
              if (sourcePrice == null) {
              throw new IllegalArgumentException("Missing the required parameter 'sourcePrice' when calling currencyExchangeConvertCurrency");
              }
                  // create a map of path variables
                  final Map<String, Object> uriVariables = new HashMap<String, Object>();
                      uriVariables.put("source", source);
                      uriVariables.put("destination", destination);
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/currency/exchange-rates/convert/{source}/to/{destination}");

              String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = sourcePrice == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, sourcePrice);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse currencyExchangeConvertCurrencyForHttpResponse(String source, String destination, Double sourcePrice, Map<String, Object> params) throws IOException {
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new IllegalArgumentException("Missing the required parameter 'source' when calling currencyExchangeConvertCurrency");
        }// verify the required parameter 'destination' is set
        if (destination == null) {
            throw new IllegalArgumentException("Missing the required parameter 'destination' when calling currencyExchangeConvertCurrency");
        }// verify the required parameter 'sourcePrice' is set
        if (sourcePrice == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sourcePrice' when calling currencyExchangeConvertCurrency");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("source", source);
        uriVariables.put("destination", destination);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/currency/exchange-rates/convert/{source}/to/{destination}");

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

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(sourcePrice);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Get a list of available currencies and corresponding countries
    * Enumerates available currencies and the countries that correspond to these currencies.
    * <p><b>200</b> - OK
    * @return AvailableCurrencyResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AvailableCurrencyResponse currencyExchangeGetAvailableCurrencies() throws IOException {
        HttpResponse response = currencyExchangeGetAvailableCurrenciesForHttpResponse();
        TypeReference<AvailableCurrencyResponse> typeRef = new TypeReference<AvailableCurrencyResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get a list of available currencies and corresponding countries
    * Enumerates available currencies and the countries that correspond to these currencies.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return AvailableCurrencyResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public AvailableCurrencyResponse currencyExchangeGetAvailableCurrencies(Map<String, Object> params) throws IOException {
        HttpResponse response = currencyExchangeGetAvailableCurrenciesForHttpResponse(params);
        TypeReference<AvailableCurrencyResponse> typeRef = new TypeReference<AvailableCurrencyResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse currencyExchangeGetAvailableCurrenciesForHttpResponse() throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/currency/exchange-rates/list-available");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse currencyExchangeGetAvailableCurrenciesForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/currency/exchange-rates/list-available");

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
    * Gets the exchange rate from the source currency into the destination currency
    * Automatically gets the exchange rate from the source currency into the destination currency using the latest available currency exchange rate data.
    * <p><b>200</b> - OK
    * @param source Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
    * @param destination Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
    * @return ExchangeRateResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExchangeRateResult currencyExchangeGetExchangeRate(String source, String destination) throws IOException {
        HttpResponse response = currencyExchangeGetExchangeRateForHttpResponse(source, destination);
        TypeReference<ExchangeRateResult> typeRef = new TypeReference<ExchangeRateResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Gets the exchange rate from the source currency into the destination currency
    * Automatically gets the exchange rate from the source currency into the destination currency using the latest available currency exchange rate data.
    * <p><b>200</b> - OK
    * @param source Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
    * @param destination Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ExchangeRateResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ExchangeRateResult currencyExchangeGetExchangeRate(String source, String destination, Map<String, Object> params) throws IOException {
        HttpResponse response = currencyExchangeGetExchangeRateForHttpResponse(source, destination, params);
        TypeReference<ExchangeRateResult> typeRef = new TypeReference<ExchangeRateResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse currencyExchangeGetExchangeRateForHttpResponse(String source, String destination) throws IOException {
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new IllegalArgumentException("Missing the required parameter 'source' when calling currencyExchangeGetExchangeRate");
        }// verify the required parameter 'destination' is set
        if (destination == null) {
            throw new IllegalArgumentException("Missing the required parameter 'destination' when calling currencyExchangeGetExchangeRate");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("source", source);
        uriVariables.put("destination", destination);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/currency/exchange-rates/get/{source}/to/{destination}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse currencyExchangeGetExchangeRateForHttpResponse(String source, String destination, Map<String, Object> params) throws IOException {
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new IllegalArgumentException("Missing the required parameter 'source' when calling currencyExchangeGetExchangeRate");
        }// verify the required parameter 'destination' is set
        if (destination == null) {
            throw new IllegalArgumentException("Missing the required parameter 'destination' when calling currencyExchangeGetExchangeRate");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("source", source);
        uriVariables.put("destination", destination);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/currency/exchange-rates/get/{source}/to/{destination}");

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

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


}
