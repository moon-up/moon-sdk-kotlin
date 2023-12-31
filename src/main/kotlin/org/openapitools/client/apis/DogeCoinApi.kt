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
import org.openapitools.client.models.DogeCoinInput
import org.openapitools.client.models.DogeCoinTransactionInput

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

class DogeCoinApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
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
     * @param dogeCoinInput 
     * @return AccountControllerResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun createDogeCoinAccount(authorization: kotlin.String, dogeCoinInput: DogeCoinInput) : AccountControllerResponse {
        val localVarResponse = createDogeCoinAccountWithHttpInfo(authorization = authorization, dogeCoinInput = dogeCoinInput)

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
     * @param dogeCoinInput 
     * @return ApiResponse<AccountControllerResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun createDogeCoinAccountWithHttpInfo(authorization: kotlin.String, dogeCoinInput: DogeCoinInput) : ApiResponse<AccountControllerResponse?> {
        val localVariableConfig = createDogeCoinAccountRequestConfig(authorization = authorization, dogeCoinInput = dogeCoinInput)

        return request<DogeCoinInput, AccountControllerResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation createDogeCoinAccount
     *
     * @param authorization 
     * @param dogeCoinInput 
     * @return RequestConfig
     */
    fun createDogeCoinAccountRequestConfig(authorization: kotlin.String, dogeCoinInput: DogeCoinInput) : RequestConfig<DogeCoinInput> {
        val localVariableBody = dogeCoinInput
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/dogecoin",
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
    fun getDogeCoinAccount(authorization: kotlin.String, accountName: kotlin.String) : AccountControllerResponse {
        val localVarResponse = getDogeCoinAccountWithHttpInfo(authorization = authorization, accountName = accountName)

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
    fun getDogeCoinAccountWithHttpInfo(authorization: kotlin.String, accountName: kotlin.String) : ApiResponse<AccountControllerResponse?> {
        val localVariableConfig = getDogeCoinAccountRequestConfig(authorization = authorization, accountName = accountName)

        return request<Unit, AccountControllerResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getDogeCoinAccount
     *
     * @param authorization 
     * @param accountName 
     * @return RequestConfig
     */
    fun getDogeCoinAccountRequestConfig(authorization: kotlin.String, accountName: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/dogecoin/{accountName}".replace("{"+"accountName"+"}", encodeURIComponent(accountName.toString())),
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
    fun listDogeCoinAccounts(authorization: kotlin.String) : AccountControllerResponse {
        val localVarResponse = listDogeCoinAccountsWithHttpInfo(authorization = authorization)

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
    fun listDogeCoinAccountsWithHttpInfo(authorization: kotlin.String) : ApiResponse<AccountControllerResponse?> {
        val localVariableConfig = listDogeCoinAccountsRequestConfig(authorization = authorization)

        return request<Unit, AccountControllerResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation listDogeCoinAccounts
     *
     * @param authorization 
     * @return RequestConfig
     */
    fun listDogeCoinAccountsRequestConfig(authorization: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/dogecoin",
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
     * @param dogeCoinTransactionInput 
     * @return AccountControllerResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun signDogeCoinTransaction(authorization: kotlin.String, accountName: kotlin.String, dogeCoinTransactionInput: DogeCoinTransactionInput) : AccountControllerResponse {
        val localVarResponse = signDogeCoinTransactionWithHttpInfo(authorization = authorization, accountName = accountName, dogeCoinTransactionInput = dogeCoinTransactionInput)

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
     * @param dogeCoinTransactionInput 
     * @return ApiResponse<AccountControllerResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun signDogeCoinTransactionWithHttpInfo(authorization: kotlin.String, accountName: kotlin.String, dogeCoinTransactionInput: DogeCoinTransactionInput) : ApiResponse<AccountControllerResponse?> {
        val localVariableConfig = signDogeCoinTransactionRequestConfig(authorization = authorization, accountName = accountName, dogeCoinTransactionInput = dogeCoinTransactionInput)

        return request<DogeCoinTransactionInput, AccountControllerResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation signDogeCoinTransaction
     *
     * @param authorization 
     * @param accountName 
     * @param dogeCoinTransactionInput 
     * @return RequestConfig
     */
    fun signDogeCoinTransactionRequestConfig(authorization: kotlin.String, accountName: kotlin.String, dogeCoinTransactionInput: DogeCoinTransactionInput) : RequestConfig<DogeCoinTransactionInput> {
        val localVariableBody = dogeCoinTransactionInput
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/dogecoin/{accountName}/sign-tx".replace("{"+"accountName"+"}", encodeURIComponent(accountName.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
