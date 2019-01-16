
<%@page import="Modelos.pagoapafa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       </head>
    <%
        pagoapafa pagoapafacargado = (pagoapafa)request.getAttribute("pagoapafacargado");
    %>
    <body>
       <%@include file="menu.jsp" %>
       <form action="spagoapafa" class="container">
            <input type="hidden" name="idpagoapafa" value="<%=pagoapafacargado.getIdpagoapafa()%>" />
            <table class="tablaRegistrar">
               
                <h1> Formulario de Actualización </h1> 
    
                  <div class="form-row">
                        <div class="col-md-4 mb-3 md-form">
                           <label for="validationDefault22">Id Parentesco</label>
                          <input type="text" class="form-control" id="validationDefault22" name="txtidapoderado" maxlength="4"  required value="<%=pagoapafacargado.getId_parentesco()%>">
                        </div> 
                        <!------------>
                         <div class="col-md-4 mb-3 md-form">
                            <label for="validationDefault22">Numero Recibo</label>
                            <input type="text" class="form-control" id="validationDefault22" name="txtnrorecibo"  required value="<%=pagoapafacargado.getNrorecibo()%>">
                          </div>
                        <!------------>
                        <div class="col-md-4 mb-3 md-form">
                            <label for="validationDefaultUsername22">Fecha Pago</label>
                          <input type="date" class="form-control" name="txtfechapago" id="validationDefault22"   required value="<%=pagoapafacargado.getFechapago()%>">
                        </div> 
                        </div>
                        <!------------>
                        <!------------>
                        <div class="form-row">
                        <div class="col-md-4 mb-3 md-form">
                          <label for="validationDefault22">Monto</label>
                          <input type="number" class="form-control" name="txtmonto" id="validationDefault22"   required value="<%=pagoapafacargado.getMonto()%>">
                        </div> 
                      
                         </div>

                <tr>
                    <td colspan="2" style="text-align: center">
                        <input type="submit" name="accion" value="Actualizar" />
                        &nbsp;
                        <input type="reset" value="Deshacer" />
                        &nbsp;
                        <input type="button" value="Regresar" onclick="window.location.href='spagoapafa'" />
                    </td>
                </tr>
            </table>
        </form>
          </body>
</html>
