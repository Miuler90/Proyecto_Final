
package Controladores;

import Modelos.gradoseccion;
import Modelos.modelogradoseccion;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "sgradoseccion", urlPatterns = {"/sgradoseccion"})
public class sgradoseccion extends HttpServlet {

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
                listargradoseccion(request, response);
                break;
            case "Registrar":
                registrargradoseccion(request, response);
                break;
                 case "Cargar":
                cargargradoseccion(request, response);
                break;
            case "Actualizar":
                actualizargradoseccion(request, response);
                break;
            case "Eliminar":
                eliminargradoseccion(request, response);
                break;
        }
    }
    
    public void listargradoseccion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            List<gradoseccion> gradoseccion;
            modelogradoseccion mP = new modelogradoseccion();
            gradoseccion = mP.obtenergradoseccion();
            request.setAttribute("gradoseccion", gradoseccion);
            request.getRequestDispatcher("/listargradoseccion.jsp").forward(request, response);
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void registrargradoseccion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        try 
        {
            
                String nombregrado = request.getParameter("txtnombregrado");
                String nombreseccion = request.getParameter("txtnombreseccion");
                
            
            gradoseccion nuevogradoseccion = new gradoseccion(nombregrado,nombreseccion);
            modelogradoseccion mP = new modelogradoseccion();
            mP.registrargradoseccion(nuevogradoseccion);
            response.sendRedirect("sgradoseccion");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
     public void cargargradoseccion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            int idgradoseccion = Integer.parseInt(request.getParameter("idgradoseccion"));
            modelogradoseccion mP = new modelogradoseccion();
            gradoseccion gradoseccioncargado = mP.cargargradoseccion(idgradoseccion);
            request.setAttribute("gradoseccioncargado", gradoseccioncargado);
            request.getRequestDispatcher("/actualizargradoseccion.jsp").forward(request, response);
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void actualizargradoseccion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            
                int idgradoseccion = Integer.parseInt(request.getParameter("idgradoseccion"));
                String nombregrado= request.getParameter("txtnombregrado");
                String nombreseccion = request.getParameter("txtnombreseccion");
                
            gradoseccion gradoseccionactualizado = new gradoseccion(idgradoseccion,nombregrado,nombreseccion);
            modelogradoseccion mP = new modelogradoseccion();
            mP.actualizargradoseccion(gradoseccionactualizado);
            response.sendRedirect("sgradoseccion");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void eliminargradoseccion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            int idgradoseccion = Integer.parseInt(request.getParameter("idgradoseccion"));
            modelogradoseccion mP = new modelogradoseccion();
            mP.eliminargradoseccion(idgradoseccion);
            response.sendRedirect("sgradoseccion");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    

}
