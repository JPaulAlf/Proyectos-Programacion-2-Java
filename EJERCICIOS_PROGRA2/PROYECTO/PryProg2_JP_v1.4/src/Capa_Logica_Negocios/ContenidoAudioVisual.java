/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;


import java.time.*;
import Capa_Acceso_Datos.*;
import java.io.Serializable;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public abstract class ContenidoAudioVisual implements Serializable{
    protected String codigo;
    protected String titulo;
    protected LocalDateTime annoCreacion; 
    protected boolean esOriginal;
// debe de ser de este tipo debido a las validaciones deacuerdo al mes o ano de salida, se ven en las hijas estas validaciones
    protected ArrayList <TIPOS_IDIOMAS> idiomasDisponibles;
    protected static int cantDescargas=0;
    protected  int  puntajeObtenido;
    protected TIPO_GENERO genero;

    //construtor
    public ContenidoAudioVisual(String codigo, String titulo, LocalDateTime annoCreacion, int puntajeObtenido) {
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
    public LocalDateTime getAnnoCreacion() {
        return annoCreacion;
    }
    public void setAnnoCreacion(LocalDateTime annoCreacion) {
        this.annoCreacion = annoCreacion;
    }
    
    
    // metodos GENERALES 
    public static void contDescargaActualizacion(){
        cantDescargas++;
    }
    public abstract double precioBase();
    public abstract double cargoXDescarga();
    public void agregarIdioma(TIPOS_IDIOMAS idioma){
        idiomasDisponibles.add(idioma);
    }
    public  double puntajeObtenido(){
        return puntajeObtenido/100;
    }
    @Override
    public String toString() {
        StringBuilder hilera = new StringBuilder();
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        hilera.append("\nCodigo: ").append(this.codigo);
        hilera.append("\nTitulo: ").append(this.titulo);
        hilera.append("\nAño de creacion: ").append(annoCreacion.format(formato));
        hilera.append("\nGenero: ").append(this.genero);
        hilera.append("\nPuntaje obtenido: ").append(puntajeObtenido).append("%");
        hilera.append("\nCantidad de descargas: ").append(this.cantDescargas);
        hilera.append("\nIdiomas disponibles:");
        for (TIPOS_IDIOMAS idiomasDisponible : idiomasDisponibles) {
            hilera.append(idiomasDisponible.toString()).append("\n");
        }
        
        return hilera.toString();
    }
    
    
    // METODOS DEL ARCHIVO DE CONTENIDO AUDIOVISUAL
    public static ContenidoAudioVisual consultarContenidoAudiovisual(String codigo) throws Exception {
        return ContenidoAudioVisualBD.getInstance().consultarContenidoAudiovisual(codigo);
    }
    public static void agregarContenidoAudiovisual(ContenidoAudioVisual contenido) throws Exception {
        ContenidoAudioVisualBD.getInstance().agregarContenidoAudiovisual(contenido);
    }
    public static void eliminarContenidoAudiovisual(String codigo) throws Exception {
        ContenidoAudioVisualBD.getInstance().eliminarContenidoAudioVisual(codigo);
    }
    public static void modificarContenidoAudiovisual(ContenidoAudioVisual contenido) throws Exception {
        ContenidoAudioVisualBD.getInstance().modificarContendioAudiovisual(contenido);
    }
    public static ArrayList<ContenidoAudioVisual> listadoContendio() throws Exception {
        return ContenidoAudioVisualBD.getInstance().listaContendioAudiovisual();
    }
    
}
