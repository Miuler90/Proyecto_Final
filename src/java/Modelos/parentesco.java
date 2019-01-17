
package Modelos;

public class parentesco 
{
    private int idparentesco;
    private int id_alumno;
    private int id_apoderado2;
    private String tipo;

    public parentesco(int idparentesco, int id_alumno, int id_apoderado2, String tipo) {
        this.idparentesco = idparentesco;
        this.id_alumno = id_alumno;
        this.id_apoderado2 = id_apoderado2;
        this.tipo = tipo;
    }

    public parentesco(int id_alumno, int id_apoderado2, String tipo) {
        this.id_alumno = id_alumno;
        this.id_apoderado2 = id_apoderado2;
        this.tipo = tipo;
    }

    public int getIdparentesco() {
        return idparentesco;
    }

    public void setIdparentesco(int idparentesco) {
        this.idparentesco = idparentesco;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public int getId_apoderado2() {
        return id_apoderado2;
    }

    public void setId_apoderado2(int id_apoderado2) {
        this.id_apoderado2 = id_apoderado2;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
