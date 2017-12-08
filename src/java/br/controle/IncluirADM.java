/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controle;

import br.model.Administrador;
import br.DAO.Administrador_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "IncluirADM", urlPatterns = {"/IncluirADM"})
public class IncluirADM extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String loggin= request.getParameter("loggin");
        String senha= request.getParameter("senha");


        try {
            
            request.setAttribute("erro_senha", "");
            if ((senha.isEmpty() ))
            {  


                if (senha.isEmpty()) {
                    request.setAttribute("erro_senha", "A senha não pode ser vazia");
                }
                
                RequestDispatcher rd = request.getRequestDispatcher("Form_Administrador.jsp");
                rd.forward(request, response);
            } else {

              Administrador adm = new Administrador(loggin, senha);
                Administrador_DAO adm_dao = new Administrador_DAO();
                try {
                    adm_dao.Inserir(adm);
                    request.setAttribute("mensagem", "Inclusão Com Sucesso");
                    request.setAttribute("retorna", "ListaADM");
                    RequestDispatcher rd = request.getRequestDispatcher("Resposta.jsp");
                    rd.forward(request, response);

                } catch (Exception e) {
                    RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                    rd.forward(request, response);
                }

            }

        } catch (Exception e) {
            request.setAttribute("erro_senha", "A senha não pode ser vazia");
            RequestDispatcher rd = request.getRequestDispatcher("Form_Administrador.jsp");
            rd.forward(request, response);
        }

    }

}