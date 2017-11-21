/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daiane
 */

import br.DAO.*;
import java.io.PrintStream;
import java.util.logging.Level;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daiane
 */
public class teste {
    
    public static void main(String[] args) {
       
        
        //Cliente cliente = new Cliente("Fulano","21992312451", "Rua Judith", "Boassu", "SG", "RJ", "11111", "2222222", "562725","Pertodo bar","2217384","4740","A");
        //Cliente_DAO cliente_dado = new Cliente_DAO();
        
      //  Cliente cliente2 = new Cliente("Maria","22882362241", "Rua Santa Cruz", "Madureira", "Rio", "RJ", "55555", "2345222","333", "casa azul", "444", "304740","A");
        //Cliente_DAO cliente_dado2 = new Cliente_DAO();
        
       // Cliente cliente = new Cliente("Joana", "21876345893", "Rua diosbobos", "qualquer","Manaus","Amazonas", "32516","462347","27588","no mato", "3167","1789","bandeirinha");
        //Cliente_DAO cliente_dao = new Cliente_DAO();
      
        
        try {
            
            //System.out.println("========= Insere o cliente =====");
        //    cliente_dado.Inserir(cliente);
          //  cliente_dado2.Inserir(cliente2);
           //cliente_dao.Inserir(cliente);
            /*
            System.out.println("=============== Exclui cliente =========");
            cliente.setId(6);
            cliente_dado.Excluir(cliente);*/
            System.out.println("========= Insere a Produto =====");
            Produto prod = new Produto("coreI7",2 , 2553.20, "Notebook");
            Produto_DAO proddao = new Produto_DAO();
            proddao.Inserir(prod);
            
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }
    
}

