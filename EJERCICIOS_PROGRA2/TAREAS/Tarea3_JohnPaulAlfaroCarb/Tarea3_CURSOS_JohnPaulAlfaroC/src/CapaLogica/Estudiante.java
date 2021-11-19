
package CapaLogica;

import java.util.*;
import CapaLogica.Curso.*;


public class Estudiante {
    private static int cont=0;
    private String cedula;
    private String nombre;
    private boolean beca;
    private TipoEstudiante tipoEst;
    private ArrayList<Curso> array;
    
    public Estudiante(String cedula, String nombre){
        this.nombre=nombre;
        this.cedula= cedula;
        this.array= new ArrayList();
    }
    
    public String matricular(Curso curso){
        if(array.size()<=3){
            array.add(curso);
            this.cont++;
            return "Curso agregado exitosamente";
        }else{
                return "Curso no agregado ";
        }
    } 
    public double totalCursos(){
        double total=0;
        for (Curso curso : array) {
            total=total+curso.costoTotal(); 
        }
        return total;
    }
    public double adicionalNuevos(){
        double total=0;
        if(tipoEst.equals(TipoEstudiante.NuevoIngreso)){
            total=10000+this.totalCursos();
        }else{
            total=0;
        }
        return total;
    }
    public double descuentoBeca(){
        double desc=0.10;
        double aux=0;
        if(beca==true && tipoEst.equals(TipoEstudiante.Regular)){
           aux= this.totalCursos()*desc;
           
        }else if(beca==true && tipoEst.equals(TipoEstudiante.NuevoIngreso)){
              aux= this.adicionalNuevos()*desc;
           
        }else if(beca==false && tipoEst.equals(TipoEstudiante.NuevoIngreso) || tipoEst.equals(TipoEstudiante.Regular)){
            aux=0;
        }
        return aux;
    }
    public double totalPagar(){
        if(tipoEst.equals(TipoEstudiante.NuevoIngreso)){
            return this.adicionalNuevos()-this.descuentoBeca();
        }else{
            return this.totalCursos()-this.descuentoBeca();
        }
    }
    public int cantidadPracticos(){
       int contador=0;
       Iterator iter = array.iterator();
       while(iter.hasNext()){
           Curso curso= (Curso) iter.next();
           if(curso.equals(TipoCurso.Practico)){
           contador++;
           }
       }
       return contador;
    } 
    @Override
   public String toString(){
       StringBuilder hilera = new StringBuilder();
       hilera.append("Cedula: ").append(this.cedula+"\n");
       hilera.append("Nombre: ").append(this.nombre+"\n");
       hilera.append("Tipo de estudiante: ").append( this.tipoEst.toString()+"\n");
       hilera.append("Tiene beca: ").append((beca==true?"Si":"No")+"\n");
       hilera.append("Cursos Matriculados: ").append(this.cantidadPracticos()+"\n");
       
        if(array.size()>0){
            for (int i = 0; i < array.size(); i++) {
                hilera.append(array.get(i).toString());
                      }
        }else{
            hilera.append("\n Aun no han asignado ningun curso");
        }
        
        hilera.append("El total cobrado por la matricula es: ").append(this.totalPagar());
        return hilera.toString();
   } 

    public static int getCont() {
        return cont;
    }
    public static void setCont(int cont) {
        Estudiante.cont = cont;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isBeca() {
        return beca;
    }
    public void setBeca(boolean beca) {
        this.beca = beca;
    }
    public TipoEstudiante getTipoEst() {
        return tipoEst;
    }
    public void setTipoEst(TipoEstudiante tipoEst) {
        this.tipoEst = tipoEst;
    }
    public ArrayList<Curso> getArray() {
        return array;
    }
    public void setArray(ArrayList<Curso> array) {
        this.array = array;
    }
      
}// fin de la clase

