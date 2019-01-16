
package Controladores;

import Modelos.modeloprofesor;
import Modelos.profesor;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "sprofesor", urlPatterns = {"/sprofesor"})
public class sprofesor extends HttpServlet {

  
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
                listarprofesor(request, response);
                break;
            case "Registrar":
                registrarprofesor(request, response);
                break;
                 case "Cargar":
                cargarprofesor(request, response);
                break;
            case "Actualizar":
                actualizarprofesor(request, response);
                break;
            case "Eliminar":
                eliminarprofesor(request, response);
                break;
        }
    }
    
    public void listarprofesor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            List<profesor> profesor;
            modeloprofesor mP = new modeloprofesor();
            profesor = mP.obtenerprofesor();
            request.setAttribute("profesor", profesor);
            request.getRequestDispatcher("/listarprofesor.jsp").forward(request, response);
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void registrarprofesor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        try 
        {
            
                String dniprofesor = request.getParameter("txtdni");
                String nombreprofesor = request.getParameter("txtnombre");
                String apellidoprofesor = request.getParameter("txtapellidos");
                int edad = Integer.parseInt (request.getParameter("txtedad"));
                String sexo = request.getParameter("txtsexo");
                String estadocivil = request.getParameter("txtestadocivil");
                String direccion = request.getParameter("txtdireccion");
                 String telef= request.getParameter("txttelefono");
                String cel = request.getParameter("txtcel");
                 String especialidad = request.getParameter("txtespecialidad");
            
            profesor nuevoprofesor = new profesor(dniprofesor,nombreprofesor,apellidoprofesor,edad,sexo,estadocivil,direccion,telef,cel,especialidad);
            modeloprofesor mP = new modeloprofesor();
            mP.registrarprofesor(nuevoprofesor);
            response.sendRedirect("sprofesor");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
     public void cargarprofesor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            int idprofesor = Integer.parseInt(request.getParameter("idprofesor"));
            modeloprofesor mP = new modeloprofesor();
            profesor profesorcargado = mP.cargarprofesor(idprofesor);
            request.setAttribute("profesorcargado", profesorcargado);
            request.getRequestDispatcher("/actualizarprofesor.jsp").forward(request, response);
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void actualizarprofesor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            
                int idprofesor = Integer.parseInt(request.getParameter("idprofesor"));
                String dniprofesor = request.getParameter("txtdni");
                 String nombreprofesor = request.getParameter("txtnombre");
                String apellidoprofesor = request.getParameter("txtapellidos");
                int edad = Integer.parseInt (request.getParameter("txtedad"));
                String sexo = request.getParameter("txtsexo");
                String estadocivil = request.getParameter("txtestadocivil");
                String direccion = request.getParameter("txtdireccion");
                 String telef= request.getParameter("txttelefono");
                String cel = request.getParameter("txtcel");
                 String especialidad = request.getParameter("txtespecialidad");
            
            
            profesor profesoractualizado = new profesor(idprofesor,dniprofesor,nombreprofesor,apellidoprofesor,edad,sexo,estadocivil,direccion,telef,cel,especialidad);
            modeloprofesor mP = new modeloprofesor();
            mP.actualizarprofesor(profesoractualizado);
            response.sendRedirect("sprofesor");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void eliminarprofesor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            int idprofesor = Integer.parseInt(request.getParameter("idprofesor"));
            modeloprofesor mP = new modeloprofesor();
            mP.eliminarprofesor(idprofesor);
            response.sendRedirect("sprofesor");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
}
