package pkg30nuevos;
import java.util.*;


public class Ejer10 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba el precio por kilo de uva: ");
        double precioInicial = scanner.nextDouble();
        double precioFinal;
        
        System.out.print("Escriba el tipo de uva (A o B): ");
        String tipoUva = scanner.next();
        
        System.out.print("Escriba el tamano de la uva (1 o 2): ");
        int tamano = scanner.nextInt();
        
        if (tipoUva.equals("A")) {
            if (tamano == 1) {
                precioFinal = precioInicial + 0.20;
            } else {
                precioFinal = precioInicial + 0.30;
            }
        } else {
            if (tamano == 1) {
                precioFinal = precioInicial - 0.30;
            } else {
                precioFinal = precioInicial - 0.50;
            }
        }
        
        System.out.println("El precio final por kilo de uva es: " + precioFinal);
    }
}

