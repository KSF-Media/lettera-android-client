# ArticlesApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**articleUuidGet**](ArticlesApi.md#articleUuidGet) | **GET** /article/{uuid} | 


<a name="articleUuidGet"></a>
# **articleUuidGet**
> Article articleUuidGet(uuid, authUser, authorization)



### Example
```java
// Import classes:
//import org.openapitools.client.api.ArticlesApi;

ArticlesApi apiInstance = new ArticlesApi();
UUID uuid = null; // UUID | 
UUID authUser = null; // UUID | 
String authorization = null; // String | 
try {
    Article result = apiInstance.articleUuidGet(uuid, authUser, authorization);
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

### Return type

[**Article**](Article.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

