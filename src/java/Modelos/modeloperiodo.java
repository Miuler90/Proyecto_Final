
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class modeloperiodo {
      private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;
    
    public List<periodo> obtenerperiodo() throws Exception
    {
        List<periodo> periodo = new ArrayList<>();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM periodo";
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                int idperiodo = rs.getInt("idperiodo");
                String nombreperiodo = rs.getString("nombreperiodo");

                periodo periodotemporal = new periodo(idperiodo,nombreperiodo);
                periodo.add(periodotemporal);
            }
            con.close();
            st.close();
            rs.close();
            return periodo;
        } 
        catch (Exception e)
        {
            throw e;
        }
    }
    
    public void registrarperiodo(periodo nuevoperiodo) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "INSERT INTO periodo (nombreperiodo) VALUES('"+nuevoperiodo.getNombreperiodo()+"')";
            st.executeUpdate(sql);
            con.close();
            st.close();
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    public periodo cargarperiodo(int idperiodo) throws Exception
    {
        periodo periodocargado = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM periodo WHERE idperiodo ='"+idperiodo+"'";
            rs = st.executeQuery(sql);
            if(rs.next())
            {
               
                String nombreperiodo = rs.getString("nombreperiodo");
               
                
                periodocargado = new periodo(idperiodo,nombreperiodo);
            }
            con.close();
            st.close();
            rs.close();
            return periodocargado;
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void actualizarperiodo(periodo periodoactualizado) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "UPDATE periodo SET nombreperiodo='"+periodoactualizado.getNombreperiodo()+"' WHERE idperiodo='"+periodoactualizado.getIdperiodo()+"'";
            st.executeUpdate(sql);
            con.close();
            st.close();
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void eliminarperiodo(int idperiodo) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "DELETE FROM periodo WHERE idperiodo='"+idperiodo+"'";
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
