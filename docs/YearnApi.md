# YearnApi

All URIs are relative to *https://vault-api.usemoon.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLiquidity**](YearnApi.md#addLiquidity) | **POST** /yearn/{name}/add-liquidity | 
[**addLiquidityWeth**](YearnApi.md#addLiquidityWeth) | **POST** /yearn/{name}/add-liquidity-weth | 
[**removeLiquidity**](YearnApi.md#removeLiquidity) | **POST** /yearn/{name}/remove-liquidity | 
[**removeLiquidityWeth**](YearnApi.md#removeLiquidityWeth) | **POST** /yearn/{name}/remove-liquidity-weth | 


<a id="addLiquidity"></a>
# **addLiquidity**
> AccountControllerResponse addLiquidity(authorization, name, inputBody)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = YearnApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val inputBody : InputBody =  // InputBody | 
try {
    val result : AccountControllerResponse = apiInstance.addLiquidity(authorization, name, inputBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YearnApi#addLiquidity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YearnApi#addLiquidity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **inputBody** | [**InputBody**](InputBody.md)|  |

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

<a id="addLiquidityWeth"></a>
# **addLiquidityWeth**
> AccountControllerResponse addLiquidityWeth(authorization, name, inputBody)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = YearnApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val inputBody : InputBody =  // InputBody | 
try {
    val result : AccountControllerResponse = apiInstance.addLiquidityWeth(authorization, name, inputBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YearnApi#addLiquidityWeth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YearnApi#addLiquidityWeth")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **inputBody** | [**InputBody**](InputBody.md)|  |

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

<a id="removeLiquidity"></a>
# **removeLiquidity**
> AccountControllerResponse removeLiquidity(authorization, name, inputBody)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = YearnApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val inputBody : InputBody =  // InputBody | 
try {
    val result : AccountControllerResponse = apiInstance.removeLiquidity(authorization, name, inputBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YearnApi#removeLiquidity")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YearnApi#removeLiquidity")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **inputBody** | [**InputBody**](InputBody.md)|  |

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

<a id="removeLiquidityWeth"></a>
# **removeLiquidityWeth**
> AccountControllerResponse removeLiquidityWeth(authorization, name, inputBody)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = YearnApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val inputBody : InputBody =  // InputBody | 
try {
    val result : AccountControllerResponse = apiInstance.removeLiquidityWeth(authorization, name, inputBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling YearnApi#removeLiquidityWeth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling YearnApi#removeLiquidityWeth")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **inputBody** | [**InputBody**](InputBody.md)|  |

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

