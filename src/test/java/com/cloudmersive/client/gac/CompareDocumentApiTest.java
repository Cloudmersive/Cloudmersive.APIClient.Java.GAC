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

import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CompareDocumentApi
 */
@Ignore
public class CompareDocumentApiTest {

    private final CompareDocumentApi api = new CompareDocumentApi();

    
    /**
     * Compare Two Word DOCX
     *
     * Compare two Office Word Documents (docx) files and highlight the differences
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void compareDocumentDocxTest() throws IOException {
        File inputFile1 = null;
        File inputFile2 = null;
        byte[] response = api.compareDocumentDocx(inputFile1, inputFile2);

        // TODO: test validations
    }
    
}