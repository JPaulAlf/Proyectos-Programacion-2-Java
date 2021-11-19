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
public enum TipoEntrenador {
    Nacional(1000), 
    Extranjero(2000);
    
    
    private int salarioBase=0;
    private TipoEntrenador(int salarioDolares){
        this.salarioBase=salarioDolares;
    }
    public int getSalarioBase() {
        return salarioBase;
    }
    
}
