/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelos.datosusuario;
import Modelos.modelodatosusuario;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kattia
 */
@WebServlet(name = "sdatosusuario", urlPatterns = {"/sdatosusuario"})
public class sdatosusuario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion == null) {
            accion = "Listar";
        }
        switch (accion) {
            case "Listar":
                listardatosusuario(request, response);
                break;
            case "Registrar":
                registrardatosusuario(request, response);
                break;
            case "Cargar":
                cargardatosusuario(request, response);
                break;
            case "Actualizar":
                actualizardatosusuario(request, response);
                break;
            case "Eliminar":
                eliminardatosusuario(request, response);
                break;
        }
    }

    public void listardatosusuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<datosusuario> datosusuario;
            modelodatosusuario mP = new modelodatosusuario();
            datosusuario = mP.obtenerdatosusuario();
            request.setAttribute("datosusuario", datosusuario);
            request.getRequestDispatcher("/listardatosusuario.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

    public void registrardatosusuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {

            String nombre = request.getParameter("txtnombre");
            String apellidousuario = request.getParameter("txtpaterno");
            String celusuario = request.getParameter("txtcel");
            String correousuario = request.getParameter("txtcorreo");
            String sexousuario = request.getParameter("txtsexo");
            String cargo = request.getParameter("txtcargo");
            String username = request.getParameter("txtusername");
            String password = request.getParameter("txtpassword");
            int tipoacceso = Integer.parseInt(request.getParameter("tipoacceso"));
            
            datosusuario nuevodatosusario = new datosusuario(nombre, apellidousuario,
                    celusuario, correousuario, sexousuario, cargo, username, password, tipoacceso);
            modelodatosusuario mP = new modelodatosusuario();
            mP.registrardatosusuario(nuevodatosusario);
            response.sendRedirect("sdatosusuario");
        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

    public void cargardatosusuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id_datosusuario = Integer.parseInt(request.getParameter("id"));
            modelodatosusuario mP = new modelodatosusuario();
            datosusuario datosusuariocargado = mP.cargardatosusuario(id_datosusuario);
            request.setAttribute("datosusuariocargado", datosusuariocargado);
            request.getRequestDispatcher("/actualizardatosusuario.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

    public void actualizardatosusuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {

            int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
            String nombre = request.getParameter("txtnombre");
            String apellidousuario = request.getParameter("txtpaterno");
            String celusuario = request.getParameter("txtcel");
            String correousuario = request.getParameter("txtcorreo");
            String sexousuario = request.getParameter("txtsexo");
            String cargo = request.getParameter("txtcargo");
            String username = request.getParameter("txtusername");
            String password = request.getParameter("txtpassword");
            int tipoacceso = Integer.parseInt(request.getParameter("tipoacceso"));

            datosusuario datosusuarioactualizado = new datosusuario(id_usuario, nombre,
                    apellidousuario, celusuario, correousuario, sexousuario, cargo, username, password, tipoacceso);
            modelodatosusuario mP = new modelodatosusuario();
            mP.actualizardatosusuario(datosusuarioactualizado);
            response.sendRedirect("sdatosusuario");
        } catch (Exception e) {

            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);

        }
    }

    public void eliminardatosusuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id_datosusuario = Integer.parseInt(request.getParameter("id"));
            modelodatosusuario mP = new modelodatosusuario();
            mP.eliminardatosusuario(id_datosusuario);
            response.sendRedirect("sdatosusuario");
        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

}
