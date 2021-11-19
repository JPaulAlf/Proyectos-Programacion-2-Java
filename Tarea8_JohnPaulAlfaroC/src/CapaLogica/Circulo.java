/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import java.text.DecimalFormat;

/**
 *
 * @author johnpaul
 */
public class Circulo extends Punto {
    protected double radio;
    
   
     public Circulo(double xp, double yp, double radiop) {
        super(xp, yp);
        this.radio= radiop;
    }
    public double calculaArea(){
    return Math.PI*Math.pow(this.radio, 2);
    }
    public double calculaCircunferencia(){
        return 2*Math.PI*this.radio;
    }

    @Override
    public String toString() {
           DecimalFormat format = new DecimalFormat("##0.0");
        return super.toString()+
                "Radio del circulo: "+ this.radio+
                "\nArea del Circulo: "+format.format(calculaArea())+
                "\nCircunferencia del circulo: "+ format.format(calculaCircunferencia())+"\n";
    }
    
    
     
     
}
