/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class ContenidoPelicula extends ContenidoAudioVisual{
    private boolean ganadoPremio;
    private String director;

    public ContenidoPelicula(boolean ganadoPremio, String director, boolean esOriginal, String codigo, String titulo, LocalDateTime annoCreacion, int puntajeObtenido) {
        super(codigo, titulo, annoCreacion, puntajeObtenido);
        this.ganadoPremio = ganadoPremio;
        this.director = director;
        this.esOriginal = esOriginal;
    }

    public boolean isGanadoPremio() {
        return ganadoPremio;
    }
    public void setGanadoPremio(boolean ganadoPremio) {
        this.ganadoPremio = ganadoPremio;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public boolean isEsOriginal() {
        return esOriginal;
    }
    public void setEsOriginal(boolean esOriginal) {
        this.esOriginal = esOriginal;
    }
    
    
 // metodos a utilizar dentro de la clase
       @Override
    public double precioBase() {
        return 3;
       }
    @Override
    public double cargoXDescarga() { 
 
//Validacion de acuerdo al mes y anno de creacion de la pelicula, extrayendo sus valores gracias a la herencia
      int mesPelicula=annoCreacion.getMonthValue();
      int annoPelicula=annoCreacion.getYear();
      
      // Extraigo los valores de la fecha actual, para asi saber si esta en el msimo anno y mes
      LocalDateTime fechaActual= LocalDateTime.now();
      int mesActual= fechaActual.getMonthValue();
      int annoActual=fechaActual.getYear();
      
      //hago las validaciones respectivas para cada caso
      if(mesPelicula==mesActual && annoPelicula==annoActual){
          return precioBase()+2+5;
      }else if(mesPelicula <  mesActual && annoPelicula==annoActual && genero.equals(TIPO_GENERO.CIENCIA_FICCION) ||
              genero.equals(TIPO_GENERO.TERROR)|| genero.equals(TIPO_GENERO.MISTERIO)){
              return precioBase()+0.50;
          } else if(annoPelicula<annoActual && ganadoPremio){
          return precioBase()+2;
        } 
      return precioBase();
}
    @Override
    public String toString() {
        return super.toString() +
                (ganadoPremio?"\nHa ganado un Oscar a mejor Pelicula":"\nNo ha ganado ningun premio" )+
                "\nDirector de pelicula: "+this.director+
                (esOriginal?"\nPelicula original de la plataforma":"\nPelicula no original de la platforma");
    }
    
    
}// fin de la clase 