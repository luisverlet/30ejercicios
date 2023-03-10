
package pkg30nuevos;
import java.util.*;


public class Ejer20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer numero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Introduce el segundo numero: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Numeros pares entre " + num1 + " y " + num2 + ":");
        
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}