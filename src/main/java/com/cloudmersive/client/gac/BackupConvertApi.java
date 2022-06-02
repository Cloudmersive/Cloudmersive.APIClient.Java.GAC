package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.MssqlBakEnumerateTablesResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:27.331-07:00[America/Los_Angeles]")
public class BackupConvertApi {
    private ApiClient apiClient;

    public BackupConvertApi() {
        this(new ApiClient());
    }

    public BackupConvertApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Lists all tables stored in a SQL Server Backup (.BAK) file
    * <p><b>200</b> - Success
    * @param inputFile Input file to perform the operation on
    * @return MssqlBakEnumerateTablesResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public MssqlBakEnumerateTablesResult dataintegrationBackupConvertMssqlBakGetTablesPost(File inputFile) throws IOException {
        HttpResponse response = dataintegrationBackupConvertMssqlBakGetTablesPostForHttpResponse(inputFile);
        TypeReference<MssqlBakEnumerateTablesResult> typeRef = new TypeReference<MssqlBakEnumerateTablesResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Lists all tables stored in a SQL Server Backup (.BAK) file
    * <p><b>200</b> - Success
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return MssqlBakEnumerateTablesResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public MssqlBakEnumerateTablesResult dataintegrationBackupConvertMssqlBakGetTablesPost(Map<String, Object> params) throws IOException {
        HttpResponse response = dataintegrationBackupConvertMssqlBakGetTablesPostForHttpResponse(params);
        TypeReference<MssqlBakEnumerateTablesResult> typeRef = new TypeReference<MssqlBakEnumerateTablesResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dataintegrationBackupConvertMssqlBakGetTablesPostForHttpResponse(File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dataintegration/backup/convert/mssql/bak/get/tables");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse dataintegrationBackupConvertMssqlBakGetTablesPostForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dataintegration/backup/convert/mssql/bak/get/tables");

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
    * Converts a SQL Server Backup (.BAK) file into CSV for a specified table
    * Input the target table to extract the data as a CSV format file.  Supports a wide array of SQL Server .BAK files and SQL Server backup file versions.  Consumes 1 API call per MB of input data.
    * <p><b>200</b>
    * @param tableName Name of the table to return
    * @param inputFile Input file to perform the operation on
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File dataintegrationBackupConvertMssqlBakToCsvPost(String tableName, File inputFile) throws IOException {
        HttpResponse response = dataintegrationBackupConvertMssqlBakToCsvPostForHttpResponse(tableName, inputFile);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Converts a SQL Server Backup (.BAK) file into CSV for a specified table
    * Input the target table to extract the data as a CSV format file.  Supports a wide array of SQL Server .BAK files and SQL Server backup file versions.  Consumes 1 API call per MB of input data.
    * <p><b>200</b>
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return File
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public File dataintegrationBackupConvertMssqlBakToCsvPost(Map<String, Object> params) throws IOException {
        HttpResponse response = dataintegrationBackupConvertMssqlBakToCsvPostForHttpResponse(params);
        TypeReference<File> typeRef = new TypeReference<File>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse dataintegrationBackupConvertMssqlBakToCsvPostForHttpResponse(String tableName, File inputFile) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dataintegration/backup/convert/mssql/bak/to/csv");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse dataintegrationBackupConvertMssqlBakToCsvPostForHttpResponse(Map<String, Object> params) throws IOException {
        
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/dataintegration/backup/convert/mssql/bak/to/csv");

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
