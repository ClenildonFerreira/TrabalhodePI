package com.jdenner.to;

import com.jdenner.LojaVitual;
import java.util.Date;
/**
 *
 * @author Clenildon
 */

/** Classe contendo os dados do usuario **/

public class Usuario extends LojaVitual implements UsuarioInterface{
        
    private String nome;
    
    private String cpf;
    
    private Date dataCadastro;
    
    private String email;
    
    private String telefone;
    
    private String login;
    
    private String senha;

    public Usuario(){
        this.nome = "";
        this.cpf = "";
        this.dataCadastro = new Date();
        this.email = "";
        this.login = "";
        this.senha = "";
    }
    
    
    
    public String getNome(){
    return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome; 
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf (String cpf){
        this.cpf = cpf;
    }
    
    public Date getDataCadastro(){
        return dataCadastro;
    }
    
    public void setDataCadastro(Date dataCadastro){
        this.dataCadastro = dataCadastro;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getLogin(){
        return login;
    }
    
    public String getSenha(){
        return senha;
    }
    
    /** 
     * Eu acho que um public static void check(String login, String senha)
     * mas não sei como fazer a logica na verdade nem sei se da certo kkkkkk
     **/
    @Override
   public  boolean  LogarNoSistema(String login, String senha){
        /**Logica**/
        
        return true;
    }   
}






