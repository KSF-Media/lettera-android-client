# ListsApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listGet**](ListsApi.md#listGet) | **GET** /list | 


<a name="listGet"></a>
# **listGet**
> List&lt;Article&gt; listGet()



### Example
```java
// Import classes:
//import org.openapitools.client.api.ListsApi;

ListsApi apiInstance = new ListsApi();
try {
    List<Article> result = apiInstance.listGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#listGet");
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

