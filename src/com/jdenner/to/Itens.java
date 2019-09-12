package com.jdenner.to;


/**
 *
 * @author Clenildon
 */

/** 
 * Eu criei essa classe para guarda os produtos que vão para carrinho de compras
 * usei a logica com objeto
 **/
public class Itens {

    private long codigo;
    private CarrinhoDeCompras carrinhodecompras;
    private Produto produto;
    private int quantidade;
    private Double valorUnitario;

    public Itens() {
        this.codigo = 0;
        this.carrinhodecompras = new CarrinhoDeCompras();
        this.produto = new Produto();
        this.quantidade = 0;
        this.valorUnitario = 0.0;
    }

    public Itens(Long codigo) {
        this.codigo = codigo;
        this.carrinhodecompras = new CarrinhoDeCompras();
        this.produto = new Produto();
        this.quantidade = 0;
        this.valorUnitario = 0.0;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public CarrinhoDeCompras getVenda() {
        return carrinhodecompras;
    }

    public void setCarrinhoDeCompras(CarrinhoDeCompras carrinhodecompras) {
        this.carrinhodecompras = carrinhodecompras;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return getProduto().getNome();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CarrinhoDeCompras) {
            CarrinhoDeCompras iv = (CarrinhoDeCompras) o;
            if (iv.getCodigo() == this.getCodigo()) {
               
                return true;
            }
        }
        return false;
    }

    void removeItens(Itens itens) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void addItens(Itens itens) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
