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
 */


data class AaveReservesData (

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
    val usageAsCollateralEnabled: kotlin.String

)

