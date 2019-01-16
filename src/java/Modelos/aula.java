
package Modelos;

public class aula {
    
private int idaula;
private String nombreaula;
private int capacidad;

    public aula(int idaula, String nombreaula, int capacidad) {
        this.idaula = idaula;
        this.nombreaula = nombreaula;
        this.capacidad = capacidad;
    }

    public aula(String nombreaula, int capacidad) {
        this.nombreaula = nombreaula;
        this.capacidad = capacidad;
    }

    public int getIdaula() {
        return idaula;
    }

    public void setIdaula(int idaula) {
        this.idaula = idaula;
    }

    public String getNombreaula() {
        return nombreaula;
    }

    public void setNombreaula(String nombreaula) {
        this.nombreaula = nombreaula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
  }
   