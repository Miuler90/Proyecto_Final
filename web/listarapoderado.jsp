<%@page import="Modelos.apoderado"%>
<%@page import="java.util.List"%>
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
        <title>JSP Page</title>
        <style>
            .top-nav-collapse{
                background: rgba(0,0,0,0.774)!important;
            }
        </style>
    </head>
    <%
        List<apoderado> apoderado = (List<apoderado>)request.getAttribute("apoderado");
    %>
    <body>
        
        <nav class="navbar navbar-expand-lg navbar-dark blue scrolling-navbar fixed-top">
            <div class="container" >
                <a class="navbar-brand" href="#">Colegio App</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                  <ul class="navbar-nav">
                    <li class="nav-item active">
                      <a class="nav-link" href="#">Casa <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="http://localhost:8084/MatriculaIEAPLICACION/registrardatosusuario.jsp#">Datos Usuario</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="http://localhost:8084/MatriculaIEAPLICACION/registrarmatricula.jsp#">Matriculas</a>
                    </li>
                   <li class="nav-item">
                      <a class="nav-link" href="http://localhost:8084/MatriculaIEAPLICACION/registraralumno.jsp#">Alumnos</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="http://localhost:8084/MatriculaIEAPLICACION/registrargradoseccion.jsp#">Grado Seccion</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="http://localhost:8084/MatriculaIEAPLICACION/registrarprofesor.jsp#">Profesores</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="http://localhost:8084/MatriculaIEAPLICACION/registrarapoderado.jsp#">Apoderado</a>
                    </li>
                     <li class="nav-item">
                      <a class="nav-link" href="http://localhost:8084/MatriculaIEAPLICACION/registrarcurso.jsp#">Curso</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="http://localhost:8084/MatriculaIEAPLICACION/registraraula.jsp#">Aula</a>
                    </li>
                     <li class="nav-item">
                      <a class="nav-link" href="http://localhost:8084/MatriculaIEAPLICACION/registrarpagoapafa.jsp#">Pago Apafa</a>
                    </li>
                      <li class="nav-item">
                      <a class="nav-link" href="http://localhost:8084/MatriculaIEAPLICACION/registrarperiodo.jsp#">Periodo</a>
                    </li>
                   
                  </ul>
                </div>
            </div>
        </nav>
        <br>
        <br>
        <br>
        <br>
        <br>
 
        <table  class="table table-striped table-bordered table-sm container" >
            <thead class="thead-dark">
                 <tr>
                <th>Dni</th>
                <th>Nombres</th>
                <th>ApPaterno</th>
                <th>ApMaterno</th>
                
                <th>Edad</th>
                <th>Direccion</th>
                <th>Ocupacion</th>
                <th>Cel</th>
                <th>correo</th>
                <th>Sexo</th>
               
            </tr>
             
            </thead>
           
            <%
                for(apoderado apoderadotemporal : apoderado)
                {
                    %>
                    <tr>
                        <td><%=apoderadotemporal.getDniapoderado()%></td>
                        <td><%=apoderadotemporal.getNombres()%></td>
                        <td><%=apoderadotemporal.getApellidopaterno()%></td>
                        <td><%=apoderadotemporal.getApellidomaterno()%></td>
                        
                        <td><%=apoderadotemporal.getEdad()%></td>
                        <td><%=apoderadotemporal.getDireccion()%></td>
                        <td><%=apoderadotemporal.getOcupacion()%></td>
                        <td><%=apoderadotemporal.getCel()%></td>
                        <td><%=apoderadotemporal.getCorreo()%></td>
                        <td>
                            <%
                            if(apoderadotemporal.getSexo().equals("M"))
                            {
                                %>Masculino<%
                            }
                            else
                            {
                                %>Femenino<%
                            }
                            %>
                        </td>
                 
                        <td>
                            <a href="sapoderado?accion=Cargar&idapoderado=<%=apoderadotemporal.getIdapoderado()%>">Actualizar</a>
                            &nbsp;|&nbsp;
                            <a href="sapoderado?accion=Eliminar&idapoderado=<%=apoderadotemporal.getIdapoderado()%>">Eliminar</a>
                        </td>
                        
                    </tr>
                    <%
                }
            %>
             
        </table>
            <div class="container">
                 <input type="button" value="Nuevo Registro" class="btn btn-outline-danger" onclick="location.href='registrarapoderado.jsp'"/>
            </div>
            <div class="container">
                 <input type="button" value="Ir al Menu" class="btn btn-outline-danger" onclick="location.href='menu.jsp'"/>
            </div>
                
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
