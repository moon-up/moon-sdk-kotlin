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

import org.openapitools.client.models.INFTApprovalERC1155
import org.openapitools.client.models.INFTApprovalERC721

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param ERC721 
 * @param ERC1155 
 */


data class IOldNFTApproval (

    @Json(name = "ERC721")
    val ERC721: kotlin.collections.List<INFTApprovalERC721>,

    @Json(name = "ERC1155")
    val ERC1155: kotlin.collections.List<INFTApprovalERC1155>

)

