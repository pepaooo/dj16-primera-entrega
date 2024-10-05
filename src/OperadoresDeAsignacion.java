// José Angulo
public class OperadoresDeAsignacion {

    public static void main(String[] args) {
        System.out.println("Ejemplo de operadores de asignación");
        int numero1 = 10; // Inicializamos la varibale creada
        int numero2;
        int numero3;
        numero2 = 20;

        // Operadores de asignación compuesta
        numero2 = numero2 + 4;
        numero1 =  numero1 / 2;

        numero2 += 4;
        numero1 /= 2;

        // ++, --
        numero1 =  numero1 + 1;
        numero1 += 1;
        numero1++;

        numero2 =  numero2 - 1;
        numero2 -= 1;
        numero2--;

        double precio = 10.50;
        System.out.println(++precio);

    }
}
