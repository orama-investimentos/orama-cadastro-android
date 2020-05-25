

# Documento

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tipoDocumento** | [**TipoDocumentoEnum**](#TipoDocumentoEnum) |  | 
**numeroDocumento** | **String** |  | 
**orgaoExpedidor** | [**OrgaoExpedidorEnum**](#OrgaoExpedidorEnum) | Orgão expedidor de acordo com o tipo de documento | 
**ufEmissao** | **String** | Unidade da Federação onde foi emitido o documeto | 
**dataEmissao** | [**Date**](Date.md) | Data em que o documento foi emitido no formato YYYY-MM-DD (cf. RFC 3339, section 5.8) | 
**dataValidade** | [**Date**](Date.md) | Data de validade do documento no formato YYYY-MM-DD (cf. RFC 3339, section 5.8) |  [optional]
**codigoSegurancaCNH** | **String** | Código de Segurança da Carteira Nacional de Habilitação  - Obrigatório caso &#39;tipoDocumento&#39; seja &#39;Carteira de Habilitação - CNH&#39; |  [optional]


## Enum: TipoDocumentoEnum

Name | Value
---- | -----


## Enum: OrgaoExpedidorEnum

Name | Value
---- | -----




