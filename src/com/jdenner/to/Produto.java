package com.jdenner.to;

import com.jdenner.LojaVitual;

/**
 *
 * @author Clenildon
 */


/** Classe contendo dados do Produtos**/

public class Produto extends LojaVitual implements ProdutoInterface{
    
    private Long codigo;
    
    private String nome = "";
    
    private double precoCompra;
    
    private double precoVenda;
    
    private int estoque = 0;
   
    public Long getCodigo(){
        return codigo;
    }
    
    public void setCodigo(Long codigo){
        this.codigo = codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPrecoCompra(){
        return precoCompra;
    }
    
    public void setPrecoCompra(double precoCompra){
        this.precoCompra = precoCompra;
    }
    public double getPrecoVenda(){
        return precoVenda;
    }
    
    public void setPrecoVenda(double precoVenda){
        this.precoVenda = precoVenda;
    }
    
    public int getEstoque(){
        return estoque;
    }
    
    @Override
    public boolean atualizarEstoque(Long codigo, String nome, int estoque){
        /**Logica**/
        
        return true;
    }
}
