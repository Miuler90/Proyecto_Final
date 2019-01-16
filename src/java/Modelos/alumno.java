
package Modelos;

public class alumno 
{
   private int idalumno;
   private String dnialumno;
   private String nombre;
   private String apellidopaterno;
   private String apellidomaterno;
   private String fechanac;
   private int edad;
   private String direccion;
   private String cel;
   private String correo;
   private String sexo;
   private String observaciones;
   private String religion;
   private String fechareg;

    public alumno(int idalumno, String dnialumno, String nombre, String apellidopaterno, String apellidomaterno, String fechanac, int edad, String direccion, String cel, String correo, String sexo, String observaciones, String religion, String fechareg) {
        this.idalumno = idalumno;
        this.dnialumno = dnialumno;
        this.nombre = nombre;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.fechanac = fechanac;
        this.edad = edad;
        this.direccion = direccion;
        this.cel = cel;
        this.correo = correo;
        this.sexo = sexo;
        this.observaciones = observaciones;
        this.religion = religion;
        this.fechareg = fechareg;
    }

    public alumno(String dnialumno, String nombre, String apellidopaterno, String apellidomaterno, String fechanac, int edad, String direccion, String cel, String correo, String sexo, String observaciones, String religion, String fechareg) {
        this.dnialumno = dnialumno;
        this.nombre = nombre;
        this.apellidopaterno = apellidopaterno;
        this.apellidomaterno = apellidomaterno;
        this.fechanac = fechanac;
        this.edad = edad;
        this.direccion = direccion;
        this.cel = cel;
        this.correo = correo;
        this.sexo = sexo;
        this.observaciones = observaciones;
        this.religion = religion;
        this.fechareg = fechareg;
    }

    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
    }

    public String getDnialumno() {
        return dnialumno;
    }

    public void setDnialumno(String dnialumno) {
        this.dnialumno = dnialumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getFechareg() {
        return fechareg;
    }

    public void setFechareg(String fechareg) {
        this.fechareg = fechareg;
    }

   
}
