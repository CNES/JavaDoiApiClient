# AdministrationApi

All URIs are relative to *https://localhost:8183*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createToken**](AdministrationApi.md#createToken) | **POST** /admin/token | 


<a name="createToken"></a>
# **createToken**
> String createToken()



Create a token

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AdministrationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AdministrationApi apiInstance = new AdministrationApi();
try {
    String result = apiInstance.createToken();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdministrationApi#createToken");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text

