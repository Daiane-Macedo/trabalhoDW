<%@page import="br.DAO.Cliente"%>
<%@page import="br.controle.Excluir"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD em servlet</title>
        <style>
        input:-moz-read-only { /* For Firefox */
            background-color: #DCDCDC;
        }

        input:read-only {
            background-color: #DCDCDC;
        }
        </style>
    </head>
    <body>
        <h1>Lista de Clientes</h1>
        <h1>Excluir Cliente</h1>
        <% Cliente cliente = (Cliente) request.getAttribute("cliente"); 
        %>
        <form action="Excluir" method="Post">
            
            <input type="hidden" name="id" value="<%=cliente.getId()%>" >
            
            <% if(request.getAttribute("erro_nome") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_nome"));%></h3>        
            <% }%>
            Nome:<br>
            <input type="text" name="nome" value="<%=cliente.getNome() %>">
            <br>
            <% if(request.getAttribute("erro_celular") != null){ %> 
                 <h3 style="color:Tomato;"><% out.print(request.getAttribute("erro_celular"));%></h3>        
            <% }%>
            Celular<br>
            <input type="text" name="celular" value="<%=cliente.getCelular()%>">
            <br>
            Endereco<br>
            <input type="text" name="endereco" value="<%=cliente.getEndereco() %>">
            <br>
            Bairro<br>
            <input type="text" name="bairro" value="<%=cliente.getBairro() %>">
            <br>
            Cidade<br>
            <input type="text" name="cidade" value="<%=cliente.getCidade() %>">
            <br>
            Estado<br>
            <input type="text" name="estado" value="<%=cliente.getEstado() %>">
            <br> 
            CPF<br>
            <input type="text" name="cpf" value="<%=cliente.getCpf() %>">
            <br>
            RI(Identidade)<br>
            <input type="text" name="ri" value="<%=cliente.getRg() %>">
            <br>
            CEP<br>
            <input type="text" name="cep" value="<%=cliente.getCep() %>">
            <br>  
            Referência<br>
            <input type="text" name="referencia" value="<%=cliente.getReferencia() %>">
            <br>            
            Telefone Fixo<br>
            <input type="text" name="telefone" value="<%=cliente.getTelefone() %>">
            <br> 
            Número do Cartão<br>
            <input type="text" name="numero_cartao" value="<%=cliente.getNumero_cartao() %>">
            <br> 
            Bandeira do Cartão<br>
            <input type="text" name="bandeira_cartao" value="<%=cliente.getBandeira_cartao() %>">  
            <br>
            
            <input type="submit" value="Confirmar Exclusão">
            <a href="ListaCliente">Retorna</a>
        </form> 
    </body>
</html>
