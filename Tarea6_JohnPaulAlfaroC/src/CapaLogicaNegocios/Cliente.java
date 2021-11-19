/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogicaNegocios;

/**
 *
 * @author johnpaul
 */
public class Cliente {
    private String identificacion;
    private String nombre;

    public Cliente(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public Cliente() {
        this.identificacion="";
        this.nombre="";
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" + "identificacion=" + identificacion + ", nombre=" + nombre + '}';
    }
    
    
    
    
    
}
