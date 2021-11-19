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
public class TipoAvion {
    private String codAvion;
    private int capacidadPasajeros;

    public TipoAvion(String codAvion, int capacidadPasajeros) {
        this.codAvion = codAvion;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public String toString() {
        return "TipoAvion{" + "codAvion=" + codAvion + ", capacidadPasajeros=" + capacidadPasajeros + '}';
    }

    public String getCodAvion() {
        return codAvion;
    }
    public void setCodAvion(String codAvion) {
        this.codAvion = codAvion;
    }
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }
    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }
    
    
    
}
