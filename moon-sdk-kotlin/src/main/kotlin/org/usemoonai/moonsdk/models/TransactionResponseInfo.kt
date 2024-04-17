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
 * @param conveyorGas 
 * @param affiliateGas 
 * @param affiliateAggregator 
 * @param amountOut 
 * @param amountOutMin 
 */


data class TransactionResponseInfo (

    @Json(name = "conveyorGas")
    val conveyorGas: kotlin.String,

    @Json(name = "affiliateGas")
    val affiliateGas: kotlin.String,

    @Json(name = "affiliateAggregator")
    val affiliateAggregator: kotlin.String,

    @Json(name = "amountOut")
    val amountOut: kotlin.String,

    @Json(name = "amountOutMin")
    val amountOutMin: kotlin.String

)

