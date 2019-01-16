<%-- 
    Document   : actualizardatosusuario
    Created on : 29-dic-2018, 11:09:21
    Author     : Kattia
--%>

<%@page import="Modelos.datosusuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Actualización</title>
        <style type="text/css">
            .tablaRegistrar
            {
                margin: 0 auto;
            }
        </style>
    </head>
    <%
        datosusuario datosusuariocargado = (datosusuario) request.getAttribute("datosusuariocargado");
        %>
    <body>
        <%@include file="menu.jsp" %>
        <form action="sdatosusuario" class="container">
            <input type="hidden" name="id_usuario" value="<%=datosusuariocargado.getId_usuario()%>" />


            <h1> Formulario de Actualización </h1> 


            <div class="form-row">
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Nombre</label>
                    <input type="text" class="form-control" id="validationDefault22" name="txtnombre"  required value="<%=datosusuariocargado.getNombreusuario()%>">
                </div>
                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefaultUsername22">Apellido</label>
                    <input type="text" class="form-control" name="txtpaterno" id="validationDefaultUsername22" aria-describedby="inputGroupPrepend23"
                           required value="<%=datosusuariocargado.getApellidousuario()%>">
                </div>
                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Genero</label>
                    <select class="form-control" id="txtsexo" name="txtsexo">
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
                    <input type="text" class="form-control" name="txtcel" maxlength="9" id="validationDefault22"   required value="<%=datosusuariocargado.getCelusuario()%>">
                </div>
                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Correo</label>
                    <input type="text" class="form-control" name="txtcorreo"  id="validationDefault22"   required value="<%=datosusuariocargado.getCorreousuario()%>">
                </div> 
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Cargo</label>
                    <input type="text" class="form-control" name="txtcargo" id="validationDefault22"   required value="<%=datosusuariocargado.getCargo()%>">
                </div>
            </div>
            <!------------>
            <!------------>
            <div class="form-row">

                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Usuario</label>
                    <input type="text" class="form-control" name="txtusername" id="validationDefault22"   required value="<%=datosusuariocargado.getUsername()%>">
                </div>
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Clave</label>
                    <input type="password" class="form-control" name="txtpassword" id="validationDefault22"   required value="<%=datosusuariocargado.getPassword()%>">
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
                        <input type="submit" class="btn btn-primary" name="accion" value="Actualizar" />
                        &nbsp;
                        <input type="reset" class="btn btn-outline-secondary" value="Deshacer" />
                        &nbsp;
                        <input type="button" class="btn btn-info" value="Regresar" onclick="window.location.href = 'controladorProducto'" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
