
package Modelos;


public class apoderado {
 private int idapoderado;
   private String dniapoderado;
   private String nombres;
   private String apellidopaterno;
   private String apellidomaterno;
   private String fechacapoderado;
   private int edad;
   private String direccion;
   private String ocupacion;
   private String cel;
   private String correo;
   private String sexo;

    public apoderado(int idapoderado, String dniapoderado, String nombres, String apellidopaterno, String apellidomaterno, String fechacapoderado, int edad, String direccion, String ocupacion, String cel, String correo, String sexo) {
        this.idapoderado = idapoderado;
        this.dniapoderado = dniapoderado;
        this.nombres = nombres;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.fechacapoderado = fechacapoderado;
        this.edad = edad;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.cel = cel;
        this.correo = correo;
        this.sexo = sexo;
    }

    public apoderado(String dniapoderado, String nombres, String apellidopaterno, String apellidomaterno, String fechacapoderado, int edad, String direccion, String ocupacion, String cel, String correo, String sexo) {
        this.dniapoderado = dniapoderado;
        this.nombres = nombres;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.fechacapoderado = fechacapoderado;
        this.edad = edad;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
        this.cel = cel;
        this.correo = correo;
        this.sexo = sexo;
    }

    public int getIdapoderado() {
        return idapoderado;
    }

    public void setIdapoderado(int idapoderado) {
        this.idapoderado = idapoderado;
    }

    public String getDniapoderado() {
        return dniapoderado;
    }

    public void setDniapoderado(String dniapoderado) {
        this.dniapoderado = dniapoderado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getFechacapoderado() {
        return fechacapoderado;
    }

    public void setFechacapoderado(String fechacapoderado) {
        this.fechacapoderado = fechacapoderado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
   
    
}
