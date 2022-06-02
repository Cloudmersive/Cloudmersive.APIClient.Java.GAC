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


package com.cloudmersive.client.gac.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DocxImage
 */
@JsonPropertyOrder({
  DocxImage.JSON_PROPERTY_PATH,
  DocxImage.JSON_PROPERTY_IMAGE_NAME,
  DocxImage.JSON_PROPERTY_IMAGE_ID,
  DocxImage.JSON_PROPERTY_IMAGE_DESCRIPTION,
  DocxImage.JSON_PROPERTY_IMAGE_WIDTH,
  DocxImage.JSON_PROPERTY_IMAGE_HEIGHT,
  DocxImage.JSON_PROPERTY_XOFFSET,
  DocxImage.JSON_PROPERTY_YOFFSET,
  DocxImage.JSON_PROPERTY_IMAGE_DATA_EMBED_ID,
  DocxImage.JSON_PROPERTY_IMAGE_DATA_CONTENT_TYPE,
  DocxImage.JSON_PROPERTY_IMAGE_INTERNAL_FILE_NAME,
  DocxImage.JSON_PROPERTY_IMAGE_CONTENTS_U_R_L,
  DocxImage.JSON_PROPERTY_INLINE_WITH_TEXT
})
@JsonTypeName("DocxImage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T21:57:05.444-07:00[America/Los_Angeles]")
public class DocxImage {
  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;

  public static final String JSON_PROPERTY_IMAGE_NAME = "ImageName";
  private String imageName;

  public static final String JSON_PROPERTY_IMAGE_ID = "ImageId";
  private Long imageId;

  public static final String JSON_PROPERTY_IMAGE_DESCRIPTION = "ImageDescription";
  private String imageDescription;

  public static final String JSON_PROPERTY_IMAGE_WIDTH = "ImageWidth";
  private Long imageWidth;

  public static final String JSON_PROPERTY_IMAGE_HEIGHT = "ImageHeight";
  private Long imageHeight;

  public static final String JSON_PROPERTY_XOFFSET = "XOffset";
  private Long xoffset;

  public static final String JSON_PROPERTY_YOFFSET = "YOffset";
  private Long yoffset;

  public static final String JSON_PROPERTY_IMAGE_DATA_EMBED_ID = "ImageDataEmbedId";
  private String imageDataEmbedId;

  public static final String JSON_PROPERTY_IMAGE_DATA_CONTENT_TYPE = "ImageDataContentType";
  private String imageDataContentType;

  public static final String JSON_PROPERTY_IMAGE_INTERNAL_FILE_NAME = "ImageInternalFileName";
  private String imageInternalFileName;

  public static final String JSON_PROPERTY_IMAGE_CONTENTS_U_R_L = "ImageContentsURL";
  private String imageContentsURL;

  public static final String JSON_PROPERTY_INLINE_WITH_TEXT = "InlineWithText";
  private Boolean inlineWithText;


  public DocxImage path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new tables
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new tables")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public DocxImage imageName(String imageName) {
    
    this.imageName = imageName;
    return this;
  }

   /**
   * The Name of the image
   * @return imageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Name of the image")
  @JsonProperty(JSON_PROPERTY_IMAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageName() {
    return imageName;
  }


  public void setImageName(String imageName) {
    this.imageName = imageName;
  }


  public DocxImage imageId(Long imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * The Id of the image
   * @return imageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Id of the image")
  @JsonProperty(JSON_PROPERTY_IMAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getImageId() {
    return imageId;
  }


  public void setImageId(Long imageId) {
    this.imageId = imageId;
  }


  public DocxImage imageDescription(String imageDescription) {
    
    this.imageDescription = imageDescription;
    return this;
  }

   /**
   * The Description of the image
   * @return imageDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Description of the image")
  @JsonProperty(JSON_PROPERTY_IMAGE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageDescription() {
    return imageDescription;
  }


  public void setImageDescription(String imageDescription) {
    this.imageDescription = imageDescription;
  }


  public DocxImage imageWidth(Long imageWidth) {
    
    this.imageWidth = imageWidth;
    return this;
  }

   /**
   * Width of the image in EMUs (English Metric Units); set to 0 to default to page width and aspect-ratio based height
   * @return imageWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Width of the image in EMUs (English Metric Units); set to 0 to default to page width and aspect-ratio based height")
  @JsonProperty(JSON_PROPERTY_IMAGE_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getImageWidth() {
    return imageWidth;
  }


  public void setImageWidth(Long imageWidth) {
    this.imageWidth = imageWidth;
  }


  public DocxImage imageHeight(Long imageHeight) {
    
    this.imageHeight = imageHeight;
    return this;
  }

   /**
   * Height of the image in EMUs (English Metric Units); set to 0 to default to page width and aspect-ratio based height
   * @return imageHeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Height of the image in EMUs (English Metric Units); set to 0 to default to page width and aspect-ratio based height")
  @JsonProperty(JSON_PROPERTY_IMAGE_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getImageHeight() {
    return imageHeight;
  }


  public void setImageHeight(Long imageHeight) {
    this.imageHeight = imageHeight;
  }


  public DocxImage xoffset(Long xoffset) {
    
    this.xoffset = xoffset;
    return this;
  }

   /**
   * X (horizontal) offset of the image
   * @return xoffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "X (horizontal) offset of the image")
  @JsonProperty(JSON_PROPERTY_XOFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getXoffset() {
    return xoffset;
  }


  public void setXoffset(Long xoffset) {
    this.xoffset = xoffset;
  }


  public DocxImage yoffset(Long yoffset) {
    
    this.yoffset = yoffset;
    return this;
  }

   /**
   * Y (vertical) offset of the image
   * @return yoffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Y (vertical) offset of the image")
  @JsonProperty(JSON_PROPERTY_YOFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getYoffset() {
    return yoffset;
  }


  public void setYoffset(Long yoffset) {
    this.yoffset = yoffset;
  }


  public DocxImage imageDataEmbedId(String imageDataEmbedId) {
    
    this.imageDataEmbedId = imageDataEmbedId;
    return this;
  }

   /**
   * Read-only; internal ID for the image contents
   * @return imageDataEmbedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read-only; internal ID for the image contents")
  @JsonProperty(JSON_PROPERTY_IMAGE_DATA_EMBED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageDataEmbedId() {
    return imageDataEmbedId;
  }


  public void setImageDataEmbedId(String imageDataEmbedId) {
    this.imageDataEmbedId = imageDataEmbedId;
  }


  public DocxImage imageDataContentType(String imageDataContentType) {
    
    this.imageDataContentType = imageDataContentType;
    return this;
  }

   /**
   * Read-only; image data MIME content-type
   * @return imageDataContentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read-only; image data MIME content-type")
  @JsonProperty(JSON_PROPERTY_IMAGE_DATA_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageDataContentType() {
    return imageDataContentType;
  }


  public void setImageDataContentType(String imageDataContentType) {
    this.imageDataContentType = imageDataContentType;
  }


  public DocxImage imageInternalFileName(String imageInternalFileName) {
    
    this.imageInternalFileName = imageInternalFileName;
    return this;
  }

   /**
   * Read-only; internal file name/path for the image
   * @return imageInternalFileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read-only; internal file name/path for the image")
  @JsonProperty(JSON_PROPERTY_IMAGE_INTERNAL_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageInternalFileName() {
    return imageInternalFileName;
  }


  public void setImageInternalFileName(String imageInternalFileName) {
    this.imageInternalFileName = imageInternalFileName;
  }


  public DocxImage imageContentsURL(String imageContentsURL) {
    
    this.imageContentsURL = imageContentsURL;
    return this;
  }

   /**
   * URL to the image contents; file is stored in an in-memory cache and will be deleted.  Call Finish-Editing to get the contents.
   * @return imageContentsURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to the image contents; file is stored in an in-memory cache and will be deleted.  Call Finish-Editing to get the contents.")
  @JsonProperty(JSON_PROPERTY_IMAGE_CONTENTS_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageContentsURL() {
    return imageContentsURL;
  }


  public void setImageContentsURL(String imageContentsURL) {
    this.imageContentsURL = imageContentsURL;
  }


  public DocxImage inlineWithText(Boolean inlineWithText) {
    
    this.inlineWithText = inlineWithText;
    return this;
  }

   /**
   * True if the image is inline with the text; false if it is floating
   * @return inlineWithText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the image is inline with the text; false if it is floating")
  @JsonProperty(JSON_PROPERTY_INLINE_WITH_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInlineWithText() {
    return inlineWithText;
  }


  public void setInlineWithText(Boolean inlineWithText) {
    this.inlineWithText = inlineWithText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxImage docxImage = (DocxImage) o;
    return Objects.equals(this.path, docxImage.path) &&
        Objects.equals(this.imageName, docxImage.imageName) &&
        Objects.equals(this.imageId, docxImage.imageId) &&
        Objects.equals(this.imageDescription, docxImage.imageDescription) &&
        Objects.equals(this.imageWidth, docxImage.imageWidth) &&
        Objects.equals(this.imageHeight, docxImage.imageHeight) &&
        Objects.equals(this.xoffset, docxImage.xoffset) &&
        Objects.equals(this.yoffset, docxImage.yoffset) &&
        Objects.equals(this.imageDataEmbedId, docxImage.imageDataEmbedId) &&
        Objects.equals(this.imageDataContentType, docxImage.imageDataContentType) &&
        Objects.equals(this.imageInternalFileName, docxImage.imageInternalFileName) &&
        Objects.equals(this.imageContentsURL, docxImage.imageContentsURL) &&
        Objects.equals(this.inlineWithText, docxImage.inlineWithText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, imageName, imageId, imageDescription, imageWidth, imageHeight, xoffset, yoffset, imageDataEmbedId, imageDataContentType, imageInternalFileName, imageContentsURL, inlineWithText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxImage {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageDescription: ").append(toIndentedString(imageDescription)).append("\n");
    sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
    sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
    sb.append("    xoffset: ").append(toIndentedString(xoffset)).append("\n");
    sb.append("    yoffset: ").append(toIndentedString(yoffset)).append("\n");
    sb.append("    imageDataEmbedId: ").append(toIndentedString(imageDataEmbedId)).append("\n");
    sb.append("    imageDataContentType: ").append(toIndentedString(imageDataContentType)).append("\n");
    sb.append("    imageInternalFileName: ").append(toIndentedString(imageInternalFileName)).append("\n");
    sb.append("    imageContentsURL: ").append(toIndentedString(imageContentsURL)).append("\n");
    sb.append("    inlineWithText: ").append(toIndentedString(inlineWithText)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
