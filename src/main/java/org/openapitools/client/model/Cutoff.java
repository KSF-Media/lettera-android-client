/**
 * Lettera
 * <h2>KSF Media's articles service</h2> Changelog for V3: <ul><li>Unified <code>ListArticle</code> and <code>RelatedArticle</code> into a single type <code>ArticleStub</code>. NOTE: In contrast to the old types, <code>ArticleStub.relatedArticles</code> is now an optional value.</li> <li>Added endpoint <code>/article/{uuid}/stub</code></li> <li>Removed deprecated endpoint <code>/article/search</code></li> </ul> 
 *
 * The version of the OpenAPI document: 3.0.0
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
public class Cutoff {
  
  @SerializedName("cutoff")
  private Integer cutoff = null;
  @SerializedName("bonus")
  private Integer bonus = null;

  /**
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCutoff() {
    return cutoff;
  }
  public void setCutoff(Integer cutoff) {
    this.cutoff = cutoff;
  }

  /**
   * minimum: -9223372036854775808
   * maximum: 9223372036854775807
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getBonus() {
    return bonus;
  }
  public void setBonus(Integer bonus) {
    this.bonus = bonus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cutoff cutoff = (Cutoff) o;
    return (this.cutoff == null ? cutoff.cutoff == null : this.cutoff.equals(cutoff.cutoff)) &&
        (this.bonus == null ? cutoff.bonus == null : this.bonus.equals(cutoff.bonus));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.cutoff == null ? 0: this.cutoff.hashCode());
    result = 31 * result + (this.bonus == null ? 0: this.bonus.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cutoff {\n");
    
    sb.append("  cutoff: ").append(cutoff).append("\n");
    sb.append("  bonus: ").append(bonus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
