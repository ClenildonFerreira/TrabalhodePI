package com.jdenner.to;


/**
 *
 * @author Clenildon
 */

/** Interface do Produtos**/

public interface ProdutoInterface {
    
    Long getCodigo();
   
    void setCodigo(Long codigo);
    
    String getNome();
    
    void setNome(String nome);
    
    double getPrecoCompra();
    
    void setPrecoCompra(double precoCompra);
    
    double getPrecoVenda();
    
    void setPrecoVenda(double precoVenda);
    
    int getEstoque();
    
    
    /**
     * Método que atualiza a quantidade de produtos no estoque
     * @return
     **/
    
    boolean atualizarEstoque(Long codigo, String nome, int estoque); 
}
