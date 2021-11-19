
package capaEntidad;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Factura {
   
    private static int contFactura = 100;
    private int numeroFactura;
    private TipoFactura tipoFactura;
    private ArrayList<LineaDetalle> arrayLineaDetalle;
    private final double IVA=0.13;
    
    public Factura(TipoFactura tipoFactura) {
        this.tipoFactura = tipoFactura;
        this.numeroFactura = contFactura++;
        this.arrayLineaDetalle= new ArrayList();
    }
    
    public void agregarLineaDetalle(Producto prod,int cant){
        LineaDetalle linea = new LineaDetalle(cant, prod);
        this.arrayLineaDetalle.add(linea);
      
    }  
    public double calcularDescuento(){
        //Calcular el descuento de acuerdo a el tipo de factura: CREDITO o CONTADo
        return this.calcularSubTotal()*tipoFactura.getPorcentaje();
    }  
    public double calcularImpuesto(){
        return (this.calcularSubTotal()-this.calcularDescuento())*this.IVA;
    }
    public double calcularSubTotal(){
        double total=0;
        for (LineaDetalle lineaDetalle : arrayLineaDetalle) {
            total+= lineaDetalle.costoLinea();
        }
        return total;
    }
    public double calcularTotalFactura(){
        return this.calcularSubTotal()+this.calcularImpuesto()-this.calcularDescuento();
    }

    
    
    
    public int getNumeroFactura() {
        return numeroFactura;
    }

    public TipoFactura getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(TipoFactura tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    @Override
    public String toString() {
        DecimalFormat formatoNumero = new DecimalFormat("#,##0.00");
        StringBuilder h = new StringBuilder();
        h.append("No. Factura:").append(this.getNumeroFactura())
                .append(" ").append(tipoFactura).append("\n");
       //Mostrar todas las líneas de detalle
        for (LineaDetalle lineaDetalle : arrayLineaDetalle) {
            h.append(lineaDetalle.toString());
        }
        
        
        
        h.append("SubTotal:").append(formatoNumero.format(calcularSubTotal())).append("\n");
        h.append("Descuento:").append(formatoNumero.format(this.calcularDescuento())).append("\n");
        h.append("Impuesto:").append(formatoNumero.format(this.calcularImpuesto())).append("\n");
        h.append("Total Factura:").append(formatoNumero.format(this.calcularTotalFactura())).append("\n");
                
        return h.toString(); 
    }
}
