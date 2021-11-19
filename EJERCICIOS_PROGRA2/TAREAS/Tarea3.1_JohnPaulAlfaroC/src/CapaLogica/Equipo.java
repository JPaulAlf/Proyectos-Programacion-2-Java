/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaLogica;

import java.util.ArrayList;

/**
 *
 * @author johnpaul
 */
public class Equipo {
    private static int cont=1;
    private String codigoEquipo;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosPerdidos;
    private int golesFavor;
    private int golesContra;
    private ArrayList<Jugador> array;
    private Entrenador entrenador;

    public Equipo(String codigoEquipo, int partidosJugados, int partidosGanados, int partidosPerdidos, int golesFavor, int golesContra) {
        this.codigoEquipo = codigoEquipo;
        this.partidosJugados = partidosJugados;
        this.partidosGanados = partidosGanados;
        this.partidosPerdidos = partidosPerdidos;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.array= new ArrayList();
    }

    public int partidosEmpatados(){
         if(this.partidosJugados>0&& this.partidosJugados>0&&this.partidosPerdidos>0){
            return ( (this.partidosJugados-this.partidosPerdidos) - this.partidosGanados);
        }
         return 0;
    }
    public String llenaEquipo(Jugador jugador){
          if(array.size()<=22){
            array.add(jugador);
            this.cont++;
            return "Jugador agregado exitosamente";
        }else{
                return "Jugador no agregado ";
        }
    }
    public int puntosObtenidos(){
        int puntos=0;
        puntos= (this.partidosGanados*3);
        if(this.partidosJugados>0&& this.partidosJugados>0&&this.partidosPerdidos>0){
            puntos=puntos+( (this.partidosJugados-this.partidosPerdidos) - this.partidosGanados)*1;
        }
        if(puntos>20 && this.golesContra==0){
            puntos=puntos+this.golesFavor*1;
        }
        return puntos;
    }
    public String categoriaEquipo(){
        if(this.puntosObtenidos()>0 &&this.puntosObtenidos()<=10){
            return "C";
        }else if(this.puntosObtenidos()>=11 &&this.puntosObtenidos()<=25){
            return "B";
        }else{
            return "A";
        }
    }
    public double totoalPagoSalariosJugadores(){
        double salario=0;
          for (int i = 0; i < array.size(); i++) {
                salario= salario+array.get(i).calculoSalarioTotal();
                      }
          return salario;
    }
    @Override
    public String toString(){
        StringBuilder hilera = new StringBuilder();
        hilera.append("Informacion equipo: \n");
        hilera.append("Codigo equipo: ").append(this.codigoEquipo +"\n");
        hilera.append("Partidos jugados: ").append(this.partidosJugados+"\n");
        hilera.append("Partidos ganados: ").append(this.partidosGanados+"\n");
        hilera.append("Partidos perdidos: ").append(this.partidosPerdidos+"\n");
        hilera.append("Partidos empatados: ").append(this.partidosEmpatados()+"\n");
        hilera.append("Puntos obtenidos: ").append(this.puntosObtenidos()+"\n");
        hilera.append("Goles a favor: ").append(this.golesFavor+"\n");
        hilera.append("Goles en contra: ").append(this.golesContra+"\n");
        hilera.append("Categoria: ").append(this.categoriaEquipo()+"\n");
        hilera.append("==========================");
        hilera.append("Datos entrenador: \n");
        hilera.append(entrenador.toString()+"\n");
        hilera.append("==========================");
        hilera.append("Jugadores del equipo: \n");
         if(array.size()>0){
            for (int i = 0; i < array.size(); i++) {
                hilera.append(array.get(i).toString());
                hilera.append("----------------------------------------------\n");
                      }
        }else{
            hilera.append("\n Aun no han asignado ningun jugador");
        }
         hilera.append("Total pago de salarios jugadores: ").append(this.totoalPagoSalariosJugadores()+"\n");
         hilera.append("____________________________________________________________________________________\n");
        return hilera.toString();
    }
    
    public String getCodigoEquipo() {
        return codigoEquipo;
    }
    public void setCodigoEquipo(String codigoEquipo) {
        this.codigoEquipo = codigoEquipo;
    }
    public int getPartidosJugados() {
        return partidosJugados;
    }
    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
    public int getPartidosGanados() {
        return partidosGanados;
    }
    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }
    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }
    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }
    public int getGolesFavor() {
        return golesFavor;
    }
    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }
    public int getGolesContra() {
        return golesContra;
    }
    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }
}// fin de la clase
