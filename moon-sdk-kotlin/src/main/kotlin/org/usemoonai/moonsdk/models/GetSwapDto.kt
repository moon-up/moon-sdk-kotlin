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
 * @param src 
 * @param dst 
 * @param amount 
 * @param from 
 * @param slippage 
 * @param protocols 
 * @param fee 
 * @param disableEstimate 
 * @param permit 
 * @param includeTokensInfo 
 * @param includeProtocols 
 * @param compatibility 
 * @param allowPartialFill 
 * @param parts 
 * @param mainRouteParts 
 * @param connectorTokens 
 * @param complexityLevel 
 * @param gasLimit 
 * @param gasPrice 
 * @param referrer 
 * @param `receiver` 
 * @param chainId 
 */


data class GetSwapDto (

    @Json(name = "src")
    val src: kotlin.String,

    @Json(name = "dst")
    val dst: kotlin.String,

    @Json(name = "amount")
    val amount: kotlin.String,

    @Json(name = "from")
    val from: kotlin.String,

    @Json(name = "slippage")
    val slippage: kotlin.Double,

    @Json(name = "protocols")
    val protocols: kotlin.String? = null,

    @Json(name = "fee")
    val fee: kotlin.String? = null,

    @Json(name = "disableEstimate")
    val disableEstimate: kotlin.Boolean? = null,

    @Json(name = "permit")
    val permit: kotlin.String? = null,

    @Json(name = "includeTokensInfo")
    val includeTokensInfo: kotlin.Boolean? = null,

    @Json(name = "includeProtocols")
    val includeProtocols: kotlin.Boolean? = null,

    @Json(name = "compatibility")
    val compatibility: kotlin.Boolean? = null,

    @Json(name = "allowPartialFill")
    val allowPartialFill: kotlin.Boolean? = null,

    @Json(name = "parts")
    val parts: kotlin.String? = null,

    @Json(name = "mainRouteParts")
    val mainRouteParts: kotlin.String? = null,

    @Json(name = "connectorTokens")
    val connectorTokens: kotlin.String? = null,

    @Json(name = "complexityLevel")
    val complexityLevel: kotlin.String? = null,

    @Json(name = "gasLimit")
    val gasLimit: kotlin.String? = null,

    @Json(name = "gasPrice")
    val gasPrice: kotlin.String? = null,

    @Json(name = "referrer")
    val referrer: kotlin.String? = null,

    @Json(name = "receiver")
    val `receiver`: kotlin.String? = null,

    @Json(name = "chainId")
    val chainId: kotlin.Double? = null

)
