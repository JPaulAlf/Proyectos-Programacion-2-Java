package nodos;



public class Nodo {
   private Nodo ant;
   private Object dato;
   private Nodo sig;
   
    
    public Nodo(Object dato){
        this.dato=dato;
        this.sig=null;
        this.ant = null;
    }
    public Nodo(){
        this.dato=null;
        this.sig=null;
        this.ant = null;
    }

    public String toString(){
        return dato.toString();
    }
    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    public void setAnt(Nodo ant){
        this.ant = ant;
    }
    public Nodo getAnt(){
        return this.ant;
    }
}
