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
    private static int contNumPerfiles=0;
    private int numPerfiles;
    
     // constructores:
    public UsuarioCorporativo(String nombre,String correo, String contrasenna, String tarjeta,TIPO_TARJETA tipoTarjeta){
        super(nombre, correo, contrasenna, tarjeta, tipoTarjeta);
       // this.arrayPerfiles= new ArrayList();   
    }
    
    //sets y gets
    public String getNumTarjeta() {
        return numTarjeta;
    }
    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
    public TIPO_TARJETA getTipoTarjeta() {
        return tipoTarjeta;
    }
    public void setTipoTarjeta(TIPO_TARJETA tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
    public int getNumPerfiles() {
        return numPerfiles;
    }
    public void setNumPerfiles(int numPerfiles) {
        this.numPerfiles = numPerfiles;
    }

    // metodos a utilizar en la clase
    @Override
    public double costoInscripcion(){
        return 5;
    }
    @Override
    public String toString() {
             String hilera= "\nNumero de tarjeta: "+ this.numTarjeta+
              "\nTipo de tarjeta: "+this.tipoTarjeta.toString()+
              "\nPerfiles registrados: \n";
             for (Usuario_Perfil perfiles : arrayPerfiles) {
                     hilera+=perfiles.toString();
              }
         return super.toString()+hilera;
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