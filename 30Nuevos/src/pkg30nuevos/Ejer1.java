
package pkg30nuevos;
import java.util.*;


public class Ejer1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
    System.out.print("Ingrese el primer numero: ");
    int num1 = scanner.nextInt();
    System.out.print("Ingrese el segundo numero: ");
    int num2 = scanner.nextInt();
    
    if (num1 > num2) {
      System.out.println(num1 + " es mayor");
    } else
      System.out.println(num2 + " es mayor");
  }
}
