package estructuras;
import nodos.Nodo;

public class Cola {
   
  private Nodo inicio;
   
    public Cola(){
        inicio = null;
    }
    
    public boolean isEmpty(){
        return true ;
        
    }
    
    public void add(Object dato){//agrega un objeto al final de la cola
        
    }
    
    public Object poll(){  //Elimina y retorna el primer nodo de la cola      
        Object dato= null;  //Se declara de tipo Integer para que acepte nulos
        
        
        
        return dato;
    }
    
    public String toString(){
        Nodo actual = inicio;
        String hilera = "";
        while(actual != null){
            hilera += actual.toString() + "  "; 
            actual = actual.getSig();
        }
        return hilera;
    }
}
