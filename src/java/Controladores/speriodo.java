
package Controladores;

import Modelos.modeloperiodo;
import Modelos.periodo;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "speriodo", urlPatterns = {"/speriodo"})
public class speriodo extends HttpServlet {

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
                listarperiodo(request, response);
                break;
            case "Registrar":
                registrarperiodo(request, response);
                break;
                 case "Cargar":
                cargarperiodo(request, response);
                break;
            case "Actualizar":
                actualizarperiodo(request, response);
                break;
            case "Eliminar":
                eliminarperiodo(request, response);
                break;
        }
    }
    
    public void listarperiodo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            List<periodo> periodo;
            modeloperiodo mP = new modeloperiodo();
            periodo = mP.obtenerperiodo();
            request.setAttribute("periodo", periodo);
            request.getRequestDispatcher("/listarperiodo.jsp").forward(request, response);
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void registrarperiodo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        try 
        {
 
                String nombreperiodo= request.getParameter("txtnombreperiodo");
               
            
            periodo nuevoperiodo = new periodo(nombreperiodo);
            modeloperiodo mP = new modeloperiodo();
            mP.registrarperiodo(nuevoperiodo);
            response.sendRedirect("speriodo");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
     public void cargarperiodo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            int idperiodo = Integer.parseInt(request.getParameter("idperiodo"));
            modeloperiodo mP = new modeloperiodo();
            periodo periodocargado = mP.cargarperiodo(idperiodo);
            request.setAttribute("periodocargado", periodocargado);
            request.getRequestDispatcher("/actualizarperiodo.jsp").forward(request, response);
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void actualizarperiodo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            
                int idperiodo = Integer.parseInt(request.getParameter("idperiodo"));
                String nombreperiodo = request.getParameter("txtnombreperiodo");

            periodo periodoactualizado = new periodo(idperiodo,nombreperiodo);
            modeloperiodo mP = new modeloperiodo();
            mP.actualizarperiodo(periodoactualizado);
            response.sendRedirect("speriodo");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void eliminarperiodo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            int idperiodo = Integer.parseInt(request.getParameter("idperiodo"));
            modeloperiodo mP = new modeloperiodo();
            mP.eliminarperiodo(idperiodo);
            response.sendRedirect("speriodo");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

}
