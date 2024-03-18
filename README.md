# org.usemoonai.moonsdk - Kotlin client library for moon-vault-api

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

All URIs are relative to *https://moon-vault-api-git-ew-supabase-migration-moonup.vercel.app*

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

 - [org.usemoonai.moonsdk.models.AaveInput](docs/AaveInput.md)
 - [org.usemoonai.moonsdk.models.AaveReservesAPIResponse](docs/AaveReservesAPIResponse.md)
 - [org.usemoonai.moonsdk.models.AaveReservesData](docs/AaveReservesData.md)
 - [org.usemoonai.moonsdk.models.AccountAPIResponse](docs/AccountAPIResponse.md)
 - [org.usemoonai.moonsdk.models.AccountData](docs/AccountData.md)
 - [org.usemoonai.moonsdk.models.AccountResponse](docs/AccountResponse.md)
 - [org.usemoonai.moonsdk.models.AvailablePaymentMethod](docs/AvailablePaymentMethod.md)
 - [org.usemoonai.moonsdk.models.BalanceAPIResponse](docs/BalanceAPIResponse.md)
 - [org.usemoonai.moonsdk.models.BalanceResponse](docs/BalanceResponse.md)
 - [org.usemoonai.moonsdk.models.BitcoinAPIResponse](docs/BitcoinAPIResponse.md)
 - [org.usemoonai.moonsdk.models.BitcoinCashAPIResponse](docs/BitcoinCashAPIResponse.md)
 - [org.usemoonai.moonsdk.models.BitcoinCashInput](docs/BitcoinCashInput.md)
 - [org.usemoonai.moonsdk.models.BitcoinCashTransactionInput](docs/BitcoinCashTransactionInput.md)
 - [org.usemoonai.moonsdk.models.BitcoinCashTransactionOutput](docs/BitcoinCashTransactionOutput.md)
 - [org.usemoonai.moonsdk.models.BitcoinInput](docs/BitcoinInput.md)
 - [org.usemoonai.moonsdk.models.BitcoinTransactionInput](docs/BitcoinTransactionInput.md)
 - [org.usemoonai.moonsdk.models.BitcoinTransactionOutput](docs/BitcoinTransactionOutput.md)
 - [org.usemoonai.moonsdk.models.BroadCastRawTransactionAPIResponse](docs/BroadCastRawTransactionAPIResponse.md)
 - [org.usemoonai.moonsdk.models.BroadCastRawTransactionResponse](docs/BroadCastRawTransactionResponse.md)
 - [org.usemoonai.moonsdk.models.BroadcastInput](docs/BroadcastInput.md)
 - [org.usemoonai.moonsdk.models.ConveyorFinanceControllerResponse](docs/ConveyorFinanceControllerResponse.md)
 - [org.usemoonai.moonsdk.models.CosmosAPIResponse](docs/CosmosAPIResponse.md)
 - [org.usemoonai.moonsdk.models.CosmosInput](docs/CosmosInput.md)
 - [org.usemoonai.moonsdk.models.CosmosTransactionInput](docs/CosmosTransactionInput.md)
 - [org.usemoonai.moonsdk.models.CosmosTransactionOutput](docs/CosmosTransactionOutput.md)
 - [org.usemoonai.moonsdk.models.CreateAccountInput](docs/CreateAccountInput.md)
 - [org.usemoonai.moonsdk.models.CryptoCurrency](docs/CryptoCurrency.md)
 - [org.usemoonai.moonsdk.models.DeployInput](docs/DeployInput.md)
 - [org.usemoonai.moonsdk.models.DogeCoinAPIResponse](docs/DogeCoinAPIResponse.md)
 - [org.usemoonai.moonsdk.models.DogeCoinInput](docs/DogeCoinInput.md)
 - [org.usemoonai.moonsdk.models.DogeCoinTransactionInput](docs/DogeCoinTransactionInput.md)
 - [org.usemoonai.moonsdk.models.DogeCoinTransactionOutput](docs/DogeCoinTransactionOutput.md)
 - [org.usemoonai.moonsdk.models.EnsResolveAPIResponse](docs/EnsResolveAPIResponse.md)
 - [org.usemoonai.moonsdk.models.EnsResolveInput](docs/EnsResolveInput.md)
 - [org.usemoonai.moonsdk.models.EnsResolveResponse](docs/EnsResolveResponse.md)
 - [org.usemoonai.moonsdk.models.EosAPIResponse](docs/EosAPIResponse.md)
 - [org.usemoonai.moonsdk.models.EosInput](docs/EosInput.md)
 - [org.usemoonai.moonsdk.models.EosTransactionInput](docs/EosTransactionInput.md)
 - [org.usemoonai.moonsdk.models.EosTransactionOutput](docs/EosTransactionOutput.md)
 - [org.usemoonai.moonsdk.models.Erc1155Request](docs/Erc1155Request.md)
 - [org.usemoonai.moonsdk.models.Erc721Request](docs/Erc721Request.md)
 - [org.usemoonai.moonsdk.models.FiatCurrency](docs/FiatCurrency.md)
 - [org.usemoonai.moonsdk.models.GetSupportedOnRampsResponse](docs/GetSupportedOnRampsResponse.md)
 - [org.usemoonai.moonsdk.models.GetSupportedOnRampsResponseMessageInner](docs/GetSupportedOnRampsResponseMessageInner.md)
 - [org.usemoonai.moonsdk.models.GetSupportedOnRampsResponseMessageInnerIcons](docs/GetSupportedOnRampsResponseMessageInnerIcons.md)
 - [org.usemoonai.moonsdk.models.GetSupportedOnRampsResponseMessageInnerIconsPng](docs/GetSupportedOnRampsResponseMessageInnerIconsPng.md)
 - [org.usemoonai.moonsdk.models.GetSwapDto](docs/GetSwapDto.md)
 - [org.usemoonai.moonsdk.models.InputBody](docs/InputBody.md)
 - [org.usemoonai.moonsdk.models.LitecoinAPIResponse](docs/LitecoinAPIResponse.md)
 - [org.usemoonai.moonsdk.models.LitecoinInput](docs/LitecoinInput.md)
 - [org.usemoonai.moonsdk.models.LitecoinTransactionInput](docs/LitecoinTransactionInput.md)
 - [org.usemoonai.moonsdk.models.LitecoinTransactionOutput](docs/LitecoinTransactionOutput.md)
 - [org.usemoonai.moonsdk.models.Message](docs/Message.md)
 - [org.usemoonai.moonsdk.models.NonceAPIResponse](docs/NonceAPIResponse.md)
 - [org.usemoonai.moonsdk.models.NonceResponse](docs/NonceResponse.md)
 - [org.usemoonai.moonsdk.models.PaymentType](docs/PaymentType.md)
 - [org.usemoonai.moonsdk.models.PingResponse](docs/PingResponse.md)
 - [org.usemoonai.moonsdk.models.Quote](docs/Quote.md)
 - [org.usemoonai.moonsdk.models.RippleAPIResponse](docs/RippleAPIResponse.md)
 - [org.usemoonai.moonsdk.models.RippleInput](docs/RippleInput.md)
 - [org.usemoonai.moonsdk.models.RippleTransactionInput](docs/RippleTransactionInput.md)
 - [org.usemoonai.moonsdk.models.RippleTransactionOutput](docs/RippleTransactionOutput.md)
 - [org.usemoonai.moonsdk.models.SellQuote](docs/SellQuote.md)
 - [org.usemoonai.moonsdk.models.SignMessage](docs/SignMessage.md)
 - [org.usemoonai.moonsdk.models.SignMessageAPIResponse](docs/SignMessageAPIResponse.md)
 - [org.usemoonai.moonsdk.models.SignTypedData](docs/SignTypedData.md)
 - [org.usemoonai.moonsdk.models.SolanaAPIResponse](docs/SolanaAPIResponse.md)
 - [org.usemoonai.moonsdk.models.SolanaInput](docs/SolanaInput.md)
 - [org.usemoonai.moonsdk.models.SolanaTransactionInput](docs/SolanaTransactionInput.md)
 - [org.usemoonai.moonsdk.models.SolanaTransactionOutput](docs/SolanaTransactionOutput.md)
 - [org.usemoonai.moonsdk.models.SupportedAssetResponse](docs/SupportedAssetResponse.md)
 - [org.usemoonai.moonsdk.models.SupportedAssetResponseAssetsInner](docs/SupportedAssetResponseAssetsInner.md)
 - [org.usemoonai.moonsdk.models.SupportedCurrenciesResponse](docs/SupportedCurrenciesResponse.md)
 - [org.usemoonai.moonsdk.models.SupportedDefaultResponse](docs/SupportedDefaultResponse.md)
 - [org.usemoonai.moonsdk.models.SupportedDefaultResponseDefaults](docs/SupportedDefaultResponseDefaults.md)
 - [org.usemoonai.moonsdk.models.SupportedDefaultResponseDefaultsId](docs/SupportedDefaultResponseDefaultsId.md)
 - [org.usemoonai.moonsdk.models.SupportedPaymentTypesCurrencyResponse](docs/SupportedPaymentTypesCurrencyResponse.md)
 - [org.usemoonai.moonsdk.models.SupportedPaymentTypesMessage](docs/SupportedPaymentTypesMessage.md)
 - [org.usemoonai.moonsdk.models.TokenSwapParams](docs/TokenSwapParams.md)
 - [org.usemoonai.moonsdk.models.Transaction](docs/Transaction.md)
 - [org.usemoonai.moonsdk.models.TransactionAPIResponse](docs/TransactionAPIResponse.md)
 - [org.usemoonai.moonsdk.models.TransactionData](docs/TransactionData.md)
 - [org.usemoonai.moonsdk.models.TransactionInput](docs/TransactionInput.md)
 - [org.usemoonai.moonsdk.models.TransactionInputMetaData](docs/TransactionInputMetaData.md)
 - [org.usemoonai.moonsdk.models.TransactionInputSupportedParams](docs/TransactionInputSupportedParams.md)
 - [org.usemoonai.moonsdk.models.TransactionInputSupportedParamsPartnerData](docs/TransactionInputSupportedParamsPartnerData.md)
 - [org.usemoonai.moonsdk.models.TransactionInputSupportedParamsPartnerDataRedirectUrl](docs/TransactionInputSupportedParamsPartnerDataRedirectUrl.md)
 - [org.usemoonai.moonsdk.models.TransactionInputSupportedParamsTheme](docs/TransactionInputSupportedParamsTheme.md)
 - [org.usemoonai.moonsdk.models.TransactionInputWallet](docs/TransactionInputWallet.md)
 - [org.usemoonai.moonsdk.models.TransactionRequest](docs/TransactionRequest.md)
 - [org.usemoonai.moonsdk.models.TransactionResponse](docs/TransactionResponse.md)
 - [org.usemoonai.moonsdk.models.TransactionResponseInfo](docs/TransactionResponseInfo.md)
 - [org.usemoonai.moonsdk.models.TransactionResponseTx](docs/TransactionResponseTx.md)
 - [org.usemoonai.moonsdk.models.TronAPIResponse](docs/TronAPIResponse.md)
 - [org.usemoonai.moonsdk.models.TronInput](docs/TronInput.md)
 - [org.usemoonai.moonsdk.models.TronTransactionInput](docs/TronTransactionInput.md)
 - [org.usemoonai.moonsdk.models.TronTransactionOutput](docs/TronTransactionOutput.md)
 - [org.usemoonai.moonsdk.models.Tx](docs/Tx.md)
 - [org.usemoonai.moonsdk.models.UniswapInput](docs/UniswapInput.md)


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

