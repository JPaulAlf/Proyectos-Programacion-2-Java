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
    private String numTemporada;
    private String cantCapitulos;

    public Temporada(String numTemporada, String cantCapitulos) {
        this.numTemporada = numTemporada;
        this.cantCapitulos = cantCapitulos;
    }

    public String getNumTemporada() {
        return numTemporada;
    }
    public void setNumTemporada(String numTemporada) {
        this.numTemporada = numTemporada;
    }
    public String getCantCapitulos() {
        return cantCapitulos;
    }
    public void setCantCapitulos(String cantCapitulos) {
        this.cantCapitulos = cantCapitulos;
    }

    @Override
    public String toString() {
        return "Temporada No."+numTemporada+" Capitulos: "+cantCapitulos;
                }
    
    
    
    
    
}
