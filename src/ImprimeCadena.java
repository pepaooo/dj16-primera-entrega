import java.util.Scanner;

public class ImprimeCadena {
    public static void main(String[] args) {
        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dame un número: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.print(i);
            if (i < numero) {
                System.out.print(",");
            }
        }
    }
}
