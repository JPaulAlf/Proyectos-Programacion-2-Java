/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;



/**
 *
 * @author johnpaul
 */
public class Vuelo {
    static int contVuelo=0;
    private int codVuelo;
    private Ciudad ciudadOrigen;
    private Ciudad ciudadDestino;
    private TipoAvion avion;
    private Piloto piloto;
    private Pasajero [] arrayPasajero;
    
    public Vuelo(Ciudad origen, Ciudad destino, TipoAvion avion, Piloto piloto){
        this.arrayPasajero= new Pasajero[avion.getCapacidadPasajeros()];
        this.avion=avion;
        this.ciudadDestino=destino;
        this.ciudadOrigen=origen;
        this.piloto=piloto;
        this.codVuelo= contVuelo++;
    }
    
    public double distanciaEntreCiudades(){
        return 0;
    }
    public double salarioPiloto(){
        return 0;
    }
    public boolean llenaAvionPasajeros(Pasajero pasajero){
        int cont=0;
        if(cont<=this.arrayPasajero.length){
            this.arrayPasajero[cont]=pasajero;
            cont++;
            return true;
        }
        return false;
    }
    public String pasajerosVuelo(){
        return "";
    }
    public double dineroPasajes(){
        return 0;
    }
    public double ganaciaVuelo(){
       
        return 0;
    }
    @Override
    public String toString() {
        return "Vuelo{" + "codVuelo=" + codVuelo + ", ciudadOrigen=" + ciudadOrigen +
                ", ciudadDestino=" + ciudadDestino + ", avion=" + avion + ", piloto=" + piloto 
                + ", arrayPasajero=" + arrayPasajero + '}';
    }
    
    
    
    public static int getContVuelo() {
        return contVuelo;
    }
    public static void setContVuelo(int contVuelo) {
        Vuelo.contVuelo = contVuelo;
    }
    public int getCodVuelo() {
        return codVuelo;
    }
    public void setCodVuelo(int codVuelo) {
        this.codVuelo = codVuelo;
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
    public TipoAvion getAvion() {
        return avion;
    }
    public void setAvion(TipoAvion avion) {
        this.avion = avion;
    }
    public Piloto getPiloto() {
        return piloto;
    }
    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
    public Pasajero[] getArrayPasajero() {
        return arrayPasajero;
    }
    public void setArrayPasajero(Pasajero[] arrayPasajero) {
        this.arrayPasajero = arrayPasajero;
    }
    
    
    
}
