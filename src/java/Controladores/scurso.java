
package Controladores;

import Modelos.curso;
import Modelos.modelocurso;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "scurso", urlPatterns = {"/scurso"})
public class scurso extends HttpServlet {

  
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
                listarcurso(request, response);
                break;
            case "Registrar":
                registrarcurso(request, response);
                break;
                 case "Cargar":
                cargarcurso(request, response);
                break;
            case "Actualizar":
                actualizarcurso(request, response);
                break;
            case "Eliminar":
                eliminarcurso(request, response);
                break;
        }
    }
    
    public void listarcurso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            List<curso> curso;
            modelocurso mP = new modelocurso();
            curso = mP.obtenercurso();
            request.setAttribute("curso", curso);
            request.getRequestDispatcher("/listarcurso.jsp").forward(request, response);
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void registrarcurso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        try 
        {
            
                int idprofesor = Integer.parseInt(request.getParameter("txtid"));
                String nombrecurso = request.getParameter("txtnombrecurso");
               
            
            curso nuevocurso = new curso(idprofesor,nombrecurso);
            modelocurso mP = new modelocurso();
            mP.registrarcurso(nuevocurso);
            response.sendRedirect("scurso");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
     public void cargarcurso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            int idcurso = Integer.parseInt(request.getParameter("idcurso"));
            modelocurso mP = new modelocurso();
            curso cursocargado = mP.cargarcurso(idcurso);
            request.setAttribute("cursocargado", cursocargado);
            request.getRequestDispatcher("/actualizarcurso.jsp").forward(request, response);
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void actualizarcurso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            
                int idcurso = Integer.parseInt(request.getParameter("idcurso"));
                 int id_profesor = Integer.parseInt(request.getParameter("txtid"));
                String nombrecurso = request.getParameter("txtnombrecurso");
                
            
            
            curso cursoactualizado = new curso(idcurso,id_profesor,nombrecurso);
            modelocurso mP = new modelocurso();
            mP.actualizarcurso(cursoactualizado);
            response.sendRedirect("scurso");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void eliminarcurso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            int idcurso = Integer.parseInt(request.getParameter("idcurso"));
            modelocurso mP = new modelocurso();
            mP.eliminarcurso(idcurso);
            response.sendRedirect("scurso");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
}
