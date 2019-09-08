package com.jdenner.to;

import com.jdenner.to.enums.Situacao;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Clenildon
 */

/** Interface do CarrinhoDeCompras**/

public interface CarrinhoDeComprasInterface {
    Long getCodigo();
    
    void setCodigo(Long getCodigo);
    
    Usuario getUsuario();
    
    void setUsuario(Usuario usuario);
    
    Date getDataVenda();
    
    void setDataVenda(Date dataVenda);
    
    Double getValorTotal();
    
    void setValorTotal(Double valorTotal);
    
    Situacao getSituacao();
    
    void setSituacao(Situacao situacao);
    
    List<Itens> getItens();
    
    List<Itens> getItensRemover();
    
    void addItens(Itens itens);
    
    void removeItens(Itens itens);
    
    
    /**
     * Método que atualiza a quantidade de produtos no Carinho de Compras
     * @return
     **/
   
     boolean atualizarQuantidade(Itens itens, int quantidade); 

}