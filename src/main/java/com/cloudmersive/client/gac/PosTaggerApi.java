package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.PosRequest;
import com.cloudmersive.client.gac.model.PosResponse;

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
public class PosTaggerApi {
    private ApiClient apiClient;

    public PosTaggerApi() {
        this(new ApiClient());
    }

    public PosTaggerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Part-of-speech tag a string, filter to adjectives
    * Part-of-speech (POS) tag a string, find the adjectives, and return result as JSON
    * <p><b>200</b> - OK
    * @param request Input string
    * @return PosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PosResponse posTaggerTagAdjectives(PosRequest request) throws IOException {
        HttpResponse response = posTaggerTagAdjectivesForHttpResponse(request);
        TypeReference<PosResponse> typeRef = new TypeReference<PosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Part-of-speech tag a string, filter to adjectives
    * Part-of-speech (POS) tag a string, find the adjectives, and return result as JSON
    * <p><b>200</b> - OK
    * @param request Input string
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PosResponse posTaggerTagAdjectives(PosRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = posTaggerTagAdjectivesForHttpResponse(request, params);
        TypeReference<PosResponse> typeRef = new TypeReference<PosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse posTaggerTagAdjectivesForHttpResponse(PosRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagAdjectives");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/adjectives");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse posTaggerTagAdjectivesForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagAdjectives");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/adjectives");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse posTaggerTagAdjectivesForHttpResponse(PosRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagAdjectives");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/adjectives");

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
    * Part-of-speech tag a string, filter to adverbs
    * Part-of-speech (POS) tag a string, find the adverbs, and return result as JSON
    * <p><b>200</b> - OK
    * @param request Input string
    * @return PosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PosResponse posTaggerTagAdverbs(PosRequest request) throws IOException {
        HttpResponse response = posTaggerTagAdverbsForHttpResponse(request);
        TypeReference<PosResponse> typeRef = new TypeReference<PosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Part-of-speech tag a string, filter to adverbs
    * Part-of-speech (POS) tag a string, find the adverbs, and return result as JSON
    * <p><b>200</b> - OK
    * @param request Input string
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PosResponse posTaggerTagAdverbs(PosRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = posTaggerTagAdverbsForHttpResponse(request, params);
        TypeReference<PosResponse> typeRef = new TypeReference<PosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse posTaggerTagAdverbsForHttpResponse(PosRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagAdverbs");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/adverbs");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse posTaggerTagAdverbsForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagAdverbs");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/adverbs");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse posTaggerTagAdverbsForHttpResponse(PosRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagAdverbs");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/adverbs");

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
    * Part-of-speech tag a string, filter to nouns
    * Part-of-speech (POS) tag a string, find the nouns, and return result as JSON
    * <p><b>200</b> - OK
    * @param request Input string
    * @return PosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PosResponse posTaggerTagNouns(PosRequest request) throws IOException {
        HttpResponse response = posTaggerTagNounsForHttpResponse(request);
        TypeReference<PosResponse> typeRef = new TypeReference<PosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Part-of-speech tag a string, filter to nouns
    * Part-of-speech (POS) tag a string, find the nouns, and return result as JSON
    * <p><b>200</b> - OK
    * @param request Input string
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PosResponse posTaggerTagNouns(PosRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = posTaggerTagNounsForHttpResponse(request, params);
        TypeReference<PosResponse> typeRef = new TypeReference<PosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse posTaggerTagNounsForHttpResponse(PosRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagNouns");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/nouns");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse posTaggerTagNounsForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagNouns");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/nouns");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse posTaggerTagNounsForHttpResponse(PosRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagNouns");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/nouns");

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
    * Part-of-speech tag a string, filter to pronouns
    * Part-of-speech (POS) tag a string, find the pronouns, and return result as JSON
    * <p><b>200</b> - OK
    * @param request Input string
    * @return PosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PosResponse posTaggerTagPronouns(PosRequest request) throws IOException {
        HttpResponse response = posTaggerTagPronounsForHttpResponse(request);
        TypeReference<PosResponse> typeRef = new TypeReference<PosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Part-of-speech tag a string, filter to pronouns
    * Part-of-speech (POS) tag a string, find the pronouns, and return result as JSON
    * <p><b>200</b> - OK
    * @param request Input string
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PosResponse posTaggerTagPronouns(PosRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = posTaggerTagPronounsForHttpResponse(request, params);
        TypeReference<PosResponse> typeRef = new TypeReference<PosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse posTaggerTagPronounsForHttpResponse(PosRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagPronouns");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/pronouns");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse posTaggerTagPronounsForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagPronouns");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/pronouns");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse posTaggerTagPronounsForHttpResponse(PosRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagPronouns");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/pronouns");

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
    * Part-of-speech tag a string
    * Part-of-speech (POS) tag a string and return result as JSON
    * <p><b>200</b> - OK
    * @param request Input string
    * @return PosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PosResponse posTaggerTagSentence(PosRequest request) throws IOException {
        HttpResponse response = posTaggerTagSentenceForHttpResponse(request);
        TypeReference<PosResponse> typeRef = new TypeReference<PosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Part-of-speech tag a string
    * Part-of-speech (POS) tag a string and return result as JSON
    * <p><b>200</b> - OK
    * @param request Input string
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PosResponse posTaggerTagSentence(PosRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = posTaggerTagSentenceForHttpResponse(request, params);
        TypeReference<PosResponse> typeRef = new TypeReference<PosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse posTaggerTagSentenceForHttpResponse(PosRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagSentence");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/sentence");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse posTaggerTagSentenceForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagSentence");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/sentence");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse posTaggerTagSentenceForHttpResponse(PosRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagSentence");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/sentence");

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
    * Part-of-speech tag a string, filter to verbs
    * Part-of-speech (POS) tag a string, find the verbs, and return result as JSON
    * <p><b>200</b> - OK
    * @param request Input string
    * @return PosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PosResponse posTaggerTagVerbs(PosRequest request) throws IOException {
        HttpResponse response = posTaggerTagVerbsForHttpResponse(request);
        TypeReference<PosResponse> typeRef = new TypeReference<PosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Part-of-speech tag a string, filter to verbs
    * Part-of-speech (POS) tag a string, find the verbs, and return result as JSON
    * <p><b>200</b> - OK
    * @param request Input string
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PosResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PosResponse posTaggerTagVerbs(PosRequest request, Map<String, Object> params) throws IOException {
        HttpResponse response = posTaggerTagVerbsForHttpResponse(request, params);
        TypeReference<PosResponse> typeRef = new TypeReference<PosResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse posTaggerTagVerbsForHttpResponse(PosRequest request) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagVerbs");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/verbs");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(request);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse posTaggerTagVerbsForHttpResponse(java.io.InputStream request, String mediaType) throws IOException {
          // verify the required parameter 'request' is set
              if (request == null) {
              throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagVerbs");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/verbs");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = request == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, request);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse posTaggerTagVerbsForHttpResponse(PosRequest request, Map<String, Object> params) throws IOException {
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new IllegalArgumentException("Missing the required parameter 'request' when calling posTaggerTagVerbs");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/pos/tag/verbs");

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
