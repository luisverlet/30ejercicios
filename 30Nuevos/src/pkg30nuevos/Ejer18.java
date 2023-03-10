
package pkg30nuevos;
import java.util.*;


public class Ejer18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Cantidad de numeros a introducir: ");
        int cantidad = scanner.nextInt();
        
        int mayores = 0;
        int menores = 0;
        int iguales = 0;
        
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Numero " + i + ": ");
            int num = scanner.nextInt();
            if (num > 0) {
                mayores++;
            } else if (num < 0) {
                menores++;
            } else {
                iguales++;
            }
        }
        
        System.out.println("Mayores: " + mayores);
        System.out.println("Menores: " + menores);
        System.out.println("Iguales a 0: " + iguales);
    }
}
