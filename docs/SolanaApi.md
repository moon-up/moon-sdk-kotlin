# SolanaApi

All URIs are relative to *https://vault-api.usemoon.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSolanaAccount**](SolanaApi.md#createSolanaAccount) | **POST** /solana | 
[**getSolanaAccount**](SolanaApi.md#getSolanaAccount) | **GET** /solana/{accountName} | 
[**listSolanaAccounts**](SolanaApi.md#listSolanaAccounts) | **GET** /solana | 
[**signSolanaTransaction**](SolanaApi.md#signSolanaTransaction) | **POST** /solana/{accountName}/sign-tx | 


<a id="createSolanaAccount"></a>
# **createSolanaAccount**
> AccountControllerResponse createSolanaAccount(authorization, solanaInput)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = SolanaApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val solanaInput : SolanaInput =  // SolanaInput | 
try {
    val result : AccountControllerResponse = apiInstance.createSolanaAccount(authorization, solanaInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaApi#createSolanaAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaApi#createSolanaAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **solanaInput** | [**SolanaInput**](SolanaInput.md)|  |

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

<a id="getSolanaAccount"></a>
# **getSolanaAccount**
> AccountControllerResponse getSolanaAccount(authorization, accountName)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = SolanaApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val accountName : kotlin.String = accountName_example // kotlin.String | 
try {
    val result : AccountControllerResponse = apiInstance.getSolanaAccount(authorization, accountName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaApi#getSolanaAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaApi#getSolanaAccount")
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

<a id="listSolanaAccounts"></a>
# **listSolanaAccounts**
> AccountControllerResponse listSolanaAccounts(authorization)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = SolanaApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
try {
    val result : AccountControllerResponse = apiInstance.listSolanaAccounts(authorization)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaApi#listSolanaAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaApi#listSolanaAccounts")
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

<a id="signSolanaTransaction"></a>
# **signSolanaTransaction**
> AccountControllerResponse signSolanaTransaction(authorization, accountName, solanaTransactionInput)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = SolanaApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val accountName : kotlin.String = accountName_example // kotlin.String | 
val solanaTransactionInput : SolanaTransactionInput =  // SolanaTransactionInput | 
try {
    val result : AccountControllerResponse = apiInstance.signSolanaTransaction(authorization, accountName, solanaTransactionInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SolanaApi#signSolanaTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SolanaApi#signSolanaTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **accountName** | **kotlin.String**|  |
 **solanaTransactionInput** | [**SolanaTransactionInput**](SolanaTransactionInput.md)|  |

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

