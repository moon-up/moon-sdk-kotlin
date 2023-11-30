/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.PaymentType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param googlepay 
 * @param applepay 
 * @param creditcard 
 */


data class SupportedPaymentTypesMessage (

    @Json(name = "googlepay")
    val googlepay: PaymentType,

    @Json(name = "applepay")
    val applepay: PaymentType,

    @Json(name = "creditcard")
    val creditcard: PaymentType

)
