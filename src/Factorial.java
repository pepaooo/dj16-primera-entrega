// José Angulo

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número para obtener su número factorial: ");
        int numero = scanner.nextInt();
        scanner.close();

        int temp = 1, temp2 = numero;
        while (numero > 0) {
            //System.out.println("Numero: " + numero);
            temp = temp * numero--;
            //System.out.printf("%d -- %d\n", temp, numero);
        }
        System.out.printf("El factorial de %s es %s", temp2, temp);
    }
}
