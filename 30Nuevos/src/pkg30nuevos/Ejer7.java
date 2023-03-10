
package pkg30nuevos;
import java.util.*;


public class Ejer7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escriba cordenada x1 de la primera circunferencia");
        double x1= scanner.nextDouble();
        
        System.out.println("Escriba cordenada y1 de la primera circunferencia");
        double y1= scanner.nextDouble();
        
        System.out.println("Escriba radio primera circunferencia");
        double r1= scanner.nextDouble();
        
        System.out.println("Escriba cordenada x1 de la segunda circunferencia");
        double x2= scanner.nextDouble();
        
        System.out.println("Escriba cordenada y1 de la segunda circunferencia");
        double y2= scanner.nextDouble();
        
        System.out.println("Escriba radio de la segund circunferencia");
        double r2= scanner.nextDouble();
        
         
        double distanciaCentros = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

        if (distanciaCentros > r1 + r2) {
            System.out.println(" son exteriores.");
        } else if (distanciaCentros == r1 + r2) {
            System.out.println(" son tangentes exteriores.");
        } else if (distanciaCentros > Math.abs(r1 - r2) && distanciaCentros < r1 + r2) {
            System.out.println(" son secantes.");
        } else if (distanciaCentros == Math.abs(r1 - r2)) {
            System.out.println(" son tangentes interiores.");
        } else if (distanciaCentros < Math.abs(r1 - r2)) {
            System.out.println(" son interiores");
        } else if (x1 == x2 && y1 == y2 && r1 == r2) {
            System.out.println(" son concentricos.");
        }
    }
}
   
