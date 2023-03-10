
package pkg30nuevos;
import java.util.*;


public class Ejer12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Duracion de la llamada en minutos: ");
        int duracion = scanner.nextInt();

        double costo;
        if (duracion <= 5) {
            costo = 1;
        } else if (duracion <= 8) {
            costo = 1 + 0.8 * (duracion - 5);
        } else if (duracion <= 10) {
            costo = 1 + 0.8 * 3 + 0.7 * (duracion - 8);
        } else {
            costo = 1 + 0.8 * 3 + 0.7 * 2 + 0.5 * (duracion - 10);
        }

        System.out.print("Dia de la llamada (1 domingo, 2-6 lunes a viernes, 7 sabado): ");
        int dia = scanner.nextInt();
        System.out.print("Turno de la llamada (1 manana, 2 tarde): ");
        int turno = scanner.nextInt();

        double impuesto;
        if (dia == 1) {
            impuesto = 0.03 * costo;
        } else if (turno == 1) {
            impuesto = 0.15 * costo;
        } else if (turno == 2) {
            impuesto = 0.1 * costo;
        } else {
            impuesto = 0;
        }

        double total = costo + impuesto;

        System.out.println("Costo de la llamada: " + costo + " euros");
        System.out.println("Impuesto: " + impuesto + " euros");
        System.out.println("Total a pagar: " + total + " euros");
    }
}
