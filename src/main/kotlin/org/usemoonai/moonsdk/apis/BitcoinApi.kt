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

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import org.usemoonai.moonsdk.models.AccountControllerResponse
import org.usemoonai.moonsdk.models.BitcoinInput
import org.usemoonai.moonsdk.models.BitcoinTransactionInput

import com.squareup.moshi.Json

import org.usemoonai.moonsdk.infrastructure.ApiClient
import org.usemoonai.moonsdk.infrastructure.ApiResponse
import org.usemoonai.moonsdk.infrastructure.ClientException
import org.usemoonai.moonsdk.infrastructure.ClientError
import org.usemoonai.moonsdk.infrastructure.ServerException
import org.usemoonai.moonsdk.infrastructure.ServerError
import org.usemoonai.moonsdk.infrastructure.MultiValueMap
import org.usemoonai.moonsdk.infrastructure.PartConfig
import org.usemoonai.moonsdk.infrastructure.RequestConfig
import org.usemoonai.moonsdk.infrastructure.RequestMethod
import org.usemoonai.moonsdk.infrastructure.ResponseType
import org.usemoonai.moonsdk.infrastructure.Success
import org.usemoonai.moonsdk.infrastructure.toMultiValue

class BitcoinApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://vault-api.usemoon.ai")
        }
    }

    /**
     * 
     * 
     * @param authorization 
     * @param bitcoinInput 
     * @return AccountControllerResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createBitcoinAccount(authorization: kotlin.String, bitcoinInput: BitcoinInput) : AccountControllerResponse {
        val localVarResponse = createBitcoinAccountWithHttpInfo(authorization = authorization, bitcoinInput = bitcoinInput)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AccountControllerResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * 
     * @param authorization 
     * @param bitcoinInput 
     * @return ApiResponse<AccountControllerResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createBitcoinAccountWithHttpInfo(authorization: kotlin.String, bitcoinInput: BitcoinInput) : ApiResponse<AccountControllerResponse?> {
        val localVariableConfig = createBitcoinAccountRequestConfig(authorization = authorization, bitcoinInput = bitcoinInput)

        return request<BitcoinInput, AccountControllerResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createBitcoinAccount
     *
     * @param authorization 
     * @param bitcoinInput 
     * @return RequestConfig
     */
    fun createBitcoinAccountRequestConfig(authorization: kotlin.String, bitcoinInput: BitcoinInput) : RequestConfig<BitcoinInput> {
        val localVariableBody = bitcoinInput
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/bitcoin",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param authorization 
     * @param accountName 
     * @return AccountControllerResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getBitcoinAccount(authorization: kotlin.String, accountName: kotlin.String) : AccountControllerResponse {
        val localVarResponse = getBitcoinAccountWithHttpInfo(authorization = authorization, accountName = accountName)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AccountControllerResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * 
     * @param authorization 
     * @param accountName 
     * @return ApiResponse<AccountControllerResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getBitcoinAccountWithHttpInfo(authorization: kotlin.String, accountName: kotlin.String) : ApiResponse<AccountControllerResponse?> {
        val localVariableConfig = getBitcoinAccountRequestConfig(authorization = authorization, accountName = accountName)

        return request<Unit, AccountControllerResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getBitcoinAccount
     *
     * @param authorization 
     * @param accountName 
     * @return RequestConfig
     */
    fun getBitcoinAccountRequestConfig(authorization: kotlin.String, accountName: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/bitcoin/{accountName}".replace("{"+"accountName"+"}", encodeURIComponent(accountName.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param authorization 
     * @return AccountControllerResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun listBitcoinAccounts(authorization: kotlin.String) : AccountControllerResponse {
        val localVarResponse = listBitcoinAccountsWithHttpInfo(authorization = authorization)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AccountControllerResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * 
     * @param authorization 
     * @return ApiResponse<AccountControllerResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun listBitcoinAccountsWithHttpInfo(authorization: kotlin.String) : ApiResponse<AccountControllerResponse?> {
        val localVariableConfig = listBitcoinAccountsRequestConfig(authorization = authorization)

        return request<Unit, AccountControllerResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation listBitcoinAccounts
     *
     * @param authorization 
     * @return RequestConfig
     */
    fun listBitcoinAccountsRequestConfig(authorization: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/bitcoin",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * 
     * 
     * @param authorization 
     * @param accountName 
     * @param bitcoinTransactionInput 
     * @return AccountControllerResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun signBitcoinTransaction(authorization: kotlin.String, accountName: kotlin.String, bitcoinTransactionInput: BitcoinTransactionInput) : AccountControllerResponse {
        val localVarResponse = signBitcoinTransactionWithHttpInfo(authorization = authorization, accountName = accountName, bitcoinTransactionInput = bitcoinTransactionInput)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AccountControllerResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * 
     * @param authorization 
     * @param accountName 
     * @param bitcoinTransactionInput 
     * @return ApiResponse<AccountControllerResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun signBitcoinTransactionWithHttpInfo(authorization: kotlin.String, accountName: kotlin.String, bitcoinTransactionInput: BitcoinTransactionInput) : ApiResponse<AccountControllerResponse?> {
        val localVariableConfig = signBitcoinTransactionRequestConfig(authorization = authorization, accountName = accountName, bitcoinTransactionInput = bitcoinTransactionInput)

        return request<BitcoinTransactionInput, AccountControllerResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation signBitcoinTransaction
     *
     * @param authorization 
     * @param accountName 
     * @param bitcoinTransactionInput 
     * @return RequestConfig
     */
    fun signBitcoinTransactionRequestConfig(authorization: kotlin.String, accountName: kotlin.String, bitcoinTransactionInput: BitcoinTransactionInput) : RequestConfig<BitcoinTransactionInput> {
        val localVariableBody = bitcoinTransactionInput
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/bitcoin/{accountName}/sign-tx".replace("{"+"accountName"+"}", encodeURIComponent(accountName.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}