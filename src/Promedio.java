//  José Angulo
import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double calificacion1, calificacion2, calificacion3;
        System.out.println("Ingresa 3 calificaciones para poder obtener el promedio");
        System.out.print("Calificiación 1: ");
        calificacion1 = scanner.nextDouble();
        System.out.print("Calificiación 2: ");
        calificacion2 = scanner.nextDouble();
        System.out.print("Calificiación 3: ");
        calificacion3 = scanner.nextDouble();

        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        System.out.printf("El promedio de las calificaciones es %s", promedio);
        //System.out.println("El promedio de las calificaciones es: " + promedio);
    }
}
