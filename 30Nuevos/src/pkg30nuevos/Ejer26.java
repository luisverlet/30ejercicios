
package pkg30nuevos;
import java.util.*;


public class Ejer26 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            // Imprime espacios en blanco para alinear los números en la pirámide
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // Imprime números en orden ascendente
            for (int k = 1; k <= i; k++) {
                System.out.printf("%-2d ", k);
            }
            // Imprime números en orden descendente
            for (int l = (i - 1); l >= 1; l--) {
                System.out.printf("%-2d ", l);
            }
            // Salto de línea para la siguiente fila
            System.out.println();
        }
    }
}