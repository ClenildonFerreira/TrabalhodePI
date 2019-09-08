package com.jdenner.to;

import java.util.Date;

/**
 *
 * @author Clenildon
 */


/** Interface do Usuario**/


public interface UsuarioInterface {
    String getNome();
    
    void setNome(String nome);
    
    String getCpf();
    
    void setCpf(String cpf);
    
    Date getDataCadastro();
    
    void setDataCadastro(Date dataCadastro);
    
    String getEmail();
    
    void setEmail(String email);
    
    String getLogin();
    
    String getSenha();
    
     /**
     * Método que logar no sistema ou quando vai fazer ao compra 
     * ou não kkkkkkkk se tiver certo
     * @return
     **/
    
    boolean LogarNoSistema(String login, String senha); 

}
