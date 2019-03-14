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

import java.util.*;
import java.util.UUID;
import org.openapitools.client.model.Author;
import org.openapitools.client.model.Block;
import org.openapitools.client.model.ImageInfo;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Article {
  
  @SerializedName("uuid")
  private UUID uuid = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("author")
  private Author author = null;
  @SerializedName("tags")
  private List<String> tags = null;
  @SerializedName("preamble")
  private String preamble = null;
  @SerializedName("mainImage")
  private ImageInfo mainImage = null;
  @SerializedName("body")
  private List<Block> body = null;
  @SerializedName("premium")
  private Boolean premium = null;
  @SerializedName("publishingTime")
  private String publishingTime = null;
  @SerializedName("externalScripts")
  private List<String> externalScripts = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public UUID getUuid() {
    return uuid;
  }
  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Author getAuthor() {
    return author;
  }
  public void setAuthor(Author author) {
    this.author = author;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPreamble() {
    return preamble;
  }
  public void setPreamble(String preamble) {
    this.preamble = preamble;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ImageInfo getMainImage() {
    return mainImage;
  }
  public void setMainImage(ImageInfo mainImage) {
    this.mainImage = mainImage;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Block> getBody() {
    return body;
  }
  public void setBody(List<Block> body) {
    this.body = body;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getPremium() {
    return premium;
  }
  public void setPremium(Boolean premium) {
    this.premium = premium;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPublishingTime() {
    return publishingTime;
  }
  public void setPublishingTime(String publishingTime) {
    this.publishingTime = publishingTime;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getExternalScripts() {
    return externalScripts;
  }
  public void setExternalScripts(List<String> externalScripts) {
    this.externalScripts = externalScripts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Article article = (Article) o;
    return (this.uuid == null ? article.uuid == null : this.uuid.equals(article.uuid)) &&
        (this.title == null ? article.title == null : this.title.equals(article.title)) &&
        (this.author == null ? article.author == null : this.author.equals(article.author)) &&
        (this.tags == null ? article.tags == null : this.tags.equals(article.tags)) &&
        (this.preamble == null ? article.preamble == null : this.preamble.equals(article.preamble)) &&
        (this.mainImage == null ? article.mainImage == null : this.mainImage.equals(article.mainImage)) &&
        (this.body == null ? article.body == null : this.body.equals(article.body)) &&
        (this.premium == null ? article.premium == null : this.premium.equals(article.premium)) &&
        (this.publishingTime == null ? article.publishingTime == null : this.publishingTime.equals(article.publishingTime)) &&
        (this.externalScripts == null ? article.externalScripts == null : this.externalScripts.equals(article.externalScripts));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.uuid == null ? 0: this.uuid.hashCode());
    result = 31 * result + (this.title == null ? 0: this.title.hashCode());
    result = 31 * result + (this.author == null ? 0: this.author.hashCode());
    result = 31 * result + (this.tags == null ? 0: this.tags.hashCode());
    result = 31 * result + (this.preamble == null ? 0: this.preamble.hashCode());
    result = 31 * result + (this.mainImage == null ? 0: this.mainImage.hashCode());
    result = 31 * result + (this.body == null ? 0: this.body.hashCode());
    result = 31 * result + (this.premium == null ? 0: this.premium.hashCode());
    result = 31 * result + (this.publishingTime == null ? 0: this.publishingTime.hashCode());
    result = 31 * result + (this.externalScripts == null ? 0: this.externalScripts.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Article {\n");
    
    sb.append("  uuid: ").append(uuid).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  author: ").append(author).append("\n");
    sb.append("  tags: ").append(tags).append("\n");
    sb.append("  preamble: ").append(preamble).append("\n");
    sb.append("  mainImage: ").append(mainImage).append("\n");
    sb.append("  body: ").append(body).append("\n");
    sb.append("  premium: ").append(premium).append("\n");
    sb.append("  publishingTime: ").append(publishingTime).append("\n");
    sb.append("  externalScripts: ").append(externalScripts).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
