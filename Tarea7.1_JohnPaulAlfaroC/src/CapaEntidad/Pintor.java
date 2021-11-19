/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaEntidad;

import java.util.ArrayList;

/**
 *
 * @author johnpaul
 */
public class Pintor {
    private String nombre;
    private String codPintor;
    private double tarifa;
    private ArrayList <Pared> cantidadParedes;
    
    public Pintor(String codigop, String nombrep, double tarifap){
        this.codPintor=codigop;
        this.nombre=nombrep;
        this.tarifa= tarifap;
        this.cantidadParedes= new ArrayList();
    }
    
    public void agregarPared(Pared pared){
        cantidadParedes.add(pared);
    }
    public double areaTotalPintar(){
        double area=0;
        for (Pared cantidadParede : cantidadParedes) {
            area+= cantidadParede.areaCubrir();
        }
        return area;
    }
    public double costoManoObra(){
        double tamanno=0;
            for (Pared cantidadParede : cantidadParedes) {
                tamanno+=cantidadParede.areaCubrir();
            }
            return tamanno*tarifa;
    }
    public double costoTotalPintura(){
        double costo=0;
        for (Pared cantidadParede : cantidadParedes) {
            costo+= cantidadParede.costoPared();
        }
        
        return costo;
    }
    
    
    @Override
    public String toString() {
        String hilera= "Pintor: "+codPintor + "  Nombre: "+nombre+"\n"+
                "tarifa por metro cuadrado"+tarifa+"\n"+
                "Paredes asignadas: \n";
                for (Pared cantidadParede : cantidadParedes) {
            hilera+=cantidadParede.toString();
                 }
                
              hilera+= "Area total a pintar "+areaTotalPintar()+"mts cuadrados \n";
              hilera+="Costo total por contrato de la obra: "+ costoManoObra()+"\n";
              hilera+= "Costo total por la pintura: "+ costoTotalPintura()+"\n";
              hilera+="*************************************************************************\n";
                return hilera;
    }

    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodPintor() {
        return codPintor;
    }
    public void setCodPintor(String codPintor) {
        this.codPintor = codPintor;
    }
    public double getTarifa() {
        return tarifa;
    }
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    public ArrayList<Pared> getCantidadParedes() {
        return cantidadParedes;
    }
    public void setCantidadParedes(ArrayList<Pared> cantidadParedes) {
        this.cantidadParedes = cantidadParedes;
    }
    
    
    
    
    
}// fin de la clase
