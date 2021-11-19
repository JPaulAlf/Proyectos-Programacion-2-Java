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
public class Decimal implements IOperacion{
    private double num1;
    private double num2;
    
    public Decimal(double num1p, double num2p){
        this.num1=num1p;
        this.num2=num2p;
    }

    @Override
    public String toString() {
        DecimalFormat formato = new DecimalFormat("#,##0.0");
        String hilera="\nDecimales"+
                "\nNumero 1: "+this.num1+
                "\nNumero 2: "+this.num2+
                "\nSuma: "+num1+"+"+num2+" = "+formato.format(this.sumar())+
                "\nResta: "+num1+"-"+num2+" = "+formato.format(this.restar())+
                "\nDividir: "+num1+"/"+num2+" = "+formato.format(this.dividir())+
                "\nMultiplicar: "+num1+"*"+num2+" = "+formato.format(this.multiplicar());
        return hilera;         
         }

    @Override
    public double sumar() {
        return this.num1+this.num2;
        }

    @Override
    public double restar() {
        return this.num1-this.num2;
     }

    @Override
    public double multiplicar() {
        return this.num1*this.num2;
    }

    @Override
    public double dividir() {
        return this.num1/this.num2;
    }
    
}
