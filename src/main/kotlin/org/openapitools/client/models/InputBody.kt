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
 * @param to 
 * @param `data` 
 * @param input 
 * @param `value` 
 * @param nonce 
 * @param gas 
 * @param gasPrice 
 * @param chainId 
 * @param encoding 
 * @param EOA 
 * @param contractAddress 
 * @param tokenId 
 * @param tokenIds 
 * @param approved 
 * @param broadcast 
 */


data class InputBody (

    @Json(name = "to")
    val to: kotlin.String? = null,

    @Json(name = "data")
    val `data`: kotlin.String? = null,

    @Json(name = "input")
    val input: kotlin.String? = null,

    @Json(name = "value")
    val `value`: kotlin.String? = null,

    @Json(name = "nonce")
    val nonce: kotlin.String? = null,

    @Json(name = "gas")
    val gas: kotlin.String? = null,

    @Json(name = "gasPrice")
    val gasPrice: kotlin.String? = null,

    @Json(name = "chain_id")
    val chainId: kotlin.String? = null,

    @Json(name = "encoding")
    val encoding: kotlin.String? = null,

    @Json(name = "EOA")
    val EOA: kotlin.Boolean? = null,

    @Json(name = "contract_address")
    val contractAddress: kotlin.String? = null,

    @Json(name = "token_id")
    val tokenId: kotlin.String? = null,

    @Json(name = "token_ids")
    val tokenIds: kotlin.String? = null,

    @Json(name = "approved")
    val approved: kotlin.Boolean? = null,

    @Json(name = "broadcast")
    val broadcast: kotlin.Boolean? = null

)

