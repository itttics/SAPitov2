/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sap.contabilidad.clases;

/**
 *
 * @author fgb
 */
public class CuentaCliente {
    int id;
    String clave;
    String nombre;
    String cuentaempresa;  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuentaempresa() {
        return cuentaempresa;
    }

    public void setCuentaempresa(String cuentaempresa) {
        this.cuentaempresa = cuentaempresa;
    }
    
}
