
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Yo
 */
public class ConexionDB {

    public static Connection con;

    public static Connection conectar() throws SQLException {

        if (con == null) {
            try {
                String servidor = "jdbc:mysql://localhost:3306/dbtienda";
                String usuario = "root";
                String pass = "";
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection(servidor, usuario, pass);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
                JOptionPane.showMessageDialog(null, "Conexion fallida");
            }
        }

        return con;
    }

  
}