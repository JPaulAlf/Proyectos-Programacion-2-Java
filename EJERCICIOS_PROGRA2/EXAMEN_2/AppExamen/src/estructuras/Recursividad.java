
package estructuras;


public class Recursividad {
    
    
    public static int sumaNumeros(int n){
        int resultado;
        if(n==1){
            return 1;
        }else{
            resultado= n+sumaNumeros(n-1);
        }
        return resultado;
    } // listo 
    
}
