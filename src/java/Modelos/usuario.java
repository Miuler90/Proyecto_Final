package Modelos;

public class usuario {

    private int idusuario;
    private String usuario_usuario;
    private String usuario_clave;
    private int tipoacceso;

    public usuario(int idusuario, String usuario_usuario, int tipoacceso) {
        this.idusuario = idusuario;
        this.usuario_usuario = usuario_usuario;
        this.tipoacceso = tipoacceso;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario_usuario() {
        return usuario_usuario;
    }

    public void setUsuario_usuario(String usuario_usuario) {
        this.usuario_usuario = usuario_usuario;
    }

    public String getUsuario_clave() {
        return usuario_clave;
    }

    public void setUsuario_clave(String usuario_clave) {
        this.usuario_clave = usuario_clave;
    }

    public int getTipoacceso() {
        return tipoacceso;
    }

    public void setTipoacceso(int tipoacceso) {
        this.tipoacceso = tipoacceso;
    }

}
