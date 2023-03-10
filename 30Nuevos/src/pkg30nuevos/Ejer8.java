
package pkg30nuevos;
import java.util.*;


public class Ejer8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Lado 3: ");
        double lado3 = scanner.nextDouble();
        
        if (lado1+ lado2 == lado3 && lado1 + lado3 == lado2 && lado2 + lado3 == lado1) {
            System.out.println("triangulo es rectangulo.");
        }
        
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("triangulo es equilatero.");
        } else if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
            System.out.println("triangulo es isosceles.");
        } else {
            System.out.println("triangulo es escaleno.");
        }
    }
}

