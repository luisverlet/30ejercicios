
package pkg30nuevos;
import java.util.*;


public class Ejer4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
      System.out.print("Escribe una letra: ");
        String letra = scanner.nextLine();

        if (letra.matches("[A-Z]")) {
            System.out.println(letra+" es mayuscula.");
        } else {
            System.out.println(letra+" no es mayuscula.");
        }
    }
}

