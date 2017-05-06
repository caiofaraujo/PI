<%-- 
    Document   : novoArquivo
    Created on : 05/05/2017, 19:46:37
    Author     : caio.faraujo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="login" method="post">
            <div>
                <input type="text" name="usuario" id="txtUsuario" />
            </div>
            <div>
                <label for="txtSenha">Senha</label>
            </div>
            <div>
                <input type="password" name="senha" id="txtSenha" />
            </div>
        </form>
    </body>
</html>
