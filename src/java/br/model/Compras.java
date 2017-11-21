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
public class Compras {
    
    private int id;
    private int id_cliente;
    private int id_produto;

    public Compras(int id_cliente , int id_produto) {
        
        this.id_cliente = id_cliente;
        this.id_produto = id_produto;
    }
    
     public Compras(int id , int id_cliente, int id_produto) {
        this.id=id;
        this.id_cliente = id_cliente;
        this.id_produto = id_produto;
    }

    public Compras(int id) {
       this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdcliente() {
        return id_cliente;
    }

    public void setIdcliente(int id) {
        this.id_cliente = id;
    }
    
    public int getIdproduto() {
        return id_produto;
    }

    public void setIdproduto(int id) {
        this.id_produto = id;
    }
   
    
}
