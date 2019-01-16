
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class modelocurso {
     private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;
    
    public List<curso> obtenercurso() throws Exception
    {
        List<curso> curso = new ArrayList<>();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM curso";
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                int idcurso = rs.getInt("idcurso");
                int idprofesor = rs.getInt("id_profesor");
                String nombrecurso = rs.getString("nombrecurso");
                
                curso cursotemporal = new curso(idprofesor,nombrecurso);
                curso.add(cursotemporal);
            }
            con.close();
            st.close();
            rs.close();
            return curso;
        } 
        catch (Exception e)
        {
            throw e;
        }
    }
    
    public void registrarcurso(curso nuevocurso) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "INSERT INTO curso (id_profesor,nombrecurso) VALUES('"+nuevocurso.getId_profesor()+"','"+nuevocurso.getNombrecurso()+"')";
            st.executeUpdate(sql);
            con.close();
            st.close();
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public curso cargarcurso(int idcurso) throws Exception
    {
        curso cursocargado = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM curso WHERE idcurso ='"+idcurso+"'";
            rs = st.executeQuery(sql);
            if(rs.next())
            {
                int idprofesor = rs.getInt("id_profesor");
                String nombrecurso = rs.getString("nombrecurso");
                
                cursocargado = new curso(idprofesor,nombrecurso);
            }
            con.close();
            st.close();
            rs.close();
            return cursocargado;
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void actualizarcurso(curso cursoactualizado) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "UPDATE curso SET id_profesor='"+cursoactualizado.getId_profesor()+"', nombrecurso='"+cursoactualizado.getNombrecurso()+"' WHERE idcurso='"+cursoactualizado.getIdcurso()+"'";
            st.executeUpdate(sql);
            con.close();
            st.close();
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void eliminarcurso(int idcurso) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "DELETE FROM curso WHERE idcurso='"+idcurso+"'";
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
