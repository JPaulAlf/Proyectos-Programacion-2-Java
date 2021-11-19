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
public enum TIPO_TARJETA {
    VISA{
        @Override
        public String toString() {
            return "Visa";
        }
        
    },
    MASTER_CARD{
        @Override
        public String toString() {
            return "Master Card";
        }
        
    };
}
