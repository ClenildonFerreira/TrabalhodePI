package com.jdenner.to.enums;

/**
 *
 * @author Clenildon
 */

/**
 * Classe contendo dados do Situação como está a venda se foi finalizada ou 
 * Aguardando o pagamento
 **/

public enum Situacao {

/** Situaçao para registros Aguardando Pagamento **/
    AGUARDANDO(1, "aguardandopagamento"),
    
/**Situaçao para registros já finalizados**/
    FINALIZADA(2, "finalizada"),
    
/**Situaçao para registros cancelados durante o processo**/
    CANCELADA(3, "Cancelada");
    
    private final int ID;
    private final String DESCRICAO;

    private Situacao(int id, String descricao) {
        this.ID = id;
        this.DESCRICAO = descricao;
    }
    
/**
* Retorna o código da situação
*
* @return int id
*/
    public int getId() {
        return ID;
    }

    @Override
    public String toString() {
        return this.DESCRICAO;
    }
}
