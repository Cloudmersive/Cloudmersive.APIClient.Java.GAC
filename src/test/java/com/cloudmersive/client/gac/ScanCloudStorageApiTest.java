/*
 * virusapi
 * The Cloudmersive Virus Scan API lets you scan files and content for viruses and identify security issues with content.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.model.CloudStorageAdvancedVirusScanResult;
import com.cloudmersive.client.gac.model.CloudStorageVirusScanResult;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScanCloudStorageApi
 */
@Ignore
public class ScanCloudStorageApiTest {

    private final ScanCloudStorageApi api = new ScanCloudStorageApi();

    
    /**
     * Scan an AWS S3 file for viruses
     *
     * Scan the contents of a single AWS S3 file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void scanCloudStorageScanAwsS3FileTest() throws IOException {
        String accessKey = null;
        String secretKey = null;
        String bucketRegion = null;
        String bucketName = null;
        String keyName = null;
        CloudStorageVirusScanResult response = api.scanCloudStorageScanAwsS3File(accessKey, secretKey, bucketRegion, bucketName, keyName);

        // TODO: test validations
    }
    
    /**
     * Advanced Scan an AWS S3 file for viruses
     *
     * Advanced Scan the contents of a single AWS S3 file and its content for viruses and threats. Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void scanCloudStorageScanAwsS3FileAdvancedTest() throws IOException {
        String accessKey = null;
        String secretKey = null;
        String bucketRegion = null;
        String bucketName = null;
        String keyName = null;
        Boolean allowExecutables = null;
        Boolean allowInvalidFiles = null;
        Boolean allowScripts = null;
        Boolean allowPasswordProtectedFiles = null;
        Boolean allowMacros = null;
        Boolean allowXmlExternalEntities = null;
        String restrictFileTypes = null;
        CloudStorageAdvancedVirusScanResult response = api.scanCloudStorageScanAwsS3FileAdvanced(accessKey, secretKey, bucketRegion, bucketName, keyName, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, restrictFileTypes);

        // TODO: test validations
    }
    
    /**
     * Scan an Azure Blob for viruses
     *
     * Scan the contents of a single Azure Blob and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void scanCloudStorageScanAzureBlobTest() throws IOException {
        String connectionString = null;
        String containerName = null;
        String blobPath = null;
        CloudStorageVirusScanResult response = api.scanCloudStorageScanAzureBlob(connectionString, containerName, blobPath);

        // TODO: test validations
    }
    
    /**
     * Advanced Scan an Azure Blob for viruses
     *
     * Advanced Scan the contents of a single Azure Blob and its content for viruses and threats.  Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void scanCloudStorageScanAzureBlobAdvancedTest() throws IOException {
        String connectionString = null;
        String containerName = null;
        String blobPath = null;
        Boolean allowExecutables = null;
        Boolean allowInvalidFiles = null;
        Boolean allowScripts = null;
        Boolean allowPasswordProtectedFiles = null;
        Boolean allowMacros = null;
        Boolean allowXmlExternalEntities = null;
        String restrictFileTypes = null;
        CloudStorageAdvancedVirusScanResult response = api.scanCloudStorageScanAzureBlobAdvanced(connectionString, containerName, blobPath, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, restrictFileTypes);

        // TODO: test validations
    }
    
    /**
     * Scan an Google Cloud Platform (GCP) Storage file for viruses
     *
     * Scan the contents of a single Google Cloud Platform (GCP) Storage file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void scanCloudStorageScanGcpStorageFileTest() throws IOException {
        String bucketName = null;
        String objectName = null;
        File jsonCredentialFile = null;
        CloudStorageVirusScanResult response = api.scanCloudStorageScanGcpStorageFile(bucketName, objectName, jsonCredentialFile);

        // TODO: test validations
    }
    
    /**
     * Advanced Scan an Google Cloud Platform (GCP) Storage file for viruses
     *
     * Advanced Scan the contents of a single Google Cloud Platform (GCP) Storage file and its content for viruses and threats. Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void scanCloudStorageScanGcpStorageFileAdvancedTest() throws IOException {
        String bucketName = null;
        String objectName = null;
        File jsonCredentialFile = null;
        Boolean allowExecutables = null;
        Boolean allowInvalidFiles = null;
        Boolean allowScripts = null;
        Boolean allowPasswordProtectedFiles = null;
        Boolean allowMacros = null;
        Boolean allowXmlExternalEntities = null;
        String restrictFileTypes = null;
        CloudStorageAdvancedVirusScanResult response = api.scanCloudStorageScanGcpStorageFileAdvanced(bucketName, objectName, jsonCredentialFile, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, restrictFileTypes);

        // TODO: test validations
    }
    
    /**
     * Virus Scan a file in a SharePoint Online Site Drive
     *
     * Virus Scan the contents of a single SharePoint Online Site Drive file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time. To get the Client ID and Client Secret, follow these steps: (1) Navigate to the Azure Portal and click on Azure Active Directory, (2) click on App Registrations on the left hand side, (3) click on Register Application, (4) Name the application CloudmersiveAntiVirus and click on Register, (5) Get the client ID by clicking on Overview and copying the value labeled Application (client) ID, (6) click on Certificates and Secrets, (7) click on New client secret, choose a longer expiration and give the secret a name, (8) copy the secret value to the clipboard and save it securely, this is your Client Secret, (9) Now we need to grant permissions to SharePOint; click on API Permissions on the left hand side, (10) click on Add a permission and choose Microsoft Graph, (11) click on Application Permissions, (12) search for Sites.FullControl.All, (13) Click on Add Permissions, (14) now navigate back to Azure Active Directory and click on Enterprise Applications, click on CloudmersiveAntiVirus and click on Permissions, and (15) click on Grant Admin Consent.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void scanCloudStorageScanSharePointOnlineFileTest() throws IOException {
        String clientID = null;
        String clientSecret = null;
        String sharepointDomainName = null;
        String siteID = null;
        String filePath = null;
        String tenantID = null;
        String itemID = null;
        CloudStorageVirusScanResult response = api.scanCloudStorageScanSharePointOnlineFile(clientID, clientSecret, sharepointDomainName, siteID, filePath, tenantID, itemID);

        // TODO: test validations
    }
    
    /**
     * Advanced Virus Scan a file in a SharePoint Online Site Drive
     *
     * Advanced Virus Scan the contents of a single SharePoint Online Site Drive file and its content for viruses and threats.  Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time. To get the Client ID and Client Secret, follow these steps: (1) Navigate to the Azure Portal and click on Azure Active Directory, (2) click on App Registrations on the left hand side, (3) click on Register Application, (4) Name the application CloudmersiveAntiVirus and click on Register, (5) Get the client ID by clicking on Overview and copying the value labeled Application (client) ID, (6) click on Certificates and Secrets, (7) click on New client secret, choose a longer expiration and give the secret a name, (8) copy the secret value to the clipboard and save it securely, this is your Client Secret, (9) Now we need to grant permissions to SharePOint; click on API Permissions on the left hand side, (10) click on Add a permission and choose Microsoft Graph, (11) click on Application Permissions, (12) search for Sites.FullControl.All, (13) Click on Add Permissions, (14) now navigate back to Azure Active Directory and click on Enterprise Applications, click on CloudmersiveAntiVirus and click on Permissions, and (15) click on Grant Admin Consent.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void scanCloudStorageScanSharePointOnlineFileAdvancedTest() throws IOException {
        String clientID = null;
        String clientSecret = null;
        String sharepointDomainName = null;
        String siteID = null;
        String tenantID = null;
        String filePath = null;
        String itemID = null;
        Boolean allowExecutables = null;
        Boolean allowInvalidFiles = null;
        Boolean allowScripts = null;
        Boolean allowPasswordProtectedFiles = null;
        Boolean allowMacros = null;
        Boolean allowXmlExternalEntities = null;
        String restrictFileTypes = null;
        CloudStorageAdvancedVirusScanResult response = api.scanCloudStorageScanSharePointOnlineFileAdvanced(clientID, clientSecret, sharepointDomainName, siteID, tenantID, filePath, itemID, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, restrictFileTypes);

        // TODO: test validations
    }
    
}
