
<%@page import="Modelos.apoderado"%>
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
        apoderado apoderadocargado = (apoderado)request.getAttribute("apoderadocargado");
    %>
    <body>
       
        <form action="sapoderado">
            <input type="hidden" name="idapoderado" value="<%=apoderadocargado.getIdapoderado()%>" />
            <table class="tablaRegistrar">
               
                <h1> Formulario de Actualización </h1> 
    
                
                  <div class="form-row">
                        <div class="col-md-4 mb-3 md-form">
                          <label for="validationDefault22">DNI</label>
                          <input type="text" class="form-control" id="validationDefault22" name="txtdni" maxlength="8"  required value="<%=apoderadocargado.getDniapoderado()%>">
                        </div> 
                        <!------------>
                         <div class="col-md-4 mb-3 md-form">
                            <label for="validationDefault22">Nombres</label>
                            <input type="text" class="form-control" id="validationDefault22" name="txtnombre"  required value="<%=apoderadocargado.getNombres()%>">
                          </div>
                        <!------------>
                        <div class="col-md-4 mb-3 md-form">
                        <label for="validationDefaultUsername22">Apellido Paterno</label>
                        <input type="text" class="form-control" name="txtpaterno" id="validationDefaultUsername22" aria-describedby="inputGroupPrepend23"
                          required value="<%=apoderadocargado.getApellidopaterno()%>">
                        </div>
                        </div>
                        <!------------>
                        <!------------>
                        <div class="form-row">
                        <div class="col-md-4 mb-3 md-form">
                          <label for="validationDefault22">Apellido Materno</label>
                          <input type="text" class="form-control" name="txtmaterno" id="validationDefault22"   required value="<%=apoderadocargado.getApellidomaterno()%>">
                        </div> 
                        <!------------>
 
                        <!------------>
                         <div class="col-md-4 mb-3 md-form">
                             <label for="validationDefault22">Edad</label>
                             <input type="number" class="form-control" name="txtedad" maxlength="2" id="validationDefault22"   required value="<%=apoderadocargado.getEdad()%>">
                        </div> 
                        </div>
                        <!------------>
                        <!------------>
                        <div class="form-row">
                        <div class="col-md-4 mb-3 md-form">
                          <label for="validationDefault22">Direccion</label>
                          <input type="text" class="form-control" name="txtdireccion" id="validationDefault22"   required value="<%=apoderadocargado.getDireccion()%>">
                        </div> 
                        <!------------>
                        <div class="col-md-4 mb-3 md-form">
                          <label for="validationDefault22">Ocupacion</label>
                          <input type="text" class="form-control" name="txtocupacion" id="validationDefault22"   required value="<%=apoderadocargado.getOcupacion()%>">
                        </div> 
                        <!------------>
                        <div class="col-md-4 mb-3 md-form">
                          <label for="validationDefault22">Celular</label>
                          <input type="text" class="form-control" name="txtcel" maxlength="9" id="validationDefault22"   required value="<%=apoderadocargado.getCel()%>">
                        </div>
                        <!------------>
                        <div class="col-md-4 mb-3 md-form">
                             <label for="validationDefault22">Correo</label>
                          <input type="text" class="form-control" name="txtcorreo"  id="validationDefault22"   required value="<%=apoderadocargado.getCorreo()%>">
                        </div> 
                        </div>
                        <!------------>
                         <div class="form-row">
                        <div class="col-md-4 mb-3 md-form">
                          <label for="validationDefault22">Genero</label>
                          <input type="text" class="form-control" name="txtsexo" size="1" maxlength="1" id="validationDefault22"   required value="<%=apoderadocargado.getSexo()%>">
                        </div>
                      
                         </div>
 
                <tr>
                    <td colspan="2" style="text-align: center">
                        <input type="submit" name="accion" value="Actualizar" />
                        &nbsp;
                        <input type="reset" value="Deshacer" />
                        &nbsp;
                        <input type="button" value="Regresar" onclick="window.location.href='sapoderado'" />
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
