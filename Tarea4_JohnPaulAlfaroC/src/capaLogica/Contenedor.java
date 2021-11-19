/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaLogica;

import java.util.ArrayList;

/**
 *
 * @author johnpaul
 */
public class Contenedor {
    static int cantidadContenedores=0;
    private int codContenedor;
    private double pesoCargado;
    private double pesoMaximo;
    private ArrayList<Paquete> arrayPaquetes;
    
    public Contenedor(double pesoMaximop){
        this.pesoMaximo= pesoMaximop;
        this.codContenedor= cantidadContenedores++;;
        this.pesoCargado=0;
        this.arrayPaquetes=  new ArrayList();        
       
    }
    
    public boolean cargarPaquete(Paquete paquete){
        if(paquete.getPeso()<=this.pesoMaximo){
            this.arrayPaquetes.add(paquete);
            this.pesoCargado= this.pesoCargado+ paquete.getPeso();
            return true;
        }
            return false;
    }
    public String toString(){
        StringBuilder hilera = new StringBuilder();
        hilera.append("Contenedor: ").append(cantidadContenedores);
        hilera.append("\nPeso total almacenado: ").append(this.pesoCargado);
        hilera.append("\nPaquetes almacenados en el contenedor: ");
        hilera.append("\n------------------------------------------");
        if(!arrayPaquetes.isEmpty()){
        for (Paquete arrayPaquete : arrayPaquetes) {
            hilera.append(arrayPaquete.toString());
            hilera.append("\n------------------------------------------");
        }
        }else{
            hilera.append("Nose han agregado paquetes");
            hilera.append("\n------------------------------------------");
        }
        return hilera.toString();
    }

    public static int getCantidadContenedores() {
        return cantidadContenedores;
    }
    public static void setCantidadContenedores(int cantidadContenedores) {
        Contenedor.cantidadContenedores = cantidadContenedores;
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
    public void setPesoCargado(double pesoCargado) {
        this.pesoCargado = pesoCargado;
    }
    public double getPesoMaximo() {
        return pesoMaximo;
    }
    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
    public ArrayList<Paquete> getArrayPaquetes() {
        return arrayPaquetes;
    }
    public void setArrayPaquetes(ArrayList<Paquete> arrayPaquetes) {
        this.arrayPaquetes = arrayPaquetes;
    }
      
}// fin de la clase
