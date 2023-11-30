# Erc721Api

All URIs are relative to *https://vault-api.usemoon.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**approve**](Erc721Api.md#approve) | **POST** /erc721/{name}/approve | 
[**balanceOf**](Erc721Api.md#balanceOf) | **POST** /erc721/{name}/balance-of | 
[**getApproved**](Erc721Api.md#getApproved) | **POST** /erc721/{name}/get-approved | 
[**isApprovedForAll**](Erc721Api.md#isApprovedForAll) | **POST** /erc721/{name}/is-approved-for-all | 
[**name**](Erc721Api.md#name) | **POST** /erc721/{name}/name | 
[**ownerOf**](Erc721Api.md#ownerOf) | **POST** /erc721/{name}/owner-of | 
[**safeTransferFrom**](Erc721Api.md#safeTransferFrom) | **POST** /erc721/{name}/safe-transfer-from | 
[**setApprovalForAll**](Erc721Api.md#setApprovalForAll) | **POST** /erc721/{name}/set-approval-for-all | 
[**symbol**](Erc721Api.md#symbol) | **POST** /erc721/{name}/symbol | 
[**tokenUri**](Erc721Api.md#tokenUri) | **POST** /erc721/{name}/token-uri | 
[**transfer**](Erc721Api.md#transfer) | **POST** /erc721/{name}/transfer | 
[**transferFrom**](Erc721Api.md#transferFrom) | **POST** /erc721/{name}/transfer-from | 


<a id="approve"></a>
# **approve**
> AccountControllerResponse approve(authorization, name, erc721Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc721Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val erc721Request : Erc721Request =  // Erc721Request | 
try {
    val result : AccountControllerResponse = apiInstance.approve(authorization, name, erc721Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc721Api#approve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc721Api#approve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **erc721Request** | [**Erc721Request**](Erc721Request.md)|  |

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

<a id="balanceOf"></a>
# **balanceOf**
> AccountControllerResponse balanceOf(authorization, name, erc721Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc721Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val erc721Request : Erc721Request =  // Erc721Request | 
try {
    val result : AccountControllerResponse = apiInstance.balanceOf(authorization, name, erc721Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc721Api#balanceOf")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc721Api#balanceOf")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **erc721Request** | [**Erc721Request**](Erc721Request.md)|  |

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

<a id="getApproved"></a>
# **getApproved**
> AccountControllerResponse getApproved(authorization, name, erc721Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc721Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val erc721Request : Erc721Request =  // Erc721Request | 
try {
    val result : AccountControllerResponse = apiInstance.getApproved(authorization, name, erc721Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc721Api#getApproved")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc721Api#getApproved")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **erc721Request** | [**Erc721Request**](Erc721Request.md)|  |

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

<a id="isApprovedForAll"></a>
# **isApprovedForAll**
> AccountControllerResponse isApprovedForAll(authorization, name, erc721Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc721Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val erc721Request : Erc721Request =  // Erc721Request | 
try {
    val result : AccountControllerResponse = apiInstance.isApprovedForAll(authorization, name, erc721Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc721Api#isApprovedForAll")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc721Api#isApprovedForAll")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **erc721Request** | [**Erc721Request**](Erc721Request.md)|  |

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

<a id="name"></a>
# **name**
> AccountControllerResponse name(authorization, name, erc721Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc721Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val erc721Request : Erc721Request =  // Erc721Request | 
try {
    val result : AccountControllerResponse = apiInstance.name(authorization, name, erc721Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc721Api#name")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc721Api#name")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **erc721Request** | [**Erc721Request**](Erc721Request.md)|  |

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

<a id="ownerOf"></a>
# **ownerOf**
> AccountControllerResponse ownerOf(authorization, name, erc721Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc721Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val erc721Request : Erc721Request =  // Erc721Request | 
try {
    val result : AccountControllerResponse = apiInstance.ownerOf(authorization, name, erc721Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc721Api#ownerOf")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc721Api#ownerOf")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **erc721Request** | [**Erc721Request**](Erc721Request.md)|  |

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

<a id="safeTransferFrom"></a>
# **safeTransferFrom**
> AccountControllerResponse safeTransferFrom(authorization, name, erc721Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc721Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val erc721Request : Erc721Request =  // Erc721Request | 
try {
    val result : AccountControllerResponse = apiInstance.safeTransferFrom(authorization, name, erc721Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc721Api#safeTransferFrom")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc721Api#safeTransferFrom")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **erc721Request** | [**Erc721Request**](Erc721Request.md)|  |

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

<a id="setApprovalForAll"></a>
# **setApprovalForAll**
> AccountControllerResponse setApprovalForAll(authorization, name, erc721Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc721Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val erc721Request : Erc721Request =  // Erc721Request | 
try {
    val result : AccountControllerResponse = apiInstance.setApprovalForAll(authorization, name, erc721Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc721Api#setApprovalForAll")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc721Api#setApprovalForAll")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **erc721Request** | [**Erc721Request**](Erc721Request.md)|  |

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

<a id="symbol"></a>
# **symbol**
> AccountControllerResponse symbol(authorization, name, erc721Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc721Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val erc721Request : Erc721Request =  // Erc721Request | 
try {
    val result : AccountControllerResponse = apiInstance.symbol(authorization, name, erc721Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc721Api#symbol")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc721Api#symbol")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **erc721Request** | [**Erc721Request**](Erc721Request.md)|  |

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

<a id="tokenUri"></a>
# **tokenUri**
> AccountControllerResponse tokenUri(authorization, name, erc721Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc721Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val erc721Request : Erc721Request =  // Erc721Request | 
try {
    val result : AccountControllerResponse = apiInstance.tokenUri(authorization, name, erc721Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc721Api#tokenUri")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc721Api#tokenUri")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **erc721Request** | [**Erc721Request**](Erc721Request.md)|  |

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

<a id="transfer"></a>
# **transfer**
> AccountControllerResponse transfer(authorization, name, erc721Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc721Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val erc721Request : Erc721Request =  // Erc721Request | 
try {
    val result : AccountControllerResponse = apiInstance.transfer(authorization, name, erc721Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc721Api#transfer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc721Api#transfer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **erc721Request** | [**Erc721Request**](Erc721Request.md)|  |

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

<a id="transferFrom"></a>
# **transferFrom**
> AccountControllerResponse transferFrom(authorization, name, erc721Request)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = Erc721Api()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val name : kotlin.String = name_example // kotlin.String | 
val erc721Request : Erc721Request =  // Erc721Request | 
try {
    val result : AccountControllerResponse = apiInstance.transferFrom(authorization, name, erc721Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling Erc721Api#transferFrom")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling Erc721Api#transferFrom")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **name** | **kotlin.String**|  |
 **erc721Request** | [**Erc721Request**](Erc721Request.md)|  |

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

