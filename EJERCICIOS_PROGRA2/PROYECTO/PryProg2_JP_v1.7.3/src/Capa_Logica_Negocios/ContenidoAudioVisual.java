/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;


import java.time.*;
import Capa_Acceso_Datos.*;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public  class ContenidoAudioVisual implements Serializable{
    protected String codigo;
    protected String titulo;
    protected LocalDateTime fechaCreacion; 
    // este tipo debido a las validaciones deacuerdo al mes o ano de salida, se ven en las hijas estas validaciones
    protected boolean esOriginal;
    protected TIPO_GENERO genero;
    protected ArrayList <TIPOS_IDIOMAS> idiomasDisponibles;
    protected ArrayList<Integer>arrayPuntajes;
    protected  int cantDescargas=0;

    protected boolean siCalificado;
    
    //construtor
    public ContenidoAudioVisual(String codigo, String titulo, LocalDateTime annoCreacion, boolean esOrignal) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.esOriginal=esOrignal;
        this.fechaCreacion = annoCreacion;
        this.arrayPuntajes=new ArrayList();
        this.idiomasDisponibles= new ArrayList();
        siCalificado=false;
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
    public TIPO_GENERO getGenero() {
        return genero;
    }
    public void setGenero(TIPO_GENERO genero) {
        this.genero = genero;
    }
    public LocalDateTime getAnnoCreacion() {
        return fechaCreacion;
    }
    public String devuelveAnnoCreacion(){
          DateTimeFormatter formato= DateTimeFormatter.ofPattern("MM/yy");
          return this.fechaCreacion.format(formato);
    }
     public String devuelveAnnoCreacionAux(){
          DateTimeFormatter formato= DateTimeFormatter.ofPattern("MMyy");
          return this.fechaCreacion.format(formato);
    }
    public void setAnnoCreacion(LocalDateTime annoCreacion) {
        this.fechaCreacion = annoCreacion;
    }
    public boolean isEsOriginal() {
        return esOriginal;
    }
    public ArrayList<TIPOS_IDIOMAS> getIdiomasDisponibles() {
        return idiomasDisponibles;
    }
    public void setIdiomasDisponibles(ArrayList<TIPOS_IDIOMAS> idiomasDisponibles) {
        this.idiomasDisponibles = idiomasDisponibles;
    }
    public int getCantDescargas() {
        return cantDescargas;
    }
    public void setCantDescargas(int cantDescargas) {
        this.cantDescargas = cantDescargas;
    }

    public boolean isSiCalificado() {
        return siCalificado;
    }
    public void setSiCalificado(boolean siCalificado) {
        this.siCalificado = siCalificado;
    }
    
    
    
    // metodos GENERALES 
    public void contDescargaActualizacion(){
        cantDescargas++;
    }
    public double cargoXDescarga(){
        return 0;
    }
    public void agregarIdioma(TIPOS_IDIOMAS idioma){
        idiomasDisponibles.add(idioma);
    }
    public void agregarPuntaje(int puntos){
        this.arrayPuntajes.add(puntos);
    }
    
    
    
    
    public  String puntajeObtenido(){
        DecimalFormat formatoDinero = new DecimalFormat("###,###,###,##0.0");
        double totalPuntaje=0;
        double conctador=0;
        for (Integer arrayPuntaje : arrayPuntajes) {
            totalPuntaje+=arrayPuntaje.intValue();
            System.out.println("******"+conctador+"******");
            System.out.println(totalPuntaje);
            conctador++;
        }
        
        double resultado=  (totalPuntaje / arrayPuntajes.size()) * 10 ;
        if(!this.arrayPuntajes.isEmpty()){
            return formatoDinero.format(resultado);
        }
          return "0";  
    }
    
    
    
    
    public  int puntajeObtenido2(){
        int totalPuntaje=0;
        for (Integer arrayPuntaje : arrayPuntajes) {
            totalPuntaje+=arrayPuntaje;
        }
        return  (int)((totalPuntaje/(arrayPuntajes.size()+1))/0.10);
    }
    @Override
    public String toString() {
        StringBuilder hilera = new StringBuilder();
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("MMMM/yyyy");
        hilera.append("\nCodigo: ").append(this.codigo);
        hilera.append("\nTitulo: ").append(this.titulo);
        hilera.append("\nAño de creacion: ").append(fechaCreacion.format(formato));
        hilera.append("\nGenero: ").append(this.genero);
        hilera.append("\nPuntaje obtenido: ").append(puntajeObtenido()).append("%");
        hilera.append("\nCantidad de descargas: ").append(this.cantDescargas);
        hilera.append("\nIdiomas disponibles:\n");
        for (TIPOS_IDIOMAS idiomasDisponible : idiomasDisponibles) {
            hilera.append(idiomasDisponible.toString()).append("\n");
        }
        
        return hilera.toString();
    }
    
    
    // METODOS DEL ARCHIVO DE CONTENIDO AUDIOVISUAL { NO TOCAR, NI MODIFICAR NADA }
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
