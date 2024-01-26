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
import org.usemoonai.moonsdk.models.SolanaInput
import org.usemoonai.moonsdk.models.SolanaTransactionInput

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

class SolanaApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
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
     * @param solanaInput 
     * @return AccountControllerResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createSolanaAccount(authorization: kotlin.String, solanaInput: SolanaInput) : AccountControllerResponse {
        val localVarResponse = createSolanaAccountWithHttpInfo(authorization = authorization, solanaInput = solanaInput)

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
     * @param solanaInput 
     * @return ApiResponse<AccountControllerResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createSolanaAccountWithHttpInfo(authorization: kotlin.String, solanaInput: SolanaInput) : ApiResponse<AccountControllerResponse?> {
        val localVariableConfig = createSolanaAccountRequestConfig(authorization = authorization, solanaInput = solanaInput)

        return request<SolanaInput, AccountControllerResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createSolanaAccount
     *
     * @param authorization 
     * @param solanaInput 
     * @return RequestConfig
     */
    fun createSolanaAccountRequestConfig(authorization: kotlin.String, solanaInput: SolanaInput) : RequestConfig<SolanaInput> {
        val localVariableBody = solanaInput
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/solana",
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
    fun getSolanaAccount(authorization: kotlin.String, accountName: kotlin.String) : AccountControllerResponse {
        val localVarResponse = getSolanaAccountWithHttpInfo(authorization = authorization, accountName = accountName)

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
    fun getSolanaAccountWithHttpInfo(authorization: kotlin.String, accountName: kotlin.String) : ApiResponse<AccountControllerResponse?> {
        val localVariableConfig = getSolanaAccountRequestConfig(authorization = authorization, accountName = accountName)

        return request<Unit, AccountControllerResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getSolanaAccount
     *
     * @param authorization 
     * @param accountName 
     * @return RequestConfig
     */
    fun getSolanaAccountRequestConfig(authorization: kotlin.String, accountName: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/solana/{accountName}".replace("{"+"accountName"+"}", encodeURIComponent(accountName.toString())),
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
    fun listSolanaAccounts(authorization: kotlin.String) : AccountControllerResponse {
        val localVarResponse = listSolanaAccountsWithHttpInfo(authorization = authorization)

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
    fun listSolanaAccountsWithHttpInfo(authorization: kotlin.String) : ApiResponse<AccountControllerResponse?> {
        val localVariableConfig = listSolanaAccountsRequestConfig(authorization = authorization)

        return request<Unit, AccountControllerResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation listSolanaAccounts
     *
     * @param authorization 
     * @return RequestConfig
     */
    fun listSolanaAccountsRequestConfig(authorization: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/solana",
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
     * @param solanaTransactionInput 
     * @return AccountControllerResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun signSolanaTransaction(authorization: kotlin.String, accountName: kotlin.String, solanaTransactionInput: SolanaTransactionInput) : AccountControllerResponse {
        val localVarResponse = signSolanaTransactionWithHttpInfo(authorization = authorization, accountName = accountName, solanaTransactionInput = solanaTransactionInput)

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
     * @param solanaTransactionInput 
     * @return ApiResponse<AccountControllerResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun signSolanaTransactionWithHttpInfo(authorization: kotlin.String, accountName: kotlin.String, solanaTransactionInput: SolanaTransactionInput) : ApiResponse<AccountControllerResponse?> {
        val localVariableConfig = signSolanaTransactionRequestConfig(authorization = authorization, accountName = accountName, solanaTransactionInput = solanaTransactionInput)

        return request<SolanaTransactionInput, AccountControllerResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation signSolanaTransaction
     *
     * @param authorization 
     * @param accountName 
     * @param solanaTransactionInput 
     * @return RequestConfig
     */
    fun signSolanaTransactionRequestConfig(authorization: kotlin.String, accountName: kotlin.String, solanaTransactionInput: SolanaTransactionInput) : RequestConfig<SolanaTransactionInput> {
        val localVariableBody = solanaTransactionInput
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/solana/{accountName}/sign-tx".replace("{"+"accountName"+"}", encodeURIComponent(accountName.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}