# TronApi

All URIs are relative to *https://vault-api.usemoon.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTronAccount**](TronApi.md#createTronAccount) | **POST** /tron | 
[**getTronAccount**](TronApi.md#getTronAccount) | **GET** /tron/{accountName} | 
[**listTronAccounts**](TronApi.md#listTronAccounts) | **GET** /tron | 
[**signTronTransaction**](TronApi.md#signTronTransaction) | **POST** /tron/{accountName}/sign-tx | 


<a id="createTronAccount"></a>
# **createTronAccount**
> AccountControllerResponse createTronAccount(authorization, tronInput)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = TronApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val tronInput : TronInput =  // TronInput | 
try {
    val result : AccountControllerResponse = apiInstance.createTronAccount(authorization, tronInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TronApi#createTronAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TronApi#createTronAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **tronInput** | [**TronInput**](TronInput.md)|  |

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

<a id="getTronAccount"></a>
# **getTronAccount**
> AccountControllerResponse getTronAccount(authorization, accountName)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = TronApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val accountName : kotlin.String = accountName_example // kotlin.String | 
try {
    val result : AccountControllerResponse = apiInstance.getTronAccount(authorization, accountName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TronApi#getTronAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TronApi#getTronAccount")
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

<a id="listTronAccounts"></a>
# **listTronAccounts**
> AccountControllerResponse listTronAccounts(authorization)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = TronApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
try {
    val result : AccountControllerResponse = apiInstance.listTronAccounts(authorization)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TronApi#listTronAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TronApi#listTronAccounts")
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

<a id="signTronTransaction"></a>
# **signTronTransaction**
> AccountControllerResponse signTronTransaction(authorization, accountName, tronTransactionInput)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = TronApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val accountName : kotlin.String = accountName_example // kotlin.String | 
val tronTransactionInput : TronTransactionInput =  // TronTransactionInput | 
try {
    val result : AccountControllerResponse = apiInstance.signTronTransaction(authorization, accountName, tronTransactionInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TronApi#signTronTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TronApi#signTronTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **accountName** | **kotlin.String**|  |
 **tronTransactionInput** | [**TronTransactionInput**](TronTransactionInput.md)|  |

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

