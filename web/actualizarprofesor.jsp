

<%@page import="Modelos.profesor"%>
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
        profesor profesorcargado = (profesor)request.getAttribute("profesorcargado");
    %>
    <body>
       
        <form action="sprofesor">
            <input type="hidden" name="idprofesor" value="<%=profesorcargado.getIdprofesor()%>" />
            <table class="tablaRegistrar">
               
                <h1> Formulario de Actualización </h1> 
    
                
                  <div class="form-row">
                        <div class="col-md-4 mb-3 md-form">
                          <label for="validationDefault22">DNI</label>
                          <input type="text" class="form-control" id="validationDefault22" name="txtdni" maxlength="8"  required value="<%=profesorcargado.getDniprofesor()%>">
                        </div> 
                        <!------------>
                         <div class="col-md-4 mb-3 md-form">
                            <label for="validationDefault22">Nombres</label>
                            <input type="text" class="form-control" id="validationDefault22" name="txtnombre"  required value="<%=profesorcargado.getNombreprofesor()%>">
                          </div>
                        <!------------>
                        <div class="col-md-4 mb-3 md-form">
                        <label for="validationDefaultUsername22">Apellidos</label>
                        <input type="text" class="form-control" name="txtapellidos" id="validationDefaultUsername22" aria-describedby="inputGroupPrepend23"
                          required value="<%=profesorcargado.getApellidoprofesor()%>">
                        </div>
                        </div>
                        <!------------>
                      
                        <div class="form-row">
                        <!------------>
                         <div class="col-md-4 mb-3 md-form">
                             <label for="validationDefault22">Edad</label>
                             <input type="number" class="form-control" name="txtedad" maxlength="2" id="validationDefault22"   required value="<%=profesorcargado.getEdad()%>">
                        </div> 
                        <div class="col-md-4 mb-3 md-form">
                          <label for="validationDefault22">Genero</label>
                          <input type="text" class="form-control" name="txtsexo" size="1" maxlength="1" id="validationDefault22"   required value="<%=profesorcargado.getSexo()%>">
                        </div>
                        </div>
                        <!------------>
                        <!------------>
                        <div class="form-row">
                        <div class="col-md-4 mb-3 md-form">
                          <label for="validationDefault22">Estado Civil</label>
                          <input type="text" class="form-control" name="txtestadocivil" id="validationDefault22"   required value="<%=profesorcargado.getEstadocivil()%>">
                        </div> 
                        <div class="col-md-4 mb-3 md-form">
                          <label for="validationDefault22">Direccion</label>
                          <input type="text" class="form-control" name="txtdireccion" id="validationDefault22"   required value="<%=profesorcargado.getDireccion()%>">
                        </div> 
                        <div class="col-md-4 mb-3 md-form">
                          <label for="validationDefault22">Telefono</label>
                          <input type="text" class="form-control" name="txttelefono" id="validationDefault22"   required value="<%=profesorcargado.getTelef()%>">
                        </div> 
                        <!------------>
                        <div class="col-md-4 mb-3 md-form">
                          <label for="validationDefault22">Celular</label>
                          <input type="text" class="form-control" name="txtcel" maxlength="9" id="validationDefault22"   required value="<%=profesorcargado.getCel()%>">
                        </div>
                        <!------------>
                        <div class="col-md-4 mb-3 md-form">
                             <label for="validationDefault22">Especialidad</label>
                          <input type="text" class="form-control" name="txtespecialidad"  id="validationDefault22"   required value="<%=profesorcargado.getEspecialidad()%>">
                        </div> 
                        </div>
                        <!------------>
                       
                
                
                
            
                
                <tr>
                    <td colspan="2" style="text-align: center">
                        <input type="submit" name="accion" value="Actualizar" />
                        &nbsp;
                        <input type="reset" value="Deshacer" />
                        &nbsp;
                        <input type="button" value="Regresar" onclick="window.location.href='sprofesor'" />
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
