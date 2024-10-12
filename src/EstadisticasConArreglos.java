// José Angulo

import java.util.Arrays;
import java.util.Scanner;

public class EstadisticasConArreglos {
    public static void main(String[] args) {
        // Obtenemos el arreglo de entrada
        double[] numeros = obtieneDatos();
        System.out.printf("Resultado para los primeros 5 numeros que hayas ingresado %s\n", Arrays.toString(numeros));
        System.out.println("Sumatoria: " + sumatoria(numeros));
        System.out.println("Mínimo: " + minimo(numeros));
        System.out.println("Máximo: " + maximo(numeros));
        System.out.println("Promedio: " + promedio(numeros));
    }


    public static double sumatoria(double[] numeros) {
        double resultado = 0;
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i];
        }
        return resultado;
    }

    public static double minimo(double[] numeros) {
        double resultado = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (resultado > numeros[i]) {
                resultado = numeros[i];
            }
        }
        return resultado;
    }

    public static double maximo(double[] numeros) {
        double resultado = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (resultado < numeros[i]) {
                resultado = numeros[i];
            }
        }
        return resultado;
    }

    public static double promedio(double[] numeros) {
        return sumatoria(numeros) / numeros.length;
    }

    public static double[] obtieneDatos() {
        double[] resultado = new double[5];
        Scanner teclado = new Scanner(System.in);
        System.out.print("Intruduce 5 números en separados por comas: ");
        String entrada = teclado.nextLine();
        String[] arrEntrada = entrada.split(",");
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = Double.parseDouble(arrEntrada[i].trim());
        }
        return resultado;
    }
}
