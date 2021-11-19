/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso;
import java.util.Scanner;

public class PracticaGary {
    public static void main(String [] args){
            System.out.println("Programa de Gary");
             int numero = 5; 
             int cont1=1, cont2=2 , contAux=0; String hilera="", hilera2="*";
            while(numero>cont1){
                 if(cont1>=1){
                     contAux= cont1;
                     while(contAux>-1){
                     hilera= hilera+"*";
                     contAux--;
                     }
                 }else {
                 hilera=hilera+"\n";
                 if(cont2>=2){
                     contAux= cont2;
                     while(contAux>0){
                     hilera= hilera+hilera2;
                     contAux--;
                     }
                 }else if(cont1>=1){
                     contAux= cont1;
                     while(contAux>-1){
                     hilera= hilera+"*";
                     contAux--;
                     }
                 }
                 }
                         
                 hilera= hilera+ "\n";
                 cont1= cont1+1;
                 cont2=cont2+3;
                 
             }
        System.out.println(hilera);
    }
}

//public class Piramide {
//    public static void main(String [] args){
//            System.out.println("Programa de Gary");
//             int numero = 35; 
//             int cont1=1, cont2=2 , contAux=0; String hilera="";
//            while(numero>cont1){
//                 if(cont1>=1){
//                     contAux= cont1;
//                     while(contAux>-1){
//                     hilera= hilera+"*";
//                     contAux--;
//                     }
//                 }else {
//                 hilera=hilera+"\n";
//                 if(cont2>=2){
//                     contAux= cont2;
//                     while(contAux>0){
//                     hilera= hilera+"*";
//                     contAux--;
//                     }
//                 }   
//                 }
//                 hilera= hilera+ "\n";
//                 cont1= cont1+1;
//                 cont2=cont2+3;
//                 
//             }
//        System.out.println(hilera);
//    }
//}