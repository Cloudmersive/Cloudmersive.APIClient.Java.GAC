/*
 * configapi
 * Config API lets you easily manage configuration at scale.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.model.CreateSettingRequest;
import com.cloudmersive.client.gac.model.CreateSettingResponse;
import com.cloudmersive.client.gac.model.ListSettingsRequest;
import com.cloudmersive.client.gac.model.ListSettingsResponse;
import com.cloudmersive.client.gac.model.UpdateSettingRequest;
import com.cloudmersive.client.gac.model.UpdateSettingResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SettingsApi
 */
@Ignore
public class SettingsApiTest {

    private final SettingsApi api = new SettingsApi();

    
    /**
     * Create a setting in the specified bucket
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void settingsCreateSettingTest() throws IOException {
        CreateSettingRequest request = null;
        CreateSettingResponse response = api.settingsCreateSetting(request);

        // TODO: test validations
    }
    
    /**
     * Enumerate the settings in a bucket
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void settingsListSettingsTest() throws IOException {
        ListSettingsRequest request = null;
        ListSettingsResponse response = api.settingsListSettings(request);

        // TODO: test validations
    }
    
    /**
     * Update a setting
     *
     * 
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void settingsUpdateSettingTest() throws IOException {
        UpdateSettingRequest request = null;
        UpdateSettingResponse response = api.settingsUpdateSetting(request);

        // TODO: test validations
    }
    
}