
package Controladores;

import Modelos.alumno;
import Modelos.modeloalumno;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "salumno", urlPatterns = {"/salumno"})
public class salumno extends HttpServlet 
{

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
                listaralumno(request, response);
                break;
            case "Registrar":
                registraralumno(request, response);
                break;
                 case "Cargar":
                cargaralumno(request, response);
                break;
            case "Actualizar":
                actualizaralumno(request, response);
                break;
            case "Eliminar":
                eliminaralumno(request, response);
                break;
        }
    }
    
    public void listaralumno(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            List<alumno> alumno;
            modeloalumno mP = new modeloalumno();
            alumno = mP.obteneralumno();
            request.setAttribute("alumno", alumno);
            request.getRequestDispatcher("/listaralumno.jsp").forward(request, response);
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void registraralumno(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        try 
        {
            Date fecha = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
                String dnialumno = request.getParameter("txtdni");
                String nombre = request.getParameter("txtnombre");
                String apellidopaterno = request.getParameter("txtpaterno");
                String apellidomaterno = request.getParameter("txtmaterno");
                String fechanac = request.getParameter("txtfechanac");
                int edad = Integer.parseInt (request.getParameter("txtedad"));
                String direccion = request.getParameter("txtdireccion");
                String cel = request.getParameter("txtcel");
                String correo = request.getParameter("txtcorreo");
                String sexo = request.getParameter("txtsexo");
                String observaciones = request.getParameter("txtobservaciones");
                String religion = request.getParameter("txtreligion");
                String fechareg = sdf.format(new Date());
            
            alumno nuevoalumno = new alumno(dnialumno,nombre,apellidopaterno,apellidomaterno,fechanac,edad,direccion,cel,correo,sexo,observaciones,religion,fechareg);
            modeloalumno mP = new modeloalumno();
            mP.registraralumno(nuevoalumno);
            response.sendRedirect("salumno");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
     public void cargaralumno(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            int id = Integer.parseInt(request.getParameter("idalumno"));
            modeloalumno mP = new modeloalumno();
            alumno alumnocargado = mP.cargaralumno(id);
            request.setAttribute("alumnocargado", alumnocargado);
            request.getRequestDispatcher("/actualizaralumno.jsp").forward(request, response);
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void actualizaralumno(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            Date fecha = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
                int idalumno = Integer.parseInt(request.getParameter("idalumno"));
                String dnialumno = request.getParameter("txtdni");
                String nombre = request.getParameter("txtnombre");
                String apellidopaterno = request.getParameter("txtpaterno");
                String apellidomaterno = request.getParameter("txtmaterno");
                String fechanac = request.getParameter("txtfechanac");
                int edad = Integer.parseInt (request.getParameter("txtedad"));
                String direccion = request.getParameter("txtdireccion");
                String cel = request.getParameter("txtcel");
                String correo = request.getParameter("txtcorreo");
                String sexo = request.getParameter("txtsexo");
                String observaciones = request.getParameter("txtobservaciones");
                String religion = request.getParameter("txtreligion");
                String fechareg = sdf.format(new Date());
  
            alumno alumnoactualizado = new alumno(idalumno,dnialumno,nombre,apellidopaterno,apellidomaterno,fechanac,edad,direccion,cel,correo,sexo,observaciones,religion,fechareg);
            modeloalumno mP = new modeloalumno();
            mP.actualizaralumno(alumnoactualizado);
            response.sendRedirect("salumno");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void eliminaralumno(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            int id = Integer.parseInt(request.getParameter("idalumno"));
            modeloalumno mP = new modeloalumno();
            mP.eliminaralumno(id);
            response.sendRedirect("salumno");
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
//    MIULERRRRRRR
}
