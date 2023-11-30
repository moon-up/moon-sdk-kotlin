# PaymentApi

All URIs are relative to *https://vault-api.usemoon.ai*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moralisWebhook**](PaymentApi.md#moralisWebhook) | **POST** /payment/webhook/{id} | 
[**paymentCreatePaymentIntent**](PaymentApi.md#paymentCreatePaymentIntent) | **POST** /payment | 
[**paymentDeletePaymentIntent**](PaymentApi.md#paymentDeletePaymentIntent) | **DELETE** /payment/{id} | 
[**paymentGetAllPaymentIntents**](PaymentApi.md#paymentGetAllPaymentIntents) | **GET** /payment | 
[**paymentGetAvailableChains**](PaymentApi.md#paymentGetAvailableChains) | **GET** /payment/chains | 
[**paymentGetPaymentIntent**](PaymentApi.md#paymentGetPaymentIntent) | **GET** /payment/{id} | 
[**paymentUpdatePaymentIntent**](PaymentApi.md#paymentUpdatePaymentIntent) | **PUT** /payment/{id} | 
[**tatumWebhook**](PaymentApi.md#tatumWebhook) | **POST** /payment/tatum/webhook/{id} | 


<a id="moralisWebhook"></a>
# **moralisWebhook**
> kotlin.Any moralisWebhook(id, iwebhook)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentApi()
val id : kotlin.String = id_example // kotlin.String | 
val iwebhook : IWebhook =  // IWebhook | 
try {
    val result : kotlin.Any = apiInstance.moralisWebhook(id, iwebhook)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentApi#moralisWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentApi#moralisWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **iwebhook** | [**IWebhook**](IWebhook.md)|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

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

<a id="paymentCreatePaymentIntent"></a>
# **paymentCreatePaymentIntent**
> PaymentIntentResponse paymentCreatePaymentIntent(authorization, createPaymentIntentInput)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val createPaymentIntentInput : CreatePaymentIntentInput =  // CreatePaymentIntentInput | 
try {
    val result : PaymentIntentResponse = apiInstance.paymentCreatePaymentIntent(authorization, createPaymentIntentInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentApi#paymentCreatePaymentIntent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentApi#paymentCreatePaymentIntent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **createPaymentIntentInput** | [**CreatePaymentIntentInput**](CreatePaymentIntentInput.md)|  |

### Return type

[**PaymentIntentResponse**](PaymentIntentResponse.md)

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

<a id="paymentDeletePaymentIntent"></a>
# **paymentDeletePaymentIntent**
> PaymentIntentResponse paymentDeletePaymentIntent(authorization, id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : PaymentIntentResponse = apiInstance.paymentDeletePaymentIntent(authorization, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentApi#paymentDeletePaymentIntent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentApi#paymentDeletePaymentIntent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

[**PaymentIntentResponse**](PaymentIntentResponse.md)

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

<a id="paymentGetAllPaymentIntents"></a>
# **paymentGetAllPaymentIntents**
> kotlin.collections.List&lt;PaymentIntentResponse&gt; paymentGetAllPaymentIntents(authorization)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
try {
    val result : kotlin.collections.List<PaymentIntentResponse> = apiInstance.paymentGetAllPaymentIntents(authorization)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentApi#paymentGetAllPaymentIntents")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentApi#paymentGetAllPaymentIntents")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |

### Return type

[**kotlin.collections.List&lt;PaymentIntentResponse&gt;**](PaymentIntentResponse.md)

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

<a id="paymentGetAvailableChains"></a>
# **paymentGetAvailableChains**
> kotlin.collections.List&lt;kotlin.String&gt; paymentGetAvailableChains()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentApi()
try {
    val result : kotlin.collections.List<kotlin.String> = apiInstance.paymentGetAvailableChains()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentApi#paymentGetAvailableChains")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentApi#paymentGetAvailableChains")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.collections.List&lt;kotlin.String&gt;**

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

<a id="paymentGetPaymentIntent"></a>
# **paymentGetPaymentIntent**
> PaymentIntentResponse paymentGetPaymentIntent(authorization, id)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
try {
    val result : PaymentIntentResponse = apiInstance.paymentGetPaymentIntent(authorization, id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentApi#paymentGetPaymentIntent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentApi#paymentGetPaymentIntent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |

### Return type

[**PaymentIntentResponse**](PaymentIntentResponse.md)

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

<a id="paymentUpdatePaymentIntent"></a>
# **paymentUpdatePaymentIntent**
> PaymentIntentResponse paymentUpdatePaymentIntent(authorization, id, createPaymentIntentInput)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentApi()
val authorization : kotlin.String = authorization_example // kotlin.String | 
val id : kotlin.String = id_example // kotlin.String | 
val createPaymentIntentInput : CreatePaymentIntentInput =  // CreatePaymentIntentInput | 
try {
    val result : PaymentIntentResponse = apiInstance.paymentUpdatePaymentIntent(authorization, id, createPaymentIntentInput)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentApi#paymentUpdatePaymentIntent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentApi#paymentUpdatePaymentIntent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  |
 **id** | **kotlin.String**|  |
 **createPaymentIntentInput** | [**CreatePaymentIntentInput**](CreatePaymentIntentInput.md)|  |

### Return type

[**PaymentIntentResponse**](PaymentIntentResponse.md)

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

<a id="tatumWebhook"></a>
# **tatumWebhook**
> kotlin.Any tatumWebhook(id, body)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentApi()
val id : kotlin.String = id_example // kotlin.String | 
val body : kotlin.Any =  // kotlin.Any | 
try {
    val result : kotlin.Any = apiInstance.tatumWebhook(id, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentApi#tatumWebhook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentApi#tatumWebhook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**|  |
 **body** | **kotlin.Any**|  |

### Return type

[**kotlin.Any**](kotlin.Any.md)

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

