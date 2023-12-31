# RippleApi

All URIs are relative to *https://vault-api.usemoon.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRippleAccount**](RippleApi.md#createRippleAccount) | **POST** /ripple | 
[**getRippleAccount**](RippleApi.md#getRippleAccount) | **GET** /ripple/{accountName} | 
[**listRippleAccounts**](RippleApi.md#listRippleAccounts) | **GET** /ripple | 
[**signRippleTransaction**](RippleApi.md#signRippleTransaction) | **POST** /ripple/{accountName}/sign-tx | 


<a id="createRippleAccount"></a>
# **createRippleAccount**
> AccountControllerResponse createRippleAccount(authorization, rippleInput)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RippleApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val rippleInput : RippleInput =  // RippleInput | 
try {
    val result : AccountControllerResponse = apiInstance.createRippleAccount(authorization, rippleInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RippleApi#createRippleAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RippleApi#createRippleAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **rippleInput** | [**RippleInput**](RippleInput.md)|  |

### Return type

[**AccountControllerResponse**](AccountControllerResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""
Configure BearerAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getRippleAccount"></a>
# **getRippleAccount**
> AccountControllerResponse getRippleAccount(authorization, accountName)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RippleApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val accountName : kotlin.String = accountName_example // kotlin.String | 
try {
    val result : AccountControllerResponse = apiInstance.getRippleAccount(authorization, accountName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RippleApi#getRippleAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RippleApi#getRippleAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **accountName** | **kotlin.String**|  |

### Return type

[**AccountControllerResponse**](AccountControllerResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""
Configure BearerAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="listRippleAccounts"></a>
# **listRippleAccounts**
> AccountControllerResponse listRippleAccounts(authorization)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RippleApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
try {
    val result : AccountControllerResponse = apiInstance.listRippleAccounts(authorization)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RippleApi#listRippleAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RippleApi#listRippleAccounts")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |

### Return type

[**AccountControllerResponse**](AccountControllerResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""
Configure BearerAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="signRippleTransaction"></a>
# **signRippleTransaction**
> AccountControllerResponse signRippleTransaction(authorization, accountName, rippleTransactionInput)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RippleApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val accountName : kotlin.String = accountName_example // kotlin.String | 
val rippleTransactionInput : RippleTransactionInput =  // RippleTransactionInput | 
try {
    val result : AccountControllerResponse = apiInstance.signRippleTransaction(authorization, accountName, rippleTransactionInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RippleApi#signRippleTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RippleApi#signRippleTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **accountName** | **kotlin.String**|  |
 **rippleTransactionInput** | [**RippleTransactionInput**](RippleTransactionInput.md)|  |

### Return type

[**AccountControllerResponse**](AccountControllerResponse.md)

### Authorization


Configure ApiKeyAuth:
    ApiClient.apiKey["x-api-key"] = ""
    ApiClient.apiKeyPrefix["x-api-key"] = ""
Configure BearerAuth:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

