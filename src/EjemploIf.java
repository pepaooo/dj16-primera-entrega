import java.util.Scanner;

// José Angulo
// if. if-else
public class EjemploIf {
    public static void main(String[] args) {
        System.out.println("Ejemplo de If");
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.println("¿Qué edad tienes?");
        edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Ya puedes votar y pagar impuestos");
        }

        if( edad >= 65) {
            System.out.println("Ya puedes jubilarte");
            System.out.println("Ya entras gratis al metro");
        } else {
            System.out.println("No puedes jubilarte");
            System.out.println("No entras gratis al metro");
        }


        System.out.println("Fin del programa");

        scanner.close();
    }
}
