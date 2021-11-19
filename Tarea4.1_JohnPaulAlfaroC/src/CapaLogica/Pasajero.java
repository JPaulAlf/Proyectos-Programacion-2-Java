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
public class Pasajero {
    private String numPasaporte;
    private String nombre;
    private double valorPasaje;

    public Pasajero(String numPasaporte, String nombre, double valorPasaje) {
        this.numPasaporte = numPasaporte;
        this.nombre = nombre;
        this.valorPasaje = valorPasaje;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "numPasaporte=" + numPasaporte + ", nombre=" + nombre + ", valorPasaje=" + valorPasaje + '}';
    }

    
    public String getNumPasaporte() {
        return numPasaporte;
    }
    public void setNumPasaporte(String numPasaporte) {
        this.numPasaporte = numPasaporte;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getValorPasaje() {
        return valorPasaje;
    }
    public void setValorPasaje(double valorPasaje) {
        this.valorPasaje = valorPasaje;
    }
    
    
}
