package Repaso;


public class NewClass {
    
    public static void main(String[]args){   

        int a[] =new int[6];
        int tamanno= a.length;
        int cont1=0;
        

        
     
        int numeroAleatorio = 0;
        //número aleatorio entre el tamaño
        // y 1
        for (int i = 0; i < a.length; i++) {

            a[i] = -1;

        }
        int repetida=0;
        for (int i = 0; i < a.length; i++) {
            numeroAleatorio = (int) (Math.random() * a.length) + 1;
            a[i] = numeroAleatorio;
            int cont=0;
            for (int j = 0; j < a.length; j++) {
                if(a[i]==a[j]&&i!=j){
                    cont++;
                    repetida=j;
                    
                }
              

            }
             if(cont>0){
                  numeroAleatorio = (int) (Math.random() * a.length) + 1;
            a[repetida] = numeroAleatorio;
            i=0;
             }

        }

    
        
        
        
        
        String hilera="Arreglo: \n\n";
        for(int j=0;j<a.length;j++){
            hilera=hilera+"["+a[j]+"]"+" ";
        }
        System.out.println(hilera);
        
    }
}


//     int [][]matriz= new int[7][7]; 
//        String matrizDibujo="Triangulo de Pascal: \n\n";    
//        for (int i = 0; i <matriz.length; i++) {
//            for (int j = 0; j <matriz[i].length; j++) {
//                if (j==0 || i==j ){
//                    matriz[i][j]=1;    
//            } else if(j>i){
//                      matriz[i][j]=0;
//                }else {
//                matriz[i][j]=matriz[i-1][j-1]+matriz[i-1][j];
//            }
//        }   
//        }
//        
//     for (int i = 0; i <matriz.length; i++) {
//            for (int j = 0; j <matriz[i].length; j++) {
//                 System.out.print(matriz[i][j]+" ");
//            }
//            System.out.println();
//            }
//        System.out.println(matrizDibujo);

//************************************************************************************************
 
//        int array[]= new int[5];
//         int tamanno= array.length;
//        int aux=0;
//        int cont1=0;
//        int x=0;
//
//        for(int i=0; i<array.length; i++){
//            int aleatorio= (int)(Math.random()*(tamanno))+1;
//            for(int j=0; j< array.length;j++){
//                if(array[j] == aleatorio){
//                    cont1++;
//                }
//            }
//            if(cont1==0){
//                 array[i]= aleatorio;
//                 }
//            cont1=0;
//            }
//        
//        String hilera="Arreglo: \n\n";
//        for(int j=0;j<array.length;j++){
//            hilera=hilera+"["+array[j]+"]"+" ";
//        }
//        System.out.println(hilera);

//************************************************************************************************

// public String llenaArreglo(){  
//        int tamanno= array.length;
//        int cont1=0;
//        for(int i=0; i<array.length; i++){
//            int aleatorio= (int)(Math.random()*(tamanno))+1;
//            for(int j=0; j< array.length;j++){
//                if(array[j] == aleatorio){
//                    cont1++;
//                }
//            }
//            if(cont1==0){
//                 array[i]= aleatorio;
//                 }else{
//                cont1=0;
//                aleatorio=(int)(Math.random()*(tamanno))+1;
//                 for(int j=0; j< array.length;j++){
//                if(array[j] == aleatorio){
//                    cont1++;
//                }
//            }
//            }
//            if(cont1==0){
//                 array[i]= aleatorio;
//            }
//            cont1=0;
//            }
//
//        String hilera="Arreglo: \n\n";
//        for(int j=0;j<this.array.length;j++){
//            hilera=hilera+"["+array[j]+"]"+" ";
//        }
//        return hilera;
//    }
