
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class modeloprofesor {
     private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;
    
    public List<profesor> obtenerprofesor() throws Exception
    {
        List<profesor> profesor = new ArrayList<>();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM profesor";
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                int idprofesor = rs.getInt("idprofesor");
                String dniprofesor = rs.getString("dniprofesor");
                String nombreprofesor = rs.getString("nombreprofesor");
                String apellidoprofesor = rs.getString("apellidoprofesor");
                int edad = rs.getInt("edad");
                String sexo = rs.getString("sexo");
                String estadocivil = rs.getString("estadocivil");
                String direccion = rs.getString("direccion");
                 String telef = rs.getString("telef");
                String cel = rs.getString("cel");
                String especialidad = rs.getString("especialidad");
                
                profesor profesortemporal = new profesor(idprofesor, dniprofesor,nombreprofesor,apellidoprofesor,edad,sexo,estadocivil,direccion,telef,cel,especialidad);
                profesor.add(profesortemporal);
            }
            con.close();
            st.close();
            rs.close();
            return profesor;
        } 
        catch (Exception e)
        {
            throw e;
        }
    }
    
    public void registrarprofesor(profesor nuevoprofesor) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "INSERT INTO profesor(dniprofesor,nombreprofesor,apellidoprofesor,edad,sexo,estadocivil,direccion,telef,cel,especialidad) VALUES('"+nuevoprofesor.getDniprofesor()+"','"+nuevoprofesor.getNombreprofesor()+"','"+nuevoprofesor.getApellidoprofesor()+"','"+nuevoprofesor.getEdad()+"','"+nuevoprofesor.getSexo()+"','"+nuevoprofesor.getEstadocivil()+"','"+nuevoprofesor.getDireccion()+"','"+nuevoprofesor.getTelef()+"','"+nuevoprofesor.getCel()+"','"+nuevoprofesor.getEspecialidad()+"')";
            st.executeUpdate(sql);
            con.close();
            st.close();
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public profesor cargarprofesor(int idprofesor) throws Exception
    {
        profesor profesorcargado = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM profesor WHERE idprofesor ='"+idprofesor+"'";
            rs = st.executeQuery(sql);
            if(rs.next())
            {
               String dniprofesor = rs.getString("dniprofesor");
                String nombreprofesor = rs.getString("nombreprofesor");
                String apellidoprofesor = rs.getString("apellidoprofesor");
                int edad = rs.getInt("edad");
                String sexo = rs.getString("sexo");
                String estadocivil = rs.getString("estadocivil");
                String direccion = rs.getString("direccion");
                 String telef = rs.getString("telef");
                String cel = rs.getString("cel");
                String especialidad = rs.getString("especialidad");
                
                profesorcargado= new profesor(idprofesor,dniprofesor,nombreprofesor,apellidoprofesor,edad,sexo,estadocivil,direccion,telef,cel,especialidad);
            }
            con.close();
            st.close();
            rs.close();
            return profesorcargado;
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void actualizarprofesor(profesor profesoractualizado) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "UPDATE profesor SET dniprofesor='"+profesoractualizado.getDniprofesor()+"', nombreprofesor='"+profesoractualizado.getNombreprofesor()+"', apellidoprofesor='"+profesoractualizado.getApellidoprofesor()+"', edad='"+profesoractualizado.getEdad()+"', sexo='"+profesoractualizado.getSexo()+"', estadocivil='"+profesoractualizado.getEstadocivil()+"', direccion='"+ profesoractualizado.getDireccion()+"', telef='"+profesoractualizado.getTelef()+"', cel='"+profesoractualizado.getCel()+"', especialidad='"+profesoractualizado.getEspecialidad()+"' WHERE idprofesor='"+profesoractualizado.getIdprofesor()+"'";
            st.executeUpdate(sql);
            con.close();
            st.close();
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void eliminarprofesor(int idprofesor) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "DELETE FROM profesor WHERE idprofesor='"+idprofesor+"'";
            st.executeUpdate(sql);
            con.close();
            st.close();
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
//    
//    public List<mascota> buscarMascota(String buscar) throws Exception
//    {
//        List<mascota> busqueda = new ArrayList<>();
//        try
//        {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/veterinaria", "root","");
//            st = con.createStatement();
//            String sql = "SELECT m.* FROM personas p INNER JOIN mascotas m ON p.codper = m.codpers WHERE p.dni = '"+ buscar +"' ";
//            rs = st.executeQuery(sql);
//            while(rs.next())
//            {
//                int codpers = rs.getInt("codpers");
//                String nombre = rs.getString("nombre");
//                String fechanac = rs.getString("fechanac");
//                String genero = rs.getString("genero");
//                String raza = rs.getString("raza");
//                String observaciones = rs.getString("observaciones");
//                String fechareg = rs.getString("fechareg");
//                mascota busquedatemporal = new mascota (codpers,nombre,fechanac,genero,raza,observaciones,fechareg);
//                busqueda.add(busquedatemporal);
//            }
//            con.close();
//            st.close();
//            rs.close();
//            return busqueda;
//        }
//        catch (Exception e)
//        {
//            throw e;
//        }
//    }   
}
