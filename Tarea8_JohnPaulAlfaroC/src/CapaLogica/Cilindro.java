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
public class Cilindro extends Circulo{
    protected double altura;
    public Cilindro(double xp, double yp, double radiop, double alturap) {
        super(xp, yp, radiop);
        this.altura=alturap;
    }
    public double calculaArea(){
        // 2*Math.PI*r*(r+h);
        return super.calculaArea()*2 + (super.calculaCircunferencia()*this.altura);
    }
    public double calculaVolumen(){
        return super.calculaArea()*this.altura;
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("##0.0");
        return super.toString()+
                "Altura del cilindro: "+ this.altura+
                "\nArea del cilindro: "+format.format(calculaArea())+
                "\nVolumen del cilindro: "+ format.format(calculaVolumen())+"\n";
    }
   
}
