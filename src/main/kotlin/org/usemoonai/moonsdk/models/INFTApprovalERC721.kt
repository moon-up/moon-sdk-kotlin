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
 * @param owner 
 * @param approved 
 * @param tokenId 
 * @param tokenContractType 
 * @param tokenName 
 * @param tokenSymbol 
 */


data class INFTApprovalERC721 (

    @Json(name = "transactionHash")
    val transactionHash: kotlin.String,

    @Json(name = "contract")
    val `contract`: kotlin.String,

    @Json(name = "logIndex")
    val logIndex: kotlin.String,

    @Json(name = "owner")
    val owner: kotlin.String,

    @Json(name = "approved")
    val approved: kotlin.String,

    @Json(name = "tokenId")
    val tokenId: kotlin.String,

    @Json(name = "tokenContractType")
    val tokenContractType: kotlin.String,

    @Json(name = "tokenName")
    val tokenName: kotlin.String,

    @Json(name = "tokenSymbol")
    val tokenSymbol: kotlin.String

)
