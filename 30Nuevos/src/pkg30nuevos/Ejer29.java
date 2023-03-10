
package pkg30nuevos;
import java.util.*;


public class Ejer29 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[4][5];
        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese un numero: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += matriz[i][j];
                sumaTotal += matriz[i][j];
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print(sumaFila + "\n");
        }

        for (int j = 0; j < 5; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 4; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.print(sumaColumna + "\t");
        }
        System.out.print(sumaTotal);
    }
}