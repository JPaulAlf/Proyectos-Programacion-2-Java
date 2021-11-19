/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaLogica;

/** 
 *
 * @author Estudiante
 */
public abstract class Figura {
    private String nombreFigura;
    protected char caracter;
    
    public Figura(String nombreFigurap, char caracterp){
        this.caracter= caracterp;
        this.nombreFigura= nombreFigurap;
    }
    
    public abstract double area();
    public abstract double perimetro();
    public abstract String dibujo();

    @Override
    public String toString() {
        return "Nombre de la figura: "+this.nombreFigura+"\nCaracter a usar: "+caracter;
    }
    
    
    
    
}
