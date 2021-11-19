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
public class Fraccion implements IOperacion{
    private int num1;
    private int num2;
    private int den1;
    private int den2;

    public Fraccion(int num1, int num2, int den1, int den2) {
        this.num1 = num1;
        this.num2 = num2;
        this.den1 = den1;
        this.den2 = den2;
    }

    @Override
    public String toString() {
        DecimalFormat formato = new DecimalFormat("#,##0.00");
        String hilera="\nFraccion";
        hilera+="\nFraccion 1: "+"("+this.num1+"/"+this.den1+")"+
                "  Fraccion 2: "+"("+this.num2+"/"+this.den2+")"+
                "\nSuma: "+"("+this.num1+"/"+this.den1+")"+"+"+"("+this.num2+"/"+this.den2+")"+ " = "+formato.format(this.sumar())+
                "\nResta: "+"("+this.num1+"/"+this.den1+")"+"-"+"("+this.num2+"/"+this.den2+")"+ " = "+formato.format(this.restar())+
                "\nDividir: "+"("+this.num1+"/"+this.den1+")"+"/"+"("+this.num2+"/"+this.den2+")"+ " = "+formato.format(this.dividir())+
                "\nMultiplicar: "+"("+this.num1+"/"+this.den1+")"+"*"+"("+this.num2+"/"+this.den2+")"+ " = "+formato.format(this.multiplicar());
        return hilera;
          }
    
    @Override
    public double sumar() {
        double num3= num1*den2+num2*den1;
        double den3=den1*den2;
        return num3/den3;
        }

    @Override
    public double restar() {
         double num3= num1*den2-num2*den1;
        double den3=den1*den2;
        return num3/den3;
     }

    @Override
    public double multiplicar() {
        double num3= num1*num2;
        double den3=den1*den2;
        return num3/den3;
     }

    @Override
    public double dividir() {
         double den3= den1*num2;
        double num3=num1*den2;
        return num3/den3;
     }
    
}
