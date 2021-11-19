package capaLogica;
public class Funcionario extends Persona  {
   //Atributo de instancia de la clase Funcionario	
   private int salarioBase;
   

   //Método constructor de la clase Funcionario
   public Funcionario (String nombre, String email, int salarioBase){
    super(nombre, email);
     this.salarioBase= salarioBase;       
   }
   
   //Si empezó a trabajar después del 2009 se le agregan 100 000 colones al salario
   public double salarioTotal(){
     return (super.annoIngreso>=2009)?(this.salarioBase+100000):this.salarioBase;  
   }
   
   
   @Override
    public String toString() {
       String hilera= "\nFuncionario\n" + super.toString()+
                      "\nSalario Base: " +  salarioBase+
                      "\nSalario Total: "+ salarioTotal();
                                   
        return hilera;
    }

   
   //M�todos get's y set's
   public int getSalarioBase(){
      return salarioBase;
   }
   
   public void setSalarioBase(int salarioHorap){
      salarioBase = salarioHorap;
   }
    
   
   
}
