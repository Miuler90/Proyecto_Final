

<%@page import="Modelos.modelomatricula"%>
<%@page import="Modelos.matricula"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <%
        List<List<String>> matricula = (List<List<String>>) request.getAttribute("bmatricula");
    %>
    <body>
        <%@include file="menu.jsp" %>

        <table  class="table table-striped table-bordered table-sm container" >
            <thead class="thead-dark">
                <tr>
                    <th>Id Matricula</th>
                    <th>Periodo</th>
                    <th>Alumno</th>
                    <th>Grado y Sec.</th>
                    <th>Aula</th>
                    <th>Capacidad</th>
                    <th>Apoderado</th>
                    <th>Parentesco</th>
                    <th>Fecha de Matricula</th>
                </tr>

            </thead>

            <%                
          
            for (int i = 0; i < matricula.size(); i++) {
            List<String> matriculatemporal = (List<String>) matricula.get(i);
            %>
            <tr>
                <td><%=matriculatemporal.get(0)%></td>
                <td><%=matriculatemporal.get(1)%></td>
                <td><%=matriculatemporal.get(2)%></td>
                <td><%=matriculatemporal.get(3)%></td>
                <td><%=matriculatemporal.get(4)%></td>
                <td><%=matriculatemporal.get(5)%></td>
                <td><%=matriculatemporal.get(6)%></td>
                <td><%=matriculatemporal.get(7)%></td>
                <td><%=matriculatemporal.get(8)%></td>
                <td>
                    <a href="smatricula?accion=Cargar&id=<%=matriculatemporal.get(0)%>">Actualizar</a>
                    &nbsp;|&nbsp;
                    <a href="smatricula?accion=Eliminar&id=<%=matriculatemporal.get(0)%>">Eliminar</a>
                </td>

            </tr>
            <%
                }
            %>

        </table>
        <div class="container">
            <input type="button" value="Nuevo Registro" class="btn btn-success" onclick="location.href = 'registrarmatricula.jsp'"/>
        </div>

    </body>
</html>
