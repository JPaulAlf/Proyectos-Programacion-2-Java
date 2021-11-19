/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author johnpaul
 */
public class UsuarioCorporativo extends Usuario implements Serializable{
     private final double COSTO_INSCRIPCION=5.0;
    
     // constructores:
    public UsuarioCorporativo(String nombre,String correo, String contrasenna, Usuario_Tarjeta tarjeta){
        super(nombre, correo, contrasenna, tarjeta);
       // this.arrayPerfiles= new ArrayList();   
    }
    

    // metodos a utilizar en la clase
    @Override
    public double costoInscripcion(){
        return COSTO_INSCRIPCION;
    }
    @Override
    public String toString() {
                   String hilera= "\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"+
                        "\nLos perfiles registrados con este usuario son: \n";
                if(!arrayPerfiles.isEmpty()){
           for (Usuario_Perfil perfiles : arrayPerfiles) {
                     hilera+=perfiles.toString();
                     hilera+="\n<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>\n";
              } 
                }else{ 
                    hilera+="\nAun no hay ningun perfil registrado";
                }    
           hilera+="\n:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n";
           hilera+="\nPagos realizados hasta el momento: \n";
           if(!tarjeta.getArrayPagos().isEmpty()){
               for (Usuario_Pago usuario_Pago : tarjeta.getArrayPagos()) {
                   hilera+=usuario_Pago.toString();
                   hilera+="\n..............................................................\n";
               }
           }else{
               hilera+="\n  ++Aun no se ha realizado ningun pago...";
           }
           
         return super.toString()+hilera;
    }
    @Override
    public void agregarPerfil(String nombre) {
         arrayPerfiles.add(new Usuario_Perfil(nombre));
        }

    @Override
    public String muestraPerfiles() {
        String hilera= "\nLos perfiles registrados con este usuario son: \n";
                if(!arrayPerfiles.isEmpty()){
           for (Usuario_Perfil perfiles : arrayPerfiles) {
                     hilera+=perfiles.toString();
                     hilera+="\n<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>\n";
              } 
                }else{ 
                    hilera+="\nAun no hay ningun perfil registrado";
                }    
                return hilera;
      }


    
    
}// fin de la clase


//  public boolean agregarPerfil(Usuario_Perfil perfil){
//        if(contNumPerfiles<5){
//            this.arrayPerfiles.add(perfil);
//            contNumPerfiles++;
//            return true;
//        }else{
//            return false;
//        }
//    } 