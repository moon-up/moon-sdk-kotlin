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

import org.openapitools.client.models.AbiItem
import org.openapitools.client.models.Block
import org.openapitools.client.models.IERC20Approval
import org.openapitools.client.models.IERC20Transfer
import org.openapitools.client.models.INFTApproval
import org.openapitools.client.models.INFTTransfer
import org.openapitools.client.models.INativeBalance
import org.openapitools.client.models.IOldNFTApproval
import org.openapitools.client.models.InternalTransaction
import org.openapitools.client.models.Log
import org.openapitools.client.models.Transaction

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param block 
 * @param chainId 
 * @param logs 
 * @param txs 
 * @param txsInternal 
 * @param abi 
 * @param retries 
 * @param confirmed 
 * @param tag 
 * @param streamId 
 * @param erc20Transfers 
 * @param erc20Approvals 
 * @param nftTransfers 
 * @param nativeBalances 
 * @param nftApprovals 
 * @param nftTokenApprovals 
 */


data class IWebhook (

    @Json(name = "block")
    val block: Block,

    @Json(name = "chainId")
    val chainId: kotlin.String,

    @Json(name = "logs")
    val logs: kotlin.collections.List<Log>,

    @Json(name = "txs")
    val txs: kotlin.collections.List<Transaction>,

    @Json(name = "txsInternal")
    val txsInternal: kotlin.collections.List<InternalTransaction>,

    @Json(name = "abi")
    val abi: kotlin.collections.List<AbiItem>,

    @Json(name = "retries")
    val retries: kotlin.Double,

    @Json(name = "confirmed")
    val confirmed: kotlin.Boolean,

    @Json(name = "tag")
    val tag: kotlin.String,

    @Json(name = "streamId")
    val streamId: kotlin.String,

    @Json(name = "erc20Transfers")
    val erc20Transfers: kotlin.collections.List<IERC20Transfer>,

    @Json(name = "erc20Approvals")
    val erc20Approvals: kotlin.collections.List<IERC20Approval>,

    @Json(name = "nftTransfers")
    val nftTransfers: kotlin.collections.List<INFTTransfer>,

    @Json(name = "nativeBalances")
    val nativeBalances: kotlin.collections.List<INativeBalance>,

    @Json(name = "nftApprovals")
    val nftApprovals: IOldNFTApproval,

    @Json(name = "nftTokenApprovals")
    val nftTokenApprovals: kotlin.collections.List<INFTApproval>

)

