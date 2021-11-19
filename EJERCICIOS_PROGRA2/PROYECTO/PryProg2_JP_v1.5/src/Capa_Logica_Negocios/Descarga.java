/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Descarga implements Serializable{
    private int numDescarga=0;
    private LocalDateTime fechaDescarga;
    private ContenidoAudioVisual contenido;
     
    // constructor
    public Descarga(LocalDateTime fechaDescarga, ContenidoAudioVisual contenido,int num) {
        this.fechaDescarga = fechaDescarga;
        this.contenido = contenido;
        this.numDescarga=num;
    }

    
    // set y gets
    public  int getNumDescarga() {
        return numDescarga;
    }
    public void setNumDescarga(int numDescarga) {
        this.numDescarga = numDescarga;
    }
    public LocalDateTime getFechaDescarga() {
        return fechaDescarga;
    }
    public void setFechaDescarga(LocalDateTime fechaDescarga) {
        this.fechaDescarga = fechaDescarga;
    }
    public ContenidoAudioVisual getContenido() {
        return contenido;
    }
    public void setContenido(ContenidoAudioVisual contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("MMMM/yyyy");
        return "\nFecha de descarga: "+this.fechaDescarga.format(formato)+
                "\nContenido descargado: " +contenido.toString();
    }
    
    
}
