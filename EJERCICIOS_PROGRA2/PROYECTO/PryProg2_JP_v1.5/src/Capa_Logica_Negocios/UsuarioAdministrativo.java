/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author Estudiante
 */
public class UsuarioAdministrativo extends Usuario implements Serializable{
    private final double COSTO_INSCRIPCION=0.0;
    // constructores
    public UsuarioAdministrativo(String nombre,String correo, String contrasenna ){
        super(correo, contrasenna,nombre);
    }
    
    
    // metodos 
    @Override
    public double costoInscripcion(){
        return COSTO_INSCRIPCION;
    }
    @Override
    public String toString() {
            String hilera="";
           for (Usuario_Perfil perfiles : arrayPerfiles) {
                     hilera+=perfiles.toString();
              } 
        return super.toString()+hilera; 
    }
    @Override
    public void agregarPerfil(String nombre) {
       arrayPerfiles.add(new Usuario_Perfil(nombre));
    }

    @Override
    public String muestraPerfiles() {
        String hilera="Perfiles registrados: \n";
        for (Usuario_Perfil perfiles : arrayPerfiles) {
                     hilera+=perfiles.toString();
              } 
        return hilera;
     }
    
    
    
}
