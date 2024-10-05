import java.util.Scanner;

// José Angulo
public class EsParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número para saber si es número par o impar: ");
        int input = scanner.nextInt();
        System.out.println("El número que has ingresado es: " + (input % 2 == 0 ? "par" : "impar"));
    }
}
