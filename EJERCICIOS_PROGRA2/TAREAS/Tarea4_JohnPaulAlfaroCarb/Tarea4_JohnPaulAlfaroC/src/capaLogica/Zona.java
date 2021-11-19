/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaLogica;

/**
 *
 * @author johnpaul
 */
public enum Zona {
    Area_Metropolitana{
         public String toString(){
            return "Área metropolitana";
        }
    },
    Area_Norte{
          public String toString(){
            return "Zona Norte";
        }
    }, 
    Pacifico_Central{
        public String toString(){
            return "Pacífico Central";
        }
    },
    Pacifico_Norte{
        public String toString(){
            return "Pacífico Norte";
        }
    }, 
    Pacifico_Sur{
        public String toString(){
            return "Pacífico Sur";
        }
    }, 
    Zona_Atlantica{
        public String toString(){
            return "Zona Atlantica";
        }
    };
    
}
