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

import br.model.Administrador;
import br.DAO.Administrador_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "ListaADM", urlPatterns = {"/ListaADM"})
public class ListaADM extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Administrador_DAO adm_dao = new Administrador_DAO();
        ArrayList<Administrador> meusADM = adm_dao.Listar();
        request.setAttribute("meusADM", meusADM);

        RequestDispatcher rd = request.getRequestDispatcher("ListaAdministradorView.jsp");
        rd.forward(request, response);

    }

}
