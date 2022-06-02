package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.HateSpeechAnalysisRequest;
import com.cloudmersive.client.gac.model.HateSpeechAnalysisResponse;
import com.cloudmersive.client.gac.model.ProfanityAnalysisRequest;
import com.cloudmersive.client.gac.model.ProfanityAnalysisResponse;
import com.cloudmersive.client.gac.model.SentimentAnalysisRequest;
import com.cloudmersive.client.gac.model.SentimentAnalysisResponse;
import com.cloudmersive.client.gac.model.SimilarityAnalysisRequest;
import com.cloudmersive.client.gac.model.SimilarityAnalysisResponse;
import com.cloudmersive.client.gac.model.SubjectivityAnalysisRequest;
import com.cloudmersive.client.gac.model.SubjectivityAnalysisResponse;

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
public class AnalyticsApi {
    private ApiClient apiClient;

    public AnalyticsApi() {
        this(new ApiClient());
    }

    public AnalyticsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Perform Hate Speech Analysis and Detection on Text
    * Analyze input text using advanced Hate Speech Analysis to determine if the input contains hate speech language.  Supports English language input.  Consumes 1-2 API calls per sentence.
    * <p><b>200</b> - OK
    * @param input Input hate speech analysis request
    * @return HateSpeechAnalysisResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public HateSpeechAnalysisResponse analyticsHateSpeech(HateSpeechAnalysisRequest input) throws IOException {
        HttpResponse response = analyticsHateSpeechForHttpResponse(input);
        TypeReference<HateSpeechAnalysisResponse> typeRef = new TypeReference<HateSpeechAnalysisResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Perform Hate Speech Analysis and Detection on Text
    * Analyze input text using advanced Hate Speech Analysis to determine if the input contains hate speech language.  Supports English language input.  Consumes 1-2 API calls per sentence.
    * <p><b>200</b> - OK
    * @param input Input hate speech analysis request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return HateSpeechAnalysisResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public HateSpeechAnalysisResponse analyticsHateSpeech(HateSpeechAnalysisRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = analyticsHateSpeechForHttpResponse(input, params);
        TypeReference<HateSpeechAnalysisResponse> typeRef = new TypeReference<HateSpeechAnalysisResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse analyticsHateSpeechForHttpResponse(HateSpeechAnalysisRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling analyticsHateSpeech");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/analytics/hate-speech");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse analyticsHateSpeechForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling analyticsHateSpeech");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/analytics/hate-speech");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse analyticsHateSpeechForHttpResponse(HateSpeechAnalysisRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling analyticsHateSpeech");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/analytics/hate-speech");

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
    * Perform Profanity and Obscene Language Analysis and Detection on Text
    * Analyze input text using advanced Profanity and Obscene Language Analysis to determine if the input contains profane language.  Supports English language input.  Consumes 1-2 API calls per sentence.
    * <p><b>200</b> - OK
    * @param input Input profanity analysis request
    * @return ProfanityAnalysisResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ProfanityAnalysisResponse analyticsProfanity(ProfanityAnalysisRequest input) throws IOException {
        HttpResponse response = analyticsProfanityForHttpResponse(input);
        TypeReference<ProfanityAnalysisResponse> typeRef = new TypeReference<ProfanityAnalysisResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Perform Profanity and Obscene Language Analysis and Detection on Text
    * Analyze input text using advanced Profanity and Obscene Language Analysis to determine if the input contains profane language.  Supports English language input.  Consumes 1-2 API calls per sentence.
    * <p><b>200</b> - OK
    * @param input Input profanity analysis request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ProfanityAnalysisResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ProfanityAnalysisResponse analyticsProfanity(ProfanityAnalysisRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = analyticsProfanityForHttpResponse(input, params);
        TypeReference<ProfanityAnalysisResponse> typeRef = new TypeReference<ProfanityAnalysisResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse analyticsProfanityForHttpResponse(ProfanityAnalysisRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling analyticsProfanity");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/analytics/profanity");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse analyticsProfanityForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling analyticsProfanity");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/analytics/profanity");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse analyticsProfanityForHttpResponse(ProfanityAnalysisRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling analyticsProfanity");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/analytics/profanity");

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
    * Perform Sentiment Analysis and Classification on Text
    * Analyze input text using advanced Sentiment Analysis to determine if the input is positive, negative, or neutral.  Supports English language input.  Consumes 1-2 API calls per sentence.
    * <p><b>200</b> - OK
    * @param input Input sentiment analysis request
    * @return SentimentAnalysisResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SentimentAnalysisResponse analyticsSentiment(SentimentAnalysisRequest input) throws IOException {
        HttpResponse response = analyticsSentimentForHttpResponse(input);
        TypeReference<SentimentAnalysisResponse> typeRef = new TypeReference<SentimentAnalysisResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Perform Sentiment Analysis and Classification on Text
    * Analyze input text using advanced Sentiment Analysis to determine if the input is positive, negative, or neutral.  Supports English language input.  Consumes 1-2 API calls per sentence.
    * <p><b>200</b> - OK
    * @param input Input sentiment analysis request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SentimentAnalysisResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SentimentAnalysisResponse analyticsSentiment(SentimentAnalysisRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = analyticsSentimentForHttpResponse(input, params);
        TypeReference<SentimentAnalysisResponse> typeRef = new TypeReference<SentimentAnalysisResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse analyticsSentimentForHttpResponse(SentimentAnalysisRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling analyticsSentiment");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/analytics/sentiment");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse analyticsSentimentForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling analyticsSentiment");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/analytics/sentiment");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse analyticsSentimentForHttpResponse(SentimentAnalysisRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling analyticsSentiment");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/analytics/sentiment");

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
    * Perform Semantic Similarity Comparison of Two Strings
    * Analyze two input text strings, typically sentences, and determine the semantic similarity of each.  Semantic similarity refers to the degree to which two sentences mean the same thing semantically.  Uses advanced Deep Learning to perform the semantic similarity comparison.  Consumes 1-2 API calls per sentence.
    * <p><b>200</b> - OK
    * @param input Input similarity analysis request
    * @return SimilarityAnalysisResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SimilarityAnalysisResponse analyticsSimilarity(SimilarityAnalysisRequest input) throws IOException {
        HttpResponse response = analyticsSimilarityForHttpResponse(input);
        TypeReference<SimilarityAnalysisResponse> typeRef = new TypeReference<SimilarityAnalysisResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Perform Semantic Similarity Comparison of Two Strings
    * Analyze two input text strings, typically sentences, and determine the semantic similarity of each.  Semantic similarity refers to the degree to which two sentences mean the same thing semantically.  Uses advanced Deep Learning to perform the semantic similarity comparison.  Consumes 1-2 API calls per sentence.
    * <p><b>200</b> - OK
    * @param input Input similarity analysis request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SimilarityAnalysisResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SimilarityAnalysisResponse analyticsSimilarity(SimilarityAnalysisRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = analyticsSimilarityForHttpResponse(input, params);
        TypeReference<SimilarityAnalysisResponse> typeRef = new TypeReference<SimilarityAnalysisResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse analyticsSimilarityForHttpResponse(SimilarityAnalysisRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling analyticsSimilarity");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/analytics/similarity");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse analyticsSimilarityForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling analyticsSimilarity");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/analytics/similarity");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse analyticsSimilarityForHttpResponse(SimilarityAnalysisRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling analyticsSimilarity");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/analytics/similarity");

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
    * Perform Subjectivity and Objectivity Analysis on Text
    * Analyze input text using advanced Subjectivity and Objectivity Language Analysis to determine if the input text is objective or subjective, and how much.  Supports English language input.  Consumes 1-2 API calls per sentence.
    * <p><b>200</b> - OK
    * @param input Input subjectivity analysis request
    * @return SubjectivityAnalysisResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubjectivityAnalysisResponse analyticsSubjectivity(SubjectivityAnalysisRequest input) throws IOException {
        HttpResponse response = analyticsSubjectivityForHttpResponse(input);
        TypeReference<SubjectivityAnalysisResponse> typeRef = new TypeReference<SubjectivityAnalysisResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Perform Subjectivity and Objectivity Analysis on Text
    * Analyze input text using advanced Subjectivity and Objectivity Language Analysis to determine if the input text is objective or subjective, and how much.  Supports English language input.  Consumes 1-2 API calls per sentence.
    * <p><b>200</b> - OK
    * @param input Input subjectivity analysis request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SubjectivityAnalysisResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SubjectivityAnalysisResponse analyticsSubjectivity(SubjectivityAnalysisRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = analyticsSubjectivityForHttpResponse(input, params);
        TypeReference<SubjectivityAnalysisResponse> typeRef = new TypeReference<SubjectivityAnalysisResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse analyticsSubjectivityForHttpResponse(SubjectivityAnalysisRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling analyticsSubjectivity");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/analytics/subjectivity");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse analyticsSubjectivityForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling analyticsSubjectivity");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/analytics/subjectivity");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse analyticsSubjectivityForHttpResponse(SubjectivityAnalysisRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling analyticsSubjectivity");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/analytics/subjectivity");

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
