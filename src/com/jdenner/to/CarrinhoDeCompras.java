package com.jdenner.to;

import com.jdenner.to.enums.Situacao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Clenildon
 */

/** Classe contendo dados do Carrinho de compras**/

public class CarrinhoDeCompras implements CarrinhoDeComprasInterface {
    
    private Long codigo;
    
    private Usuario usuario;
    
    private Date dataVenda;
    
    private Double valorTotal;
    
    private Situacao situacao;
    
    private List<Itens> itens;
   
    private List<Itens> itensRemover;
    
    private int quantidade;
    
    public CarrinhoDeCompras(){
        this.usuario = new Usuario();
        this.dataVenda = new Date();
        this.valorTotal = 0.0;
        this.itens = new ArrayList<>();
        this.itensRemover = new ArrayList<>();
    }
    
    public Long getCodigo(){
        return codigo;
    }
    
    public void setCodigo(Long codigo){
        this.codigo = codigo;
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
    
    public Date getDataVenda(){
        return dataVenda;
    }
    
    public void setDataVenda(Date dataVenda){
        this.dataVenda = dataVenda;
    }
    
    public Double getValorTotal(){
        double total = 0;
        for (Itens iv : itens) {
            total += (iv.getValorUnitario() * iv.getQuantidade());
        }
        return total;
    }
    
    public Situacao getSituacao(){
        return situacao;
    }
    
    public void setSituacao(Situacao situacao){
        this.situacao = situacao;
    }
    
    public void setSituacao(int situacao){
        if (situacao == Situacao.AGUARDANDO.getId()) {
            setSituacao(Situacao.AGUARDANDO);
        } else if (situacao == Situacao.FINALIZADA.getId()) {
            setSituacao(Situacao.FINALIZADA);
        } else if (situacao == Situacao.CANCELADA.getId()) {
            setSituacao(Situacao.CANCELADA);
        }
    }
    
    public List<Itens> getItens() {
        return itens;
    }

    public List<Itens> getItensRemover() {
        return itensRemover;
    }

    public void addItens(Itens itens) {
        itens.addItens(itens);
    }

    public void removeItens(Itens itens) {
        itens.removeItens(itens);
        if (itens.getCodigo() != 0) {
            itensRemover.add(itens);
        }
    }

    public int getQuantidade() {
        return itens.size();
    }
     
    
    @Override
    public  boolean atualizarQuantidade(Itens itens, int quantidade){
        /**Logica**/
        
        return true;
    }   

    @Override
    public void setValorTotal(Double valorTotal) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}