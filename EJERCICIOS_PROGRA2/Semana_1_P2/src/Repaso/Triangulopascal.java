package Repaso;
import java.util.Scanner;
/**
 *
 * @author johnpaul
 */

    public class Triangulopascal {
    public static void main(String[] args) {
        System.out.println("Éste Programa Grafica el Triángulo de Blaise Pascal ");
        System.out.println("Sólo ingrese la cantidad de líneas ");
        System.out.print("En números enteros por favor: ");
        Scanner t=new Scanner(System.in);
        int n=t.nextInt();
        int tr[][]=new int [n+1][n+1];
        
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=i; j++) {
                if (j==0 || i==j || j>i){
                    tr[i][j]=1;
                }else{
                    tr[i][j]=tr[i-1][j-1]+tr[i-1][j];
                }
            }
    }
        System.out.println();
  
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(tr[i][j]+" ");
        }
        System.out.println();
        }
        System.out.println();
    System.out.println("Se imprimieron "+ n + " líneas");
    }

}
