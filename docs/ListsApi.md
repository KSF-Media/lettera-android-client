# ListsApi

All URIs are relative to *http://http:/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**frontpageGet**](ListsApi.md#frontpageGet) | **GET** /frontpage | Returns a list for a front page
[**latestGet**](ListsApi.md#latestGet) | **GET** /latest | Returns a list of latest articles
[**mostreadGet**](ListsApi.md#mostreadGet) | **GET** /mostread | Returns a list of most read articles
[**searchGet**](ListsApi.md#searchGet) | **GET** /search | Returns a list of search results



## frontpageGet

> List&lt;ArticleStub&gt; frontpageGet(start, limit, category, paper)

Returns a list for a front page

### Example

```java
// Import classes:
//import org.openapitools.client.api.ListsApi;

ListsApi apiInstance = new ListsApi();
Integer start = null; // Integer | 
Integer limit = null; // Integer | 
String category = null; // String | 
String paper = null; // String | 
try {
    List<ArticleStub> result = apiInstance.frontpageGet(start, limit, category, paper);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#frontpageGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**|  | [optional] [default to null]
 **limit** | **Integer**|  | [optional] [default to null]
 **category** | **String**|  | [optional] [default to null]
 **paper** | **String**|  | [optional] [default to null] [enum: hbl, ht, vn, on]

### Return type

[**List&lt;ArticleStub&gt;**](ArticleStub.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8


## latestGet

> List&lt;ArticleStub&gt; latestGet(start, limit, paper)

Returns a list of latest articles

### Example

```java
// Import classes:
//import org.openapitools.client.api.ListsApi;

ListsApi apiInstance = new ListsApi();
Integer start = null; // Integer | 
Integer limit = null; // Integer | 
String paper = null; // String | 
try {
    List<ArticleStub> result = apiInstance.latestGet(start, limit, paper);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#latestGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**|  | [optional] [default to null]
 **limit** | **Integer**|  | [optional] [default to null]
 **paper** | **String**|  | [optional] [default to null] [enum: hbl, ht, vn, on]

### Return type

[**List&lt;ArticleStub&gt;**](ArticleStub.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8


## mostreadGet

> List&lt;ArticleStub&gt; mostreadGet(start, limit, category, paper, onlySubscribers)

Returns a list of most read articles

### Example

```java
// Import classes:
//import org.openapitools.client.api.ListsApi;

ListsApi apiInstance = new ListsApi();
Integer start = null; // Integer | 
Integer limit = null; // Integer | 
String category = null; // String | 
String paper = null; // String | 
Boolean onlySubscribers = null; // Boolean | 
try {
    List<ArticleStub> result = apiInstance.mostreadGet(start, limit, category, paper, onlySubscribers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#mostreadGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start** | **Integer**|  | [optional] [default to null]
 **limit** | **Integer**|  | [optional] [default to null]
 **category** | **String**|  | [optional] [default to null]
 **paper** | **String**|  | [optional] [default to null] [enum: hbl, ht, vn, on]
 **onlySubscribers** | **Boolean**|  | [optional] [default to null]

### Return type

[**List&lt;ArticleStub&gt;**](ArticleStub.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8


## searchGet

> List&lt;ArticleStub&gt; searchGet(start, limit, paper, contentQuery)

Returns a list of search results

### Example

```java
// Import classes:
//import org.openapitools.client.api.ListsApi;

ListsApi apiInstance = new ListsApi();
Integer start = null; // Integer | 
Integer limit = null; // Integer | 
String paper = null; // String | 
String contentQuery = null; // String | 
try {
    List<ArticleStub> result = apiInstance.searchGet(start, limit, paper, contentQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#searchGet");
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

[**List&lt;ArticleStub&gt;**](ArticleStub.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8

