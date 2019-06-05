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
    
    if ("ArticleType".equalsIgnoreCase(className)) {
      return new TypeToken<List<ArticleType>>(){}.getType();
    }
    
    if ("Author".equalsIgnoreCase(className)) {
      return new TypeToken<List<Author>>(){}.getType();
    }
    
    if ("Block".equalsIgnoreCase(className)) {
      return new TypeToken<List<Block>>(){}.getType();
    }
    
    if ("BlockShortcodeError".equalsIgnoreCase(className)) {
      return new TypeToken<List<BlockShortcodeError>>(){}.getType();
    }
    
    if ("Category".equalsIgnoreCase(className)) {
      return new TypeToken<List<Category>>(){}.getType();
    }
    
    if ("CategoryHierarchy".equalsIgnoreCase(className)) {
      return new TypeToken<List<CategoryHierarchy>>(){}.getType();
    }
    
    if ("FactInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<FactInfo>>(){}.getType();
    }
    
    if ("ImageInfo".equalsIgnoreCase(className)) {
      return new TypeToken<List<ImageInfo>>(){}.getType();
    }
    
    if ("RelatedArticle".equalsIgnoreCase(className)) {
      return new TypeToken<List<RelatedArticle>>(){}.getType();
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
    
    if ("ArticleType".equalsIgnoreCase(className)) {
      return new TypeToken<ArticleType>(){}.getType();
    }
    
    if ("Author".equalsIgnoreCase(className)) {
      return new TypeToken<Author>(){}.getType();
    }
    
    if ("Block".equalsIgnoreCase(className)) {
      return new TypeToken<Block>(){}.getType();
    }
    
    if ("BlockShortcodeError".equalsIgnoreCase(className)) {
      return new TypeToken<BlockShortcodeError>(){}.getType();
    }
    
    if ("Category".equalsIgnoreCase(className)) {
      return new TypeToken<Category>(){}.getType();
    }
    
    if ("CategoryHierarchy".equalsIgnoreCase(className)) {
      return new TypeToken<CategoryHierarchy>(){}.getType();
    }
    
    if ("FactInfo".equalsIgnoreCase(className)) {
      return new TypeToken<FactInfo>(){}.getType();
    }
    
    if ("ImageInfo".equalsIgnoreCase(className)) {
      return new TypeToken<ImageInfo>(){}.getType();
    }
    
    if ("RelatedArticle".equalsIgnoreCase(className)) {
      return new TypeToken<RelatedArticle>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
