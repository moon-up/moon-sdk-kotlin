# BitcoinApi

All URIs are relative to *https://vault-api.usemoon.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBitcoinAccount**](BitcoinApi.md#createBitcoinAccount) | **POST** /bitcoin | 
[**getBitcoinAccount**](BitcoinApi.md#getBitcoinAccount) | **GET** /bitcoin/{accountName} | 
[**listBitcoinAccounts**](BitcoinApi.md#listBitcoinAccounts) | **GET** /bitcoin | 
[**signBitcoinTransaction**](BitcoinApi.md#signBitcoinTransaction) | **POST** /bitcoin/{accountName}/sign-tx | 


<a id="createBitcoinAccount"></a>
# **createBitcoinAccount**
> AccountControllerResponse createBitcoinAccount(authorization, bitcoinInput)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BitcoinApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val bitcoinInput : BitcoinInput =  // BitcoinInput | 
try {
    val result : AccountControllerResponse = apiInstance.createBitcoinAccount(authorization, bitcoinInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BitcoinApi#createBitcoinAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BitcoinApi#createBitcoinAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **bitcoinInput** | [**BitcoinInput**](BitcoinInput.md)|  |

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

<a id="getBitcoinAccount"></a>
# **getBitcoinAccount**
> AccountControllerResponse getBitcoinAccount(authorization, accountName)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BitcoinApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val accountName : kotlin.String = accountName_example // kotlin.String | 
try {
    val result : AccountControllerResponse = apiInstance.getBitcoinAccount(authorization, accountName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BitcoinApi#getBitcoinAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BitcoinApi#getBitcoinAccount")
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

<a id="listBitcoinAccounts"></a>
# **listBitcoinAccounts**
> AccountControllerResponse listBitcoinAccounts(authorization)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BitcoinApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
try {
    val result : AccountControllerResponse = apiInstance.listBitcoinAccounts(authorization)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BitcoinApi#listBitcoinAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BitcoinApi#listBitcoinAccounts")
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

<a id="signBitcoinTransaction"></a>
# **signBitcoinTransaction**
> AccountControllerResponse signBitcoinTransaction(authorization, accountName, bitcoinTransactionInput)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BitcoinApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val accountName : kotlin.String = accountName_example // kotlin.String | 
val bitcoinTransactionInput : BitcoinTransactionInput =  // BitcoinTransactionInput | 
try {
    val result : AccountControllerResponse = apiInstance.signBitcoinTransaction(authorization, accountName, bitcoinTransactionInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BitcoinApi#signBitcoinTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BitcoinApi#signBitcoinTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **accountName** | **kotlin.String**|  |
 **bitcoinTransactionInput** | [**BitcoinTransactionInput**](BitcoinTransactionInput.md)|  |

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

