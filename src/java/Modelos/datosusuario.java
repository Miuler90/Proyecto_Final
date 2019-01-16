/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;


public class datosusuario {
   private int id_usuario;
   private String nombreusuario;
   private String apellidousuario;
   private String celusuario;
   private String correousuario;
   private String sexousuario;
   private String cargo;
   private String username;
   private String password;
   private int tipoacceso;


    public datosusuario(int id_usuario, String nombreusuario, String apellidousuario,
            String celusuario, String correousuario, String sexousuario, 
            String cargo, String username, String password, int tipoacceso) {
        this.id_usuario = id_usuario;
        this.nombreusuario = nombreusuario;
        this.apellidousuario = apellidousuario;
        this.celusuario = celusuario;
        this.correousuario = correousuario;
        this.sexousuario = sexousuario;
        this.cargo = cargo;
        this.username = username;
        this.password = password;
        this.tipoacceso = tipoacceso;
    }



       public datosusuario(String nombreusuario, String apellidousuario,
               String celusuario, String correousuario, String sexousuario, 
               String cargo, String username, String password, int tipoacceso) {
        this.nombreusuario = nombreusuario;
        this.apellidousuario = apellidousuario;
        this.celusuario = celusuario;
        this.correousuario = correousuario;
        this.sexousuario = sexousuario;
        this.cargo = cargo;
        this.username = username;
        this.password = password;
        this.tipoacceso = tipoacceso;
    }

    public datosusuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public datosusuario(int id_usuario, String nombreusuario, int tipoacceso) {
        this.id_usuario = id_usuario;
        this.nombreusuario = nombreusuario;
        this.tipoacceso = tipoacceso;
    }

    public int getTipoacceso() {
        return tipoacceso;
    }

    public void setTipoacceso(int tipoacceso) {
        this.tipoacceso = tipoacceso;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getApellidousuario() {
        return apellidousuario;
    }

    public void setApellidousuario(String apellidousuario) {
        this.apellidousuario = apellidousuario;
    }

    public String getCelusuario() {
        return celusuario;
    }

    public void setCelusuario(String celusuario) {
        this.celusuario = celusuario;
    }

    public String getCorreousuario() {
        return correousuario;
    }

    public void setCorreousuario(String correousuario) {
        this.correousuario = correousuario;
    }

    public String getSexousuario() {
        return sexousuario;
    }

    public void setSexousuario(String sexousuario) {
        this.sexousuario = sexousuario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
   
   
   
   
   
}
