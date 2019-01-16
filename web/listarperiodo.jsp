
<%@page import="Modelos.periodo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
    </head>
    <%
        List<periodo> periodo = (List<periodo>)request.getAttribute("periodo");
    %>
    <body>
       <%@include file="menu.jsp" %>

        <table  class="table table-striped table-bordered table-sm container" >
            <thead class="thead-dark">
                 <tr>
                
                <th>Nombre Periodo</th>
                
            </tr>
             
            </thead>
           
            <%
                for(periodo periodotemporal : periodo)
                {
                    %>
                    <tr>
                        <td><%=periodotemporal.getNombreperiodo()%></td>
                      
                       
                        <td>
                            <a href="speriodo?accion=Cargar&idperiodo=<%=periodotemporal.getIdperiodo()%>">Actualizar</a>
                            &nbsp;|&nbsp;
                            <a href="speriodo?accion=Eliminar&idperiodo=<%=periodotemporal.getIdperiodo()%>">Eliminar</a>
                        </td>
                        
                    </tr>
                    <%
                }
            %>
             
        </table>
            <div class="container">
                 <input type="button" value="Nuevo Registro" class="btn btn-success" onclick="location.href='registrarperiodo.jsp'"/>
            </div>
         </body>
</html>
