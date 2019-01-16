
package Modelos;
   public class curso {
   private int idcurso;
   private int id_profesor;
   private String nombrecurso;

    public curso(int idcurso, int id_profesor, String nombrecurso) {
        this.idcurso = idcurso;
        this.id_profesor = id_profesor;
        this.nombrecurso = nombrecurso;
    }

    public curso(int id_profesor, String nombrecurso) {
        this.id_profesor = id_profesor;
        this.nombrecurso = nombrecurso;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

   
}
