
package Controladores;

import Modelos.aula;
import Modelos.modeloaula;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "saula", urlPatterns = {"/saula"})
public class saula extends HttpServlet {

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
                listaraula(request, response);
                break;
            case "Registrar":
                registraraula(request, response);
                break;
                 case "Cargar":
                cargaraula(request, response);
                break;
            case "Actualizar":
                actualizaraula(request, response);
                break;
            case "Eliminar":
                eliminaraula(request, response);
                break;
        }
    }
    
    public void listaraula(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            List<aula> aula;
            modeloaula mP = new modeloaula();
            aula= mP.obteneraula();
            request.setAttribute("aula", aula);
            request.getRequestDispatcher("/listaraula.jsp").forward(request, response);
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void registraraula(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        try 
        {

                String nombreaula = request.getParameter("txtnombreaula");
                int capacidad= Integer.parseInt(request.getParameter("txtcapacidad"));
            
            aula nuevoaula = new aula(nombreaula,capacidad);
            modeloaula mP = new modeloaula();
            mP.registraraula(nuevoaula);
            response.sendRedirect("saula");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
     public void cargaraula(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            int idaula = Integer.parseInt(request.getParameter("idaula"));
            modeloaula mP = new modeloaula();
            aula aulacargado = mP.cargaraula(idaula);
            request.setAttribute("aulacargado", aulacargado);
            request.getRequestDispatcher("/actualizaraula.jsp").forward(request, response);
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void actualizaraula(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            
                int idaula = Integer.parseInt(request.getParameter("idaula"));
                 String nombreaula = request.getParameter("txtnombreaula");
                int capacidad= Integer.parseInt(request.getParameter("capacidad"));
 
            aula aulaactualizado = new aula(idaula,nombreaula,capacidad);
            modeloaula mP = new modeloaula();
            mP.actualizaraula(aulaactualizado);
            response.sendRedirect("saula");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void eliminaraula(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            int idaula = Integer.parseInt(request.getParameter("idaula"));
            modeloaula mP = new modeloaula();
            mP.eliminaraula(idaula);
            response.sendRedirect("saula");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
}
