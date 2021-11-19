/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class ContenidoSerie extends ContenidoAudioVisual {
    private ArrayList<Temporada> temporadas;
    private boolean esCompleta;
// constructor
    public ContenidoSerie(String codigo, String titulo, LocalDateTime annoCreacion, int puntajeObtenido) {
        super(codigo, titulo, annoCreacion, puntajeObtenido);
        this.temporadas= new ArrayList();
    }
    
  //sets y gets
    public boolean isEsCompleta() {
        return esCompleta;
    }
    public void setEsCompleta(boolean esCompleta) {
        this.esCompleta = esCompleta;
    }
    
    
    
    // metodos a utilizar
    public void agregarTemporada(Temporada temporada){
       temporadas.add(temporada);
    }
    @Override
    public double precioBase() {
        return 10;
        }
    @Override
    public double cargoXDescarga() {
        //Validacion de acuerdo al anno de creacion de la serie, extrayendo sus valores gracias a la herencia
      int annoSerie=annoCreacion.getYear();
      // Extraigo los valores de la fecha actual, para asi saber si esta en el msimo anno 
      LocalDateTime fechaActual= LocalDateTime.now();
      int annoActual=fechaActual.getYear();
      
        int tamannoTemporada=0;
        double total= (temporadas.size()+1)*0.5;
        for (Temporada temporadaSerie: temporadas) {
            tamannoTemporada=temporadaSerie.getCantCapitulos();
            total+= tamannoTemporada*0.10;
        }
        if(annoSerie==annoActual && esOriginal){
            total+=0.50;
        }else{
            total+=0.75;
        }
        return total;
        }
    
    public double descuentoIncompleta(){
        return cargoXDescarga()*0.10;
    }
    public double subTotalPagarDescuento(){
        return cargoXDescarga()-descuentoIncompleta();
    }
    
    // Este metodo me define si es completa o no, y cuanto se debe pagar por ello
    public double totalDescuento(){
        if(esCompleta){
            return cargoXDescarga();
        }else{
            return subTotalPagarDescuento();
        }
    }
    
    
    @Override
    public String toString() {
        String hilera= super.toString();
        for (Temporada temporadaSerie : temporadas){
            hilera+= temporadaSerie.toString()+"\n";
        }
        hilera+=esCompleta?"\nSerie completa":"\nSerie incompleta";
        hilera+=esOriginal?"\nSerie original de la plataforma":"\nSerie no original de la plataforma";
       return hilera;
    }

    
}
