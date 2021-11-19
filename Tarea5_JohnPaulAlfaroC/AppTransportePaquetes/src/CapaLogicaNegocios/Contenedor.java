
package CapaLogicaNegocios;

import java.util.ArrayList;

public class Contenedor {
  private static int cantContenedores =0;
  private int codContenedor;
  private double pesoCargado;
  private double pesoMaximo;
    private ArrayList<Paquete> arrayPaquetes;

    public Contenedor( double pesoMaximo) {
      codContenedor=++cantContenedores;
      this.pesoCargado=0;
      this.pesoMaximo=pesoMaximo;
      arrayPaquetes = new ArrayList();
    
    }
    public boolean cargarPaquete(Paquete paquete){     
         if (this.pesoCargado + paquete.getPeso() <= this.pesoMaximo){
            this.pesoCargado += paquete.getPeso();
            arrayPaquetes.add(paquete);
            return true;
         }
         else{
             return false;
         }
     }
    
    
     
       
        
    
    
    public String toString() {
        String hilera = 
            "Contenedor " + this.codContenedor + 
            " Peso total almacenado "+ this.pesoCargado  +  "\n";
        hilera += "Paquetes almacenados en el contenedor: \n";
        if (arrayPaquetes.isEmpty()) {
           hilera += " No se han cargado paquetes\n";
        } else {
            for (int i = 0; i < arrayPaquetes.size(); i++) {
                Paquete paquete = (Paquete)arrayPaquetes.get(i);
                hilera += paquete.toString() + "\n";
            }
        }
        return hilera;


    }

    public int getCodContenedor() {
        return codContenedor;
    }

    public void setCodContenedor(int codContenedor) {
        this.codContenedor = codContenedor;
    }

    

    public double getPesoCargado() {
        return pesoCargado;
    }

    public void setPesoCargado(double pesoAlmacenado) {
        this.pesoCargado = pesoAlmacenado;
    }
}
