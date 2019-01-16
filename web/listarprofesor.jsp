<%@page import="Modelos.profesor"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <%
        List<profesor> profesor = (List<profesor>)request.getAttribute("profesor");
    %>
    <body>
        
       <%@include file="menu.jsp" %>

        <table  class="table table-striped table-bordered table-sm container" >
            <thead class="thead-dark">
                 <tr>
                <th>Dni</th>
                <th>Nombres</th>
                <th>Apeliidos</th>
                <th>Edad</th>
                <th>Genero</th>
                <th>EstadoCivil</th>
                <th>Direccion</th>
                <th>Telefono</th>
                <th>Celular</th>
                <th>Especialidad</th>
            </tr>
             
            </thead>
           
            <%
                for(profesor profesortemporal : profesor)
                {
                    %>
                    <tr>
                        <td><%=profesortemporal.getDniprofesor()%></td>
                        <td><%=profesortemporal.getNombreprofesor()%></td>
                        <td><%=profesortemporal.getApellidoprofesor()%></td>
                        <td><%=profesortemporal.getEdad()%></td>
                        <td>
                            <%
                            if(profesortemporal.getSexo().equals("M"))
                            {
                                %>Masculino<%
                            }
                            else
                            {
                                %>Femenino<%
                            }
                            %>
                        </td>
                        <td><%=profesortemporal.getEstadocivil()%></td>
                        <td><%=profesortemporal.getDireccion()%></td>
                        <td><%=profesortemporal.getTelef()%></td>
                        <td><%=profesortemporal.getCel()%></td>
                        <td><%=profesortemporal.getEspecialidad()%></td>
                        
                        
                        
                        <td>
                            <a href="sprofesor?accion=Cargar&idprofesor=<%=profesortemporal.getIdprofesor()%>">Actualizar</a>
                            &nbsp;|&nbsp;
                            <a href="sprofesor?accion=Eliminar&idprofesor=<%=profesortemporal.getIdprofesor()%>">Eliminar</a>
                        </td>
                        
                    </tr>
                    <%
                }
            %>
             
        </table>
            <div class="container">
                 <input type="button" value="Nuevo Registro" class="btn btn-success" onclick="location.href='registrarprofesor.jsp'"/>
            </div>
             <div class="container">
                 <input type="button" value="Ir al Menu" class="btn btn-outline-danger" onclick="location.href='menu.jsp'"/>
            </div>
                
        <!-- JQuery -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.min.js"></script>
        <!-- MDB core JavaScript -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.5.16/js/mdb.min.js"></script>
    </body>
</html>
