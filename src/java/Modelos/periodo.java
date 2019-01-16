
package Modelos;

public class periodo {
    private int idperiodo;
private String nombreperiodo;

    public periodo(int idperiodo, String nombreperiodo) {
        this.idperiodo = idperiodo;
        this.nombreperiodo = nombreperiodo;
    }

    public periodo(String nombreperiodo) {
        this.nombreperiodo = nombreperiodo;
    }

    public int getIdperiodo() {
        return idperiodo;
    }

    public void setIdperiodo(int idperiodo) {
        this.idperiodo = idperiodo;
    }

    public String getNombreperiodo() {
        return nombreperiodo;
    }

    public void setNombreperiodo(String nombreperiodo) {
        this.nombreperiodo = nombreperiodo;
    }

  
}
