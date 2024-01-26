# ERC1155Api

All URIs are relative to *https://vault-api.usemoon.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**balanceOf**](ERC1155Api.md#balanceOf) | **POST** /erc1155/{name}/balance-of | 
[**balanceOfBatch**](ERC1155Api.md#balanceOfBatch) | **POST** /erc1155/{name}/balance-of-batch | 
[**isApprovedForAll**](ERC1155Api.md#isApprovedForAll) | **POST** /erc1155/{name}/is-approved-for-all | 
[**safeBatchTransferFrom**](ERC1155Api.md#safeBatchTransferFrom) | **POST** /erc1155/{name}/safe-batch-transfer-from | 
[**safeTransferFrom**](ERC1155Api.md#safeTransferFrom) | **POST** /erc1155/{name}/safe-transfer-from | 
[**setApprovalForAll**](ERC1155Api.md#setApprovalForAll) | **POST** /erc1155/{name}/set-approval-for-all | 


<a id="balanceOf"></a>
# **balanceOf**
> AccountControllerResponse balanceOf(name, authorization, erc1155Request)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = ERC1155Api()
val name : kotlin.String = name_example // kotlin.String | 
val authorization : kotlin.String = authorization_example // kotlin.String | 
val erc1155Request : Erc1155Request =  // Erc1155Request | 
try {
    val result : AccountControllerResponse = apiInstance.balanceOf(name, authorization, erc1155Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ERC1155Api#balanceOf")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ERC1155Api#balanceOf")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **authorization** | **kotlin.String**|  |
 **erc1155Request** | [**Erc1155Request**](Erc1155Request.md)|  |

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

<a id="balanceOfBatch"></a>
# **balanceOfBatch**
> AccountControllerResponse balanceOfBatch(name, authorization, erc1155Request)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = ERC1155Api()
val name : kotlin.String = name_example // kotlin.String | 
val authorization : kotlin.String = authorization_example // kotlin.String | 
val erc1155Request : Erc1155Request =  // Erc1155Request | 
try {
    val result : AccountControllerResponse = apiInstance.balanceOfBatch(name, authorization, erc1155Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ERC1155Api#balanceOfBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ERC1155Api#balanceOfBatch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **authorization** | **kotlin.String**|  |
 **erc1155Request** | [**Erc1155Request**](Erc1155Request.md)|  |

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
> AccountControllerResponse isApprovedForAll(name, authorization, erc1155Request)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = ERC1155Api()
val name : kotlin.String = name_example // kotlin.String | 
val authorization : kotlin.String = authorization_example // kotlin.String | 
val erc1155Request : Erc1155Request =  // Erc1155Request | 
try {
    val result : AccountControllerResponse = apiInstance.isApprovedForAll(name, authorization, erc1155Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ERC1155Api#isApprovedForAll")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ERC1155Api#isApprovedForAll")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **authorization** | **kotlin.String**|  |
 **erc1155Request** | [**Erc1155Request**](Erc1155Request.md)|  |

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

<a id="safeBatchTransferFrom"></a>
# **safeBatchTransferFrom**
> AccountControllerResponse safeBatchTransferFrom(name, authorization, erc1155Request)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = ERC1155Api()
val name : kotlin.String = name_example // kotlin.String | 
val authorization : kotlin.String = authorization_example // kotlin.String | 
val erc1155Request : Erc1155Request =  // Erc1155Request | 
try {
    val result : AccountControllerResponse = apiInstance.safeBatchTransferFrom(name, authorization, erc1155Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ERC1155Api#safeBatchTransferFrom")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ERC1155Api#safeBatchTransferFrom")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **authorization** | **kotlin.String**|  |
 **erc1155Request** | [**Erc1155Request**](Erc1155Request.md)|  |

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
> AccountControllerResponse safeTransferFrom(name, authorization, erc1155Request)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = ERC1155Api()
val name : kotlin.String = name_example // kotlin.String | 
val authorization : kotlin.String = authorization_example // kotlin.String | 
val erc1155Request : Erc1155Request =  // Erc1155Request | 
try {
    val result : AccountControllerResponse = apiInstance.safeTransferFrom(name, authorization, erc1155Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ERC1155Api#safeTransferFrom")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ERC1155Api#safeTransferFrom")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **authorization** | **kotlin.String**|  |
 **erc1155Request** | [**Erc1155Request**](Erc1155Request.md)|  |

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
> AccountControllerResponse setApprovalForAll(name, authorization, erc1155Request)



### Example
```kotlin
// Import classes:
//import org.usemoonai.moonsdk.infrastructure.*
//import org.usemoonai.moonsdk.models.*

val apiInstance = ERC1155Api()
val name : kotlin.String = name_example // kotlin.String | 
val authorization : kotlin.String = authorization_example // kotlin.String | 
val erc1155Request : Erc1155Request =  // Erc1155Request | 
try {
    val result : AccountControllerResponse = apiInstance.setApprovalForAll(name, authorization, erc1155Request)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ERC1155Api#setApprovalForAll")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ERC1155Api#setApprovalForAll")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **kotlin.String**|  |
 **authorization** | **kotlin.String**|  |
 **erc1155Request** | [**Erc1155Request**](Erc1155Request.md)|  |

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

