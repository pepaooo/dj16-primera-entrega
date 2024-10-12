// José Angulo
// Esta version solo solo imprime un rectángulo de mínimo de dimensión base=2 x altura=3.

import java.util.Scanner;

public class RectanguloWhile {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingresa el número de la base del rectángulo (Valor mínimo: 2) : ");
//        int base = scanner.nextInt();
//        System.out.print("Ingresa el número de la altura del rectángulo (Valor mínimo: 3): ");
//        int altura = scanner.nextInt();
//        scanner.close();
        int base = 2;
        int altura = 3;

        int tempBase = base;
        int tempAltura = altura;

        while (base > 0) {
            while ((tempAltura-2) > 0) {
                while (tempBase > 0) {
                    System.out.print("*");
                    tempBase--;
                    if (tempBase == 0) {
                        System.out.println();
                    }
                }
                System.out.printf("%s%s%s\n", "*", " ".repeat(base - 2), "*");
                tempAltura--;
            }
            System.out.print("*");
            base--;
        }
    }
}
