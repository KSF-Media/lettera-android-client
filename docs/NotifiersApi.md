# NotifiersApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notifyPost**](NotifiersApi.md#notifyPost) | **POST** /notify | Listens to OC Notifier



## notifyPost

> notifyPost(body)

Listens to OC Notifier

### Example

```java
// Import classes:
//import org.openapitools.client.api.NotifiersApi;

NotifiersApi apiInstance = new NotifiersApi();
String body = "body_example"; // String | 
try {
    apiInstance.notifyPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling NotifiersApi#notifyPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: Not defined

