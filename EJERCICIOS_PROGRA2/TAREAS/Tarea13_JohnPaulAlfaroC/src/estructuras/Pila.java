package estructuras;
import nodos.Nodo;

public class Pila {
    //atributos
    private Nodo inicio; 
    //Constructores
    public Pila(){
        inicio = null;
    }
    
    public boolean isEmpty(){      
       return true; //Si inicio == null retorna un true, en caso contrario retorna un false
    }
    
    public void  push(Object dato){   //insertarFinal
       
    }
    
    
    public Object pop(){//eliminar del final
        Object dato = null;
       
        
        
        
       return dato;
    }
    
    
    public String toString(){
        Nodo actual = inicio;
        String hilera = "Contenido de la pila\n";
        while(actual != null){
            hilera += actual.toString() + "  "; 
            actual = actual.getSig();
        }
        return hilera;
    }
}
