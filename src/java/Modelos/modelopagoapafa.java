package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class modelopagoapafa {

    private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;

    public List<List<String>> buscarapoderadoalumno(String dniapo, String dnialu) throws Exception {

        List<List<String>> perioaula = new ArrayList<>();

        List<String> perioaula1 = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion", "root", "");
            st = con.createStatement();
            String sql = "SELECT parentesco.idparentesco, \n"
                    + "CONCAT(alumno.nombrealumno,\", \", alumno.apellidopaterno, \" \", alumno.apellidomaterno) AS alumno,\n"
                    + " CONCAT(apoderado.nombres,\", \", apoderado.apellidopaterno,\" \",apoderado.apellidomaterno) AS apoderado, \n"
                    + " parentesco.tipo AS parentesco\n"
                    + "FROM parentesco\n"
                    + "INNER JOIN apoderado ON parentesco.id_apoderado2 = apoderado.idapoderado\n"
                    + "INNER JOIN alumno ON alumno.idalumno = parentesco.id_alumno\n"
                    + "where apoderado.dniapoderado ='" + dniapo + "' and alumno.dnialumno ='" + dnialu + "'\n"
                    + "order by parentesco.idparentesco desc limit 1";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                perioaula1.add(rs.getString("idparentesco"));
                perioaula1.add(rs.getString("alumno"));
                perioaula1.add(rs.getString("apoderado"));
                perioaula1.add(rs.getString("parentesco"));
                perioaula.add(perioaula1);
            }
            con.close();
            st.close();
            rs.close();
            return perioaula;
        } catch (Exception e) {
            throw e;
        }
    }

    public List<List<String>> buscarperioaula() throws Exception {

        List<List<String>> perioaula = new ArrayList<>();

        List<String> perioaula1 = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion", "root", "");
            st = con.createStatement();
            String sql = "select pa.idperioaula, periodo.nombreperiodo,gs.nombregrado, aula.nombreaula, aula.capacidad\n"
                    + " from perioaula pa \n"
                    + " INNER JOIN periodo ON pa.id_periodo = periodo.idperiodo\n"
                    + " inner join gradoseccion gs on gs.idgradoseccion = pa.id_gradoseccion\n"
                    + " inner join aula on pa.id_aula = aula.idaula";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                perioaula1.add(rs.getString("idperioaula"));
                perioaula1.add(rs.getString("nombreperiodo"));
                perioaula1.add(rs.getString("nombregrado"));
                perioaula1.add(rs.getString("nombreaula"));
                perioaula1.add(rs.getString("capacidad"));

                perioaula.add(perioaula1);
            }
            con.close();
            st.close();
            rs.close();
            return perioaula;
        } catch (Exception e) {
            throw e;
        }
    }

    public List<List<String>> buscarperioaula(int idperioaula) throws Exception {

        List<List<String>> perioaula = new ArrayList<>();

        List<String> perioaula1 = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion", "root", "");
            st = con.createStatement();
            String sql = "select pa.idperioaula, periodo.nombreperiodo,gs.nombregrado, aula.nombreaula, aula.capacidad,\n"
                    + "(select aula.capacidad from aula \n"
                    + "inner join perioaula pa on pa.id_aula = aula.idaula where pa.idperioaula = 1)\n"
                    + "-\n"
                    + "(select count(*) from matricula inner join perioaula pa on pa.id_periodo = matricula.id_perioaula where pa.idperioaula = 1 )\n"
                    + " as vacantes\n"
                    + " from perioaula pa \n"
                    + "  INNER JOIN periodo ON pa.id_periodo = periodo.idperiodo\n"
                    + "   inner join gradoseccion gs on gs.idgradoseccion = pa.id_gradoseccion\n"
                    + "	inner join aula on pa.id_aula = aula.idaula\n"
                    + "	where pa.idperioaula = " + idperioaula + "";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                perioaula1.add(rs.getString("idperioaula"));
                perioaula1.add(rs.getString("nombreperiodo"));
                perioaula1.add(rs.getString("nombregrado"));
                perioaula1.add(rs.getString("nombreaula"));
                perioaula1.add(rs.getString("capacidad"));
                perioaula1.add(rs.getString("vacantes"));
                perioaula.add(perioaula1);
            }
            con.close();
            st.close();
            rs.close();
            return perioaula;
        } catch (Exception e) {
            throw e;
        }
    }

    public List<List<String>> buscarpagoapafa(int id_apafa) throws Exception {

        List<List<String>> pagoapafa = new ArrayList<>();

        List<String> pagoapafa1 = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion", "root", "");
            st = con.createStatement();
            String sql = "SELECT apafa.id_periodo AS periodo,periodo.nombreperiodo, apafa.idpagoapafa,\n"
                    + "concat(apoderado.nombres , \", \" , apoderado.apellidopaterno,\" \",apoderado.apellidomaterno) AS apoderdado, \n"
                    + "concat(alumno.nombrealumno,\", \", alumno.apellidopaterno, \" \", alumno.apellidomaterno) AS alumno\n"
                    + "FROM pagoapafa apafa\n"
                    + "INNER JOIN periodo ON apafa.id_periodo = periodo.idperiodo\n"
                    + "INNER JOIN parentesco ON parentesco.idparentesco = apafa.id_parentesco\n"
                    + "INNER JOIN apoderado ON parentesco.id_apoderado2 = apoderado.idapoderado\n"
                    + "INNER JOIN alumno ON alumno.idalumno = parentesco.id_alumno\n"
                    + "where apafa.idpagoapafa =" + id_apafa + "";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                pagoapafa1.add(rs.getString("periodo"));
                pagoapafa1.add(rs.getString("nombreperiodo"));
                pagoapafa1.add(rs.getString("idpagoapafa"));
                pagoapafa1.add(rs.getString("apoderdado"));
                pagoapafa1.add(rs.getString("alumno"));
                pagoapafa.add(pagoapafa1);
            }
            con.close();
            st.close();
            rs.close();
            return pagoapafa;
        } catch (Exception e) {
            throw e;
        }
    }

    public List<pagoapafa> obtenerpagoapafa() throws Exception {
        List<pagoapafa> pagoapafa = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion", "root", "");
            st = con.createStatement();
            String sql = "SELECT * FROM pagoapafa";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                int idpagoapafa = rs.getInt("idpagoapafa");
                int id_periodo = rs.getInt("id_periodo");
                int id_apoderado = rs.getInt("id_parentesco");
                String nrorecibo = rs.getString("nrorecibo");
                String fechapago = rs.getString("fechapago");
                double monto = rs.getDouble("monto");

                pagoapafa pagoapafatemporal = new pagoapafa(idpagoapafa,id_periodo, id_apoderado, nrorecibo, fechapago, monto);
                pagoapafa.add(pagoapafatemporal);
            }
            con.close();
            st.close();
            rs.close();
            return pagoapafa;
        } catch (Exception e) {
            throw e;
        }
    }

    public void registrarpagoapafa(pagoapafa nuevopagoapafa) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion", "root", "");
            st = con.createStatement();
            String sql = "INSERT INTO pagoapafa (id_periodo,id_parentesco,nrorecibo,fechapago,monto) VALUES('" 
                    + nuevopagoapafa.getId_periodo()+ "','" 
                    + nuevopagoapafa.getId_parentesco() + "','"
                    + nuevopagoapafa.getNrorecibo() + "','" 
                    + nuevopagoapafa.getFechapago() + "','" + nuevopagoapafa.getMonto() + "')";
            st.executeUpdate(sql);
            con.close();
            st.close();
        } catch (Exception e) {
            throw e;
        }
    }

    public pagoapafa cargarpagoapafa(int idpagoapafa) throws Exception {
        pagoapafa pagoapafacargado = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion", "root", "");
            st = con.createStatement();
            String sql = "SELECT * FROM pagoapafa WHERE idpagoapafa ='" + idpagoapafa + "'";
            rs = st.executeQuery(sql);
            if (rs.next()) {

                int id_periodo = rs.getInt("id_periodo");
                int id_apoderado = rs.getInt("id_parentesco");
                String nrorecibo = rs.getString("nrorecibo");
                String fechapago = rs.getString("fechapago");
                int monto = rs.getInt("monto");

                pagoapafacargado = new pagoapafa(idpagoapafa,id_periodo, id_apoderado, nrorecibo, fechapago, monto);
            }
            con.close();
            st.close();
            rs.close();
            return pagoapafacargado;
        } catch (Exception e) {
            throw e;
        }
    }

    public void actualizarpagoapafa(pagoapafa pagoapafaactualizado) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion", "root", "");
            st = con.createStatement();
            String sql = "UPDATE pagoapafa SET id_parentesco='" + pagoapafaactualizado.getId_parentesco()+ "', nrorecibo='" + pagoapafaactualizado.getNrorecibo() + "', fechapago='" + pagoapafaactualizado.getFechapago() + "', monto='" + pagoapafaactualizado.getMonto() + "' WHERE idpagoapafa='" + pagoapafaactualizado.getIdpagoapafa() + "'";
            st.executeUpdate(sql);
            con.close();
            st.close();
        } catch (Exception e) {
            throw e;
        }
    }

    public void eliminarpagoapafa(int idpagoapafa) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion", "root", "");
            st = con.createStatement();
            String sql = "DELETE FROM pagoapafa WHERE idpagoapafa='" + idpagoapafa + "'";
            st.executeUpdate(sql);
            con.close();
            st.close();
        } catch (Exception e) {
            throw e;
        }
    }
}
