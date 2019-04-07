# DoiCitationFormatterApi

All URIs are relative to *https://localhost:8183*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCitation**](DoiCitationFormatterApi.md#getCitation) | **GET** /citation/format | 
[**getCitationsLanguage**](DoiCitationFormatterApi.md#getCitationsLanguage) | **GET** /citation/language | 
[**getCitationsStyle**](DoiCitationFormatterApi.md#getCitationsStyle) | **GET** /citation/style | 


<a name="getCitation"></a>
# **getCitation**
> String getCitation(doi, style, lang)



Returns the formatted citation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DoiCitationFormatterApi;


DoiCitationFormatterApi apiInstance = new DoiCitationFormatterApi();
String doi = "doi_example"; // String | DOI project name
String style = "style_example"; // String | style
String lang = "lang_example"; // String | langage
try {
    String result = apiInstance.getCitation(doi, style, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DoiCitationFormatterApi#getCitation");
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

No authorization required

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
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DoiCitationFormatterApi;


DoiCitationFormatterApi apiInstance = new DoiCitationFormatterApi();
try {
    List<String> result = apiInstance.getCitationsLanguage();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DoiCitationFormatterApi#getCitationsLanguage");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

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
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DoiCitationFormatterApi;


DoiCitationFormatterApi apiInstance = new DoiCitationFormatterApi();
try {
    List<String> result = apiInstance.getCitationsStyle();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DoiCitationFormatterApi#getCitationsStyle");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

