
package capaEntidad;

import java.util.ArrayList;



public class Sucursal {
  
    private int codigo;
    private String nombre;
    private ArrayList<Factura>arrayFactura;
    public Sucursal(int codigo, String nombre) {
        this.arrayFactura= new ArrayList();
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // agregacion
    public void agregarFactura(Factura miFactura){
        //Agregar una factura a la sucursal
         this.arrayFactura.add(miFactura);
    }
    
    public double mayorFactura(){
       //Calcular el total de la factura más cara 
       double aux=0;
        for (Factura factura : arrayFactura) {
            if(aux< factura.calcularTotalFactura()){
                aux= factura.calcularTotalFactura();
            }
        }
        return aux;
    }
    
   
    @Override
    public String toString() {
        return  codigo + " " + nombre;
    }
    public String display(){
        String hilera = "";
        hilera+="Sucural: " + codigo + "  "+nombre+"\n";
        //Agregue a este método la información completa de todas las facturas de la sucursal
        hilera+= "Facturas realizadas dentro de la sucursal: \n"; 
        for (Factura factura : arrayFactura) {
            hilera+= factura.toString()+"\n";
        }
        hilera +="\nEl mayor monto de la factura es: "+mayorFactura();
        return hilera;
    }
    
  
   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    
}
