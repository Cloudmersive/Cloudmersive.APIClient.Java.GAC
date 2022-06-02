package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.LanguageTranslationRequest;
import com.cloudmersive.client.gac.model.LanguageTranslationResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:42.991-07:00[America/Los_Angeles]")
public class LanguageTranslationApi {
    private ApiClient apiClient;

    public LanguageTranslationApi() {
        this(new ApiClient());
    }

    public LanguageTranslationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Translate German to English text with Deep Learning AI
    * Automatically translates input text in German to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
    * <p><b>200</b> - OK
    * @param input Input translation request
    * @return LanguageTranslationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LanguageTranslationResponse languageTranslationTranslateDeuToEng(LanguageTranslationRequest input) throws IOException {
        HttpResponse response = languageTranslationTranslateDeuToEngForHttpResponse(input);
        TypeReference<LanguageTranslationResponse> typeRef = new TypeReference<LanguageTranslationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Translate German to English text with Deep Learning AI
    * Automatically translates input text in German to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
    * <p><b>200</b> - OK
    * @param input Input translation request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return LanguageTranslationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LanguageTranslationResponse languageTranslationTranslateDeuToEng(LanguageTranslationRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = languageTranslationTranslateDeuToEngForHttpResponse(input, params);
        TypeReference<LanguageTranslationResponse> typeRef = new TypeReference<LanguageTranslationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse languageTranslationTranslateDeuToEngForHttpResponse(LanguageTranslationRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateDeuToEng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/deu/to/eng");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse languageTranslationTranslateDeuToEngForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateDeuToEng");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/deu/to/eng");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse languageTranslationTranslateDeuToEngForHttpResponse(LanguageTranslationRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateDeuToEng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/deu/to/eng");

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
    * Translate English to German text with Deep Learning AI
    * Automatically translates input text in English to output text in German using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
    * <p><b>200</b> - OK
    * @param input Input translation request
    * @return LanguageTranslationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LanguageTranslationResponse languageTranslationTranslateEngToDeu(LanguageTranslationRequest input) throws IOException {
        HttpResponse response = languageTranslationTranslateEngToDeuForHttpResponse(input);
        TypeReference<LanguageTranslationResponse> typeRef = new TypeReference<LanguageTranslationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Translate English to German text with Deep Learning AI
    * Automatically translates input text in English to output text in German using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
    * <p><b>200</b> - OK
    * @param input Input translation request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return LanguageTranslationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LanguageTranslationResponse languageTranslationTranslateEngToDeu(LanguageTranslationRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = languageTranslationTranslateEngToDeuForHttpResponse(input, params);
        TypeReference<LanguageTranslationResponse> typeRef = new TypeReference<LanguageTranslationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse languageTranslationTranslateEngToDeuForHttpResponse(LanguageTranslationRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateEngToDeu");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/eng/to/deu");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse languageTranslationTranslateEngToDeuForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateEngToDeu");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/eng/to/deu");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse languageTranslationTranslateEngToDeuForHttpResponse(LanguageTranslationRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateEngToDeu");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/eng/to/deu");

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
    * Translate English to French text with Deep Learning AI
    * Automatically translates input text in English to output text in French using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
    * <p><b>200</b> - OK
    * @param input Input translation request
    * @return LanguageTranslationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LanguageTranslationResponse languageTranslationTranslateEngToFra(LanguageTranslationRequest input) throws IOException {
        HttpResponse response = languageTranslationTranslateEngToFraForHttpResponse(input);
        TypeReference<LanguageTranslationResponse> typeRef = new TypeReference<LanguageTranslationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Translate English to French text with Deep Learning AI
    * Automatically translates input text in English to output text in French using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
    * <p><b>200</b> - OK
    * @param input Input translation request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return LanguageTranslationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LanguageTranslationResponse languageTranslationTranslateEngToFra(LanguageTranslationRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = languageTranslationTranslateEngToFraForHttpResponse(input, params);
        TypeReference<LanguageTranslationResponse> typeRef = new TypeReference<LanguageTranslationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse languageTranslationTranslateEngToFraForHttpResponse(LanguageTranslationRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateEngToFra");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/eng/to/fra");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse languageTranslationTranslateEngToFraForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateEngToFra");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/eng/to/fra");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse languageTranslationTranslateEngToFraForHttpResponse(LanguageTranslationRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateEngToFra");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/eng/to/fra");

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
    * Translate English to Russian text with Deep Learning AI
    * Automatically translates input text in English to output text in Russian using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
    * <p><b>200</b> - OK
    * @param input Input translation request
    * @return LanguageTranslationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LanguageTranslationResponse languageTranslationTranslateEngToRus(LanguageTranslationRequest input) throws IOException {
        HttpResponse response = languageTranslationTranslateEngToRusForHttpResponse(input);
        TypeReference<LanguageTranslationResponse> typeRef = new TypeReference<LanguageTranslationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Translate English to Russian text with Deep Learning AI
    * Automatically translates input text in English to output text in Russian using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
    * <p><b>200</b> - OK
    * @param input Input translation request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return LanguageTranslationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LanguageTranslationResponse languageTranslationTranslateEngToRus(LanguageTranslationRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = languageTranslationTranslateEngToRusForHttpResponse(input, params);
        TypeReference<LanguageTranslationResponse> typeRef = new TypeReference<LanguageTranslationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse languageTranslationTranslateEngToRusForHttpResponse(LanguageTranslationRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateEngToRus");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/eng/to/rus");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse languageTranslationTranslateEngToRusForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateEngToRus");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/eng/to/rus");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse languageTranslationTranslateEngToRusForHttpResponse(LanguageTranslationRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateEngToRus");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/eng/to/rus");

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
    * Translate French to English text with Deep Learning AI
    * Automatically translates input text in French to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
    * <p><b>200</b> - OK
    * @param input Input translation request
    * @return LanguageTranslationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LanguageTranslationResponse languageTranslationTranslateFraToEng(LanguageTranslationRequest input) throws IOException {
        HttpResponse response = languageTranslationTranslateFraToEngForHttpResponse(input);
        TypeReference<LanguageTranslationResponse> typeRef = new TypeReference<LanguageTranslationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Translate French to English text with Deep Learning AI
    * Automatically translates input text in French to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
    * <p><b>200</b> - OK
    * @param input Input translation request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return LanguageTranslationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LanguageTranslationResponse languageTranslationTranslateFraToEng(LanguageTranslationRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = languageTranslationTranslateFraToEngForHttpResponse(input, params);
        TypeReference<LanguageTranslationResponse> typeRef = new TypeReference<LanguageTranslationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse languageTranslationTranslateFraToEngForHttpResponse(LanguageTranslationRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateFraToEng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/fra/to/eng");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse languageTranslationTranslateFraToEngForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateFraToEng");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/fra/to/eng");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse languageTranslationTranslateFraToEngForHttpResponse(LanguageTranslationRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateFraToEng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/fra/to/eng");

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
    * Translate Russian to English text with Deep Learning AI
    * Automatically translates input text in Russian to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
    * <p><b>200</b> - OK
    * @param input Input translation request
    * @return LanguageTranslationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LanguageTranslationResponse languageTranslationTranslateRusToEng(LanguageTranslationRequest input) throws IOException {
        HttpResponse response = languageTranslationTranslateRusToEngForHttpResponse(input);
        TypeReference<LanguageTranslationResponse> typeRef = new TypeReference<LanguageTranslationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Translate Russian to English text with Deep Learning AI
    * Automatically translates input text in Russian to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
    * <p><b>200</b> - OK
    * @param input Input translation request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return LanguageTranslationResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public LanguageTranslationResponse languageTranslationTranslateRusToEng(LanguageTranslationRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = languageTranslationTranslateRusToEngForHttpResponse(input, params);
        TypeReference<LanguageTranslationResponse> typeRef = new TypeReference<LanguageTranslationResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse languageTranslationTranslateRusToEngForHttpResponse(LanguageTranslationRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateRusToEng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/rus/to/eng");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse languageTranslationTranslateRusToEngForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateRusToEng");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/rus/to/eng");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse languageTranslationTranslateRusToEngForHttpResponse(LanguageTranslationRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling languageTranslationTranslateRusToEng");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/translate/language/rus/to/eng");

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
