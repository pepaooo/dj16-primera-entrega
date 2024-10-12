// José Angulo
public class Subrutinas {

    public static void saluda() {
        System.out.println("Hola");
    }

    public static void saludaPersona(String nombre, String apellidos) {
        System.out.println("Buenas tardes " + nombre + " " + apellidos);
    }

    public static int doble(int valor) {
        int resultado = 0;
        resultado = valor * 2;
        return resultado;
    }

    public static double doble(double valor) {
        return valor * 2;
    }

    public static String doble(String valor) {
        return valor.repeat(2);
    }

    public static String doble(char valor) {
        //return String.valueOf(valor) + String.valueOf(valor);
        return String.valueOf(valor).repeat(2);
    }

    public static void main(String[] args) {
        System.out.println("Ejemplo de definición y uso de procedimientos");
        saluda();
        saludaPersona("Pepe", "Angulo");
        saludaPersona("Luis", "Angulo");

        System.out.println("Ejemplo de definición y uso de funciones");
        System.out.println("Resultado del llamado a la función " + doble(5));
        System.out.println("Resultado del llamado a la función " + doble((int) 'A')); // Se hace una promoción, realicé cast para que no se duplique el valor
        System.out.println("Resultado del llamado a la función " + doble(doble(doble(5)))); // Se hace una promoción

        // Sobrecarga de double
        System.out.println("Ejemplo de sobrecarga de doble");
        System.out.println("Doble: " + doble(3.1416));
        System.out.println("Doble: " + doble("Hola"));
        System.out.println("Doble: " + doble('A'));
    }
}
