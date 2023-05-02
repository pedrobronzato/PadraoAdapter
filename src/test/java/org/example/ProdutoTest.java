package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {


    @Test
    void deveRetornarPrecoProdutoReal(){
        Produto produto = new Produto();
        produto.setPreco(12.0f);

        assertEquals(12.0f, produto.getPreco());
    }

    @Test
    void deveRetornarPrecoProdutoDolar(){
        Produto produto = new Produto();
        produto.setPreco(12.0f);

        assertEquals(60.0f, produto.getPrecoDolar());
    }

}