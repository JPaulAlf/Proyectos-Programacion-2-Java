
package CapaLogicaNegocios;


public class Cliente {
    String cedula;

    public Cliente(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + '}';
    }
    
}
