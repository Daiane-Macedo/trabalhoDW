<%@page import="br.model.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD em servlet</title>

    </head>
    <body>
        <h1>Produto</h1>
        <% Produto produto = (Produto) request.getAttribute("Produto"); 
        %>
        
        <form action="ListaProduto" method="GET">
            
            <input type="hidden" name="id" value="<%=produto.getId()%>" >
            
            ID da Categoria:<br>
            <input type="text" name="idCategoria" value="<%=produto.getIdcat() %>" readonly="true" >
            <br>
            Nome:<br>
            <input type="text" name="nome" value="<%=produto.getNome() %>" readonly="true" >
            <br>
            Descrição:<br>
            <input type="text" name="descricao" value="<%=produto.getDesc() %>" readonly="true" >
            <br>
            Valor:<br>
            <input type="text" name="valor" value="<%=produto.getValor() %>" readonly="true" >
            <br>
			<br>
            <a href="ListaProduto">Retorna</a>
        </form> 
    </body>
</html>
