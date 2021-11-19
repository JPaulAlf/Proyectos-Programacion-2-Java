
package persistencia;

import capaEntidad.Sucursal;
import java.util.ArrayList;
import java.util.List;


public class PersistenciaSucursal {
    private static ArrayList<Sucursal> arraySucursales = new ArrayList<>();
    
    public static void iniciarSucursales(){
        arraySucursales.add(new Sucursal(100,"Alajuela"));
        arraySucursales.add(new Sucursal(110,"Heredia"));
        arraySucursales.add(new Sucursal(120,"San Jose"));
    }
    
    public static void agregarSucursal(Sucursal sucursal){
        arraySucursales.add(sucursal);
    }
    
    public static ArrayList<Sucursal> getSucursal(){
        return arraySucursales;
    }
    
}

