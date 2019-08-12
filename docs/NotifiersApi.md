# NotifiersApi

All URIs are relative to *http://http:/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notifyPost**](NotifiersApi.md#notifyPost) | **POST** /notify | Listens to OC Notifier



## notifyPost

> notifyPost(body, token)

Listens to OC Notifier

### Example

```java
// Import classes:
//import org.openapitools.client.api.NotifiersApi;

NotifiersApi apiInstance = new NotifiersApi();
Notification body = new Notification(); // Notification | 
String token = null; // String | 
try {
    apiInstance.notifyPost(body, token);
} catch (ApiException e) {
    System.err.println("Exception when calling NotifiersApi#notifyPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Notification**](Notification.md)|  |
 **token** | **String**|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json;charset=utf-8
- **Accept**: Not defined

