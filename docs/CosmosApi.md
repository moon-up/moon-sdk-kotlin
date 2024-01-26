# CosmosApi

All URIs are relative to *https://vault-api.usemoon.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCosmosAccount**](CosmosApi.md#createCosmosAccount) | **POST** /cosmos | 
[**getCosmosAccount**](CosmosApi.md#getCosmosAccount) | **GET** /cosmos/{accountName} | 
[**listCosmosAccounts**](CosmosApi.md#listCosmosAccounts) | **GET** /cosmos | 
[**signCosmosTransaction**](CosmosApi.md#signCosmosTransaction) | **POST** /cosmos/{accountName}/sign-tx | 


<a id="createCosmosAccount"></a>
# **createCosmosAccount**
> AccountControllerResponse createCosmosAccount(authorization, cosmosInput)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = CosmosApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val cosmosInput : CosmosInput =  // CosmosInput | 
try {
    val result : AccountControllerResponse = apiInstance.createCosmosAccount(authorization, cosmosInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CosmosApi#createCosmosAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CosmosApi#createCosmosAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **cosmosInput** | [**CosmosInput**](CosmosInput.md)|  |

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

<a id="getCosmosAccount"></a>
# **getCosmosAccount**
> AccountControllerResponse getCosmosAccount(authorization, accountName)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = CosmosApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val accountName : kotlin.String = accountName_example // kotlin.String | 
try {
    val result : AccountControllerResponse = apiInstance.getCosmosAccount(authorization, accountName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CosmosApi#getCosmosAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CosmosApi#getCosmosAccount")
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

<a id="listCosmosAccounts"></a>
# **listCosmosAccounts**
> AccountControllerResponse listCosmosAccounts(authorization)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = CosmosApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
try {
    val result : AccountControllerResponse = apiInstance.listCosmosAccounts(authorization)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CosmosApi#listCosmosAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CosmosApi#listCosmosAccounts")
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

<a id="signCosmosTransaction"></a>
# **signCosmosTransaction**
> AccountControllerResponse signCosmosTransaction(authorization, accountName, cosmosTransactionInput)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = CosmosApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val accountName : kotlin.String = accountName_example // kotlin.String | 
val cosmosTransactionInput : CosmosTransactionInput =  // CosmosTransactionInput | 
try {
    val result : AccountControllerResponse = apiInstance.signCosmosTransaction(authorization, accountName, cosmosTransactionInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CosmosApi#signCosmosTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CosmosApi#signCosmosTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **accountName** | **kotlin.String**|  |
 **cosmosTransactionInput** | [**CosmosTransactionInput**](CosmosTransactionInput.md)|  |

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

