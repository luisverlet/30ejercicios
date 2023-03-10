
package pkg30nuevos;
import java.util.*;


public class Ejer24 {
    public static void main(String[] args) throws InterruptedException{
        int horas = 0, minutos = 0, segundos = 0;

        while (true) {
            System.out.print(horas+":"+minutos+":"+segundos+"\n");
             Thread.sleep(1000);
             
             segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;
            }

            if (minutos == 60) {
                minutos = 0;
                horas++;
            }     
        }
    }
}