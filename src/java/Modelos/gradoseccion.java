
package Modelos;

public class gradoseccion {
    private int idgradoseccion;
    private String nombregrado;
   private String nombreseccion;

    public gradoseccion(int idgradoseccion, String nombregrado, String nombreseccion) {
        this.idgradoseccion = idgradoseccion;
        this.nombregrado = nombregrado;
        this.nombreseccion = nombreseccion;
    }

    public gradoseccion(String nombregrado, String nombreseccion) {
        this.nombregrado = nombregrado;
        this.nombreseccion = nombreseccion;
    }

    public int getIdgradoseccion() {
        return idgradoseccion;
    }

    public void setIdgradoseccion(int idgradoseccion) {
        this.idgradoseccion = idgradoseccion;
    }

    public String getNombregrado() {
        return nombregrado;
    }

    public void setNombregrado(String nombregrado) {
        this.nombregrado = nombregrado;
    }

    public String getNombreseccion() {
        return nombreseccion;
    }

    public void setNombreseccion(String nombreseccion) {
        this.nombreseccion = nombreseccion;
    }
   
    

}
    