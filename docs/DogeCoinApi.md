# DogeCoinApi

All URIs are relative to *https://vault-api.usemoon.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDogeCoinAccount**](DogeCoinApi.md#createDogeCoinAccount) | **POST** /dogecoin | 
[**getDogeCoinAccount**](DogeCoinApi.md#getDogeCoinAccount) | **GET** /dogecoin/{accountName} | 
[**listDogeCoinAccounts**](DogeCoinApi.md#listDogeCoinAccounts) | **GET** /dogecoin | 
[**signDogeCoinTransaction**](DogeCoinApi.md#signDogeCoinTransaction) | **POST** /dogecoin/{accountName}/sign-tx | 


<a id="createDogeCoinAccount"></a>
# **createDogeCoinAccount**
> AccountControllerResponse createDogeCoinAccount(authorization, dogeCoinInput)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DogeCoinApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val dogeCoinInput : DogeCoinInput =  // DogeCoinInput | 
try {
    val result : AccountControllerResponse = apiInstance.createDogeCoinAccount(authorization, dogeCoinInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DogeCoinApi#createDogeCoinAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DogeCoinApi#createDogeCoinAccount")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **dogeCoinInput** | [**DogeCoinInput**](DogeCoinInput.md)|  |

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

<a id="getDogeCoinAccount"></a>
# **getDogeCoinAccount**
> AccountControllerResponse getDogeCoinAccount(authorization, accountName)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DogeCoinApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val accountName : kotlin.String = accountName_example // kotlin.String | 
try {
    val result : AccountControllerResponse = apiInstance.getDogeCoinAccount(authorization, accountName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DogeCoinApi#getDogeCoinAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DogeCoinApi#getDogeCoinAccount")
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

<a id="listDogeCoinAccounts"></a>
# **listDogeCoinAccounts**
> AccountControllerResponse listDogeCoinAccounts(authorization)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DogeCoinApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
try {
    val result : AccountControllerResponse = apiInstance.listDogeCoinAccounts(authorization)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DogeCoinApi#listDogeCoinAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DogeCoinApi#listDogeCoinAccounts")
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

<a id="signDogeCoinTransaction"></a>
# **signDogeCoinTransaction**
> AccountControllerResponse signDogeCoinTransaction(authorization, accountName, dogeCoinTransactionInput)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DogeCoinApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val accountName : kotlin.String = accountName_example // kotlin.String | 
val dogeCoinTransactionInput : DogeCoinTransactionInput =  // DogeCoinTransactionInput | 
try {
    val result : AccountControllerResponse = apiInstance.signDogeCoinTransaction(authorization, accountName, dogeCoinTransactionInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DogeCoinApi#signDogeCoinTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DogeCoinApi#signDogeCoinTransaction")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **accountName** | **kotlin.String**|  |
 **dogeCoinTransactionInput** | [**DogeCoinTransactionInput**](DogeCoinTransactionInput.md)|  |

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

