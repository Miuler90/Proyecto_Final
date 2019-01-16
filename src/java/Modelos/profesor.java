
package Modelos;


public class profesor {
     private int idprofesor;
   private String dniprofesor;
   private String nombreprofesor;
   private String apellidoprofesor;
   private int edad;
   private String sexo;
   private String estadocivil;
   private String direccion;
   private String telef;
   private String cel;
   private String especialidad;

    public profesor(int idprofesor, String dniprofesor, String nombreprofesor, String apellidoprofesor, int edad, String sexo, String estadocivil, String direccion, String telef, String cel, String especialidad) {
        this.idprofesor = idprofesor;
        this.dniprofesor = dniprofesor;
        this.nombreprofesor = nombreprofesor;
        this.apellidoprofesor = apellidoprofesor;
        this.edad = edad;
        this.sexo = sexo;
        this.estadocivil = estadocivil;
        this.direccion = direccion;
        this.telef = telef;
        this.cel = cel;
        this.especialidad = especialidad;
    }

    public profesor(String dniprofesor, String nombreprofesor, String apellidoprofesor, int edad, String sexo, String estadocivil, String direccion, String telef, String cel, String especialidad) {
        this.dniprofesor = dniprofesor;
        this.nombreprofesor = nombreprofesor;
        this.apellidoprofesor = apellidoprofesor;
        this.edad = edad;
        this.sexo = sexo;
        this.estadocivil = estadocivil;
        this.direccion = direccion;
        this.telef = telef;
        this.cel = cel;
        this.especialidad = especialidad;
    }

    public int getIdprofesor() {
        return idprofesor;
    }

    public void setIdprofesor(int idprofesor) {
        this.idprofesor = idprofesor;
    }

    public String getDniprofesor() {
        return dniprofesor;
    }

    public void setDniprofesor(String dniprofesor) {
        this.dniprofesor = dniprofesor;
    }

    public String getNombreprofesor() {
        return nombreprofesor;
    }

    public void setNombreprofesor(String nombreprofesor) {
        this.nombreprofesor = nombreprofesor;
    }

    public String getApellidoprofesor() {
        return apellidoprofesor;
    }

    public void setApellidoprofesor(String apellidoprofesor) {
        this.apellidoprofesor = apellidoprofesor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
   

}
