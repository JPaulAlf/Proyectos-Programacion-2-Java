
package ReciboElectricidad;


public class Medidor {
    private int numMedidor;
    private TipoMedidor tipo;
    
    public Medidor(int numMedidorp,TipoMedidor tipop){
        this.numMedidor=numMedidorp;
        this.tipo=tipop;
    }
    public String toString(){
        return "\nMedidor numero: "+numMedidor+" "+tipo;    
    }

    public int getNumMedidor() {
        return numMedidor;
    }
    public void setNumMedidor(int numMedidor) {
        this.numMedidor = numMedidor;
    }

    public TipoMedidor getTipo() {
        return tipo;
    }
    public void setTipo(TipoMedidor tipo) {
        this.tipo = tipo;
    }
    
    
}
