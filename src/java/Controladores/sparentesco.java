
package Controladores;


import Modelos.modeloparentesco;
import Modelos.parentesco;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Miuler
 */
@WebServlet(name = "sparentesco", urlPatterns = {"/sparentesco"})
public class sparentesco extends HttpServlet {

   
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
                listarparentesco(request, response);
                break;
            case "Registrar":
                registrarparentesco(request, response);
                break;
                 case "Cargar":
                cargarparentesco(request, response);
                break;
            case "Actualizar":
                actualizarparentesco(request, response);
                break;
            case "Eliminar":
                eliminarparentesco(request, response);
                break;
        }
    }
    
    public void listarparentesco(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            List<parentesco> parentesco;
            modeloparentesco mP = new modeloparentesco();
            parentesco = mP.obtenerparentesco();
            request.setAttribute("parentesco", parentesco);
            request.getRequestDispatcher("/listarparentesco.jsp").forward(request, response);
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void registrarparentesco(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        try 
        {
                int id_alumno = Integer.parseInt (request.getParameter("txtidalumno"));
                int id_apoderado2 = Integer.parseInt (request.getParameter("txtidapoderado"));
                String tipo = request.getParameter("txttipo");        
            
            parentesco nuevoparentesco = new parentesco(id_alumno,id_apoderado2,tipo);
            modeloparentesco mP = new modeloparentesco();
            mP.registrarparentesco(nuevoparentesco);
            response.sendRedirect("sparentesco");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
     public void cargarparentesco(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            int idparentesco = Integer.parseInt(request.getParameter("idparentesco"));
            modeloparentesco mP = new modeloparentesco();
            parentesco parentescocargado = mP.cargarparentesco(idparentesco);
            request.setAttribute("parentescocargado", parentescocargado);
            request.getRequestDispatcher("/actualizarparentesco.jsp").forward(request, response);
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void actualizarparentesco(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
          
                int id_alumno = Integer.parseInt (request.getParameter("txtidalumno"));
                int id_apoderado2 = Integer.parseInt (request.getParameter("txtidapoderado"));
                String tipo = request.getParameter("txttipo");   
  
            parentesco parentescoactualizado = new parentesco(id_alumno,id_apoderado2,tipo);
            modeloparentesco mP = new modeloparentesco();
            mP.actualizarparentesco(parentescoactualizado);
            response.sendRedirect("sparentesco");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void eliminarparentesco(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            int id = Integer.parseInt(request.getParameter("idparentesco"));
            modeloparentesco mP = new modeloparentesco();
            mP.eliminarparentesco(id);
            response.sendRedirect("sparentesco");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
//    MIULERRRRRRR

}
