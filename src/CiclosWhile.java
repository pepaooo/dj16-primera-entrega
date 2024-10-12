// José Angulo
// Ejemplos de ciclso con while

import java.util.Scanner;

public class CiclosWhile {
    public static void main(String[] args) {
        System.out.println("Ejemplo de ciclos con while");
        int numero = 5;
        while (numero < 20) {
            System.out.println(numero);
            numero += 2;
        }

        // Ciclo que se va a repetir hasta que de un 73
        Scanner scanner = new Scanner(System.in);
        int salida = 73;
        numero = 0;
        while (true) {
            System.out.print("Escribe un número (para salir del programa deberás escribir " + salida + "): ");
            numero = Integer.parseInt(scanner.nextLine());
            if (numero == salida) {
                System.out.println("Fin del programa");
                break;
            }
        }

        // do while. Hace y luego pregunta si realizará la siguiente iteración
        String universidad;
        do {
            System.out.println("¿Cual es la mejor univerdad de México?");
            universidad =  scanner.nextLine();
        } while (!universidad.equals("UNAM"));
        System.out.println("Felicidades, has adivinado");
    }
}
