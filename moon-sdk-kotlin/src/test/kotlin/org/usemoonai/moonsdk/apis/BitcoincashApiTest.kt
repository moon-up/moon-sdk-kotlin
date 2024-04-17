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

package org.usemoonai.moonsdk.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.usemoonai.moonsdk.apis.BitcoincashApi
import org.usemoonai.moonsdk.models.AccountAPIResponse
import org.usemoonai.moonsdk.models.BitcoinCashAPIResponse
import org.usemoonai.moonsdk.models.BitcoinCashInput
import org.usemoonai.moonsdk.models.BitcoinCashTransactionInput

class BitcoincashApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of BitcoincashApi
        //val apiInstance = BitcoincashApi()

        // to test createBitcoinCashAccount
        should("test createBitcoinCashAccount") {
            // uncomment below to test createBitcoinCashAccount
            //val authorization : kotlin.String = authorization_example // kotlin.String | 
            //val bitcoinCashInput : BitcoinCashInput =  // BitcoinCashInput | 
            //val result : AccountAPIResponse = apiInstance.createBitcoinCashAccount(authorization, bitcoinCashInput)
            //result shouldBe ("TODO")
        }

        // to test getBitcoinCashAccount
        should("test getBitcoinCashAccount") {
            // uncomment below to test getBitcoinCashAccount
            //val authorization : kotlin.String = authorization_example // kotlin.String | 
            //val accountName : kotlin.String = accountName_example // kotlin.String | 
            //val result : AccountAPIResponse = apiInstance.getBitcoinCashAccount(authorization, accountName)
            //result shouldBe ("TODO")
        }

        // to test listBitcoinCashAccounts
        should("test listBitcoinCashAccounts") {
            // uncomment below to test listBitcoinCashAccounts
            //val authorization : kotlin.String = authorization_example // kotlin.String | 
            //val result : AccountAPIResponse = apiInstance.listBitcoinCashAccounts(authorization)
            //result shouldBe ("TODO")
        }

        // to test signBitcoinCashTransaction
        should("test signBitcoinCashTransaction") {
            // uncomment below to test signBitcoinCashTransaction
            //val authorization : kotlin.String = authorization_example // kotlin.String | 
            //val accountName : kotlin.String = accountName_example // kotlin.String | 
            //val bitcoinCashTransactionInput : BitcoinCashTransactionInput =  // BitcoinCashTransactionInput | 
            //val result : BitcoinCashAPIResponse = apiInstance.signBitcoinCashTransaction(authorization, accountName, bitcoinCashTransactionInput)
            //result shouldBe ("TODO")
        }

    }
}
