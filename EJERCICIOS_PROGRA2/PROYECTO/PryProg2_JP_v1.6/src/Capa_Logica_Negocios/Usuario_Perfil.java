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

    public ArrayList<Descarga> getArrayDescargas() {
        return arrayDescargas;
    }
    public void setArrayDescargas(ArrayList<Descarga> arrayDescargas) {
        this.arrayDescargas = arrayDescargas;
    }

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
    public String toString2(ArrayList <Descarga> arrayDescarga){
          
        String hilera= "\nNombre de perfil: "+this.nombre+"\nContendio descargados: \n";
         
           if(!arrayDescargas.isEmpty()){ 
                for (Descarga array : arrayDescarga) {
                    hilera+=array.toString();
                    hilera+="\n************************************************";
                }
            }
          
          return hilera;
    }
    
    
    public int contPeliculas(){
         int contador=0;
         for (Descarga arrayDescarga : arrayDescargas) {
            if(arrayDescarga.getContenido() instanceof ContenidoPelicula){
                contador++;
            }
        }
         return contador;
     }
    public int contSeries(){
         int contador=0;
         for (Descarga arrayDescarga : arrayDescargas) {
            if(arrayDescarga.getContenido() instanceof ContenidoSerie){
                contador++;
            }
        }
         return contador;
     }    
    public int contPeliculas(ArrayList <Descarga> arrayDescarga){
         int contador=0;
         for (Descarga array : arrayDescarga) {
            if(array.getContenido() instanceof ContenidoPelicula){
                contador++;
            }
        }
         return contador;
     }
    public int contSeries(ArrayList <Descarga> arrayDescarga){
         int contador=0;
         for (Descarga array : arrayDescarga) {
            if(array.getContenido() instanceof ContenidoSerie){
                contador++;
            }
        }
         return contador;
     } 
    
    public void cargaArrayDescargas(Descarga descarga){
        this.arrayDescargas.add(descarga);
    }
    
    
}
