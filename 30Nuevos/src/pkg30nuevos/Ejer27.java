
package pkg30nuevos;
import java.util.*;


public class Ejer27 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int[] num= new int[10];
        
        for(int i=0; i<num.length;i++){
        System.out.print("Ingrese un numero: ");
        num[i] = scanner.nextInt();
        }
 
         for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
         }

    }
}