package estructuras;


import nodos.Nodo;

public class ListaSimple {
    //atributos
    private Nodo inicio; 
    
    //Constructores
    public ListaSimple(){
       inicio = null;
    }
    
    public boolean estaVacia(){      
       return (inicio == null);    
    }
    
    public void insertarInicio(Object dato){
        Nodo nuevo = new Nodo(dato);
        if(estaVacia()){
            inicio = nuevo;
        }
        else{
            nuevo.setSig(inicio);
            inicio = nuevo;
        }
    }
    public void insertarFinal(Object dato){
        Nodo nuevo = new Nodo(dato);
        Nodo actual;
        if(estaVacia()){  //Valida si se va a insertar de primero
            inicio = nuevo;
        }
        else{
            actual = inicio;
            while( actual.getSig()!=null){
                actual = actual.getSig();
            }
            actual.setSig(nuevo);
        }
    }
    
    //Calcula y retorna la cantidad de nodos que hay en la lista
    public int longitudLista(){
        Nodo actual = inicio;       
        int cont = 0;
        while( actual != null   ){
            cont++;
            actual = actual.getSig();
        }

        return cont;
    }
    
    
    //Asumir que el primer nodo está en la posición cero
    //Validar que la posición donde se va a insertar sea mayor o igual a cero y
    //sea menor a la longitud de la lista
    //El nodo actual debe colocarse en el nodo anterior al que se va a insertar (ver diapositivas)
    //Si se va a insertar en la posición cero debe tener cuidado de que inicio quede actualizado
    public void insertarMedio(Object dato,int posicion){
        Nodo nuevo = new Nodo(dato);
        Nodo  actual;
       if(posicion>=0 && posicion<= longitudLista() ){
           if(posicion==0){
               nuevo.setSig(inicio);
               inicio=nuevo;
           }else{
               if(posicion==longitudLista()){
                    actual = inicio;
                    while( actual.getSig()!=null){
                         actual = actual.getSig();
                    }
                     actual.setSig(nuevo);
               }else{
                    Nodo aux = inicio;
                    for (int i = 0; i < (posicion-1); i++) {
                        aux = aux.getSig();
                    }
                    Nodo siguiente = aux.getSig();
                    aux.setSig(nuevo);
                    nuevo.setSig(siguiente); 
               }
           }  
       }
    }
    
   
    
    //Retorna y elimina el último nodo de la lista
    //Si la lista está vacía retorna null
    //Revisar que inicio quede actualizado
    public Object eliminarInicio(){
        Object dato= null; 
        
        if(!estaVacia()){
            inicio=inicio.getSig();
        }
        
        return dato;
    }
    
    
    //Elimina y retorna el nodo que se encuentra de último en la lista
    //Si la lista está vacía retorna null
    //Debe validar como caso especial si solo hay un nodo, con el fin de que inicio quede en null
    public Object eliminarFinal(){ 
        Nodo actual;
        actual = inicio;
        Object dato = null;
        if(!estaVacia()){
            if(inicio.getSig()==null){
                dato=inicio.getDato();
                inicio=null;
                return dato;
            }else{
                while( actual.getSig().getSig() != null  ){
                      actual = actual.getSig();
                   } 
                dato=actual.getSig().getDato();
                actual.setSig(null);
                return dato;
            }
        }
        
       return dato;
    }
       
    
    //Asumir que el primer nodo está en la posición cero
    //Validar que la posición a eliminar sea mayor o igual a cero y
    //sea menor a la longitud de la lista
    //El nodo actual debe colocarse en el nodo anterior al que se va a eliminar
    //Si se va a eliminar en la posición cero debe tener cuidado de que inicio quede actualizado
  
    public Object eliminarMedio(int posicion){
        Nodo  actual;
        Object dato=null;
       if(posicion>=0 && posicion<= longitudLista() ){
           if(posicion==0){
               return eliminarInicio();
           }else{
               if(posicion==longitudLista()){
                    return eliminarFinal();
               }else{
                    actual=inicio;
                    for (int i = 0; i < (posicion-1); i++) {
                        actual=actual.getSig();
                    }
                    dato=actual.getSig().getDato();
                    actual.setSig(actual.getSig().getSig());
               }
           }  
       }
        return dato;
    }
    
    //Utilice alguno de los métodos de ordenamiento conocidos para ordenarla lista 
    public void ordenarLista(){
        Nodo  actual=inicio;
        Nodo siguiente;
        int aux;
     while(actual.getSig()!=null){
      siguiente= actual.getSig();
      while(siguiente!= null){
        if((int)actual.getDato()>(int)siguiente.getDato()){
           aux=(int)siguiente.getDato();
           siguiente.setDato(actual.getDato());
           actual.setDato(aux);   
         }
       siguiente=siguiente.getSig();     
      }
       actual=actual.getSig();
       siguiente=actual.getSig();     
    }
    }
     //Retorna en una String todos los elementos de la lista   
    

    public String toString(){
        Nodo actual = inicio;
        String hilera = "Contenido de la lista\n";
        //Recorrer la lista desde inicio hasta el fin
        while( actual != null   ){
            hilera += actual.getDato()+ "  ";
            actual = actual.getSig();
        }
        return hilera;
    }

      
}// fin de la clase