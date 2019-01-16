<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error</title>
    </head>
    <body>
       
        Se ha producido el siguiente error: <%=request.getAttribute("error")%>
        <br>
        <br>
        <input type="button" value="Regresar" onclick="window.location.href='menu.jsp'" />
     
    </body>
</html>
