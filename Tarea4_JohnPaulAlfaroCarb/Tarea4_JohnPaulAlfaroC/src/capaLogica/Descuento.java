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
public enum Descuento {
    Cliente_Frecuente(0.10){
        public String toString(){
            return "Clinete frecuente 10.0%";
        }
    },
    Ciudadano_Oro(0.05){
        public String toString(){
            return "Ciudadano de Oro 5.0%";
        }
    };
    
     private double extra=0;
    private Descuento (double extrap){
        this.extra= extrap;
    }

    public double getExtra() {
        return extra;
    }
}
