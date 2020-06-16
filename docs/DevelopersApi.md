# DevelopersApi

All URIs are relative to *https://cadastro.orama.com.br/api/contas/v2.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountIdentificacaoParceiroPost**](DevelopersApi.md#accountIdentificacaoParceiroPost) | **POST** /identificacao-parceiro/ | Cria um login para usuário.



## accountIdentificacaoParceiroPost

> LoginCriado accountIdentificacaoParceiroPost(loginSenhaObjeto)

Cria um login para usuário.

Cria um novo login que será usado para acesso ao sistema.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DevelopersApi;

DevelopersApi apiInstance = new DevelopersApi();
LoginSenhaObjeto loginSenhaObjeto = new LoginSenhaObjeto(); // LoginSenhaObjeto | Dados para criação do login
try {
    LoginCriado result = apiInstance.accountIdentificacaoParceiroPost(loginSenhaObjeto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DevelopersApi#accountIdentificacaoParceiroPost");
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

[Api-Key](../README.md#Api-Key)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

