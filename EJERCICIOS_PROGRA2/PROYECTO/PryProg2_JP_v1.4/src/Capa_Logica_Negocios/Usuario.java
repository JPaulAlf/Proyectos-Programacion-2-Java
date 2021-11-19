/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public  class Usuario {
    protected String correo;
    protected String nombre;
   protected String paisOrigen;
    protected String contrasenna;
    protected String numTarjeta;
    protected String CVV;
    protected String mesVencimineto;
    protected String annoVencimiento;
    protected TIPO_TARJETA tipoTarjeta;
    protected ArrayList<Usuario_Perfil> arrayPerfiles;
    
    // constructores
    public Usuario(String nombre,String correo, String contrasenna, String tarjeta,TIPO_TARJETA tipoTarjeta){
         this.correo = correo;
        this.nombre=nombre;
        this.contrasenna = contrasenna;
        this.numTarjeta=tarjeta;
        this.tipoTarjeta=tipoTarjeta;
        this.arrayPerfiles= new ArrayList();   
     }
    public Usuario(String correo, String contrasenna,String nombre) {
        this.correo = correo;
        this.nombre=nombre;
        this.contrasenna = contrasenna;
       this.arrayPerfiles= new ArrayList();   
    }  
    public Usuario(String correo, String contrasenna){
        this.correo= correo;
        this.contrasenna=contrasenna;
        this.arrayPerfiles= new ArrayList();   
    }
    public Usuario(){
        
    }
    
    // metodos set and get
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getContrasenna() {
        return contrasenna;
    }
    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    public String getCVV() {
        return CVV;
    }
    public void setCVV(String CVV) {
        this.CVV = CVV;
    }
    public String getMesVencimineto() {
        return mesVencimineto;
    }
    public void setMesVencimineto(String mesVencimineto) {
        this.mesVencimineto = mesVencimineto;
    }
    public String getAnnoVencimiento() {
        return annoVencimiento;
    }
    public void setAnnoVencimiento(String annoVencimiento) {
        this.annoVencimiento = annoVencimiento;
    }

    // metodos:
    public double costoInscripcion(){
        return 0;
    }
    public void agregarPerfil(Usuario_Perfil perfil){
            this.arrayPerfiles.add(perfil);
    } 
    @Override
    public String toString() {
        return "\nPropietario de cuenta: "+this.nombre
                +"\nCorreo electronico: "+this.correo+
                "\nContraseña de usuario: "+this.contrasenna;
                
    }
    

}// fin de la clase 
