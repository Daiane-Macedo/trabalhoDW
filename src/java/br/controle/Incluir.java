/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.controle;

import br.DAO.Cliente;
import br.DAO.Cliente_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Incluir", urlPatterns = {"/Incluir"})
public class Incluir extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // pegando os parâmetros do request
        String nome = request.getParameter("nome");
        String celular = request.getParameter("celular");
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

 // ========================================= faz a verificação de dados ============================================       

        try {
            
            request.setAttribute("erro_nome", "");

            if ((celular.isEmpty()) || (nome.isEmpty())) // verifica os dados
            {  // retorna para o formulario de cliente

                if (nome.isEmpty()) {
                    request.setAttribute("erro_nome", "O nome não pode ser vazio");
                }

                if (celular.isEmpty()) {
                    request.setAttribute("erro_celular", "O celular não pode ser vazio");
                }

                RequestDispatcher rd = request.getRequestDispatcher("Form_Cliente.jsp");
                rd.forward(request, response);
            } else {

              Cliente cliente = new Cliente(nome, celular, endereco, bairro,  cidade, estado, cpf, rg, cep, referencia, telefone, numero_cartao, bandeira_cartao);
                Cliente_DAO cliente_dao = new Cliente_DAO();
                try {
                    cliente_dao.Inserir(cliente);
                    request.setAttribute("mensagem", "Inclusão Com Sucesso");
// =========================== se tudo ok chama metodo listar clientes passando para resposta =================================================================================================                    
                    request.setAttribute("retorna", "ListaCliente");
                    RequestDispatcher rd = request.getRequestDispatcher("Resposta.jsp");
                    rd.forward(request, response);

                } catch (Exception e) {
                    RequestDispatcher rd = request.getRequestDispatcher("Erro.jsp");
                    rd.forward(request, response);
                }

            }

        } catch (Exception e) {
            request.setAttribute("erro_nome", "O nome não pode ser vazio");
            request.setAttribute("erro_celular", "O celular não pode ser vazio");
  //========================= se algum dado estiver errado devolve ===========================          
            RequestDispatcher rd = request.getRequestDispatcher("Form_Cliente.jsp");
            rd.forward(request, response);
        }

    }

}
