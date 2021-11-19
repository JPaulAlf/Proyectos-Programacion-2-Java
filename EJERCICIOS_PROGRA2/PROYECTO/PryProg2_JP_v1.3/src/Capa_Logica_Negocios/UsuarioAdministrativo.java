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
public class UsuarioAdministrativo extends Usuario {

    // constructores
    public UsuarioAdministrativo(String nombre,String correo, String contrasenna ){
        super(correo, contrasenna,nombre);
    }
    
    
    // metodos 
    @Override
    public double costoInscripcion(){
        return 0;
    }
    @Override
    public String toString() {
        return super.toString(); 
    }
    
    
    
}
