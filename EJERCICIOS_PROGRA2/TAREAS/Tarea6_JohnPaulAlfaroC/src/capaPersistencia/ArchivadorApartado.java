
package capaPersistencia;


import java.util.ArrayList;
import CapaLogicaNegocios.*;


public class ArchivadorApartado {
    private static ArrayList<Apartado> arrayApartado = new ArrayList();    

    public static void agregarApartado(Apartado apartado){
        arrayApartado.add(apartado);
    }
    public static Apartado getApartado(int numeroApartado){
        for (Apartado apartado : arrayApartado) {
            if(apartado.getNumero() == numeroApartado)
                return apartado;
        }
        return null;
    }
    public static String listaApartados(){
        String hilera = "";
        for (Apartado apartado : arrayApartado) {
            hilera+= apartado.toString()+ "\n";            
        }
        return hilera;
    }
    public static ArrayList<Apartado> getArrayApartado() {
      return arrayApartado; 
    }
    
    
    
}
