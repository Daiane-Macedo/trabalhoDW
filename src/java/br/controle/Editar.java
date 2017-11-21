/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controle;

import br.model.Cliente;
import br.DAO.Cliente_DAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daiane
 */
@WebServlet(name = "Editar", urlPatterns = {"/Editar"})
public class Editar extends HttpServlet {
// ==================================  entra aqui depois de ter listado os clientes logo ja possui o id dele ========================
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Cliente cliente = new Cliente(id);
        Cliente_DAO cliente_dao = new Cliente_DAO();
        try {
            cliente_dao.get(cliente);
            request.setAttribute("cliente", cliente);
// =========================================== Aqui chama o forms de edição do Cliente fazer a troca =================================
            RequestDispatcher rd = request.getRequestDispatcher("Form_Cliente_Editar.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
            rd.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String celular = request.getParameter("celular");
        int id = Integer.parseInt(request.getParameter("id"));
        String nome = request.getParameter("nome");
        String endereco= request.getParameter("endereco");
        String bairro= request.getParameter("bairro");
        String cidade= request.getParameter("cidade");
        String estado= request.getParameter("estado");
        String cpf= request.getParameter("cpf");
        String rg= request.getParameter("rg");
        String cep= request.getParameter("cep");
        String referencia= request.getParameter("referencia");
        String telefone= request.getParameter("telefone");
        String numero_cartao= request.getParameter("numero_cartao");
        String bandeira_cartao= request.getParameter("bandeira_cartao");
        
        Cliente cliente = new Cliente(id, nome, celular, endereco, bairro,  cidade, estado, cpf, rg, cep, referencia, telefone, numero_cartao, bandeira_cartao);

//  ======================================  Aqui faz a verificacao se os dados passados para a alteracao estao corretos se algum dado estuver errado devolve ==========================================================================        
        
        try {
            if ((celular.isEmpty()) || (nome.isEmpty())) // verifica os dados
            {  // retorna para o formulario de cliente

                if (nome.isEmpty()) {
                    request.setAttribute("erro_nome", "O nome não pode ser vazio");
                }

                if (celular.isEmpty()) {
                    request.setAttribute("erro_celular", "O celular não pode ser vazio");
                }

//========================= se algum dado estiver errado devolve ===========================

                request.setAttribute("cliente", cliente);
                RequestDispatcher rd = request.getRequestDispatcher("Form_Cliente_Editar.jsp");
                rd.forward(request, response);
            } else {
//========================= se não tiver dados errados chama o altera e retorna para listarClientes ===========================
                Cliente_DAO cliente_dao = new Cliente_DAO();
                try {
                    cliente_dao.Alterar(cliente);
                    request.setAttribute("mensagem", "Alterado Com Sucesso");
// =========================== se tudo ok chama metodo listar clientes passando para resposta =================================================================================================                                       
                    request.setAttribute("retorna", "ListaCliente");
                    RequestDispatcher rd = request.getRequestDispatcher("Resposta.jsp");
                    rd.forward(request, response);

                } catch (Exception e) {
                    RequestDispatcher rd = request.getRequestDispatcher("Erro_1.jsp");
                    rd.forward(request, response);
                }

            }

        } catch (Exception e) {
            request.setAttribute("erro_nome", "O nome não pode ser vazio");
            request.setAttribute("erro_celular", "O celular não pode ser vazio");
            RequestDispatcher rd = request.getRequestDispatcher("Form_Cliente.jsp");
            rd.forward(request, response);
        }

    }

}
