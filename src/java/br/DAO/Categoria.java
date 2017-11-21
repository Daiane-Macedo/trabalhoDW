/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.DAO;

/**
 *
 * @author daiane
 */
public class Categoria {
    private int id;
    private String descricao;
    
    public Categoria(String descricao) {
        this.descricao = descricao;
    
     }
    
    public Categoria(int id, String descricao) {
        this.descricao = descricao;
        this.id = id;
    
     }

    public Categoria(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}