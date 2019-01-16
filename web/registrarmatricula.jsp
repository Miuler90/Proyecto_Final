

<%@page import="java.util.List"%>
<%@page import="Modelos.modelopagoapafa"%>
<%@page import="Modelos.modeloapoderado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        <%@include file="menu.jsp" %>
        <h3 class="text-center">Registro de Matricula</h3>
        <%            List<List<String>> bperioaula;
            modelopagoapafa mP = new modelopagoapafa();
            bperioaula = mP.buscarperioaula();
        %>
        <form action="spagoapafa" class="container">
            <div class="form-row">
                <div class="col-md-2 mb-3 md-form">
                    <label style="position: relative" for="txtperiodoaula">Grado y Seccion</label>
                    <select name="selperioaula" id="selperioaula" class="form-control">
                        <%
                            if (bperioaula.size() > 0) {
                                for (int i = 0; i < bperioaula.size(); i++) {
                                    List<String> pa = (List<String>) bperioaula.get(i);
                        %>
                        <option value="<%= pa.get(0)%>"><%= pa.get(1) + " - " + pa.get(2)%></option> 
                        <%
                                }
                            }
                        %>
                    </select>


                </div>
                <div class="col-md-2 mb-3 md-form">
                    <label style="position: relative" for="txtapafa">Recibo de Apafa</label>
                    <input type="text" class="" id="txtapafa" name="txtapafa" maxlength="4" required>
                </div>

                <div class="col-md-3 mb-3 md-form">
                    <input type="submit" class="btn btn-primary" name="accion" value="Buscar" />
                </div>
            </div>    
        </form>

        <%
            if (request.getAttribute("bperioaula") != null) {
                List<List<String>> aula = (List<List<String>>) request.getAttribute("bperioaula");
                if (aula.size() > 0) {

                    List<String> au = aula.get(0);
        %>
        <div class="container">
            <div class="form-row ">
                <div class="col-md-2 mb-3 md-form">
                    <b>Periodo: </b><%= au.get(1)%>
                </div>
                <div class="col-md-3 mb-3 md-form">
                    <b>Grado y Secc: </b><%= au.get(2)%>
                </div>
                <div class="col-md-2 mb-3 md-form">
                    <b>Aula: </b><%= au.get(3)%>
                </div>
                <div class="col-md-2 mb-3 md-form">
                    <b>Capacidad: </b><%= au.get(4)%>
                </div>
                <div class="col-md-2 mb-3 md-form">
                    <b>Vacantes: </b><%= au.get(5)%>
                </div>
            </div> 
        </div>

        <%

            if (request.getAttribute("bpagoapafa") != null) {
                List<List<String>> apafa = (List<List<String>>) request.getAttribute("bpagoapafa");
                if (apafa.size() > 0) {

                    List<String> ap = apafa.get(0);

        %>

        <form action="smatricula" class="container">
            <div class="form-row">
                <div class="col-md-4 mb-3 md-form">
                    <label style="position: relative" for="validationDefault22"># Recibo de Apafa</label>
                    <input readonly="true" type="text" value="<%= ap.get(2)%>" class="form-control" id="validationDefault22" name="txtapafa" maxlength="4" required>
                    <input readonly="true" type="hidden" value="<%= au.get(0)%>" class="form-control" id="validationDefault22" name="txtaula" maxlength="4" required>
                    <input readonly="true" type="hidden" value="<%=session.getAttribute("id_usuario")%>" class="form-control" id="validationDefault22" name="txtidusuario" maxlength="4" required>

                </div>
                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label style="position: relative" for="validationDefault22">Alumno</label>
                    <input readonly="true" type="text" value="<%= ap.get(4)%>" class="form-control" id="validationDefault22" name="txtalumno" maxlength="4" required>
                </div>

                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label style="position: relative" for="validationDefault22">Usuario</label>
                    <input readonly="true" value="<%= session.getAttribute("nombreusuario")%>" type="text" class="form-control" id="validationDefault22" name="txtusuario" maxlength="4" required>
                </div>
            </div>
            <!------------>
            <div class="form-row">
                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label style="position: relative" for="validationDefault22">Grado y Seccion</label>
                    <input value="<%= au.get(2)%>" type="text" class="form-control" id="validationDefault22" name="txtgs" maxlength="4" required>
                </div>
                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label style="position: relative" for="validationDefault22">Apoderado</label>
                    <input readonly="true" type="text" value="<%= ap.get(3)%>" class="form-control" id="validationDefault22" name="txtapo" maxlength="4" required>
                </div>
                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label style="position: relative" for="txtfechamatricula">Fecha Matricula</label>
                    <input type="date" class="form-control" name="txtfechamatricula" id="validationDefault22"   required>
                </div>
            </div>
        <%
                        }
                    }
                }
            }
        %> 
            <table class="tablaRegistrar container">

                <tr>
                    <td colspan="2" style="text-align: center">
                        <input type="submit" class="btn btn-primary" name="accion" value="Registrar" />
                        &nbsp;
                        <input type="reset" class="btn btn-outline-warning"   value="Nuevo" />
                        &nbsp;
                        <input type="button" class="btn btn-primary" value="Lista" onclick="window.location.href = 'smatricula'" />
                    </td>
                </tr>
            </table>

        </form>
                  

    <center>  
        <input type="button" class="btn btn-dark" value="Menu Principal" onclick="window.location.href = 'index.jsp'"> </center>
</body>
</html>
