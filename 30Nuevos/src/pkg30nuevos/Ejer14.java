
package pkg30nuevos;
import java.util.*;


public class Ejer14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("dia de la semana");
        int resultado = scanner.nextInt();

        String caraOpuesta = "inexistente";
        if (resultado<1 || resultado>7) {
            resultado =8;
        }
        switch (resultado) {
            case 1:
                caraOpuesta = "Lunes";
                break;
            case 2:
                caraOpuesta = "Martes";
                break;
            case 3:
                caraOpuesta = "Miercoles";
                break;
            case 4:
                caraOpuesta = "Jueves";
                break;
            case 5:
                caraOpuesta = "Viernes";
                break;
            case 6:
                caraOpuesta = "Sabado";
                break;
            case 7:
                caraOpuesta = "Domingo";  
                break;
            case 8:
               System.out.println("ERROR: numero incorrecto"); 
        }

        System.out.println("El dia es " + caraOpuesta);
    }
}
