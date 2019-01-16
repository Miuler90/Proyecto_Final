
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class modeloaula {
    private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;
    
    public List<aula> obteneraula() throws Exception
    {
        List<aula> aula = new ArrayList<>();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM aula";
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                int idaula = rs.getInt("idaula");
                String nombreaula = rs.getString("nombreaula");
               int capacidad = rs.getInt("capacidad");
                
                aula aulatemporal = new aula(idaula, nombreaula,capacidad);
                aula.add(aulatemporal);
            }
            con.close();
            st.close();
            rs.close();
            return aula;
        } 
        catch (Exception e)
        {
            throw e;
        }
    }
    
    public void registraraula(aula nuevoaula) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "INSERT INTO aula (nombreaula,capacidad) VALUES('"+nuevoaula.getNombreaula()+"','"+nuevoaula.getCapacidad()+"')";
            st.executeUpdate(sql);
            con.close();
            st.close();
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public aula cargaraula(int idaula) throws Exception
    {
        aula aulacargado = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM aula WHERE idaula ='"+idaula+"'";
            rs = st.executeQuery(sql);
            if(rs.next())
            {  
                String nombreaula = rs.getString("nombreaula");
                int  capacidad = rs.getInt("capacidad");
                
                aulacargado = new aula(idaula, nombreaula,capacidad);
            }
            con.close();
            st.close();
            rs.close();
            return aulacargado;
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void actualizaraula(aula aulaactualizado) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "UPDATE aula SET nombreaula='"+aulaactualizado.getNombreaula()+"', capacidad='"+aulaactualizado.getCapacidad()+"' WHERE idaula='"+aulaactualizado.getIdaula()+"'";
            st.executeUpdate(sql);
            con.close();
            st.close();
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void eliminaraula(int idaula) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "DELETE FROM aula WHERE idaula='"+idaula+"'";
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
