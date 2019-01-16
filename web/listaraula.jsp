<%-- 
    Document   : listaraula
    Created on : 30-dic-2018, 11:14:56
    Author     : Kattia
--%>

<%@page import="Modelos.aula"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
    </head>
    <%
        List<aula> aula = (List<aula>)request.getAttribute("aula");
    %>
    <body>
        
        <%@include file="menu.jsp" %>
        
        <table  class="table table-striped table-bordered table-sm container" >
            <thead class="thead-dark">
                 <tr>
                <th>Nombre Aula</th>
                <th>Capacidad</th>
                
            </tr>
             
            </thead>
           
            <%
                for(aula aulatemporal : aula)
                {
                    %>
                    <tr>
                        <td><%=aulatemporal.getNombreaula()%></td>
                        <td><%=aulatemporal.getCapacidad()%></td>
                       
                        <td>
                            <a href="saula?accion=Cargar&idaula=<%=aulatemporal.getIdaula()%>">Actualizar</a>
                            &nbsp;|&nbsp;
                            <a href="saula?accion=Eliminar&idaula=<%=aulatemporal.getIdaula()%>">Eliminar</a>
                        </td>
                        
                    </tr>
                    <%
                }
            %>
             
        </table>
            <div class="container">
                 <input type="button" value="Nuevo Registro" class="btn btn-success" onclick="location.href='registraraula.jsp'"/>
            </div>
                
 </body>
</html>
