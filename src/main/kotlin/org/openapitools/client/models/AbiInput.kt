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
 * @param name 
 * @param type 
 * @param indexed 
 * @param components 
 * @param internalType 
 */


data class AbiInput (

    @Json(name = "name")
    val name: kotlin.String,

    @Json(name = "type")
    val type: kotlin.String,

    @Json(name = "indexed")
    val indexed: kotlin.Boolean? = null,

    @Json(name = "components")
    val components: kotlin.collections.List<AbiInput>? = null,

    @Json(name = "internalType")
    val internalType: kotlin.String? = null

)

