
package pkg30nuevos;
import java.util.*;


public class Ejer17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Random rand = new Random();
        
        int numAdivinar = rand.nextInt(100) + 1;
        int intentos = 10;
        int intentosUsados = 0;
        
        System.out.println("Numero generado");
        
        while (intentos > 0) {
            System.out.print("Ingresa un numero del 1 al 100: ");
            int numIngresado = scanner.nextInt();
            
            if (numIngresado == numAdivinar) {
                intentosUsados++;
                System.out.printf("Adivinaste el numero en "+intentosUsados+" intentos");
                return;
            } else if (numIngresado < numAdivinar) {
                System.out.println("El numero a adivinar es mayor.");
            } else {
                System.out.println("El numero a adivinar es menor.");
            }
            
            intentos--;
            intentosUsados++;
            System.out.printf("Te quedan "+intentos+" intentos restantes.");
        }
        
        System.out.printf("no lograste adivinar el numero. El numero era "+numAdivinar);
    }
}
