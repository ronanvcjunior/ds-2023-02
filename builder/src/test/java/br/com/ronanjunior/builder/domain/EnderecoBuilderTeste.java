package br.com.ronanjunior.builder.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnderecoBuilderTeste {

    @Test
    public void builderTeste() {
        Endereco enderecoEsperado = new Endereco(
                null, null, null, null, null, null, "bloco", null
        );

        Endereco enderecoGerado = Endereco.builder()
                .bloco("bloco")
                .build();

        assertEquals(enderecoEsperado, enderecoGerado);
    }
}
