# CitationApi

All URIs are relative to *http://localhost:8182*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCitation**](CitationApi.md#getCitation) | **GET** /citation/format | 
[**getCitationsLanguage**](CitationApi.md#getCitationsLanguage) | **GET** /citation/language | 
[**getCitationsStyle**](CitationApi.md#getCitationsStyle) | **GET** /citation/style | 


<a name="getCitation"></a>
# **getCitation**
> String getCitation(doi, style, lang)



Returns the formatted citation

### Example
```java
// Import classes:
//import fr.cnes.doi.client.ApiClient;
//import fr.cnes.doi.client.ApiException;
//import fr.cnes.doi.client.Configuration;
//import fr.cnes.doi.client.auth.*;
//import fr.cnes.doi.client.api.CitationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

CitationApi apiInstance = new CitationApi();
String doi = "doi_example"; // String | DOI project name
String style = "style_example"; // String | style
String lang = "lang_example"; // String | langage
try {
    String result = apiInstance.getCitation(doi, style, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CitationApi#getCitation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doi** | **String**| DOI project name |
 **style** | **String**| style |
 **lang** | **String**| langage |

### Return type

**String**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCitationsLanguage"></a>
# **getCitationsLanguage**
> List&lt;String&gt; getCitationsLanguage()



Renvoie la liste des langages disponibles

### Example
```java
// Import classes:
//import fr.cnes.doi.client.ApiClient;
//import fr.cnes.doi.client.ApiException;
//import fr.cnes.doi.client.Configuration;
//import fr.cnes.doi.client.auth.*;
//import fr.cnes.doi.client.api.CitationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

CitationApi apiInstance = new CitationApi();
try {
    List<String> result = apiInstance.getCitationsLanguage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CitationApi#getCitationsLanguage");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCitationsStyle"></a>
# **getCitationsStyle**
> List&lt;String&gt; getCitationsStyle()



Renvoie la liste des styles disponibles

### Example
```java
// Import classes:
//import fr.cnes.doi.client.ApiClient;
//import fr.cnes.doi.client.ApiException;
//import fr.cnes.doi.client.Configuration;
//import fr.cnes.doi.client.auth.*;
//import fr.cnes.doi.client.api.CitationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: APIKeyHeader
ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
APIKeyHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//APIKeyHeader.setApiKeyPrefix("Token");

CitationApi apiInstance = new CitationApi();
try {
    List<String> result = apiInstance.getCitationsStyle();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CitationApi#getCitationsStyle");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

