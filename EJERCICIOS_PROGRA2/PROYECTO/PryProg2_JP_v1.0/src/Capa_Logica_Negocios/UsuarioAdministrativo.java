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
    public UsuarioAdministrativo(String correo, String contrasenna, String tarjeta, TIPO_TARJETA tipoTarjeta){
        super(correo, contrasenna, tarjeta, tipoTarjeta);
    }
    
    // metodos 
    @Override
    public String toString() {
        return super.toString(); 
    }
    
    
    
}
