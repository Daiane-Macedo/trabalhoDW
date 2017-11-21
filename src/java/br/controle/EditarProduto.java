/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controle;

import br.model.Produto;
import br.DAO.Produto_DAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author daiane
 */
@WebServlet(name = "EditarProduto", urlPatterns = {"/EditarProduto"})
public class EditarProduto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Produto produto = new Produto(id);
        Produto_DAO produto_dao = new Produto_DAO();
        try {
            produto_dao.get(produto);
            request.setAttribute("Produto", produto);

            RequestDispatcher rd = request.getRequestDispatcher("Form_Produto_Editar.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
            rd.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
                int id_categoria = Integer.parseInt(request.getParameter("id_categoria"));
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		double valor = Double.parseDouble(request.getParameter("valor"));
		

        Produto produto = new Produto(id , descricao, id_categoria, valor, nome);
        try {
            if ((nome.isEmpty()) || (descricao.isEmpty())) // verifica os dados
            {  // retorna para o formulario de contato

                    request.setAttribute("erro_nome", "Categoria inválida");
                    request.setAttribute("id", id);
                RequestDispatcher rd = request.getRequestDispatcher("Form_Produto_Editar.jsp");
                rd.forward(request, response);
            } else {
                Produto_DAO produto_dao = new Produto_DAO();
                try {
                    produto_dao.Alterar(produto);
                    request.setAttribute("mensagem", "Alterado Com Sucesso");
                    request.setAttribute("retorna", "ListaProduto");
                    RequestDispatcher rd = request.getRequestDispatcher("Resposta.jsp");
                    rd.forward(request, response);

                } catch (Exception e) {
                    RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                    rd.forward(request, response);
                }

            }

        } catch (Exception e) {
            request.setAttribute("erro_categoria", "Categoria inexistente");
            RequestDispatcher rd = request.getRequestDispatcher("Form_Produto.jsp");
            rd.forward(request, response);
        }

    }

}
