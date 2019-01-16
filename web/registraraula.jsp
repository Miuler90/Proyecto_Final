<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>

        <%@include file="menu.jsp" %>
        <form action="saula" class="container">
            <h1>Registro de Aula</h1>

            <div class="form-row">
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Nombre Aula</label>
                    <input type="text" class="form-control" id="validationDefault22" name="txtnombreaula"  required>
                </div>
                <!------------>
                <div class="col-md-4 mb-3 md-form">
                    <label for="validationDefault22">Capacidad</label>
                    <input type="number" class="form-control" id="validationDefault22" name="txtcapacidad"  required>
                </div>
            </div>


            <table class="tablaRegistrar">

                <tr>
                    <td colspan="2" style="text-align: center">
                        <input type="submit" class="btn btn-primary" name="accion" value="Registrar" />
                        &nbsp;
                        <input type="reset" class="btn btn-danger"   value="Nuevo" />
                        &nbsp;
                        <input type="button" class="btn btn-info" value="Lista" onclick="window.location.href = 'saula'" />
                    </td>
                </tr>
            </table>

        </form>
    <center>  
        <input type="button" class="btn btn-dark" value="Menu Principal" onclick="window.location.href = 'index.jsp'"> </center>
</body>
</html>
