package capaLogica;

import static capaLogica.Recursividad.menor_arreglo;

public class Recursividad {
   
   // factorial de un numero recursivamente
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } 
        else {
            return n * factorial(n - 1);
        }
    }

    //Algoritmo recursivo que permite sumar los elementos de un vector(arreglo) hasta la posición n
    public static int suma_arreglo(int[] v, int n) {
        if (n == 0) {
            return v[n];
        } else {
            return suma_arreglo(v, n - 1) + v[n];
         }
    }

    //Algoritmo que calcula x elevado a la y
     public static double potencia(int x, int y){
        if(y==0){
            return 1;
        } else {
            return x * potencia(x, y-1);
        }
    }

    //Algoritmo recursivo que permita multiplicar hasta el elemento n, de un arreglo.
   public static int multiplicacion_arreglo(int[] v, int n) {
        if (n == 0) {
            return v[n];
        } else {
            return multiplicacion_arreglo(v, n - 1) * v[n];  
        }
    }

    //Algoritmo recursivo que permita encontrar el mayor de un arreglo.
   public static int mayor_arreglo(int[] v, int n,int aux) {
        if (n == 0) {
            return aux;
        } else {
            if(aux<v[n]){ 
                 return mayor_arreglo(v, n - 1, v[n]) ;    
             }else{
            return mayor_arreglo(v, n - 1, aux) ;  
            }
        }
    }     

    //Algoritmo recursivo que permita encontrar el menor de un arreglo
   public static int menor_arreglo(int[] v, int n,int aux) {
         if (n == 0) {
            return aux;
        } else {
            if(aux>v[n] || aux==0){ 
                 return menor_arreglo(v, n-1, v[n]);    
             }else{
            return menor_arreglo(v, n - 1, aux) ;  
            }
        }
    }   
   
    //Algoritmo recursivo que permita efectuar una resta como una serie de restas
    public static int resta_division(int x, int y){
                if(x>y){
            return 0;
        } else {
            return 1 + resta_division(x-y, y);
    }
    }

    // multiplica x * y recursivamente
    public static String multiplicarString(int x, int y){            
            if(y==0){
                    return "";
                }else{
            return Integer.toString(x)+"*"+Integer.toString(y)+"="+(x*y)+"\n"
                    +multiplicarString(x, y-1);
        }
        
}
    public static int multiplicar(int x,int y){
         if(y==0){
                    return 0;
                }else{
            return x+multiplicar(x, y-1);
        }
    }
    
}// fin de la clase



