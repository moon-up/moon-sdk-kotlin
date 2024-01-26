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
 * @param crypto 
 * @param paymentMethods 
 * @param fiat 
 */


data class SupportedAssetResponseAssetsInner (

    @Json(name = "crypto")
    val crypto: kotlin.collections.List<kotlin.String>,

    @Json(name = "paymentMethods")
    val paymentMethods: kotlin.collections.List<kotlin.String>,

    @Json(name = "fiat")
    val fiat: kotlin.String

)
