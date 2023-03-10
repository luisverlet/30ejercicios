
package pkg30nuevos;
import java.util.*;


public class Ejer5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escriba base: ");
        double base = scanner.nextDouble();

        System.out.print("Escriba el exponente: ");
        int exp = scanner.nextInt();

        double result =Math.pow(base, exp);


        if (exp == 0) {
            
            result = 1;
            
        } else if(exp < 0){
           
            result = 1/result;
            
        }

        System.out.println("El resultado es: " + result);
    }
}
