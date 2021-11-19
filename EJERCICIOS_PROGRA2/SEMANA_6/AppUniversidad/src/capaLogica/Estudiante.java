package capaLogica;

public class Estudiante extends Persona  {

    private String carrera;
    private int creditos;

    //Método constructor de la clase Estudiante

    public Estudiante(String nombre, String email, String carrera, int creditos) {
       super(nombre, email);
        this.carrera = carrera;
        this.creditos = creditos;
        
    }

    public Estudiante() {
        super();     
        this.carrera = "";
        this.creditos = 0;
    }

    //Cada crédito cuesta 3000 colones
    public double costoCreditos(){
        return creditos*3000;
    }
    
    public String toString() {
        String hilera = "\nESTUDIANTE\n" + super.toString()+
            "\nCarrera: " + this.carrera + 
            "\nCréditos matriculados" + this.creditos +
            "\nCosto de los créditos: "+ costoCreditos();
        hilera += "\n====================\n";
    
        return hilera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrerap) {
        carrera = carrerap;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getCreditos() {
        return creditos;
    }
}

