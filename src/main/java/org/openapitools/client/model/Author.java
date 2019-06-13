/**
 * Lettera
 * KSF Media's articles service
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Author {
  
  @SerializedName("byline")
  private String byline = null;
  @SerializedName("image")
  private String image = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getByline() {
    return byline;
  }
  public void setByline(String byline) {
    this.byline = byline;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Author author = (Author) o;
    return (this.byline == null ? author.byline == null : this.byline.equals(author.byline)) &&
        (this.image == null ? author.image == null : this.image.equals(author.image));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.byline == null ? 0: this.byline.hashCode());
    result = 31 * result + (this.image == null ? 0: this.image.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");
    
    sb.append("  byline: ").append(byline).append("\n");
    sb.append("  image: ").append(image).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
