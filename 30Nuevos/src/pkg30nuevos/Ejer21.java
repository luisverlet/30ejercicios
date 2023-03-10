
package pkg30nuevos;
import java.util.*;


public class Ejer21 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int limInf, limSup;
        
        System.out.print("Limite inferior: ");
        limInf = scanner.nextInt();
        
        do {
            System.out.print("Limite superior: ");
            limSup = scanner.nextInt();
        } while (limSup <= limInf);
        
        int num, suma = 0, dentro = 0, fuera = 0;
        boolean limInfEncontrado = false, limSupEncontrado = false;
        
        do {
            System.out.print("Escriba el numero o cero para terminar: ");
            num = scanner.nextInt();
            
            if (num > limInf && num < limSup) {
                suma += num;
                dentro++;
            } else if (num != 0) {
                fuera++;
            }
            
            if (num == limInf) {
                limInfEncontrado = true;
            }
            
            if (num == limSup) {
                limSupEncontrado = true;
            }
            
        } while (num != 0);
        
        System.out.println("Suma dentro del intervalo: " + suma);
        System.out.println("Cantidad de numeros fuera: " + fuera);
        
        if (limInfEncontrado || limSupEncontrado) {
            System.out.println("Se ha introducido un numero igual a los limites del intervalo");
        }
    }
}