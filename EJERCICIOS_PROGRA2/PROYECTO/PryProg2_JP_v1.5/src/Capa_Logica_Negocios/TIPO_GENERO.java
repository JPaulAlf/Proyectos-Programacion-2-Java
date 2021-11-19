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
public enum TIPO_GENERO implements Serializable {
    DRAMA{
        @Override
        public String toString() {
            return "Drama";
                    }
        
    },
    SUSPENSO{
        @Override
        public String toString() {
            return "Suspenso";
                    }
        
    },
    MISTERIO{
        @Override
        public String toString() {
            return "Misterio"; 
                    }
        
    },
    ACCION{
        @Override
        public String toString() {
            return "Accion";
                    }
        
    },
    TERROR{
        @Override
        public String toString() {
            return "Terror";
                    }
        
    },
    CIENCIA_FICCION{
        @Override
        public String toString() {
            return "Ciencia Ficcion";
                    }
        
    },
    COMEDIA{
        @Override
        public String toString() {
            return "Comedia";
                    }
        
    },
    ROMATICA{
        @Override
        public String toString() {
            return "Romantica";
                    }
        
    };
}
