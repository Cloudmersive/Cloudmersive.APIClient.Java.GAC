package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.BusinessCardRecognitionResult;
import java.io.File;
import com.cloudmersive.client.gac.model.FormRecognitionResult;
import com.cloudmersive.client.gac.model.ImageToLinesWithLocationResult;
import com.cloudmersive.client.gac.model.ImageToTextResponse;
import com.cloudmersive.client.gac.model.ImageToWordsWithLocationResult;
import com.cloudmersive.client.gac.model.PhotoToWordsWithLocationResult;
import com.cloudmersive.client.gac.model.ReceiptRecognitionResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:56:49.154-07:00[America/Los_Angeles]")
public class ImageOcrApi {
    private ApiClient apiClient;

    public ImageOcrApi() {
        this(new ApiClient());
    }

    public ImageOcrApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

  /**
    * Convert a scanned image into words with location
    * Converts an uploaded image in common formats such as JPEG, PNG into lines/text with location information and other metdata via Optical Character Recognition.  This API is intended to be run on scanned documents.  If you want to OCR photos (e.g. taken with a smart phone camera), be sure to use the photo/toText API instead, as it is designed to unskew the image first.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param language Optional, language of the input document, default is English (ENG).  Possible values are ENG (English), ARA (Arabic), ZHO (Chinese - Simplified), ZHO-HANT (Chinese - Traditional), ASM (Assamese), AFR (Afrikaans), AMH (Amharic), AZE (Azerbaijani), AZE-CYRL (Azerbaijani - Cyrillic), BEL (Belarusian), BEN (Bengali), BOD (Tibetan), BOS (Bosnian), BUL (Bulgarian), CAT (Catalan; Valencian), CEB (Cebuano), CES (Czech), CHR (Cherokee), CYM (Welsh), DAN (Danish), DEU (German), DZO (Dzongkha), ELL (Greek), ENM (Archaic/Middle English), EPO (Esperanto), EST (Estonian), EUS (Basque), FAS (Persian), FIN (Finnish), FRA (French), FRK (Frankish), FRM (Middle-French), GLE (Irish), GLG (Galician), GRC (Ancient Greek), HAT (Hatian), HEB (Hebrew), HIN (Hindi), HRV (Croatian), HUN (Hungarian), IKU (Inuktitut), IND (Indonesian), ISL (Icelandic), ITA (Italian), ITA-OLD (Old - Italian), JAV (Javanese), JPN (Japanese), KAN (Kannada), KAT (Georgian), KAT-OLD (Old-Georgian), KAZ (Kazakh), KHM (Central Khmer), KIR (Kirghiz), KOR (Korean), KUR (Kurdish), LAO (Lao), LAT (Latin), LAV (Latvian), LIT (Lithuanian), MAL (Malayalam), MAR (Marathi), MKD (Macedonian), MLT (Maltese), MSA (Malay), MYA (Burmese), NEP (Nepali), NLD (Dutch), NOR (Norwegian), ORI (Oriya), PAN (Panjabi), POL (Polish), POR (Portuguese), PUS (Pushto), RON (Romanian), RUS (Russian), SAN (Sanskrit), SIN (Sinhala), SLK (Slovak), SLV (Slovenian), SPA (Spanish), SPA-OLD (Old Spanish), SQI (Albanian), SRP (Serbian), SRP-LAT (Latin Serbian), SWA (Swahili), SWE (Swedish), SYR (Syriac), TAM (Tamil), TEL (Telugu), TGK (Tajik), TGL (Tagalog), THA (Thai), TIR (Tigrinya), TUR (Turkish), UIG (Uighur), UKR (Ukrainian), URD (Urdu), UZB (Uzbek), UZB-CYR (Cyrillic Uzbek), VIE (Vietnamese), YID (Yiddish)
    * @param preprocessing Optional, preprocessing mode, default is &#39;Auto&#39;.  Possible values are None (no preprocessing of the image), and Auto (automatic image enhancement of the image before OCR is applied; this is recommended).
    * @return ImageToLinesWithLocationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImageToLinesWithLocationResult imageOcrImageLinesWithLocation(File imageFile, String language, String preprocessing) throws IOException {
        HttpResponse response = imageOcrImageLinesWithLocationForHttpResponse(imageFile, language, preprocessing);
        TypeReference<ImageToLinesWithLocationResult> typeRef = new TypeReference<ImageToLinesWithLocationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert a scanned image into words with location
    * Converts an uploaded image in common formats such as JPEG, PNG into lines/text with location information and other metdata via Optical Character Recognition.  This API is intended to be run on scanned documents.  If you want to OCR photos (e.g. taken with a smart phone camera), be sure to use the photo/toText API instead, as it is designed to unskew the image first.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ImageToLinesWithLocationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImageToLinesWithLocationResult imageOcrImageLinesWithLocation(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = imageOcrImageLinesWithLocationForHttpResponse(imageFile, params);
        TypeReference<ImageToLinesWithLocationResult> typeRef = new TypeReference<ImageToLinesWithLocationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse imageOcrImageLinesWithLocationForHttpResponse(File imageFile, String language, String preprocessing) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrImageLinesWithLocation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/image/to/lines-with-location");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse imageOcrImageLinesWithLocationForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrImageLinesWithLocation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/image/to/lines-with-location");

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
    * Convert a scanned image into words with location
    * Converts an uploaded image in common formats such as JPEG, PNG into words/text with location information and other metdata via Optical Character Recognition.  This API is intended to be run on scanned documents.  If you want to OCR photos (e.g. taken with a smart phone camera), be sure to use the photo/toText API instead, as it is designed to unskew the image first.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param language Optional, language of the input document, default is English (ENG).  Possible values are ENG (English), ARA (Arabic), ZHO (Chinese - Simplified), ZHO-HANT (Chinese - Traditional), ASM (Assamese), AFR (Afrikaans), AMH (Amharic), AZE (Azerbaijani), AZE-CYRL (Azerbaijani - Cyrillic), BEL (Belarusian), BEN (Bengali), BOD (Tibetan), BOS (Bosnian), BUL (Bulgarian), CAT (Catalan; Valencian), CEB (Cebuano), CES (Czech), CHR (Cherokee), CYM (Welsh), DAN (Danish), DEU (German), DZO (Dzongkha), ELL (Greek), ENM (Archaic/Middle English), EPO (Esperanto), EST (Estonian), EUS (Basque), FAS (Persian), FIN (Finnish), FRA (French), FRK (Frankish), FRM (Middle-French), GLE (Irish), GLG (Galician), GRC (Ancient Greek), HAT (Hatian), HEB (Hebrew), HIN (Hindi), HRV (Croatian), HUN (Hungarian), IKU (Inuktitut), IND (Indonesian), ISL (Icelandic), ITA (Italian), ITA-OLD (Old - Italian), JAV (Javanese), JPN (Japanese), KAN (Kannada), KAT (Georgian), KAT-OLD (Old-Georgian), KAZ (Kazakh), KHM (Central Khmer), KIR (Kirghiz), KOR (Korean), KUR (Kurdish), LAO (Lao), LAT (Latin), LAV (Latvian), LIT (Lithuanian), MAL (Malayalam), MAR (Marathi), MKD (Macedonian), MLT (Maltese), MSA (Malay), MYA (Burmese), NEP (Nepali), NLD (Dutch), NOR (Norwegian), ORI (Oriya), PAN (Panjabi), POL (Polish), POR (Portuguese), PUS (Pushto), RON (Romanian), RUS (Russian), SAN (Sanskrit), SIN (Sinhala), SLK (Slovak), SLV (Slovenian), SPA (Spanish), SPA-OLD (Old Spanish), SQI (Albanian), SRP (Serbian), SRP-LAT (Latin Serbian), SWA (Swahili), SWE (Swedish), SYR (Syriac), TAM (Tamil), TEL (Telugu), TGK (Tajik), TGL (Tagalog), THA (Thai), TIR (Tigrinya), TUR (Turkish), UIG (Uighur), UKR (Ukrainian), URD (Urdu), UZB (Uzbek), UZB-CYR (Cyrillic Uzbek), VIE (Vietnamese), YID (Yiddish)
    * @param preprocessing Optional, preprocessing mode, default is &#39;Auto&#39;.  Possible values are None (no preprocessing of the image), and Auto (automatic image enhancement of the image before OCR is applied; this is recommended).
    * @return ImageToWordsWithLocationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImageToWordsWithLocationResult imageOcrImageWordsWithLocation(File imageFile, String language, String preprocessing) throws IOException {
        HttpResponse response = imageOcrImageWordsWithLocationForHttpResponse(imageFile, language, preprocessing);
        TypeReference<ImageToWordsWithLocationResult> typeRef = new TypeReference<ImageToWordsWithLocationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert a scanned image into words with location
    * Converts an uploaded image in common formats such as JPEG, PNG into words/text with location information and other metdata via Optical Character Recognition.  This API is intended to be run on scanned documents.  If you want to OCR photos (e.g. taken with a smart phone camera), be sure to use the photo/toText API instead, as it is designed to unskew the image first.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ImageToWordsWithLocationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImageToWordsWithLocationResult imageOcrImageWordsWithLocation(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = imageOcrImageWordsWithLocationForHttpResponse(imageFile, params);
        TypeReference<ImageToWordsWithLocationResult> typeRef = new TypeReference<ImageToWordsWithLocationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse imageOcrImageWordsWithLocationForHttpResponse(File imageFile, String language, String preprocessing) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrImageWordsWithLocation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/image/to/words-with-location");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse imageOcrImageWordsWithLocationForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrImageWordsWithLocation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/image/to/words-with-location");

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
    * Recognize a photo of a business card, extract key business information
    * Analyzes a photograph of a business card as input, and outputs key business information such as the name of the person, name of the business, the address of the business, the phone number, the email address and more.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @return BusinessCardRecognitionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public BusinessCardRecognitionResult imageOcrPhotoRecognizeBusinessCard(File imageFile) throws IOException {
        HttpResponse response = imageOcrPhotoRecognizeBusinessCardForHttpResponse(imageFile);
        TypeReference<BusinessCardRecognitionResult> typeRef = new TypeReference<BusinessCardRecognitionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Recognize a photo of a business card, extract key business information
    * Analyzes a photograph of a business card as input, and outputs key business information such as the name of the person, name of the business, the address of the business, the phone number, the email address and more.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return BusinessCardRecognitionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public BusinessCardRecognitionResult imageOcrPhotoRecognizeBusinessCard(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = imageOcrPhotoRecognizeBusinessCardForHttpResponse(imageFile, params);
        TypeReference<BusinessCardRecognitionResult> typeRef = new TypeReference<BusinessCardRecognitionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse imageOcrPhotoRecognizeBusinessCardForHttpResponse(File imageFile) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrPhotoRecognizeBusinessCard");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/photo/recognize/business-card");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse imageOcrPhotoRecognizeBusinessCardForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrPhotoRecognizeBusinessCard");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/photo/recognize/business-card");

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
    * Recognize a photo of a form, extract key fields and business information
    * Analyzes a photograph of a form as input, and outputs key business fields and information.  Customzie data to be extracted by defining fields for the form.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param formTemplateDefinition Form field definitions
    * @param recognitionMode Optional, enable advanced recognition mode by specifying &#39;Advanced&#39;, enable handwriting recognition by specifying &#39;EnableHandwriting&#39;.  Default is disabled.
    * @param preprocessing Optional, preprocessing mode, default is &#39;Auto&#39;.  Possible values are None (no preprocessing of the image), and Auto (automatic image enhancement of the image - including automatic unrotation of the image - before OCR is applied; this is recommended).  Set this to &#39;None&#39; if you do not want to use automatic image unrotation and enhancement.
    * @param diagnostics Optional, diagnostics mode, default is &#39;false&#39;.  Possible values are &#39;true&#39; (will set DiagnosticImage to a diagnostic PNG image in the result), and &#39;false&#39; (no diagnostics are enabled; this is recommended for best performance).
    * @param language Optional, language of the input document, default is English (ENG).  Possible values are ENG (English), ARA (Arabic), ZHO (Chinese - Simplified), ZHO-HANT (Chinese - Traditional), ASM (Assamese), AFR (Afrikaans), AMH (Amharic), AZE (Azerbaijani), AZE-CYRL (Azerbaijani - Cyrillic), BEL (Belarusian), BEN (Bengali), BOD (Tibetan), BOS (Bosnian), BUL (Bulgarian), CAT (Catalan; Valencian), CEB (Cebuano), CES (Czech), CHR (Cherokee), CYM (Welsh), DAN (Danish), DEU (German), DZO (Dzongkha), ELL (Greek), ENM (Archaic/Middle English), EPO (Esperanto), EST (Estonian), EUS (Basque), FAS (Persian), FIN (Finnish), FRA (French), FRK (Frankish), FRM (Middle-French), GLE (Irish), GLG (Galician), GRC (Ancient Greek), HAT (Hatian), HEB (Hebrew), HIN (Hindi), HRV (Croatian), HUN (Hungarian), IKU (Inuktitut), IND (Indonesian), ISL (Icelandic), ITA (Italian), ITA-OLD (Old - Italian), JAV (Javanese), JPN (Japanese), KAN (Kannada), KAT (Georgian), KAT-OLD (Old-Georgian), KAZ (Kazakh), KHM (Central Khmer), KIR (Kirghiz), KOR (Korean), KUR (Kurdish), LAO (Lao), LAT (Latin), LAV (Latvian), LIT (Lithuanian), MAL (Malayalam), MAR (Marathi), MKD (Macedonian), MLT (Maltese), MSA (Malay), MYA (Burmese), NEP (Nepali), NLD (Dutch), NOR (Norwegian), ORI (Oriya), PAN (Panjabi), POL (Polish), POR (Portuguese), PUS (Pushto), RON (Romanian), RUS (Russian), SAN (Sanskrit), SIN (Sinhala), SLK (Slovak), SLV (Slovenian), SPA (Spanish), SPA-OLD (Old Spanish), SQI (Albanian), SRP (Serbian), SRP-LAT (Latin Serbian), SWA (Swahili), SWE (Swedish), SYR (Syriac), TAM (Tamil), TEL (Telugu), TGK (Tajik), TGL (Tagalog), THA (Thai), TIR (Tigrinya), TUR (Turkish), UIG (Uighur), UKR (Ukrainian), URD (Urdu), UZB (Uzbek), UZB-CYR (Cyrillic Uzbek), VIE (Vietnamese), YID (Yiddish)
    * @return FormRecognitionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FormRecognitionResult imageOcrPhotoRecognizeForm(File imageFile, Object formTemplateDefinition, String recognitionMode, String preprocessing, String diagnostics, String language) throws IOException {
        HttpResponse response = imageOcrPhotoRecognizeFormForHttpResponse(imageFile, formTemplateDefinition, recognitionMode, preprocessing, diagnostics, language);
        TypeReference<FormRecognitionResult> typeRef = new TypeReference<FormRecognitionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Recognize a photo of a form, extract key fields and business information
    * Analyzes a photograph of a form as input, and outputs key business fields and information.  Customzie data to be extracted by defining fields for the form.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FormRecognitionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FormRecognitionResult imageOcrPhotoRecognizeForm(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = imageOcrPhotoRecognizeFormForHttpResponse(imageFile, params);
        TypeReference<FormRecognitionResult> typeRef = new TypeReference<FormRecognitionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse imageOcrPhotoRecognizeFormForHttpResponse(File imageFile, Object formTemplateDefinition, String recognitionMode, String preprocessing, String diagnostics, String language) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrPhotoRecognizeForm");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/photo/recognize/form");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse imageOcrPhotoRecognizeFormForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrPhotoRecognizeForm");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/photo/recognize/form");

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
    * Recognize a photo of a form, extract key fields using stored templates
    * Analyzes a photograph of a form as input, and outputs key business fields and information.  Customzie data to be extracted by defining fields for the form.  Uses template definitions stored in Cloudmersive Configuration; to configure stored templates in a configuration bucket, log into Cloudmersive Management Portal and navigate to Settings &amp;gt; API Configuration &amp;gt; Create Bucket.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param bucketID Bucket ID of the Configuration Bucket storing the form templates
    * @param bucketSecretKey Bucket Secret Key of the Configuration Bucket storing the form templates
    * @param recognitionMode Optional, enable advanced recognition mode by specifying &#39;Advanced&#39;, enable handwriting recognition by specifying &#39;EnableHandwriting&#39;.  Default is disabled.
    * @param preprocessing Optional, preprocessing mode, default is &#39;Auto&#39;.  Possible values are None (no preprocessing of the image), and Auto (automatic image enhancement of the image - including automatic unrotation of the image - before OCR is applied; this is recommended).  Set this to &#39;None&#39; if you do not want to use automatic image unrotation and enhancement.
    * @param diagnostics Optional, diagnostics mode, default is &#39;false&#39;.  Possible values are &#39;true&#39; (will set DiagnosticImage to a diagnostic PNG image in the result), and &#39;false&#39; (no diagnostics are enabled; this is recommended for best performance).
    * @return FormRecognitionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FormRecognitionResult imageOcrPhotoRecognizeFormAdvanced(File imageFile, String bucketID, String bucketSecretKey, String recognitionMode, String preprocessing, String diagnostics) throws IOException {
        HttpResponse response = imageOcrPhotoRecognizeFormAdvancedForHttpResponse(imageFile, bucketID, bucketSecretKey, recognitionMode, preprocessing, diagnostics);
        TypeReference<FormRecognitionResult> typeRef = new TypeReference<FormRecognitionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Recognize a photo of a form, extract key fields using stored templates
    * Analyzes a photograph of a form as input, and outputs key business fields and information.  Customzie data to be extracted by defining fields for the form.  Uses template definitions stored in Cloudmersive Configuration; to configure stored templates in a configuration bucket, log into Cloudmersive Management Portal and navigate to Settings &amp;gt; API Configuration &amp;gt; Create Bucket.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return FormRecognitionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public FormRecognitionResult imageOcrPhotoRecognizeFormAdvanced(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = imageOcrPhotoRecognizeFormAdvancedForHttpResponse(imageFile, params);
        TypeReference<FormRecognitionResult> typeRef = new TypeReference<FormRecognitionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse imageOcrPhotoRecognizeFormAdvancedForHttpResponse(File imageFile, String bucketID, String bucketSecretKey, String recognitionMode, String preprocessing, String diagnostics) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrPhotoRecognizeFormAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/photo/recognize/form/advanced");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse imageOcrPhotoRecognizeFormAdvancedForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrPhotoRecognizeFormAdvanced");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/photo/recognize/form/advanced");

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
    * Recognize a photo of a receipt, extract key business information
    * Analyzes a photograph of a receipt as input, and outputs key business information such as the name of the business, the address of the business, the phone number of the business, the total of the receipt, the date of the receipt, and more.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param recognitionMode Optional, enable advanced recognition mode by specifying &#39;Advanced&#39;, enable handwriting recognition by specifying &#39;EnableHandwriting&#39;.  Default is disabled.
    * @param language Optional, language of the input document, default is English (ENG).  Possible values are ENG (English), ARA (Arabic), ZHO (Chinese - Simplified), ZHO-HANT (Chinese - Traditional), ASM (Assamese), AFR (Afrikaans), AMH (Amharic), AZE (Azerbaijani), AZE-CYRL (Azerbaijani - Cyrillic), BEL (Belarusian), BEN (Bengali), BOD (Tibetan), BOS (Bosnian), BUL (Bulgarian), CAT (Catalan; Valencian), CEB (Cebuano), CES (Czech), CHR (Cherokee), CYM (Welsh), DAN (Danish), DEU (German), DZO (Dzongkha), ELL (Greek), ENM (Archaic/Middle English), EPO (Esperanto), EST (Estonian), EUS (Basque), FAS (Persian), FIN (Finnish), FRA (French), FRK (Frankish), FRM (Middle-French), GLE (Irish), GLG (Galician), GRC (Ancient Greek), HAT (Hatian), HEB (Hebrew), HIN (Hindi), HRV (Croatian), HUN (Hungarian), IKU (Inuktitut), IND (Indonesian), ISL (Icelandic), ITA (Italian), ITA-OLD (Old - Italian), JAV (Javanese), JPN (Japanese), KAN (Kannada), KAT (Georgian), KAT-OLD (Old-Georgian), KAZ (Kazakh), KHM (Central Khmer), KIR (Kirghiz), KOR (Korean), KUR (Kurdish), LAO (Lao), LAT (Latin), LAV (Latvian), LIT (Lithuanian), MAL (Malayalam), MAR (Marathi), MKD (Macedonian), MLT (Maltese), MSA (Malay), MYA (Burmese), NEP (Nepali), NLD (Dutch), NOR (Norwegian), ORI (Oriya), PAN (Panjabi), POL (Polish), POR (Portuguese), PUS (Pushto), RON (Romanian), RUS (Russian), SAN (Sanskrit), SIN (Sinhala), SLK (Slovak), SLV (Slovenian), SPA (Spanish), SPA-OLD (Old Spanish), SQI (Albanian), SRP (Serbian), SRP-LAT (Latin Serbian), SWA (Swahili), SWE (Swedish), SYR (Syriac), TAM (Tamil), TEL (Telugu), TGK (Tajik), TGL (Tagalog), THA (Thai), TIR (Tigrinya), TUR (Turkish), UIG (Uighur), UKR (Ukrainian), URD (Urdu), UZB (Uzbek), UZB-CYR (Cyrillic Uzbek), VIE (Vietnamese), YID (Yiddish)
    * @param preprocessing Optional, preprocessing mode, default is &#39;None&#39;.  Possible values are None (no preprocessing of the image), and &#39;Advanced&#39; (automatic image enhancement of the image before OCR is applied; this is recommended and needed to handle rotated receipts).
    * @return ReceiptRecognitionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReceiptRecognitionResult imageOcrPhotoRecognizeReceipt(File imageFile, String recognitionMode, String language, String preprocessing) throws IOException {
        HttpResponse response = imageOcrPhotoRecognizeReceiptForHttpResponse(imageFile, recognitionMode, language, preprocessing);
        TypeReference<ReceiptRecognitionResult> typeRef = new TypeReference<ReceiptRecognitionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Recognize a photo of a receipt, extract key business information
    * Analyzes a photograph of a receipt as input, and outputs key business information such as the name of the business, the address of the business, the phone number of the business, the total of the receipt, the date of the receipt, and more.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ReceiptRecognitionResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ReceiptRecognitionResult imageOcrPhotoRecognizeReceipt(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = imageOcrPhotoRecognizeReceiptForHttpResponse(imageFile, params);
        TypeReference<ReceiptRecognitionResult> typeRef = new TypeReference<ReceiptRecognitionResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse imageOcrPhotoRecognizeReceiptForHttpResponse(File imageFile, String recognitionMode, String language, String preprocessing) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrPhotoRecognizeReceipt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/photo/recognize/receipt");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse imageOcrPhotoRecognizeReceiptForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrPhotoRecognizeReceipt");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/photo/recognize/receipt");

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
    * Convert a photo of a document into text
    * Converts an uploaded photo of a document in common formats such as JPEG, PNG into text via Optical Character Recognition.  This API is intended to be run on photos of documents, e.g. taken with a smartphone and supports cases where other content, such as a desk, are in the frame and the camera is crooked.  If you want to OCR a scanned image, use the image/toText API call instead as it is designed for scanned images.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param recognitionMode Optional; possible values are &#39;Basic&#39; which provides basic recognition and is not resillient to page rotation, skew or low quality images uses 1-2 API calls; &#39;Normal&#39; which provides highly fault tolerant OCR recognition uses 26-30 API calls; and &#39;Advanced&#39; which provides the highest quality and most fault-tolerant recognition uses 28-30 API calls.  Default recognition mode is &#39;Advanced&#39;
    * @param language Optional, language of the input document, default is English (ENG).  Possible values are ENG (English), ARA (Arabic), ZHO (Chinese - Simplified), ZHO-HANT (Chinese - Traditional), ASM (Assamese), AFR (Afrikaans), AMH (Amharic), AZE (Azerbaijani), AZE-CYRL (Azerbaijani - Cyrillic), BEL (Belarusian), BEN (Bengali), BOD (Tibetan), BOS (Bosnian), BUL (Bulgarian), CAT (Catalan; Valencian), CEB (Cebuano), CES (Czech), CHR (Cherokee), CYM (Welsh), DAN (Danish), DEU (German), DZO (Dzongkha), ELL (Greek), ENM (Archaic/Middle English), EPO (Esperanto), EST (Estonian), EUS (Basque), FAS (Persian), FIN (Finnish), FRA (French), FRK (Frankish), FRM (Middle-French), GLE (Irish), GLG (Galician), GRC (Ancient Greek), HAT (Hatian), HEB (Hebrew), HIN (Hindi), HRV (Croatian), HUN (Hungarian), IKU (Inuktitut), IND (Indonesian), ISL (Icelandic), ITA (Italian), ITA-OLD (Old - Italian), JAV (Javanese), JPN (Japanese), KAN (Kannada), KAT (Georgian), KAT-OLD (Old-Georgian), KAZ (Kazakh), KHM (Central Khmer), KIR (Kirghiz), KOR (Korean), KUR (Kurdish), LAO (Lao), LAT (Latin), LAV (Latvian), LIT (Lithuanian), MAL (Malayalam), MAR (Marathi), MKD (Macedonian), MLT (Maltese), MSA (Malay), MYA (Burmese), NEP (Nepali), NLD (Dutch), NOR (Norwegian), ORI (Oriya), PAN (Panjabi), POL (Polish), POR (Portuguese), PUS (Pushto), RON (Romanian), RUS (Russian), SAN (Sanskrit), SIN (Sinhala), SLK (Slovak), SLV (Slovenian), SPA (Spanish), SPA-OLD (Old Spanish), SQI (Albanian), SRP (Serbian), SRP-LAT (Latin Serbian), SWA (Swahili), SWE (Swedish), SYR (Syriac), TAM (Tamil), TEL (Telugu), TGK (Tajik), TGL (Tagalog), THA (Thai), TIR (Tigrinya), TUR (Turkish), UIG (Uighur), UKR (Ukrainian), URD (Urdu), UZB (Uzbek), UZB-CYR (Cyrillic Uzbek), VIE (Vietnamese), YID (Yiddish)
    * @return ImageToTextResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImageToTextResponse imageOcrPhotoToText(File imageFile, String recognitionMode, String language) throws IOException {
        HttpResponse response = imageOcrPhotoToTextForHttpResponse(imageFile, recognitionMode, language);
        TypeReference<ImageToTextResponse> typeRef = new TypeReference<ImageToTextResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert a photo of a document into text
    * Converts an uploaded photo of a document in common formats such as JPEG, PNG into text via Optical Character Recognition.  This API is intended to be run on photos of documents, e.g. taken with a smartphone and supports cases where other content, such as a desk, are in the frame and the camera is crooked.  If you want to OCR a scanned image, use the image/toText API call instead as it is designed for scanned images.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ImageToTextResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImageToTextResponse imageOcrPhotoToText(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = imageOcrPhotoToTextForHttpResponse(imageFile, params);
        TypeReference<ImageToTextResponse> typeRef = new TypeReference<ImageToTextResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse imageOcrPhotoToTextForHttpResponse(File imageFile, String recognitionMode, String language) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrPhotoToText");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/photo/toText");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse imageOcrPhotoToTextForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrPhotoToText");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/photo/toText");

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
    * Convert a photo of a document or receipt into words with location
    * Converts a photo of a document or receipt in common formats such as JPEG, PNG into words/text with location information and other metdata via Optical Character Recognition.  This API is intended to be run on photographs of documents.  If you want to OCR scanned documents (e.g. taken with a scanner), be sure to use the image/toText API instead, as it is designed for that use case.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param recognitionMode Optional; possible values are &#39;Normal&#39; which provides highly fault tolerant OCR recognition uses 26-30 API calls; and &#39;Advanced&#39; which provides the highest quality and most fault-tolerant recognition uses 28-30 API calls.  Default recognition mode is &#39;Advanced&#39;
    * @param language Optional, language of the input document, default is English (ENG).  Possible values are ENG (English), ARA (Arabic), ZHO (Chinese - Simplified), ZHO-HANT (Chinese - Traditional), ASM (Assamese), AFR (Afrikaans), AMH (Amharic), AZE (Azerbaijani), AZE-CYRL (Azerbaijani - Cyrillic), BEL (Belarusian), BEN (Bengali), BOD (Tibetan), BOS (Bosnian), BUL (Bulgarian), CAT (Catalan; Valencian), CEB (Cebuano), CES (Czech), CHR (Cherokee), CYM (Welsh), DAN (Danish), DEU (German), DZO (Dzongkha), ELL (Greek), ENM (Archaic/Middle English), EPO (Esperanto), EST (Estonian), EUS (Basque), FAS (Persian), FIN (Finnish), FRA (French), FRK (Frankish), FRM (Middle-French), GLE (Irish), GLG (Galician), GRC (Ancient Greek), HAT (Hatian), HEB (Hebrew), HIN (Hindi), HRV (Croatian), HUN (Hungarian), IKU (Inuktitut), IND (Indonesian), ISL (Icelandic), ITA (Italian), ITA-OLD (Old - Italian), JAV (Javanese), JPN (Japanese), KAN (Kannada), KAT (Georgian), KAT-OLD (Old-Georgian), KAZ (Kazakh), KHM (Central Khmer), KIR (Kirghiz), KOR (Korean), KUR (Kurdish), LAO (Lao), LAT (Latin), LAV (Latvian), LIT (Lithuanian), MAL (Malayalam), MAR (Marathi), MKD (Macedonian), MLT (Maltese), MSA (Malay), MYA (Burmese), NEP (Nepali), NLD (Dutch), NOR (Norwegian), ORI (Oriya), PAN (Panjabi), POL (Polish), POR (Portuguese), PUS (Pushto), RON (Romanian), RUS (Russian), SAN (Sanskrit), SIN (Sinhala), SLK (Slovak), SLV (Slovenian), SPA (Spanish), SPA-OLD (Old Spanish), SQI (Albanian), SRP (Serbian), SRP-LAT (Latin Serbian), SWA (Swahili), SWE (Swedish), SYR (Syriac), TAM (Tamil), TEL (Telugu), TGK (Tajik), TGL (Tagalog), THA (Thai), TIR (Tigrinya), TUR (Turkish), UIG (Uighur), UKR (Ukrainian), URD (Urdu), UZB (Uzbek), UZB-CYR (Cyrillic Uzbek), VIE (Vietnamese), YID (Yiddish)
    * @param preprocessing Optional, preprocessing mode, default is &#39;Auto&#39;.  Possible values are None (no preprocessing of the image), and Auto (automatic image enhancement of the image before OCR is applied; this is recommended).
    * @param diagnostics Optional, diagnostics mode, default is &#39;false&#39;.  Possible values are &#39;true&#39; (will set DiagnosticImage to a diagnostic PNG image in the result), and &#39;false&#39; (no diagnostics are enabled; this is recommended for best performance).
    * @return PhotoToWordsWithLocationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PhotoToWordsWithLocationResult imageOcrPhotoWordsWithLocation(File imageFile, String recognitionMode, String language, String preprocessing, String diagnostics) throws IOException {
        HttpResponse response = imageOcrPhotoWordsWithLocationForHttpResponse(imageFile, recognitionMode, language, preprocessing, diagnostics);
        TypeReference<PhotoToWordsWithLocationResult> typeRef = new TypeReference<PhotoToWordsWithLocationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert a photo of a document or receipt into words with location
    * Converts a photo of a document or receipt in common formats such as JPEG, PNG into words/text with location information and other metdata via Optical Character Recognition.  This API is intended to be run on photographs of documents.  If you want to OCR scanned documents (e.g. taken with a scanner), be sure to use the image/toText API instead, as it is designed for that use case.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return PhotoToWordsWithLocationResult
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public PhotoToWordsWithLocationResult imageOcrPhotoWordsWithLocation(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = imageOcrPhotoWordsWithLocationForHttpResponse(imageFile, params);
        TypeReference<PhotoToWordsWithLocationResult> typeRef = new TypeReference<PhotoToWordsWithLocationResult>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse imageOcrPhotoWordsWithLocationForHttpResponse(File imageFile, String recognitionMode, String language, String preprocessing, String diagnostics) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrPhotoWordsWithLocation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/photo/to/words-with-location");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse imageOcrPhotoWordsWithLocationForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrPhotoWordsWithLocation");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/photo/to/words-with-location");

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
    * Convert a scanned image into text
    * Converts an uploaded image in common formats such as JPEG, PNG into text via Optical Character Recognition.  This API is intended to be run on scanned documents.  If you want to OCR photos (e.g. taken with a smart phone camera), be sure to use the photo/toText API instead, as it is designed to unskew the image first.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param recognitionMode Optional; possible values are &#39;Basic&#39; which provides basic recognition and is not resillient to page rotation, skew or low quality images uses 1-2 API calls; &#39;Normal&#39; which provides highly fault tolerant OCR recognition uses 26-30 API calls; and &#39;Advanced&#39; which provides the highest quality and most fault-tolerant recognition uses 28-30 API calls.  Default recognition mode is &#39;Advanced&#39;
    * @param language Optional, language of the input document, default is English (ENG).  Possible values are ENG (English), ARA (Arabic), ZHO (Chinese - Simplified), ZHO-HANT (Chinese - Traditional), ASM (Assamese), AFR (Afrikaans), AMH (Amharic), AZE (Azerbaijani), AZE-CYRL (Azerbaijani - Cyrillic), BEL (Belarusian), BEN (Bengali), BOD (Tibetan), BOS (Bosnian), BUL (Bulgarian), CAT (Catalan; Valencian), CEB (Cebuano), CES (Czech), CHR (Cherokee), CYM (Welsh), DAN (Danish), DEU (German), DZO (Dzongkha), ELL (Greek), ENM (Archaic/Middle English), EPO (Esperanto), EST (Estonian), EUS (Basque), FAS (Persian), FIN (Finnish), FRA (French), FRK (Frankish), FRM (Middle-French), GLE (Irish), GLG (Galician), GRC (Ancient Greek), HAT (Hatian), HEB (Hebrew), HIN (Hindi), HRV (Croatian), HUN (Hungarian), IKU (Inuktitut), IND (Indonesian), ISL (Icelandic), ITA (Italian), ITA-OLD (Old - Italian), JAV (Javanese), JPN (Japanese), KAN (Kannada), KAT (Georgian), KAT-OLD (Old-Georgian), KAZ (Kazakh), KHM (Central Khmer), KIR (Kirghiz), KOR (Korean), KUR (Kurdish), LAO (Lao), LAT (Latin), LAV (Latvian), LIT (Lithuanian), MAL (Malayalam), MAR (Marathi), MKD (Macedonian), MLT (Maltese), MSA (Malay), MYA (Burmese), NEP (Nepali), NLD (Dutch), NOR (Norwegian), ORI (Oriya), PAN (Panjabi), POL (Polish), POR (Portuguese), PUS (Pushto), RON (Romanian), RUS (Russian), SAN (Sanskrit), SIN (Sinhala), SLK (Slovak), SLV (Slovenian), SPA (Spanish), SPA-OLD (Old Spanish), SQI (Albanian), SRP (Serbian), SRP-LAT (Latin Serbian), SWA (Swahili), SWE (Swedish), SYR (Syriac), TAM (Tamil), TEL (Telugu), TGK (Tajik), TGL (Tagalog), THA (Thai), TIR (Tigrinya), TUR (Turkish), UIG (Uighur), UKR (Ukrainian), URD (Urdu), UZB (Uzbek), UZB-CYR (Cyrillic Uzbek), VIE (Vietnamese), YID (Yiddish)
    * @param preprocessing Optional, preprocessing mode, default is &#39;Auto&#39;.  Possible values are None (no preprocessing of the image), and Auto (automatic image enhancement of the image before OCR is applied; this is recommended).
    * @return ImageToTextResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImageToTextResponse imageOcrPost(File imageFile, String recognitionMode, String language, String preprocessing) throws IOException {
        HttpResponse response = imageOcrPostForHttpResponse(imageFile, recognitionMode, language, preprocessing);
        TypeReference<ImageToTextResponse> typeRef = new TypeReference<ImageToTextResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

  /**
    * Convert a scanned image into text
    * Converts an uploaded image in common formats such as JPEG, PNG into text via Optical Character Recognition.  This API is intended to be run on scanned documents.  If you want to OCR photos (e.g. taken with a smart phone camera), be sure to use the photo/toText API instead, as it is designed to unskew the image first.  Note: for free tier API keys, it is required to add a credit card to your account for security reasons, to use the free tier key with this API.
    * <p><b>200</b> - OK
    * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
    * @param params Map of query params. A collection will be interpreted as passing in multiple instances of the same query param.
    * @return ImageToTextResponse
    * @throws IOException if an error occurs while attempting to invoke the API
    **/
    public ImageToTextResponse imageOcrPost(File imageFile, Map<String, Object> params) throws IOException {
        HttpResponse response = imageOcrPostForHttpResponse(imageFile, params);
        TypeReference<ImageToTextResponse> typeRef = new TypeReference<ImageToTextResponse>() {};
        return apiClient.getObjectMapper().readValue(response.getContent(), typeRef);
    }

    public HttpResponse imageOcrPostForHttpResponse(File imageFile, String recognitionMode, String language, String preprocessing) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrPost");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/image/toText");

        String localVarUrl = uriBuilder.build().toString();
        GenericUrl genericUrl = new GenericUrl(localVarUrl);

        HttpContent content = new EmptyContent();
        return apiClient.getHttpRequestFactory().buildRequest(HttpMethods.POST, genericUrl, content).execute();
    }

    public HttpResponse imageOcrPostForHttpResponse(File imageFile, Map<String, Object> params) throws IOException {
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new IllegalArgumentException("Missing the required parameter 'imageFile' when calling imageOcrPost");
        }
        UriBuilder uriBuilder = UriBuilder.fromUri(apiClient.getBasePath() + "/ocr/image/toText");

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
