package capaLogica;

public class Profesor extends Funcionario {

    private String especialidad = "";
    private int lecciones;

   
    
    //Método constructor de la clase Profesor

    public Profesor(String nombre, String email,int salarioBase, String especialidad,int lecciones) {
        super(nombre, email, salarioBase);
        this.especialidad = especialidad;
        this.lecciones= lecciones;
    }

    //Al profesor se le paga 1000 adicionales por cada lección
    
    public double salarioTotal(){
        return super.salarioTotal()+lecciones*1000;
    }
    
    
    
    @Override
    public String toString() {
        String hilera = "\nPROFESOR\n" + super.toString()+
                        "\nEspecialidad: " + especialidad+
            "\nLecciones impartidas" + lecciones;
        hilera += "\n=====================\n";
        return hilera;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidadp) {
        especialidad = especialidadp;
    }
 public int getLecciones() {
        return lecciones;
    }

    public void setLecciones(int lecciones) {
        this.lecciones = lecciones;
    }
}


