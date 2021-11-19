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
public class Entrenador {
    private String nombre;
    private int salarioBase;
    private float porcentajeBonificacion;
    private Nacionalidad nacionalidad;
    private Equipo equipo;
  
    public Entrenador(String nombre, int salarioBase, float porcentajeBonificacion,Nacionalidad nacionalidad ) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.porcentajeBonificacion = porcentajeBonificacion;
        this.nacionalidad= nacionalidad;
    }
    
    public double bonificacionCategoriaEquipo(){
        if(equipo.categoriaEquipo().equals("A")){
            return this.salarioBase*porcentajeBonificacion;
        }
        return 0;
    }
    public double bonificacionExtranjero(){
        if(this.nacionalidad.equals(Nacionalidad.Extranjero)){
            return this.salarioBase*0.10;
        }
        return 0;
    }
    public int bonificacionEquipoGanes(){
        if(equipo.getPartidosGanados()>0){
            return equipo.getPartidosGanados()*10000;
        }
        return 0;
    }
    public double calculoSalarioTotal(){
        return this.salarioBase+this.bonificacionCategoriaEquipo()+this.bonificacionEquipoGanes()+this.bonificacionExtranjero();
    }
    @Override
    public String toString(){
       return "\nNombre: "+this.nombre+
                "\nTipo entrenador: "+this.nacionalidad+
                "\nSalario base: "+this.salarioBase+
                "\nBonificacion: "+this.porcentajeBonificacion+
                "\nAdicional entrenador por categoria: "+this.bonificacionCategoriaEquipo()+
                "\nAdicional entrenador por partidos ganados: "+this.bonificacionEquipoGanes()+
                "\nAdicional entrenador si es extranjero: "+ this.bonificacionExtranjero()+
                "\nSalario de entrenador: "+this.calculoSalarioTotal();     
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
    public float getPorcentajeBonificacion() {
        return porcentajeBonificacion;
    }
    public void setPorcentajeBonificacion(float porcentajeBonificacion) {
        this.porcentajeBonificacion = porcentajeBonificacion;
    }
    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
}// fin de la clase
