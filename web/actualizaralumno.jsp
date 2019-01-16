<%@page import="Modelos.alumno"%>
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
        alumno alumnocargado = (alumno)request.getAttribute("alumnocargado");
    %>
    <body>
       
        <form action="salumno">
            <input type="hidden" name="idalumno" value="<%=alumnocargado.getIdalumno()%>" />
            
            <table class="tablaRegistrar">
                <tr>
                    <th colspan="2">
                        Formulario de Actualización
                    </th>
                </tr>                
                <tr>
                    <td>
                        Dni:
                    </td>
                    <td>
                        <input type="text" name="txtdni" placeholder="Ingrese Dni" required value="<%=alumnocargado.getDnialumno()%>" />
                    </td>
                </tr>
                <tr>
                    <td>
                        Nombres:
                    </td>
                    <td>
                        <input type="text" name="txtnombre" placeholder="Ingrese Nombres" required value="<%=alumnocargado.getNombre()%>" />
                    </td>
                </tr>
                <tr>
                    <td>
                        Apellido Paterno:
                    </td>
                    <td>
                        <input type="text" name="txtpaterno" placeholder="Ingrese Nombres" required value="<%=alumnocargado.getApellidopaterno()%>" />
                    </td>
                </tr>
                <tr>
                    <td>
                        Apellido Materno:
                    </td>
                    <td>
                        <input type="text" name="txtmaterno" placeholder="Ingrese Nombres" required value="<%=alumnocargado.getApellidomaterno()%>" />
                    </td>
                </tr>
                <tr>
                    <td>
                        Fecha Nac.
                    </td>
                    <td>
                        <input type="date" name="txtfechanac"  required value="<%=alumnocargado.getFechanac()%>" />
                    </td>
                </tr>
                <tr>
                    <td>
                        Edad:
                    </td>
                    <td>
                        <input type="number" name="txtedad" placeholder="Ingrese Edad" step="1" min="0" required value="<%=alumnocargado.getEdad()%>" />
                    </td>
                </tr>
                <tr>
                    <td>
                        Direccion:
                    </td>
                    <td>
                        <input type="text" name="txtdireccion" placeholder="Ingrese Direccion" required value="<%=alumnocargado.getDireccion()%>" />
                    </td>
                </tr>
                 <tr>
                    <td>
                        N° Cel:
                    </td>
                    <td>
                        <input type="number" name="txtcel" placeholder="Ingrese N° Cel"  value="<%=alumnocargado.getCel()%>" />
                    </td>
                </tr>
                 <tr>
                    <td>
                        Correo:
                    </td>
                    <td>
                        <input type="text" name="txtcorreo" placeholder="Ingrese Correo" required value="<%=alumnocargado.getCorreo()%>" />
                    </td>
                </tr> 
                <tr>
                    <td>
                        Genero:
                    </td>
                    <td>
                        <input type="text" name="txtsexo" placeholder="Ingrese genero" required value="<%=alumnocargado.getSexo()%>" />
                    </td>
                </tr>
                
                <tr>
                    <td>
                        Observaciones:
                    </td>
                    <td>
                        <input type="text" name="txtobservaciones" rows="5" cols="50" placeholder="Ingrese Observaciones" required value="<%=alumnocargado.getObservaciones()%>" />
                    </td>
                </tr>
                <tr>
                    <td>
                        Religion:
                    </td>
                    <td>
                        <input type="text" name="txtreligion" placeholder="Ingrese Religion" required value="<%=alumnocargado.getReligion()%>" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center">
                        <input type="submit" name="accion" value="Actualizar" />
                        &nbsp;
                        <input type="reset" value="Deshacer" />
                        &nbsp;
                        <input type="button" value="Regresar" onclick="window.location.href='salumno'" />
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

