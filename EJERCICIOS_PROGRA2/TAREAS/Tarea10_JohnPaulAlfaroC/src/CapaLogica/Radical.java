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
public class Radical implements IOperacion{
    private int radical1;
    private int radical2;
    private int indice1;
    private int indice2;

    public Radical(int radical1, int radical2, int indice1, int indice2) {
        this.radical1 = radical1;
        this.radical2 = radical2;
        this.indice1 = indice1;
        this.indice2 = indice2;
    }

    @Override
    public String toString() {
         DecimalFormat formato = new DecimalFormat("#,##0.00");
        String hilera="\nRadical";
         hilera+="\nRadical 1 -> Raiz de "+indice1+" de "+radical1+
                "\nRadical 2 -> Raiz de "+indice2+" de "+radical2+
                "\nSuma: "+formato.format(this.sumar())+
                "\nResta: "+formato.format(this.restar())+
                "\nDividir: "+formato.format(this.dividir())+
                "\nMultiplicar: "+formato.format(this.multiplicar());
        return hilera;
        }
    
    @Override
    public double sumar() {
        if(radical1==radical2&&indice1==indice2){
            return 2*Math.sqrt(radical1);
        }else{
            return Math.pow(radical1, 1.0/indice1)+Math.pow(radical2, 1.0/indice2);
        }
       }

    @Override
    public double restar() {
              if(radical1==radical2&&indice1==indice2){
            return Math.sqrt(radical1)-Math.sqrt(radical2);
        }else{
            return Math.pow(radical1, 1.0/indice1)-Math.pow(radical2, 1.0/indice2);
        }
     }

    @Override
    public double multiplicar() {
                  if(indice1==indice2){
            return Math.sqrt(radical1)*Math.sqrt(radical2);
        }else{
            return Math.pow(radical1, 1.0/indice1)*Math.pow(radical2, 1.0/indice2);
        }
    }

    @Override
    public double dividir() {
                   if(indice1==indice2){
            return Math.sqrt(radical1)/Math.sqrt(radical2);
        }else{
            return Math.pow(radical1, 1.0/indice1)/Math.pow(radical2, 1.0/indice2);
        }
    }
    
}
