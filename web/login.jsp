
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>

        <%@include file="menu.jsp" %>

        <div class="contenido">
            <%                String nombre = (String) session.getAttribute("id_usuario");

                if (session.getAttribute("nombreusuario") != "" && session.getAttribute("id_usuario") != null) {
            %>
            <h1> Hola <%= session.getAttribute("nombreusuario")%> bienvenido al sistema!</h1>
            <%
            } else {
                String error;

                if (request.getParameter("error") == null) {
                    error = "";
                } else {
                    error = request.getParameter("error");
                }
            %>


            <form class="form-horizontal " method="post"  action="./slogin">
                <fieldset class="login">
                    <legend>Acceso</legend>
                    <div class="form-group row">
                        <div class="col-sm-2"><label class="control-label col-sm-2" for="user"><i class="fa fa-user fa-2x"></i>
                            </label></div>
                        <div class="col-sm-10">
                            <input required type="text" class="form-control" name="user" id="user"  tabindex="1" placeholder="Ingrese usuario">
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-sm-2"><label class="control-label col-sm-2" for="pwd"><i class="fa fa-key fa-2x"></i></label></div>
                        <div class="col-sm-10">
                            <input required type="password" class="form-control" name="pwd" id="pwd" tabindex="2" placeholder="Ingrese contraseña">
                        </div>
                    </div>


                    <input class="btn btn-success button pull-right" type="submit" tabindex="3" value="Iniciar Session">
                    <p class='text-danger text-center'> <% out.write(error);%></p>
                </fieldset>

            </form>
            <%
                }
            %>

        </div>
    </body>
</html>
