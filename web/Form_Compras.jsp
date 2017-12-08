<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD em servlet</title>
    </head>
    <body>
        <h1>Incluir Compras</h1>
        <form action="IncluirCompras" method="POST">
            
            ID Produto<br>
            <input type="number" name="id_produto" >
            <br>
            
            ID cliente<br>
            <input type="number" name="id_cliente" >
            <br><br>
            <input type="submit" value="Submit">
        </form> 
    </body>
</html>
