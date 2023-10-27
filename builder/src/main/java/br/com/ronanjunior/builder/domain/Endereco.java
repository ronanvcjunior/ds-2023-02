package br.com.ronanjunior.builder.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Builder
@ToString
@EqualsAndHashCode
public class Endereco {
    private String rua;
    private String setor;
    private String cep;
    private Integer numero;
    private String cidade;
    private String estado;
    private String bloco;
    private String quadra;
}
