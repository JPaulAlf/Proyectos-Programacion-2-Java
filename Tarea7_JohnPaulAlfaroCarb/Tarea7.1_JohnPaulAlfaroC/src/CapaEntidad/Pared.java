/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaEntidad;

/**
 *
 * @author johnpaul
 */
public class Pared {
    private static int numPared=0;
    private int ancho;
    private int alto;
    private Pintura color;
    
    public Pared(int anchop, int altop, Pintura colorp){
        this.alto=altop;
        this.ancho= anchop;
        this.color=colorp;
        numPared++;
    }
    
    public double areaCubrir(){
        return ancho*alto;
    }
    public double cantidadGalonesGastar(){
        return areaCubrir() / color.getCantCubre();
    }
    public double costoPared(){
        return cantidadGalonesGastar()*color.getPrecioGalon();
    }
    
    
    @Override
    public String toString() {
        String hilera="";
        hilera+="Pared #"+numPared +"Dimensiones "+alto+"m. x "+ancho+"m. Se pinta con: \n";
        hilera+=color.toString() ;
        hilera+="Cantidad de galones a gastar: "+ cantidadGalonesGastar()+"\n";
        hilera+= "Costo de la pared : "+ costoPared()+"\n";       
        hilera+="***************************************************************";
        return hilera+"\n";
    }

    
    
    public static int getNumPared() {
        return numPared;
    }

    public static void setNumPared(int numPared) {
        Pared.numPared = numPared;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Pintura getColor() {
        return color;
    }

    public void setColor(Pintura color) {
        this.color = color;
    }
    
    
    
    
} // fin de la clase 
