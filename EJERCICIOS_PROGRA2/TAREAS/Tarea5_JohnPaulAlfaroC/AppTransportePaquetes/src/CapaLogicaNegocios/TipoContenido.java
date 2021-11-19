
package CapaLogicaNegocios;

public enum TipoContenido {
    Perecedero(50),
    No_Perecedero(10);
    private TipoContenido(double adicional){
        this.montoAdicional= adicional;
    }
    private double montoAdicional;
    public double getMontoAdicional(){
        return montoAdicional;
    }
}
