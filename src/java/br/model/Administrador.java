/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.model;

/**
 *
 * @author daiane
 */
public class Administrador {
    private int id;
    private String loggin;
    private String senha;

    public Administrador(String loggin,String senha) {
        this.loggin = loggin;
        this.senha = senha;
        
    }

     public Administrador(int id,String loggin,String senha) {
        this.id = id;
        this.loggin = loggin;
        this.senha = senha;
        
    }

    public Administrador(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public String getLoggin() {
        return loggin;
    }

    public void setLoggin(String loggin) {
        this.loggin = loggin;
    }
    
     public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
    

