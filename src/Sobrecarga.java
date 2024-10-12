// José Angulo
public class Sobrecarga {
    // Sobrecarga de rutinas
    public static void saluda() {
        System.out.println("Hola");
    }

    public static void saluda(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public static void saluda(boolean valor) {
        if (valor) {
            System.out.println("Hola");
        } else {
            System.out.println("Adios");
        }
    }

    public static void saluda(int numero) {
        for (int i = 0; i < numero; i++) {
            System.out.println("Hola");
        }
    }

    public static void saluda(int numero, String nombre){
        for (int i = 0; i < numero; i++) {
            saluda(nombre);
        }
    }

    public static void main(String[] args) {
        // Ejemplos println
        System.out.println("Ejemplo de sobrecarga de rutinas");
        System.out.println(123);
        System.out.println(123.45);
        System.out.println('A');

        // Ejemplos propios
        saluda();
        saluda("Pepe");
        saluda(true);
        saluda(5);
        saluda(5, "Pepe");
    }

}
