package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.RephraseRequest;
import com.cloudmersive.client.gac.model.RephraseResponse;

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
public class RephraseApi {
    private ApiClient apiClient;

    public RephraseApi() {
        this(new ApiClient());
    }

    public RephraseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Rephrase, paraphrase English text sentence-by-sentence using Deep Learning AI
    * Automatically rephrases or paraphrases input text in English sentence by sentence using advanced Deep Learning and Neural NLP.  Creates multiple reprhasing candidates per input sentence, from 1 to 10 possible rephrasings of the original sentence.  Seeks to preserve original semantic meaning in rephrased output candidates.  Consumes 1-2 API calls per output rephrasing option generated, per sentence.
    * <p><b>200</b> - OK
    * @param input Input rephrase request
    * @return RephraseResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public RephraseResponse rephraseEnglishRephraseSentenceBySentence(RephraseRequest input) throws IOException {
        HttpResponse response = rephraseEnglishRephraseSentenceBySentenceForHttpResponse(input);
        TypeReference<RephraseResponse> typeRef = new TypeReference<RephraseResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Rephrase, paraphrase English text sentence-by-sentence using Deep Learning AI
    * Automatically rephrases or paraphrases input text in English sentence by sentence using advanced Deep Learning and Neural NLP.  Creates multiple reprhasing candidates per input sentence, from 1 to 10 possible rephrasings of the original sentence.  Seeks to preserve original semantic meaning in rephrased output candidates.  Consumes 1-2 API calls per output rephrasing option generated, per sentence.
    * <p><b>200</b> - OK
    * @param input Input rephrase request
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return RephraseResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public RephraseResponse rephraseEnglishRephraseSentenceBySentence(RephraseRequest input, Map<String, Object> params) throws IOException {
        HttpResponse response = rephraseEnglishRephraseSentenceBySentenceForHttpResponse(input, params);
        TypeReference<RephraseResponse> typeRef = new TypeReference<RephraseResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse rephraseEnglishRephraseSentenceBySentenceForHttpResponse(RephraseRequest input) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling rephraseEnglishRephraseSentenceBySentence");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/rephrase/rephrase/eng/by-sentence");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(input);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse rephraseEnglishRephraseSentenceBySentenceForHttpResponse(java.io.InputStream input, String mediaType) throws IOException {
          // verify the required parameter 'input' is set
              if (input == null) {
              throw new IllegalArgumentException("Missing the required parameter 'input' when calling rephraseEnglishRephraseSentenceBySentence");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/rephrase/rephrase/eng/by-sentence");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = input == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, input);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse rephraseEnglishRephraseSentenceBySentenceForHttpResponse(RephraseRequest input, Map<String, Object> params) throws IOException {
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new IllegalArgumentException("Missing the required parameter 'input' when calling rephraseEnglishRephraseSentenceBySentence");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/nlp-v2/rephrase/rephrase/eng/by-sentence");

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
