# AaveApi

All URIs are relative to *https://vault-api.usemoon.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**borrow**](AaveApi.md#borrow) | **POST** /aave/{name}/borrow | 
[**lend**](AaveApi.md#lend) | **POST** /aave/{name}/lend | 
[**repay**](AaveApi.md#repay) | **POST** /aave/{name}/repay | 
[**userReserveData**](AaveApi.md#userReserveData) | **POST** /aave/{name}/user-reserve-data | 


<a id="borrow"></a>
# **borrow**
> AccountControllerResponse borrow(authorization, name, aaveInput)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = AaveApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val aaveInput : AaveInput =  // AaveInput | 
try {
    val result : AccountControllerResponse = apiInstance.borrow(authorization, name, aaveInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AaveApi#borrow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AaveApi#borrow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **aaveInput** | [**AaveInput**](AaveInput.md)|  |

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

<a id="lend"></a>
# **lend**
> AccountControllerResponse lend(authorization, name, aaveInput)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = AaveApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val aaveInput : AaveInput =  // AaveInput | 
try {
    val result : AccountControllerResponse = apiInstance.lend(authorization, name, aaveInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AaveApi#lend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AaveApi#lend")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **aaveInput** | [**AaveInput**](AaveInput.md)|  |

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

<a id="repay"></a>
# **repay**
> AccountControllerResponse repay(authorization, name, aaveInput)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = AaveApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val aaveInput : AaveInput =  // AaveInput | 
try {
    val result : AccountControllerResponse = apiInstance.repay(authorization, name, aaveInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AaveApi#repay")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AaveApi#repay")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **aaveInput** | [**AaveInput**](AaveInput.md)|  |

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

<a id="userReserveData"></a>
# **userReserveData**
> AccountControllerResponse userReserveData(authorization, name, aaveInput)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = AaveApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val aaveInput : AaveInput =  // AaveInput | 
try {
    val result : AccountControllerResponse = apiInstance.userReserveData(authorization, name, aaveInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AaveApi#userReserveData")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AaveApi#userReserveData")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **aaveInput** | [**AaveInput**](AaveInput.md)|  |

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

