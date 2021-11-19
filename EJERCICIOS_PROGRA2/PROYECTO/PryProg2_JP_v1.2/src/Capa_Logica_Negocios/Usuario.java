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
    protected String contrasenna;
    protected String numTarjeta;
    protected TIPO_TARJETA tipoTarjeta;
    
    // constructores
    public Usuario(String correo, String contrasenna, String tarjeta, TIPO_TARJETA tipoTarjeta) {
        this.correo = correo;
        this.contrasenna = contrasenna;
        this.numTarjeta = tarjeta;
        this.tipoTarjeta=tipoTarjeta;
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
    public String getTarjeta() {
        return numTarjeta;
    }
    public void setTarjeta(String tarjeta) {
        this.numTarjeta = tarjeta;
    } 
    
    // metodos:
    @Override
    public String toString() {
        return "\nCorreo electronico: "+this.correo+
                "\nContrasenna de usuario: "+this.contrasenna+
                "\nTarjeta del usuario [ " +this.tipoTarjeta+" ]: "+this.numTarjeta;
    }
    

}// fin de la clase 
