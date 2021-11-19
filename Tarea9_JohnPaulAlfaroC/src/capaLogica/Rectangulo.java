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
public class Rectangulo extends Figura{
    private double ancho;
    private double largo;
    
    public Rectangulo(String nombreFigura, char caracter, double largo, double ancho){
        super(nombreFigura, caracter);
        this.ancho=ancho;
        this.largo= largo;
    }

    @Override
    public double area() {
        return largo*ancho;
   }

    @Override
    public double perimetro() {
        return (largo*2)+(ancho*2);
     }

    @Override
    public String dibujo() {
        String hilera="";
        for (int i = 0; i <ancho; i++) {
            for (int j = 0; j < largo; j++) {
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
                        "\nDibujo \n"+this.dibujo();
    }
    
    
}
