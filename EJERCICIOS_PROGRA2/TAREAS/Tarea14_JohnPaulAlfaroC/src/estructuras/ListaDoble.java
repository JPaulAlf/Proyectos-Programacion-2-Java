package estructuras;


import nodos.Nodo;

public class ListaDoble {
   
  private Nodo inicio;
  private Nodo ultimo;
    
   
    public ListaDoble(){
        inicio = null;
        ultimo=null;
    }
    
    public boolean esVacia(){
       return inicio == null;
       //return ultimo == null;
       
    }
    
    //Tomar en cuenta si está vacía
    public void insertarInicio(Object dato){
        Nodo nuevo = new Nodo(dato);
        if(esVacia()){
            inicio = nuevo;
            ultimo = nuevo;
        }
        else{
            nuevo.setSig(inicio);
            inicio.setAnt(nuevo);
            inicio = nuevo;
        }
        
    }
    
    //Tomar en cuenta si está vacía
    public void insertarFinal(Object dato){
        Nodo nuevo = new Nodo(dato);
        if(esVacia()){
            inicio = nuevo;
            ultimo= nuevo;
        }
        else{
            ultimo.setSig(nuevo);
            nuevo.setAnt(ultimo);
            ultimo = nuevo;
            
        }
       
      
        
        
    }
    
    //Tomar en cuenta si está vacía
    public Object eliminarInicio(){        
        Object dato = null;
        if(!esVacia() && longitudLista()>1){
            
            dato=inicio.getDato();
            inicio=inicio.getSig();
            inicio.setAnt(inicio.getAnt().getAnt());
            
        }else if(!esVacia() && longitudLista()==1){
            inicio=null;
        } 
        
        return dato;
    }
    
    //Tomar en cuenta si está vacía y si solo hay un nodo
    public Object eliminarFinal(){
        Object dato = null;
        if(!esVacia()){
            if(inicio.getSig()==null && inicio.getAnt()==null){
                dato=inicio.getDato();
                inicio=null;
                ultimo=null;
                return dato;
            }else{
                ultimo=ultimo.getAnt();
                ultimo.setSig(ultimo.getSig().getSig());
                return dato;
            }
        }        
        return dato;
    }
     
   
        //Tomar en cuenta si está vacía
        //Si se va a eliminar el primer nodo
        //Si solo hay un nodo
    public Object eliminarMedio(int posicion){
        Nodo actual=inicio;
        Object dato = null;
         if(posicion>=0 && posicion< longitudLista() ){
           if(posicion==0){
               eliminarInicio();
           }else{
               for (int i = 1; i < (posicion); i++) {
                        actual=actual.getSig();
                    }
                    dato=actual.getSig().getDato();
                    actual.setAnt(actual.getSig().getAnt());
                    actual.setSig(actual.getSig().getSig());
               }
           }  
       
        return dato;
    }
    
    //Asume que la posición del primer Nodo es cero
    public void insertarMedio(Object dato, int posicion){
        Nodo nuevo = new Nodo(dato);
        Nodo  actual;
      if(posicion >=0&& posicion<= longitudLista()){ //Si la posición va más allá de la longitud no hace nada            
            if(posicion==0){
                insertarInicio(dato);
            }
            else{
              actual = inicio;
              for (int i = 1; i <= posicion-1; i++) {//Cuenta cantidad de veces que debe caminar actual
                  actual = actual.getSig(); 
              }
              nuevo.setSig( actual.getSig());
             //Si dieron una posición fuera de la lista lo inserta al final
             nuevo.setAnt(actual.getAnt());
              actual.setSig( nuevo);
            }
        }
        
        
        
        
    }
    
    //Este método es igual al de lista simple
    public String imprimeHaciaAdelante(){ 
        Nodo actual = inicio;
        String hilera = "\nLista hacia adelante\n";
        while(actual != null){
            hilera += actual.getDato()+ " ";
            actual = actual.getSig(); 
        }
        return hilera;
    }
    
    //Imprimir en orden inverso (desde el último nodo hasta el primero)
    public String imprimeHaciaAtras(){    
        String hilera = "\nLista hacia atrás\n";
        Nodo actual = ultimo;
        while(actual != null){
            hilera+= actual.getDato()+ "  ";
            actual = actual.getAnt();
        }
        return hilera;
    }
    
    
     public String toString(){
     Nodo actual = inicio;
     String hilera = "Contenido de la lista:\n";     
     while(actual!=null){
         hilera += actual.getDato() + "    ";
         actual= actual.getSig();
     } 
        return hilera;
    }
     
     
    //Este método es similar al de lista simple
    public int longitudLista(){
     Nodo actual = inicio;
     int cont = 0;
     while(actual!=null){
         cont++;
         actual= actual.getSig();
     }
        return cont;
    }
    
    
}