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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param icon 
 * @param name 
 * @param paymentTypeId 
 */


data class AvailablePaymentMethod (

    @Json(name = "icon")
    val icon: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "paymentTypeId")
    val paymentTypeId: kotlin.String

)

