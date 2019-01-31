# MdsApi

All URIs are relative to *http://localhost:8182*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelDoiProject**](MdsApi.md#cancelDoiProject) | **DELETE** /mds/metadata/{doi_name} | 
[**getAllDoiMetadata**](MdsApi.md#getAllDoiMetadata) | **GET** /mds/metadata/{doi_name} | 
[**getAllDois**](MdsApi.md#getAllDois) | **GET** /mds/dois | 
[**getDoiMedia**](MdsApi.md#getDoiMedia) | **GET** /mds/media/{doi_name} | 
[**getLandingPageUrl**](MdsApi.md#getLandingPageUrl) | **GET** /mds/dois/{doi_name} | 
[**postDoi**](MdsApi.md#postDoi) | **POST** /mds/dois | 
[**postDoiMetada**](MdsApi.md#postDoiMetada) | **POST** /mds/metadata | 
[**postMedia**](MdsApi.md#postMedia) | **POST** /mds/media/{doi_name} | 


<a name="cancelDoiProject"></a>
# **cancelDoiProject**
> String cancelDoiProject(doiName)



This request marks a dataset as &#39;inactive&#39;

### Example
```java
// Import classes:
//import fr.cnes.doi.client.ApiClient;
//import fr.cnes.doi.client.ApiException;
//import fr.cnes.doi.client.Configuration;
//import fr.cnes.doi.client.auth.*;
//import fr.cnes.doi.client.api.MdsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

MdsApi apiInstance = new MdsApi();
String doiName = "doiName_example"; // String | doi project name
try {
    String result = apiInstance.cancelDoiProject(doiName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MdsApi#cancelDoiProject");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doiName** | **String**| doi project name |

### Return type

**String**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllDoiMetadata"></a>
# **getAllDoiMetadata**
> String getAllDoiMetadata(doiName)



Renvoie les metadata d&#39;un doi

### Example
```java
// Import classes:
//import fr.cnes.doi.client.ApiClient;
//import fr.cnes.doi.client.ApiException;
//import fr.cnes.doi.client.Configuration;
//import fr.cnes.doi.client.auth.*;
//import fr.cnes.doi.client.api.MdsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

MdsApi apiInstance = new MdsApi();
String doiName = "doiName_example"; // String | 
try {
    String result = apiInstance.getAllDoiMetadata(doiName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MdsApi#getAllDoiMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doiName** | **String**|  |

### Return type

**String**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml

<a name="getAllDois"></a>
# **getAllDois**
> String getAllDois()



Get all the dois

### Example
```java
// Import classes:
//import fr.cnes.doi.client.ApiClient;
//import fr.cnes.doi.client.ApiException;
//import fr.cnes.doi.client.Configuration;
//import fr.cnes.doi.client.auth.*;
//import fr.cnes.doi.client.api.MdsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

MdsApi apiInstance = new MdsApi();
try {
    String result = apiInstance.getAllDois();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MdsApi#getAllDois");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/uri-list

<a name="getDoiMedia"></a>
# **getDoiMedia**
> String getDoiMedia(doiName)



Retuen a list of pairs of media type and URLs

### Example
```java
// Import classes:
//import fr.cnes.doi.client.ApiClient;
//import fr.cnes.doi.client.ApiException;
//import fr.cnes.doi.client.Configuration;
//import fr.cnes.doi.client.auth.*;
//import fr.cnes.doi.client.api.MdsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

MdsApi apiInstance = new MdsApi();
String doiName = "doiName_example"; // String | DOI project name
try {
    String result = apiInstance.getDoiMedia(doiName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MdsApi#getDoiMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doiName** | **String**| DOI project name |

### Return type

**String**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/uri-list

<a name="getLandingPageUrl"></a>
# **getLandingPageUrl**
> String getLandingPageUrl(doiName)



Renvoie l&#39;url de la landing page du doi

### Example
```java
// Import classes:
//import fr.cnes.doi.client.ApiClient;
//import fr.cnes.doi.client.ApiException;
//import fr.cnes.doi.client.Configuration;
//import fr.cnes.doi.client.auth.*;
//import fr.cnes.doi.client.api.MdsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

MdsApi apiInstance = new MdsApi();
String doiName = "doiName_example"; // String | doi project name
try {
    String result = apiInstance.getLandingPageUrl(doiName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MdsApi#getLandingPageUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doiName** | **String**| doi project name |

### Return type

**String**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postDoi"></a>
# **postDoi**
> String postDoi(url, doi)



Create a **new** doi project or update the landing page url if it the project already exists

### Example
```java
// Import classes:
//import fr.cnes.doi.client.ApiClient;
//import fr.cnes.doi.client.ApiException;
//import fr.cnes.doi.client.Configuration;
//import fr.cnes.doi.client.auth.*;
//import fr.cnes.doi.client.api.MdsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

MdsApi apiInstance = new MdsApi();
String url = "url_example"; // String | the URL of the landing page
String doi = "doi_example"; // String | the project suffix, which is an unique identifier within the project
try {
    String result = apiInstance.postDoi(url, doi);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MdsApi#postDoi");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **url** | **String**| the URL of the landing page |
 **doi** | **String**| the project suffix, which is an unique identifier within the project |

### Return type

**String**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="postDoiMetada"></a>
# **postDoiMetada**
> String postDoiMetada(metada)



Create or update doi project metada

### Example
```java
// Import classes:
//import fr.cnes.doi.client.ApiClient;
//import fr.cnes.doi.client.ApiException;
//import fr.cnes.doi.client.Configuration;
//import fr.cnes.doi.client.auth.*;
//import fr.cnes.doi.client.api.MdsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

MdsApi apiInstance = new MdsApi();
String metada = "metada_example"; // String | metadata
try {
    String result = apiInstance.postDoiMetada(metada);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MdsApi#postDoiMetada");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metada** | **String**| metadata |

### Return type

**String**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: Not defined

<a name="postMedia"></a>
# **postMedia**
> String postMedia(doiName, data)



add an association media/url

### Example
```java
// Import classes:
//import fr.cnes.doi.client.ApiClient;
//import fr.cnes.doi.client.ApiException;
//import fr.cnes.doi.client.Configuration;
//import fr.cnes.doi.client.auth.*;
//import fr.cnes.doi.client.api.MdsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

MdsApi apiInstance = new MdsApi();
String doiName = "doiName_example"; // String | DOI project name
String data = "data_example"; // String | an association types de media/url
try {
    String result = apiInstance.postMedia(doiName, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MdsApi#postMedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doiName** | **String**| DOI project name |
 **data** | **String**| an association types de media/url |

### Return type

**String**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

