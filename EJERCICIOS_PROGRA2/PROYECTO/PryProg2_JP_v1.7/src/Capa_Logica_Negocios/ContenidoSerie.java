/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class ContenidoSerie extends ContenidoAudioVisual implements Serializable{
    private final int COSTO_BASE=10;
    private ArrayList<Temporada> temporadas;
    private boolean esCompleta;
// constructor
    public ContenidoSerie(String codigo, String titulo, LocalDateTime annoCreacion,boolean esOriginal,boolean esCompleta) {
        super(codigo, titulo, annoCreacion,esOriginal);
        this.esCompleta=esCompleta;
        this.temporadas= new ArrayList();
    }
    
  //sets y gets
    public boolean isEsCompleta() {
        return esCompleta;
    }
    public void setEsCompleta(boolean esCompleta) {
        this.esCompleta = esCompleta;
    }

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
    }
    
    
    
    // metodos a utilizar
    public void agregarTemporada(Temporada temporada){
       temporadas.add(temporada);
    }
    @Override
    public double cargoXDescarga() {
        //Validacion de acuerdo al anno de creacion de la serie, extrayendo sus valores gracias a la herencia
      int annoSerie=fechaCreacion.getYear();
      // Extraigo los valores de la fecha actual, para asi saber si esta en el msimo anno 
      LocalDateTime fechaActual= LocalDateTime.now();
      int annoActual=fechaActual.getYear();
      
        int tamannoTemporada=0;
        
        double total= temporadas.size()*0.5;
        for (Temporada temporadaSerie: temporadas) {
            tamannoTemporada=temporadaSerie.getCantCapitulos();
            total+= tamannoTemporada*0.10;
        }
        
        if(annoSerie==annoActual && esOriginal){
            total+=0.50;
        }else if(annoSerie==annoActual && !esOriginal){
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
            return cargoXDescarga()+COSTO_BASE;
        }else{
            return subTotalPagarDescuento()+COSTO_BASE;
        }
    }
    
    
    @Override
    public String toString() {
        String hilera= super.toString();
        hilera+="\nTemporadas:\n";
        for (Temporada temporadaSerie : temporadas){
            hilera+= temporadaSerie.toString()+"\n";
        }
        hilera+=esCompleta?"\nSerie completa":"\nSerie incompleta";
        hilera+=esOriginal?"\nSerie original de la plataforma":"\nSerie no original de la plataforma";
       return hilera;
    }

    
}
