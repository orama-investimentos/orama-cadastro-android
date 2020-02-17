# UsersApi

All URIs are relative to *https://cadastro.orama.com.br/api/contas/v2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountAutenticacaoPost**](UsersApi.md#accountAutenticacaoPost) | **POST** /autenticacao/ | Autentica um usuário que ainda não é cliente.
[**accountDocumentoConfirmacaoGet**](UsersApi.md#accountDocumentoConfirmacaoGet) | **GET** /perfil/{cpf}/documento/confirmacao/ | Consulta o status de confirmação do documento que foi submetido
[**accountDocumentoPut**](UsersApi.md#accountDocumentoPut) | **PUT** /perfil/{cpf}/documento/ | Anexa ou atualiza documento para conferencia de autenticidade do perfil.
[**accountIdentificacaoPost**](UsersApi.md#accountIdentificacaoPost) | **POST** /identificacao/ | Cria um login para usuário.
[**accountPerfilAprovacaoGet**](UsersApi.md#accountPerfilAprovacaoGet) | **GET** /perfil/{cpf}/aprovacao/ | Retorna o estado de aprovação de um perfil
[**accountPerfilAssinaturaEletronicaGet**](UsersApi.md#accountPerfilAssinaturaEletronicaGet) | **GET** /perfil/{cpf}/assinatura-eletronica/ | Verifica se a assinatura eletronica já foi definida.
[**accountPerfilAssinaturaEletronicaPost**](UsersApi.md#accountPerfilAssinaturaEletronicaPost) | **POST** /perfil/{cpf}/assinatura-eletronica/ | Realiza o cadastro da assinatura eletrônica do perfil.
[**accountPerfilCelularAutenticacaoConfirmacaoGet**](UsersApi.md#accountPerfilCelularAutenticacaoConfirmacaoGet) | **GET** /perfil/{cpf}/celular/autenticacao/confirmacao/ | Estado atual de confirmação do celular
[**accountPerfilCelularAutenticacaoPost**](UsersApi.md#accountPerfilCelularAutenticacaoPost) | **POST** /perfil/{cpf}/celular/autenticacao/ | Gera um código para iniciar o processo de validação do número do celular
[**accountPerfilCelularConfirmacaoPost**](UsersApi.md#accountPerfilCelularConfirmacaoPost) | **POST** /perfil/{cpf}/celular/autenticacao/confirmacao/ | Confirma o numero de celular, concluindo a validação
[**accountPerfilEmailAutenticacaoConfirmacaoGet**](UsersApi.md#accountPerfilEmailAutenticacaoConfirmacaoGet) | **GET** /perfil/{cpf}/email/autenticacao/confirmacao/ | Estado atual de confirmação do email
[**accountPerfilEmailAutenticacaoPost**](UsersApi.md#accountPerfilEmailAutenticacaoPost) | **POST** /perfil/{cpf}/email/autenticacao/ | Gera um código para iniciar o processo de validação do email
[**accountPerfilEmailConfirmacaoPost**](UsersApi.md#accountPerfilEmailConfirmacaoPost) | **POST** /perfil/{cpf}/email/autenticacao/confirmacao/ | Confirma o email, concluindo a validação
[**accountPerfilGet**](UsersApi.md#accountPerfilGet) | **GET** /perfil/{cpf}/ | Retorna o perfil de um usuário que ainda não foi transformado em cliente.
[**accountPerfilPost**](UsersApi.md#accountPerfilPost) | **POST** /perfil/{cpf}/ | Submete o perfil de usuário associado a um login para ser criado como cliente.
[**accountPerfilPut**](UsersApi.md#accountPerfilPut) | **PUT** /perfil/{cpf}/ | Atualiza perfil para criação de conta.
[**accountPerfilSubmetidoGet**](UsersApi.md#accountPerfilSubmetidoGet) | **GET** /perfil/{cpf}/submetido/ | Retorna o estado de submissão de um perfil
[**accountPerfilTermosConfirmacaoGet**](UsersApi.md#accountPerfilTermosConfirmacaoGet) | **GET** /perfil/{cpf}/termos/confirmacao/ | Estado atual de confirmação do aceite de termos
[**accountPerfilTermosConfirmacaoPost**](UsersApi.md#accountPerfilTermosConfirmacaoPost) | **POST** /perfil/{cpf}/termos/confirmacao/ | Confirma o aceite de termos
[**accountPerfilTermosGet**](UsersApi.md#accountPerfilTermosGet) | **GET** /perfil/{cpf}/termos/ | Consulta os termos requeridos para o perfil



## accountAutenticacaoPost

> AutenticacaoObjeto accountAutenticacaoPost(usuarioSenhaObjeto)

Autentica um usuário que ainda não é cliente.

Autentica um usuário que ainda não é cliente, caso o usuário não existe, ou a combinação de usuário e senha ou ainda o usuário já seja cliente retorna um erro.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
UsuarioSenhaObjeto usuarioSenhaObjeto = new UsuarioSenhaObjeto(); // UsuarioSenhaObjeto | Dados para autenticação do usuário
try {
    AutenticacaoObjeto result = apiInstance.accountAutenticacaoPost(usuarioSenhaObjeto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountAutenticacaoPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usuarioSenhaObjeto** | [**UsuarioSenhaObjeto**](UsuarioSenhaObjeto.md)| Dados para autenticação do usuário |

### Return type

[**AutenticacaoObjeto**](AutenticacaoObjeto.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## accountDocumentoConfirmacaoGet

> accountDocumentoConfirmacaoGet(cpf, tipoDocumento)

Consulta o status de confirmação do documento que foi submetido

Consulta o status de confirmação do documento que foi submetido

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
String tipoDocumento = Passaporte; // String | Tipo do documento
try {
    apiInstance.accountDocumentoConfirmacaoGet(cpf, tipoDocumento);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountDocumentoConfirmacaoGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]
 **tipoDocumento** | **String**| Tipo do documento | [default to null] [enum: Carteira de Habilitação - CNH, Passaporte, Cart. Ident. Estrangeiro - RNE, Cart. Identidade Profissional, Carteira de Identidade / RG, Comprovante Bancário, Comprovante de Residência]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## accountDocumentoPut

> accountDocumentoPut(cpf, tipoDocumento, filename)

Anexa ou atualiza documento para conferencia de autenticidade do perfil.

Anexa ou atualiza documento que será usado no processo conferencia de autenticidade do perfil. É recomendado fazer o upload de documentos para comprovação de identidade. Caso o perfil tiver conta bancária conjunta ou a conta seja do banco Itaú é recomendado o upload do documento &#39;Comprovante Bancário&#39;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
String tipoDocumento = Passaporte; // String | Tipo do documento
File filename = null; // File | Arquivo binário que será enviado. O formato deve ser PDF, PNG ou JPG
try {
    apiInstance.accountDocumentoPut(cpf, tipoDocumento, filename);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountDocumentoPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]
 **tipoDocumento** | **String**| Tipo do documento | [default to null] [enum: Carteira de Habilitação - CNH, Passaporte, Cart. Ident. Estrangeiro - RNE, Cart. Identidade Profissional, Carteira de Identidade / RG, Comprovante Bancário, Comprovante de Residência]
 **filename** | **File**| Arquivo binário que será enviado. O formato deve ser PDF, PNG ou JPG | [default to null]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## accountIdentificacaoPost

> LoginCriado accountIdentificacaoPost(loginSenhaObjeto)

Cria um login para usuário.

Cria um novo login que será usado para acesso ao sistema.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
LoginSenhaObjeto loginSenhaObjeto = new LoginSenhaObjeto(); // LoginSenhaObjeto | Dados para criação do login
try {
    LoginCriado result = apiInstance.accountIdentificacaoPost(loginSenhaObjeto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountIdentificacaoPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loginSenhaObjeto** | [**LoginSenhaObjeto**](LoginSenhaObjeto.md)| Dados para criação do login |

### Return type

[**LoginCriado**](LoginCriado.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## accountPerfilAprovacaoGet

> Aprovacao accountPerfilAprovacaoGet(cpf)

Retorna o estado de aprovação de um perfil

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
try {
    Aprovacao result = apiInstance.accountPerfilAprovacaoGet(cpf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountPerfilAprovacaoGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]

### Return type

[**Aprovacao**](Aprovacao.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## accountPerfilAssinaturaEletronicaGet

> accountPerfilAssinaturaEletronicaGet(cpf)

Verifica se a assinatura eletronica já foi definida.

Verifica se a assinatura eletronica já foi definida.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
try {
    apiInstance.accountPerfilAssinaturaEletronicaGet(cpf);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountPerfilAssinaturaEletronicaGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]

### Return type

null (empty response body)

### Authorization

[Api-Key](../README.md#Api-Key), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## accountPerfilAssinaturaEletronicaPost

> accountPerfilAssinaturaEletronicaPost(cpf, assinaturaEletronica)

Realiza o cadastro da assinatura eletrônica do perfil.

Cadastra a assinatura eletrônica do perfil, realiza validação da assinatura eletronica.  A assinatura deve respeitar as seguintes condições: - Conter de 6 a 15 dígitos - Conter apenas letras e números - Não deve conter 6 ou mais dígitos sequênciais, ex.: &#39;abcdef&#39;, &#39;123456&#39; - Se a assinatura contém entre 6 e 7 dígitos não deve repetir 3 dígitos seguidos, ex.: &#39;111&#39;, &#39;aaa&#39; - Se a assinatura contém entre 8 e 12 dígitos não deve repetir 4 dígitos seguidos, ex.: &#39;1111&#39;, &#39;aaaa&#39; - Se a assinatura contém entre 13 e 14 dígitos não deve repetir 5 dígitos seguidos, ex.: &#39;11111&#39;, &#39;aaaaa&#39; - Se a assinatura contém 15 dígitos não deve repetir 6 dígitos seguidos, ex.: &#39;111111&#39;, &#39;aaaaaa&#39; - A assinatura não deve conter nenhuma das palavras a seguir:      &#39;select&#39;, &#39;update&#39;, &#39;insert&#39;, &#39;delete&#39;, &#39;drop&#39;, &#39;truncate&#39;, &#39;waitfor&#39;, &#39;delay&#39;, &#39;where&#39;, &#39;from&#39;, &#39;having&#39;, &#39;script&#39;, &#39;applet&#39;, &#39;sha1&#39;

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
AssinaturaEletronica assinaturaEletronica = new AssinaturaEletronica(); // AssinaturaEletronica | Dados para criação da assinatura eletrônica
try {
    apiInstance.accountPerfilAssinaturaEletronicaPost(cpf, assinaturaEletronica);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountPerfilAssinaturaEletronicaPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]
 **assinaturaEletronica** | [**AssinaturaEletronica**](AssinaturaEletronica.md)| Dados para criação da assinatura eletrônica |

### Return type

null (empty response body)

### Authorization

[Api-Key](../README.md#Api-Key), [JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## accountPerfilCelularAutenticacaoConfirmacaoGet

> Confirmado accountPerfilCelularAutenticacaoConfirmacaoGet(cpf)

Estado atual de confirmação do celular

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
try {
    Confirmado result = apiInstance.accountPerfilCelularAutenticacaoConfirmacaoGet(cpf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountPerfilCelularAutenticacaoConfirmacaoGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]

### Return type

[**Confirmado**](Confirmado.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## accountPerfilCelularAutenticacaoPost

> accountPerfilCelularAutenticacaoPost(cpf)

Gera um código para iniciar o processo de validação do número do celular

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
try {
    apiInstance.accountPerfilCelularAutenticacaoPost(cpf);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountPerfilCelularAutenticacaoPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## accountPerfilCelularConfirmacaoPost

> Confirmado accountPerfilCelularConfirmacaoPost(cpf, codigo)

Confirma o numero de celular, concluindo a validação

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
String codigo = 1341; // String | Código de validação para confirmar o número de celular
try {
    Confirmado result = apiInstance.accountPerfilCelularConfirmacaoPost(cpf, codigo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountPerfilCelularConfirmacaoPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]
 **codigo** | **String**| Código de validação para confirmar o número de celular | [default to null]

### Return type

[**Confirmado**](Confirmado.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## accountPerfilEmailAutenticacaoConfirmacaoGet

> Confirmado accountPerfilEmailAutenticacaoConfirmacaoGet(cpf)

Estado atual de confirmação do email

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
try {
    Confirmado result = apiInstance.accountPerfilEmailAutenticacaoConfirmacaoGet(cpf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountPerfilEmailAutenticacaoConfirmacaoGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]

### Return type

[**Confirmado**](Confirmado.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## accountPerfilEmailAutenticacaoPost

> accountPerfilEmailAutenticacaoPost(cpf)

Gera um código para iniciar o processo de validação do email

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
try {
    apiInstance.accountPerfilEmailAutenticacaoPost(cpf);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountPerfilEmailAutenticacaoPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## accountPerfilEmailConfirmacaoPost

> Confirmado accountPerfilEmailConfirmacaoPost(cpf, codigo)

Confirma o email, concluindo a validação

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
String codigo = 1341; // String | Código de validação para confirmar o email
try {
    Confirmado result = apiInstance.accountPerfilEmailConfirmacaoPost(cpf, codigo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountPerfilEmailConfirmacaoPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]
 **codigo** | **String**| Código de validação para confirmar o email | [default to null]

### Return type

[**Confirmado**](Confirmado.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## accountPerfilGet

> PerfilUsuario accountPerfilGet(cpf, campos)

Retorna o perfil de um usuário que ainda não foi transformado em cliente.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
String campos = login,profissao,usPerson; // String | Lista de campos para ser inclusivamente filtrados
try {
    PerfilUsuario result = apiInstance.accountPerfilGet(cpf, campos);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountPerfilGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]
 **campos** | **String**| Lista de campos para ser inclusivamente filtrados | [optional] [default to null]

### Return type

[**PerfilUsuario**](PerfilUsuario.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## accountPerfilPost

> accountPerfilPost(cpf)

Submete o perfil de usuário associado a um login para ser criado como cliente.

Submete o perfil de usuário associado a um login para ser criado como cliente. A assinatura eletrônica é obrigatória para a submissão do usuário, ver endpoint /perfil/{cpf}/assinatura-eletronica/. É necessário validar ambos o número do celular e o e-mail para que a submissão seja aceita, veja os endpoints /perfil/{cpf}/celular/autenticacao/ e /perfil/{cpf}/email/autenticacao/. Após submissão deste POST, o perfil não poderá mais ser alterado. Para alterar ou inserir informações no perfil antes de submeter o perfil o método PUT deve ser utilizado.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
try {
    apiInstance.accountPerfilPost(cpf);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountPerfilPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## accountPerfilPut

> accountPerfilPut(cpf, perfilUsuario)

Atualiza perfil para criação de conta.

Atualiza um perfil de usuário associado a um login para o processo de criação de um usuário. Cada chamada modifica o perfil. Quando o perfil estiver pronto para ser submetido para criação de conta, basta enviar um POST.

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
PerfilUsuario perfilUsuario = new PerfilUsuario(); // PerfilUsuario | Dados para criação ou atualização do perfil
try {
    apiInstance.accountPerfilPut(cpf, perfilUsuario);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountPerfilPut");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]
 **perfilUsuario** | [**PerfilUsuario**](PerfilUsuario.md)| Dados para criação ou atualização do perfil |

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## accountPerfilSubmetidoGet

> Submetido accountPerfilSubmetidoGet(cpf)

Retorna o estado de submissão de um perfil

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
try {
    Submetido result = apiInstance.accountPerfilSubmetidoGet(cpf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountPerfilSubmetidoGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]

### Return type

[**Submetido**](Submetido.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## accountPerfilTermosConfirmacaoGet

> Confirmado accountPerfilTermosConfirmacaoGet(cpf)

Estado atual de confirmação do aceite de termos

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
try {
    Confirmado result = apiInstance.accountPerfilTermosConfirmacaoGet(cpf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountPerfilTermosConfirmacaoGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]

### Return type

[**Confirmado**](Confirmado.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## accountPerfilTermosConfirmacaoPost

> Confirmado accountPerfilTermosConfirmacaoPost(cpf)

Confirma o aceite de termos

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
try {
    Confirmado result = apiInstance.accountPerfilTermosConfirmacaoPost(cpf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountPerfilTermosConfirmacaoPost");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]

### Return type

[**Confirmado**](Confirmado.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## accountPerfilTermosGet

> List&lt;Termos&gt; accountPerfilTermosGet(cpf)

Consulta os termos requeridos para o perfil

Consulta os termos exigidos para o perfil

### Example

```java
// Import classes:
//import org.openapitools.client.api.UsersApi;

UsersApi apiInstance = new UsersApi();
String cpf = null; // String | CPF do perfil
try {
    List<Termos> result = apiInstance.accountPerfilTermosGet(cpf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#accountPerfilTermosGet");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cpf** | **String**| CPF do perfil | [default to null]

### Return type

[**List&lt;Termos&gt;**](Termos.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

