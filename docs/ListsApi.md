# ListsApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**frontpageGet**](ListsApi.md#frontpageGet) | **GET** /frontpage | Returns a list for a front page
[**latestGet**](ListsApi.md#latestGet) | **GET** /latest | Returns a list of latest articles



## frontpageGet

> List&lt;Article&gt; frontpageGet()

Returns a list for a front page

### Example

```java
// Import classes:
//import org.openapitools.client.api.ListsApi;

ListsApi apiInstance = new ListsApi();
try {
    List<Article> result = apiInstance.frontpageGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#frontpageGet");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;Article&gt;**](Article.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8


## latestGet

> List&lt;Article&gt; latestGet()

Returns a list of latest articles

### Example

```java
// Import classes:
//import org.openapitools.client.api.ListsApi;

ListsApi apiInstance = new ListsApi();
try {
    List<Article> result = apiInstance.latestGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#latestGet");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;Article&gt;**](Article.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8

