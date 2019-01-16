

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%@include file="menu.jsp" %>

        <form action="sapoderado" class="container">
            <h1>Registro de Apoderado</h1>
            <div class="form-row">
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">DNI</label>
                    <input type="text" class="form-control" id="validationDefault22" name="txtdni" maxlength="8"  required>
                </div> 
                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Nombres</label>
                    <input type="text" class="form-control" id="validationDefault22" name="txtnombre"  required>
                </div>
                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefaultUsername22">Apellido Paterno</label>
                    <input type="text" class="form-control" name="txtpaterno" id="validationDefaultUsername22" aria-describedby="inputGroupPrepend23"
                           required>
                </div>
            </div>
            <!------------>
            <!------------>
            <div class="form-row">
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Apellido Materno</label>
                    <input type="text" class="form-control" name="txtmaterno" id="validationDefault22"   required>
                </div> 
                <!------------>
                
                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Edad</label>
                    <input type="number" class="form-control" name="txtedad" maxlength="2" id="validationDefault22"   required>
                </div> 
            </div>
            <!------------>
            <!------------>
            <div class="form-row">
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Direccion</label>
                    <input type="text" class="form-control" name="txtdireccion" id="validationDefault22"   required>
                </div> 
                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Ocupacion</label>
                    <input type="text" class="form-control" name="txtoc" maxlength="9" id="validationDefault22"   required>
                </div>
                <!------------>

                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Genero</label>
                    <input type="text" class="form-control" name="txtsexo" size="1" maxlength="1" id="validationDefault22"   required>
                </div>
                <!------------>

                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Celular</label>
                    <input type="text" class="form-control" name="txtcel" maxlength="9" id="validationDefault22"   required>
                </div>
                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Correo</label>
                    <input type="text" class="form-control" name="txtcorreo"  id="validationDefault22"   required>
                </div> 

            </div>



            <table class="tablaRegistrar">

                <tr>
                    <td colspan="2" style="text-align: center">
                        <input type="submit" class="btn btn-outline-primary" name="accion" value="Registrar" />
                        &nbsp;
                        <input type="reset" class="btn btn-outline-success"   value="Nuevo" />
                        &nbsp;
                        <input type="button" class="btn btn-outline-info" value="Lista" onclick="window.location.href = 'sapoderado'" />
                    </td>
                </tr>
            </table>

        </form>
    <center>  
        <input type="button" class="btn btn-dark" value="Menu Principal" onclick="window.location.href = 'index.jsp'"> </center>
</body>
</html>
