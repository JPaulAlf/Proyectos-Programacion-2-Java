/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaLogica;

/**
 *
 * @author johnpaul
 */
public class Ciudad {
    String codigo;
    String nombre;
    Zona zona;

    public Ciudad(String codigo, String nombre, Zona zona) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "codigo: " + codigo + ", nombre: " + nombre + ", zona: " + zona + '}';
    }
    
    
     public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Zona getZona() {
        return zona;
    }
    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
    
}
