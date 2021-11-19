package estructuras;


import java.util.ArrayList;
import nodos.Nodo;

public class ListaSimple {
    //atributos
    private Nodo inicio;

    //Constructores
    public ListaSimple() {
        inicio = null;
    }

    public boolean esVacia() {
        return this.inicio == null;
    }
//*************************************************************************
    
    public void insertarInicio(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSig(inicio);
            inicio = nuevo;
        }
    } //listo

    public void llenarLista(int n) { 
        for (int i = 0; i < n; i++) {
            int numeroAleatorio=  (int) (Math.random() * 10) + 1;
            Nodo nuevo = new Nodo(numeroAleatorio);
            if(estaVacia()){
            inicio = nuevo;
            }else{
            nuevo.setSig(inicio);
            inicio = nuevo;
        }
        }   
    }// listo
 
    public int mayorDiferencia(){
        Nodo actual= inicio;
        int mayor=0;
        
        if(!esVacia()){
        while(actual.getSig() != null){
            
          int vActual=(int)actual.getDato();
          int vSiguiente=(int)actual.getSig().getDato();
          int diferencia= Math.abs(vActual-vSiguiente);
          
          if(diferencia > mayor){
              mayor=diferencia;
          }
          actual=actual.getSig();
        }
        }
        return mayor;
    } // listo 
    
    public int buscarNumero(int n){
      Nodo actual=inicio;
      int posicicion = -1;
      if(!esVacia()){
       for (int i = 0; i < longitudLista() && actual!=null ; i++) {
          if((Integer) actual.getDato() == n){
              posicicion=i;
              break;
            }
           actual=actual.getSig();
            }
        } 
        return posicicion;
    }// listo 
    
    public void duplicarNodos() {
     Nodo actual= inicio;
     if(!esVacia()){
     for (int i = 0; i < longitudLista() && actual!=null ; i++) {
            if(i==0 || i%2==0){
                actual.setDato((int)actual.getDato()*2);
            }
            actual=actual.getSig();
        }  
     }
    }// listo 
    
//************************************************************
    public int longitudLista() {
        Nodo actual = inicio;
        int cont = 0;
        while (actual != null) {
            cont++;
            actual = actual.getSig();
        }
        return cont;
    }

    public boolean estaVacia(){      
       return (inicio == null);    
    }
     
    public String toString() {
        Nodo actual = inicio;
        String hilera = "Contenido de la lista\n";
        while (actual != null) {
            hilera += actual.toString() + "  ";
            actual = actual.getSig();
        }

        return hilera;
    }
    
}

