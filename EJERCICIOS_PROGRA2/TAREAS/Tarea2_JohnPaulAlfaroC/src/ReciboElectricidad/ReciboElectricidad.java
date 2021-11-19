
package ReciboElectricidad;

public class ReciboElectricidad {
    static int contadorRecibos=999;
    int numeroRecibo;
    Cliente cliente;
    Medidor medidor;
    int lectauraAnterior;
    int lecturaActual; 
    final int  PRECIO1=30, PRECIO2=40, PRECIO3=50; 
    final float IVA=(float)0.13;
    
    public ReciboElectricidad(Cliente clientep, Medidor medidorp, int anterior, int actual){
        this.cliente= clientep;
        this.medidor= medidorp;
        this.lectauraAnterior=anterior;
        this.lecturaActual=actual;
        this.contadorRecibos=++contadorRecibos;
    }
    
    public int cantidadKwh(){
        int calculoCantidad=0;
        if(this.lectauraAnterior<=10000&&this.lecturaActual>0&&this.lecturaActual<10000){
            if(this.lectauraAnterior>this.lecturaActual){
                calculoCantidad=(10000-this.lectauraAnterior)+this.lecturaActual;
                return calculoCantidad;
            }else{
                calculoCantidad=this.lecturaActual-this.lectauraAnterior;
                  return calculoCantidad;
            }    
        }
        return calculoCantidad;
    }
    public float montoKwh(){
        if(this.cantidadKwh()<=250){
            if(medidor.getTipo().equals(TipoMedidor.Comercial)){
                return (float)(this.cantidadKwh()*(1.5*this.PRECIO1));
            }else{
                return this.cantidadKwh()*this.PRECIO1;
            }
        }else if(this.cantidadKwh()>250 && this.cantidadKwh()<=400){
             if(medidor.getTipo().equals(TipoMedidor.Comercial)){
                return (float)(((this.cantidadKwh()-250)*(1.5*this.PRECIO2))+(250*(1.5*this.PRECIO1)));
            }else{
                return (((this.cantidadKwh()-250)*this.PRECIO2)+(250*this.PRECIO1));
            }
        }else if(this.cantidadKwh()>400){
              if(medidor.getTipo().equals(TipoMedidor.Comercial)){
                return (float)(((this.cantidadKwh()-400)*(1.5*this.PRECIO3))+(250*(1.5*this.PRECIO1))+(150*(1.5*this.PRECIO2)));
            }else{
                return ((this.cantidadKwh()-400)*this.PRECIO3)+(150*this.PRECIO2)+(250*this.PRECIO1);
            }
        }
        return 0;
    }
    public float descuentoPorGenero(){
        if(cliente.getGenero().equals(Genero.Femenino)){
            return (float)(montoKwh()*0.10);
        }else{
            return 0;
        }
    }
    public float impuestoVentas(){
        return(float)(this.montoKwh()*this.IVA);
    }
    public double montoTotalPagar(){
        return this.montoKwh()-this.descuentoPorGenero()+this.impuestoVentas();
    }
    public String toString(){
         StringBuilder hilera = new StringBuilder();
         hilera.append("Recibo de electricidad No. ").append(contadorRecibos);
         hilera.append(this.medidor.toString());
         hilera.append("\nCliente: ").append(this.cliente.getNombre());
         hilera.append("\nGenero: ").append(this.cliente.getGenero());
         hilera.append("\nLectura anterior: ").append(this.lectauraAnterior);
         hilera.append("\nLectura actual: ").append(this.lecturaActual);
         hilera.append("\nKw consumidos: ").append(this.cantidadKwh());
         hilera.append("\nCosto por consumo de Kwhs: ").append(this.montoKwh()).append(" colones");
         hilera.append("\nDescuento por genero: ").append(this.descuentoPorGenero()).append(" colones");
         hilera.append("\nImpuesto de ventas: ").append(this.impuestoVentas()).append(" colones");
         hilera.append("\nTotal a pagar: ").append(this.montoTotalPagar()).append(" colones");
         return hilera.toString();
    }

    public static int getContadorRecibos() {
        return contadorRecibos;
    }
    public static void setContadorRecibos(int contadorRecibos) {
        ReciboElectricidad.contadorRecibos = contadorRecibos;
    }

    public int getNumeroRecibo() {
        return numeroRecibo;
    }
    public void setNumeroRecibo(int numeroRecibo) {
        this.numeroRecibo = numeroRecibo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Medidor getMedidor() {
        return medidor;
    }
    public void setMedidor(Medidor medidor) {
        this.medidor = medidor;
    }

    public int getLectauraAnterior() {
        return lectauraAnterior;
    }
    public void setLectauraAnterior(int lectauraAnterior) {
        this.lectauraAnterior = lectauraAnterior;
    }

    public int getLecturaActual() {
        return lecturaActual;
    }
    public void setLecturaActual(int lecturaActual) {
        this.lecturaActual = lecturaActual;
    }
    
    
}


//if(this.lectauraAnterior <= 10000 && this.lecturaActual <= 10000){
//            calculoCantidad=(10000-this.lectauraAnterior)-this.lecturaActual;
//         //   return (int)Math.abs(this.lectauraAnterior-this.lecturaActual);
//            if(calculoCantidad<=0){
//               return Math.abs(calculoCantidad)+this.lecturaActual; 
//            }
//            return calculoCantidad;
//        }else{
//            return 0;
//        }