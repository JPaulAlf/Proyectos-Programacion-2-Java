/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaLogica;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author johnpaul
 */
public class Paquete {
    private ArrayList<Descuento> arrayDescuento;
    private static int contPaquetes=1;
    private int codPaquete;
    private double peso;
    private Ciudad ciudadOrigen;
    private Ciudad ciudadDestino;
    private TipoContenido tipoContenido;
    private final int COSTO_TRASLADO_1=2, COSTO_TRASLADO_2=5;
    
    public Paquete(double peso){
        this.peso= peso;
            this.arrayDescuento= new ArrayList();
            this.codPaquete=contPaquetes++;;
            this.ciudadOrigen=null;
            this.ciudadDestino=null;
            this.tipoContenido= null;
    }

    public void agregarDescuento(Descuento miDescuento){
        if(miDescuento!=null){
            this.arrayDescuento.add(miDescuento);
        }
    }
    public double costoTraslado(){
        double costoTraslado=0;
            if(this.ciudadOrigen.equals(this.ciudadDestino)){
                costoTraslado= this.peso*this.COSTO_TRASLADO_1;
            }else{
                costoTraslado= this.peso*this.COSTO_TRASLADO_2;
            }
            return costoTraslado;
    }
    public double costoTipoContenido(){
        if(this.tipoContenido.equals(this.tipoContenido.Perecedero)){
            return this.tipoContenido.getExtra();
        }else{
            return this.tipoContenido.getExtra();
        }
    }
    public double subTotal(){
        return this.costoTraslado()+this.costoTipoContenido();
    }
    public double totalDescuentos(){
        double descuento=0;
        if(!this.arrayDescuento.isEmpty()){
        for (Descuento descuentop : arrayDescuento) {
            descuento= descuento+ descuentop.getExtra();
        }
        }
        return this.subTotal()*descuento; 
    }
    public double costoTotal(){
        return this.subTotal()-this.totalDescuentos();
    }
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        StringBuilder hilera = new StringBuilder();
        hilera.append("\nCodigo de Paquete: ").append(this.codPaquete);
        hilera.append("\nPeso del paquete: ").append(this.peso);
        hilera.append("\nCosto por traslado: ").append("$").append(df.format(this.costoTraslado()));
        hilera.append("\nCosto por contenido: ").append("$").append(df.format(this.costoTipoContenido()));
        hilera.append("\nSubtotal: ").append("$").append(df.format(this.subTotal()));
        hilera.append("\nDescuentos aplicados:");
        for (Descuento descuento : arrayDescuento) {
            hilera.append("\n"+descuento.toString());
        }
        hilera.append("\nTotal descuentos aplicados: ").append("$").append(df.format(this.totalDescuentos()));
        hilera.append("\nCosto total del envio: ").append("$").append(df.format(this.costoTotal()));
        return hilera.toString();
    }
    
 
    public ArrayList<Descuento> getArrayDescuento() {
        return arrayDescuento;
    }
    public void setArrayDescuento(ArrayList<Descuento> arrayDescuento) {
        this.arrayDescuento = arrayDescuento;
    }
    public static int getContPaquetes() {
        return contPaquetes;
    }
    public static void setContPaquetes(int contPaquetes) {
        Paquete.contPaquetes = contPaquetes;
    }
    public int getCodPaquete() {
        return codPaquete;
    }
    public void setCodPaquete(int codPaquete) {
        this.codPaquete = codPaquete;
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
