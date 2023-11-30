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

package org.openapitools.client.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import org.openapitools.client.models.AccountControllerResponse
import org.openapitools.client.models.TronInput
import org.openapitools.client.models.TronTransactionInput

import com.squareup.moshi.Json

import org.openapitools.client.infrastructure.ApiClient
import org.openapitools.client.infrastructure.ApiResponse
import org.openapitools.client.infrastructure.ClientException
import org.openapitools.client.infrastructure.ClientError
import org.openapitools.client.infrastructure.ServerException
import org.openapitools.client.infrastructure.ServerError
import org.openapitools.client.infrastructure.MultiValueMap
import org.openapitools.client.infrastructure.PartConfig
import org.openapitools.client.infrastructure.RequestConfig
import org.openapitools.client.infrastructure.RequestMethod
import org.openapitools.client.infrastructure.ResponseType
import org.openapitools.client.infrastructure.Success
import org.openapitools.client.infrastructure.toMultiValue

class TronApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
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
     * @param tronInput 
     * @return AccountControllerResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createTronAccount(authorization: kotlin.String, tronInput: TronInput) : AccountControllerResponse {
        val localVarResponse = createTronAccountWithHttpInfo(authorization = authorization, tronInput = tronInput)

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
     * @param tronInput 
     * @return ApiResponse<AccountControllerResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createTronAccountWithHttpInfo(authorization: kotlin.String, tronInput: TronInput) : ApiResponse<AccountControllerResponse?> {
        val localVariableConfig = createTronAccountRequestConfig(authorization = authorization, tronInput = tronInput)

        return request<TronInput, AccountControllerResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createTronAccount
     *
     * @param authorization 
     * @param tronInput 
     * @return RequestConfig
     */
    fun createTronAccountRequestConfig(authorization: kotlin.String, tronInput: TronInput) : RequestConfig<TronInput> {
        val localVariableBody = tronInput
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/tron",
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
    fun getTronAccount(authorization: kotlin.String, accountName: kotlin.String) : AccountControllerResponse {
        val localVarResponse = getTronAccountWithHttpInfo(authorization = authorization, accountName = accountName)

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
    fun getTronAccountWithHttpInfo(authorization: kotlin.String, accountName: kotlin.String) : ApiResponse<AccountControllerResponse?> {
        val localVariableConfig = getTronAccountRequestConfig(authorization = authorization, accountName = accountName)

        return request<Unit, AccountControllerResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getTronAccount
     *
     * @param authorization 
     * @param accountName 
     * @return RequestConfig
     */
    fun getTronAccountRequestConfig(authorization: kotlin.String, accountName: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/tron/{accountName}".replace("{"+"accountName"+"}", encodeURIComponent(accountName.toString())),
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
    fun listTronAccounts(authorization: kotlin.String) : AccountControllerResponse {
        val localVarResponse = listTronAccountsWithHttpInfo(authorization = authorization)

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
    fun listTronAccountsWithHttpInfo(authorization: kotlin.String) : ApiResponse<AccountControllerResponse?> {
        val localVariableConfig = listTronAccountsRequestConfig(authorization = authorization)

        return request<Unit, AccountControllerResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation listTronAccounts
     *
     * @param authorization 
     * @return RequestConfig
     */
    fun listTronAccountsRequestConfig(authorization: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/tron",
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
     * @param tronTransactionInput 
     * @return AccountControllerResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun signTronTransaction(authorization: kotlin.String, accountName: kotlin.String, tronTransactionInput: TronTransactionInput) : AccountControllerResponse {
        val localVarResponse = signTronTransactionWithHttpInfo(authorization = authorization, accountName = accountName, tronTransactionInput = tronTransactionInput)

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
     * @param tronTransactionInput 
     * @return ApiResponse<AccountControllerResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun signTronTransactionWithHttpInfo(authorization: kotlin.String, accountName: kotlin.String, tronTransactionInput: TronTransactionInput) : ApiResponse<AccountControllerResponse?> {
        val localVariableConfig = signTronTransactionRequestConfig(authorization = authorization, accountName = accountName, tronTransactionInput = tronTransactionInput)

        return request<TronTransactionInput, AccountControllerResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation signTronTransaction
     *
     * @param authorization 
     * @param accountName 
     * @param tronTransactionInput 
     * @return RequestConfig
     */
    fun signTronTransactionRequestConfig(authorization: kotlin.String, accountName: kotlin.String, tronTransactionInput: TronTransactionInput) : RequestConfig<TronTransactionInput> {
        val localVariableBody = tronTransactionInput
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/tron/{accountName}/sign-tx".replace("{"+"accountName"+"}", encodeURIComponent(accountName.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
