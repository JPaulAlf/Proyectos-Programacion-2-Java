package capaLogica;

import java.util.ArrayList;
import java.util.Iterator;

public class Universidad  {
   private String nombre;
   private ArrayList<Persona> arrayPersona = new ArrayList();
   
   public Universidad ( ){
       nombre = "UTN";
   }
   
   public void agregarPersona(Persona persona){
       arrayPersona.add(persona);
   }
   
   public int cantidadEstudiantes(){
       int cont=0;
      Iterator <Persona> iter  = arrayPersona.iterator();
       while(iter.hasNext()){
           Persona persona1 = iter.next();
           if(persona1 instanceof Estudiante){
           cont++;
       }
       }
       return cont;
   }
      public int cantidadEstudiantes1(){
       int cont=0;
      Iterator <Persona>iter  = arrayPersona.iterator();
       while(iter.hasNext()){
         //  Persona persona1 = iter.next();
           if(iter.next() instanceof Estudiante){
           cont++;
       }
       }
       return cont;
   }
   
   public int cantidadLeccionesImpartidas(){
       int cont=0;
        Iterator <Persona>iter  = arrayPersona.iterator();
        while (iter.hasNext()){
            Persona persona = iter.next() ;
             if(persona instanceof Profesor){
                 cont+= ((Profesor) persona).getLecciones();
       }
        }
       return cont;    
   }
   
   public double cantidadTotalSalariosAdministrativos(){// fror i
         int cont=0;
       for (int i = 0; i <arrayPersona.size(); i++) {
            Persona persona = arrayPersona.get(i);
             if(persona instanceof Administrativo){
                 cont+= ((Administrativo) persona).salarioTotal();
       }
        }
       return cont;   
   }
   public double sumaCostoCreditosEstudiantes(){// for each
              int cont=0;
        for (Persona persona : arrayPersona) {
             if(persona instanceof Estudiante){
                 cont+= ((Estudiante) persona).costoCreditos();
       }
        }
       return cont;   
   }
   public int cantidadMasDe12Creditos(){ // iterador
         int cont=0;
        Iterator <Persona>iter  = arrayPersona.iterator();
        while (iter.hasNext()){
            Persona persona = iter.next() ;
             if(persona instanceof Estudiante){
                 if(((Estudiante) persona).getCreditos()>12){
                 cont++;
       }
        }
        }
       return cont;    
   }
        
   
   public String toString(){
       String hilera = "Universidad: "+ nombre;       
     //Agregar la lista de personas que hay en la Universidad
       for (Persona persona : arrayPersona) {
           hilera+= persona.toString();
           
       }
     
     
     
     
     hilera+= "\nCantidad de estudiantes: "+ cantidadEstudiantes();
       hilera+= "\nCantidad de lecciones impartidas: "+ cantidadLeccionesImpartidas();
       return hilera;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
