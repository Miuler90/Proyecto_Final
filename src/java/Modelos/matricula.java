package Modelos;

import java.sql.Date;

public class matricula {

    int idmatricula;
    int id_usuario;
    int id_perioaula;
    int id_pagoapafa;
    Date fechamatricula;

    public matricula(int id_usuario, int id_perioaula, int id_pagoapafa) {
        this.id_usuario = id_usuario;
        this.id_perioaula = id_perioaula;
        this.id_pagoapafa = id_pagoapafa;
    }

    public matricula(int id_usuario, int id_perioaula, int id_pagoapafa, Date fechamatricula) {
        this.id_usuario = id_usuario;
        this.id_perioaula = id_perioaula;
        this.id_pagoapafa = id_pagoapafa;
        this.fechamatricula = fechamatricula;
    }

    
    
    public int getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(int idmatricula) {
        this.idmatricula = idmatricula;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_perioaula() {
        return id_perioaula;
    }

    public void setId_perioaula(int id_perioaula) {
        this.id_perioaula = id_perioaula;
    }

    public int getId_pagoapafa() {
        return id_pagoapafa;
    }

    public void setId_pagoapafa(int id_pagoapafa) {
        this.id_pagoapafa = id_pagoapafa;
    }

    public Date getFechamatricula() {
        return fechamatricula;
    }

    public void setFechamatricula(Date fechamatricula) {
        this.fechamatricula = fechamatricula;
    }
    
    
}
