package capaLogica;

public class Administrativo extends Funcionario {
    private String puesto;
    private double horasTrabajadas;

    //Método constructor de la clase Administrativo

    public Administrativo(String nombre, String email,int salarioBase, String puesto,double horasTrab) {        
      super(nombre, email, salarioBase);
        this.puesto = puesto;
        this.horasTrabajadas=horasTrab;
        
     }

    //Si trabaja más de 40 horas por cada hora adicional se le paga 1000
        
    public double salarioTotal(){
       return (horasTrabajadas>40)?super.salarioTotal()+(this.horasTrabajadas-40)*1000: super.salarioTotal();
    }
   
    
    @Override
    public String toString() {
        String hilera = "\nADMINISTRATIVO\n" + super.toString()+
                "\nPuesto: " +  this.puesto + 
                "\nHoras Trabajada: " + horasTrabajadas;
        hilera += "\n=====================\n";
        return hilera;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puestop) {
        puesto = puestop;
    }

}
