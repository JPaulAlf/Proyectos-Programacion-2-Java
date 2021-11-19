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
public class Jugador {
    private String nombre;
    private int salarioBase;
    private float porcentajeMotivacional;
    private Posicion pocision;
    private Equipo equipo;

    public Jugador(String nombre, int salarioBase, float porcentajeMotivacional, Posicion pocision) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.porcentajeMotivacional = porcentajeMotivacional;
        this.pocision = pocision;
    }

    public double calculoSalarioTotal(){
        double adicional=0;
        if(equipo.categoriaEquipo().equals("A")||equipo.categoriaEquipo().equals("B")){
            adicional=this.salarioBase*this.porcentajeMotivacional;
            return this.salarioBase+adicional;
        }else if(equipo.categoriaEquipo().equals("C")){
            adicional=salarioBase*0.10;
            return this.salarioBase-adicional;
        }
        return 0;
    }
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+"\nSalario base: "+this.salarioBase+
                 "\nBonificacion: "+this.porcentajeMotivacional+"\nPosicion de juego: "+this.pocision;
                
    }
    

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }
    public float getPorcentajeMotivacional() {
        return porcentajeMotivacional;
    }
    public void setPorcentajeMotivacional(float porcentajeMotivacional) {
        this.porcentajeMotivacional = porcentajeMotivacional;
    }
    public Posicion getPocision() {
        return pocision;
    }
    public void setPocision(Posicion pocision) {
        this.pocision = pocision;
    }  
    
}// fin de la clase
