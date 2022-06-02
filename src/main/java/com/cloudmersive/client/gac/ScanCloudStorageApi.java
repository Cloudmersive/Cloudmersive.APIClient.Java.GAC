package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.CloudStorageAdvancedVirusScanResult;
import com.cloudmersive.client.gac.model.CloudStorageVirusScanResult;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:13.982-07:00[America/Los_Angeles]")
public class ScanCloudStorageApi {
    private ApiClient apiClient;

    public ScanCloudStorageApi() {
        this(new ApiClient());
    }

    public ScanCloudStorageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Scan an AWS S3 file for viruses
    * Scan the contents of a single AWS S3 file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
    * <p><b>200</b> - OK
    * @param accessKey AWS S3 access key for the S3 bucket; you can get this from My Security Credentials in the AWS console
    * @param secretKey AWS S3 secret key for the S3 bucket; you can get this from My Security Credentials in the AWS console
    * @param bucketRegion Name of the region of the S3 bucket, such as &#39;US-East-1&#39;
    * @param bucketName Name of the S3 bucket
    * @param keyName Key name (also called file name) of the file in S3 that you wish to scan for viruses.  If the key name contains Unicode characters, you must base64 encode the key name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
    * @return CloudStorageVirusScanResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CloudStorageVirusScanResult scanCloudStorageScanAwsS3File(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName) throws IOException {
        HttpResponse response = scanCloudStorageScanAwsS3FileForHttpResponse(accessKey, secretKey, bucketRegion, bucketName, keyName);
        TypeReference<CloudStorageVirusScanResult> typeRef = new TypeReference<CloudStorageVirusScanResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Scan an AWS S3 file for viruses
    * Scan the contents of a single AWS S3 file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
    * <p><b>200</b> - OK
    * @param accessKey AWS S3 access key for the S3 bucket; you can get this from My Security Credentials in the AWS console
    * @param secretKey AWS S3 secret key for the S3 bucket; you can get this from My Security Credentials in the AWS console
    * @param bucketRegion Name of the region of the S3 bucket, such as &#39;US-East-1&#39;
    * @param bucketName Name of the S3 bucket
    * @param keyName Key name (also called file name) of the file in S3 that you wish to scan for viruses.  If the key name contains Unicode characters, you must base64 encode the key name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CloudStorageVirusScanResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CloudStorageVirusScanResult scanCloudStorageScanAwsS3File(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName, Map<String, Object> params) throws IOException {
        HttpResponse response = scanCloudStorageScanAwsS3FileForHttpResponse(accessKey, secretKey, bucketRegion, bucketName, keyName, params);
        TypeReference<CloudStorageVirusScanResult> typeRef = new TypeReference<CloudStorageVirusScanResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse scanCloudStorageScanAwsS3FileForHttpResponse(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName) throws IOException {
        // verify the required parameter 'accessKey' is set
        if (accessKey == null) {
            throw new IllegalArgumentException("Missing the required parameter 'accessKey' when calling scanCloudStorageScanAwsS3File");
        }// verify the required parameter 'secretKey' is set
        if (secretKey == null) {
            throw new IllegalArgumentException("Missing the required parameter 'secretKey' when calling scanCloudStorageScanAwsS3File");
        }// verify the required parameter 'bucketRegion' is set
        if (bucketRegion == null) {
            throw new IllegalArgumentException("Missing the required parameter 'bucketRegion' when calling scanCloudStorageScanAwsS3File");
        }// verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'bucketName' when calling scanCloudStorageScanAwsS3File");
        }// verify the required parameter 'keyName' is set
        if (keyName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'keyName' when calling scanCloudStorageScanAwsS3File");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/virus/scan/cloud-storage/aws-s3/single");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse scanCloudStorageScanAwsS3FileForHttpResponse(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName, Map<String, Object> params) throws IOException {
        // verify the required parameter 'accessKey' is set
        if (accessKey == null) {
            throw new IllegalArgumentException("Missing the required parameter 'accessKey' when calling scanCloudStorageScanAwsS3File");
        }// verify the required parameter 'secretKey' is set
        if (secretKey == null) {
            throw new IllegalArgumentException("Missing the required parameter 'secretKey' when calling scanCloudStorageScanAwsS3File");
        }// verify the required parameter 'bucketRegion' is set
        if (bucketRegion == null) {
            throw new IllegalArgumentException("Missing the required parameter 'bucketRegion' when calling scanCloudStorageScanAwsS3File");
        }// verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'bucketName' when calling scanCloudStorageScanAwsS3File");
        }// verify the required parameter 'keyName' is set
        if (keyName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'keyName' when calling scanCloudStorageScanAwsS3File");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/virus/scan/cloud-storage/aws-s3/single");

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
    * Advanced Scan an AWS S3 file for viruses
    * Advanced Scan the contents of a single AWS S3 file and its content for viruses and threats. Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
    * <p><b>200</b> - OK
    * @param accessKey AWS S3 access key for the S3 bucket; you can get this from My Security Credentials in the AWS console
    * @param secretKey AWS S3 secret key for the S3 bucket; you can get this from My Security Credentials in the AWS console
    * @param bucketRegion Name of the region of the S3 bucket, such as &#39;US-East-1&#39;
    * @param bucketName Name of the S3 bucket
    * @param keyName Key name (also called file name) of the file in S3 that you wish to scan for viruses.  If the key name contains Unicode characters, you must base64 encode the key name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
    * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended).
    * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended).
    * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended).
    * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended).
    * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
    * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended).
    * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled.
    * @return CloudStorageAdvancedVirusScanResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CloudStorageAdvancedVirusScanResult scanCloudStorageScanAwsS3FileAdvanced(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, String restrictFileTypes) throws IOException {
        HttpResponse response = scanCloudStorageScanAwsS3FileAdvancedForHttpResponse(accessKey, secretKey, bucketRegion, bucketName, keyName, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, restrictFileTypes);
        TypeReference<CloudStorageAdvancedVirusScanResult> typeRef = new TypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Advanced Scan an AWS S3 file for viruses
    * Advanced Scan the contents of a single AWS S3 file and its content for viruses and threats. Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
    * <p><b>200</b> - OK
    * @param accessKey AWS S3 access key for the S3 bucket; you can get this from My Security Credentials in the AWS console
    * @param secretKey AWS S3 secret key for the S3 bucket; you can get this from My Security Credentials in the AWS console
    * @param bucketRegion Name of the region of the S3 bucket, such as &#39;US-East-1&#39;
    * @param bucketName Name of the S3 bucket
    * @param keyName Key name (also called file name) of the file in S3 that you wish to scan for viruses.  If the key name contains Unicode characters, you must base64 encode the key name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CloudStorageAdvancedVirusScanResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CloudStorageAdvancedVirusScanResult scanCloudStorageScanAwsS3FileAdvanced(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName, Map<String, Object> params) throws IOException {
        HttpResponse response = scanCloudStorageScanAwsS3FileAdvancedForHttpResponse(accessKey, secretKey, bucketRegion, bucketName, keyName, params);
        TypeReference<CloudStorageAdvancedVirusScanResult> typeRef = new TypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse scanCloudStorageScanAwsS3FileAdvancedForHttpResponse(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, String restrictFileTypes) throws IOException {
        // verify the required parameter 'accessKey' is set
        if (accessKey == null) {
            throw new IllegalArgumentException("Missing the required parameter 'accessKey' when calling scanCloudStorageScanAwsS3FileAdvanced");
        }// verify the required parameter 'secretKey' is set
        if (secretKey == null) {
            throw new IllegalArgumentException("Missing the required parameter 'secretKey' when calling scanCloudStorageScanAwsS3FileAdvanced");
        }// verify the required parameter 'bucketRegion' is set
        if (bucketRegion == null) {
            throw new IllegalArgumentException("Missing the required parameter 'bucketRegion' when calling scanCloudStorageScanAwsS3FileAdvanced");
        }// verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'bucketName' when calling scanCloudStorageScanAwsS3FileAdvanced");
        }// verify the required parameter 'keyName' is set
        if (keyName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'keyName' when calling scanCloudStorageScanAwsS3FileAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/virus/scan/cloud-storage/aws-s3/single/advanced");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse scanCloudStorageScanAwsS3FileAdvancedForHttpResponse(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName, Map<String, Object> params) throws IOException {
        // verify the required parameter 'accessKey' is set
        if (accessKey == null) {
            throw new IllegalArgumentException("Missing the required parameter 'accessKey' when calling scanCloudStorageScanAwsS3FileAdvanced");
        }// verify the required parameter 'secretKey' is set
        if (secretKey == null) {
            throw new IllegalArgumentException("Missing the required parameter 'secretKey' when calling scanCloudStorageScanAwsS3FileAdvanced");
        }// verify the required parameter 'bucketRegion' is set
        if (bucketRegion == null) {
            throw new IllegalArgumentException("Missing the required parameter 'bucketRegion' when calling scanCloudStorageScanAwsS3FileAdvanced");
        }// verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'bucketName' when calling scanCloudStorageScanAwsS3FileAdvanced");
        }// verify the required parameter 'keyName' is set
        if (keyName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'keyName' when calling scanCloudStorageScanAwsS3FileAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/virus/scan/cloud-storage/aws-s3/single/advanced");

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
    * Scan an Azure Blob for viruses
    * Scan the contents of a single Azure Blob and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
    * <p><b>200</b> - OK
    * @param connectionString Connection string for the Azure Blob Storage Account; you can get this connection string from the Access Keys tab of the Storage Account blade in the Azure Portal.
    * @param containerName Name of the Blob container within the Azure Blob Storage account
    * @param blobPath Path to the blob within the container, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the blob path contains Unicode characters, you must base64 encode the blob path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
    * @return CloudStorageVirusScanResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CloudStorageVirusScanResult scanCloudStorageScanAzureBlob(String connectionString, String containerName, String blobPath) throws IOException {
        HttpResponse response = scanCloudStorageScanAzureBlobForHttpResponse(connectionString, containerName, blobPath);
        TypeReference<CloudStorageVirusScanResult> typeRef = new TypeReference<CloudStorageVirusScanResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Scan an Azure Blob for viruses
    * Scan the contents of a single Azure Blob and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
    * <p><b>200</b> - OK
    * @param connectionString Connection string for the Azure Blob Storage Account; you can get this connection string from the Access Keys tab of the Storage Account blade in the Azure Portal.
    * @param containerName Name of the Blob container within the Azure Blob Storage account
    * @param blobPath Path to the blob within the container, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the blob path contains Unicode characters, you must base64 encode the blob path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CloudStorageVirusScanResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CloudStorageVirusScanResult scanCloudStorageScanAzureBlob(String connectionString, String containerName, String blobPath, Map<String, Object> params) throws IOException {
        HttpResponse response = scanCloudStorageScanAzureBlobForHttpResponse(connectionString, containerName, blobPath, params);
        TypeReference<CloudStorageVirusScanResult> typeRef = new TypeReference<CloudStorageVirusScanResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse scanCloudStorageScanAzureBlobForHttpResponse(String connectionString, String containerName, String blobPath) throws IOException {
        // verify the required parameter 'connectionString' is set
        if (connectionString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'connectionString' when calling scanCloudStorageScanAzureBlob");
        }// verify the required parameter 'containerName' is set
        if (containerName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'containerName' when calling scanCloudStorageScanAzureBlob");
        }// verify the required parameter 'blobPath' is set
        if (blobPath == null) {
            throw new IllegalArgumentException("Missing the required parameter 'blobPath' when calling scanCloudStorageScanAzureBlob");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/virus/scan/cloud-storage/azure-blob/single");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse scanCloudStorageScanAzureBlobForHttpResponse(String connectionString, String containerName, String blobPath, Map<String, Object> params) throws IOException {
        // verify the required parameter 'connectionString' is set
        if (connectionString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'connectionString' when calling scanCloudStorageScanAzureBlob");
        }// verify the required parameter 'containerName' is set
        if (containerName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'containerName' when calling scanCloudStorageScanAzureBlob");
        }// verify the required parameter 'blobPath' is set
        if (blobPath == null) {
            throw new IllegalArgumentException("Missing the required parameter 'blobPath' when calling scanCloudStorageScanAzureBlob");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/virus/scan/cloud-storage/azure-blob/single");

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
    * Advanced Scan an Azure Blob for viruses
    * Advanced Scan the contents of a single Azure Blob and its content for viruses and threats.  Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
    * <p><b>200</b> - OK
    * @param connectionString Connection string for the Azure Blob Storage Account; you can get this connection string from the Access Keys tab of the Storage Account blade in the Azure Portal.
    * @param containerName Name of the Blob container within the Azure Blob Storage account
    * @param blobPath Path to the blob within the container, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the blob path contains Unicode characters, you must base64 encode the blob path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
    * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended).
    * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended).
    * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended).
    * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended).
    * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
    * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended).
    * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled.
    * @return CloudStorageAdvancedVirusScanResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CloudStorageAdvancedVirusScanResult scanCloudStorageScanAzureBlobAdvanced(String connectionString, String containerName, String blobPath, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, String restrictFileTypes) throws IOException {
        HttpResponse response = scanCloudStorageScanAzureBlobAdvancedForHttpResponse(connectionString, containerName, blobPath, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, restrictFileTypes);
        TypeReference<CloudStorageAdvancedVirusScanResult> typeRef = new TypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Advanced Scan an Azure Blob for viruses
    * Advanced Scan the contents of a single Azure Blob and its content for viruses and threats.  Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
    * <p><b>200</b> - OK
    * @param connectionString Connection string for the Azure Blob Storage Account; you can get this connection string from the Access Keys tab of the Storage Account blade in the Azure Portal.
    * @param containerName Name of the Blob container within the Azure Blob Storage account
    * @param blobPath Path to the blob within the container, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the blob path contains Unicode characters, you must base64 encode the blob path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CloudStorageAdvancedVirusScanResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CloudStorageAdvancedVirusScanResult scanCloudStorageScanAzureBlobAdvanced(String connectionString, String containerName, String blobPath, Map<String, Object> params) throws IOException {
        HttpResponse response = scanCloudStorageScanAzureBlobAdvancedForHttpResponse(connectionString, containerName, blobPath, params);
        TypeReference<CloudStorageAdvancedVirusScanResult> typeRef = new TypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse scanCloudStorageScanAzureBlobAdvancedForHttpResponse(String connectionString, String containerName, String blobPath, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, String restrictFileTypes) throws IOException {
        // verify the required parameter 'connectionString' is set
        if (connectionString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'connectionString' when calling scanCloudStorageScanAzureBlobAdvanced");
        }// verify the required parameter 'containerName' is set
        if (containerName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'containerName' when calling scanCloudStorageScanAzureBlobAdvanced");
        }// verify the required parameter 'blobPath' is set
        if (blobPath == null) {
            throw new IllegalArgumentException("Missing the required parameter 'blobPath' when calling scanCloudStorageScanAzureBlobAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/virus/scan/cloud-storage/azure-blob/single/advanced");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse scanCloudStorageScanAzureBlobAdvancedForHttpResponse(String connectionString, String containerName, String blobPath, Map<String, Object> params) throws IOException {
        // verify the required parameter 'connectionString' is set
        if (connectionString == null) {
            throw new IllegalArgumentException("Missing the required parameter 'connectionString' when calling scanCloudStorageScanAzureBlobAdvanced");
        }// verify the required parameter 'containerName' is set
        if (containerName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'containerName' when calling scanCloudStorageScanAzureBlobAdvanced");
        }// verify the required parameter 'blobPath' is set
        if (blobPath == null) {
            throw new IllegalArgumentException("Missing the required parameter 'blobPath' when calling scanCloudStorageScanAzureBlobAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/virus/scan/cloud-storage/azure-blob/single/advanced");

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
    * Scan an Google Cloud Platform (GCP) Storage file for viruses
    * Scan the contents of a single Google Cloud Platform (GCP) Storage file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
    * <p><b>200</b> - OK
    * @param bucketName Name of the bucket in Google Cloud Storage
    * @param objectName Name of the object or file in Google Cloud Storage.  If the object name contains Unicode characters, you must base64 encode the object name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
    * @param jsonCredentialFile Service Account credential for Google Cloud stored in a JSON file.
    * @return CloudStorageVirusScanResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CloudStorageVirusScanResult scanCloudStorageScanGcpStorageFile(String bucketName, String objectName, File jsonCredentialFile) throws IOException {
        HttpResponse response = scanCloudStorageScanGcpStorageFileForHttpResponse(bucketName, objectName, jsonCredentialFile);
        TypeReference<CloudStorageVirusScanResult> typeRef = new TypeReference<CloudStorageVirusScanResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Scan an Google Cloud Platform (GCP) Storage file for viruses
    * Scan the contents of a single Google Cloud Platform (GCP) Storage file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
    * <p><b>200</b> - OK
    * @param bucketName Name of the bucket in Google Cloud Storage
    * @param objectName Name of the object or file in Google Cloud Storage.  If the object name contains Unicode characters, you must base64 encode the object name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
    * @param jsonCredentialFile Service Account credential for Google Cloud stored in a JSON file.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CloudStorageVirusScanResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CloudStorageVirusScanResult scanCloudStorageScanGcpStorageFile(String bucketName, String objectName, File jsonCredentialFile, Map<String, Object> params) throws IOException {
        HttpResponse response = scanCloudStorageScanGcpStorageFileForHttpResponse(bucketName, objectName, jsonCredentialFile, params);
        TypeReference<CloudStorageVirusScanResult> typeRef = new TypeReference<CloudStorageVirusScanResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse scanCloudStorageScanGcpStorageFileForHttpResponse(String bucketName, String objectName, File jsonCredentialFile) throws IOException {
        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'bucketName' when calling scanCloudStorageScanGcpStorageFile");
        }// verify the required parameter 'objectName' is set
        if (objectName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'objectName' when calling scanCloudStorageScanGcpStorageFile");
        }// verify the required parameter 'jsonCredentialFile' is set
        if (jsonCredentialFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'jsonCredentialFile' when calling scanCloudStorageScanGcpStorageFile");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/virus/scan/cloud-storage/gcp-storage/single");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse scanCloudStorageScanGcpStorageFileForHttpResponse(String bucketName, String objectName, File jsonCredentialFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'bucketName' when calling scanCloudStorageScanGcpStorageFile");
        }// verify the required parameter 'objectName' is set
        if (objectName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'objectName' when calling scanCloudStorageScanGcpStorageFile");
        }// verify the required parameter 'jsonCredentialFile' is set
        if (jsonCredentialFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'jsonCredentialFile' when calling scanCloudStorageScanGcpStorageFile");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/virus/scan/cloud-storage/gcp-storage/single");

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
    * Advanced Scan an Google Cloud Platform (GCP) Storage file for viruses
    * Advanced Scan the contents of a single Google Cloud Platform (GCP) Storage file and its content for viruses and threats. Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
    * <p><b>200</b> - OK
    * @param bucketName Name of the bucket in Google Cloud Storage
    * @param objectName Name of the object or file in Google Cloud Storage.  If the object name contains Unicode characters, you must base64 encode the object name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
    * @param jsonCredentialFile Service Account credential for Google Cloud stored in a JSON file.
    * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended).
    * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended).
    * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended).
    * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended).
    * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
    * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended).
    * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled.
    * @return CloudStorageAdvancedVirusScanResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CloudStorageAdvancedVirusScanResult scanCloudStorageScanGcpStorageFileAdvanced(String bucketName, String objectName, File jsonCredentialFile, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, String restrictFileTypes) throws IOException {
        HttpResponse response = scanCloudStorageScanGcpStorageFileAdvancedForHttpResponse(bucketName, objectName, jsonCredentialFile, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, restrictFileTypes);
        TypeReference<CloudStorageAdvancedVirusScanResult> typeRef = new TypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Advanced Scan an Google Cloud Platform (GCP) Storage file for viruses
    * Advanced Scan the contents of a single Google Cloud Platform (GCP) Storage file and its content for viruses and threats. Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
    * <p><b>200</b> - OK
    * @param bucketName Name of the bucket in Google Cloud Storage
    * @param objectName Name of the object or file in Google Cloud Storage.  If the object name contains Unicode characters, you must base64 encode the object name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
    * @param jsonCredentialFile Service Account credential for Google Cloud stored in a JSON file.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CloudStorageAdvancedVirusScanResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CloudStorageAdvancedVirusScanResult scanCloudStorageScanGcpStorageFileAdvanced(String bucketName, String objectName, File jsonCredentialFile, Map<String, Object> params) throws IOException {
        HttpResponse response = scanCloudStorageScanGcpStorageFileAdvancedForHttpResponse(bucketName, objectName, jsonCredentialFile, params);
        TypeReference<CloudStorageAdvancedVirusScanResult> typeRef = new TypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse scanCloudStorageScanGcpStorageFileAdvancedForHttpResponse(String bucketName, String objectName, File jsonCredentialFile, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, String restrictFileTypes) throws IOException {
        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'bucketName' when calling scanCloudStorageScanGcpStorageFileAdvanced");
        }// verify the required parameter 'objectName' is set
        if (objectName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'objectName' when calling scanCloudStorageScanGcpStorageFileAdvanced");
        }// verify the required parameter 'jsonCredentialFile' is set
        if (jsonCredentialFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'jsonCredentialFile' when calling scanCloudStorageScanGcpStorageFileAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/virus/scan/cloud-storage/gcp-storage/single/advanced");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse scanCloudStorageScanGcpStorageFileAdvancedForHttpResponse(String bucketName, String objectName, File jsonCredentialFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'bucketName' when calling scanCloudStorageScanGcpStorageFileAdvanced");
        }// verify the required parameter 'objectName' is set
        if (objectName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'objectName' when calling scanCloudStorageScanGcpStorageFileAdvanced");
        }// verify the required parameter 'jsonCredentialFile' is set
        if (jsonCredentialFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'jsonCredentialFile' when calling scanCloudStorageScanGcpStorageFileAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/virus/scan/cloud-storage/gcp-storage/single/advanced");

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
    * Virus Scan a file in a SharePoint Online Site Drive
    * Virus Scan the contents of a single SharePoint Online Site Drive file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time. To get the Client ID and Client Secret, follow these steps: (1) Navigate to the Azure Portal and click on Azure Active Directory, (2) click on App Registrations on the left hand side, (3) click on Register Application, (4) Name the application CloudmersiveAntiVirus and click on Register, (5) Get the client ID by clicking on Overview and copying the value labeled Application (client) ID, (6) click on Certificates and Secrets, (7) click on New client secret, choose a longer expiration and give the secret a name, (8) copy the secret value to the clipboard and save it securely, this is your Client Secret, (9) Now we need to grant permissions to SharePOint; click on API Permissions on the left hand side, (10) click on Add a permission and choose Microsoft Graph, (11) click on Application Permissions, (12) search for Sites.FullControl.All, (13) Click on Add Permissions, (14) now navigate back to Azure Active Directory and click on Enterprise Applications, click on CloudmersiveAntiVirus and click on Permissions, and (15) click on Grant Admin Consent.
    * <p><b>200</b> - OK
    * @param clientID Client ID access credentials; see description above for instructions on how to get the Client ID from the Azure Active Directory portal.
    * @param clientSecret Client Secret access credentials; see description above for instructions on how to get the Client Secret from the Azure Active Directory portal
    * @param sharepointDomainName SharePoint Online domain name, such as mydomain.sharepoint.com
    * @param siteID Site ID (GUID) of the SharePoint site you wish to retrieve the file from
    * @param filePath Path to the file within the drive, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the file path contains Unicode characters, you must base64 encode the file path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
    * @param tenantID Optional; Tenant ID of your Azure Active Directory
    * @param itemID SharePoint itemID, such as a DriveItem Id
    * @return CloudStorageVirusScanResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CloudStorageVirusScanResult scanCloudStorageScanSharePointOnlineFile(String clientID, String clientSecret, String sharepointDomainName, String siteID, String filePath, String tenantID, String itemID) throws IOException {
        HttpResponse response = scanCloudStorageScanSharePointOnlineFileForHttpResponse(clientID, clientSecret, sharepointDomainName, siteID, filePath, tenantID, itemID);
        TypeReference<CloudStorageVirusScanResult> typeRef = new TypeReference<CloudStorageVirusScanResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Virus Scan a file in a SharePoint Online Site Drive
    * Virus Scan the contents of a single SharePoint Online Site Drive file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time. To get the Client ID and Client Secret, follow these steps: (1) Navigate to the Azure Portal and click on Azure Active Directory, (2) click on App Registrations on the left hand side, (3) click on Register Application, (4) Name the application CloudmersiveAntiVirus and click on Register, (5) Get the client ID by clicking on Overview and copying the value labeled Application (client) ID, (6) click on Certificates and Secrets, (7) click on New client secret, choose a longer expiration and give the secret a name, (8) copy the secret value to the clipboard and save it securely, this is your Client Secret, (9) Now we need to grant permissions to SharePOint; click on API Permissions on the left hand side, (10) click on Add a permission and choose Microsoft Graph, (11) click on Application Permissions, (12) search for Sites.FullControl.All, (13) Click on Add Permissions, (14) now navigate back to Azure Active Directory and click on Enterprise Applications, click on CloudmersiveAntiVirus and click on Permissions, and (15) click on Grant Admin Consent.
    * <p><b>200</b> - OK
    * @param clientID Client ID access credentials; see description above for instructions on how to get the Client ID from the Azure Active Directory portal.
    * @param clientSecret Client Secret access credentials; see description above for instructions on how to get the Client Secret from the Azure Active Directory portal
    * @param sharepointDomainName SharePoint Online domain name, such as mydomain.sharepoint.com
    * @param siteID Site ID (GUID) of the SharePoint site you wish to retrieve the file from
    * @param filePath Path to the file within the drive, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the file path contains Unicode characters, you must base64 encode the file path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CloudStorageVirusScanResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CloudStorageVirusScanResult scanCloudStorageScanSharePointOnlineFile(String clientID, String clientSecret, String sharepointDomainName, String siteID, String filePath, Map<String, Object> params) throws IOException {
        HttpResponse response = scanCloudStorageScanSharePointOnlineFileForHttpResponse(clientID, clientSecret, sharepointDomainName, siteID, filePath, params);
        TypeReference<CloudStorageVirusScanResult> typeRef = new TypeReference<CloudStorageVirusScanResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse scanCloudStorageScanSharePointOnlineFileForHttpResponse(String clientID, String clientSecret, String sharepointDomainName, String siteID, String filePath, String tenantID, String itemID) throws IOException {
        // verify the required parameter 'clientID' is set
        if (clientID == null) {
            throw new IllegalArgumentException("Missing the required parameter 'clientID' when calling scanCloudStorageScanSharePointOnlineFile");
        }// verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new IllegalArgumentException("Missing the required parameter 'clientSecret' when calling scanCloudStorageScanSharePointOnlineFile");
        }// verify the required parameter 'sharepointDomainName' is set
        if (sharepointDomainName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sharepointDomainName' when calling scanCloudStorageScanSharePointOnlineFile");
        }// verify the required parameter 'siteID' is set
        if (siteID == null) {
            throw new IllegalArgumentException("Missing the required parameter 'siteID' when calling scanCloudStorageScanSharePointOnlineFile");
        }// verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new IllegalArgumentException("Missing the required parameter 'filePath' when calling scanCloudStorageScanSharePointOnlineFile");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/virus/scan/cloud-storage/sharepoint-online/site/single");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse scanCloudStorageScanSharePointOnlineFileForHttpResponse(String clientID, String clientSecret, String sharepointDomainName, String siteID, String filePath, Map<String, Object> params) throws IOException {
        // verify the required parameter 'clientID' is set
        if (clientID == null) {
            throw new IllegalArgumentException("Missing the required parameter 'clientID' when calling scanCloudStorageScanSharePointOnlineFile");
        }// verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new IllegalArgumentException("Missing the required parameter 'clientSecret' when calling scanCloudStorageScanSharePointOnlineFile");
        }// verify the required parameter 'sharepointDomainName' is set
        if (sharepointDomainName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sharepointDomainName' when calling scanCloudStorageScanSharePointOnlineFile");
        }// verify the required parameter 'siteID' is set
        if (siteID == null) {
            throw new IllegalArgumentException("Missing the required parameter 'siteID' when calling scanCloudStorageScanSharePointOnlineFile");
        }// verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new IllegalArgumentException("Missing the required parameter 'filePath' when calling scanCloudStorageScanSharePointOnlineFile");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/virus/scan/cloud-storage/sharepoint-online/site/single");

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
    * Advanced Virus Scan a file in a SharePoint Online Site Drive
    * Advanced Virus Scan the contents of a single SharePoint Online Site Drive file and its content for viruses and threats.  Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time. To get the Client ID and Client Secret, follow these steps: (1) Navigate to the Azure Portal and click on Azure Active Directory, (2) click on App Registrations on the left hand side, (3) click on Register Application, (4) Name the application CloudmersiveAntiVirus and click on Register, (5) Get the client ID by clicking on Overview and copying the value labeled Application (client) ID, (6) click on Certificates and Secrets, (7) click on New client secret, choose a longer expiration and give the secret a name, (8) copy the secret value to the clipboard and save it securely, this is your Client Secret, (9) Now we need to grant permissions to SharePOint; click on API Permissions on the left hand side, (10) click on Add a permission and choose Microsoft Graph, (11) click on Application Permissions, (12) search for Sites.FullControl.All, (13) Click on Add Permissions, (14) now navigate back to Azure Active Directory and click on Enterprise Applications, click on CloudmersiveAntiVirus and click on Permissions, and (15) click on Grant Admin Consent.
    * <p><b>200</b> - OK
    * @param clientID Client ID access credentials; see description above for instructions on how to get the Client ID from the Azure Active Directory portal.
    * @param clientSecret Client Secret access credentials; see description above for instructions on how to get the Client Secret from the Azure Active Directory portal
    * @param sharepointDomainName SharePoint Online domain name, such as mydomain.sharepoint.com
    * @param siteID Site ID (GUID) of the SharePoint site you wish to retrieve the file from
    * @param tenantID Optional; Tenant ID of your Azure Active Directory
    * @param filePath Path to the file within the drive, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the file path contains Unicode characters, you must base64 encode the file path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
    * @param itemID SharePoint itemID, such as a DriveItem Id
    * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended).
    * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended).
    * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended).
    * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended).
    * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
    * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended).
    * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled.
    * @return CloudStorageAdvancedVirusScanResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CloudStorageAdvancedVirusScanResult scanCloudStorageScanSharePointOnlineFileAdvanced(String clientID, String clientSecret, String sharepointDomainName, String siteID, String tenantID, String filePath, String itemID, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, String restrictFileTypes) throws IOException {
        HttpResponse response = scanCloudStorageScanSharePointOnlineFileAdvancedForHttpResponse(clientID, clientSecret, sharepointDomainName, siteID, tenantID, filePath, itemID, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, restrictFileTypes);
        TypeReference<CloudStorageAdvancedVirusScanResult> typeRef = new TypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Advanced Virus Scan a file in a SharePoint Online Site Drive
    * Advanced Virus Scan the contents of a single SharePoint Online Site Drive file and its content for viruses and threats.  Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time. To get the Client ID and Client Secret, follow these steps: (1) Navigate to the Azure Portal and click on Azure Active Directory, (2) click on App Registrations on the left hand side, (3) click on Register Application, (4) Name the application CloudmersiveAntiVirus and click on Register, (5) Get the client ID by clicking on Overview and copying the value labeled Application (client) ID, (6) click on Certificates and Secrets, (7) click on New client secret, choose a longer expiration and give the secret a name, (8) copy the secret value to the clipboard and save it securely, this is your Client Secret, (9) Now we need to grant permissions to SharePOint; click on API Permissions on the left hand side, (10) click on Add a permission and choose Microsoft Graph, (11) click on Application Permissions, (12) search for Sites.FullControl.All, (13) Click on Add Permissions, (14) now navigate back to Azure Active Directory and click on Enterprise Applications, click on CloudmersiveAntiVirus and click on Permissions, and (15) click on Grant Admin Consent.
    * <p><b>200</b> - OK
    * @param clientID Client ID access credentials; see description above for instructions on how to get the Client ID from the Azure Active Directory portal.
    * @param clientSecret Client Secret access credentials; see description above for instructions on how to get the Client Secret from the Azure Active Directory portal
    * @param sharepointDomainName SharePoint Online domain name, such as mydomain.sharepoint.com
    * @param siteID Site ID (GUID) of the SharePoint site you wish to retrieve the file from
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return CloudStorageAdvancedVirusScanResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public CloudStorageAdvancedVirusScanResult scanCloudStorageScanSharePointOnlineFileAdvanced(String clientID, String clientSecret, String sharepointDomainName, String siteID, Map<String, Object> params) throws IOException {
        HttpResponse response = scanCloudStorageScanSharePointOnlineFileAdvancedForHttpResponse(clientID, clientSecret, sharepointDomainName, siteID, params);
        TypeReference<CloudStorageAdvancedVirusScanResult> typeRef = new TypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse scanCloudStorageScanSharePointOnlineFileAdvancedForHttpResponse(String clientID, String clientSecret, String sharepointDomainName, String siteID, String tenantID, String filePath, String itemID, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, String restrictFileTypes) throws IOException {
        // verify the required parameter 'clientID' is set
        if (clientID == null) {
            throw new IllegalArgumentException("Missing the required parameter 'clientID' when calling scanCloudStorageScanSharePointOnlineFileAdvanced");
        }// verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new IllegalArgumentException("Missing the required parameter 'clientSecret' when calling scanCloudStorageScanSharePointOnlineFileAdvanced");
        }// verify the required parameter 'sharepointDomainName' is set
        if (sharepointDomainName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sharepointDomainName' when calling scanCloudStorageScanSharePointOnlineFileAdvanced");
        }// verify the required parameter 'siteID' is set
        if (siteID == null) {
            throw new IllegalArgumentException("Missing the required parameter 'siteID' when calling scanCloudStorageScanSharePointOnlineFileAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/virus/scan/cloud-storage/sharepoint-online/site/advanced");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse scanCloudStorageScanSharePointOnlineFileAdvancedForHttpResponse(String clientID, String clientSecret, String sharepointDomainName, String siteID, Map<String, Object> params) throws IOException {
        // verify the required parameter 'clientID' is set
        if (clientID == null) {
            throw new IllegalArgumentException("Missing the required parameter 'clientID' when calling scanCloudStorageScanSharePointOnlineFileAdvanced");
        }// verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new IllegalArgumentException("Missing the required parameter 'clientSecret' when calling scanCloudStorageScanSharePointOnlineFileAdvanced");
        }// verify the required parameter 'sharepointDomainName' is set
        if (sharepointDomainName == null) {
            throw new IllegalArgumentException("Missing the required parameter 'sharepointDomainName' when calling scanCloudStorageScanSharePointOnlineFileAdvanced");
        }// verify the required parameter 'siteID' is set
        if (siteID == null) {
            throw new IllegalArgumentException("Missing the required parameter 'siteID' when calling scanCloudStorageScanSharePointOnlineFileAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/virus/scan/cloud-storage/sharepoint-online/site/advanced");

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
