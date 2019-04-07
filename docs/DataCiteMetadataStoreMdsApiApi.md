# DataCiteMetadataStoreMdsApiApi

All URIs are relative to *https://localhost:8183*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelDoiProject**](DataCiteMetadataStoreMdsApiApi.md#cancelDoiProject) | **DELETE** /mds/metadata/{prefix}/{project}/{doi_name} | 
[**getAllDoiMetadata**](DataCiteMetadataStoreMdsApiApi.md#getAllDoiMetadata) | **GET** /mds/metadata/{prefix}/{project}/{doi_name} | 
[**getDoiMedia**](DataCiteMetadataStoreMdsApiApi.md#getDoiMedia) | **GET** /mds/media/{prefix}/{project}/{doi_name} | 
[**getLandingPageUrl**](DataCiteMetadataStoreMdsApiApi.md#getLandingPageUrl) | **GET** /mds/dois/{prefix}/{project}/{doi_name} | 
[**postDoiMetadata**](DataCiteMetadataStoreMdsApiApi.md#postDoiMetadata) | **POST** /mds/metadata | 
[**postLandingPage**](DataCiteMetadataStoreMdsApiApi.md#postLandingPage) | **POST** /mds/dois | 
[**postMedia**](DataCiteMetadataStoreMdsApiApi.md#postMedia) | **POST** /mds/media/{prefix}/{project}/{doi_name} | 


<a name="cancelDoiProject"></a>
# **cancelDoiProject**
> Object cancelDoiProject(prefix, project, doiName, selectedRole)



This request marks a dataset as &#39;inactive&#39;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataCiteMetadataStoreMdsApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DataCiteMetadataStoreMdsApiApi apiInstance = new DataCiteMetadataStoreMdsApiApi();
String prefix = "prefix_example"; // String | DOI prefix
String project = "project_example"; // String | Project identifier
String doiName = "doiName_example"; // String | Record ID
String selectedRole = "selectedRole_example"; // String | the selected role when a user is connected to more than 2 roles.
try {
    Object result = apiInstance.cancelDoiProject(prefix, project, doiName, selectedRole);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataCiteMetadataStoreMdsApiApi#cancelDoiProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **String**| DOI prefix |
 **project** | **String**| Project identifier |
 **doiName** | **String**| Record ID |
 **selectedRole** | **String**| the selected role when a user is connected to more than 2 roles. | [optional]

### Return type

**Object**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllDoiMetadata"></a>
# **getAllDoiMetadata**
> Object getAllDoiMetadata(prefix, project, doiName)



Get all metdata oi

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DataCiteMetadataStoreMdsApiApi;


DataCiteMetadataStoreMdsApiApi apiInstance = new DataCiteMetadataStoreMdsApiApi();
String prefix = "prefix_example"; // String | DOI prefix
String project = "project_example"; // String | Project identifier
String doiName = "doiName_example"; // String | Record ID
try {
    Object result = apiInstance.getAllDoiMetadata(prefix, project, doiName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataCiteMetadataStoreMdsApiApi#getAllDoiMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **String**| DOI prefix |
 **project** | **String**| Project identifier |
 **doiName** | **String**| Record ID |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml

<a name="getDoiMedia"></a>
# **getDoiMedia**
> List&lt;String&gt; getDoiMedia(prefix, project, doiName, selectedRole)



Retuen a list of pairs of media type and URLs

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DataCiteMetadataStoreMdsApiApi;


DataCiteMetadataStoreMdsApiApi apiInstance = new DataCiteMetadataStoreMdsApiApi();
String prefix = "prefix_example"; // String | DOI prefix
String project = "project_example"; // String | Project identifier
String doiName = "doiName_example"; // String | Record ID
String selectedRole = "selectedRole_example"; // String | the selected role when a user is connected to more than 2 roles.
try {
    List<String> result = apiInstance.getDoiMedia(prefix, project, doiName, selectedRole);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataCiteMetadataStoreMdsApiApi#getDoiMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **String**| DOI prefix |
 **project** | **String**| Project identifier |
 **doiName** | **String**| Record ID |
 **selectedRole** | **String**| the selected role when a user is connected to more than 2 roles. | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/uri-list

<a name="getLandingPageUrl"></a>
# **getLandingPageUrl**
> String getLandingPageUrl(prefix, project, doiName)



Retrieves the landing page URL

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DataCiteMetadataStoreMdsApiApi;


DataCiteMetadataStoreMdsApiApi apiInstance = new DataCiteMetadataStoreMdsApiApi();
String prefix = "prefix_example"; // String | DOI prefix
String project = "project_example"; // String | Project identifier
String doiName = "doiName_example"; // String | Record ID
try {
    String result = apiInstance.getLandingPageUrl(prefix, project, doiName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataCiteMetadataStoreMdsApiApi#getLandingPageUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **String**| DOI prefix |
 **project** | **String**| Project identifier |
 **doiName** | **String**| Record ID |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text

<a name="postDoiMetadata"></a>
# **postDoiMetadata**
> String postDoiMetadata(body, selectedRole)



Create or update doi project metadata (short explanation of status code e.g. CREATED, HANDLE_ALREADY_EXISTS)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataCiteMetadataStoreMdsApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DataCiteMetadataStoreMdsApiApi apiInstance = new DataCiteMetadataStoreMdsApiApi();
String body = "body_example"; // String | metadata
String selectedRole = "selectedRole_example"; // String | the selected role when a user is connected to more than 2 roles.
try {
    String result = apiInstance.postDoiMetadata(body, selectedRole);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataCiteMetadataStoreMdsApiApi#postDoiMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**| metadata |
 **selectedRole** | **String**| the selected role when a user is connected to more than 2 roles. | [optional]

### Return type

**String**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: text

<a name="postLandingPage"></a>
# **postLandingPage**
> String postLandingPage(url, doi, selectedRole)



Create a **new** doi project or update the landing page url if it the project already exists

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataCiteMetadataStoreMdsApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DataCiteMetadataStoreMdsApiApi apiInstance = new DataCiteMetadataStoreMdsApiApi();
String url = "url_example"; // String | the URL of the landing page
String doi = "doi_example"; // String | the project suffix, which is an unique identifier within the project
String selectedRole = "selectedRole_example"; // String | the selected role when a user is connected to more than 2 roles.
try {
    String result = apiInstance.postLandingPage(url, doi, selectedRole);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataCiteMetadataStoreMdsApiApi#postLandingPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**| the URL of the landing page |
 **doi** | **String**| the project suffix, which is an unique identifier within the project |
 **selectedRole** | **String**| the selected role when a user is connected to more than 2 roles. | [optional]

### Return type

**String**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text

<a name="postMedia"></a>
# **postMedia**
> String postMedia(prefix, project, doiName, selectedRole)



add an association media/url

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DataCiteMetadataStoreMdsApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

DataCiteMetadataStoreMdsApiApi apiInstance = new DataCiteMetadataStoreMdsApiApi();
String prefix = "prefix_example"; // String | DOI prefix
String project = "project_example"; // String | Project identifier
String doiName = "doiName_example"; // String | Record ID
String selectedRole = "selectedRole_example"; // String | the selected role when a user is connected to more than 2 roles.
try {
    String result = apiInstance.postMedia(prefix, project, doiName, selectedRole);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataCiteMetadataStoreMdsApiApi#postMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **prefix** | **String**| DOI prefix |
 **project** | **String**| Project identifier |
 **doiName** | **String**| Record ID |
 **selectedRole** | **String**| the selected role when a user is connected to more than 2 roles. | [optional]

### Return type

**String**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

