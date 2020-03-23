/**
 * Lettera
 * KSF Media's articles service
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class FactInfo {
  
  @SerializedName("title")
  private String title = null;
  @SerializedName("content")
  private List<String> content = null;

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
  public List<String> getContent() {
    return content;
  }
  public void setContent(List<String> content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactInfo factInfo = (FactInfo) o;
    return (this.title == null ? factInfo.title == null : this.title.equals(factInfo.title)) &&
        (this.content == null ? factInfo.content == null : this.content.equals(factInfo.content));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.title == null ? 0: this.title.hashCode());
    result = 31 * result + (this.content == null ? 0: this.content.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactInfo {\n");
    
    sb.append("  title: ").append(title).append("\n");
    sb.append("  content: ").append(content).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
