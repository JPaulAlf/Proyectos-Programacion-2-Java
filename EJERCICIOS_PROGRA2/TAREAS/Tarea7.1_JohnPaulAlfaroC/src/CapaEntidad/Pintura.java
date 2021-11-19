/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaEntidad;

import java.util.ArrayList;

/**
 *
 * @author johnpaul
 */
public class Pintura {
    private String codPintura;
    private String color;
    private double precioGalon;
    private double cantCubre;
    private ArrayList<Tinte> arrayTinte;
    
    public Pintura(String codPinturap, String colorp,double preciop, double cantCubrep ){
        this.cantCubre=cantCubrep;
        this.codPintura= codPinturap;
        this.color=colorp;
        this.codPintura=codPinturap;
        this.precioGalon= preciop;
        arrayTinte= new ArrayList();
    }

    
    public void formulacionPintura(Tinte tintep){
        arrayTinte.add(tintep);
    }
    
    @Override
    public String toString() {
        String hilera= "Codigo de pintura: "+codPintura+ " Color: "+color+ " Precio por galon: "+precioGalon +" \n"+
               "Cubrimiento : "+cantCubre+"mt por galon \n";
        hilera+= "Formula agregada: \n";
        for (Tinte tinte : arrayTinte) {
            hilera+= tinte.toString();
        }
        return hilera;
    }

    
    
    public String getCodPintura() {
        return codPintura;
    }

    public void setCodPintura(String codPintura) {
        this.codPintura = codPintura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioGalon() {
        return precioGalon;
    }

    public void setPrecioGalon(double precioGalon) {
        this.precioGalon = precioGalon;
    }

    public double getCantCubre() {
        return cantCubre;
    }

    public void setCantCubre(double cantCubre) {
        this.cantCubre = cantCubre;
    }
    
    
    
    
}// fin de la clase 
