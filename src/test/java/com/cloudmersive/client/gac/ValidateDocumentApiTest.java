/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.model.AutodetectDocumentValidationResult;
import com.cloudmersive.client.gac.model.DocumentValidationResult;
import java.io.File;
import com.cloudmersive.client.gac.model.HtmlSsrfThreatCheckResult;
import com.cloudmersive.client.gac.model.XxeThreatDetectionResult;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ValidateDocumentApi
 */
@Ignore
public class ValidateDocumentApiTest {

    private final ValidateDocumentApi api = new ValidateDocumentApi();

    
    /**
     * Autodetect content type and validate
     *
     * Automatically detect the type of content, verify and validate that the content is indeed fully valid at depth, and then report the validation result.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentAutodetectValidationTest() throws IOException {
        File inputFile = null;
        AutodetectDocumentValidationResult response = api.validateDocumentAutodetectValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a CSV file document (CSV)
     *
     * Validate a CSV file document (CSV); if the document is not valid, identifies the errors in the document
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentCsvValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentCsvValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a Word 97-2003 Legacy document (DOC)
     *
     * Validate a Word 97-2003 Legacy document (DOC)
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentDocValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentDocValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a Word document (DOCX)
     *
     * Validate a Word document (DOCX); if the document is not valid, identifies the errors in the document
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentDocxValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentDocxValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate if an EML file is executable
     *
     * Validate if an input file is an EML email file; if the document is not valid
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentEmlValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentEmlValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate if a file is executable
     *
     * Validate if an input file is a binary executable file; if the document is not valid
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentExecutableValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentExecutableValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a GZip Archive file (gzip or gz)
     *
     * Validate a GZip archive file (GZIP or GZ)
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentGZipValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentGZipValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate an HTML file and checks for SSRF threats
     *
     * Validate an HTML document file and checks for SSRF (Server-side Request Forgery) threats in the file; if the document is not valid, identifies the errors in the document
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentHtmlSsrfValidationTest() throws IOException {
        File inputFile = null;
        HtmlSsrfThreatCheckResult response = api.validateDocumentHtmlSsrfValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate an HTML file
     *
     * Validate an HTML document file; if the document is not valid, identifies the errors in the document
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentHtmlValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentHtmlValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate an Image File
     *
     * Validate an image file; if the document is not valid, identifies the errors in the document.  Formats supported include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentImageValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentImageValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a JPG File
     *
     * Validate a JPEG image file; if the document is not valid, identifies the errors in the document..
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentJpgValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentJpgValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a JSON file
     *
     * Validate a JSON (JavaScript Object Notation) document file; if the document is not valid, identifies the errors in the document
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentJsonValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentJsonValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate if an MSG file is executable
     *
     * Validate if an input file is an MSG email file; if the document is not valid
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentMsgValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentMsgValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a PDF document file
     *
     * Validate a PDF document; if the document is not valid, identifies the errors in the document.  Also checks if the PDF is password protected.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentPdfValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentPdfValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a PNG File
     *
     * Validate a PNG image file; if the document is not valid, identifies the errors in the document.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentPngValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentPngValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
     *
     * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentPptValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentPptValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a PowerPoint presentation (PPTX)
     *
     * Validate a PowerPoint presentation (PPTX); if the document is not valid, identifies the errors in the document
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentPptxValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentPptxValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a RAR Archive file (RAR)
     *
     * Validate a RAR archive file (RAR)
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentRarValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentRarValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a Rich Text Format document (RTF)
     *
     * Validate a Rich Text Format document (RTF)
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentRtfValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentRtfValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a TAR Tarball Archive file (TAR)
     *
     * Validate a TAR tarball archive file (TAR)
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentTarValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentTarValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate an TXT file
     *
     * Validate an TXT document file; if the document is not valid, identifies the errors in the document
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentTxtValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentTxtValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
     *
     * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentXlsValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentXlsValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a Excel document (XLSX)
     *
     * Validate a Excel document (XLSX); if the document is not valid, identifies the errors in the document
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentXlsxValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentXlsxValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate an XML file
     *
     * Validate an XML document file; if the document is not valid, identifies the errors in the document
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentXmlValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentXmlValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate an XML file for XML External Entity (XXE) threats
     *
     * Validate an XML document file for XML External Entity (XXE) threats; if the document is not valid, identifies the errors in the document.  XXE threats are a type of threat that exploits vulnerabilities in the XML standard relating to external or local entity URIs in XML documents.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentXmlXxeThreatValidationTest() throws IOException {
        File inputFile = null;
        XxeThreatDetectionResult response = api.validateDocumentXmlXxeThreatValidation(inputFile);

        // TODO: test validations
    }
    
    /**
     * Validate a Zip Archive file (zip)
     *
     * Validate a Zip archive file (ZIP)
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void validateDocumentZipValidationTest() throws IOException {
        File inputFile = null;
        DocumentValidationResult response = api.validateDocumentZipValidation(inputFile);

        // TODO: test validations
    }
    
}