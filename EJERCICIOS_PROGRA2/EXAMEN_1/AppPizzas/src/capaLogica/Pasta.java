/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaLogica;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Pasta extends PlatoItaliano{
 protected TipoPasta tipoPasta;
 public Pasta(boolean paraLlevar){
     super(paraLlevar);
 }
 
 @Override
 public double precioInicialPlato(){
     double adicional=0;
      if(tipoPasta.equals(TipoPasta.Canelon) ||tipoPasta.equals(TipoPasta.Lasagna) ){
          adicional=0.10*super.PRECIO;
      }       
      return super.precioInicialPlato()+adicional;
      
 }

    @Override
    public String toString() {
        return "\nPlato de Pasta"+"\nTipo de pasta: "+tipoPasta.toString()+" Precio: "+super.PRECIO+
                super.toString();
    }

    
    
    
    public TipoPasta getTipoPasta() {
        return tipoPasta;
    }

    public void setTipoPasta(TipoPasta tipoPasta) {
        this.tipoPasta = tipoPasta;
    }

    
    
    public ArrayList<Extra> getArrayExtras() {
        return arrayExtras;
    }

    public void setArrayExtras(ArrayList<Extra> arrayExtras) {
        this.arrayExtras = arrayExtras;
    }
 
    
    
}
