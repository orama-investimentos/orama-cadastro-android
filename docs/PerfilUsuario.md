

# PerfilUsuario

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**usPerson** | **Boolean** | define se o usuário pode ou não ser enquadrado como US person de acordo com a definição da CVM | 
**politicamenteExposto** | **Boolean** | define se o usuário pode ou não ser enquadrado como pessoa politicamente exposta de acordo com a definição da Deliberação Coremec nº 2, de 1º de dezembro de 2006 | 
**investidorQualificado** | **Boolean** | Define se o usuário é investidor qualifiquado. Investidor Qualificado - PF ou PJ que possuam investimentos financeiros em valor superior a 1 Milhão, Investidor aprovado em exame de qualificação técnica, e atestem por escrito sua condição de investidor qualificado. Investidores Profissionais, etc. | 
**nacionalidade** | [**NacionalidadeEnum**](#NacionalidadeEnum) | Definição de Nacionalidade de acordo com o Art. 12 da CF | 
**ufNascimento** | [**UfNascimentoEnum**](#UfNascimentoEnum) | Unidade da Federação em que a pessoa nasceu  - É obrigatório caso &#39;nacinalidade&#39; seja &#39;Brasileiro nato&#39; |  [optional]
**cidadeNascimento** | **String** | Município em que a pessoa nascida no Brasil nasceu. Formato é o nome lexicograficamente igual a descrição do IBGE ou o código de cidade completo do IBGE  - É obrigatório caso &#39;nacinalidade&#39; seja &#39;Brasileiro nato&#39; |  [optional]
**paisNascimento** | **String** | País em que a pessoa nasceu. Código ISO 3166-1 alpha-2 | 
**sexo** | [**SexoEnum**](#SexoEnum) | Sexo do indivíduo | 
**estadoCivil** | [**EstadoCivilEnum**](#EstadoCivilEnum) | Estado civil do usuário | 
**nomeConjuge** | **String** | Nome do conjuge ou companheiro, necessário em casos que o estado civil seja &#39;Casado(a)&#39; ou &#39;União estável&#39; |  [optional]
**nomeMae** | **String** | Nome da mãe do usuário | 
**nomePai** | **String** | Nome do pai do usuário.   - É obrigatório caso o usuário não possua pai desconhecido. |  [optional]
**paiDesconhecido** | **Boolean** | Se o usuário não possui Nome do Pai nos documentos. | 
**login** | [**LoginObjeto**](LoginObjeto.md) |  | 
**documento** | [**List&lt;Documento&gt;**](Documento.md) |  | 
**profissao** | [**DadosProfissionais**](DadosProfissionais.md) |  | 
**endereco** | [**Endereco**](Endereco.md) |  | 
**patrimonio** | [**DadosPatrimonial**](DadosPatrimonial.md) |  | 
**contaBancaria** | [**List&lt;ContaBancaria&gt;**](ContaBancaria.md) |  | 
**frontEnd** | [**FrontEndStep**](FrontEndStep.md) |  |  [optional]


## Enum: NacionalidadeEnum

Name | Value
---- | -----


## Enum: UfNascimentoEnum

Name | Value
---- | -----


## Enum: SexoEnum

Name | Value
---- | -----


## Enum: EstadoCivilEnum

Name | Value
---- | -----




