# ListsApi

All URIs are relative to *http://http:/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**frontpageGet**](ListsApi.md#frontpageGet) | **GET** /frontpage | Returns a list for a front page
[**latestGet**](ListsApi.md#latestGet) | **GET** /latest | Returns a list of latest articles
[**mostreadGet**](ListsApi.md#mostreadGet) | **GET** /mostread | Returns a list of most read articles
[**presetPresetCategoryGet**](ListsApi.md#presetPresetCategoryGet) | **GET** /preset/{preset}/{category} | Load a preset model
[**presetPresetCategoryPost**](ListsApi.md#presetPresetCategoryPost) | **POST** /preset/{preset}/{category} | Update a preset model
[**scoredPost**](ListsApi.md#scoredPost) | **POST** /scored | List recent articles sorted by given scoring weights
[**scoredPresetGet**](ListsApi.md#scoredPresetGet) | **GET** /scored/{preset} | List recent articles sorted by preset scoring
[**searchGet**](ListsApi.md#searchGet) | **GET** /search | Returns a list of search results
[**tagTagGet**](ListsApi.md#tagTagGet) | **GET** /tag/{tag} | Returns a list of latest articles by tag



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


## presetPresetCategoryGet

> Scoring presetPresetCategoryGet(authUser, authorization, preset, category)

Load a preset model

### Example

```java
// Import classes:
//import org.openapitools.client.api.ListsApi;

ListsApi apiInstance = new ListsApi();
UUID authUser = null; // UUID | 
String authorization = null; // String | 
Integer preset = null; // Integer | 
String category = null; // String | 
try {
    Scoring result = apiInstance.presetPresetCategoryGet(authUser, authorization, preset, category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#presetPresetCategoryGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authUser** | [**UUID**](.md)|  | [default to null]
 **authorization** | **String**|  | [default to null]
 **preset** | **Integer**|  | [default to null]
 **category** | **String**|  | [default to null]

### Return type

[**Scoring**](Scoring.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8


## presetPresetCategoryPost

> presetPresetCategoryPost(authUser, authorization, preset, category, body)

Update a preset model

### Example

```java
// Import classes:
//import org.openapitools.client.api.ListsApi;

ListsApi apiInstance = new ListsApi();
UUID authUser = null; // UUID | 
String authorization = null; // String | 
Integer preset = null; // Integer | 
String category = null; // String | 
Scoring body = new Scoring(); // Scoring | 
try {
    apiInstance.presetPresetCategoryPost(authUser, authorization, preset, category, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#presetPresetCategoryPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authUser** | [**UUID**](.md)|  | [default to null]
 **authorization** | **String**|  | [default to null]
 **preset** | **Integer**|  | [default to null]
 **category** | **String**|  | [default to null]
 **body** | [**Scoring**](Scoring.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: Not defined


## scoredPost

> List&lt;ArticleStub&gt; scoredPost(category, paper, body, start, limit)

List recent articles sorted by given scoring weights

### Example

```java
// Import classes:
//import org.openapitools.client.api.ListsApi;

ListsApi apiInstance = new ListsApi();
String category = null; // String | 
String paper = null; // String | 
Scoring body = new Scoring(); // Scoring | 
Integer start = null; // Integer | 
Integer limit = null; // Integer | 
try {
    List<ArticleStub> result = apiInstance.scoredPost(category, paper, body, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#scoredPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **String**|  | [default to null]
 **paper** | **String**|  | [default to null] [enum: HBL, ON, VN, HT, JUNIOR, FORUM, LS]
 **body** | [**Scoring**](Scoring.md)|  |
 **start** | **Integer**|  | [optional] [default to null]
 **limit** | **Integer**|  | [optional] [default to null]

### Return type

[**List&lt;ArticleStub&gt;**](ArticleStub.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: application/json;charset=utf-8


## scoredPresetGet

> List&lt;ArticleStub&gt; scoredPresetGet(preset, category, start, limit, paper)

List recent articles sorted by preset scoring

### Example

```java
// Import classes:
//import org.openapitools.client.api.ListsApi;

ListsApi apiInstance = new ListsApi();
Integer preset = null; // Integer | 
String category = null; // String | 
Integer start = null; // Integer | 
Integer limit = null; // Integer | 
String paper = null; // String | 
try {
    List<ArticleStub> result = apiInstance.scoredPresetGet(preset, category, start, limit, paper);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#scoredPresetGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **preset** | **Integer**|  | [default to null]
 **category** | **String**|  | [default to null]
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


## tagTagGet

> List&lt;ArticleStub&gt; tagTagGet(tag, start, limit, paper)

Returns a list of latest articles by tag

### Example

```java
// Import classes:
//import org.openapitools.client.api.ListsApi;

ListsApi apiInstance = new ListsApi();
String tag = null; // String | 
Integer start = null; // Integer | 
Integer limit = null; // Integer | 
String paper = null; // String | 
try {
    List<ArticleStub> result = apiInstance.tagTagGet(tag, start, limit, paper);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#tagTagGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tag** | **String**|  | [default to null]
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

