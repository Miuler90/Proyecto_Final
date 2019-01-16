
package Controladores;


import Modelos.apoderado;
import Modelos.modeloapoderado;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "sapoderado", urlPatterns = {"/sapoderado"})
public class sapoderado extends HttpServlet {

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if(accion==null)
        {
            accion = "Listar";
        }
        switch(accion)
        {
            case "Listar":
                listarapoderado(request, response);
                break;
            case "Registrar":
                registrarapoderado(request, response);
                break;
                 case "Cargar":
                cargarapoderado(request, response);
                break;
            case "Actualizar":
                actualizarapoderado(request, response);
                break;
            case "Eliminar":
                eliminarapoderado(request, response);
                break;
        }
    }
    
    public void listarapoderado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            List<apoderado> apoderado;
            modeloapoderado mP = new modeloapoderado();
            apoderado = mP.obtenerapoderado();
            request.setAttribute("apoderado", apoderado);
            request.getRequestDispatcher("/listarapoderado.jsp").forward(request, response);
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void registrarapoderado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        try 
        {
            
                String dniapoderado = request.getParameter("txtdni");
                String nombre = request.getParameter("txtnombre");
                String apellidopaterno = request.getParameter("txtpaterno");
                String apellidomaterno = request.getParameter("txtmaterno");
                String fechanac = request.getParameter("txtfechanac");
                int edad = Integer.parseInt (request.getParameter("txtedad"));
                String direccion = request.getParameter("txtdireccion");
                 String ocupacion = request.getParameter("txtocupacion");
                String cel = request.getParameter("txtcel");
                String correo = request.getParameter("txtcorreo");
                String sexo = request.getParameter("txtsexo");
                
            
            apoderado nuevoapoderado = new apoderado(dniapoderado,nombre,apellidopaterno,apellidomaterno,fechanac,edad,direccion,ocupacion,cel,correo,sexo);
            modeloapoderado mP = new modeloapoderado();
            mP.registrarapoderado(nuevoapoderado);
            response.sendRedirect("sapoderado");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
     public void cargarapoderado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            int idapoderado = Integer.parseInt(request.getParameter("idapoderado"));
            modeloapoderado mP = new modeloapoderado();
            apoderado apoderadocargado = mP.cargarapoderado(idapoderado);
            request.setAttribute("apoderadocargado", apoderadocargado);
            request.getRequestDispatcher("/actualizarapoderado.jsp").forward(request, response);
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void actualizarapoderado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            
                int idapoderado = Integer.parseInt(request.getParameter("idapoderado"));
                String dniapoderado = request.getParameter("txtdni");
                String nombres = request.getParameter("txtnombre");
                String apellidopaterno = request.getParameter("txtpaterno");
                String apellidomaterno = request.getParameter("txtmaterno");
                String fechanac = request.getParameter("txtfechanac");
                int edad = Integer.parseInt (request.getParameter("txtedad"));
                String direccion = request.getParameter("txtdireccion");
                String ocupacion = request.getParameter("txtocupacion");
                String cel = request.getParameter("txtcel");
                String correo = request.getParameter("txtcorreo");
                String sexo = request.getParameter("txtsexo");

            apoderado apoderadoactualizado = new apoderado(idapoderado,dniapoderado,nombres,apellidopaterno,apellidomaterno,fechanac,edad,direccion,ocupacion,cel,correo,sexo);
            modeloapoderado mP = new modeloapoderado();
            mP.actualizarapoderado(apoderadoactualizado);
            response.sendRedirect("sapoderado");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void eliminarapoderado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            int idapoderado = Integer.parseInt(request.getParameter("idapoderado"));
            modeloapoderado mP = new modeloapoderado();
            mP.eliminarapoderado(idapoderado);
            response.sendRedirect("sapoderado");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

   
    
}
