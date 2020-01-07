# CategoriesApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**categoriesGet**](CategoriesApi.md#categoriesGet) | **GET** /categories | Read categories



## categoriesGet

> List&lt;CategoryHierarchy&gt; categoriesGet(paper)

Read categories

### Example

```java
// Import classes:
//import org.openapitools.client.api.CategoriesApi;

CategoriesApi apiInstance = new CategoriesApi();
String paper = null; // String | 
try {
    List<CategoryHierarchy> result = apiInstance.categoriesGet(paper);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#categoriesGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paper** | **String**|  | [optional] [default to null] [enum: hbl, ht, vn, on]

### Return type

[**List&lt;CategoryHierarchy&gt;**](CategoryHierarchy.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8

