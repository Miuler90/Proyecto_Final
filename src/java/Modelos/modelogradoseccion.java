
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class modelogradoseccion {
      private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;
    
    public List<gradoseccion> obtenergradoseccion() throws Exception
    {
        List<gradoseccion> gradoseccion = new ArrayList<>();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM gradoseccion";
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                int idgradoseccion = rs.getInt("idgradoseccion");
                String nombregrado = rs.getString("nombregrado");
                String nombreseccion = rs.getString("nombreseccion");
                
                gradoseccion gradosecciontemporal = new gradoseccion(idgradoseccion,nombregrado,nombreseccion);
                gradoseccion.add(gradosecciontemporal);
            }
            con.close();
            st.close();
            rs.close();
            return gradoseccion;
        } 
        catch (Exception e)
        {
            throw e;
        }
    }
    
    public void registrargradoseccion(gradoseccion nuevogradoseccion) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "INSERT INTO gradoseccion (nombregrado,nombreseccion) VALUES('"+nuevogradoseccion.getNombregrado()+"','"+nuevogradoseccion.getNombreseccion()+"')";
            st.executeUpdate(sql);
            con.close();
            st.close();
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public gradoseccion cargargradoseccion(int idgradoseccion) throws Exception
    {
        gradoseccion gradoseccioncargado = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM gradoseccion WHERE idgradoseccion ='"+idgradoseccion+"'";
            rs = st.executeQuery(sql);
            if(rs.next())
            {
                String nombregrado = rs.getString("nombregrado");
                String nombreseccion = rs.getString("nombreseccion");
                
                gradoseccioncargado = new gradoseccion(idgradoseccion,nombregrado,nombreseccion);
            }
            con.close();
            st.close();
            rs.close();
            return gradoseccioncargado;
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void actualizargradoseccion(gradoseccion gradoseccionactualizado) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "UPDATE gradoseccion SET nombregrado='"+gradoseccionactualizado.getNombregrado()+"', nombreseccion='"+gradoseccionactualizado.getNombreseccion()+"' WHERE idgradoseccion='"+gradoseccionactualizado.getIdgradoseccion()+"'";
            st.executeUpdate(sql);
            con.close();
            st.close();
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void eliminargradoseccion(int idgradoseccion) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "DELETE FROM gradoseccion WHERE idgradoseccion='"+idgradoseccion+"'";
            st.executeUpdate(sql);
            con.close();
            st.close();
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
 
}
