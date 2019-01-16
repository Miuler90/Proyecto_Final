/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kattia
 */
public class modelodatosusuario {
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
    
    public List<datosusuario> obtenerdatosusuario() throws Exception
    {
        List<datosusuario> datosusuario = new ArrayList<>();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM usuario";
            rs = st.executeQuery(sql);
            while(rs.next())
            {

               int id_usuario = rs.getInt("id_usuario");
                String nombre = rs.getString("nombreusuario");
                String apellidousuario = rs.getString("apellidousuario");
                String celusuario = rs.getString("celusuario");
                String correousuario = rs.getString("correousuario");
                String sexousuario = rs.getString("sexousuario");
                String cargo = rs.getString("cargo");
                String username = rs.getString("username");
                String password = rs.getString("password");
              int tipoacceso = rs.getInt("tipoacceso");
              
               datosusuario datosusuariotemporal = new datosusuario(id_usuario,nombre,apellidousuario,
                       celusuario,correousuario,sexousuario,cargo,username,password,tipoacceso);
                datosusuario.add(datosusuariotemporal);
            }
            con.close();
            st.close();
            rs.close();
            return datosusuario;
        } 
        catch (Exception e)
        {
            throw e;
        }
    }
    
    public void registrardatosusuario(datosusuario nuevodatosusuario) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "INSERT INTO usuario (id_usuario,nombreusuario,apellidousuario,celusuario,"
                    + "correousuario,sexousuario,cargo,username,password,tipoacceso) "
                    + "VALUES('"+nuevodatosusuario.getId_usuario()+"','"+nuevodatosusuario.getNombreusuario()
                    +"','"+nuevodatosusuario.getApellidousuario()+"','"+nuevodatosusuario.getCelusuario()
                    +"','"+nuevodatosusuario.getCorreousuario()+"','"+nuevodatosusuario.getSexousuario()
                    +"','"+nuevodatosusuario.getCargo()+"','"+nuevodatosusuario.getUsername()
                    +"','"+ nuevodatosusuario.getPassword()+"','"+ nuevodatosusuario.getTipoacceso()+"')";
            st.executeUpdate(sql);
            con.close();
            st.close();
        } 
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public datosusuario cargardatosusuario(int id_datosusuario) throws Exception
    {
       datosusuario datosusuariocargado = null;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "SELECT * FROM usuario WHERE id_usuario ='"+id_datosusuario+"'";
            rs = st.executeQuery(sql);
            if(rs.next())
            {
                int id_usuario = rs.getInt("id_usuario");
                String nombre = rs.getString("nombreusuario");
                String apellidousuario = rs.getString("apellidousuario");
                String celusuario = rs.getString("celusuario");
                String correousuario = rs.getString("correousuario");
                String sexousuario = rs.getString("sexousuario");
                String cargo = rs.getString("cargo");
                String username = rs.getString("username");
                String password = rs.getString("password");
                int tipoacceso = rs.getInt("tipoacceso");
                datosusuariocargado = new datosusuario(id_usuario,nombre,apellidousuario,
                        celusuario,correousuario,sexousuario,cargo,username,password,tipoacceso);
            }
            con.close();
            st.close();
            rs.close();
            return datosusuariocargado;
        }
        catch (Exception e) 
        {
            throw e;
        }
    }
    
    public void actualizardatosusuario(datosusuario datosusuarioactualizado) throws Exception
    {
        try 
        {

            Class.forName("com.mysql.jdbc.Driver");
            st = con.createStatement();            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");

            String sql = "UPDATE usuario SET nombreusuario='"+datosusuarioactualizado.getNombreusuario()
                    +"', apellidousuario='"+datosusuarioactualizado.getApellidousuario()
                    +"', celusuario='"+datosusuarioactualizado.getCelusuario()
                    +"', correousuario='"+datosusuarioactualizado.getCorreousuario()
                    +"', sexousuario='"+datosusuarioactualizado.getSexousuario()
                    +"', cargo='"+datosusuarioactualizado.getCargo()+"', username='"
                    +datosusuarioactualizado.getUsername()
                    +"', password='"+datosusuarioactualizado.getPassword()
                    +"' WHERE id_usuario='"+datosusuarioactualizado.getId_usuario()+"'";
            st.executeUpdate(sql);
            con.close();
            st.close();
        }
        catch (ClassNotFoundException | SQLException e) 
        {
            throw e;
        }
    }
    
    public void eliminardatosusuario(int id_datosusuario) throws Exception
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_colegio_aplicacion","root","");
            st = con.createStatement();
            String sql = "DELETE FROM usuario WHERE id_usuario='"+id_datosusuario+"'";
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
