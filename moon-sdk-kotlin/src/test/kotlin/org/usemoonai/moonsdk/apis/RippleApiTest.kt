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

import org.usemoonai.moonsdk.apis.RippleApi
import org.usemoonai.moonsdk.models.AccountAPIResponse
import org.usemoonai.moonsdk.models.RippleAPIResponse
import org.usemoonai.moonsdk.models.RippleInput
import org.usemoonai.moonsdk.models.RippleTransactionInput

class RippleApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of RippleApi
        //val apiInstance = RippleApi()

        // to test createRippleAccount
        should("test createRippleAccount") {
            // uncomment below to test createRippleAccount
            //val authorization : kotlin.String = authorization_example // kotlin.String | 
            //val rippleInput : RippleInput =  // RippleInput | 
            //val result : AccountAPIResponse = apiInstance.createRippleAccount(authorization, rippleInput)
            //result shouldBe ("TODO")
        }

        // to test getRippleAccount
        should("test getRippleAccount") {
            // uncomment below to test getRippleAccount
            //val authorization : kotlin.String = authorization_example // kotlin.String | 
            //val accountName : kotlin.String = accountName_example // kotlin.String | 
            //val result : AccountAPIResponse = apiInstance.getRippleAccount(authorization, accountName)
            //result shouldBe ("TODO")
        }

        // to test listRippleAccounts
        should("test listRippleAccounts") {
            // uncomment below to test listRippleAccounts
            //val authorization : kotlin.String = authorization_example // kotlin.String | 
            //val result : AccountAPIResponse = apiInstance.listRippleAccounts(authorization)
            //result shouldBe ("TODO")
        }

        // to test signRippleTransaction
        should("test signRippleTransaction") {
            // uncomment below to test signRippleTransaction
            //val authorization : kotlin.String = authorization_example // kotlin.String | 
            //val accountName : kotlin.String = accountName_example // kotlin.String | 
            //val rippleTransactionInput : RippleTransactionInput =  // RippleTransactionInput | 
            //val result : RippleAPIResponse = apiInstance.signRippleTransaction(authorization, accountName, rippleTransactionInput)
            //result shouldBe ("TODO")
        }

    }
}
