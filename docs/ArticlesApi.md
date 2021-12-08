# ArticlesApi

All URIs are relative to *http://http:/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**articleUuidGet**](ArticlesApi.md#articleUuidGet) | **GET** /article/{uuid} | 
[**articleUuidStubGet**](ArticlesApi.md#articleUuidStubGet) | **GET** /article/{uuid}/stub | 



## articleUuidGet

> Article articleUuidGet(uuid, authUser, authorization, xRealIp, textonly)



Fetch article by UUID.   Notes about the images:   The image URLs point to our image scaler, and are returned without scaling parameters.  However, if wanted, &#x60;width&#x60; and &#x60;height&#x60; parameters can be added to the querystring of the URL.  Also in list views, to ensure same size, it might be useful to crop the images by using the parameter &#x60;function&#x3D;hardcrop&#x60;

### Example

```java
// Import classes:
//import org.openapitools.client.api.ArticlesApi;

ArticlesApi apiInstance = new ArticlesApi();
UUID uuid = null; // UUID | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
String xRealIp = null; // String | 
Boolean textonly = false; // Boolean | 
try {
    Article result = apiInstance.articleUuidGet(uuid, authUser, authorization, xRealIp, textonly);
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
 **xRealIp** | **String**|  | [optional] [default to null]
 **textonly** | **Boolean**|  | [optional] [default to false]

### Return type

[**Article**](Article.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8


## articleUuidStubGet

> ArticleStub articleUuidStubGet(uuid)



Fetch an article stub by UUID

### Example

```java
// Import classes:
//import org.openapitools.client.api.ArticlesApi;

ArticlesApi apiInstance = new ArticlesApi();
UUID uuid = null; // UUID | 
try {
    ArticleStub result = apiInstance.articleUuidStubGet(uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ArticlesApi#articleUuidStubGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | [**UUID**](.md)|  | [default to null]

### Return type

[**ArticleStub**](ArticleStub.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8

