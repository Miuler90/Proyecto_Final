

<%@page import="Modelos.matricula"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <!-- Font Awesome -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <!-- Bootstrap core CSS -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
        <!-- Material Design Bootstrap -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.5.16/css/mdb.min.css" rel="stylesheet">
        <link rel="stylesheet" href="style.css" type="text/css"/>
        
        <title>Actualización</title>
        <style type="text/css">
            .tablaRegistrar
            {
                margin: 0 auto;
            }
        </style>
    </head>
    <%
        matricula matriculacargado = (matricula)request.getAttribute("matriculacargado");
    %>
    <body>
       
        <form action="smatricula">
            <input type="hidden" name="idmatricula" value="<%=matriculacargado.getIdmatricula()%>" />
            <table class="tablaRegistrar">
               
                <h1> Formulario de Actualización </h1> 
    
                
                  <div class="form-row">
                        <div class="col-md-4 mb-3 md-form">
                          <label for="validationDefault22">Id Usuario2</label>
                          <input type="text" class="form-control" id="validationDefault22" name="txtidusuario2" maxlength="4"  required value="<%=matriculacargado.getId_usuario2()%>">
                        </div> 
                        <!------------>
                         <div class="col-md-4 mb-3 md-form">
                             <label for="validationDefault22">Id PeriodoAula </label>
                          <input type="text" class="form-control" id="validationDefault22" name="txtperiodoaula" maxlength="4"  required value="<%=matriculacargado.getId_periodoaula()%>">
                        </div> 
                        <!------------>
                        <div class="col-md-4 mb-3 md-form">
                       <label for="validationDefault22">Id Apoderado3</label>
                          <input type="text" class="form-control" id="validationDefault22" name="txtapoderado3" maxlength="4"  required value="<%=matriculacargado.getId_apoderado3()%>">
                        </div> 
                        </div>
                        <!------------>
                        <!------------>
                        <div class="form-row">
                            <div class="col-md-4 mb-3 md-form">
                         <label for="validationDefault22">Id PagoApafa</label>
                          <input type="text" class="form-control" id="validationDefault22" name="txtpagoapafa" maxlength="4"  required value="<%=matriculacargado.getId_pagoapafa()%>">
                        </div> 
                        <!------------>
                         <div class="col-md-4 mb-3 md-form">
                         <label for="validationDefault22">Id alumno3</label>
                          <input type="text" class="form-control" id="validationDefault22" name="txtalumno" maxlength="4"  required value="<%=matriculacargado.getId_alumno3()%>">
                        </div> 
                        <!------------>
                         <div class="col-md-4 mb-3 md-form">
                             <label for="validationDefault22">Estado Alumno</label>
                             <input type="text" class="form-control" name="txtestado" maxlength="1" id="validationDefault22"   required value="<%=matriculacargado.getEstadoalumno()%>">
                        </div> 
                        </div>
                        <!------------>
                        <!------------>
                        <div class="form-row">
                         <div class="col-md-4 mb-3 md-form">
                         <label for="validationDefault22">Fecha Matricula</label>
                          <input type="date" class="form-control" name="txtfechamatricula" id="validationDefault22"   required value="<%=matriculacargado.getFechamatricula()%>">
                        </div> 
                         </div>

                
                
                
                
                
                <tr>
                    <td colspan="2" style="text-align: center">
                        <input type="submit" name="accion" value="Actualizar" />
                        &nbsp;
                        <input type="reset" value="Deshacer" />
                        &nbsp;
                        <input type="button" value="Regresar" onclick="window.location.href='controladorProducto'" />
                    </td>
                </tr>
            </table>
        </form>
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
