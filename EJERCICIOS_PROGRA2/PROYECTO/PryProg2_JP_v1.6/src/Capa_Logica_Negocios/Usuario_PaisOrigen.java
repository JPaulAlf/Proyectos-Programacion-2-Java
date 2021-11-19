/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

import java.io.Serializable;

/**
 *
 * @author johnpaul
 */
public class Usuario_PaisOrigen implements Serializable{
    private int codigo;
    private String nombre;
    private static int cont1=1;

    public Usuario_PaisOrigen(String nombre) {
        this.nombre = nombre;
        this.codigo=(int)((Math.random()*200)+1);
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public static int getCont1() {
        return cont1;
    }
    public static void setCont1(int cont1) {
        Usuario_PaisOrigen.cont1 = cont1;
    }

    @Override
    public String toString() {
        return "\nPais de origen: "+nombre+"  Codigo de Pais: "+codigo;
    }
    
    
    
    
}
