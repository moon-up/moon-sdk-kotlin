# Erc20Api

All URIs are relative to *https://vault-api.usemoon.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allowanceErc20**](Erc20Api.md#allowanceErc20) | **POST** /erc20/{name}/allowance | 
[**approveErc20**](Erc20Api.md#approveErc20) | **POST** /erc20/{name}/approve | 
[**balanceOfErc20**](Erc20Api.md#balanceOfErc20) | **POST** /erc20/{name}/balance-of | 
[**decimalsErc20**](Erc20Api.md#decimalsErc20) | **POST** /erc20/{name}/decimals | 
[**nameErc20**](Erc20Api.md#nameErc20) | **POST** /erc20/{name}/name | 
[**symbolErc20**](Erc20Api.md#symbolErc20) | **POST** /erc20/{name}/symbol | 
[**totalSupplyErc20**](Erc20Api.md#totalSupplyErc20) | **POST** /erc20/{name}/total-supply | 
[**transferErc20**](Erc20Api.md#transferErc20) | **POST** /erc20/{name}/transfer | 
[**transferFromErc20**](Erc20Api.md#transferFromErc20) | **POST** /erc20/{name}/transfer-from | 


<a id="allowanceErc20"></a>
# **allowanceErc20**
> AccountControllerResponse allowanceErc20(authorization, name, inputBody)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc20Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val inputBody : InputBody =  // InputBody | 
try {
    val result : AccountControllerResponse = apiInstance.allowanceErc20(authorization, name, inputBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc20Api#allowanceErc20")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc20Api#allowanceErc20")
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

<a id="approveErc20"></a>
# **approveErc20**
> AccountControllerResponse approveErc20(authorization, name, inputBody)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc20Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val inputBody : InputBody =  // InputBody | 
try {
    val result : AccountControllerResponse = apiInstance.approveErc20(authorization, name, inputBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc20Api#approveErc20")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc20Api#approveErc20")
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

<a id="balanceOfErc20"></a>
# **balanceOfErc20**
> AccountControllerResponse balanceOfErc20(authorization, name, inputBody)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc20Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val inputBody : InputBody =  // InputBody | 
try {
    val result : AccountControllerResponse = apiInstance.balanceOfErc20(authorization, name, inputBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc20Api#balanceOfErc20")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc20Api#balanceOfErc20")
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

<a id="decimalsErc20"></a>
# **decimalsErc20**
> AccountControllerResponse decimalsErc20(authorization, name, inputBody)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc20Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val inputBody : InputBody =  // InputBody | 
try {
    val result : AccountControllerResponse = apiInstance.decimalsErc20(authorization, name, inputBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc20Api#decimalsErc20")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc20Api#decimalsErc20")
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

<a id="nameErc20"></a>
# **nameErc20**
> AccountControllerResponse nameErc20(authorization, name, inputBody)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc20Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val inputBody : InputBody =  // InputBody | 
try {
    val result : AccountControllerResponse = apiInstance.nameErc20(authorization, name, inputBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc20Api#nameErc20")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc20Api#nameErc20")
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

<a id="symbolErc20"></a>
# **symbolErc20**
> AccountControllerResponse symbolErc20(authorization, name, inputBody)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc20Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val inputBody : InputBody =  // InputBody | 
try {
    val result : AccountControllerResponse = apiInstance.symbolErc20(authorization, name, inputBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc20Api#symbolErc20")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc20Api#symbolErc20")
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

<a id="totalSupplyErc20"></a>
# **totalSupplyErc20**
> AccountControllerResponse totalSupplyErc20(authorization, name, inputBody)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc20Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val inputBody : InputBody =  // InputBody | 
try {
    val result : AccountControllerResponse = apiInstance.totalSupplyErc20(authorization, name, inputBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc20Api#totalSupplyErc20")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc20Api#totalSupplyErc20")
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

<a id="transferErc20"></a>
# **transferErc20**
> AccountControllerResponse transferErc20(authorization, name, inputBody)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc20Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val inputBody : InputBody =  // InputBody | 
try {
    val result : AccountControllerResponse = apiInstance.transferErc20(authorization, name, inputBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc20Api#transferErc20")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc20Api#transferErc20")
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

<a id="transferFromErc20"></a>
# **transferFromErc20**
> AccountControllerResponse transferFromErc20(authorization, name, inputBody)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc20Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val inputBody : InputBody =  // InputBody | 
try {
    val result : AccountControllerResponse = apiInstance.transferFromErc20(authorization, name, inputBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc20Api#transferFromErc20")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc20Api#transferFromErc20")
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

