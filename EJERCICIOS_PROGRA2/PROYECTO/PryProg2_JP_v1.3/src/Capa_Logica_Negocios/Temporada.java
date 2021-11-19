/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

/**
 *
 * @author Estudiante
 */
public class Temporada {
    private int numTemporada;
    private int cantCapitulos;

    public Temporada(int numTemporada, int cantCapitulos) {
        this.numTemporada = numTemporada;
        this.cantCapitulos = cantCapitulos;
    }

    public int getNumTemporada() {
        return numTemporada;
    }
    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }
    public int getCantCapitulos() {
        return cantCapitulos;
    }
    public void setCantCapitulos(int cantCapitulos) {
        this.cantCapitulos = cantCapitulos;
    }

    @Override
    public String toString() {
        return "Temporada No."+numTemporada+" Capitulos: "+cantCapitulos;
                }
    
    
    
    
    
}
