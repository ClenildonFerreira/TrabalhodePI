package com.jdenner;

import com.jdenner.to.Produto;

/**
 *
 * @author Clenildon
 */
public class LojaVitual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto produto = new Produto();
        Produto valor = new Produto();
        
        produto.setNome("Blusa");
        valor.setPrecoVenda(10.00);
     
        System.out.println(produto);
        System.out.println(valor);
        
    }
}