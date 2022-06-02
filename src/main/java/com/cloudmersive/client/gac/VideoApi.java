package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.math.BigDecimal;
import java.io.File;
import com.cloudmersive.client.gac.model.MediaInformation;
import com.cloudmersive.client.gac.model.NsfwResult;
import org.threeten.bp.OffsetDateTime;
import com.cloudmersive.client.gac.model.SplitVideoResult;
import com.cloudmersive.client.gac.model.StillFramesResult;

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
public class VideoApi {
    private ApiClient apiClient;

    public VideoApi() {
        this(new ApiClient());
    }

    public VideoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Convert Video to Animated GIF format.
    * Automatically detect video file format and convert it to animated GIF format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB. Default height is 250 pixels, while preserving the video&#39;s aspect ratio.
    * <p><b>200</b> - OK
    * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
    * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to 250 pixels, maximum is 500 pixels.
    * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to 250 pixels, maximum is 500 pixels.
    * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
    * @param frameRate Optional; Specify the frame rate of the output video. Defaults to 24 frames per second.
    * @param startTime Optional; Specify the desired starting time of the GIF video in TimeSpan format.
    * @param timeSpan Optional; Specify the desired length of the GIF video in TimeSpan format. Limit is 30 seconds. Default is 10 seconds.
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] videoConvertToGif(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, OffsetDateTime startTime, OffsetDateTime timeSpan, File inputFile) throws IOException {
        HttpResponse response = videoConvertToGifForHttpResponse(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, startTime, timeSpan, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Video to Animated GIF format.
    * Automatically detect video file format and convert it to animated GIF format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB. Default height is 250 pixels, while preserving the video&#39;s aspect ratio.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] videoConvertToGif(Map<String, Object> params) throws IOException {
        HttpResponse response = videoConvertToGifForHttpResponse(params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse videoConvertToGifForHttpResponse(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, OffsetDateTime startTime, OffsetDateTime timeSpan, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/gif");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse videoConvertToGifForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/gif");

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
    * Convert Video to MOV format.
    * Automatically detect video file format and convert it to MOV format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
    * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
    * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
    * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
    * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
    * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] videoConvertToMov(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, File inputFile) throws IOException {
        HttpResponse response = videoConvertToMovForHttpResponse(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Video to MOV format.
    * Automatically detect video file format and convert it to MOV format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] videoConvertToMov(Map<String, Object> params) throws IOException {
        HttpResponse response = videoConvertToMovForHttpResponse(params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse videoConvertToMovForHttpResponse(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/mov");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse videoConvertToMovForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/mov");

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
    * Convert Video to MP4 format.
    * Automatically detect video file format and convert it to MP4 format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
    * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
    * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
    * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
    * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
    * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] videoConvertToMp4(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, File inputFile) throws IOException {
        HttpResponse response = videoConvertToMp4ForHttpResponse(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Video to MP4 format.
    * Automatically detect video file format and convert it to MP4 format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] videoConvertToMp4(Map<String, Object> params) throws IOException {
        HttpResponse response = videoConvertToMp4ForHttpResponse(params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse videoConvertToMp4ForHttpResponse(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/mp4");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse videoConvertToMp4ForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/mp4");

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
    * Convert Video to PNG Still Frames.
    * Automatically detect video file format and convert it to an array of still frame PNG images. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time.
    * <p><b>200</b> - OK
    * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
    * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
    * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
    * @param framesPerSecond Optional; How many video frames per second to be returned as PNG images. Minimum value is 0.1, maximum is 60. Default is 1 frame per second. Maximum of 2000 total frames.
    * @param inputFile Input file to perform the operation on.
    * @return StillFramesResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public StillFramesResult videoConvertToStillFrames(String fileUrl, Integer maxWidth, Integer maxHeight, BigDecimal framesPerSecond, File inputFile) throws IOException {
        HttpResponse response = videoConvertToStillFramesForHttpResponse(fileUrl, maxWidth, maxHeight, framesPerSecond, inputFile);
        TypeReference<StillFramesResult> typeRef = new TypeReference<StillFramesResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Video to PNG Still Frames.
    * Automatically detect video file format and convert it to an array of still frame PNG images. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return StillFramesResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public StillFramesResult videoConvertToStillFrames(Map<String, Object> params) throws IOException {
        HttpResponse response = videoConvertToStillFramesForHttpResponse(params);
        TypeReference<StillFramesResult> typeRef = new TypeReference<StillFramesResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse videoConvertToStillFramesForHttpResponse(String fileUrl, Integer maxWidth, Integer maxHeight, BigDecimal framesPerSecond, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/still-frames");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse videoConvertToStillFramesForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/still-frames");

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
    * Convert Video to WEBM format.
    * Automatically detect video file format and convert it to WEBM format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
    * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
    * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
    * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
    * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
    * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] videoConvertToWebm(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, File inputFile) throws IOException {
        HttpResponse response = videoConvertToWebmForHttpResponse(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Video to WEBM format.
    * Automatically detect video file format and convert it to WEBM format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] videoConvertToWebm(Map<String, Object> params) throws IOException {
        HttpResponse response = videoConvertToWebmForHttpResponse(params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse videoConvertToWebmForHttpResponse(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/webm");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse videoConvertToWebmForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/to/webm");

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
    * Cut a Video to a Shorter Length
    * Cuts a video to the specified start and end times. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
    * @param startTime Optional; Specify the desired starting time of the cut video in TimeSpan format.
    * @param timeSpan Optional; Specify the desired length of the cut video in TimeSpan format. Leave blank to include the rest of the video. Maximum time is 4 hours.
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] videoCutVideo(String fileUrl, OffsetDateTime startTime, OffsetDateTime timeSpan, File inputFile) throws IOException {
        HttpResponse response = videoCutVideoForHttpResponse(fileUrl, startTime, timeSpan, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Cut a Video to a Shorter Length
    * Cuts a video to the specified start and end times. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] videoCutVideo(Map<String, Object> params) throws IOException {
        HttpResponse response = videoCutVideoForHttpResponse(params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse videoCutVideoForHttpResponse(String fileUrl, OffsetDateTime startTime, OffsetDateTime timeSpan, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/cut");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse videoCutVideoForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/cut");

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
    * Get detailed information about a video or audio file
    * Retrieve detailed information about a video or audio file, including format, dimensions, file size, bit rate, duration and start time. Compatible with many formats, including: AVI, ASF, FLV, GIF, MP4, MPEG/MPG, Matroska/WEBM, MOV, AIFF, ASF, CAF, MP3, MP2, MP1, Ogg, OMG/OMA, and WAV. Uses 1 API call per 10 MB of file size.
    * <p><b>200</b> - OK
    * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
    * @param inputFile Input file to perform the operation on.
    * @return MediaInformation
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public MediaInformation videoGetInfo(String fileUrl, File inputFile) throws IOException {
        HttpResponse response = videoGetInfoForHttpResponse(fileUrl, inputFile);
        TypeReference<MediaInformation> typeRef = new TypeReference<MediaInformation>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Get detailed information about a video or audio file
    * Retrieve detailed information about a video or audio file, including format, dimensions, file size, bit rate, duration and start time. Compatible with many formats, including: AVI, ASF, FLV, GIF, MP4, MPEG/MPG, Matroska/WEBM, MOV, AIFF, ASF, CAF, MP3, MP2, MP1, Ogg, OMG/OMA, and WAV. Uses 1 API call per 10 MB of file size.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return MediaInformation
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public MediaInformation videoGetInfo(Map<String, Object> params) throws IOException {
        HttpResponse response = videoGetInfoForHttpResponse(params);
        TypeReference<MediaInformation> typeRef = new TypeReference<MediaInformation>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse videoGetInfoForHttpResponse(String fileUrl, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/get-info");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse videoGetInfoForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/convert/get-info");

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
    * Resizes a Video Preserving the Original Aspect Ratio.
    * Resizes a video, while maintaining the original aspect ratio and encoding. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
    * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
    * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
    * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
    * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
    * @param extension Optional; Specify the file extension of the input video. This is recommended when inputting a file directly, without a file name. If no file name is available and no extension is provided, the extension will be inferred from the file data, which may cause a different extension to be used in the output.
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] videoResizeVideo(String fileUrl, Integer maxWidth, Integer maxHeight, Integer frameRate, Integer quality, String extension, File inputFile) throws IOException {
        HttpResponse response = videoResizeVideoForHttpResponse(fileUrl, maxWidth, maxHeight, frameRate, quality, extension, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Resizes a Video Preserving the Original Aspect Ratio.
    * Resizes a video, while maintaining the original aspect ratio and encoding. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] videoResizeVideo(Map<String, Object> params) throws IOException {
        HttpResponse response = videoResizeVideoForHttpResponse(params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse videoResizeVideoForHttpResponse(String fileUrl, Integer maxWidth, Integer maxHeight, Integer frameRate, Integer quality, String extension, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/resize/preserveAspectRatio");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse videoResizeVideoForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/resize/preserveAspectRatio");

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
    * Resizes a Video without Preserving Aspect Ratio.
    * Resizes a video without maintaining original aspect ratio, allowing fully customizable dimensions. May cause image skewing. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
    * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
    * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
    * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
    * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
    * @param extension Optional; Specify the file extension of the input video. This is recommended when inputting a file directly, without a file name. If no file name is available and no extension is provided, the extension will be inferred from the file data, which may cause a different extension to be used in the output.
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] videoResizeVideoSimple(String fileUrl, Integer maxWidth, Integer maxHeight, Integer frameRate, Integer quality, String extension, File inputFile) throws IOException {
        HttpResponse response = videoResizeVideoSimpleForHttpResponse(fileUrl, maxWidth, maxHeight, frameRate, quality, extension, inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Resizes a Video without Preserving Aspect Ratio.
    * Resizes a video without maintaining original aspect ratio, allowing fully customizable dimensions. May cause image skewing. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] videoResizeVideoSimple(Map<String, Object> params) throws IOException {
        HttpResponse response = videoResizeVideoSimpleForHttpResponse(params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse videoResizeVideoSimpleForHttpResponse(String fileUrl, Integer maxWidth, Integer maxHeight, Integer frameRate, Integer quality, String extension, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/resize/target");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse videoResizeVideoSimpleForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/resize/target");

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
    * Scan a Video for NSFW content.
    * Automatically detect video file format and scan it for Not Safe For Work (NSFW)/Porn/Racy content. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per frame scanned.
    * <p><b>200</b> - OK
    * @param fileUrl Optional; URL of a video file being scanned. Use this option for files larger than 2GB.
    * @param framesPerSecond Optional; How many video frames per second to be scanned. Minimum value is 0.05 (1 frame per 20 seconds), maximum is 1. Default is 0.33 frame per second (1 frame scanned every 3 seconds). Maximum of 1000 total frames can be scanned, potentially adjusting the framerate for longer videos.
    * @param inputFile Input file to perform the operation on.
    * @return NsfwResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public NsfwResult videoScanForNsfw(String fileUrl, BigDecimal framesPerSecond, File inputFile) throws IOException {
        HttpResponse response = videoScanForNsfwForHttpResponse(fileUrl, framesPerSecond, inputFile);
        TypeReference<NsfwResult> typeRef = new TypeReference<NsfwResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Scan a Video for NSFW content.
    * Automatically detect video file format and scan it for Not Safe For Work (NSFW)/Porn/Racy content. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per frame scanned.
    * <p><b>200</b> - OK
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return NsfwResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public NsfwResult videoScanForNsfw(Map<String, Object> params) throws IOException {
        HttpResponse response = videoScanForNsfwForHttpResponse(params);
        TypeReference<NsfwResult> typeRef = new TypeReference<NsfwResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse videoScanForNsfwForHttpResponse(String fileUrl, BigDecimal framesPerSecond, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/scan/nsfw");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse videoScanForNsfwForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/scan/nsfw");

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
    * Split a Video into Two Shorter Videos
    * Cuts a video into two videos based on the specified start time. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param splitTime Specify the desired time at which to split the video in TimeSpan format.
    * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
    * @param timeSpan Optional; Specify the desired length of the second video in TimeSpan format. Leave blank to include the rest of the video. Maximum time is 4 hours.
    * @param inputFile Input file to perform the operation on.
    * @return SplitVideoResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SplitVideoResult videoSplitVideo(OffsetDateTime splitTime, String fileUrl, OffsetDateTime timeSpan, File inputFile) throws IOException {
        HttpResponse response = videoSplitVideoForHttpResponse(splitTime, fileUrl, timeSpan, inputFile);
        TypeReference<SplitVideoResult> typeRef = new TypeReference<SplitVideoResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Split a Video into Two Shorter Videos
    * Cuts a video into two videos based on the specified start time. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
    * <p><b>200</b> - OK
    * @param splitTime Specify the desired time at which to split the video in TimeSpan format.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return SplitVideoResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public SplitVideoResult videoSplitVideo(OffsetDateTime splitTime, Map<String, Object> params) throws IOException {
        HttpResponse response = videoSplitVideoForHttpResponse(splitTime, params);
        TypeReference<SplitVideoResult> typeRef = new TypeReference<SplitVideoResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse videoSplitVideoForHttpResponse(OffsetDateTime splitTime, String fileUrl, OffsetDateTime timeSpan, File inputFile) throws IOException {
        // verify the required parameter 'splitTime' is set
        if (splitTime == null) {
            throw new IllegalArgumentException("Missing the required parameter 'splitTime' when calling videoSplitVideo");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/split");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse videoSplitVideoForHttpResponse(OffsetDateTime splitTime, Map<String, Object> params) throws IOException {
        // verify the required parameter 'splitTime' is set
        if (splitTime == null) {
            throw new IllegalArgumentException("Missing the required parameter 'splitTime' when calling videoSplitVideo");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/video/split");

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
