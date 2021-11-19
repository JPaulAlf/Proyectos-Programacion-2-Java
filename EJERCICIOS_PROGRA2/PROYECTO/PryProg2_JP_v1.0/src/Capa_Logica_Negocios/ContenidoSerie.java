/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class ContenidoSerie extends ContenidoAudioVisual {
    private ArrayList<Temporada> temporadas;
    private boolean esCompleta;
// constructor
    public ContenidoSerie(String codigo, String titulo, String annoCreacion, int puntajeObtenido) {
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
    
    
    
    
    @Override
    public double cargoXDescarga() {
        return 0;
        }
    
}
