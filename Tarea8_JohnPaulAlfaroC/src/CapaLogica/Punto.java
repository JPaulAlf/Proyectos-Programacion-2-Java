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
public class Punto {
    protected double x;
    protected double y;
    
    public Punto(double xp, double yp){
        this.x=xp;
        this.y=yp;
    }

    @Override
    public String toString() {
        return "Punto: [ " + x+ " , " + y + " ] \n" ;
    }
    
    
    
    
}
