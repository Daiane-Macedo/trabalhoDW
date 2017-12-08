/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controle;

import br.model.Compras;
import br.DAO.Compras_DAO;
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
@WebServlet(name = "EditarCompras", urlPatterns = {"/EditarCompras"})
public class EditarCompras extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Compras comp = new Compras(id);
        Compras_DAO comp_dao = new Compras_DAO();
        try {
            comp_dao.get(comp);
            request.setAttribute("compras", comp);

            RequestDispatcher rd = request.getRequestDispatcher("Form_Compras_Editar.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
            rd.forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		int id_cliente = Integer.parseInt(request.getParameter("id_cliente"));
		int id_produto = Integer.parseInt(request.getParameter("id_produto"));

        Compras comp = new Compras(id, id_cliente, id_produto);
        try {
            if ((id < 1)||(id_produto < 1 || id_cliente <1)) // verifica os dados
            {  // retorna para o formulario de contato

                    request.setAttribute("erro_compras", "Compra inválida");
                    request.setAttribute("comp", comp);
                     
                RequestDispatcher rd = request.getRequestDispatcher("Form_Compras_Editar.jsp");
                rd.forward(request, response);
            } else {
                Compras_DAO comp_dao = new Compras_DAO();
                try {
                    comp_dao.Alterar(comp);
                    request.setAttribute("mensagem", "Alterado Com Sucesso");
                    request.setAttribute("retorna", "ListaCompras");
                    RequestDispatcher rd = request.getRequestDispatcher("Resposta.jsp");
                    rd.forward(request, response);

                } catch (Exception e) {
                    RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                    rd.forward(request, response);
                }

            }

        } catch (Exception e) {
            request.setAttribute("erro_compras", "Compra inexistente");
            RequestDispatcher rd = request.getRequestDispatcher("Form_Compras.jsp");
            rd.forward(request, response);
        }

    }

}