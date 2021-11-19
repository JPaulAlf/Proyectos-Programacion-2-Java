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
public class Cuadrado extends Figura{
    private double lado;
    
    public Cuadrado(String nombreFigura, char caracter,double lado){
        super(nombreFigura, caracter);
        this.lado= lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public double perimetro() {
        return lado*4;
     }

    @Override
    public String dibujo() {
        String hilera="";
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                hilera+=caracter;
            }
            hilera+="\n";
        }
        return hilera;
    }

    @Override
    public String toString() {
      return super.toString() +
                "\nPerimetro de la figura: "+ this.perimetro()+
                        "\nArea de la figura:"+this.area()+
                        "\nDibujo \n"+this.dibujo();    }
    
    
    
}
