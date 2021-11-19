
package CapaLogicaNegocios;


public class Ciudad {
    private String nombre;
    private Zona zona;

    public Ciudad(String nombre, Zona zona) {
        this.nombre=nombre;
        this.zona=zona;
    }
    public String toString() {
        return  nombre+ " --  "+ zona.toString()+"\n";
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Zona getZona() {
        return zona;
    }
}
