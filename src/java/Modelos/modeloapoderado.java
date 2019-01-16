
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class modeloapoderado {
 private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;
    
    public List<apoderado> obtenerapoderado() throws Exception
    {
        List<apoderado> apoderado= new ArrayList<>();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM apoderado";
            rs = st.executeQuery(sql);
            while(rs.next())
            {
                int idapoderado = rs.getInt("idapoderado");
                String dniapoderado = rs.getString("dniapoderado");
                String nombres = rs.getString("nombres");
                String apellidopaterno = rs.getString("apellidopaterno");
                String apellidomaterno = rs.getString("apellidomaterno");
                String fechacapoderado = rs.getString("fechacapoderado");
                int edad = rs.getInt("edad");
                String direccion = rs.getString("direccion");
                String ocupacion = rs.getString("ocupacion");
                String cel = rs.getString("cel");
                String correo = rs.getString("correo");
                String sexo = rs.getString("sexo");
               
                
                apoderado apoderadotemporal = new apoderado(idapoderado,dniapoderado,nombres,apellidopaterno,apellidomaterno,fechacapoderado,edad,direccion,ocupacion,cel,correo,sexo);
                apoderado.add(apoderadotemporal);
            }
            con.close();
            st.close();
            rs.close();
            return apoderado;
        } 
        catch (Exception e)
        {
            throw e;
        }
    }
    
    public void registrarapoderado(apoderado nuevoapoderado) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "INSERT INTO apoderado (dniapoderado,nombres,apellidopaterno,apellidomaterno,fechacapoderado,edad,direccion,ocupacion,cel,correo,sexo) VALUES('"+nuevoapoderado.getDniapoderado()+"','"+nuevoapoderado.getNombres()+"','"+nuevoapoderado.getApellidopaterno()+"','"+nuevoapoderado.getApellidomaterno()+"','"+nuevoapoderado.getFechacapoderado()+"','"+nuevoapoderado.getEdad()+"','"+nuevoapoderado.getDireccion()+"','"+nuevoapoderado.getOcupacion()+"','"+nuevoapoderado.getCel()+"','"+nuevoapoderado.getCorreo()+"','"+nuevoapoderado.getSexo()+"')";
            st.executeUpdate(sql);
            con.close();
            st.close();
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public apoderado cargarapoderado(int idapoderado) throws Exception
    {
        apoderado apoderadocargado = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM apoderado WHERE idapoderado ='"+idapoderado+"'";
            rs = st.executeQuery(sql);
            if(rs.next())
            {
                String dniapoderado = rs.getString("dniapoderado");
                String nombres = rs.getString("nombres");
                String apellidopaterno = rs.getString("apellidopaterno");
                String apellidomaterno = rs.getString("apellidomaterno");
                String fechacapoderado = rs.getString("fechacapoderado");
                int edad = rs.getInt("edad");
                String direccion = rs.getString("direccion");
                String ocupacion = rs.getString("ocupacion");
                String cel = rs.getString("cel");
                String correo = rs.getString("correo");
                String sexo = rs.getString("sexo");
               
                
                 apoderadocargado = new apoderado(idapoderado, dniapoderado,nombres,apellidopaterno,apellidomaterno,fechacapoderado,edad,direccion,ocupacion,cel,correo,sexo);

            }
            con.close();
            st.close();
            rs.close();
            return apoderadocargado;
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void actualizarapoderado(apoderado apoderadoactualizado) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "UPDATE apoderado SET dniapoderado='"+apoderadoactualizado.getDniapoderado()+"', nombres='"+apoderadoactualizado.getNombres()+"', apellidopaterno='"+apoderadoactualizado.getApellidopaterno()+"', apellidomaterno='"+apoderadoactualizado.getApellidomaterno()+"', fechacapoderado='"+apoderadoactualizado.getFechacapoderado()+"', edad='"+apoderadoactualizado.getEdad()+"', direccion='"+apoderadoactualizado.getDireccion()+"',ocupacion='"+apoderadoactualizado.getOcupacion()+"', cel='"+apoderadoactualizado.getCel()+"', correo='"+apoderadoactualizado.getCorreo()+"', sexo='"+apoderadoactualizado.getSexo()+"' WHERE idapoderado='"+apoderadoactualizado.getIdapoderado()+"'";
            st.executeUpdate(sql);
            con.close();
            st.close();
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void eliminarapoderado(int idapoderado) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "DELETE FROM apoderado WHERE idapoderado='"+idapoderado+"'";
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
