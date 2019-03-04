/**
 * Lettera
 * KSF Media's articles service
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.Alignment;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ImageInfo {
  
  @SerializedName("url")
  private String url = null;
  @SerializedName("thumb")
  private String thumb = null;
  @SerializedName("caption")
  private String caption = null;
  @SerializedName("alignment")
  private Alignment alignment = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getThumb() {
    return thumb;
  }
  public void setThumb(String thumb) {
    this.thumb = thumb;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCaption() {
    return caption;
  }
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Alignment getAlignment() {
    return alignment;
  }
  public void setAlignment(Alignment alignment) {
    this.alignment = alignment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageInfo imageInfo = (ImageInfo) o;
    return (this.url == null ? imageInfo.url == null : this.url.equals(imageInfo.url)) &&
        (this.thumb == null ? imageInfo.thumb == null : this.thumb.equals(imageInfo.thumb)) &&
        (this.caption == null ? imageInfo.caption == null : this.caption.equals(imageInfo.caption)) &&
        (this.alignment == null ? imageInfo.alignment == null : this.alignment.equals(imageInfo.alignment));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    result = 31 * result + (this.thumb == null ? 0: this.thumb.hashCode());
    result = 31 * result + (this.caption == null ? 0: this.caption.hashCode());
    result = 31 * result + (this.alignment == null ? 0: this.alignment.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageInfo {\n");
    
    sb.append("  url: ").append(url).append("\n");
    sb.append("  thumb: ").append(thumb).append("\n");
    sb.append("  caption: ").append(caption).append("\n");
    sb.append("  alignment: ").append(alignment).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}