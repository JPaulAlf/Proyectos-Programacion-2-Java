
package capaPersistencia;


import CapaLogicaNegocios.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivadorArticulo {
    private static ArrayList<Articulo> arrayArticulos = new ArrayList();    

    public static void agregarArticulo(Articulo articulo){
        arrayArticulos.add(articulo);
    }
    public static void modificarCiudad(int posicion,Articulo articulo){
          arrayArticulos.set(posicion, articulo);
    }
    public static void eliminarArticulo(String codigo){       
         for (int i = 0; i < arrayArticulos.size(); i++) {
            if(arrayArticulos.get(i).getCodigo().equals(codigo))
                arrayArticulos.remove(i);
        }
        
    }
    public static boolean existeArticulo(String codigo){
        for (Articulo articulo : arrayArticulos) {
            if(articulo.getCodigo().equals(codigo))
                return true;
        }
        return false;
    }
    public static int posicionArticulo(String codigo){
        for (int i = 0; i < arrayArticulos.size(); i++) {
            if(arrayArticulos.get(i).getCodigo().equals(codigo))
                return i;
        }
        return -1;
    }
    public static ArrayList<Articulo> getArrayArticulo() {
      return arrayArticulos; 
    }
    
}
