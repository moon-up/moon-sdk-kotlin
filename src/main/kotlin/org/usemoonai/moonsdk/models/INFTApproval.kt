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
 * @param transactionHash 
 * @param `contract` 
 * @param logIndex 
 * @param tokenContractType 
 * @param tokenName 
 * @param tokenSymbol 
 * @param account 
 * @param `operator` 
 * @param approvedAll 
 * @param tokenId 
 */


data class INFTApproval (

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

    @Json(name = "account")
    val account: kotlin.String,

    @Json(name = "operator")
    val `operator`: kotlin.String,

    @Json(name = "approvedAll")
    val approvedAll: kotlin.Boolean,

    @Json(name = "tokenId")
    val tokenId: kotlin.String?

)

