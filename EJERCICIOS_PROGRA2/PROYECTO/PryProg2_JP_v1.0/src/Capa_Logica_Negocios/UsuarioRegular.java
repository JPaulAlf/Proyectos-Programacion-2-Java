/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class UsuarioRegular extends Usuario{
    TIPO_USUARIO_REGULAR tipoUsuario;
    ArrayList<Usuario_Perfil> arrayPerfiles;
    
    // constructores:
    public UsuarioRegular(String correo, String contrasenna, String tarjeta,TIPO_TARJETA tipoTarjeta){
        super(correo, contrasenna, tarjeta, tipoTarjeta);
        this.arrayPerfiles= new ArrayList();
        
    }
    
    //metodos set y get
    public TIPO_USUARIO_REGULAR getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(TIPO_USUARIO_REGULAR tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    
    //metodos  
    @Override
    public String toString() {
        return super.toString(); 
    }
    public double costoInscripcion() {
//       return (tipoUsuario.equals(TIPO_USUARIO_REGULAR.USUARIO_CORPORATIVO))?
//               tipoUsuario.getPrecioUsuario():tipoUsuario.getPrecioUsuario();
        return tipoUsuario.getPrecioUsuario();
        }
 
    
    
}// final de la clase
