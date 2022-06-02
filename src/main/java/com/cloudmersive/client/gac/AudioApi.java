package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.math.BigDecimal;
import java.io.File;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:22.707-07:00[America/Los_Angeles]")
public class AudioApi {
    private ApiClient apiClient;

    public AudioApi() {
        this(new ApiClient());
    }

    public AudioApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Convert Audio File to AAC format.
    * Automatically detect audio file format and convert it to AAC format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param fileUrl Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB.
    * @param bitRate Optional; Specify the desired bitrate of the converted audio file in kilobytes per second (kB/s). Value may be between 48 and 1,411. By default, the optimal bitrate will be chosen automatically.
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] audioConvertToAac(String fileUrl, Integer bitRate, File inputFile) throws IOException {
        HttpResponse response = audioConvertToAacForHttpResponse(fileUrl, bitRate, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Audio File to AAC format.
    * Automatically detect audio file format and convert it to AAC format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] audioConvertToAac(Map<String, Object> params) throws IOException {
        HttpResponse response = audioConvertToAacForHttpResponse(params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse audioConvertToAacForHttpResponse(String fileUrl, Integer bitRate, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/aac");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse audioConvertToAacForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/aac");

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
    * Convert Audio File to M4A format.
    * Automatically detect audio file format and convert it to M4A format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param fileUrl Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB.
    * @param bitRate Optional; Specify the desired bitrate of the converted audio file in kilobytes per second (kB/s). Value may be between 48 and 1,411. By default, the optimal bitrate will be chosen automatically.
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] audioConvertToM4a(String fileUrl, Integer bitRate, File inputFile) throws IOException {
        HttpResponse response = audioConvertToM4aForHttpResponse(fileUrl, bitRate, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Audio File to M4A format.
    * Automatically detect audio file format and convert it to M4A format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] audioConvertToM4a(Map<String, Object> params) throws IOException {
        HttpResponse response = audioConvertToM4aForHttpResponse(params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse audioConvertToM4aForHttpResponse(String fileUrl, Integer bitRate, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/m4a");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse audioConvertToM4aForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/m4a");

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
    * Convert Audio File to MP3 format.
    * Automatically detect audio file format and convert it to MP3 format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param fileUrl Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB.
    * @param bitRate Optional; Specify the desired bitrate of the converted audio file in kilobytes per second (kB/s). Value may be between 48 and 1,411. By default, the optimal bitrate will be chosen automatically.
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] audioConvertToMp3(String fileUrl, Integer bitRate, File inputFile) throws IOException {
        HttpResponse response = audioConvertToMp3ForHttpResponse(fileUrl, bitRate, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Audio File to MP3 format.
    * Automatically detect audio file format and convert it to MP3 format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] audioConvertToMp3(Map<String, Object> params) throws IOException {
        HttpResponse response = audioConvertToMp3ForHttpResponse(params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse audioConvertToMp3ForHttpResponse(String fileUrl, Integer bitRate, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/mp3");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse audioConvertToMp3ForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/mp3");

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
    * Convert Audio File to WAV format.
    * Automatically detect audio file format and convert it to WAV format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param fileUrl Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB.
    * @param sampleRate Optional; Specify the desired sample rate of the converted audio file in kHz. Value may be between 8 and 96. Standard for audio CDs is 44.1, while DVD audio standard is 48. By default, the optimal sample rate will be chosen automatically.
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] audioConvertToWav(String fileUrl, BigDecimal sampleRate, File inputFile) throws IOException {
        HttpResponse response = audioConvertToWavForHttpResponse(fileUrl, sampleRate, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Audio File to WAV format.
    * Automatically detect audio file format and convert it to WAV format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] audioConvertToWav(Map<String, Object> params) throws IOException {
        HttpResponse response = audioConvertToWavForHttpResponse(params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse audioConvertToWavForHttpResponse(String fileUrl, BigDecimal sampleRate, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/wav");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse audioConvertToWavForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/wav");

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


}
