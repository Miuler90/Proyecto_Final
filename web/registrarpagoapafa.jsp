
<%@page import="Modelos.periodo"%>
<%@page import="Modelos.modeloperiodo"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        <%@include file="menu.jsp" %>
        <%            List<periodo> lperiodo;
            modeloperiodo mP = new modeloperiodo();
            lperiodo = mP.obtenerperiodo();
        %>
        <form action="spagoapafa" class="container">
            <div class="form-row">
                <div class="col-md-2 mb-3 md-form">

                    <select name="selperiodo" id="selperiodo" class="form-control">
                        <%
                            if (lperiodo.size() > 0) {
                                for (int i = 0; i < lperiodo.size(); i++) {
                                    periodo pa = (periodo) lperiodo.get(i);

                        %>
                        <option value="<%=pa.getIdperiodo()%>"><%= pa.getNombreperiodo()%></option> 
                        <%
                                }
                            }
                        %>
                    </select>


                </div>
                <div class="col-md-2 mb-3 md-form">
                    <label style="position: relative" for="txtapoderado">Apoderado</label>
                    <input type="text" class="" id="txtapafa" name="txtapoderado" maxlength="8" required>
                </div>
                <div class="col-md-2 mb-3 md-form">
                    <label style="position: relative" for="txtalumno">Alumno</label>
                    <input type="text" class="" id="txtapafa" name="txtalumno" maxlength="8" required>
                </div>
                <div class="col-md-3 mb-3 md-form">
                    <input type="submit" class="btn btn-primary" name="accion" value="Consultar" />
                </div>
            </div>    
        </form>
        <%
            if (request.getAttribute("buscarApoderadoAlumno") != null) {
                List<List<String>> aa = (List<List<String>>) request.getAttribute("buscarApoderadoAlumno");
                if (aa.size() > 0) {

                    List<String> au = aa.get(0);
        %>
        <div class="container">
            <div class="form-row ">
                <div class="col-md-3 mb-3 md-form">
                    <b>Alumno: </b><%= au.get(1)%>
                </div>
                <div class="col-md-3 mb-3 md-form">
                    <b>Apoderado: </b><%= au.get(2)%>
                </div>
                <div class="col-md-3 mb-3 md-form">
                    <b>Parentesco: </b><%= au.get(3)%>
                </div>
            </div> 
        </div>
        <form action="spagoapafa" class="container">
            <h3>Registro de Pago Apafa</h3>
             <input value="<%= request.getAttribute("idperiodo") %>" type="hidden" class="form-control" id="validationDefault22" name="txtperiodo" maxlength="8"  required>
            
            <input value="<%= au.get(0)%>" type="hidden" class="form-control" id="validationDefault22" name="txtidparentesco" maxlength="8"  required>
            <div class="form-row">


                <!------------>
                <div class="col-md-3 mb-3 md-form">
                    <label for="validationDefault22">Numero Recibo</label>
                    <input type="text" class="form-control" id="validationDefault22" name="txtnrorecibo"  required>
                </div>
                <!------------>
                

                <div class="col-md-3 mb-3 md-form">
                    <label for="validationDefault22">Monto</label>
                    <input type="number" class="form-control" name="txtmonto" min="1" id="validationDefault22"   required>
                </div> 
                
                <div class="col-md-3 mb-3 md-form">
                    <label for="validationDefaultUsername22">Fecha Pago</label><br>
                    <input type="date" class="form-control" name="txtfechapago" id="validationDefault22"   required>
                </div> 
            </div>
            <!------------>
            <!------------>
            <div class="form-row">


            </div>

            <%
                    }
                }
            %>
            <table class="tablaRegistrar container">

                <tr>
                    <td colspan="2" style="text-align: center">
                        <input type="submit" class="btn btn-primary" name="accion" value="Registrar" />
                        &nbsp;
                        <input type="reset" class="btn btn-danger"   value="Nuevo" />
                        &nbsp;
                        <input type="button" class="btn btn-info" value="Lista" onclick="window.location.href = 'spagoapafa'" />
                    </td>
                </tr>
            </table>

        </form>

    <center>  
        <input type="button" class="btn btn-dark" value="Menu Principal" onclick="window.location.href = 'index.jsp'"> </center>
</body>     
</html>
