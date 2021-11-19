/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

/**
 *
 * @author johnpaul
 */
public class Ciudad {
    private String codCiudad;
    private String nombre;

    public Ciudad(String codCiudad, String nombre) {
        this.codCiudad = codCiudad;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "codCiudad=" + codCiudad + ", nombre=" + nombre + '}';
    }

    
    public String getCodCiudad() {
        return codCiudad;
    }
    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
