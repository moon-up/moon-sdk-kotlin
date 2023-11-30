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

import org.openapitools.client.models.TriggerOutput

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param transactionHash 
 * @param `contract` 
 * @param logIndex 
 * @param tokenContractType 
 * @param tokenName 
 * @param tokenSymbol 
 * @param `operator` 
 * @param from 
 * @param to 
 * @param tokenId 
 * @param amount 
 * @param triggers 
 */


data class INFTTransfer (

    @Json(name = "transactionHash")
    val transactionHash: kotlin.String,

    @Json(name = "contract")
    val `contract`: kotlin.String,

    @Json(name = "logIndex")
    val logIndex: kotlin.String,

    @Json(name = "tokenContractType")
    val tokenContractType: kotlin.String,

    @Json(name = "tokenName")
    val tokenName: kotlin.String,

    @Json(name = "tokenSymbol")
    val tokenSymbol: kotlin.String,

    @Json(name = "operator")
    val `operator`: kotlin.String?,

    @Json(name = "from")
    val from: kotlin.String,

    @Json(name = "to")
    val to: kotlin.String,

    @Json(name = "tokenId")
    val tokenId: kotlin.String,

    @Json(name = "amount")
    val amount: kotlin.String,

    @Json(name = "triggers")
    val triggers: kotlin.collections.List<TriggerOutput>? = null

)

