/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

/**
 *
 * @author Estudiante
 */
public class ContenidoPelicula extends ContenidoAudioVisual{
    private boolean ganadoPremio;
    private String director;
    private boolean esOriginal;

    public ContenidoPelicula(boolean ganadoPremio, String director, boolean esOriginal, String codigo, String titulo, String annoCreacion, int puntajeObtenido) {
        super(codigo, titulo, annoCreacion, puntajeObtenido);
        this.ganadoPremio = ganadoPremio;
        this.director = director;
        this.esOriginal = esOriginal;
    }
    
    
    
    
    @Override
    public double cargoXDescarga() {
        return 0;
         }
    
}
