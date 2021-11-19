/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Logica_Negocios;

/**
 *
 * @author johnpaul
 */
public enum TIPOS_IDIOMAS {
    ESPANNOL_LATINOAMERICA{
        @Override
        public String toString() {
            return "Español (LatinoAmerica)";
        }
        
    },  
    ESPANNOL_ESPANNA{
        @Override
        public String toString() {
            return "Español (España)";
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
            return "Chino tradicional";
        }
        
    },
    SUBTITULADA_INGLES{
        @Override
        public String toString() {
            return "Subtitulada ingles";
        }
        
    },
    SUBTITULADA_ESPANNOL{
        @Override
        public String toString() {
            return "Subtitulada español";
        }
        
    },
    COREANO{
        @Override
        public String toString() {
            return "Coreano";
        }
        
    };
  
}
