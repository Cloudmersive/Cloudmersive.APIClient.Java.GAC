/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.model.FirstNameValidationRequest;
import com.cloudmersive.client.gac.model.FirstNameValidationResponse;
import com.cloudmersive.client.gac.model.FullNameValidationRequest;
import com.cloudmersive.client.gac.model.FullNameValidationResponse;
import com.cloudmersive.client.gac.model.GetGenderRequest;
import com.cloudmersive.client.gac.model.GetGenderResponse;
import com.cloudmersive.client.gac.model.LastNameValidationRequest;
import com.cloudmersive.client.gac.model.LastNameValidationResponse;
import com.cloudmersive.client.gac.model.ValidateIdentifierRequest;
import com.cloudmersive.client.gac.model.ValidateIdentifierResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NameApi
 */
@Ignore
public class NameApiTest {

    private final NameApi api = new NameApi();

    
    /**
     * Get the gender of a first name
     *
     * Determines the gender of a first name (given name)
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void nameGetGenderTest() throws IOException {
        GetGenderRequest input = null;
        GetGenderResponse response = api.nameGetGender(input);

        // TODO: test validations
    }
    
    /**
     * Validate a code identifier
     *
     * Determines if the input name is a valid technical / code identifier.  Configure input rules such as whether whitespace, hyphens, underscores, etc. are allowed.  For example, a valid identifier might be \&quot;helloWorld\&quot; but not \&quot;hello*World\&quot;.
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void nameIdentifierTest() throws IOException {
        ValidateIdentifierRequest input = null;
        ValidateIdentifierResponse response = api.nameIdentifier(input);

        // TODO: test validations
    }
    
    /**
     * Validate a first name
     *
     * Determines if a string is a valid first name (given name)
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void nameValidateFirstNameTest() throws IOException {
        FirstNameValidationRequest input = null;
        FirstNameValidationResponse response = api.nameValidateFirstName(input);

        // TODO: test validations
    }
    
    /**
     * Parse and validate a full name
     *
     * Parses a full name string (e.g. \&quot;Mr. Jon van der Waal Jr.\&quot;) into its component parts (and returns these component parts), and then validates whether it is a valid name string or not
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void nameValidateFullNameTest() throws IOException {
        FullNameValidationRequest input = null;
        FullNameValidationResponse response = api.nameValidateFullName(input);

        // TODO: test validations
    }
    
    /**
     * Validate a last name
     *
     * Determines if a string is a valid last name (surname)
     *
     * @throws IOException
     *          if the Api call fails
     */
    @Test
    public void nameValidateLastNameTest() throws IOException {
        LastNameValidationRequest input = null;
        LastNameValidationResponse response = api.nameValidateLastName(input);

        // TODO: test validations
    }
    
}
