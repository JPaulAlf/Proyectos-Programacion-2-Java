/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogicaNegocios;

import java.util.ArrayList;

/**
 *
 * @author johnpaul
 */
public class Apartado {
    private static int contadorApartado=1;
    private ArrayList<Articulo> arrayArticulo;
    private ArrayList<Abono> arrayAbono;
    private Cliente cliente;
    private int numero;
    private double saldo;
    private int cantidadAbonos;

    public Apartado() {
        this.arrayAbono= new ArrayList();
        this.arrayArticulo=new ArrayList();
        this.numero=contadorApartado++;;
        this.saldo=0;
        
    }
    public Apartado(Cliente cliente) {
        this.arrayAbono= new ArrayList();
        this.arrayArticulo=new ArrayList();
        this.cliente=cliente;
        this.numero=contadorApartado++;;
        this.saldo=0;
        
    }
    
    
    public void agregarArticulo(Articulo articulo){
       this.arrayArticulo.add(articulo);
       saldo+= articulo.getPrecio();
    }
    
    public String registrarAbono(double montoAbonop, TipoPago tipo){
          String valor = "El abono se efectúo correctamente";
        if(this.saldo == 0){
            valor = "Se está abonando a un apartado ya cancelado";
        }else if( montoAbonop > this.saldo){
            valor = "El abono es mayor al saldo";
        }else{
            this.saldo -= montoAbonop;
            int num = arrayAbono.size();
            arrayAbono.add(new Abono(++num,montoAbonop,tipo));
            cantidadAbonos = arrayAbono.size();
        }
        return valor;

    }

    @Override
    public String toString(){
        StringBuilder hilera = new StringBuilder();
        hilera.append("****************************************************\n");
        hilera.append("*** Apartado No."+this.numero+"***");
        hilera.append("\n"+cliente.toString());
        
        hilera.append("\nArticulos registrados ---->\n");
        if(!arrayArticulo.isEmpty()){
        for (Articulo articulo : arrayArticulo) {
            hilera.append(articulo.toString()+"\n");
        }
        }else{
            hilera.append("\nAun no hay articulos seleccionados");
        }
        
        hilera.append("\nAbonos relaizados --->\n ");
        if(!arrayAbono.isEmpty()){
            for (Abono abono : arrayAbono) {
                hilera.append(abono.toString()+"\n");
            }
        }else{
            hilera.append("Aun no hay abonos efectuados");
        }
        hilera.append("****************************************************\n");
        
        return hilera.toString();
    }
    
    
    
    public static int getContadorApartado() {
        return contadorApartado;
    }
    public static void setContadorApartado(int contadorApartado) {
        Apartado.contadorApartado = contadorApartado;
    }
    public ArrayList<Articulo> getArrayArticulo() {
        return arrayArticulo;
    }
    public void setArrayArticulo(ArrayList<Articulo> arrayArticulo) {
        this.arrayArticulo = arrayArticulo;
    }
    public ArrayList<Abono> getArrayAbono() {
        return arrayAbono;
    }
    public void setArrayAbono(ArrayList<Abono> arrayAbono) {
        this.arrayAbono = arrayAbono;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public int getCantidadAbonos() {
        return cantidadAbonos;
    }
    public void setCantidadAbonos(int cantidadAbonos) {
        this.cantidadAbonos = cantidadAbonos;
    }
    
    
    
    
}
