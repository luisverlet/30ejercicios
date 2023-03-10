
package pkg30nuevos;
import java.util.*;


public class Ejer23 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese el numero de plazos: ");
        int plazos = scanner.nextInt();

        double pago_mensual;
        if (plazos == 0) {
            pago_mensual = precio;
        } else {
            pago_mensual = precio / plazos;
        }

        double total_pagado = 0;
        for (int i = 1; i <= plazos; i++) {
            System.out.println("Pago del mes " + i + ": " + pago_mensual);
            total_pagado += pago_mensual;
            pago_mensual *= 2;
        }

        System.out.println("Total pagado despues de " + plazos + " meses: " + total_pagado);
    }
}