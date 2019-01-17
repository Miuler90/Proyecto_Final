
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class modeloparentesco 
{
      private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;
    
    public List<parentesco> obtenerparentesco() throws Exception
    {
        List<parentesco> parentesco = new ArrayList<>();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM parentesco";
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                int idparentesco = rs.getInt("idparentesco");
                int id_alumno = rs.getInt("id_alumno");
                int id_apoderado2 = rs.getInt("id_apoderado2");
                String tipo = rs.getString("tipo");
                
                
                parentesco parentescotemporal = new parentesco(idparentesco, id_alumno,id_apoderado2,tipo);
                parentesco.add(parentescotemporal);
            }
            con.close();
            st.close();
            rs.close();
            return parentesco;
        } 
        catch (Exception e)
        {
            throw e;
        }
    }
    
    public void registrarparentesco(parentesco nuevoparentesco) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "INSERT INTO parentesco (id_alumno,id_apoderado2,tipo) VALUES('"+nuevoparentesco.getId_alumno()+"','"+nuevoparentesco.getId_apoderado2()+"','"+nuevoparentesco.getTipo()+"')";
            st.executeUpdate(sql);
            con.close();
            st.close();
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public parentesco cargarparentesco(int idparentesco) throws Exception
    {
        parentesco parentescocargado = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM parentesco WHERE idparentesco ='"+idparentesco+"'";
            rs = st.executeQuery(sql);
            if(rs.next())
            {
                int id_alumno = rs.getInt("id_alumno");
                int id_apoderado2 = rs.getInt("id_apoderado2");
                String tipo = rs.getString("tipo");
                
                parentescocargado = new parentesco(idparentesco, id_alumno,id_apoderado2,tipo);
            }
            con.close();
            st.close();
            rs.close();
            return parentescocargado;
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void actualizarparentesco(parentesco parentescoactualizado) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "UPDATE parentesco SET id_alumno='"+parentescoactualizado.getId_alumno()+"', id_aporado2='"+parentescoactualizado.getId_apoderado2()+"', tipo='"+parentescoactualizado.getTipo()+"' WHERE idparentesco='"+parentescoactualizado.getIdparentesco()+"'";
            st.executeUpdate(sql);
            con.close();
            st.close();
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void eliminarparentesco(int id) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "DELETE FROM parentesco WHERE idparentesco='"+id+"'";
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
