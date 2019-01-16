package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class modelousuario {

    private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;

    public List<datosusuario> obtenerusuario(String user, String pwd) throws Exception {
        List<datosusuario> usuario = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion", "root", "");
            st = con.createStatement();
            String sql = "SELECT * FROM usuario where username ='" + user + "' and password='" + pwd + "'";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                int idusuario = rs.getInt("id_usuario");
                String usuario_usuario = rs.getString("nombreusuario");
                int tipoacceso = rs.getInt("tipoacceso");

                datosusuario usuariotemporal = new datosusuario(idusuario, usuario_usuario, tipoacceso);
                usuario.add(usuariotemporal);
            }
            con.close();
            st.close();
            rs.close();
            return usuario;
        } catch (Exception e) {
            throw e;
        }
    }
}
