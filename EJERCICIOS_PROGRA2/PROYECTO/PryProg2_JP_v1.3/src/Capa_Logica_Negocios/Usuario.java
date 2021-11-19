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
public  class Usuario {
    protected String correo;
    protected String nombre;
    protected String contrasenna;
    
    // constructores
    public Usuario(String correo, String contrasenna,String nombre) {
        this.correo = correo;
        this.nombre=nombre;
        this.contrasenna = contrasenna;
    }
    public Usuario(String correo, String contrasenna){
        this.correo= correo;
        this.contrasenna=contrasenna;
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
    
    
    
    // metodos:
    public double costoInscripcion(){
        return 0;
    }
    @Override
    public String toString() {
        return "\nPropietario de cuenta: "+this.nombre
                +"\nCorreo electronico: "+this.correo+
                "\nContraseña de usuario: "+this.contrasenna;
                
    }
    

}// fin de la clase 
