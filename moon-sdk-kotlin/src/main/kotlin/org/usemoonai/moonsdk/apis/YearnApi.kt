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

import org.usemoonai.moonsdk.models.InputBody
import org.usemoonai.moonsdk.models.TransactionAPIResponse

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

class YearnApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://beta.usemoon.ai")
        }
    }

    /**
     * 
     * 
     * @param authorization 
     * @param name 
     * @param inputBody 
     * @return TransactionAPIResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun addLiquidity(authorization: kotlin.String, name: kotlin.String, inputBody: InputBody) : TransactionAPIResponse {
        val localVarResponse = addLiquidityWithHttpInfo(authorization = authorization, name = name, inputBody = inputBody)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TransactionAPIResponse
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
     * @param name 
     * @param inputBody 
     * @return ApiResponse<TransactionAPIResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun addLiquidityWithHttpInfo(authorization: kotlin.String, name: kotlin.String, inputBody: InputBody) : ApiResponse<TransactionAPIResponse?> {
        val localVariableConfig = addLiquidityRequestConfig(authorization = authorization, name = name, inputBody = inputBody)

        return request<InputBody, TransactionAPIResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation addLiquidity
     *
     * @param authorization 
     * @param name 
     * @param inputBody 
     * @return RequestConfig
     */
    fun addLiquidityRequestConfig(authorization: kotlin.String, name: kotlin.String, inputBody: InputBody) : RequestConfig<InputBody> {
        val localVariableBody = inputBody
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/yearn/{name}/add-liquidity".replace("{"+"name"+"}", encodeURIComponent(name.toString())),
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
     * @param name 
     * @param inputBody 
     * @return TransactionAPIResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun addLiquidityWeth(authorization: kotlin.String, name: kotlin.String, inputBody: InputBody) : TransactionAPIResponse {
        val localVarResponse = addLiquidityWethWithHttpInfo(authorization = authorization, name = name, inputBody = inputBody)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TransactionAPIResponse
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
     * @param name 
     * @param inputBody 
     * @return ApiResponse<TransactionAPIResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun addLiquidityWethWithHttpInfo(authorization: kotlin.String, name: kotlin.String, inputBody: InputBody) : ApiResponse<TransactionAPIResponse?> {
        val localVariableConfig = addLiquidityWethRequestConfig(authorization = authorization, name = name, inputBody = inputBody)

        return request<InputBody, TransactionAPIResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation addLiquidityWeth
     *
     * @param authorization 
     * @param name 
     * @param inputBody 
     * @return RequestConfig
     */
    fun addLiquidityWethRequestConfig(authorization: kotlin.String, name: kotlin.String, inputBody: InputBody) : RequestConfig<InputBody> {
        val localVariableBody = inputBody
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/yearn/{name}/add-liquidity-weth".replace("{"+"name"+"}", encodeURIComponent(name.toString())),
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
     * @param name 
     * @param inputBody 
     * @return TransactionAPIResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun removeLiquidity(authorization: kotlin.String, name: kotlin.String, inputBody: InputBody) : TransactionAPIResponse {
        val localVarResponse = removeLiquidityWithHttpInfo(authorization = authorization, name = name, inputBody = inputBody)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TransactionAPIResponse
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
     * @param name 
     * @param inputBody 
     * @return ApiResponse<TransactionAPIResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun removeLiquidityWithHttpInfo(authorization: kotlin.String, name: kotlin.String, inputBody: InputBody) : ApiResponse<TransactionAPIResponse?> {
        val localVariableConfig = removeLiquidityRequestConfig(authorization = authorization, name = name, inputBody = inputBody)

        return request<InputBody, TransactionAPIResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation removeLiquidity
     *
     * @param authorization 
     * @param name 
     * @param inputBody 
     * @return RequestConfig
     */
    fun removeLiquidityRequestConfig(authorization: kotlin.String, name: kotlin.String, inputBody: InputBody) : RequestConfig<InputBody> {
        val localVariableBody = inputBody
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/yearn/{name}/remove-liquidity".replace("{"+"name"+"}", encodeURIComponent(name.toString())),
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
     * @param name 
     * @param inputBody 
     * @return TransactionAPIResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun removeLiquidityWeth(authorization: kotlin.String, name: kotlin.String, inputBody: InputBody) : TransactionAPIResponse {
        val localVarResponse = removeLiquidityWethWithHttpInfo(authorization = authorization, name = name, inputBody = inputBody)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as TransactionAPIResponse
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
     * @param name 
     * @param inputBody 
     * @return ApiResponse<TransactionAPIResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun removeLiquidityWethWithHttpInfo(authorization: kotlin.String, name: kotlin.String, inputBody: InputBody) : ApiResponse<TransactionAPIResponse?> {
        val localVariableConfig = removeLiquidityWethRequestConfig(authorization = authorization, name = name, inputBody = inputBody)

        return request<InputBody, TransactionAPIResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation removeLiquidityWeth
     *
     * @param authorization 
     * @param name 
     * @param inputBody 
     * @return RequestConfig
     */
    fun removeLiquidityWethRequestConfig(authorization: kotlin.String, name: kotlin.String, inputBody: InputBody) : RequestConfig<InputBody> {
        val localVariableBody = inputBody
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        authorization.apply { localVariableHeaders["Authorization"] = this.toString() }
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/yearn/{name}/remove-liquidity-weth".replace("{"+"name"+"}", encodeURIComponent(name.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
