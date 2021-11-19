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
public class Linea {
    protected  Punto puntoOrigen;
    protected Punto puntoDestino;
    public Linea(Punto ptOrigen, Punto ptDestino){
        this.puntoDestino=ptDestino;
        this.puntoOrigen=ptOrigen;
    }
    
    public double pendienteLinea(){
        return (puntoDestino.y-puntoOrigen.y) / (puntoDestino.x-puntoOrigen.x);
    }
    
    public double longitudLinea(){
         double longitud=0;
        if(puntoDestino.y==puntoOrigen.y){
            longitud =Math.abs(puntoDestino.x-puntoOrigen.x);
            
        }else{
            if(puntoDestino.x==puntoOrigen.x){
                longitud= Math.abs(puntoOrigen.y-puntoDestino.y);
            }else{
                Punto punto3=new Punto(puntoDestino.x, puntoOrigen.y);
                longitud= ( Math.pow(Math.abs(puntoOrigen.x-punto3.x), 2) )+( Math.pow(Math.abs(puntoDestino.y-punto3.y), 2)) ;
            }
        }
        
        return Math.sqrt(longitud);
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("##0.0");
        return "Punto de Origen: "+puntoOrigen.toString()+
                "Punto de Destino: "+puntoDestino.toString()+
                "Pendiente de la linea: "+ format.format(pendienteLinea())+
                "\nLongitud de la linea: "+format.format(longitudLinea()); 
    }
    
    
    
    
    
    
    
}
