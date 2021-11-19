
package capaEntidad;


public class LineaDetalle {
    private int cantidad;
    private Producto producto;

    public LineaDetalle(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public double costoLinea(){
        return this.producto.calculaPrecioTotalProducto()*cantidad;
    }

    @Override
    public String toString() {
        return "LineaDetalle{ " + "Cantidad:" + cantidad + " / Producto:" + producto + " }" +"\n";
    }
    

    
    
    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    
    
}
