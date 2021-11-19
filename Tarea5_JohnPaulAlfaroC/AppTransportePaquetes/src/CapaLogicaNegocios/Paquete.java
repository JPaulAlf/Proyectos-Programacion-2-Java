package CapaLogicaNegocios;

import java.util.ArrayList;
import java.util.Iterator;

public class Paquete {   
    private ArrayList<Descuento> arrayDescuentos;
    private static int contPaquetes=0;
    private int codPaquete;
    private double peso;
    private Ciudad ciudadOrigen;
    private Ciudad ciudadDestino;
    private TipoContenido tipoContenido;   
    private final int COSTO_TRASLADO1 = 2;
    private final int COSTO_TRASLADO2 = 5;    
    
    public Paquete( double peso) {
        this.codPaquete = ++contPaquetes;
        this.peso= peso;
      
        this.arrayDescuentos = new ArrayList();
     }
     
     public void agregarDescuento(Descuento miDescuento){
         this.arrayDescuentos.add(miDescuento);
     }
        
    public double costoTraslado(){
            return this.ciudadOrigen.getZona()== this.ciudadDestino.getZona()?
                this.peso* this.COSTO_TRASLADO1:
                this.peso* this.COSTO_TRASLADO2; 
    }

    public double costoTipoContenido(){
           return tipoContenido.getMontoAdicional();
    }
    
    public double subTotal(){
        return this.costoTraslado() + this.costoTipoContenido();
    }
    
    public double totalDescuentos(){
      double totalDescuentos= 0;
      if (this.arrayDescuentos.size()>0)  {
         for (Descuento descuento : arrayDescuentos) {
           totalDescuentos += this.subTotal()* (descuento.getPorcentaje()/100);                         
         }        
      }
      return totalDescuentos;
    }
    
    
    
    public double costoTotal(){
        return this.subTotal() - this.totalDescuentos();
    }
    
   
    
        
    public String toString() {
    String hilera="";
        hilera += "\nCódigo de Paquete: " + this.codPaquete +
        "\nPeso del paquete: " +  this.getPeso() +
        
        "\nCosto por traslado: $"+ this.costoTraslado() +
        "\nCosto por contenido: $"+ this.costoTipoContenido() +
        "\nSubtotal: $"+ this.subTotal() ;
       
         if (this.arrayDescuentos.size() >0)  {
           hilera += "\nDescuentos aplicados ";
            Iterator iter = this.arrayDescuentos.iterator();
            while(iter.hasNext()){
                hilera += "\n" + iter.next().toString();
            }             
         } 
         else  {
            hilera += "\nNo se han aplicado descuentos"    ;
         }
         hilera +="\nTotal descuentos aplicados: $"+ this.totalDescuentos();
        hilera +="\nCosto total del envío: $"+ this.costoTotal() ;
         return hilera;
    }

    


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    

    public Ciudad getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(Ciudad ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public Ciudad getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(Ciudad ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }  
    public TipoContenido getTipoContenido() {
        return tipoContenido;
    }

    
    public void setTipoContenido(TipoContenido tipoContenido) {
        this.tipoContenido = tipoContenido;
    }
}
