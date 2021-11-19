package capaObjetos;

public class Empleado {
    private String cedula;
    private int salario;
    public Empleado(String cedula, int salario){
        this.cedula= cedula;
        this.salario= salario;
        
    }
    public String toString(){
        return "Empleado: "+ cedula + " Salario: " + salario;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}
