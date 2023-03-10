
package pkg30nuevos;
import java.util.*;


public class Ejer19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce caracteres (termina con espacio):");
        String caracteres = scanner.nextLine();
        
        while (!caracteres.equals(" ")) {
            if (caracteres.length() != 1) {
                System.out.println("Solo se puede introducir un caracter a la vez.");
            } else {
                char c = caracteres.charAt(0);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    System.out.println("VOCAL");
                } else {
                    System.out.println("NO VOCAL");
                }
            }
            caracteres = scanner.nextLine(); //para q no se siga repitiendo
        }
    }
}