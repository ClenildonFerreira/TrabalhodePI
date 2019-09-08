package com.jdenner.to;

import java.util.Date;

/**
 *
 * @author Clenildon
 */


public class Contato implements ContatoInterface{
    
    private Long id;
    
    private String nome;
    
    private String email;
    
    private String telefone;
    
    private  String estado;
    
    private Date dataCadastro;
    
    private String mensagem;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getEstado(){
        return estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public Date getDataCadastro(){
        return dataCadastro;
    }
    
    public void setDataCadastro(Date dataCadastro){
        this.dataCadastro = dataCadastro;
    }
    
    public String getMansagem(){
        return mensagem;
    }
    
    public void setMansagem(String mensagem){
        this.mensagem = mensagem;
    }
    
    @Override
	public int hashCode() {
            
        /**Aqui vem logica !
         * tipo final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : esttado.hashCode());
         * ...
         */
            
            return 0;
            
        }
        
        
       @Override
	public boolean equals(Object obj) {
            /**Logica**/
           return true; 
        }
}

