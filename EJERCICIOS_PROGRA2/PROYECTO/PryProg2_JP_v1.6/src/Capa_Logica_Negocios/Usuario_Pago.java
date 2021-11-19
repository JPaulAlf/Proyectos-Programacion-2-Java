/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author johnpaul
 */
public class Usuario_Pago implements Serializable{
    private LocalDateTime fechaPago;
    private double montoPagoColones;
    private double montoPagoDolares;
    private TIPO_MONEDA moneda;
    private Usuario_Tarjeta tarjeta;

    public Usuario_Pago(LocalDateTime fechaPago, double montoPagoDolares) {
        this.fechaPago = fechaPago;
        this.montoPagoDolares = montoPagoDolares;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }
    public void setFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
    }
    public double getMontoPagoColones() {
        return montoPagoColones;
    }
    public void setMontoPagoColones(double montoPagoColones) {
        this.montoPagoColones = montoPagoColones;
    }
    public double getMontoPagoDolares() {
        return montoPagoDolares;
    }
    public void setMontoPagoDolares(double montoPagoDolares) {
        this.montoPagoDolares = montoPagoDolares;
    }
    public TIPO_MONEDA getMoneda() {
        return moneda;
    }
    public void setMoneda(TIPO_MONEDA moneda) {
        this.moneda = moneda;
    }
    public Usuario_Tarjeta getTarjeta() {
        return tarjeta;
    }
    public void setTarjeta(Usuario_Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    public double conversionColones(){
        return this.montoPagoColones= this.montoPagoDolares*this.moneda.DOLARES.getValor();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoFecha= DateTimeFormatter.ofPattern("MMM/yyyy");
        DecimalFormat formatoDinero = new DecimalFormat("###,###,##0.00");
        return "\nFecha de pago: "+this.fechaPago.format(formatoFecha)+
                "\nMonto de pago en colones: "+formatoDinero.format(this.conversionColones())+" colones"+
                "\nMonto de pago en dolares: "+this.montoPagoDolares+" dolares";
    }
    
    
    
    
}// listo 
