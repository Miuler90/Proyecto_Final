<%-- 
    Document   : datosusuario
    Created on : 29-dic-2018, 11:07:24
    Author     : Kattia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(!session.getAttribute("permiso").equals("1")){
                response.sendRedirect("./");
            }
            %>
        <%@include file="menu.jsp" %>

        <form action="sdatosusuario" class="container">
            <h1>Registro de DatosUsuario</h1>
            <div class="form-row">

                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Nombre</label>
                    <input type="text" class="form-control" id="validationDefault22" name="txtnombre"  required>
                </div>
                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefaultUsername22">Apellido</label>
                    <input type="text" class="form-control" name="txtpaterno" id="validationDefaultUsername22" aria-describedby="inputGroupPrepend23"
                           required>
                </div>
                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Genero</label>
                    <select class="form-control" name="txtsexo">
                        <option value="M">Masculino</option>
                        <option value="F">Femenino</option>
                    </select>
                </div>
            </div>
            <!------------>
            <!------------>
            <div class="form-row">
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Celular</label>
                    <input type="text" class="form-control" name="txtcel" maxlength="9" id="validationDefault22"   required>
                </div>
                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Correo</label>
                    <input type="text" class="form-control" name="txtcorreo"  id="validationDefault22"   required>
                </div> 
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Cargo</label>
                    <input type="text" class="form-control" name="txtcargo" id="validationDefault22"   required>
                </div>
            </div>
            <!------------>
            <!------------>
            <div class="form-row">

                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Usuario</label>
                    <input type="text" class="form-control" name="txtusername" id="validationDefault22"   required>
                </div>
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Clave</label>
                    <input type="password" class="form-control" name="txtpassword" id="validationDefault22"   required>
                </div>
            <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Tipo de Acceso</label>
                   
                    <select class="form-control" id="tipoacceso" name="tipoacceso">
                        <option value="1">Director</option>
                        <option value="2">Empleado</option>
                    </select>
                </div>
            </div>


            <table class="tablaRegistrar">

                <tr>
                    <td colspan="2" style="text-align: center">
                        <input type="submit" class="btn btn-primary" name="accion" value="Registrar" />
                        &nbsp;
                        <input type="reset" class="btn btn-outline-secondary"   value="Nuevo" />
                        &nbsp;
                        <input type="button" class="btn btn-info" value="Lista" onclick="window.location.href = 'sdatosusuario'" />
                    </td>
                </tr>
            </table>

        </form>
    <center>  
        <input type="button" class="btn btn-dark" value="Menu Principal" onclick="window.location.href = 'index.jsp'"> </center>
</body>
</html>
