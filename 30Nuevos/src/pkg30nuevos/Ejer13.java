
package pkg30nuevos;
import java.util.*;


public class Ejer13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("numero del dado: ");
        int resultado = scanner.nextInt();

        String caraOpuesta = "inexistente";
        if (resultado<1 || resultado>6) {
            resultado =7;
        }
        switch (resultado) {
            case 1:
                caraOpuesta = "seis";
                break;
            case 2:
                caraOpuesta = "cinco";
                break;
            case 3:
                caraOpuesta = "cuatro";
                break;
            case 4:
                caraOpuesta = "tres";
                break;
            case 5:
                caraOpuesta = "dos";
                break;
            case 6:
                caraOpuesta = "uno";
                break;
            case 7:
                System.out.println("ERROR: numero incorrecto");   
        }

        System.out.println("La cara opuesta es " + caraOpuesta);
    }
}
