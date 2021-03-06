<%@page import="java.util.ArrayList"%>
<%@page import="br.model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>CRUD em servlet</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <style>
            table {
                font-family: arial, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            td, th {
                border: 1px solid #dddddd;
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                background-color: #dddddd;
            }
        </style>
    </head>
    <body>
        <h1>Lista de Clientes</h1>
        <a href="Form_Cliente.jsp">Incluir Cliente</a>
        <p></p>
        <table>
            <thead>
            <th>Id</th>
            <th>Nome</th>
            <th>Celular</th>
            <th>Endereco</th>
            <th>Bairro</th>
            <th>Cidade</th>
            <th>Estado</th>
            <th>CPF</th>
            <th>RI (identidade)</th>
            <th>Cep</th>
            <th>Referencia</th>
            <th>Telefone</th>
            <th>Numero do Cartão</th>
            <th>Bandeira do Cartão</th>
            <th>Ações</th>
        </thead>
        <%
            ArrayList<Cliente> resultado = (ArrayList) request.getAttribute("meusClientes");
            for (int i = 0; i < resultado.size(); i++) {
                Cliente aux = (Cliente)resultado.get(i);
        %>
        <tr>
        <td><%=aux.getId()%></td>
        <td><%=aux.getNome()%></td> 
        <td><%=aux.getCelular()%></td>
        <td><%=aux.getEndereco()%></td> 
        <td><%=aux.getBairro()%></td> 
        <td><%=aux.getCidade()%></td> 
        <td><%=aux.getEstado()%></td> 
        <td><%=aux.getCpf()%></td> 
        <td><%=aux.getRg()%></td> 
        <td><%=aux.getCep()%></td> 
        <td><%=aux.getReferencia()%></td> 
        <td><%=aux.getTelefone()%></td> 
        <td><%=aux.getNumero_cartao()%></td> 
        <td><%=aux.getBandeira_cartao()%></td> 
        <td><a href="Visualizar?id=<%=aux.getId()%>">Visualizar</a> | <a href="Editar?id=<%=aux.getId()%>">Editar</a> | <a href="Excluir?id=<%=aux.getId()%>">Excluir</a></td>
        </tr>
        <%
            }
        %>

    </table>

</body>
</html>

