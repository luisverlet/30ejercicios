
package pkg30nuevos;
import java.util.*;


public class Ejer3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
     System.out.print("Ingresar primer numero: ");
        float num1 = scanner.nextFloat();

        System.out.print("Ingresar segundo numero: ");
        float num2 = scanner.nextFloat();

        if (num2 == 0) {
            System.out.println("Error");
        } else {
            float resultado = num1 / num2;
            System.out.println("el resultado es: " + resultado);
        }

    }
}

