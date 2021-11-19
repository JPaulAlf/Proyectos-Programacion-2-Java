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
public abstract class ContenidoAudioVisual {
    protected String codigo;
    protected String titulo;
    protected String annoCreacion;
    protected ArrayList <String> idiomasDisponibles;
    protected static int cantDescargas=0;
    protected  int  puntajeObtenido;
    protected TIPO_GENERO genero;

        //construtor
    public ContenidoAudioVisual(String codigo, String titulo, String annoCreacion, int puntajeObtenido) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.annoCreacion = annoCreacion;
        this.puntajeObtenido = puntajeObtenido;
        this.idiomasDisponibles= new ArrayList();
    }
    
    //set y gets
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAnnoCreacion() {
        return annoCreacion;
    }
    public void setAnnoCreacion(String annoCreacion) {
        this.annoCreacion = annoCreacion;
    }
    public ArrayList<String> getIdiomasDisponibles() {
        return idiomasDisponibles;
    }
    public void setIdiomasDisponibles(ArrayList<String> idiomasDisponibles) {
        this.idiomasDisponibles = idiomasDisponibles;
    }
    public static int getCantDescargas() {
        return cantDescargas;
    }
    public static void setCantDescargas(int cantDescargas) {
        ContenidoAudioVisual.cantDescargas = cantDescargas;
    }
    public int getPuntajeObtenido() {
        return puntajeObtenido;
    }
    public void setPuntajeObtenido(int puntajeObtenido) {
        this.puntajeObtenido = puntajeObtenido;
    }
    public TIPO_GENERO getGenero() {
        return genero;
    }
    public void setGenero(TIPO_GENERO genero) {
        this.genero = genero;
    }
    
    // metodos
    public abstract double cargoXDescarga();
    
}
