// José Angulo

import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {
        System.out.println("Datos de un auto");
        Scanner teclado = new Scanner(System.in);

        // Captura de datos
        String placas = "";
        int anio = 0;
        double precio = 0;

        System.out.print("Ingresa las placas del auto: ");
        placas = teclado.nextLine();
        System.out.print("Ingresa el año del auto: ");
        anio = teclado.nextInt();
        System.out.print("Ingresa precio del auto: ");
        precio = teclado.nextDouble();

        // Impresión de valores capturados
        System.out.println();
        System.out.println("Valores capturados por el usuario");
        System.out.println("Placas: " + placas);
        System.out.println("Año: " + anio);
        System.out.println("Precio: " + precio);

//        String cadena = teclado.nextLine();
//        int entero = teclado.nextInt();
//        double promedio = teclado.nextDouble();
//        char caracter = teclado.next().charAt(0);
//
//        System.out.println("Cadena: " + cadena);
//        System.out.println("entero: " + entero);
//        System.out.println("promedio: " + promedio);
//        System.out.println("caracter: " + caracter);
    }
}
