
package persistencia;

import capaEntidad.Producto;
import capaEntidad.TipoProducto;
import java.util.ArrayList;
import java.util.List;


public class PersistenciaProducto {
    private static ArrayList<Producto> arrayProductos = new ArrayList<>();
    
    public static ArrayList<Producto> getArrayProductos(){
        return arrayProductos;
    }
    
    public static void iniciarProductos(){
        arrayProductos.add(new Producto("Chocolates",1000,TipoProducto.NACIONAL));
        arrayProductos.add(new Producto("Confites",500,TipoProducto.IMPORTADO));
        arrayProductos.add(new Producto("Gomitas",200,TipoProducto.NACIONAL));
        arrayProductos.add(new Producto("Caramelos",300,TipoProducto.IMPORTADO));
    }
    
    public static void agregarProducto(Producto oProd){
        arrayProductos.add(oProd);
    }
    
}
