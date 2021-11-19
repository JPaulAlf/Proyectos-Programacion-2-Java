
package Repaso;
//Fecha de entrega: Miercoles 2da clase, Semana 2, Programacion 2 
//Anno: 2020/ 01/ 22
// IV Cuatrimestre

public class Repaso {
     
    private double numero;
    private String hilera;
    private int[] array;
    private int[][] matriz;

    
    public Repaso(int fila,int columna, double numerop, String hilerap){
        this.array= new int[fila];
        this.matriz= new int[fila+1][columna+1];
        this.hilera=hilerap;
        this.numero=numerop;
    }
    
    public String llenaArreglo(){  
        int numeroAleatorio=0;
         int repetida=0;
        for (int i = 0; i < array.length; i++) {
            numeroAleatorio = (int) (Math.random() * array.length) + 1;
            array[i] = numeroAleatorio;
            int cont=0;
                  for (int j = 0; j < array.length; j++) {
                      if(array[i] == array[j] && i!=j){
                            cont++;
                           repetida=j;   
                        }
                    }
             if(cont>0){
                  numeroAleatorio = (int) (Math.random() * array.length) + 1;
                   array[repetida] = numeroAleatorio;
                   i=0;
               }
         }

        String hilera="Arreglo: \n\n";
        for(int j=0;j<this.array.length;j++){
            hilera=hilera+"[ "+array[j]+" ]"+" ";
        }
        return hilera;
    }

    public String trianguloPascal(){
        String matrizDibujo="Triangulo de Pascal: \n\n";    
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz[i].length; j++) {
                if (j==0 || i==j ){
                    matriz[i][j]=1;
                   
            } else if(j>i){
                      matriz[i][j]=0;
                }else {
                matriz[i][j]=matriz[i-1][j-1]+matriz[i-1][j];
            }
        }   
        }
     for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz[i].length; j++) {
                matrizDibujo=matrizDibujo+"[ "+this.matriz[i][j]+" ]"+" ";
            }
            matrizDibujo=matrizDibujo+"\n";
            }
       return matrizDibujo;
   } 
    
    public String matematica(){
        String resultado="";
        String ternario=(this.numero<0)?"No posee raiz cuadrada.":Double.toString(Math.sqrt(numero));
        resultado= "Valor absoluto: "+ (int)Math.abs(numero)+"\n"+
                         "Raiz cuadrada: "+ ternario +"\n"+
                         "Parte entera: "+(int)this.numero+"\n"+
                         "Entero superior: "+Math.ceil(numero)+"\n"+
                         "Entero inferior: "+Math.floor(numero)+"\n";
        return resultado;
    } 
    
    public String convierteHilera(){
        String cadena=this.hilera;
        String vocales="[aeiouAEIOU]";  
        System.out.println(vocales);
        String hilera= cadena.replaceAll(vocales, "a")+"\n"+
                                cadena.replaceAll(vocales, "e")+"\n"+
                                 cadena.replaceAll(vocales, "i")+"\n"+
                                cadena.replaceAll(vocales, "o")+"\n"+
                                 cadena.replaceAll(vocales, "u");
     return hilera;
    }
    
    public double calculaSuma(){
        int n=(int)this.numero;
        double sumatoria=0;
        int denominador=1;
        for(int i=0;i<n;i++){
            if(denominador%2==0){
                sumatoria=sumatoria-denominador/(Math.pow(3, denominador));
            }else{
                 sumatoria=sumatoria+denominador/Math.pow(3, denominador);
            }
                denominador++;
        }
        return sumatoria;
    }
    
    }// fin de la clase
    