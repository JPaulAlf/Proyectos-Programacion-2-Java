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
public class Aerolinea {
    static int totalPorTodosLosVuelos=0;
    private Vuelo vuelo;

    public Aerolinea() {
    }
    
    public double ganaciaTotalVuelos(){
        return 0;
    }
    
    public static int getTotalPorTodosLosVuelos() {
        return totalPorTodosLosVuelos;
    }
    public static void setTotalPorTodosLosVuelos(int totalPorTodosLosVuelos) {
        Aerolinea.totalPorTodosLosVuelos = totalPorTodosLosVuelos;
    }
    public Vuelo getVuelo() {
        return vuelo;
    }
    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    
    
    
}
