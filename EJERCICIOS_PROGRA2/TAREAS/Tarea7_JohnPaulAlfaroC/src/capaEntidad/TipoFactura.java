
package capaEntidad;


public enum TipoFactura {
    //Indique el atributo 
   CONTADO(0.05),
   CREDITO(0);
   
      private double porcentaje;
    private TipoFactura(double porcentaje){
    this.porcentaje= porcentaje;
    }
    
    public double getPorcentaje() {
        return porcentaje;
    }
    
}   
