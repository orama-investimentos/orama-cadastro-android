/**
 * Criação de Contas
 * API de Criação de Contas.
 *
 * The version of the OpenAPI document: 2.0
 * Contact: cadastro_api@orama.com.br
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Pendencia {
  
  public enum TipoPendenciaEnum {
     cpf,  identidade,  endereco, 
  };
  @SerializedName("tipoPendencia")
  private TipoPendenciaEnum tipoPendencia = null;
  public enum StatusPendenciaEnum {
     registrada,  documentos,  enviada,  analise,  aprovada, 
  };
  @SerializedName("statusPendencia")
  private StatusPendenciaEnum statusPendencia = null;
  @SerializedName("motivos")
  private List<String> motivos = null;

  /**
   * Tipo da pendência: * `cpf` - CPF com Pendência * `identidade` - Dados Pessoais com Pendência * `endereco` - Dados do Endereço com Pendência
   **/
  @ApiModelProperty(value = "Tipo da pendência: * `cpf` - CPF com Pendência * `identidade` - Dados Pessoais com Pendência * `endereco` - Dados do Endereço com Pendência")
  public TipoPendenciaEnum getTipoPendencia() {
    return tipoPendencia;
  }
  public void setTipoPendencia(TipoPendenciaEnum tipoPendencia) {
    this.tipoPendencia = tipoPendencia;
  }

  /**
   * Tipo da pendência: * `registrada` - Pendência Informada * `documentos` - Documentos Recebidos * `enviada` - Enviada Para Análise * `analise` - Em Análise * `aprovada` - Pendência Aprovada
   **/
  @ApiModelProperty(value = "Tipo da pendência: * `registrada` - Pendência Informada * `documentos` - Documentos Recebidos * `enviada` - Enviada Para Análise * `analise` - Em Análise * `aprovada` - Pendência Aprovada")
  public StatusPendenciaEnum getStatusPendencia() {
    return statusPendencia;
  }
  public void setStatusPendencia(StatusPendenciaEnum statusPendencia) {
    this.statusPendencia = statusPendencia;
  }

  /**
   * Lista de motivos relatados à pendência
   **/
  @ApiModelProperty(value = "Lista de motivos relatados à pendência")
  public List<String> getMotivos() {
    return motivos;
  }
  public void setMotivos(List<String> motivos) {
    this.motivos = motivos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pendencia pendencia = (Pendencia) o;
    return (this.tipoPendencia == null ? pendencia.tipoPendencia == null : this.tipoPendencia.equals(pendencia.tipoPendencia)) &&
        (this.statusPendencia == null ? pendencia.statusPendencia == null : this.statusPendencia.equals(pendencia.statusPendencia)) &&
        (this.motivos == null ? pendencia.motivos == null : this.motivos.equals(pendencia.motivos));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.tipoPendencia == null ? 0: this.tipoPendencia.hashCode());
    result = 31 * result + (this.statusPendencia == null ? 0: this.statusPendencia.hashCode());
    result = 31 * result + (this.motivos == null ? 0: this.motivos.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pendencia {\n");
    
    sb.append("  tipoPendencia: ").append(tipoPendencia).append("\n");
    sb.append("  statusPendencia: ").append(statusPendencia).append("\n");
    sb.append("  motivos: ").append(motivos).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
