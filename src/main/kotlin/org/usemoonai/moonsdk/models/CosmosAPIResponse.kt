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

package org.usemoonai.moonsdk.models

import org.usemoonai.moonsdk.models.CosmosTransactionOutput

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param success 
 * @param message 
 * @param `data` 
 */


data class CosmosAPIResponse (

    @Json(name = "success")
    val success: kotlin.Boolean,

    @Json(name = "message")
    val message: kotlin.String,

    @Json(name = "data")
    val `data`: CosmosTransactionOutput? = null

)

