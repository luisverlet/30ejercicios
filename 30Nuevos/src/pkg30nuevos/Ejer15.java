
package pkg30nuevos;
import java.util.*;


public class Ejer15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("escribe el numero del mes: ");
        int mes = scanner.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("no es un mes");
        } else {
            if (mes == 2) {
                System.out.println("febrero tiene 28 o 29 dias, dependiendo si es un año bisiesto.");
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                System.out.println("el mes ingresado tiene 30 dias.");
            } else {
                System.out.println("el mes ingresado tiene 31 dias.");
            }
        }
    }
}
