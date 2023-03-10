
package pkg30nuevos;
import java.util.*;


public class Ejer30 {
    public static void main(String[] args){
        int[][] matriz = new int[4][5];
        Random random = new Random();

        // Generar números aleatorios y almacenarlos en la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = random.nextInt(900) + 100;
            }
        }

        // Calcular sumas parciales de filas y columnas
        int[] sumasFilas = new int[matriz.length];
        int[] sumasColumnas = new int[matriz[0].length];
        int sumaTotal = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumasFilas[i] += matriz[i][j];
                sumasColumnas[j] += matriz[i][j];
                sumaTotal += matriz[i][j];
            }
        }

        // Mostrar la matriz y las sumas parciales
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(sumasFilas[i]);
        }

        for (int j = 0; j < matriz[0].length; j++) {
            System.out.print(sumasColumnas[j] + "\t");
        }
        System.out.println(sumaTotal);
    }
}