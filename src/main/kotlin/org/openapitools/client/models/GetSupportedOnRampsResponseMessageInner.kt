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

import org.openapitools.client.models.GetSupportedOnRampsResponseMessageInnerIcons

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id 
 * @param displayName 
 * @param icons 
 * @param icon 
 */


data class GetSupportedOnRampsResponseMessageInner (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "displayName")
    val displayName: kotlin.String,

    @Json(name = "icons")
    val icons: GetSupportedOnRampsResponseMessageInnerIcons,

    @Json(name = "icon")
    val icon: kotlin.String

)

