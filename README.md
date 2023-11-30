# org.openapitools.client - Kotlin client library for moon-vault-api

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate an API client.

- API version: 1.0.0
- Package version: 
- Build package: org.openapitools.codegen.languages.KotlinClientCodegen

## Requires

* Kotlin 1.7.21
* Gradle 7.5

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://vault-api.usemoon.ai*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AaveApi* | [**borrow**](docs/AaveApi.md#borrow) | **POST** /aave/{name}/borrow | 
*AaveApi* | [**lend**](docs/AaveApi.md#lend) | **POST** /aave/{name}/lend | 
*AaveApi* | [**repay**](docs/AaveApi.md#repay) | **POST** /aave/{name}/repay | 
*AaveApi* | [**userReserveData**](docs/AaveApi.md#userreservedata) | **POST** /aave/{name}/user-reserve-data | 
*AccountsApi* | [**broadcastTx**](docs/AccountsApi.md#broadcasttx) | **POST** /accounts/{accountName}/broadcast-tx | 
*AccountsApi* | [**createAccount**](docs/AccountsApi.md#createaccount) | **POST** /accounts | 
*AccountsApi* | [**deleteAccount**](docs/AccountsApi.md#deleteaccount) | **DELETE** /accounts/{accountName} | 
*AccountsApi* | [**deployContract**](docs/AccountsApi.md#deploycontract) | **POST** /accounts/{accountName}/deploy | 
*AccountsApi* | [**getAccount**](docs/AccountsApi.md#getaccount) | **GET** /accounts/{accountName} | 
*AccountsApi* | [**getBalance**](docs/AccountsApi.md#getbalance) | **GET** /accounts/{accountName}/balance | 
*AccountsApi* | [**getNonce**](docs/AccountsApi.md#getnonce) | **GET** /accounts/{accountName}/nonce | 
*AccountsApi* | [**listAccounts**](docs/AccountsApi.md#listaccounts) | **GET** /accounts | 
*AccountsApi* | [**signMessage**](docs/AccountsApi.md#signmessage) | **POST** /accounts/{accountName}/sign-message | 
*AccountsApi* | [**signTransaction**](docs/AccountsApi.md#signtransaction) | **POST** /accounts/{accountName}/sign-transaction | 
*AccountsApi* | [**signTypedData**](docs/AccountsApi.md#signtypeddata) | **POST** /accounts/{accountName}/sign-typed-data | 
*AccountsApi* | [**transferEth**](docs/AccountsApi.md#transfereth) | **POST** /accounts/{accountName}/transfer-eth | 
*BitcoinApi* | [**createBitcoinAccount**](docs/BitcoinApi.md#createbitcoinaccount) | **POST** /bitcoin | 
*BitcoinApi* | [**getBitcoinAccount**](docs/BitcoinApi.md#getbitcoinaccount) | **GET** /bitcoin/{accountName} | 
*BitcoinApi* | [**listBitcoinAccounts**](docs/BitcoinApi.md#listbitcoinaccounts) | **GET** /bitcoin | 
*BitcoinApi* | [**signBitcoinTransaction**](docs/BitcoinApi.md#signbitcointransaction) | **POST** /bitcoin/{accountName}/sign-tx | 
*BitcoincashApi* | [**createBitcoinCashAccount**](docs/BitcoincashApi.md#createbitcoincashaccount) | **POST** /bitcoincash | 
*BitcoincashApi* | [**getBitcoinCashAccount**](docs/BitcoincashApi.md#getbitcoincashaccount) | **GET** /bitcoincash/{accountName} | 
*BitcoincashApi* | [**listBitcoinCashAccounts**](docs/BitcoincashApi.md#listbitcoincashaccounts) | **GET** /bitcoincash | 
*BitcoincashApi* | [**signBitcoinCashTransaction**](docs/BitcoincashApi.md#signbitcoincashtransaction) | **POST** /bitcoincash/{accountName}/sign-tx | 
*ConveyorFinanceApi* | [**swap**](docs/ConveyorFinanceApi.md#swap) | **POST** /conveyorfinance/{name}/swap | 
*CosmosApi* | [**createCosmosAccount**](docs/CosmosApi.md#createcosmosaccount) | **POST** /cosmos | 
*CosmosApi* | [**getCosmosAccount**](docs/CosmosApi.md#getcosmosaccount) | **GET** /cosmos/{accountName} | 
*CosmosApi* | [**listCosmosAccounts**](docs/CosmosApi.md#listcosmosaccounts) | **GET** /cosmos | 
*CosmosApi* | [**signCosmosTransaction**](docs/CosmosApi.md#signcosmostransaction) | **POST** /cosmos/{accountName}/sign-tx | 
*DefaultApi* | [**getMessage**](docs/DefaultApi.md#getmessage) | **GET** /ping | 
*DogeCoinApi* | [**createDogeCoinAccount**](docs/DogeCoinApi.md#createdogecoinaccount) | **POST** /dogecoin | 
*DogeCoinApi* | [**getDogeCoinAccount**](docs/DogeCoinApi.md#getdogecoinaccount) | **GET** /dogecoin/{accountName} | 
*DogeCoinApi* | [**listDogeCoinAccounts**](docs/DogeCoinApi.md#listdogecoinaccounts) | **GET** /dogecoin | 
*DogeCoinApi* | [**signDogeCoinTransaction**](docs/DogeCoinApi.md#signdogecointransaction) | **POST** /dogecoin/{accountName}/sign-tx | 
*ENSApi* | [**resolve**](docs/ENSApi.md#resolve) | **POST** /ens/resolve | 
*ERC1155Api* | [**balanceOf**](docs/ERC1155Api.md#balanceof) | **POST** /erc1155/{name}/balance-of | 
*ERC1155Api* | [**balanceOfBatch**](docs/ERC1155Api.md#balanceofbatch) | **POST** /erc1155/{name}/balance-of-batch | 
*ERC1155Api* | [**isApprovedForAll**](docs/ERC1155Api.md#isapprovedforall) | **POST** /erc1155/{name}/is-approved-for-all | 
*ERC1155Api* | [**safeBatchTransferFrom**](docs/ERC1155Api.md#safebatchtransferfrom) | **POST** /erc1155/{name}/safe-batch-transfer-from | 
*ERC1155Api* | [**safeTransferFrom**](docs/ERC1155Api.md#safetransferfrom) | **POST** /erc1155/{name}/safe-transfer-from | 
*ERC1155Api* | [**setApprovalForAll**](docs/ERC1155Api.md#setapprovalforall) | **POST** /erc1155/{name}/set-approval-for-all | 
*EosApi* | [**createEosAccount**](docs/EosApi.md#createeosaccount) | **POST** /eos | 
*EosApi* | [**getEosAccount**](docs/EosApi.md#geteosaccount) | **GET** /eos/{accountName} | 
*EosApi* | [**listEosAccounts**](docs/EosApi.md#listeosaccounts) | **GET** /eos | 
*EosApi* | [**signEosTransaction**](docs/EosApi.md#signeostransaction) | **POST** /eos/{accountName}/sign-tx | 
*Erc20Api* | [**allowanceErc20**](docs/Erc20Api.md#allowanceerc20) | **POST** /erc20/{name}/allowance | 
*Erc20Api* | [**approveErc20**](docs/Erc20Api.md#approveerc20) | **POST** /erc20/{name}/approve | 
*Erc20Api* | [**balanceOfErc20**](docs/Erc20Api.md#balanceoferc20) | **POST** /erc20/{name}/balance-of | 
*Erc20Api* | [**decimalsErc20**](docs/Erc20Api.md#decimalserc20) | **POST** /erc20/{name}/decimals | 
*Erc20Api* | [**nameErc20**](docs/Erc20Api.md#nameerc20) | **POST** /erc20/{name}/name | 
*Erc20Api* | [**symbolErc20**](docs/Erc20Api.md#symbolerc20) | **POST** /erc20/{name}/symbol | 
*Erc20Api* | [**totalSupplyErc20**](docs/Erc20Api.md#totalsupplyerc20) | **POST** /erc20/{name}/total-supply | 
*Erc20Api* | [**transferErc20**](docs/Erc20Api.md#transfererc20) | **POST** /erc20/{name}/transfer | 
*Erc20Api* | [**transferFromErc20**](docs/Erc20Api.md#transferfromerc20) | **POST** /erc20/{name}/transfer-from | 
*Erc4337Api* | [**getAddress**](docs/Erc4337Api.md#getaddress) | **POST** /erc4337/{accountName}/address | 
*Erc4337Api* | [**signBroadcastUserOpTx**](docs/Erc4337Api.md#signbroadcastuseroptx) | **POST** /erc4337/{accountName}/sign-broadcast-userop-tx | 
*Erc721Api* | [**approve**](docs/Erc721Api.md#approve) | **POST** /erc721/{name}/approve | 
*Erc721Api* | [**balanceOf**](docs/Erc721Api.md#balanceof) | **POST** /erc721/{name}/balance-of | 
*Erc721Api* | [**getApproved**](docs/Erc721Api.md#getapproved) | **POST** /erc721/{name}/get-approved | 
*Erc721Api* | [**isApprovedForAll**](docs/Erc721Api.md#isapprovedforall) | **POST** /erc721/{name}/is-approved-for-all | 
*Erc721Api* | [**name**](docs/Erc721Api.md#name) | **POST** /erc721/{name}/name | 
*Erc721Api* | [**ownerOf**](docs/Erc721Api.md#ownerof) | **POST** /erc721/{name}/owner-of | 
*Erc721Api* | [**safeTransferFrom**](docs/Erc721Api.md#safetransferfrom) | **POST** /erc721/{name}/safe-transfer-from | 
*Erc721Api* | [**setApprovalForAll**](docs/Erc721Api.md#setapprovalforall) | **POST** /erc721/{name}/set-approval-for-all | 
*Erc721Api* | [**symbol**](docs/Erc721Api.md#symbol) | **POST** /erc721/{name}/symbol | 
*Erc721Api* | [**tokenUri**](docs/Erc721Api.md#tokenuri) | **POST** /erc721/{name}/token-uri | 
*Erc721Api* | [**transfer**](docs/Erc721Api.md#transfer) | **POST** /erc721/{name}/transfer | 
*Erc721Api* | [**transferFrom**](docs/Erc721Api.md#transferfrom) | **POST** /erc721/{name}/transfer-from | 
*LitecoinApi* | [**createLitecoinAccount**](docs/LitecoinApi.md#createlitecoinaccount) | **POST** /litecoin | 
*LitecoinApi* | [**getLitecoinAccount**](docs/LitecoinApi.md#getlitecoinaccount) | **GET** /litecoin/{accountName} | 
*LitecoinApi* | [**listLitecoinAccounts**](docs/LitecoinApi.md#listlitecoinaccounts) | **GET** /litecoin | 
*LitecoinApi* | [**signLitecoinTransaction**](docs/LitecoinApi.md#signlitecointransaction) | **POST** /litecoin/{accountName}/sign-tx | 
*OneinchApi* | [**approveCallData**](docs/OneinchApi.md#approvecalldata) | **POST** /oneinch/approve-call-data | 
*OneinchApi* | [**approveSpender**](docs/OneinchApi.md#approvespender) | **POST** /oneinch/approve-spender | 
*OneinchApi* | [**protocols**](docs/OneinchApi.md#protocols) | **POST** /oneinch/protocols | 
*OneinchApi* | [**quote**](docs/OneinchApi.md#quote) | **POST** /oneinch/quote | 
*OneinchApi* | [**swap**](docs/OneinchApi.md#swap) | **POST** /oneinch/{accountName}/swap | 
*OneinchApi* | [**tokens**](docs/OneinchApi.md#tokens) | **POST** /oneinch/tokens | 
*OnramperApi* | [**onRamperCheckout**](docs/OnramperApi.md#onrampercheckout) | **POST** /onramper/fund/${accountName} | 
*OnramperApi* | [**onRamperGetQuotesBuy**](docs/OnramperApi.md#onrampergetquotesbuy) | **GET** /onramper/quotes/buy | 
*OnramperApi* | [**onRamperGetQuotesSell**](docs/OnramperApi.md#onrampergetquotessell) | **GET** /onramper/quotes/sell | 
*OnramperApi* | [**onRamperGetSupportedAssets**](docs/OnramperApi.md#onrampergetsupportedassets) | **GET** /onramper/assets | 
*OnramperApi* | [**onRamperGetSupportedCurrencies**](docs/OnramperApi.md#onrampergetsupportedcurrencies) | **GET** /onramper/currencies | 
*OnramperApi* | [**onRamperGetSupportedDefaultsAll**](docs/OnramperApi.md#onrampergetsupporteddefaultsall) | **GET** /onramper/defaults | 
*OnramperApi* | [**onRamperGetSupportedOnRampsAll**](docs/OnramperApi.md#onrampergetsupportedonrampsall) | **GET** /onramper/onramps | 
*OnramperApi* | [**onRamperGetSupportedPaymentTypes**](docs/OnramperApi.md#onrampergetsupportedpaymenttypes) | **GET** /onramper/payment-types | 
*OnramperApi* | [**onRamperGetSupportedPaymentTypesFiat**](docs/OnramperApi.md#onrampergetsupportedpaymenttypesfiat) | **GET** /onramper/payment-types/fiat | 
*PaymentApi* | [**moralisWebhook**](docs/PaymentApi.md#moraliswebhook) | **POST** /payment/webhook/{id} | 
*PaymentApi* | [**paymentCreatePaymentIntent**](docs/PaymentApi.md#paymentcreatepaymentintent) | **POST** /payment | 
*PaymentApi* | [**paymentDeletePaymentIntent**](docs/PaymentApi.md#paymentdeletepaymentintent) | **DELETE** /payment/{id} | 
*PaymentApi* | [**paymentGetAllPaymentIntents**](docs/PaymentApi.md#paymentgetallpaymentintents) | **GET** /payment | 
*PaymentApi* | [**paymentGetAvailableChains**](docs/PaymentApi.md#paymentgetavailablechains) | **GET** /payment/chains | 
*PaymentApi* | [**paymentGetPaymentIntent**](docs/PaymentApi.md#paymentgetpaymentintent) | **GET** /payment/{id} | 
*PaymentApi* | [**paymentUpdatePaymentIntent**](docs/PaymentApi.md#paymentupdatepaymentintent) | **PUT** /payment/{id} | 
*PaymentApi* | [**tatumWebhook**](docs/PaymentApi.md#tatumwebhook) | **POST** /payment/tatum/webhook/{id} | 
*RippleApi* | [**createRippleAccount**](docs/RippleApi.md#createrippleaccount) | **POST** /ripple | 
*RippleApi* | [**getRippleAccount**](docs/RippleApi.md#getrippleaccount) | **GET** /ripple/{accountName} | 
*RippleApi* | [**listRippleAccounts**](docs/RippleApi.md#listrippleaccounts) | **GET** /ripple | 
*RippleApi* | [**signRippleTransaction**](docs/RippleApi.md#signrippletransaction) | **POST** /ripple/{accountName}/sign-tx | 
*SolanaApi* | [**createSolanaAccount**](docs/SolanaApi.md#createsolanaaccount) | **POST** /solana | 
*SolanaApi* | [**getSolanaAccount**](docs/SolanaApi.md#getsolanaaccount) | **GET** /solana/{accountName} | 
*SolanaApi* | [**listSolanaAccounts**](docs/SolanaApi.md#listsolanaaccounts) | **GET** /solana | 
*SolanaApi* | [**signSolanaTransaction**](docs/SolanaApi.md#signsolanatransaction) | **POST** /solana/{accountName}/sign-tx | 
*TronApi* | [**createTronAccount**](docs/TronApi.md#createtronaccount) | **POST** /tron | 
*TronApi* | [**getTronAccount**](docs/TronApi.md#gettronaccount) | **GET** /tron/{accountName} | 
*TronApi* | [**listTronAccounts**](docs/TronApi.md#listtronaccounts) | **GET** /tron | 
*TronApi* | [**signTronTransaction**](docs/TronApi.md#signtrontransaction) | **POST** /tron/{accountName}/sign-tx | 
*UniSwapApi* | [**addLiquidity**](docs/UniSwapApi.md#addliquidity) | **POST** /uniswap/{name}/add-liquidity | 
*UniSwapApi* | [**removeLiquidity**](docs/UniSwapApi.md#removeliquidity) | **POST** /uniswap/{name}/remove-liquidity | 
*UniSwapApi* | [**swapExactETHForTokens**](docs/UniSwapApi.md#swapexactethfortokens) | **POST** /uniswap/{name}/swap-exact-eth-for-tokens | 
*UniSwapApi* | [**swapExactTokensForTokens**](docs/UniSwapApi.md#swapexacttokensfortokens) | **POST** /uniswap/{name}/swap-exact-tokens-for-tokens | 
*YearnApi* | [**addLiquidity**](docs/YearnApi.md#addliquidity) | **POST** /yearn/{name}/add-liquidity | 
*YearnApi* | [**addLiquidityWeth**](docs/YearnApi.md#addliquidityweth) | **POST** /yearn/{name}/add-liquidity-weth | 
*YearnApi* | [**removeLiquidity**](docs/YearnApi.md#removeliquidity) | **POST** /yearn/{name}/remove-liquidity | 
*YearnApi* | [**removeLiquidityWeth**](docs/YearnApi.md#removeliquidityweth) | **POST** /yearn/{name}/remove-liquidity-weth | 


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.AaveInput](docs/AaveInput.md)
 - [org.openapitools.client.models.AaveReservesData](docs/AaveReservesData.md)
 - [org.openapitools.client.models.AbiInput](docs/AbiInput.md)
 - [org.openapitools.client.models.AbiItem](docs/AbiItem.md)
 - [org.openapitools.client.models.AbiOutput](docs/AbiOutput.md)
 - [org.openapitools.client.models.AccountControllerResponse](docs/AccountControllerResponse.md)
 - [org.openapitools.client.models.AccountControllerResponseData](docs/AccountControllerResponseData.md)
 - [org.openapitools.client.models.AccountResponse](docs/AccountResponse.md)
 - [org.openapitools.client.models.AvailablePaymentMethod](docs/AvailablePaymentMethod.md)
 - [org.openapitools.client.models.BalanceResponse](docs/BalanceResponse.md)
 - [org.openapitools.client.models.BitcoinCashInput](docs/BitcoinCashInput.md)
 - [org.openapitools.client.models.BitcoinCashTransactionInput](docs/BitcoinCashTransactionInput.md)
 - [org.openapitools.client.models.BitcoinInput](docs/BitcoinInput.md)
 - [org.openapitools.client.models.BitcoinTransactionInput](docs/BitcoinTransactionInput.md)
 - [org.openapitools.client.models.BitcoinTransactionOutput](docs/BitcoinTransactionOutput.md)
 - [org.openapitools.client.models.Block](docs/Block.md)
 - [org.openapitools.client.models.BroadCastRawTransactionResponse](docs/BroadCastRawTransactionResponse.md)
 - [org.openapitools.client.models.BroadcastInput](docs/BroadcastInput.md)
 - [org.openapitools.client.models.ConveyorFinanceControllerResponse](docs/ConveyorFinanceControllerResponse.md)
 - [org.openapitools.client.models.CosmosInput](docs/CosmosInput.md)
 - [org.openapitools.client.models.CosmosTransactionInput](docs/CosmosTransactionInput.md)
 - [org.openapitools.client.models.CreateAccountInput](docs/CreateAccountInput.md)
 - [org.openapitools.client.models.CreatePaymentIntentInput](docs/CreatePaymentIntentInput.md)
 - [org.openapitools.client.models.CryptoCurrency](docs/CryptoCurrency.md)
 - [org.openapitools.client.models.DeployInput](docs/DeployInput.md)
 - [org.openapitools.client.models.DogeCoinInput](docs/DogeCoinInput.md)
 - [org.openapitools.client.models.DogeCoinTransactionInput](docs/DogeCoinTransactionInput.md)
 - [org.openapitools.client.models.ENSReverseResolveResponse](docs/ENSReverseResolveResponse.md)
 - [org.openapitools.client.models.EnsResolveInput](docs/EnsResolveInput.md)
 - [org.openapitools.client.models.EnsResolveResponse](docs/EnsResolveResponse.md)
 - [org.openapitools.client.models.EosInput](docs/EosInput.md)
 - [org.openapitools.client.models.EosTransactionInput](docs/EosTransactionInput.md)
 - [org.openapitools.client.models.Erc1155Request](docs/Erc1155Request.md)
 - [org.openapitools.client.models.Erc1155Response](docs/Erc1155Response.md)
 - [org.openapitools.client.models.Erc20Response](docs/Erc20Response.md)
 - [org.openapitools.client.models.Erc721Request](docs/Erc721Request.md)
 - [org.openapitools.client.models.Erc721Response](docs/Erc721Response.md)
 - [org.openapitools.client.models.FiatCurrency](docs/FiatCurrency.md)
 - [org.openapitools.client.models.GetSupportedOnRampsResponse](docs/GetSupportedOnRampsResponse.md)
 - [org.openapitools.client.models.GetSupportedOnRampsResponseMessageInner](docs/GetSupportedOnRampsResponseMessageInner.md)
 - [org.openapitools.client.models.GetSupportedOnRampsResponseMessageInnerIcons](docs/GetSupportedOnRampsResponseMessageInnerIcons.md)
 - [org.openapitools.client.models.GetSupportedOnRampsResponseMessageInnerIconsPng](docs/GetSupportedOnRampsResponseMessageInnerIconsPng.md)
 - [org.openapitools.client.models.GetSwapDto](docs/GetSwapDto.md)
 - [org.openapitools.client.models.IERC20Approval](docs/IERC20Approval.md)
 - [org.openapitools.client.models.IERC20Transfer](docs/IERC20Transfer.md)
 - [org.openapitools.client.models.INFTApproval](docs/INFTApproval.md)
 - [org.openapitools.client.models.INFTApprovalERC1155](docs/INFTApprovalERC1155.md)
 - [org.openapitools.client.models.INFTApprovalERC721](docs/INFTApprovalERC721.md)
 - [org.openapitools.client.models.INFTTransfer](docs/INFTTransfer.md)
 - [org.openapitools.client.models.INativeBalance](docs/INativeBalance.md)
 - [org.openapitools.client.models.IOldNFTApproval](docs/IOldNFTApproval.md)
 - [org.openapitools.client.models.IWebhook](docs/IWebhook.md)
 - [org.openapitools.client.models.InputBody](docs/InputBody.md)
 - [org.openapitools.client.models.InternalTransaction](docs/InternalTransaction.md)
 - [org.openapitools.client.models.LitecoinInput](docs/LitecoinInput.md)
 - [org.openapitools.client.models.LitecoinTransactionInput](docs/LitecoinTransactionInput.md)
 - [org.openapitools.client.models.Log](docs/Log.md)
 - [org.openapitools.client.models.Message](docs/Message.md)
 - [org.openapitools.client.models.NonceResponse](docs/NonceResponse.md)
 - [org.openapitools.client.models.PaymentIntentResponse](docs/PaymentIntentResponse.md)
 - [org.openapitools.client.models.PaymentType](docs/PaymentType.md)
 - [org.openapitools.client.models.PingResponse](docs/PingResponse.md)
 - [org.openapitools.client.models.Quote](docs/Quote.md)
 - [org.openapitools.client.models.RippleInput](docs/RippleInput.md)
 - [org.openapitools.client.models.RippleTransactionInput](docs/RippleTransactionInput.md)
 - [org.openapitools.client.models.SellQuote](docs/SellQuote.md)
 - [org.openapitools.client.models.SignMessage](docs/SignMessage.md)
 - [org.openapitools.client.models.SignTypedData](docs/SignTypedData.md)
 - [org.openapitools.client.models.SolanaInput](docs/SolanaInput.md)
 - [org.openapitools.client.models.SolanaTransactionInput](docs/SolanaTransactionInput.md)
 - [org.openapitools.client.models.SupportedAssetResponse](docs/SupportedAssetResponse.md)
 - [org.openapitools.client.models.SupportedAssetResponseAssetsInner](docs/SupportedAssetResponseAssetsInner.md)
 - [org.openapitools.client.models.SupportedCurrenciesResponse](docs/SupportedCurrenciesResponse.md)
 - [org.openapitools.client.models.SupportedDefaultResponse](docs/SupportedDefaultResponse.md)
 - [org.openapitools.client.models.SupportedDefaultResponseDefaults](docs/SupportedDefaultResponseDefaults.md)
 - [org.openapitools.client.models.SupportedDefaultResponseDefaultsId](docs/SupportedDefaultResponseDefaultsId.md)
 - [org.openapitools.client.models.SupportedPaymentTypesCurrencyResponse](docs/SupportedPaymentTypesCurrencyResponse.md)
 - [org.openapitools.client.models.SupportedPaymentTypesMessage](docs/SupportedPaymentTypesMessage.md)
 - [org.openapitools.client.models.TokenSwapParams](docs/TokenSwapParams.md)
 - [org.openapitools.client.models.Transaction](docs/Transaction.md)
 - [org.openapitools.client.models.TransactionData](docs/TransactionData.md)
 - [org.openapitools.client.models.TransactionInput](docs/TransactionInput.md)
 - [org.openapitools.client.models.TransactionInputMetaData](docs/TransactionInputMetaData.md)
 - [org.openapitools.client.models.TransactionInputSupportedParams](docs/TransactionInputSupportedParams.md)
 - [org.openapitools.client.models.TransactionInputSupportedParamsPartnerData](docs/TransactionInputSupportedParamsPartnerData.md)
 - [org.openapitools.client.models.TransactionInputSupportedParamsPartnerDataRedirectUrl](docs/TransactionInputSupportedParamsPartnerDataRedirectUrl.md)
 - [org.openapitools.client.models.TransactionInputSupportedParamsTheme](docs/TransactionInputSupportedParamsTheme.md)
 - [org.openapitools.client.models.TransactionInputWallet](docs/TransactionInputWallet.md)
 - [org.openapitools.client.models.TransactionRequest](docs/TransactionRequest.md)
 - [org.openapitools.client.models.TransactionResponse](docs/TransactionResponse.md)
 - [org.openapitools.client.models.TransactionResponseInfo](docs/TransactionResponseInfo.md)
 - [org.openapitools.client.models.TransactionResponseTx](docs/TransactionResponseTx.md)
 - [org.openapitools.client.models.TriggerOutput](docs/TriggerOutput.md)
 - [org.openapitools.client.models.TronInput](docs/TronInput.md)
 - [org.openapitools.client.models.TronTransactionInput](docs/TronTransactionInput.md)
 - [org.openapitools.client.models.Tx](docs/Tx.md)
 - [org.openapitools.client.models.UniswapInput](docs/UniswapInput.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="BearerAuth"></a>
### BearerAuth

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

<a id="OAuth2"></a>
### OAuth2

- **Type**: OAuth
- **Flow**: password
- **Authorization URL**: 
- **Scopes**: 
  - authorization_code: grants authorization_code

<a id="ApiKeyAuth"></a>
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: x-api-key
- **Location**: HTTP header

