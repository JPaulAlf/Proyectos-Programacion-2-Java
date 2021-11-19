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
public enum TIPOS_IDIOMAS implements Serializable{
    ESPANNOL_LATINOAMERICA{
        @Override
        public String toString() {
            return "Español (Ltm)";
        }
        
    },  
    ESPANNOL_ESPANNA{
        @Override
        public String toString() {
            return "Español (Spñ)";
        }
        
    },
    INGLES{
        @Override
        public String toString() {
            return "Ingles";
        }
        
    },
    FRANCES{
        @Override
        public String toString() {
            return "Frances";
        }
        
    },
    PORTUGUES{
        @Override
        public String toString() {
            return "Portugues";
        }
        
    },
    CHINO{
        @Override
        public String toString() {
            return "Chino";
        }
        
    },
    SUBTITULADA_INGLES{
        @Override
        public String toString() {
            return "Sub. Ingles";
        }
        
    },
    SUBTITULADA_ESPANNOL{
        @Override
        public String toString() {
            return "Sub. Español";
        }
        
    },
    COREANO{
        @Override
        public String toString() {
            return "Coreano";
        }
        
    };
}