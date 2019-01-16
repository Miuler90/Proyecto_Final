package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class modelomatricula {

    private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;

    public void registrarmatricula(matricula nuevomatricula) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion", "root", "");
            st = con.createStatement();
            String sql = "INSERT INTO matricula (id_usuario,id_perioaula,id_pagoapafa,fechamatricula) VALUES('"
                    + nuevomatricula.getId_usuario() + "','"
                    + nuevomatricula.getId_perioaula() + "','"
                    + nuevomatricula.getId_pagoapafa() + "','"
                    + nuevomatricula.getFechamatricula() + "')";
            st.executeUpdate(sql);
            con.close();
            st.close();
        } catch (Exception e) {
            throw e;
        }
    }

    public List<List<String>> listarmatriculas() throws Exception {

        List<List<String>> matriculas = new ArrayList<>();

        List<String> matricula = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion", "root", "");
            st = con.createStatement();
            String sql = "SELECT matricula.idmatricula, periodo.nombreperiodo,\n"
                    + "CONCAT(alumno.nombrealumno,\", \", alumno.apellidopaterno, \" \", alumno.apellidomaterno) AS alumno, \n"
                    + " gs.nombregrado, aula.nombreaula, aula.capacidad,\n"
                    + " CONCAT(apoderado.nombres,\", \", apoderado.apellidopaterno,\" \",apoderado.apellidomaterno) AS apoderado, \n"
                    + " parentesco.tipo as parentesco,\n"
                    + " matricula.fechamatricula\n"
                    + "FROM matricula  \n"
                    + "INNER JOIN pagoapafa apafa ON matricula.id_pagoapafa = apafa.idpagoapafa\n"
                    + "INNER JOIN perioaula pa ON pa.idperioaula = matricula.id_perioaula\n"
                    + "INNER JOIN periodo ON pa.id_periodo = periodo.idperiodo\n"
                    + "INNER JOIN parentesco ON parentesco.idparentesco = apafa.id_parentesco\n"
                    + "INNER JOIN apoderado ON parentesco.id_apoderado2 = apoderado.idapoderado\n"
                    + "INNER JOIN alumno ON alumno.idalumno = parentesco.id_alumno\n"
                    + "INNER JOIN gradoseccion gs ON gs.idgradoseccion = pa.id_gradoseccion\n"
                    + "INNER JOIN aula ON pa.id_aula = aula.idaula";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                matricula.add(rs.getString("idmatricula"));
                matricula.add(rs.getString("nombreperiodo"));
                matricula.add(rs.getString("alumno"));
                matricula.add(rs.getString("nombregrado"));
                matricula.add(rs.getString("nombreaula"));
                matricula.add(rs.getString("capacidad"));
                matricula.add(rs.getString("apoderado"));
                matricula.add(rs.getString("parentesco"));
                matricula.add(rs.getString("fechamatricula"));
                matriculas.add(matricula);
            }
            con.close();
            st.close();
            rs.close();
            return matriculas;
        } catch (Exception e) {
            throw e;
        }
    }

}
