package Controladores;

import Modelos.modelopagoapafa;
import Modelos.pagoapafa;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "spagoapafa", urlPatterns = {"/spagoapafa"})
public class spagoapafa extends HttpServlet {

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
                listarpagoapafa(request, response);
                break;
            case "Buscar":
                buscarpagoapafa(request, response);
                break;
            case "Consultar":
                buscarApoderadoAlumno(request, response);
                break;
            case "Registrar":
                registrarpagoapafa(request, response);
                break;
            case "Cargar":
                cargarpagoapafa(request, response);
                break;
            case "Actualizar":
                actualizarpagoapafa(request, response);
                break;
            case "Eliminar":
                eliminarpagoapafa(request, response);
                break;
        }
    }

    public void buscarpagoapafa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<List<String>> bpagoapafa;
            List<List<String>> bperioaula;
            modelopagoapafa mP = new modelopagoapafa();
            int id_apafa = Integer.parseInt(request.getParameter("txtapafa"));
            int perioaula = Integer.parseInt(request.getParameter("selperioaula"));

            bpagoapafa = mP.buscarpagoapafa(id_apafa);
            bperioaula = mP.buscarperioaula(perioaula);
            request.setAttribute("bperioaula", bperioaula);
            request.setAttribute("bpagoapafa", bpagoapafa);
            request.getRequestDispatcher("/registrarmatricula.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

    public void buscarApoderadoAlumno(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String dniapo = request.getParameter("txtapoderado");
        String dnialu = request.getParameter("txtalumno");
        String periodo = request.getParameter("selperiodo");
        try {
            List<List<String>> bapoalu;
            modelopagoapafa mP = new modelopagoapafa();

            bapoalu = mP.buscarapoderadoalumno(dniapo, dnialu);
            request.setAttribute("buscarApoderadoAlumno", bapoalu);
            request.setAttribute("idperiodo", periodo);
            request.getRequestDispatcher("/registrarpagoapafa.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("error", e + "" + dniapo + "" + dnialu);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

    public void listarpagoapafa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            List<pagoapafa> pagoapafa;
            modelopagoapafa mP = new modelopagoapafa();
            pagoapafa = mP.obtenerpagoapafa();
            request.setAttribute("pagoapafa", pagoapafa);
            request.getRequestDispatcher("/listarpagoapafa.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

    public void registrarpagoapafa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {

            int ip_periodo = Integer.parseInt(request.getParameter("txtperiodo"));
            int id_apoderado = Integer.parseInt(request.getParameter("txtidparentesco"));
            String nrorecibo = request.getParameter("txtnrorecibo");
            String fechapago = request.getParameter("txtfechapago");
            Double monto = Double.parseDouble(request.getParameter("txtmonto"));

            pagoapafa nuevopagoapafa = new pagoapafa(ip_periodo,id_apoderado, nrorecibo, fechapago, monto);
            modelopagoapafa mP = new modelopagoapafa();
            mP.registrarpagoapafa(nuevopagoapafa);
            response.sendRedirect("spagoapafa");
        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

    public void cargarpagoapafa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int idpagoapafa = Integer.parseInt(request.getParameter("idpagoapafa"));
            modelopagoapafa mP = new modelopagoapafa();
            pagoapafa pagoapafacargado = mP.cargarpagoapafa(idpagoapafa);
            request.setAttribute("pagoapafacargado", pagoapafacargado);
            request.getRequestDispatcher("/actualizarpagoapafa.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

    public void actualizarpagoapafa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {

            int idpagoapafa = Integer.parseInt(request.getParameter("idpagoapafa"));
            int id_apoderado = Integer.parseInt(request.getParameter("txtidapoderado"));
            String nrorecibo = request.getParameter("txtnrorecibo");
            String fechapago = request.getParameter("txtfechapago");
            Double monto = Double.parseDouble(request.getParameter("txtmonto"));

            pagoapafa pagoapafaactualizado = new pagoapafa(idpagoapafa, id_apoderado, nrorecibo, fechapago, monto);
            modelopagoapafa mP = new modelopagoapafa();
            mP.actualizarpagoapafa(pagoapafaactualizado);
            response.sendRedirect("spagoapafa");
        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

    public void eliminarpagoapafa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int idpagoapafa = Integer.parseInt(request.getParameter("idpagoapafa"));
            modelopagoapafa mP = new modelopagoapafa();
            mP.eliminarpagoapafa(idpagoapafa);
            response.sendRedirect("spagoapafa");
        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }

}
