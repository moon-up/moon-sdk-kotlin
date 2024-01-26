# BitcoincashApi

All URIs are relative to *https://vault-api.usemoon.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBitcoinCashAccount**](BitcoincashApi.md#createBitcoinCashAccount) | **POST** /bitcoincash | 
[**getBitcoinCashAccount**](BitcoincashApi.md#getBitcoinCashAccount) | **GET** /bitcoincash/{accountName} | 
[**listBitcoinCashAccounts**](BitcoincashApi.md#listBitcoinCashAccounts) | **GET** /bitcoincash | 
[**signBitcoinCashTransaction**](BitcoincashApi.md#signBitcoinCashTransaction) | **POST** /bitcoincash/{accountName}/sign-tx | 


<a id="createBitcoinCashAccount"></a>
# **createBitcoinCashAccount**
> AccountControllerResponse createBitcoinCashAccount(authorization, bitcoinCashInput)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = BitcoincashApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val bitcoinCashInput : BitcoinCashInput =  // BitcoinCashInput | 
try {
    val result : AccountControllerResponse = apiInstance.createBitcoinCashAccount(authorization, bitcoinCashInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BitcoincashApi#createBitcoinCashAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BitcoincashApi#createBitcoinCashAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **bitcoinCashInput** | [**BitcoinCashInput**](BitcoinCashInput.md)|  |

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

<a id="getBitcoinCashAccount"></a>
# **getBitcoinCashAccount**
> AccountControllerResponse getBitcoinCashAccount(authorization, accountName)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = BitcoincashApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val accountName : kotlin.String = accountName_example // kotlin.String | 
try {
    val result : AccountControllerResponse = apiInstance.getBitcoinCashAccount(authorization, accountName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BitcoincashApi#getBitcoinCashAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BitcoincashApi#getBitcoinCashAccount")
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

<a id="listBitcoinCashAccounts"></a>
# **listBitcoinCashAccounts**
> AccountControllerResponse listBitcoinCashAccounts(authorization)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = BitcoincashApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
try {
    val result : AccountControllerResponse = apiInstance.listBitcoinCashAccounts(authorization)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BitcoincashApi#listBitcoinCashAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BitcoincashApi#listBitcoinCashAccounts")
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

<a id="signBitcoinCashTransaction"></a>
# **signBitcoinCashTransaction**
> AccountControllerResponse signBitcoinCashTransaction(authorization, accountName, bitcoinCashTransactionInput)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = BitcoincashApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val accountName : kotlin.String = accountName_example // kotlin.String | 
val bitcoinCashTransactionInput : BitcoinCashTransactionInput =  // BitcoinCashTransactionInput | 
try {
    val result : AccountControllerResponse = apiInstance.signBitcoinCashTransaction(authorization, accountName, bitcoinCashTransactionInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BitcoincashApi#signBitcoinCashTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BitcoincashApi#signBitcoinCashTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **accountName** | **kotlin.String**|  |
 **bitcoinCashTransactionInput** | [**BitcoinCashTransactionInput**](BitcoinCashTransactionInput.md)|  |

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

