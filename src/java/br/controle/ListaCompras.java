/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author daiane
 */
package br.controle;

import br.model.Compras;
import br.DAO.Compras_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ListaCompras", urlPatterns = {"/ListaCompras"})
public class ListaCompras extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Compras_DAO compras_dao = new Compras_DAO();
        ArrayList<Compras> minhasCompras = compras_dao.Listar();
        request.setAttribute("minhasCompras", minhasCompras);

        RequestDispatcher rd = request.getRequestDispatcher("ListaComprasView.jsp");
        rd.forward(request, response);

    }

}
