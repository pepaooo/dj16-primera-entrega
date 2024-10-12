// José Angulo

import java.util.Scanner;

// Ejemplo de Switch como sentencia y expresión
public class EjemploSwitch {
    public static void main(String[] args) {
        int dia = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un dia de la semana (1-7): ");
        dia = teclado.nextInt();
        teclado.close();
        // Ejemplo de switch como sentencia
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia de la semana inválido");
                break;
        }

        // Ejemplo de switch como expresión
        String nombre;
        nombre = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Dia de la semana inválido";
        };
        System.out.println("Dia de la semana: " + nombre);
    }
}
