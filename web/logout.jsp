<%
    request.getSession().removeAttribute("nombreusuario");
    request.getSession().removeAttribute("id_usuario");
    request.getSession().removeAttribute("permiso");
    response.sendRedirect("./index.jsp");
%>
