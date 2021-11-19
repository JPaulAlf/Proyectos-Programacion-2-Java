/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.io.Serializable;

/**
 *
 * @author johnpaul
 */
public enum TIPO_MONEDA implements Serializable {
    
    COLONES(1){
        @Override
        public String toString() {
            return "Colones";
             }
        
    },
    DOLARES(565){
        @Override
        public String toString() {
            return "Dolares";
        }
        
    };
    
    private int valor;
    private TIPO_MONEDA(int valorp){
        this.valor=valorp;
    }
    public int getValor() {
        return valor;
    }
    
}
