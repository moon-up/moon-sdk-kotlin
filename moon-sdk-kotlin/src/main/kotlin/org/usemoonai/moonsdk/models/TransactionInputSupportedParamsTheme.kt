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
 * @param borderRadius 
 * @param cardColor 
 * @param secondaryTextColor 
 * @param primaryTextColor 
 * @param secondaryColor 
 * @param primaryColor 
 * @param themeName 
 * @param isDark 
 */


data class TransactionInputSupportedParamsTheme (

    @Json(name = "borderRadius")
    val borderRadius: kotlin.Double?,

    @Json(name = "cardColor")
    val cardColor: kotlin.String,

    @Json(name = "secondaryTextColor")
    val secondaryTextColor: kotlin.String,

    @Json(name = "primaryTextColor")
    val primaryTextColor: kotlin.String,

    @Json(name = "secondaryColor")
    val secondaryColor: kotlin.String,

    @Json(name = "primaryColor")
    val primaryColor: kotlin.String,

    @Json(name = "themeName")
    val themeName: kotlin.String,

    @Json(name = "isDark")
    val isDark: kotlin.Boolean

)
