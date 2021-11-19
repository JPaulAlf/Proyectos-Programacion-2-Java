
package CapaPersistencia;

import CapaLogicaNegocios.Ciudad;
import java.util.ArrayList;
import java.util.Iterator;

// terminar posicion de ciudad
public class ArchivadorCiudad {
  private static ArrayList<Ciudad> arrayCiudades = new ArrayList();    

    public static void agregarCiudad(Ciudad ciudad){
        arrayCiudades.add(ciudad);
    }
    public static void modificarCiudad(int posicion,Ciudad ciudad){
          arrayCiudades.set(posicion, ciudad);
    }
    public static void eliminarCiudad(String nombreCiudad){  
       int indice=0;
//        for (Ciudad arrayCiudade : arrayCiudades) {
//            if(arrayCiudade.getNombre().equals(nombreCiudad)){
//                arrayCiudades.remove(indice);
//            }
//            indice++;
//        }
        
        for (int i = 0; i < arrayCiudades.size(); i++) {
             if(arrayCiudades.get(i).getNombre().equals(nombreCiudad)){
                arrayCiudades.remove(i);
            }
        }
    }
    public static int posicionCiudad(String nombreCiudad){
         for (Ciudad arrayCiudade : arrayCiudades) {
            if(arrayCiudade.getNombre().equals(nombreCiudad)){
                return arrayCiudades.indexOf(nombreCiudad);
            }
        }
        
        return -1; //Si no lo encuentra retorna -1
    }


    public static ArrayList<Ciudad> getArrayCiudades() {
      return arrayCiudades; 
    }
    
    
    
    
    
}
