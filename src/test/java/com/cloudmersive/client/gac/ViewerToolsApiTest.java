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
import com.cloudmersive.client.gac.model.ViewerResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ViewerToolsApi
 */
@Ignore
public class ViewerToolsApiTest {

    private final ViewerToolsApi api = new ViewerToolsApi();

    
    /**
     * Create a web-based viewer
     *
     * Creates an HTML embed code for a simple web-based viewer of a document; supports Office document types and PDF.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void viewerToolsCreateSimpleTest() throws IOException {
        File inputFile = null;
        Integer width = null;
        Integer height = null;
        ViewerResponse response = api.viewerToolsCreateSimple(inputFile, width, height);

        // TODO: test validations
    }
    
}
