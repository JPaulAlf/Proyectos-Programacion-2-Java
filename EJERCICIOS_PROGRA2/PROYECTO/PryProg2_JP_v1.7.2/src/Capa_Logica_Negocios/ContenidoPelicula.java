/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class ContenidoPelicula extends ContenidoAudioVisual implements Serializable{
    private final int COSTO_BASE=3;
    private boolean ganadoPremio;
    private String director;

    public ContenidoPelicula(boolean ganadoPremio, String director, boolean esOriginal, String codigo, String titulo, LocalDateTime annoCreacion) {
        super(codigo, titulo, annoCreacion, esOriginal);
        this.ganadoPremio = ganadoPremio;
        this.director = director;
        
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
    public double cargoXDescarga() {  
    //Validacion de acuerdo al mes y anno de creacion de la pelicula, extrayendo sus valores gracias a la herencia
      int mesPelicula=fechaCreacion.getMonthValue();
      int annoPelicula=fechaCreacion.getYear();
      
      // Extraigo los valores de la fecha actual, para asi saber si esta en el msimo anno y mes
      LocalDateTime fechaActual= LocalDateTime.now();
      int mesActual= fechaActual.getMonthValue();
      int annoActual=fechaActual.getYear();
      
      // Variable auxiliar para llevar el coste de la pelicula
      double cargoDescarga=COSTO_BASE;
      
      //hago las validaciones respectivas para cada caso
      if(mesPelicula == mesActual && annoPelicula == annoActual && esOriginal){
          cargoDescarga+=2;
          
      }
      if(mesPelicula == mesActual && annoPelicula == annoActual && !esOriginal){
          cargoDescarga+=5;
          
      }
      if( mesPelicula != mesActual && annoPelicula == annoActual && genero.equals(TIPO_GENERO.CIENCIA_FICCION) ||
          mesPelicula != mesActual && annoPelicula == annoActual && genero.equals(TIPO_GENERO.TERROR) || 
          mesPelicula != mesActual && annoPelicula == annoActual && genero.equals(TIPO_GENERO.MISTERIO) ){
                cargoDescarga+=0.50;
                   
        }
      if( annoPelicula < annoActual && ganadoPremio ){
                  cargoDescarga+=2;
        } 
      
      return cargoDescarga;
}
    @Override
    public String toString() {
        return super.toString() +
                (ganadoPremio?"\nHa ganado un Oscar a mejor Pelicula":"\nNo ha ganado ningun premio" )+
                "\nDirector de pelicula: "+this.director+
                (esOriginal?"\nPelicula original de la plataforma":"\nPelicula no original de la platforma");
    }
    
    
}// fin de la clase 