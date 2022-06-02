package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.XmlAddAttributeWithXPathResult;
import com.cloudmersive.client.gac.model.XmlAddChildWithXPathResult;
import com.cloudmersive.client.gac.model.XmlFilterWithXPathResult;
import com.cloudmersive.client.gac.model.XmlQueryWithXQueryMultiResult;
import com.cloudmersive.client.gac.model.XmlQueryWithXQueryResult;
import com.cloudmersive.client.gac.model.XmlRemoveAllChildrenWithXPathResult;
import com.cloudmersive.client.gac.model.XmlRemoveWithXPathResult;
import com.cloudmersive.client.gac.model.XmlReplaceWithXPathResult;
import com.cloudmersive.client.gac.model.XmlSetValueWithXPathResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:05.444-07:00[America/Los_Angeles]")
public class ConvertDataApi {
    private ApiClient apiClient;

    public ConvertDataApi() {
        this(new ApiClient());
    }

    public ConvertDataApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Convert CSV to JSON conversion
    * Convert a CSV file to a JSON object array
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param columnNamesFromFirstRow Optional; If true, the first row will be used as the labels for the columns; if false, columns will be named Column0, Column1, etc.  Default is true.  Set to false if you are not using column headings, or have an irregular column structure.
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object convertDataCsvToJson(File inputFile, Boolean columnNamesFromFirstRow) throws IOException {
        HttpResponse response = convertDataCsvToJsonForHttpResponse(inputFile, columnNamesFromFirstRow);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert CSV to JSON conversion
    * Convert a CSV file to a JSON object array
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object convertDataCsvToJson(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataCsvToJsonForHttpResponse(inputFile, params);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataCsvToJsonForHttpResponse(File inputFile, Boolean columnNamesFromFirstRow) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataCsvToJson");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/csv/to/json");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDataCsvToJsonForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataCsvToJson");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/csv/to/json");

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
    * Convert CSV to XML conversion
    * Convert a CSV file to a XML file
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param columnNamesFromFirstRow Optional; If true, the first row will be used as the labels for the columns; if false, columns will be named Column0, Column1, etc.  Default is true.  Set to false if you are not using column headings, or have an irregular column structure.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDataCsvToXml(File inputFile, Boolean columnNamesFromFirstRow) throws IOException {
        HttpResponse response = convertDataCsvToXmlForHttpResponse(inputFile, columnNamesFromFirstRow);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert CSV to XML conversion
    * Convert a CSV file to a XML file
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDataCsvToXml(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataCsvToXmlForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataCsvToXmlForHttpResponse(File inputFile, Boolean columnNamesFromFirstRow) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataCsvToXml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/csv/to/xml");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDataCsvToXmlForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataCsvToXml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/csv/to/xml");

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
    * Convert JSON String to XML conversion
    * Convert a JSON object into XML
    * <p><b>200</b> - OK
    * @param jsonString Input JSON String to convert to XML
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object convertDataJsonStringToXml(String jsonString) throws IOException {
        HttpResponse response = convertDataJsonStringToXmlForHttpResponse(jsonString);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert JSON String to XML conversion
    * Convert a JSON object into XML
    * <p><b>200</b> - OK
    * @param jsonString Input JSON String to convert to XML
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object convertDataJsonStringToXml(String jsonString, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataJsonStringToXmlForHttpResponse(jsonString, params);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataJsonStringToXmlForHttpResponse(String jsonString) throws IOException {
        // verify the required parameter 'jsonString' is set
        if (jsonString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'jsonString' when calling convertDataJsonStringToXml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/json-string/to/xml");
        if (jsonString != null) {
            String key = "JsonString";
            Object value = jsonString;
            if (value instanceof Collection) {
                uriBuilder = uriBuilder.queryParam(key, ((Collection) value).toArray());
            } else if (value instanceof Object[]) {
                uriBuilder = uriBuilder.queryParam(key, (Object[]) value);
            } else {
                uriBuilder = uriBuilder.queryParam(key, value);
            }
        }

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDataJsonStringToXmlForHttpResponse(String jsonString, Map<String, Object> params) throws IOException {
        // verify the required parameter 'jsonString' is set
        if (jsonString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'jsonString' when calling convertDataJsonStringToXml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/json-string/to/xml");

        // Copy the params argument if present, to allow passing in immutable maps
        Map<String, Object> allParams = params == null ? new HashMap<String, Object>() : new HashMap<String, Object>(params);
        // Add the required query param 'jsonString' to the map of query params
        allParams.put("jsonString", jsonString);

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
    * Convert JSON Object to XML conversion
    * Convert a JSON object into XML
    * <p><b>200</b> - OK
    * @param jsonObject Input JSON Object to convert to XML
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDataJsonToXml(Object jsonObject) throws IOException {
        HttpResponse response = convertDataJsonToXmlForHttpResponse(jsonObject);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert JSON Object to XML conversion
    * Convert a JSON object into XML
    * <p><b>200</b> - OK
    * @param jsonObject Input JSON Object to convert to XML
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDataJsonToXml(Object jsonObject, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataJsonToXmlForHttpResponse(jsonObject, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataJsonToXmlForHttpResponse(Object jsonObject) throws IOException {
        // verify the required parameter 'jsonObject' is set
        if (jsonObject == null) {
            throw new IllegalArgumentException("Missing the required parameter 'jsonObject' when calling convertDataJsonToXml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/json/to/xml");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = apiClient.new JacksonJsonHttpContent(jsonObject);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

      public HttpResponse convertDataJsonToXmlForHttpResponse(java.io.InputStream jsonObject, String mediaType) throws IOException {
          // verify the required parameter 'jsonObject' is set
              if (jsonObject == null) {
              throw new IllegalArgumentException("Missing the required parameter 'jsonObject' when calling convertDataJsonToXml");
              }
              UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/json/to/xml");

              String localVarUrl = uriBuilder.build().toString();
              GenericUrl genericUrl = new GenericUrl(localVarUrl);

              HttpContent content = jsonObject == null ?
                apiClient.new JacksonJsonHttpContent(null) :
                new InputStreamContent(mediaType == null ? Json.MEDIA_TYPE : mediaType, jsonObject);
              return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
      }

    public HttpResponse convertDataJsonToXmlForHttpResponse(Object jsonObject, Map<String, Object> params) throws IOException {
        // verify the required parameter 'jsonObject' is set
        if (jsonObject == null) {
            throw new IllegalArgumentException("Missing the required parameter 'jsonObject' when calling convertDataJsonToXml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/json/to/xml");

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

        HttpContent content = apiClient.new JacksonJsonHttpContent(jsonObject);
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }


  /**
    * Convert Excel (97-2003) XLS to JSON conversion
    * Convert an Excel (97-2003) XLS file to a JSON object array
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object convertDataXlsToJson(File inputFile) throws IOException {
        HttpResponse response = convertDataXlsToJsonForHttpResponse(inputFile);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Excel (97-2003) XLS to JSON conversion
    * Convert an Excel (97-2003) XLS file to a JSON object array
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object convertDataXlsToJson(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataXlsToJsonForHttpResponse(inputFile, params);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataXlsToJsonForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXlsToJson");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xls/to/json");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDataXlsToJsonForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXlsToJson");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xls/to/json");

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
    * Convert Excel XLSX to JSON conversion
    * Convert an Excel XLSX file to a JSON object array
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDataXlsxToJson(File inputFile) throws IOException {
        HttpResponse response = convertDataXlsxToJsonForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Excel XLSX to JSON conversion
    * Convert an Excel XLSX file to a JSON object array
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDataXlsxToJson(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataXlsxToJsonForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataXlsxToJsonForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXlsxToJson");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/json");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDataXlsxToJsonForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXlsxToJson");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/json");

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
    * Convert Excel XLSX to XML conversion
    * Convert an Excel XLSX file to a XML file
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDataXlsxToXml(File inputFile) throws IOException {
        HttpResponse response = convertDataXlsxToXmlForHttpResponse(inputFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert Excel XLSX to XML conversion
    * Convert an Excel XLSX file to a XML file
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDataXlsxToXml(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataXlsxToXmlForHttpResponse(inputFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataXlsxToXmlForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXlsxToXml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/xml");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDataXlsxToXmlForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXlsxToXml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xlsx/to/xml");

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
    * Adds an attribute to all XML nodes matching XPath expression
    * Return the reuslts of editing an XML document by adding an attribute to all of the nodes that match an input XPath expression.
    * <p><b>200</b> - OK
    * @param xpathExpression Valid XML XPath query expression
    * @param xmlAttributeName Name of the XML attribute to add
    * @param xmlAttributeValue Value of the XML attribute to add
    * @param inputFile Input XML file to perform the operation on.
    * @return XmlAddAttributeWithXPathResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlAddAttributeWithXPathResult convertDataXmlEditAddAttributeWithXPath(String xpathExpression, String xmlAttributeName, String xmlAttributeValue, File inputFile) throws IOException {
        HttpResponse response = convertDataXmlEditAddAttributeWithXPathForHttpResponse(xpathExpression, xmlAttributeName, xmlAttributeValue, inputFile);
        TypeReference<XmlAddAttributeWithXPathResult> typeRef = new TypeReference<XmlAddAttributeWithXPathResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Adds an attribute to all XML nodes matching XPath expression
    * Return the reuslts of editing an XML document by adding an attribute to all of the nodes that match an input XPath expression.
    * <p><b>200</b> - OK
    * @param xpathExpression Valid XML XPath query expression
    * @param xmlAttributeName Name of the XML attribute to add
    * @param xmlAttributeValue Value of the XML attribute to add
    * @param inputFile Input XML file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XmlAddAttributeWithXPathResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlAddAttributeWithXPathResult convertDataXmlEditAddAttributeWithXPath(String xpathExpression, String xmlAttributeName, String xmlAttributeValue, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataXmlEditAddAttributeWithXPathForHttpResponse(xpathExpression, xmlAttributeName, xmlAttributeValue, inputFile, params);
        TypeReference<XmlAddAttributeWithXPathResult> typeRef = new TypeReference<XmlAddAttributeWithXPathResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataXmlEditAddAttributeWithXPathForHttpResponse(String xpathExpression, String xmlAttributeName, String xmlAttributeValue, File inputFile) throws IOException {
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xpathExpression' when calling convertDataXmlEditAddAttributeWithXPath");
        }// verify the required parameter 'xmlAttributeName' is set
        if (xmlAttributeName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xmlAttributeName' when calling convertDataXmlEditAddAttributeWithXPath");
        }// verify the required parameter 'xmlAttributeValue' is set
        if (xmlAttributeValue == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xmlAttributeValue' when calling convertDataXmlEditAddAttributeWithXPath");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlEditAddAttributeWithXPath");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/edit/xpath/add-attribute");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDataXmlEditAddAttributeWithXPathForHttpResponse(String xpathExpression, String xmlAttributeName, String xmlAttributeValue, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xpathExpression' when calling convertDataXmlEditAddAttributeWithXPath");
        }// verify the required parameter 'xmlAttributeName' is set
        if (xmlAttributeName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xmlAttributeName' when calling convertDataXmlEditAddAttributeWithXPath");
        }// verify the required parameter 'xmlAttributeValue' is set
        if (xmlAttributeValue == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xmlAttributeValue' when calling convertDataXmlEditAddAttributeWithXPath");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlEditAddAttributeWithXPath");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/edit/xpath/add-attribute");

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
    * Adds an XML node as a child to XML nodes matching XPath expression
    * Return the reuslts of editing an XML document by adding an XML node as a child to all of the nodes that match an input XPath expression.
    * <p><b>200</b> - OK
    * @param xpathExpression Valid XML XPath query expression
    * @param xmlNodeToAdd XML Node to add as a child
    * @param inputFile Input XML file to perform the operation on.
    * @return XmlAddChildWithXPathResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlAddChildWithXPathResult convertDataXmlEditAddChildWithXPath(String xpathExpression, String xmlNodeToAdd, File inputFile) throws IOException {
        HttpResponse response = convertDataXmlEditAddChildWithXPathForHttpResponse(xpathExpression, xmlNodeToAdd, inputFile);
        TypeReference<XmlAddChildWithXPathResult> typeRef = new TypeReference<XmlAddChildWithXPathResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Adds an XML node as a child to XML nodes matching XPath expression
    * Return the reuslts of editing an XML document by adding an XML node as a child to all of the nodes that match an input XPath expression.
    * <p><b>200</b> - OK
    * @param xpathExpression Valid XML XPath query expression
    * @param xmlNodeToAdd XML Node to add as a child
    * @param inputFile Input XML file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XmlAddChildWithXPathResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlAddChildWithXPathResult convertDataXmlEditAddChildWithXPath(String xpathExpression, String xmlNodeToAdd, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataXmlEditAddChildWithXPathForHttpResponse(xpathExpression, xmlNodeToAdd, inputFile, params);
        TypeReference<XmlAddChildWithXPathResult> typeRef = new TypeReference<XmlAddChildWithXPathResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataXmlEditAddChildWithXPathForHttpResponse(String xpathExpression, String xmlNodeToAdd, File inputFile) throws IOException {
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xpathExpression' when calling convertDataXmlEditAddChildWithXPath");
        }// verify the required parameter 'xmlNodeToAdd' is set
        if (xmlNodeToAdd == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xmlNodeToAdd' when calling convertDataXmlEditAddChildWithXPath");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlEditAddChildWithXPath");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/edit/xpath/add-child");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDataXmlEditAddChildWithXPathForHttpResponse(String xpathExpression, String xmlNodeToAdd, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xpathExpression' when calling convertDataXmlEditAddChildWithXPath");
        }// verify the required parameter 'xmlNodeToAdd' is set
        if (xmlNodeToAdd == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xmlNodeToAdd' when calling convertDataXmlEditAddChildWithXPath");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlEditAddChildWithXPath");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/edit/xpath/add-child");

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
    * Removes, deletes all children of nodes matching XPath expression, but does not remove the nodes
    * Return the reuslts of editing an XML document by removing all child nodes of the nodes that match an input XPath expression.
    * <p><b>200</b> - OK
    * @param xpathExpression Valid XML XPath query expression
    * @param inputFile Input XML file to perform the operation on.
    * @return XmlRemoveAllChildrenWithXPathResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlRemoveAllChildrenWithXPathResult convertDataXmlEditRemoveAllChildNodesWithXPath(String xpathExpression, File inputFile) throws IOException {
        HttpResponse response = convertDataXmlEditRemoveAllChildNodesWithXPathForHttpResponse(xpathExpression, inputFile);
        TypeReference<XmlRemoveAllChildrenWithXPathResult> typeRef = new TypeReference<XmlRemoveAllChildrenWithXPathResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Removes, deletes all children of nodes matching XPath expression, but does not remove the nodes
    * Return the reuslts of editing an XML document by removing all child nodes of the nodes that match an input XPath expression.
    * <p><b>200</b> - OK
    * @param xpathExpression Valid XML XPath query expression
    * @param inputFile Input XML file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XmlRemoveAllChildrenWithXPathResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlRemoveAllChildrenWithXPathResult convertDataXmlEditRemoveAllChildNodesWithXPath(String xpathExpression, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataXmlEditRemoveAllChildNodesWithXPathForHttpResponse(xpathExpression, inputFile, params);
        TypeReference<XmlRemoveAllChildrenWithXPathResult> typeRef = new TypeReference<XmlRemoveAllChildrenWithXPathResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataXmlEditRemoveAllChildNodesWithXPathForHttpResponse(String xpathExpression, File inputFile) throws IOException {
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xpathExpression' when calling convertDataXmlEditRemoveAllChildNodesWithXPath");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlEditRemoveAllChildNodesWithXPath");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/edit/xpath/remove-all-children");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDataXmlEditRemoveAllChildNodesWithXPathForHttpResponse(String xpathExpression, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xpathExpression' when calling convertDataXmlEditRemoveAllChildNodesWithXPath");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlEditRemoveAllChildNodesWithXPath");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/edit/xpath/remove-all-children");

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
    * Replaces XML nodes matching XPath expression with new node
    * Return the reuslts of editing an XML document by replacing all of the nodes that match an input XPath expression with a new XML node expression.
    * <p><b>200</b> - OK
    * @param xpathExpression Valid XML XPath query expression
    * @param xmlNodeReplacement XML Node replacement content
    * @param inputFile Input XML file to perform the operation on.
    * @return XmlReplaceWithXPathResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlReplaceWithXPathResult convertDataXmlEditReplaceWithXPath(String xpathExpression, String xmlNodeReplacement, File inputFile) throws IOException {
        HttpResponse response = convertDataXmlEditReplaceWithXPathForHttpResponse(xpathExpression, xmlNodeReplacement, inputFile);
        TypeReference<XmlReplaceWithXPathResult> typeRef = new TypeReference<XmlReplaceWithXPathResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Replaces XML nodes matching XPath expression with new node
    * Return the reuslts of editing an XML document by replacing all of the nodes that match an input XPath expression with a new XML node expression.
    * <p><b>200</b> - OK
    * @param xpathExpression Valid XML XPath query expression
    * @param xmlNodeReplacement XML Node replacement content
    * @param inputFile Input XML file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XmlReplaceWithXPathResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlReplaceWithXPathResult convertDataXmlEditReplaceWithXPath(String xpathExpression, String xmlNodeReplacement, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataXmlEditReplaceWithXPathForHttpResponse(xpathExpression, xmlNodeReplacement, inputFile, params);
        TypeReference<XmlReplaceWithXPathResult> typeRef = new TypeReference<XmlReplaceWithXPathResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataXmlEditReplaceWithXPathForHttpResponse(String xpathExpression, String xmlNodeReplacement, File inputFile) throws IOException {
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xpathExpression' when calling convertDataXmlEditReplaceWithXPath");
        }// verify the required parameter 'xmlNodeReplacement' is set
        if (xmlNodeReplacement == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xmlNodeReplacement' when calling convertDataXmlEditReplaceWithXPath");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlEditReplaceWithXPath");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/edit/xpath/replace");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDataXmlEditReplaceWithXPathForHttpResponse(String xpathExpression, String xmlNodeReplacement, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xpathExpression' when calling convertDataXmlEditReplaceWithXPath");
        }// verify the required parameter 'xmlNodeReplacement' is set
        if (xmlNodeReplacement == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xmlNodeReplacement' when calling convertDataXmlEditReplaceWithXPath");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlEditReplaceWithXPath");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/edit/xpath/replace");

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
    * Sets the value contents of XML nodes matching XPath expression
    * Return the reuslts of editing an XML document by setting the contents of all of the nodes that match an input XPath expression.  Supports elements and attributes.
    * <p><b>200</b> - OK
    * @param xpathExpression Valid XML XPath query expression
    * @param xmlValue XML Value to set into the matching XML nodes
    * @param inputFile Input XML file to perform the operation on.
    * @return XmlSetValueWithXPathResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlSetValueWithXPathResult convertDataXmlEditSetValueWithXPath(String xpathExpression, String xmlValue, File inputFile) throws IOException {
        HttpResponse response = convertDataXmlEditSetValueWithXPathForHttpResponse(xpathExpression, xmlValue, inputFile);
        TypeReference<XmlSetValueWithXPathResult> typeRef = new TypeReference<XmlSetValueWithXPathResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Sets the value contents of XML nodes matching XPath expression
    * Return the reuslts of editing an XML document by setting the contents of all of the nodes that match an input XPath expression.  Supports elements and attributes.
    * <p><b>200</b> - OK
    * @param xpathExpression Valid XML XPath query expression
    * @param xmlValue XML Value to set into the matching XML nodes
    * @param inputFile Input XML file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XmlSetValueWithXPathResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlSetValueWithXPathResult convertDataXmlEditSetValueWithXPath(String xpathExpression, String xmlValue, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataXmlEditSetValueWithXPathForHttpResponse(xpathExpression, xmlValue, inputFile, params);
        TypeReference<XmlSetValueWithXPathResult> typeRef = new TypeReference<XmlSetValueWithXPathResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataXmlEditSetValueWithXPathForHttpResponse(String xpathExpression, String xmlValue, File inputFile) throws IOException {
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xpathExpression' when calling convertDataXmlEditSetValueWithXPath");
        }// verify the required parameter 'xmlValue' is set
        if (xmlValue == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xmlValue' when calling convertDataXmlEditSetValueWithXPath");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlEditSetValueWithXPath");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/edit/xpath/set-value");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDataXmlEditSetValueWithXPathForHttpResponse(String xpathExpression, String xmlValue, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xpathExpression' when calling convertDataXmlEditSetValueWithXPath");
        }// verify the required parameter 'xmlValue' is set
        if (xmlValue == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xmlValue' when calling convertDataXmlEditSetValueWithXPath");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlEditSetValueWithXPath");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/edit/xpath/set-value");

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
    * Filter, select XML nodes using XPath expression, get results
    * Return the reuslts of filtering, selecting an XML document with an XPath expression
    * <p><b>200</b> - OK
    * @param xpathExpression Valid XML XPath query expression
    * @param inputFile Input file to perform the operation on.
    * @return XmlFilterWithXPathResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlFilterWithXPathResult convertDataXmlFilterWithXPath(String xpathExpression, File inputFile) throws IOException {
        HttpResponse response = convertDataXmlFilterWithXPathForHttpResponse(xpathExpression, inputFile);
        TypeReference<XmlFilterWithXPathResult> typeRef = new TypeReference<XmlFilterWithXPathResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Filter, select XML nodes using XPath expression, get results
    * Return the reuslts of filtering, selecting an XML document with an XPath expression
    * <p><b>200</b> - OK
    * @param xpathExpression Valid XML XPath query expression
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XmlFilterWithXPathResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlFilterWithXPathResult convertDataXmlFilterWithXPath(String xpathExpression, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataXmlFilterWithXPathForHttpResponse(xpathExpression, inputFile, params);
        TypeReference<XmlFilterWithXPathResult> typeRef = new TypeReference<XmlFilterWithXPathResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataXmlFilterWithXPathForHttpResponse(String xpathExpression, File inputFile) throws IOException {
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xpathExpression' when calling convertDataXmlFilterWithXPath");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlFilterWithXPath");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/select/xpath");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDataXmlFilterWithXPathForHttpResponse(String xpathExpression, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xpathExpression' when calling convertDataXmlFilterWithXPath");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlFilterWithXPath");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/select/xpath");

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
    * Query an XML file using XQuery query, get results
    * Return the reuslts of querying a single XML document with an XQuery expression.  Supports XQuery 3.1 and earlier.  This API is optimized for a single XML document as input.  Provided XML document is automatically loaded as the default context; to access elements in the document, simply refer to them without a document reference, such as bookstore/book
    * <p><b>200</b> - OK
    * @param xquery Valid XML XQuery 3.1 or earlier query expression; multi-line expressions are supported
    * @param inputFile Input XML file to perform the operation on.
    * @return XmlQueryWithXQueryResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlQueryWithXQueryResult convertDataXmlQueryWithXQuery(String xquery, File inputFile) throws IOException {
        HttpResponse response = convertDataXmlQueryWithXQueryForHttpResponse(xquery, inputFile);
        TypeReference<XmlQueryWithXQueryResult> typeRef = new TypeReference<XmlQueryWithXQueryResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Query an XML file using XQuery query, get results
    * Return the reuslts of querying a single XML document with an XQuery expression.  Supports XQuery 3.1 and earlier.  This API is optimized for a single XML document as input.  Provided XML document is automatically loaded as the default context; to access elements in the document, simply refer to them without a document reference, such as bookstore/book
    * <p><b>200</b> - OK
    * @param xquery Valid XML XQuery 3.1 or earlier query expression; multi-line expressions are supported
    * @param inputFile Input XML file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XmlQueryWithXQueryResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlQueryWithXQueryResult convertDataXmlQueryWithXQuery(String xquery, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataXmlQueryWithXQueryForHttpResponse(xquery, inputFile, params);
        TypeReference<XmlQueryWithXQueryResult> typeRef = new TypeReference<XmlQueryWithXQueryResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataXmlQueryWithXQueryForHttpResponse(String xquery, File inputFile) throws IOException {
        // verify the required parameter 'xquery' is set
        if (xquery == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xquery' when calling convertDataXmlQueryWithXQuery");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlQueryWithXQuery");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/query/xquery");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDataXmlQueryWithXQueryForHttpResponse(String xquery, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'xquery' is set
        if (xquery == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xquery' when calling convertDataXmlQueryWithXQuery");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlQueryWithXQuery");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/query/xquery");

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
    * Query multiple XML files using XQuery query, get results
    * Return the reuslts of querying an XML document with an XQuery expression.  Supports XQuery 3.1 and earlier.  This API is optimized for multiple XML documents as input.  You can refer to the contents of a given document by name, for example doc(\&quot;books.xml\&quot;) or doc(\&quot;restaurants.xml\&quot;) if you included two input files named books.xml and restaurants.xml.  If input files contain no file name, they will default to file names input1.xml, input2.xml and so on.
    * <p><b>200</b> - OK
    * @param xquery Valid XML XQuery 3.1 or earlier query expression; multi-line expressions are supported
    * @param inputFile1 First input XML file to perform the operation on.
    * @param inputFile2 Second input XML file to perform the operation on.
    * @param inputFile3 Third input XML file to perform the operation on.
    * @param inputFile4 Fourth input XML file to perform the operation on.
    * @param inputFile5 Fifth input XML file to perform the operation on.
    * @param inputFile6 Sixth input XML file to perform the operation on.
    * @param inputFile7 Seventh input XML file to perform the operation on.
    * @param inputFile8 Eighth input XML file to perform the operation on.
    * @param inputFile9 Ninth input XML file to perform the operation on.
    * @param inputFile10 Tenth input XML file to perform the operation on.
    * @return XmlQueryWithXQueryMultiResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlQueryWithXQueryMultiResult convertDataXmlQueryWithXQueryMulti(String xquery, File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        HttpResponse response = convertDataXmlQueryWithXQueryMultiForHttpResponse(xquery, inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10);
        TypeReference<XmlQueryWithXQueryMultiResult> typeRef = new TypeReference<XmlQueryWithXQueryMultiResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Query multiple XML files using XQuery query, get results
    * Return the reuslts of querying an XML document with an XQuery expression.  Supports XQuery 3.1 and earlier.  This API is optimized for multiple XML documents as input.  You can refer to the contents of a given document by name, for example doc(\&quot;books.xml\&quot;) or doc(\&quot;restaurants.xml\&quot;) if you included two input files named books.xml and restaurants.xml.  If input files contain no file name, they will default to file names input1.xml, input2.xml and so on.
    * <p><b>200</b> - OK
    * @param xquery Valid XML XQuery 3.1 or earlier query expression; multi-line expressions are supported
    * @param inputFile1 First input XML file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XmlQueryWithXQueryMultiResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlQueryWithXQueryMultiResult convertDataXmlQueryWithXQueryMulti(String xquery, File inputFile1, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataXmlQueryWithXQueryMultiForHttpResponse(xquery, inputFile1, params);
        TypeReference<XmlQueryWithXQueryMultiResult> typeRef = new TypeReference<XmlQueryWithXQueryMultiResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataXmlQueryWithXQueryMultiForHttpResponse(String xquery, File inputFile1, File inputFile2, File inputFile3, File inputFile4, File inputFile5, File inputFile6, File inputFile7, File inputFile8, File inputFile9, File inputFile10) throws IOException {
        // verify the required parameter 'xquery' is set
        if (xquery == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xquery' when calling convertDataXmlQueryWithXQueryMulti");
        }// verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling convertDataXmlQueryWithXQueryMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/query/xquery/multi");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDataXmlQueryWithXQueryMultiForHttpResponse(String xquery, File inputFile1, Map<String, Object> params) throws IOException {
        // verify the required parameter 'xquery' is set
        if (xquery == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xquery' when calling convertDataXmlQueryWithXQueryMulti");
        }// verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile1' when calling convertDataXmlQueryWithXQueryMulti");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/query/xquery/multi");

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
    * Remove, delete XML nodes and items matching XPath expression
    * Return the reuslts of editing an XML document by removing all of the nodes that match an input XPath expression
    * <p><b>200</b> - OK
    * @param xpathExpression Valid XML XPath query expression
    * @param inputFile Input file to perform the operation on.
    * @return XmlRemoveWithXPathResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlRemoveWithXPathResult convertDataXmlRemoveWithXPath(String xpathExpression, File inputFile) throws IOException {
        HttpResponse response = convertDataXmlRemoveWithXPathForHttpResponse(xpathExpression, inputFile);
        TypeReference<XmlRemoveWithXPathResult> typeRef = new TypeReference<XmlRemoveWithXPathResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Remove, delete XML nodes and items matching XPath expression
    * Return the reuslts of editing an XML document by removing all of the nodes that match an input XPath expression
    * <p><b>200</b> - OK
    * @param xpathExpression Valid XML XPath query expression
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return XmlRemoveWithXPathResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public XmlRemoveWithXPathResult convertDataXmlRemoveWithXPath(String xpathExpression, File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataXmlRemoveWithXPathForHttpResponse(xpathExpression, inputFile, params);
        TypeReference<XmlRemoveWithXPathResult> typeRef = new TypeReference<XmlRemoveWithXPathResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataXmlRemoveWithXPathForHttpResponse(String xpathExpression, File inputFile) throws IOException {
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xpathExpression' when calling convertDataXmlRemoveWithXPath");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlRemoveWithXPath");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/edit/xpath/remove");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDataXmlRemoveWithXPathForHttpResponse(String xpathExpression, File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new IllegalArgumentException("Missing the required parameter 'xpathExpression' when calling convertDataXmlRemoveWithXPath");
        }// verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlRemoveWithXPath");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/edit/xpath/remove");

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
    * Convert XML to JSON conversion
    * Convert an XML string or file into JSON
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object convertDataXmlToJson(File inputFile) throws IOException {
        HttpResponse response = convertDataXmlToJsonForHttpResponse(inputFile);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert XML to JSON conversion
    * Convert an XML string or file into JSON
    * <p><b>200</b> - OK
    * @param inputFile Input file to perform the operation on.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return Object
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public Object convertDataXmlToJson(File inputFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataXmlToJsonForHttpResponse(inputFile, params);
        TypeReference<Object> typeRef = new TypeReference<Object>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataXmlToJsonForHttpResponse(File inputFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlToJson");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/to/json");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDataXmlToJsonForHttpResponse(File inputFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlToJson");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/to/json");

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
    * Transform XML document file with XSLT into a new XML document
    * Convert an XML string or file into JSON
    * <p><b>200</b> - OK
    * @param inputFile Input XML file to perform the operation on.
    * @param transformFile Input XSLT file to use to transform the input XML file.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDataXmlTransformWithXsltToXml(File inputFile, File transformFile) throws IOException {
        HttpResponse response = convertDataXmlTransformWithXsltToXmlForHttpResponse(inputFile, transformFile);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Transform XML document file with XSLT into a new XML document
    * Convert an XML string or file into JSON
    * <p><b>200</b> - OK
    * @param inputFile Input XML file to perform the operation on.
    * @param transformFile Input XSLT file to use to transform the input XML file.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return byte[]
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public byte[] convertDataXmlTransformWithXsltToXml(File inputFile, File transformFile, Map<String, Object> params) throws IOException {
        HttpResponse response = convertDataXmlTransformWithXsltToXmlForHttpResponse(inputFile, transformFile, params);
        TypeReference<byte[]> typeRef = new TypeReference<byte[]>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse convertDataXmlTransformWithXsltToXmlForHttpResponse(File inputFile, File transformFile) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlTransformWithXsltToXml");
        }// verify the required parameter 'transformFile' is set
        if (transformFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transformFile' when calling convertDataXmlTransformWithXsltToXml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/transform/xslt/to/xml");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse convertDataXmlTransformWithXsltToXmlForHttpResponse(File inputFile, File transformFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'inputFile' when calling convertDataXmlTransformWithXsltToXml");
        }// verify the required parameter 'transformFile' is set
        if (transformFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'transformFile' when calling convertDataXmlTransformWithXsltToXml");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/convert/xml/transform/xslt/to/xml");

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
