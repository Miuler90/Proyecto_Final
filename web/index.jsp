<html>
    <head>
        <title>Colegio Aplicacion</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/stilos.css" rel="stylesheet"/>


        <link rel="stylesheet" href="style.css" type="text/css"/>

    </head>
    <body>



        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">

        <style>
            .carousel-inner img {
                width: 100%;
                height: 100%;
            }
            .button {
                background-color: #4CAF50; /* Green */
                border: none;
                color: white;
                padding: 5px 20px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                -webkit-transition-duration: 0.4s; /* Safari */
                transition-duration: 0.4s;
                cursor: pointer;
            }

            * {
                box-sizing: border-box;
            }

            body {font-family: "Lato", sans-serif}
            .mySlides {display: none}
        </style>


        <%@include file="menu.jsp" %>

        <div class="w3-content" style="max-width:2000px;"></div>
        <div id="xinicio1"></div>
        <div id="demo" class="carousel slide" data-ride="carousel">

            <!-- INDICACIONES -->
            <ul class="carousel-indicators">
                <li data-target="#demo" data-slide-to="0" class="active"></li>
                <li data-target="#demo" data-slide-to="1"></li>
                <li data-target="#demo" data-slide-to="2"></li>
            </ul>

            <!-- EL CARRUSEL -->
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="img/lol.jpg" alt="primaria" width="1000" height="500">
                </div>

                <div class="carousel-item">
                    <img src="img/sss.jpeg" alt="Educación" width="1000" height="500">

                </div>
                <div class="carousel-item">
                    <img src="img/aa.jpg" alt="Ninos" width="1000" height="500">
                </div>
            </div>
            <!-- LETRAS EN MEDIO -->
            <div class="bgimg-1 w3-display w3-opacity-min">
                <div class="w3-display-middle" style="white-space:nowrap;">
                    <span class="w3-center w3-padding-large w3-black w3-xlarge w3-wide w3-animate-opacity w3-button">COLEGIO <span class="w3-hide-small">APLICACION</span> </span>
                </div>
            </div>

            <!-- lOS CONTROLES -->
            <a class="carousel-control-prev" href="#demo" data-slide="prev">
                <span class="carousel-control-prev-icon"></span>
            </a>
            <a class="carousel-control-next" href="#demo" data-slide="next">
                <span class="carousel-control-next-icon"></span>
            </a>
        </div>


        <!----------ESPACIO EN BLANCO------------>
        <div class="w3-content" style="max-width:2000px;margin-top:46px">
            <!-------------------------->
            <div id="nosotros2">
                <div class="card-group">
                    <div class="card bg-primary">
                        <div class="card-body text-center">
                            <p class="text-dark">BIENVENIDOS</p>
                            <p class="text-dark">APLICACIÓN UNA ESCUELA DE CALIDAD Y GESTIÓN AMBIENTAL, ubicada en Cahuide 420 distrito José L. Ortiz, Chiclayo-Lambayeque, creada el 16 de Febrero de 1961 con ampliación al nivel secundaria a partir del 31 de Diciembre del 2002 ; con aspiración y consolidación a la acreditación.</p>

                        </div>
                    </div>
                    <div class="card bg-warning">
                        <div class="card-body text-center">
                            <p class="text-dark">MISIÓN</p>
                            <p class="text-dark">Programar y ejecutar el currículo abarcando competencias y capacidades priorizadas y diversificadas de acuerdo a la realidad y a la transversalidad temática. Contar con la participación activa de todos los actores educativos en el desarrollo de las propuestas Pedagógica y de Gestión. Motivar y apoyar a los Docentes y Administrativos para su capacitación permanente a través de diplomados, cursos de segunda especialidad, licenciatura, maestría, etc.</p>
                        </div>
                    </div>
                    <div class="card bg-success">
                        <div class="card-body text-center">
                            <p class="text-dark">Visión</p>
                            <p class="text-dark">Ser una Institución que lidere en Educación en la Comunidad con un servicio de Calidad y goce de la confiabilidad de los Padres de Familia, Autoridades e Instituciones.</p>
                        </div>
                    </div>
                </div>
            </div>
            <!--------------------------->
            <div id="contactos1">
                >	
                <div class="w3-container w3-content w3-padding-64" style="max-width:800px" id="contact">
                    <h2 class="w3-wide w3-center">CONTACTO</h2>
                    <p class="w3-opacity w3-center"><i>Dejanos un Mensaje</i></p>
                    <div class="w3-row w3-padding-32">
                        <div class="w3-col m6 w3-large w3-margin-bottom">
                            <i class="fa fa-map-marker" style="width:30px"></i> Perú, Chiclayo<br>
                            <i class="fa fa-phone" style="width:30px"></i> Telefono: +51 987654321<br>
                            <i class="fa fa-envelope" style="width:30px"> </i> Email: colegioapp@mail.com<br>
                        </div>
                        <div class="w3-col m6">
                            <form action="/action_page.php" target="_blank">
                                <div class="w3-row-padding" style="margin:0 -16px 8px -16px">
                                    <div class="w3-half">
                                        <input class="w3-input w3-border" type="text" placeholder="Nombre" required name="Nombre">
                                    </div>
                                    <div class="w3-half">
                                        <input class="w3-input w3-border" type="text" placeholder="Email" required name="Email">
                                    </div>
                                </div>
                                <input class="w3-input w3-border" type="text" placeholder="Mensaje" required name="Mensaje">
                                <button class="w3-button w3-black w3-section w3-right" type="submit">ENVIAR</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

            <footer class="w3-center w3-black w3-padding-64 w3-opacity w3-hover-opacity-off">
                <a href="#inicio1" class="w3-button w3-light-grey"><i class="fa fa-arrow-up w3-margin-right"></i>Subir</a>
                <div class="w3-xlarge w3-section">
                    <i class="fa fa-facebook-official w3-hover-opacity"></i>
                    <i class="fa fa-instagram w3-hover-opacity"></i>
                    <i class="fa fa-snapchat w3-hover-opacity"></i>
                    <i class="fa fa-pinterest-p w3-hover-opacity"></i>
                    <i class="fa fa-twitter w3-hover-opacity"></i>
                    <i class="fa fa-linkedin w3-hover-opacity"></i>
                </div>
                <p>Developers<a href="https://www.w3schools.com/w3css/default.asp" title="W3.CSS" target="_blank" class="w3-hover-text-green">NB</a></p>
            </footer>
    </body>
</html>
