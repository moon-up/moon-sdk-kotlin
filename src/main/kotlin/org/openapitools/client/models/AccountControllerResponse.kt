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

import org.openapitools.client.models.AccountControllerResponseData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param `data` 
 * @param success 
 * @param message 
 */


data class AccountControllerResponse (

    @Json(name = "data")
    val `data`: AccountControllerResponseData? = null,

    @Json(name = "success")
    val success: kotlin.Boolean? = null,

    @Json(name = "message")
    val message: kotlin.String? = null

)

