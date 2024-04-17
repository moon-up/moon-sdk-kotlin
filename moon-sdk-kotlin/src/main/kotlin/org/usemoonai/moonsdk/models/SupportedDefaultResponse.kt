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

import org.usemoonai.moonsdk.models.SupportedDefaultResponseDefaults
import org.usemoonai.moonsdk.models.SupportedDefaultResponseDefaultsId

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param defaults 
 * @param recommended 
 */


data class SupportedDefaultResponse (

    @Json(name = "defaults")
    val defaults: SupportedDefaultResponseDefaults,

    @Json(name = "recommended")
    val recommended: SupportedDefaultResponseDefaultsId

)

