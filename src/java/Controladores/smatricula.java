package Controladores;

import Modelos.matricula;
import Modelos.modelomatricula;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/smatricula"})
public class smatricula extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet smatricula</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet smatricula at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion == null) {
            accion = "Listar";
        }
        switch (accion) {
            case "Listar":
                listarmatriculas(request, response);
                break;
            case "Registrar":
                registrarmatricula(request, response);
                break;
            case "Cargar":
                // cargarmatricula(request, response);
                break;
            case "Actualizar":
                //actualizarmatricula(request, response);
                break;
            case "Eliminar":
                // eliminarmatricula(request, response);
                break;
        }
    }

    public void listarmatriculas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try 
        {
            List<List<String>> bmatricula;
            modelomatricula mP = new modelomatricula();
            
            bmatricula = mP.listarmatriculas();
            request.setAttribute("bmatricula", bmatricula); 
            request.getRequestDispatcher("/listarmatricula.jsp").forward(request, response);
        }
        catch (Exception e) 
        {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
    
    public void registrarmatricula(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {

            int id_perioaula = Integer.parseInt(request.getParameter("txtaula"));
            int id_usuario = Integer.parseInt(request.getParameter("txtidusuario"));
            int id_pagoapafa = Integer.parseInt(request.getParameter("txtapafa"));
            Date fechamatricula = Date.valueOf(request.getParameter("txtfechamatricula"));

            matricula nuevomatricula = new matricula( id_usuario,  id_perioaula,  id_pagoapafa,fechamatricula);
            modelomatricula mP = new modelomatricula();
            mP.registrarmatricula(nuevomatricula);
            response.sendRedirect("./registrarmatricula.jsp");
        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
