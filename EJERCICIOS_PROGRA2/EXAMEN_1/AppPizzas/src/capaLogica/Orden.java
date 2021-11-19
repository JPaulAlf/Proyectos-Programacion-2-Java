/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaLogica;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Estudiante
 */
public class Orden {
    private static int cantOrdenes=100;
    private int numeroOrden;
    private ArrayList <PlatoItaliano> arrayPlatos;
    
    public Orden(){
        this.numeroOrden=cantOrdenes++;
        this.arrayPlatos=new ArrayList();
                
    }
    public void agregarPlato(PlatoItaliano plato){
        this.arrayPlatos.add(plato);
    }
    public double calculaTotalOrden(){
        double total=0;
        for (int i = 0; i < this.arrayPlatos.size(); i++) {
            total+=this.arrayPlatos.get(i).precioTotalPlato();
        }
        return total;
    }
    public double totalPagadoParaLasagnas(){
        double total=0;
        Iterator <PlatoItaliano> iter= this.arrayPlatos.iterator();
        while(iter.hasNext()){
            PlatoItaliano plato= iter.next();
            if(plato instanceof Pasta){
            if(((Pasta) plato).getTipoPasta().equals(TipoPasta.Lasagna)){
                total += plato.precioTotalPlato();
            }
            }
        }
        return total;
    }
    public int cantidadPizzasParaLlevar(){
        int cantidad=0;
        for (PlatoItaliano plato : arrayPlatos) {
           if(plato instanceof Pizza){
               if(((Pizza)plato).isParaLlevar()){
                   cantidad++;
               }
           }
        }
        return cantidad;
    }
        
    @Override
    public String toString() {
       StringBuilder hilera= new StringBuilder();
       hilera.append("\nDetalle de la orden: ").append(numeroOrden);
       hilera.append("\nPlatos ordenados: ");
       hilera.append("\n===================================");
        for (PlatoItaliano arrayPlato : arrayPlatos) {
            hilera.append(arrayPlato.toString());
            hilera.append("\n**********************************");
        }
        hilera.append("\n===================================");
        hilera.append("\nTotal a pagar por la orden: ").append(this.calculaTotalOrden());
        hilera.append("\nTotal pagado en lasagnas: ").append(this.totalPagadoParaLasagnas());
        hilera.append("\nCantidad de pizzas para llevar: ").append(this.cantidadPizzasParaLlevar());
        return hilera.toString();
    }

    public static int getCantOrdenes() {
        return cantOrdenes;
    }

    public static void setCantOrdenes(int cantOrdenes) {
        Orden.cantOrdenes = cantOrdenes;
    }

    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public ArrayList<PlatoItaliano> getArrayPlatos() {
        return arrayPlatos;
    }

    public void setArrayPlatos(ArrayList<PlatoItaliano> arrayPlatos) {
        this.arrayPlatos = arrayPlatos;
    }
    
    
    
}
