
package pkg30nuevos;
import java.util.*;


public class Ejer9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un ano: ");
        int year = scanner.nextInt();
        boolean bisiesto = false;
        
        if (year % 4 == 0) {
            System.out.println(year + " es un ano bisiesto.");
            }else {
                System.out.println(year + " no es un ano bisiesto.");
            }
        }
}
        
       
