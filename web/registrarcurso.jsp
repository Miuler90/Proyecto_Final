
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
     
<%@include file="menu.jsp" %>
        
         
        <form action="scurso" class="container">
            <h1>Registro de Curso</h1>
              
            <div class="form-row">
            <div class="col-md-4 mb-3 md-form">
                 <label for="validationDefault22">Id Profesor</label>
              <input type="number" class="form-control" id="validationDefault22" name="txtid" required>
            </div> 
            <!------------>
            <div class="col-md-4 mb-3 md-form">
            <label for="validationDefault22">Nombre Curso</label>
                <input type="text" class="form-control" id="validationDefault22" name="txtnombrecurso"  required>
              </div>
            </div>
                        
                 
            <table class="tablaRegistrar">
                
                <tr>
                    <td colspan="2" style="text-align: center">
                        <input type="submit" class="btn btn-primary" name="accion" value="Registrar" />
                        &nbsp;
                        <input type="reset" class="btn btn-danger"   value="Nuevo" />
                        &nbsp;
                        <input type="button" class="btn btn-info" value="Lista" onclick="window.location.href='scurso'" />
                    </td>
                </tr>
            </table>
            
        </form>
    <center>  
    <input type="button" class="btn btn-dark" value="Menu Principal" onclick="window.location.href='index.jsp'"> </center>
       </body>
</html>
