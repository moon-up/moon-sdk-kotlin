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
 * @param to 
 * @param `value` 
 * @param network 
 * @param compress 
 */


data class DogeCoinTransactionInput (

    @Json(name = "to")
    val to: kotlin.String? = null,

    @Json(name = "value")
    val `value`: kotlin.Double? = null,

    @Json(name = "network")
    val network: kotlin.String? = null,

    @Json(name = "compress")
    val compress: kotlin.Boolean? = null

)

