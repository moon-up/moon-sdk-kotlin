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

import org.openapitools.client.models.GetSupportedOnRampsResponseMessageInnerIconsPng

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param png 
 * @param svg 
 */


data class GetSupportedOnRampsResponseMessageInnerIcons (

    @Json(name = "png")
    val png: GetSupportedOnRampsResponseMessageInnerIconsPng,

    @Json(name = "svg")
    val svg: kotlin.String

)
