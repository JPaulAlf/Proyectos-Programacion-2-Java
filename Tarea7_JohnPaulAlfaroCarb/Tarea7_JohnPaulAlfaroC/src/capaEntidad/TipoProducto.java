package capaEntidad;

public enum TipoProducto {
    NACIONAL(0.10),
    IMPORTADO(0.20);

    private double porcentaje;
    private TipoProducto(double porcentaje){
    this.porcentaje= porcentaje;
    }
    
    public double getPorcentaje() {
        return porcentaje;
    }
        
  


}
