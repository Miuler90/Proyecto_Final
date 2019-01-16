
<%@page import="Modelos.pagoapafa"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <%
        List<pagoapafa> pagoapafa = (List<pagoapafa>) request.getAttribute("pagoapafa");
        %>
    <body>

        <%@include file="menu.jsp" %>

        <table  class="table table-striped table-bordered table-sm container" >
            <thead class="thead-dark">
                <tr>
                    <th>Id Parentesco</th>
                    <th>Numero Recibo</th>
                    <th>Fecha Pago</th>
                    <th>Monto</th>
                </tr>
            </thead>

            <%                for (pagoapafa pagoapafatemporal : pagoapafa) {
            %>
            <tr>
                <td><%=pagoapafatemporal.getId_parentesco()%></td>
                <td><%=pagoapafatemporal.getNrorecibo()%></td>
                <td><%=pagoapafatemporal.getFechapago()%></td>
                <td><%=pagoapafatemporal.getMonto()%></td>

                <td>
                    <a href="spagoapafa?accion=Cargar&idpagoapafa=<%=pagoapafatemporal.getIdpagoapafa()%>">Actualizar</a>
                    &nbsp;|&nbsp;
                    <a href="spagoapafa?accion=Eliminar&idpagoapafa=<%=pagoapafatemporal.getIdpagoapafa()%>">Eliminar</a>
                </td>

            </tr>
            <%
                }
            %>

        </table>
        <div class="container">
            <input type="button" value="Nuevo Registro" class="btn btn-success" onclick="location.href = 'registrarpagoapafa.jsp'"/>
        </div>

    </body>
</html>
