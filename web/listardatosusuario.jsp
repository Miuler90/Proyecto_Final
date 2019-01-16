<%-- 
    Document   : listardatosusuario
    Created on : 29-dic-2018, 11:08:59
    Author     : Kattia
--%>

<%@page import="Modelos.datosusuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        List<datosusuario> datosusuario = (List<datosusuario>) request.getAttribute("datosusuario");
    %>
    <body>

        <%@include file="menu.jsp" %>

        <table  class="table table-striped table-bordered table-sm container" >
            <thead class="thead-dark">
                <tr>
                    <th>Id Usuario</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>celular </th>
                    <th>Correo</th>
                    <th>Genero</th>
                    <th>Cargo</th>

                </tr>

            </thead>

            <%                for (datosusuario datosusuariotemporal : datosusuario) {
            %>
            <tr>
                <td><%=datosusuariotemporal.getId_usuario()%></td>
                <td><%=datosusuariotemporal.getNombreusuario()%></td>
                <td><%=datosusuariotemporal.getApellidousuario()%></td>
                <td><%=datosusuariotemporal.getCelusuario()%></td>
                <td><%=datosusuariotemporal.getCorreousuario()%></td>
                <td>
                    <%
                        if (datosusuariotemporal.getSexousuario().equals("M")) {
                    %>Masculino<%
                    } else {
                    %>Femenino<%
                        }
                    %>
                </td>
                <td><%=datosusuariotemporal.getCargo()%></td>

                <td>
                    <a href="sdatosusuario?accion=Cargar&id=<%=datosusuariotemporal.getId_usuario()%>">Actualizar</a>
                    &nbsp;|&nbsp;
                    <a href="sdatosusuario?accion=Eliminar&id=<%=datosusuariotemporal.getId_usuario()%>">Eliminar</a>
                </td>

            </tr>
            <%
                }
            %>

        </table>
        <div class="container">
            <input type="button" value="Nuevo Registro" class="btn btn-success" onclick="location.href = 'registrardatosusuario.jsp'"/>
        </div>

    </body>
</html>
