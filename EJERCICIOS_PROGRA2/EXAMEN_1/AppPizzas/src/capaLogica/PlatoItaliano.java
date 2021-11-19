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
public class PlatoItaliano {
    protected ArrayList <Extra> arrayExtras;
    protected final double PRECIO=1000;
    private boolean paraLlevar;
    
    public PlatoItaliano(boolean paraLlevarp){
        this.paraLlevar=paraLlevarp;
        this.arrayExtras= new ArrayList();
    }
    
    public void agregarExtras(Extra extra){
        arrayExtras.add(extra);
    }
    public double  adicionalLlevar(){
        return(this.paraLlevar)?100:0;
    }
    public double precioInicialPlato(){
        return this.PRECIO+adicionalLlevar();
        
    }
    public double totalExtras(){
        int sumaExtra=0;
        for (Extra arrayExtra : arrayExtras) {
            sumaExtra+=arrayExtra.getPrecio();
        }
        return sumaExtra;
    }
    public double precioTotalPlato(){
        return precioInicialPlato()+totalExtras();
      
    }

    @Override
    public String toString() {
       StringBuilder hilera = new StringBuilder();
      if(paraLlevar){
          hilera.append("\nPara llevar:").append(this.PRECIO);
          hilera.append("\nPrecio del plato con cobro para llevar: ").append(this.precioInicialPlato());
      }
      hilera.append("\nExtras agregadas: ");
        for (Extra arrayExtra : arrayExtras) {
            hilera.append("\n"+arrayExtra.toString()+" ").append(arrayExtra.getPrecio());
        }
        hilera.append("\nPrecio total del plato: ").append(this.precioTotalPlato());
       
       return hilera.toString();
               
    }

    public ArrayList<Extra> getArrayExtras() {
        return arrayExtras;
    }

    public void setArrayExtras(ArrayList<Extra> arrayExtras) {
        this.arrayExtras = arrayExtras;
    }

    public boolean isParaLlevar() {
        return paraLlevar;
    }

    public void setParaLlevar(boolean paraLlevar) {
        this.paraLlevar = paraLlevar;
    }
    
    
    
}
