
package pkg30nuevos;
import java.util.*;


public class Ejer25 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de numeros primos: ");
        int cantidad = scanner.nextInt();
        for (int num = 2, cont = 0; cont < cantidad; num++) {
            int divisores = 0;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    divisores++;
                    break;
                }
            }
            if (divisores == 0) {
                System.out.print(num + ",");
                cont++;
            }
        }
    }

}