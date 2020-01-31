/**
 * Criação de Contas
 * API de Criação de Contas.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: cadastro_api@orama.com.br
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.ContaBancaria;
import org.openapitools.client.model.DadosPatrimonial;
import org.openapitools.client.model.DadosProfissionais;
import org.openapitools.client.model.Documento;
import org.openapitools.client.model.Endereco;
import org.openapitools.client.model.FrontEndStep;
import org.openapitools.client.model.LoginObjeto;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class PerfilUsuario {
  
  @SerializedName("usPerson")
  private Boolean usPerson = false;
  @SerializedName("politicamenteExposto")
  private Boolean politicamenteExposto = false;
  @SerializedName("investidorQualificado")
  private Boolean investidorQualificado = false;
  public enum NacionalidadeEnum {
     Brasileiro Nato,  Estrangeiro,  Brasileiro Naturalizado, 
  };
  @SerializedName("nacionalidade")
  private NacionalidadeEnum nacionalidade = null;
  public enum UfNascimentoEnum {
     AC,  AL,  AM,  AP,  BA,  CE,  DF,  ES,  GO,  MA,  MG,  MS,  MT,  PA,  PB,  PE,  PI,  PR,  RJ,  RN,  RO,  RR,  RS,  SC,  SE,  SP,  TO, 
  };
  @SerializedName("ufNascimento")
  private UfNascimentoEnum ufNascimento = null;
  @SerializedName("cidadeNascimento")
  private String cidadeNascimento = null;
  @SerializedName("paisNascimento")
  private String paisNascimento = null;
  public enum SexoEnum {
     Feminino,  Masculino, 
  };
  @SerializedName("sexo")
  private SexoEnum sexo = null;
  public enum EstadoCivilEnum {
     Casado(a),  Solteiro(a),  Divorciado(a),  União estável,  Separado(a),  Viúvo(a), 
  };
  @SerializedName("estadoCivil")
  private EstadoCivilEnum estadoCivil = null;
  @SerializedName("nomeConjuge")
  private String nomeConjuge = null;
  @SerializedName("nomeMae")
  private String nomeMae = null;
  @SerializedName("nomePai")
  private String nomePai = null;
  @SerializedName("login")
  private LoginObjeto login = null;
  @SerializedName("documento")
  private List<Documento> documento = null;
  @SerializedName("profissao")
  private DadosProfissionais profissao = null;
  @SerializedName("endereco")
  private Endereco endereco = null;
  @SerializedName("patrimonio")
  private DadosPatrimonial patrimonio = null;
  @SerializedName("contaBancaria")
  private List<ContaBancaria> contaBancaria = null;
  @SerializedName("frontEnd")
  private FrontEndStep frontEnd = null;

  /**
   * define se o usuário pode ou não ser enquadrado como US person de acordo com a definição da CVM
   **/
  @ApiModelProperty(value = "define se o usuário pode ou não ser enquadrado como US person de acordo com a definição da CVM")
  public Boolean getUsPerson() {
    return usPerson;
  }
  public void setUsPerson(Boolean usPerson) {
    this.usPerson = usPerson;
  }

  /**
   * define se o usuário pode ou não ser enquadrado como pessoa politicamente exposta de acordo com a definição da Deliberação Coremec nº 2, de 1º de dezembro de 2006
   **/
  @ApiModelProperty(value = "define se o usuário pode ou não ser enquadrado como pessoa politicamente exposta de acordo com a definição da Deliberação Coremec nº 2, de 1º de dezembro de 2006")
  public Boolean getPoliticamenteExposto() {
    return politicamenteExposto;
  }
  public void setPoliticamenteExposto(Boolean politicamenteExposto) {
    this.politicamenteExposto = politicamenteExposto;
  }

  /**
   * Define se o usuário é investidor qualifiquado. Investidor Qualificado - PF ou PJ que possuam investimentos financeiros em valor superior a 1 Milhão, Investidor aprovado em exame de qualificação técnica, e atestem por escrito sua condição de investidor qualificado. Investidores Profissionais, etc.
   **/
  @ApiModelProperty(value = "Define se o usuário é investidor qualifiquado. Investidor Qualificado - PF ou PJ que possuam investimentos financeiros em valor superior a 1 Milhão, Investidor aprovado em exame de qualificação técnica, e atestem por escrito sua condição de investidor qualificado. Investidores Profissionais, etc.")
  public Boolean getInvestidorQualificado() {
    return investidorQualificado;
  }
  public void setInvestidorQualificado(Boolean investidorQualificado) {
    this.investidorQualificado = investidorQualificado;
  }

  /**
   * Definição de Nacionalidade de acordo com o Art. 12 da CF
   **/
  @ApiModelProperty(value = "Definição de Nacionalidade de acordo com o Art. 12 da CF")
  public NacionalidadeEnum getNacionalidade() {
    return nacionalidade;
  }
  public void setNacionalidade(NacionalidadeEnum nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  /**
   * Unidade da Federação em que a pessoa nasceu
   **/
  @ApiModelProperty(value = "Unidade da Federação em que a pessoa nasceu")
  public UfNascimentoEnum getUfNascimento() {
    return ufNascimento;
  }
  public void setUfNascimento(UfNascimentoEnum ufNascimento) {
    this.ufNascimento = ufNascimento;
  }

  /**
   * Município em que a pessoa nascida no Brasil nasceu. Formato é o nome lexicograficamente igual a descrição do IBGE ou o código de cidade completo do IBGE
   **/
  @ApiModelProperty(value = "Município em que a pessoa nascida no Brasil nasceu. Formato é o nome lexicograficamente igual a descrição do IBGE ou o código de cidade completo do IBGE")
  public String getCidadeNascimento() {
    return cidadeNascimento;
  }
  public void setCidadeNascimento(String cidadeNascimento) {
    this.cidadeNascimento = cidadeNascimento;
  }

  /**
   * País em que a pessoa nasceu. Código ISO 3166-1 alpha-2
   **/
  @ApiModelProperty(value = "País em que a pessoa nasceu. Código ISO 3166-1 alpha-2")
  public String getPaisNascimento() {
    return paisNascimento;
  }
  public void setPaisNascimento(String paisNascimento) {
    this.paisNascimento = paisNascimento;
  }

  /**
   * Sexo do indivíduo
   **/
  @ApiModelProperty(value = "Sexo do indivíduo")
  public SexoEnum getSexo() {
    return sexo;
  }
  public void setSexo(SexoEnum sexo) {
    this.sexo = sexo;
  }

  /**
   * Estado civil do usuário
   **/
  @ApiModelProperty(value = "Estado civil do usuário")
  public EstadoCivilEnum getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(EstadoCivilEnum estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  /**
   * Nome do conjuge ou companheiro, necessário em casos que o estado civil seja 'Casado(a)' ou 'União estável'
   **/
  @ApiModelProperty(value = "Nome do conjuge ou companheiro, necessário em casos que o estado civil seja 'Casado(a)' ou 'União estável'")
  public String getNomeConjuge() {
    return nomeConjuge;
  }
  public void setNomeConjuge(String nomeConjuge) {
    this.nomeConjuge = nomeConjuge;
  }

  /**
   * Nome da mãe do usuário
   **/
  @ApiModelProperty(required = true, value = "Nome da mãe do usuário")
  public String getNomeMae() {
    return nomeMae;
  }
  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  /**
   * Nome do pai do usuário. O nome deve ser string vazia ou null caso o pai seja desconhecido.
   **/
  @ApiModelProperty(value = "Nome do pai do usuário. O nome deve ser string vazia ou null caso o pai seja desconhecido.")
  public String getNomePai() {
    return nomePai;
  }
  public void setNomePai(String nomePai) {
    this.nomePai = nomePai;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public LoginObjeto getLogin() {
    return login;
  }
  public void setLogin(LoginObjeto login) {
    this.login = login;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<Documento> getDocumento() {
    return documento;
  }
  public void setDocumento(List<Documento> documento) {
    this.documento = documento;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DadosProfissionais getProfissao() {
    return profissao;
  }
  public void setProfissao(DadosProfissionais profissao) {
    this.profissao = profissao;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Endereco getEndereco() {
    return endereco;
  }
  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DadosPatrimonial getPatrimonio() {
    return patrimonio;
  }
  public void setPatrimonio(DadosPatrimonial patrimonio) {
    this.patrimonio = patrimonio;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<ContaBancaria> getContaBancaria() {
    return contaBancaria;
  }
  public void setContaBancaria(List<ContaBancaria> contaBancaria) {
    this.contaBancaria = contaBancaria;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public FrontEndStep getFrontEnd() {
    return frontEnd;
  }
  public void setFrontEnd(FrontEndStep frontEnd) {
    this.frontEnd = frontEnd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerfilUsuario perfilUsuario = (PerfilUsuario) o;
    return (this.usPerson == null ? perfilUsuario.usPerson == null : this.usPerson.equals(perfilUsuario.usPerson)) &&
        (this.politicamenteExposto == null ? perfilUsuario.politicamenteExposto == null : this.politicamenteExposto.equals(perfilUsuario.politicamenteExposto)) &&
        (this.investidorQualificado == null ? perfilUsuario.investidorQualificado == null : this.investidorQualificado.equals(perfilUsuario.investidorQualificado)) &&
        (this.nacionalidade == null ? perfilUsuario.nacionalidade == null : this.nacionalidade.equals(perfilUsuario.nacionalidade)) &&
        (this.ufNascimento == null ? perfilUsuario.ufNascimento == null : this.ufNascimento.equals(perfilUsuario.ufNascimento)) &&
        (this.cidadeNascimento == null ? perfilUsuario.cidadeNascimento == null : this.cidadeNascimento.equals(perfilUsuario.cidadeNascimento)) &&
        (this.paisNascimento == null ? perfilUsuario.paisNascimento == null : this.paisNascimento.equals(perfilUsuario.paisNascimento)) &&
        (this.sexo == null ? perfilUsuario.sexo == null : this.sexo.equals(perfilUsuario.sexo)) &&
        (this.estadoCivil == null ? perfilUsuario.estadoCivil == null : this.estadoCivil.equals(perfilUsuario.estadoCivil)) &&
        (this.nomeConjuge == null ? perfilUsuario.nomeConjuge == null : this.nomeConjuge.equals(perfilUsuario.nomeConjuge)) &&
        (this.nomeMae == null ? perfilUsuario.nomeMae == null : this.nomeMae.equals(perfilUsuario.nomeMae)) &&
        (this.nomePai == null ? perfilUsuario.nomePai == null : this.nomePai.equals(perfilUsuario.nomePai)) &&
        (this.login == null ? perfilUsuario.login == null : this.login.equals(perfilUsuario.login)) &&
        (this.documento == null ? perfilUsuario.documento == null : this.documento.equals(perfilUsuario.documento)) &&
        (this.profissao == null ? perfilUsuario.profissao == null : this.profissao.equals(perfilUsuario.profissao)) &&
        (this.endereco == null ? perfilUsuario.endereco == null : this.endereco.equals(perfilUsuario.endereco)) &&
        (this.patrimonio == null ? perfilUsuario.patrimonio == null : this.patrimonio.equals(perfilUsuario.patrimonio)) &&
        (this.contaBancaria == null ? perfilUsuario.contaBancaria == null : this.contaBancaria.equals(perfilUsuario.contaBancaria)) &&
        (this.frontEnd == null ? perfilUsuario.frontEnd == null : this.frontEnd.equals(perfilUsuario.frontEnd));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.usPerson == null ? 0: this.usPerson.hashCode());
    result = 31 * result + (this.politicamenteExposto == null ? 0: this.politicamenteExposto.hashCode());
    result = 31 * result + (this.investidorQualificado == null ? 0: this.investidorQualificado.hashCode());
    result = 31 * result + (this.nacionalidade == null ? 0: this.nacionalidade.hashCode());
    result = 31 * result + (this.ufNascimento == null ? 0: this.ufNascimento.hashCode());
    result = 31 * result + (this.cidadeNascimento == null ? 0: this.cidadeNascimento.hashCode());
    result = 31 * result + (this.paisNascimento == null ? 0: this.paisNascimento.hashCode());
    result = 31 * result + (this.sexo == null ? 0: this.sexo.hashCode());
    result = 31 * result + (this.estadoCivil == null ? 0: this.estadoCivil.hashCode());
    result = 31 * result + (this.nomeConjuge == null ? 0: this.nomeConjuge.hashCode());
    result = 31 * result + (this.nomeMae == null ? 0: this.nomeMae.hashCode());
    result = 31 * result + (this.nomePai == null ? 0: this.nomePai.hashCode());
    result = 31 * result + (this.login == null ? 0: this.login.hashCode());
    result = 31 * result + (this.documento == null ? 0: this.documento.hashCode());
    result = 31 * result + (this.profissao == null ? 0: this.profissao.hashCode());
    result = 31 * result + (this.endereco == null ? 0: this.endereco.hashCode());
    result = 31 * result + (this.patrimonio == null ? 0: this.patrimonio.hashCode());
    result = 31 * result + (this.contaBancaria == null ? 0: this.contaBancaria.hashCode());
    result = 31 * result + (this.frontEnd == null ? 0: this.frontEnd.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerfilUsuario {\n");
    
    sb.append("  usPerson: ").append(usPerson).append("\n");
    sb.append("  politicamenteExposto: ").append(politicamenteExposto).append("\n");
    sb.append("  investidorQualificado: ").append(investidorQualificado).append("\n");
    sb.append("  nacionalidade: ").append(nacionalidade).append("\n");
    sb.append("  ufNascimento: ").append(ufNascimento).append("\n");
    sb.append("  cidadeNascimento: ").append(cidadeNascimento).append("\n");
    sb.append("  paisNascimento: ").append(paisNascimento).append("\n");
    sb.append("  sexo: ").append(sexo).append("\n");
    sb.append("  estadoCivil: ").append(estadoCivil).append("\n");
    sb.append("  nomeConjuge: ").append(nomeConjuge).append("\n");
    sb.append("  nomeMae: ").append(nomeMae).append("\n");
    sb.append("  nomePai: ").append(nomePai).append("\n");
    sb.append("  login: ").append(login).append("\n");
    sb.append("  documento: ").append(documento).append("\n");
    sb.append("  profissao: ").append(profissao).append("\n");
    sb.append("  endereco: ").append(endereco).append("\n");
    sb.append("  patrimonio: ").append(patrimonio).append("\n");
    sb.append("  contaBancaria: ").append(contaBancaria).append("\n");
    sb.append("  frontEnd: ").append(frontEnd).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
