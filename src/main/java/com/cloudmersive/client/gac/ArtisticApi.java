package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:58.346-07:00[America/Los_Angeles]")
public class ArtisticApi {
    private ApiClient apiClient;

    public ArtisticApi() {
        this(new ApiClient());
    }

    public ArtisticApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Transform an image into an artistic painting automatically
    * Uses machine learning to automatically transform an image into an artistic painting.  Due to depth of AI processing, depending on image size this operation can take up to 20 seconds.
    * <p><b>200</b> - OK
    * @param style The style of the painting to apply.  To start, try \&quot;udnie\&quot; a painting style.  Possible values are: \&quot;udnie\&quot;, \&quot;wave\&quot;, \&quot;la_muse\&quot;, \&quot;rain_princess\&quot;.
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] artisticPainting(String style, File imageFile) throws IOException {
        HttpResponse response = artisticPaintingForHttpResponse(style, imageFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Transform an image into an artistic painting automatically
    * Uses machine learning to automatically transform an image into an artistic painting.  Due to depth of AI processing, depending on image size this operation can take up to 20 seconds.
    * <p><b>200</b> - OK
    * @param style The style of the painting to apply.  To start, try \&quot;udnie\&quot; a painting style.  Possible values are: \&quot;udnie\&quot;, \&quot;wave\&quot;, \&quot;la_muse\&quot;, \&quot;rain_princess\&quot;.
    * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] artisticPainting(String style, File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = artisticPaintingForHttpResponse(style, imageFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse artisticPaintingForHttpResponse(String style, File imageFile) throws IOException {
        // verify the required parameter 'style' is set
        if (style == null) {
            throw new IllegalArgumentException("Missing the required parameter 'style' when calling artisticPainting");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling artisticPainting");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("style", style);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/artistic/painting/{style}");

        String localVarUrl = uriBuilder.buildFromMap(uriVariables).toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse artisticPaintingForHttpResponse(String style, File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'style' is set
        if (style == null) {
            throw new IllegalArgumentException("Missing the required parameter 'style' when calling artisticPainting");
        }// verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling artisticPainting");
        }
        // create a map of path variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("style", style);
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/image/artistic/painting/{style}");

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
