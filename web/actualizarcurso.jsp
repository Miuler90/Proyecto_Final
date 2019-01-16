
<%@page import="Modelos.curso"%>
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
       curso cursocargado = (curso)request.getAttribute("cursocargado");
    %>
    <body>
       
        <form action="scurso">
            <input type="hidden" name="idcurso" value="<%=cursocargado.getIdcurso()%>" />
            <table class="tablaRegistrar">
               
                <h1> Formulario de Actualización </h1> 
    
                
                  <div class="form-row">
                         <div class="col-md-4 mb-3 md-form">
                             <label for="validationDefault22">Id Profesor</label>
                          <input type="text" class="form-control" id="validationDefault22" name="txtid" maxlength="4"  required value="<%=cursocargado.getId_profesor()%>">
                        </div> 
                        <!------------>
                        <div class="col-md-4 mb-3 md-form">
                            <label for="validationDefault22">Nombre Curso</label>
                            <input type="text" class="form-control" id="validationDefault22" name="txtnombrecurso"  required value="<%=cursocargado.getNombrecurso()%>">
                          </div>
                        </div>

                <tr>
                    <td colspan="2" style="text-align: center">
                        <input type="submit" name="accion" value="Actualizar" />
                        &nbsp;
                        <input type="reset" value="Deshacer" />
                        &nbsp;
                        <input type="button" value="Regresar" onclick="window.location.href='scurso'" />
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
