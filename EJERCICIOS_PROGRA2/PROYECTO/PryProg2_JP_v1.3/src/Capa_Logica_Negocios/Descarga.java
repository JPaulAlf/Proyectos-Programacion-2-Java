/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Descarga {
    private static int numDescarga=0;
    private LocalDateTime fechaDescarga;
    private ArrayList<ContenidoAudioVisual> arrayVideo;
    private Usuario usuarioDescarga;
    private int numDescargaUsuario;
     
    // constructor
    public Descarga( Usuario usuarioDescarga) {
        this.usuarioDescarga = usuarioDescarga;
        this.numDescargaUsuario = numDescarga++ ;
    }
    
    // set y gets
    public static int getNumDescarga() {
        return numDescarga;
    }
    public static void setNumDescarga(int numDescarga) {
        Descarga.numDescarga = numDescarga;
    }
    public LocalDateTime getFechaDescarga() {
        return fechaDescarga;
    }
    public void setFechaDescarga(LocalDateTime fechaDescarga) {
        this.fechaDescarga = fechaDescarga;
    }
    public Usuario getUsuarioDescarga() {
        return usuarioDescarga;
    }
    public void setUsuarioDescarga(Usuario usuarioDescarga) {
        this.usuarioDescarga = usuarioDescarga;
    }
    public int getNumDescargaUsuario() {
        return numDescargaUsuario;
    }
    public void setNumDescargaUsuario(int numDescargaUsuario) {
        this.numDescargaUsuario = numDescargaUsuario;
    }
    
    // metodos
    
    // esta clase amarra todas las demas.....
    // tener mucho cuidado en estos metodos... pueden llevar Barvara dentro de los mismos
    // ********************************************
    
    
}
