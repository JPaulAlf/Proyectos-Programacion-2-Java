package CapaLogicaNegocios;

public enum Descuento {
    Cliente_Frecuente(10){
         public String toString(){
            return "Cliente Frecuente "+  getPorcentaje()+ "%"; 
         } 
    },
    Ciudadano_Oro(5){
         public String toString(){
            return "Cliente Frecuente "+  getPorcentaje()+ "%"; 
         } 
    };
    private double porcentaje;

    private Descuento(double porcentaje){
        this.porcentaje= porcentaje;
    }
    public double getPorcentaje(){
        return porcentaje;
    }
   

    
}
