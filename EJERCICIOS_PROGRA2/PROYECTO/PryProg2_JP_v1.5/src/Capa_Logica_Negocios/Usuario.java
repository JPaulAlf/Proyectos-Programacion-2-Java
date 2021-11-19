/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public abstract class Usuario implements Serializable{
    protected String correo;
    protected String nombre;
    protected Usuario_PaisOrigen paisOrigen;
    protected String contrasenna;
    protected Usuario_Tarjeta tarjeta;
    protected ArrayList<Usuario_Perfil> arrayPerfiles;
    
    // constructores
    public Usuario(String nombre,String correo, String contrasenna, Usuario_Tarjeta tarjeta){
        this.correo = correo;
        this.nombre=nombre;
        this.contrasenna = contrasenna;
        this.tarjeta=tarjeta;
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
         this.arrayPerfiles= new ArrayList();   
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
    public Usuario_PaisOrigen getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(Usuario_PaisOrigen paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    public Usuario_Tarjeta getTarjeta() {
        return tarjeta;
    }
    public void setTarjeta(Usuario_Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    public ArrayList<Usuario_Perfil> getArrayPerfiles() {
        return arrayPerfiles;
    }
    public void setArrayPerfiles(ArrayList<Usuario_Perfil> arrayPerfiles) {
        this.arrayPerfiles = arrayPerfiles;
    }
    

    // metodos:
    public abstract double costoInscripcion();
    public abstract void agregarPerfil(String nombre); 
    public abstract String muestraPerfiles();
    @Override
    public String toString() {
        return "\nPropietario de cuenta: "+this.nombre+
                paisOrigen+
                "\nCorreo electronico: "+this.correo+
                "\nContraseña de usuario: "+this.contrasenna+
                "\nCosto de la inscripcion: "+costoInscripcion()+" dolares"+
                "\nInformacion de la tarjeta ingresada: "+ tarjeta.toString();
                
    }
    

}// fin de la clase 
