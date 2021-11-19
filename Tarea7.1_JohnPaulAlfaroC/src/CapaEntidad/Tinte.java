
package CapaEntidad;

public class Tinte {
    private String codTinte;
    private double cantGalon;
    
    public Tinte(String codTintep, double cantGalonp){
        this.codTinte=codTintep;
        this.cantGalon=cantGalonp;
    }

    
    @Override
    public String toString() {
        return "Codigo de tinte: "+ codTinte+ " Cantidad por galon: "+cantGalon+"\n"; 
    }

    public String getCodTinte() {
        return codTinte;
    }

    public void setCodTinte(String codTinte) {
        this.codTinte = codTinte;
    }

    public double getCantGalon() {
        return cantGalon;
    }

    public void setCantGalon(float cantGalon) {
        this.cantGalon = cantGalon;
    }
    
    
    
} // fin de la clase
