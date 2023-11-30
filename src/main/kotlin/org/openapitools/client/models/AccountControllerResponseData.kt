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

import org.openapitools.client.models.AaveReservesData
import org.openapitools.client.models.AccountResponse
import org.openapitools.client.models.BalanceResponse
import org.openapitools.client.models.BitcoinTransactionOutput
import org.openapitools.client.models.BroadCastRawTransactionResponse
import org.openapitools.client.models.ENSReverseResolveResponse
import org.openapitools.client.models.EnsResolveResponse
import org.openapitools.client.models.Erc1155Response
import org.openapitools.client.models.Erc20Response
import org.openapitools.client.models.Erc721Response
import org.openapitools.client.models.NonceResponse
import org.openapitools.client.models.SignMessage
import org.openapitools.client.models.Transaction
import org.openapitools.client.models.TransactionData
import org.openapitools.client.models.TransactionRequest
import org.openapitools.client.models.Tx

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param nonce 
 * @param balance 
 * @param `data` 
 * @param address 
 * @param domain 
 * @param currentAtokenBalance 
 * @param currentBorrowBalance 
 * @param principalBorrowBalance 
 * @param borrowRateMode 
 * @param borrowRate 
 * @param liquidityRate 
 * @param originationFee 
 * @param variableBorrowIndex 
 * @param lastUpdateTimestamp 
 * @param usageAsCollateralEnabled 
 * @param success 
 * @param message 
 * @param transactionHash 
 * @param signedTransaction 
 * @param rawTransaction 
 * @param transactions 
 * @param moonScanUrl 
 * @param signature 
 * @param transaction 
 * @param userOps 
 * @param useropTransaction 
 * @param propertyKeys 
 * @param name 
 * @param encoding 
 * @param header 
 * @param signtype 
 * @param type 
 * @param chainId 
 * @param gas 
 * @param gasPrice 
 * @param gasTipCap 
 * @param gasFeeCap 
 * @param `value` 
 * @param from 
 * @param to 
 * @param blobGas 
 * @param blobGasFeeCap 
 * @param blobHashes 
 * @param v 
 * @param r 
 * @param s 
 * @param symbol 
 * @param decimals 
 * @param totalSupply 
 * @param contractAddress 
 * @param balanceOf 
 * @param allowance 
 * @param balanceOf 
 * @param balanceOfBatch 
 * @param signedTx 
 * @param ownerOf 
 * @param tokenUri 
 * @param isApprovedForAll 
 */


data class AccountControllerResponseData (

    @Json(name = "nonce")
    val nonce: kotlin.Double,

    @Json(name = "balance")
    val balance: kotlin.String,

    @Json(name = "data")
    val `data`: kotlin.String,

    @Json(name = "address")
    val address: kotlin.String,

    @Json(name = "domain")
    val domain: kotlin.String,

    @Json(name = "current_atoken_balance")
    val currentAtokenBalance: kotlin.String,

    @Json(name = "current_borrow_balance")
    val currentBorrowBalance: kotlin.String,

    @Json(name = "principal_borrow_balance")
    val principalBorrowBalance: kotlin.String,

    @Json(name = "borrow_rate_mode")
    val borrowRateMode: kotlin.String,

    @Json(name = "borrow_rate")
    val borrowRate: kotlin.String,

    @Json(name = "liquidity_rate")
    val liquidityRate: kotlin.String,

    @Json(name = "origination_fee")
    val originationFee: kotlin.String,

    @Json(name = "variable_borrow_index")
    val variableBorrowIndex: kotlin.String,

    @Json(name = "last_update_timestamp")
    val lastUpdateTimestamp: kotlin.String,

    @Json(name = "usage_as_collateral_enabled")
    val usageAsCollateralEnabled: kotlin.String,

    @Json(name = "success")
    val success: kotlin.Boolean,

    @Json(name = "message")
    val message: kotlin.String,

    @Json(name = "transaction_hash")
    val transactionHash: kotlin.String? = null,

    @Json(name = "signed_transaction")
    val signedTransaction: kotlin.String? = null,

    @Json(name = "raw_transaction")
    val rawTransaction: kotlin.String? = null,

    @Json(name = "transactions")
    val transactions: kotlin.collections.List<TransactionData>? = null,

    @Json(name = "moon_scan_url")
    val moonScanUrl: kotlin.String? = null,

    @Json(name = "signature")
    val signature: kotlin.String? = null,

    @Json(name = "transaction")
    val transaction: Tx? = null,

    @Json(name = "userOps")
    val userOps: kotlin.collections.List<TransactionRequest>? = null,

    @Json(name = "userop_transaction")
    val useropTransaction: kotlin.String? = null,

    @Json(name = "keys")
    val propertyKeys: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "encoding")
    val encoding: kotlin.String? = null,

    @Json(name = "header")
    val header: kotlin.Boolean? = null,

    @Json(name = "signtype")
    val signtype: kotlin.Boolean? = null,

    @Json(name = "type")
    val type: kotlin.Double? = null,

    @Json(name = "chain_id")
    val chainId: kotlin.Double? = null,

    @Json(name = "gas")
    val gas: kotlin.String? = null,

    @Json(name = "gas_price")
    val gasPrice: kotlin.String? = null,

    @Json(name = "gas_tip_cap")
    val gasTipCap: kotlin.String? = null,

    @Json(name = "gas_fee_cap")
    val gasFeeCap: kotlin.String? = null,

    @Json(name = "value")
    val `value`: kotlin.String? = null,

    @Json(name = "from")
    val from: kotlin.String? = null,

    @Json(name = "to")
    val to: kotlin.String? = null,

    @Json(name = "blob_gas")
    val blobGas: kotlin.String? = null,

    @Json(name = "blob_gas_fee_cap")
    val blobGasFeeCap: kotlin.String? = null,

    @Json(name = "blob_hashes")
    val blobHashes: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "v")
    val v: kotlin.String? = null,

    @Json(name = "r")
    val r: kotlin.String? = null,

    @Json(name = "s")
    val s: kotlin.String? = null,

    @Json(name = "symbol")
    val symbol: kotlin.String? = null,

    @Json(name = "decimals")
    val decimals: kotlin.String? = null,

    @Json(name = "totalSupply")
    val totalSupply: kotlin.String? = null,

    @Json(name = "contract_address")
    val contractAddress: kotlin.String? = null,

    @Json(name = "balanceOf")
    val balanceOf: kotlin.String? = null,

    @Json(name = "allowance")
    val allowance: kotlin.String? = null,

    @Json(name = "balance_of")
    val balanceOf: kotlin.String? = null,

    @Json(name = "balance_of_batch")
    val balanceOfBatch: kotlin.String? = null,

    @Json(name = "signedTx")
    val signedTx: kotlin.String? = null,

    @Json(name = "owner_of")
    val ownerOf: kotlin.String? = null,

    @Json(name = "token_uri")
    val tokenUri: kotlin.String? = null,

    @Json(name = "isApprovedForAll")
    val isApprovedForAll: kotlin.String? = null

)
