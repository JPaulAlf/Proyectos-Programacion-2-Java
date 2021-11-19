
package capaEntidad;


public class Producto {
    private String nombre;
    private double precioBasico;
    private TipoProducto tipo;

    public Producto(String nombre, double precioBasico, TipoProducto tipo) {
        this.nombre = nombre;
        this.precioBasico = precioBasico;
        this.tipo = tipo;
    }

    public double calculaPrecioAdicional(){
        //Calcula el adicional que se cobra de acuerdo al tipo de producto: NACIONAL o IMPORTADO 
            return precioBasico*tipo.getPorcentaje(); 
    }
    
    public double calculaPrecioTotalProducto(){
        //Calcula el precio total del producto que consiste en su precio básico más el adicional de acuerdo al tipo de producto
        return precioBasico+this.calculaPrecioAdicional();
    }

    @Override
    public String toString() {
        String hilera = "";
        hilera+=nombre+" - "+ calculaPrecioTotalProducto();    
        return hilera;
    }
    
   
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBasico() {
        return precioBasico;
    }

    public void setPrecioBasico(double precioBasico) {
        this.precioBasico = precioBasico;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }
    
    
    
}
