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

package org.openapitools.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import org.openapitools.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Alignment".equalsIgnoreCase(className)) {
      return new TypeToken<List<Alignment>>(){}.getType();
    }
    
    if ("Article".equalsIgnoreCase(className)) {
      return new TypeToken<List<Article>>(){}.getType();
    }
    
    if ("ArticleStub".equalsIgnoreCase(className)) {
      return new TypeToken<List<ArticleStub>>(){}.getType();
    }
    
    if ("ArticleType".equalsIgnoreCase(className)) {
      return new TypeToken<List<ArticleType>>(){}.getType();
    }
    
    if ("ArticleTypeDetails".equalsIgnoreCase(className)) {
      return new TypeToken<List<ArticleTypeDetails>>(){}.getType();
    }
    
    if ("Author".equalsIgnoreCase(className)) {
      return new TypeToken<List<Author>>(){}.getType();
    }
    
    if ("Block".equalsIgnoreCase(className)) {
      return new TypeToken<List<Block>>(){}.getType();
    }
    
    if ("BoxInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<BoxInfo>>(){}.getType();
    }
    
    if ("BoxType".equalsIgnoreCase(className)) {
      return new TypeToken<List<BoxType>>(){}.getType();
    }
    
    if ("Category".equalsIgnoreCase(className)) {
      return new TypeToken<List<Category>>(){}.getType();
    }
    
    if ("EventType".equalsIgnoreCase(className)) {
      return new TypeToken<List<EventType>>(){}.getType();
    }
    
    if ("ImageInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<ImageInfo>>(){}.getType();
    }
    
    if ("Notification".equalsIgnoreCase(className)) {
      return new TypeToken<List<Notification>>(){}.getType();
    }
    
    if ("Paper".equalsIgnoreCase(className)) {
      return new TypeToken<List<Paper>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Alignment".equalsIgnoreCase(className)) {
      return new TypeToken<Alignment>(){}.getType();
    }
    
    if ("Article".equalsIgnoreCase(className)) {
      return new TypeToken<Article>(){}.getType();
    }
    
    if ("ArticleStub".equalsIgnoreCase(className)) {
      return new TypeToken<ArticleStub>(){}.getType();
    }
    
    if ("ArticleType".equalsIgnoreCase(className)) {
      return new TypeToken<ArticleType>(){}.getType();
    }
    
    if ("ArticleTypeDetails".equalsIgnoreCase(className)) {
      return new TypeToken<ArticleTypeDetails>(){}.getType();
    }
    
    if ("Author".equalsIgnoreCase(className)) {
      return new TypeToken<Author>(){}.getType();
    }
    
    if ("Block".equalsIgnoreCase(className)) {
      return new TypeToken<Block>(){}.getType();
    }
    
    if ("BoxInfo".equalsIgnoreCase(className)) {
      return new TypeToken<BoxInfo>(){}.getType();
    }
    
    if ("BoxType".equalsIgnoreCase(className)) {
      return new TypeToken<BoxType>(){}.getType();
    }
    
    if ("Category".equalsIgnoreCase(className)) {
      return new TypeToken<Category>(){}.getType();
    }
    
    if ("EventType".equalsIgnoreCase(className)) {
      return new TypeToken<EventType>(){}.getType();
    }
    
    if ("ImageInfo".equalsIgnoreCase(className)) {
      return new TypeToken<ImageInfo>(){}.getType();
    }
    
    if ("Notification".equalsIgnoreCase(className)) {
      return new TypeToken<Notification>(){}.getType();
    }
    
    if ("Paper".equalsIgnoreCase(className)) {
      return new TypeToken<Paper>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
