// José Angulo
// Ejemplo de operadores de comparación (>, >=, <, <=, ==, !=) y lógicos (&&, &, ||, |)
public class OperadoresDeComparacion {
    public static void main(String[] args) {
        System.out.println("Ejemplo de operadores de comparación y lógicos");
        boolean pcd = true;
        int edad = 25;

        System.out.println("¿Es adulto mayor? -> " + (edad >=65));
        System.out.println("¿Es una persona con discapacidad? -> " + (pcd == true));
        //System.out.println("¿Es una persona con discapacidad? -> " + (pcd == false));
        System.out.println("¿Es una persona con discapacidad? -> " + (pcd));

        System.out.println("¿Lo dejo pasar gratis? -> " + ((edad >= 65) || pcd));

        // Utilizado el operador ternario
        System.out.println("¿Es adulto mayor? -> " + ((edad >= 65) ? "Yes" : "Nop"));
    }
}
