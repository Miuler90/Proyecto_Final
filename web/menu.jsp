
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Bootstrap core CSS -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css" rel="stylesheet">
<!-- Material Design Bootstrap -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.5.16/css/mdb.min.css" rel="stylesheet">
<link rel="stylesheet" href="./css/style.css" type="text/css"/>
<title>JSP Page</title>
<style>
    .top-nav-collapse{
        background: rgba(0,0,0,0.774)!important;
    }
</style>
<nav class="navbar navbar-expand-lg navbar-dark blue scrolling-navbar fixed-top">
    <div class="container" >
        <a class="navbar-brand" href="#">Colegio App</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav" style="width:100%">
                <li class="nav-link nav-item active"><a href="./">Inicio <span class="sr-only">(current)</span></a></li>

                <%if (session.getAttribute("nombreusuario") != "" && session.getAttribute("id_usuario") != null) {
                %>
                <li class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Año escolar <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="http://localhost:8084/MatriculaIEAPLICACION/registrarperiodo.jsp#"><i class="fa fa-users"></i>Periodo</a>
                        </li>
                        <li>
                            <a href="http://localhost:8084/MatriculaIEAPLICACION/registrargradoseccion.jsp#"><i class="fa fa-users"></i>Grado Seccion</a>
                        </li>
                        <li>
                            <a href="http://localhost:8084/MatriculaIEAPLICACION/registrarcurso.jsp#"><i class="fa fa-users"></i>Curso</a>
                        </li>
                        <li>
                            <a href="http://localhost:8084/MatriculaIEAPLICACION/registraraula.jsp#"><i class="fa fa-users"></i>Aula</a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="http://localhost:8084/MatriculaIEAPLICACION/registrarmatricula.jsp#">Matriculas</a>
                </li>
                <li class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Alumnos <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li >
                            <a href="http://localhost:8084/MatriculaIEAPLICACION/registraralumno.jsp#">Alumno</a>
                        </li> 
                        <li >
                            <a  href="http://localhost:8084/MatriculaIEAPLICACION/registrarapoderado.jsp#">Apoderado</a>
                        </li>
                        <li class="nav-item">
                            <a  href="http://localhost:8084/MatriculaIEAPLICACION/registrarpagoapafa.jsp#">Apafa</a>
                        </li>
                    </ul>
                </li>


                <li class="nav-item">
                    <a class="nav-link" href="http://localhost:8084/MatriculaIEAPLICACION/registrarprofesor.jsp#">Docentes</a>
                </li>

                <%
                    } else {
                    %>
                         <%=request.getRequestURI()%>
                       <%

                                if (!request.getRequestURI().equals("/MatriculaIEAPLICACION/") && !request.getRequestURI().equals("/MatriculaIEAPLICACION/login.jsp") ) {
                            response.sendRedirect("./");
                        }
                               

                    }
                %>
            </ul>

            <div style="width: 50%">
                <ul  class=" navbar-nav">
                    <li><%if (session.getAttribute("nombreusuario") != "" && session.getAttribute("nombreusuario") != null) {
                        %>
                        <span style="color:yellow;display: block;"> Hola, <%= session.getAttribute("nombreusuario")%></span>
                    <li class="dropdown">
                        <a href="#" class=" dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Mi cuenta <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <%

                                if (session.getAttribute("permiso").equals("1") && session.getAttribute("permiso") != null) {
                            %>
                            <li> 
                                <a href="http://localhost:8084/MatriculaIEAPLICACION/registrardatosusuario.jsp#">Registrar Usuario</a>
                            </li>
                            <%
                                }

                            %>
                            <li><a href="./logout.jsp">Cerrar sesion</a></li>
                        </ul>
                    </li>

                    <%                    } else {
                    %>
                    <li> <a href="http://localhost:8084/MatriculaIEAPLICACION/login.jsp#">Iniciar Sesion</a>
                    </li>
                    <%
                        }
                    %>
                    </li>

                </ul>
            </div>


        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<!-- JQuery -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- Bootstrap tooltips -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
<!-- Bootstrap core JavaScript -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.min.js"></script>
<!-- MDB core JavaScript -->
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.5.16/js/mdb.min.js"></script>

