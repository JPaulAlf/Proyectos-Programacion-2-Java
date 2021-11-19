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
public class Piloto {
    private String nombre;
    private int salarioXhora;

    public Piloto(String nombre, int salarioXhora) {
        this.nombre = nombre;
        this.salarioXhora = salarioXhora;
    }

    @Override
    public String toString() {
        return "Piloto{" + "nombre=" + nombre + ", salarioXhora=" + salarioXhora + '}';
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getSalarioXhora() {
        return salarioXhora;
    }
    public void setSalarioXhora(int salarioXhora) {
        this.salarioXhora = salarioXhora;
    }
    
    
    
}
