// José Angulo
// Ejemplo de definición y uso de variables
// Ejemplo de tipos de datos primitivos en Java
public class Variables {
    public static void main(String[] args) {
        boolean aprobado = true;
        boolean conFaltas = false;
        // Tipo de datos numéricos
        byte edad = 99;
        short temperatura = 300;
        int existencias = 3453_124_1;
        long numeroGrande = 123456;

        // Reales (con punto decimal)
        float estatura = 123.5f;
        double peso = 82.15;

        System.out.println("Existencias: " + existencias);

        System.out.println("Suma de enteros: " + edad + temperatura);
        System.out.println(edad  + temperatura + ": Segunda suma de enteros");
        System.out.println("Segunda suma de enteros: " + (edad + temperatura));

        // Caracter
        char inicial = 'E';
        System.out.println("Mi inicial es " + inicial + 5);
        System.out.println(inicial + 5 + " Texto");
    }
}
