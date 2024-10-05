// José Angulo

import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio = 1, fin = 10;
        System.out.print("Ingresa el número para obtener su tabla de multiplicar hasta el 10: ");
        int numero = scanner.nextInt();
        scanner.close();

        while (inicio <= fin) {
            System.out.printf("%d x %d = %d\n", numero, inicio, (numero * inicio));
            inicio++;
        }
    }
}
