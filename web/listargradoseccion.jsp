
<%@page import="Modelos.gradoseccion"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <%
        List<gradoseccion> gradoseccion = (List<gradoseccion>)request.getAttribute("gradoseccion");
    %>
    <body>
      <%@include file="menu.jsp" %>

        <table  class="table table-striped table-bordered table-sm container" >
            <thead class="thead-dark">
                 <tr>
                <th>Nombre Grado</th>
                <th>Nombre Seccion</th>
                
            </tr>
             
            </thead>
           
            <%
                for(gradoseccion gradosecciontemporal : gradoseccion)
                {
                    %>
                    <tr>
                        <td><%=gradosecciontemporal.getNombregrado()%></td>
                        <td><%=gradosecciontemporal.getNombreseccion()%></td>
                       
                        <td>
                            <a href="sgradoseccion?accion=Cargar&idgradoseccion=<%=gradosecciontemporal.getIdgradoseccion()%>">Actualizar</a>
                            &nbsp;|&nbsp;
                            <a href="sgradoseccion?accion=Eliminar&idgradoseccion=<%=gradosecciontemporal.getIdgradoseccion()%>">Eliminar</a>
                        </td>
                        
                    </tr>
                    <%
                }
            %>
             
        </table>
            <div class="container">
                 <input type="button" value="Nuevo Registro" class="btn btn-success" onclick="location.href='registrargradoseccion.jsp'"/>
            </div>
                
  </body>
</html>
