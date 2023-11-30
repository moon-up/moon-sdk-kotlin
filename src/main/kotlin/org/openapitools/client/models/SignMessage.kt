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
 * @param `data` 
 * @param name 
 * @param encoding 
 * @param header 
 * @param signtype 
 */


data class SignMessage (

    @Json(name = "data")
    val `data`: kotlin.String,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "encoding")
    val encoding: kotlin.String? = null,

    @Json(name = "header")
    val header: kotlin.Boolean? = null,

    @Json(name = "signtype")
    val signtype: kotlin.Boolean? = null

)

