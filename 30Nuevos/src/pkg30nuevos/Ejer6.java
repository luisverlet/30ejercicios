
package pkg30nuevos;
import java.util.*;


public class Ejer6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escriba la edad: ");
        int edad = scanner.nextInt();
        System.out.print("Escriba la nota: ");
        double nota = scanner.nextDouble();
        System.out.print("Escriba el genero (M/F): ");
        char gen = scanner.next().charAt(0);

        if (nota >= 5 && edad >= 18) {
            if (gen == 'M') {
                System.out.println("POSIBLE");
            } else if (gen == 'F') {
                System.out.println("ACEPTADA");
            }
        } else {
            System.out.println("NO ACEPTADA");
        }
    }
}

