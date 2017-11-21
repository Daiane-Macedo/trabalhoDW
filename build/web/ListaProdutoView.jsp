<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.DAO.Produto"%>
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
    <h1>Lista de Produtos</h1>
        <a href="Form_Produto.jsp">Incluir Produto</a>
        <p></p>    
      <table>
        <thead>
            <th>ID do Produto</th>
            <th>Categoria</th>
            <th>Nome</th>
            <th>Descrição</th>
            <th>Valor</th>
            <th>Ações</th>
        </thead>
        <%
            ArrayList<Produto> resultado = (ArrayList) request.getAttribute("meusProdutos");
            for (int i = 0; i < resultado.size(); i++) {
                Produto aux = (Produto)resultado.get(i);
        %>
        <tr>
        <td><%=aux.getId()%></td>
        <td><%=aux.getIdcat()%></td>
        <td><%=aux.getNome()%></td> 
        <td><%=aux.getDesc()%></td>
        <td><%=aux.getValor()%></td>
        <td><a href="VisualizarProduto?id=<%=aux.getId()%>">Visualizar</a> | <a href="EditarProduto?id=<%=aux.getId()%>">Editar</a> | <a href="ExcluirProduto?id=<%=aux.getId()%>">Excluir</a></td>
        </tr>
        <%
            }
        %>

    </table>

</body>
</html>

