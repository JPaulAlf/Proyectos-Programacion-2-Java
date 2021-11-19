/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Usuario_Perfil implements Serializable{
    private String nombre;
    private ArrayList<Descarga> arrayDescargas;
    
    public Usuario_Perfil(String nombre){
        this.nombre=nombre;
        this.arrayDescargas= new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
      String hilera= "\nNombre de perfil: "+this.nombre+"\nContendio descargados: \n";
      hilera+="=================================";
      if(!arrayDescargas.isEmpty()){
        for (Descarga arrayDescarga : arrayDescargas) {
            hilera+=arrayDescarga.toString();
            hilera+="\n************************************************";
        }
      }else{
          hilera+="\nAun no se ha efectuado ninguna descarga con este perfil";
      }
        hilera+="\n=================================";
        return hilera;
       }
    public void cargaArrayDescargas(Descarga descarga){
        this.arrayDescargas.add(descarga);
    }
    
    
}
