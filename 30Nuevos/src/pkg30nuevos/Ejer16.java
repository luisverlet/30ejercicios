
package pkg30nuevos;
import java.util.*;


public class Ejer16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double COSTO_NORTE = 24.00;
        double COSTO_CENTRAL = 20.00;
        double COSTO_SUR = 21.00;
        double COSTO_EUROPA = 10.00;
        double COSTO_ASIA = 18.00;
        double PESO_MAXIMO = 5.00;
        
        System.out.print("Ingrese la zona a la que va dirigida la entrega (1 = America del Norte, 2 = America Central, 3 = America del Sur, 4 = Europa, 5 = Asia): ");
        int zona = scanner.nextInt();
        
        System.out.print("Ingrese el peso en kg: ");
        double peso = scanner.nextDouble();      
        
        double costo = 0.0;
        if (peso <= PESO_MAXIMO) {
            switch (zona) {
                case 1:
                    costo = peso * COSTO_NORTE;
                    break;
                case 2:
                    costo = peso * COSTO_CENTRAL;
                    break;
                case 3:
                    costo = peso * COSTO_SUR;
                    break;
                case 4:
                    costo = peso * COSTO_EUROPA;
                    break;
                case 5:
                    costo = peso * COSTO_ASIA;
                    break;
                default:
                    System.out.println("La zona ingresada no es valida.");
                    return;
            }
            System.out.printf("El costo de la entrega es de %.2f euros.\n", costo);
        } else {
            System.out.println("El paquete excede el pesopermitido.");
        }
    }
}
