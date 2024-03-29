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

import org.usemoonai.moonsdk.models.TransactionData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param success 
 * @param message 
 * @param `data` 
 */


data class SignMessageAPIResponse (

    @Json(name = "success")
    val success: kotlin.Boolean,

    @Json(name = "message")
    val message: kotlin.String,

    @Json(name = "data")
    val `data`: TransactionData? = null

)

