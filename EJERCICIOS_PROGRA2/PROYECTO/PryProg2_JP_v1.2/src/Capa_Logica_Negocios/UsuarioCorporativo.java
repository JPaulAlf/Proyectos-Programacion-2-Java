/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.util.ArrayList;

/**
 *
 * @author johnpaul
 */
public class UsuarioCorporativo extends Usuario {
    ArrayList<Usuario_Perfil> arrayPerfiles;
    
     // constructores:
    public UsuarioCorporativo(String correo, String contrasenna, String tarjeta,TIPO_TARJETA tipoTarjeta){
        super(correo, contrasenna, tarjeta, tipoTarjeta);
        this.arrayPerfiles= new ArrayList();
        
    }
    
}
