
package pkg30nuevos;
import java.util.*;


public class Ejer28 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Introduce un numero: ");
            nums[i] = scanner.nextInt();
        }

        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println("Maximo: " + max);
        System.out.println("Minimo: " + min);
    }
}