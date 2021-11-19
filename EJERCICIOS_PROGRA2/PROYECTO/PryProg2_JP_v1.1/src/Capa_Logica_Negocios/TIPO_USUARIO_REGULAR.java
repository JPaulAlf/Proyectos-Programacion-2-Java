/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

/**
 *
 * @author Estudiante
 */
public enum TIPO_USUARIO_REGULAR {
    USUARIO_RESIDENCIAL(0){
        @Override
        public String toString() {
            return "Usuario residencial";
        }
        
    }, 
    USUARIO_CORPORATIVO(7){
        @Override
        public String toString() {
            return "Usuario corporativo";
        }
        
    };
    
    private double precioUsuario;
    private TIPO_USUARIO_REGULAR(double preciop){
        this.precioUsuario=preciop;
    }

    public double getPrecioUsuario() {
        return precioUsuario;
    }
    
    
}
