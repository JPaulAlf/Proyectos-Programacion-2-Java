
package Repaso;
//Fecha de entrega: Miercoles 2da clase, Semana 2, Programacion 2

public class Repaso {
    // Revisar metodo de hilera, matematicas, triangulo, arreglo...
     
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
    
    public boolean verificaRepetidos(int []array,int aleatorio){
       boolean numRepetido=true;
       int cont=0;
       for(int i=0; i<this.array.length; i++){
            if(array[i]!=aleatorio){
                    cont++;
           }
            if(cont>=array.length-1){
                return false;
            }
       }
        return true;
   } 
    public String llenaArreglo(){  
        int tamanno= array.length;
        int cont1=0;
        
     while (cont1<=tamanno-1){
         int aleatorio= (int)(Math.random()*(tamanno))+1;
         if(verificaRepetidos(array, aleatorio)==false){
             array[cont1]=aleatorio;
             cont1++;
         }
     }

        String hilera="Arreglo: \n\n";
        for(int j=0;j<this.array.length;j++){
            hilera=hilera+"["+array[j]+"]"+" ";
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
   } //listo***************
    
    public String matematica(){
        String resultado="";
        String ternario=(this.numero<0)?"No posee raiz cuadrada.":Double.toString(Math.sqrt(numero));
        resultado= "Valor absoluto: "+ (int)Math.abs(numero)+"\n"+
                         "Raiz cuadrada: "+ ternario +"\n"+
                         "Parte entera: "+(int)this.numero+"\n"+
                         "Entero superior: "+Math.ceil(numero)+"\n"+
                         "Entero inferior: "+Math.floor(numero)+"\n";
        return resultado;
    } // listo ********************
    
    public String convierteHilera(){
        String cadena=this.hilera;
        String vocales="[aeiouAEIOU]";   
        String hilera= cadena.replaceAll(vocales, "a")+"\n"+
                                cadena.replaceAll(vocales, "e")+"\n"+
                                 cadena.replaceAll(vocales, "i")+"\n"+
                                cadena.replaceAll(vocales, "o")+"\n"+
                                 cadena.replaceAll(vocales, "u");
     return hilera;
    }// listo***************
    
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
    }// listo******************
    
    
    }// fin de la clase
    

//  String modHilera="Hilera modificada: \n\n";
//        int contador=1;
//        for(int i=0; i< this.hilera.length();i++){
//            if(hilera.charAt(i)=='a'||hilera.charAt(i)=='e'||hilera.charAt(i)=='i'||hilera.charAt(i)=='o'||hilera.charAt(i)=='u'){
//                if(contador==1){
//                    modHilera= hilera.r
//                }


// for(int i=0; i<this.matriz.length; i++){
//           for(int j=0; j<this.matriz[i].length;j++){
////               if(i==j){ // diagonal
////                   matriz[i][j]=1;
////               }
//               if(i<j){ //abajo
//                   
//                   
//                   
//               } if(j>i){ //arriba  
//                   matriz[i][j]=0; }
//           }
//       }


//   String hileraAux=this.hilera;
//        String modHilera="Hilera modificada: \n\n";
//                    hileraAux.replace('a', 'a');
//                    hileraAux.replace('e', 'a');
//                    hileraAux.replace('i', 'a');
//                    hileraAux.replace('o', 'a');
//                    hileraAux.replace('u', 'a');   
//                    
//              modHilera= hileraAux.replaceAll("a","e")+"\n"+
//                      hileraAux.replaceAll("e","a")+"\n"+
//                                 hileraAux.replaceAll("a","i")+"\n"+
//                                 hileraAux.replaceAll("i","u" )+"\n"+
//                                 hileraAux.replaceAll("u","o");
//              return modHilera;


//     int tamanno= this.array.length;
//        for(int i=0; i<this.array.length; i++){
//            int aleatorio= (int)(Math.random()*(tamanno-1))+1;
//            for(int j=0; j< this.array.length;j++){
//                
//            }
//            if(this.verificaRepetidos(this.array, aleatorio)==false){
//                this.array[i]=aleatorio;
//            }
//        }
//        String hilera="Arreglo: \n";
//        for(int j=0;j<this.array.length;j++){
//            hilera=hilera+"["+array[j]+"]"+" ";
//        }
//        return hilera;



// int tamanno= this.array.length;
//        int aux=0;
//        for(int i=0; i<this.array.length; i++){
//            int aleatorio= (int)(Math.random()*(tamanno-1))+1;
//            for(int j=0; j< this.array.length;j++){
//                if(array[j] != aleatorio){
//                    aux=aleatorio;
//            }else{
//                    int aleatorio2= (int)(Math.random()*(tamanno-1))+1;
//                    if(array[j] != aleatorio2){
//                         aux=aleatorio2;
//                    }
//            }
//            }
//            array[i]= aux;
//        }


//   int n=Math.abs((int)this.numero);
//        double operacion=0;
//        int contNumero=1;
//        int impar=1, par=2;  
//        do{
//            if(contNumero%2==0){
//                operacion=operacion+((impar/(int)Math.pow(3,contNumero ))+(par/(int)Math.pow(3,contNumero+1)));
//            }else{
//                operacion=operacion+ ((impar/(int)Math.pow(3,contNumero ))-(par/(int)Math.pow(3,contNumero+1)));
//            }
//            impar++;
//            par=par+2;
//            contNumero++;
//        }while(contNumero<=n);
//        return operacion;


//public boolean verificaRepetidos(int []array,int aleatorio){
//       boolean numRepetido= false;
//       for(int i=0; i<this.array.length; i++){
//           if(array[i]==aleatorio){
//               numRepetido=true;
//           }else if(array[i]!=aleatorio){
//               numRepetido=false;
//           }
//       }
//       return numRepetido;
//   } 