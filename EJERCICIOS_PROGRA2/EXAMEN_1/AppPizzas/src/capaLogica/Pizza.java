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
public class Pizza extends PlatoItaliano{
    protected TipoPizza tipoPizza; // hacer set para colocar el tipo
    
    public Pizza(boolean paraLlevar){
        super(paraLlevar);
    }
    
    
    
    
    @Override
    public double precioInicialPlato(){
      double adicional=0;
      if(tipoPizza.equals(TipoPizza.Gruesa)||tipoPizza.equals(TipoPizza.Siciliana)){
          adicional=0.10*super.PRECIO;
      }       
      return super.precioInicialPlato()+adicional;
    }

    @Override
    public String toString() {
        return "\nPizza"+"\nTipo de pasta: "+tipoPizza.toString()+" Precio: "+super.PRECIO+
                super.toString();
    }

    public TipoPizza getTipoPizza() {
        return tipoPizza;
    }

    public void setTipoPizza(TipoPizza tipoPizza) {
        this.tipoPizza = tipoPizza;
    }

    public ArrayList<Extra> getArrayExtras() {
        return arrayExtras;
    }

    public void setArrayExtras(ArrayList<Extra> arrayExtras) {
        this.arrayExtras = arrayExtras;
    }
    
    
    
}
