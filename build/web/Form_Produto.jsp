<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.model.Produto"%>
<%@page import="br.model.Categoria"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



        <title>Cadastro | Produto</title>
    
    </head>

    <body>
        <form action="IncluirProduto" method="POST">
            
            <%
                   Produto aux = (Produto) request.getAttribute("produto");
                %>
		<table>
                <tr hidden>
		<th>Id:</th>
		<th><input type="number" name="id" id="id"></th>
		</tr>
		<tr>
		<th>Nome:</th>
		<th><input type="text" name="nome" ></th>
		</tr>
		<tr>
		<th>Descricao:</th>
		<th><input type="text" name="descricao" id="descricao"></th>
		</tr>
		<tr>
                    <th>Valor:</th>
                    <th><input type="number" name="valor" id="valor" ></th>
		</tr>
                <tr>
                    <th>Categoria</th>
                    <th><input type="text" name="id_categoria" id="categoria" ></th>
                     </th>
                     </tr>
                    <tr>                
                    <th><input type="submit" value="Submit"></th>
		</tr>

		</table>
        </form>

    </body>
</html>