
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class modeloalumno 
{
    
    private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;
    
    public List<alumno> obteneralumno() throws Exception
    {
        List<alumno> alumno = new ArrayList<>();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM alumno";
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                int idalumno = rs.getInt("idalumno");
                String dnialumno = rs.getString("dnialumno");
                String nombre = rs.getString("nombrealumno");
                String apellidopaterno = rs.getString("apellidopaterno");
                String apellidomaterno = rs.getString("apellidomaterno");
                String fechanac = rs.getString("fechanac");
                int edad = rs.getInt("edad");
                String direccion = rs.getString("direccion");
                String cel = rs.getString("cel");
                String correo = rs.getString("correo");
                String sexo = rs.getString("sexo");
                String observaciones = rs.getString("observaciones");
                String religion = rs.getString("religion");
                String fechareg = rs.getString("fechareg");
                
                alumno alumnotemporal = new alumno(idalumno, dnialumno,nombre,apellidopaterno,apellidomaterno,fechanac,edad,direccion,cel,correo,sexo,observaciones,religion,fechareg);
                alumno.add(alumnotemporal);
            }
            con.close();
            st.close();
            rs.close();
            return alumno;
        } 
        catch (Exception e)
        {
            throw e;
        }
    }
    
    public void registraralumno(alumno nuevoalumno) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "INSERT INTO alumno (dnialumno,nombrealumno,apellidopaterno,apellidomaterno,fechanac,edad,direccion,cel,correo,sexo,observaciones,religion,fechareg) VALUES('"+nuevoalumno.getDnialumno()+"','"+nuevoalumno.getNombre()+"','"+nuevoalumno.getApellidopaterno()+"','"+nuevoalumno.getApellidomaterno()+"','"+nuevoalumno.getFechanac()+"','"+nuevoalumno.getEdad()+"','"+nuevoalumno.getDireccion()+"','"+nuevoalumno.getCel()+"','"+nuevoalumno.getCorreo()+"','"+nuevoalumno.getSexo()+"','"+nuevoalumno.getObservaciones()+"','"+nuevoalumno.getReligion()+"','"+nuevoalumno.getFechareg()+"')";
            st.executeUpdate(sql);
            con.close();
            st.close();
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public alumno cargaralumno(int idalumno) throws Exception
    {
        alumno alumnocargado = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM alumno WHERE idalumno ='"+idalumno+"'";
            rs = st.executeQuery(sql);
            if(rs.next())
            {
                String dnialumno = rs.getString("dnialumno");
                String nombre = rs.getString("nombrealumno");
                String apellidopaterno = rs.getString("apellidopaterno");
                String apellidomaterno = rs.getString("apellidomaterno");
                String fechanac = rs.getString("fechanac");
                int edad = rs.getInt("edad");
                String direccion = rs.getString("direccion");
                String cel = rs.getString("cel");
                String correo = rs.getString("correo");
                String sexo = rs.getString("sexo");
                String observaciones = rs.getString("observaciones");
                String religion = rs.getString("religion");
                String fechareg = rs.getString("fechareg");
                
                alumnocargado = new alumno(idalumno,dnialumno,nombre,apellidopaterno,apellidomaterno,fechanac,edad,direccion,cel,correo,sexo,observaciones,religion,fechareg);
            }
            con.close();
            st.close();
            rs.close();
            return alumnocargado;
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void actualizaralumno(alumno alumnoactualizado) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "UPDATE alumno SET dnialumno='"+alumnoactualizado.getDnialumno()+"', nombrealumno='"+alumnoactualizado.getNombre()+"', apellidopaterno='"+alumnoactualizado.getApellidopaterno()+"', apellidomaterno='"+alumnoactualizado.getApellidomaterno()+"', fechanac='"+alumnoactualizado.getFechanac()+"', edad='"+alumnoactualizado.getEdad()+"', direccion='"+alumnoactualizado.getDireccion()+"', cel='"+alumnoactualizado.getCel()+"', correo='"+alumnoactualizado.getCorreo()+"', sexo='"+alumnoactualizado.getSexo()+"', observaciones='"+alumnoactualizado.getCorreo()+"', religion='"+alumnoactualizado.getCorreo()+"', fechareg='"+alumnoactualizado.getFechareg()+"' WHERE idalumno='"+alumnoactualizado.getIdalumno()+"'";
            st.executeUpdate(sql);
            con.close();
            st.close();
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void eliminaralumno(int id) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "DELETE FROM alumno WHERE idalumno='"+id+"'";
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
