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
public class Triangulo extends Figura{
    private double lado;
        
    public Triangulo(String nombreFigurap, char c, int base){
      super(nombreFigurap, c);
             this.lado=base;
        }
    
    @Override
    public double area() {
        return lado*lado/2;
         }

    @Override
    public double perimetro() {
        //double hipotenusa= Math.sqrt(Math.pow(lado, 2)*2);
        return (lado*2)+(Math.sqrt(Math.pow(lado, 2)*2));
     }

    @Override
    public String dibujo() {
        String hilera="";
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < i; j++) {
                hilera+=caracter;
            }
           hilera+= "\n";
        }
        return hilera;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPerimetro de la figura: "+ this.perimetro()+
                        "\nArea de la figura:"+this.area()+
                        "\nDibujo \n"+this.dibujo();
    }
    
    
    
}
