# ArticlesApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**articleSearchGet**](ArticlesApi.md#articleSearchGet) | **GET** /article/search | 
[**articleUuidGet**](ArticlesApi.md#articleUuidGet) | **GET** /article/{uuid} | 



## articleSearchGet

> List&lt;Article&gt; articleSearchGet(start, limit, paper, contentQuery)



Search article by content. It&#39;s a freetext search, so the &#x60;contentQuery&#x60; may be whatever string or sentence to search for.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ArticlesApi;

ArticlesApi apiInstance = new ArticlesApi();
Integer start = null; // Integer | 
Integer limit = null; // Integer | 
String paper = null; // String | 
String contentQuery = null; // String | 
try {
    List<Article> result = apiInstance.articleSearchGet(start, limit, paper, contentQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArticlesApi#articleSearchGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**|  | [optional] [default to null]
 **limit** | **Integer**|  | [optional] [default to null]
 **paper** | **String**|  | [optional] [default to null] [enum: hbl, ht, vn, on]
 **contentQuery** | **String**|  | [optional] [default to null]

### Return type

[**List&lt;Article&gt;**](Article.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8


## articleUuidGet

> Article articleUuidGet(uuid, authUser, authorization, textonly)



Fetch article by UUID.   Notes about the images:   The image URLs point to our image scaler, and are returned without no scaling parameters.  However, if wanted, &#x60;width&#x60; and &#x60;height&#x60; parameters can be added to the querystring of the URL.  Also in list views, to ensure same size, it might be useful to crop the images by using the parameter &#x60;function&#x3D;hardcrop&#x60;

### Example

```java
// Import classes:
//import org.openapitools.client.api.ArticlesApi;

ArticlesApi apiInstance = new ArticlesApi();
UUID uuid = null; // UUID | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
Boolean textonly = false; // Boolean | 
try {
    Article result = apiInstance.articleUuidGet(uuid, authUser, authorization, textonly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArticlesApi#articleUuidGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]
 **authUser** | [**UUID**](.md)|  | [optional] [default to null]
 **authorization** | **String**|  | [optional] [default to null]
 **textonly** | **Boolean**|  | [optional] [default to false]

### Return type

[**Article**](Article.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8

