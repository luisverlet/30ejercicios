
package pkg30nuevos;
import java.util.*;


public class Ejer22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double potencia = 1;

        System.out.print("base: ");
        double base = scanner.nextDouble();

        System.out.print("exponente: ");
        int exponente = scanner.nextInt();

        for (int i = 1; i <= exponente; i++) {
            potencia *= base;
        }

        System.out.println(base + " elevado a la " + exponente + " = " + potencia);
    }
}