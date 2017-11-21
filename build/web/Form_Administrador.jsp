<%-- 
    Document   : Form_Administrador
    Created on : Nov 20, 2017, 10:11:20 PM
    Author     : daiane
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD em servlet</title>
    </head>
    <body>

        <h1>Incluir Administrador</h1>
        <form action="IncluirADM" method="POST">
          
            
            Login<br>
            <input type="text" name="loggin" >
            <br>
            Senha:<br>
            <input type="password" name="senha" >
            <br>
            <input type="submit" value="Submit">
        </form> 
    </body>
</html>