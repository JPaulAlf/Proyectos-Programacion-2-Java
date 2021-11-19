package capaLogica;

import java.util.Calendar;

public class Persona {
    //Atributos de instancia de la clase Persona	
    protected String nombre;
    protected String email;
    protected int annoIngreso;
    
    //Método constructor de la clase Persona
    public Persona(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        annoIngreso= Calendar.getInstance().get(Calendar.YEAR);//Obtiene el año de ingreso a través de la clase Calendar        
    }
    
    public Persona() {
        this.nombre = "";
        this.email = "";
        annoIngreso= Calendar.getInstance().get(Calendar.YEAR);//Obtiene el año de ingreso a través de la clase Calendar        
    }
    
    @Override 
    public String toString() {
        return "\n" + "Nombre: " +  nombre+ "\nEmail: " +  
            getEmail() +  "\nAño de ingreso: " + this.annoIngreso;
    }

    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombrep) {
        nombre = nombrep;
    }

    public void setEmail(String emailp) {
        email = emailp;
    }


    public int getAnnoIngreso() {
        return annoIngreso;
    }

    public void setAnnoIngreso(int ingreso) {
        this.annoIngreso = ingreso;
    }
}

