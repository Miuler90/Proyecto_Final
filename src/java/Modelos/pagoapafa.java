
package Modelos;

public class pagoapafa {
   private int idpagoapafa;
   private int id_parentesco;
   private int id_periodo;
   private String nrorecibo ;
   private String fechapago;
   private double monto;

    public pagoapafa(int idpagoapafa, int id_parentesco, int id_periodo, String nrorecibo, String fechapago, double monto) {
        this.idpagoapafa = idpagoapafa;
        this.id_parentesco = id_parentesco;
        this.id_periodo = id_periodo;
        this.nrorecibo = nrorecibo;
        this.fechapago = fechapago;
        this.monto = monto;
    }

    public pagoapafa(int id_parentesco, int id_periodo, String nrorecibo, String fechapago, double monto) {
        this.id_parentesco = id_parentesco;
        this.id_periodo = id_periodo;
        this.nrorecibo = nrorecibo;
        this.fechapago = fechapago;
        this.monto = monto;
    }


    public int getId_periodo() {
        return id_periodo;
    }

    public void setId_periodo(int id_periodo) {
        this.id_periodo = id_periodo;
    }


    

    public int getId_parentesco() {
        return id_parentesco;
    }

    public void setId_parentesco(int id_parentesco) {
        this.id_parentesco = id_parentesco;
    }
    
    

    public int getIdpagoapafa() {
        return idpagoapafa;
    }

    public void setIdpagoapafa(int idpagoapafa) {
        this.idpagoapafa = idpagoapafa;
    }

    public String getNrorecibo() {
        return nrorecibo;
    }

    public void setNrorecibo(String nrorecibo) {
        this.nrorecibo = nrorecibo;
    }

    public String getFechapago() {
        return fechapago;
    }

    public void setFechapago(String fechapago) {
        this.fechapago = fechapago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
   

}
