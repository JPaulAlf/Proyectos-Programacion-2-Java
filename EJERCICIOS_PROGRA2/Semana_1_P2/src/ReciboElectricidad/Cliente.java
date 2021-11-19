
package ReciboElectricidad;

public class Cliente {
   private  String nombre;
    private Genero genero;
    
    public Cliente(String nombrep, Genero generop){
        this.genero=generop;
        this.nombre=nombrep;
    }
    public String toString(){
        return "Nombre del cliente: "+this.nombre+"\n"+
                             "Genero: "+this.genero.toString();
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
    
}
