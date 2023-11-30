# EosApi

All URIs are relative to *https://vault-api.usemoon.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEosAccount**](EosApi.md#createEosAccount) | **POST** /eos | 
[**getEosAccount**](EosApi.md#getEosAccount) | **GET** /eos/{accountName} | 
[**listEosAccounts**](EosApi.md#listEosAccounts) | **GET** /eos | 
[**signEosTransaction**](EosApi.md#signEosTransaction) | **POST** /eos/{accountName}/sign-tx | 


<a id="createEosAccount"></a>
# **createEosAccount**
> AccountControllerResponse createEosAccount(authorization, eosInput)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EosApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val eosInput : EosInput =  // EosInput | 
try {
    val result : AccountControllerResponse = apiInstance.createEosAccount(authorization, eosInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EosApi#createEosAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EosApi#createEosAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **eosInput** | [**EosInput**](EosInput.md)|  |

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

<a id="getEosAccount"></a>
# **getEosAccount**
> AccountControllerResponse getEosAccount(authorization, accountName)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EosApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val accountName : kotlin.String = accountName_example // kotlin.String | 
try {
    val result : AccountControllerResponse = apiInstance.getEosAccount(authorization, accountName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EosApi#getEosAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EosApi#getEosAccount")
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

<a id="listEosAccounts"></a>
# **listEosAccounts**
> AccountControllerResponse listEosAccounts(authorization)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EosApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
try {
    val result : AccountControllerResponse = apiInstance.listEosAccounts(authorization)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EosApi#listEosAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EosApi#listEosAccounts")
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

<a id="signEosTransaction"></a>
# **signEosTransaction**
> AccountControllerResponse signEosTransaction(authorization, accountName, eosTransactionInput)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EosApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val accountName : kotlin.String = accountName_example // kotlin.String | 
val eosTransactionInput : EosTransactionInput =  // EosTransactionInput | 
try {
    val result : AccountControllerResponse = apiInstance.signEosTransaction(authorization, accountName, eosTransactionInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EosApi#signEosTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EosApi#signEosTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **accountName** | **kotlin.String**|  |
 **eosTransactionInput** | [**EosTransactionInput**](EosTransactionInput.md)|  |

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

