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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param network 
 * @param privateKey 
 */


data class TronInput (

    @Json(name = "network")
    val network: kotlin.String? = null,

    @Json(name = "private_key")
    val privateKey: kotlin.String? = null

)

