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
 * @param amount 
 * @param test 
 * @param counterAddress 
 * @param address 
 * @param mempool 
 * @param subscriptionType 
 * @param blockNumber 
 * @param txId 
 * @param chain 
 * @param currency 
 */


data class TatumTransactionEvent (

    @Json(name = "amount")
    val amount: kotlin.String,

    @Json(name = "test")
    val test: kotlin.Boolean,

    @Json(name = "counterAddress")
    val counterAddress: kotlin.String,

    @Json(name = "address")
    val address: kotlin.String,

    @Json(name = "mempool")
    val mempool: kotlin.Boolean,

    @Json(name = "subscriptionType")
    val subscriptionType: kotlin.String,

    @Json(name = "blockNumber")
    val blockNumber: kotlin.Double,

    @Json(name = "txId")
    val txId: kotlin.String,

    @Json(name = "chain")
    val chain: kotlin.String,

    @Json(name = "currency")
    val currency: kotlin.String

)

