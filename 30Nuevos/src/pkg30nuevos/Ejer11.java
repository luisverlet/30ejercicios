
package pkg30nuevos;
import java.util.*;


public class Ejer11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de alumnos que asistiran al viaje:");
        int numAlumnos = scanner.nextInt();
        
        double costoAlumno = 0;
        double costoTotal = 0;
        
        if(numAlumnos >= 100) {
            costoAlumno = 65;
        } else if(numAlumnos >= 50 && numAlumnos <= 99) {
            costoAlumno = 70;
        } else if(numAlumnos >= 30 && numAlumnos <= 49) {
            costoAlumno = 95;
        } else {
           
            costoTotal = 4000.0;
            costoAlumno= costoTotal / numAlumnos;
            System.out.println("El costo total del autobus es de 4000 euros.");
        }
        costoTotal = costoAlumno * numAlumnos;
        
        System.out.println("El costo total del viaje es de " + costoTotal + " euros.");
        System.out.println("El costo por alumno es de " + costoAlumno + " euros.");
    }
}
       
