package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.CreateSettingRequest;
import com.cloudmersive.client.gac.model.CreateSettingResponse;
import com.cloudmersive.client.gac.model.ListSettingsRequest;
import com.cloudmersive.client.gac.model.ListSettingsResponse;
import com.cloudmersive.client.gac.model.UpdateSettingRequest;
import com.cloudmersive.client.gac.model.UpdateSettingResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:18.250-07:00[America/Los_Angeles]")
public class SettingsApi {
    private ApiClient apiClient;

    public SettingsApi() {
        this(new ApiClient());
    }

    public SettingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Create a setting in the specified bucket
    * <p><b>200</b> - OK
    * @param request Request to perform the operation on
    * @return CreateSettingResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CreateSettingResponse settingsCreateSetting(CreateSettingRequest request) throws IOException {
        HttpResponse response = settingsCreateSettingForHttpResponse(request);
        TypeReference<CreateSettingResponse> typeRef = new TypeReference<CreateSettingResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Create a setting in the specified bucket
    * <p><b>200</b> - OK
    * @param request Request to perform the operation on
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CreateSettingResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CreateSettingResponse settingsCreateSetting(CreateSettingRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = settingsCreateSettingForHttpResponse(request, params);
        TypeReference<CreateSettingResponse> typeRef = new TypeReference<CreateSettingResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse settingsCreateSettingForHttpResponse(CreateSettingRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling settingsCreateSetting");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/config/settings/create");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse settingsCreateSettingForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling settingsCreateSetting");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/config/settings/create");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse settingsCreateSettingForHttpResponse(CreateSettingRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling settingsCreateSetting");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/config/settings/create");

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
    * Enumerate the settings in a bucket
    * <p><b>200</b> - OK
    * @param request Request to perform the operation on
    * @return ListSettingsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ListSettingsResponse settingsListSettings(ListSettingsRequest request) throws IOException {
        HttpResponse response = settingsListSettingsForHttpResponse(request);
        TypeReference<ListSettingsResponse> typeRef = new TypeReference<ListSettingsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Enumerate the settings in a bucket
    * <p><b>200</b> - OK
    * @param request Request to perform the operation on
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ListSettingsResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ListSettingsResponse settingsListSettings(ListSettingsRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = settingsListSettingsForHttpResponse(request, params);
        TypeReference<ListSettingsResponse> typeRef = new TypeReference<ListSettingsResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse settingsListSettingsForHttpResponse(ListSettingsRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling settingsListSettings");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/config/settings/list");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse settingsListSettingsForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling settingsListSettings");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/config/settings/list");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse settingsListSettingsForHttpResponse(ListSettingsRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling settingsListSettings");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/config/settings/list");

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
    * Update a setting
    * <p><b>200</b> - OK
    * @param request Request to perform the operation on
    * @return UpdateSettingResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UpdateSettingResponse settingsUpdateSetting(UpdateSettingRequest request) throws IOException {
        HttpResponse response = settingsUpdateSettingForHttpResponse(request);
        TypeReference<UpdateSettingResponse> typeRef = new TypeReference<UpdateSettingResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Update a setting
    * <p><b>200</b> - OK
    * @param request Request to perform the operation on
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return UpdateSettingResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public UpdateSettingResponse settingsUpdateSetting(UpdateSettingRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = settingsUpdateSettingForHttpResponse(request, params);
        TypeReference<UpdateSettingResponse> typeRef = new TypeReference<UpdateSettingResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse settingsUpdateSettingForHttpResponse(UpdateSettingRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling settingsUpdateSetting");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/config/settings/update");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse settingsUpdateSettingForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling settingsUpdateSetting");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/config/settings/update");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse settingsUpdateSettingForHttpResponse(UpdateSettingRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling settingsUpdateSetting");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/config/settings/update");

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
