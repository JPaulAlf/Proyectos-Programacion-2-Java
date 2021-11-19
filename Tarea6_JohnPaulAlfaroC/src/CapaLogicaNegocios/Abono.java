/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogicaNegocios;

import java.time.LocalDate;

/**
 *
 * @author johnpaul
 */
public class Abono {
    private int numeroAbono;
    private double montoAbono;
    private LocalDate fecha;
    private TipoPago tipo;

    public Abono(int numeroAbono, double montoAbono, TipoPago tipo) {
        this.numeroAbono = numeroAbono;
        this.montoAbono = montoAbono;
        this.fecha=fecha.now();
        this.tipo = tipo;
    }

    public int getNumeroAbono() {
        return numeroAbono;
    }

    public void setNumeroAbono(int numeroAbono) {
        this.numeroAbono = numeroAbono;
    }

    public double getMontoAbono() {
        return montoAbono;
    }

    public void setMontoAbono(double montoAbono) {
        this.montoAbono = montoAbono;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public TipoPago getTipo() {
        return tipo;
    }

    public void setTipo(TipoPago tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Abono{" + "numeroAbono=" + numeroAbono +
                ", montoAbono=" + montoAbono + ", fecha=" + fecha + ", tipo=" + tipo + '}';
    }
    
    
}
