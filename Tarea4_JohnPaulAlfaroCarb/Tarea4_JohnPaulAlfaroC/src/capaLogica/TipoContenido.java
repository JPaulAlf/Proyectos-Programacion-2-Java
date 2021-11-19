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
public enum TipoContenido {
    Perecedero(50.0){
        public String toString(){
            return "Perecedero";
        }
    }, 
    No_Perecedero(10.0){
        public String toString(){
            return "No perecedero";
        }
    };
    
    private double extra=0;
    private TipoContenido(double extrap){
        this.extra= extrap;
    }

    public double getExtra() {
        return extra;
    }
    
    
}
