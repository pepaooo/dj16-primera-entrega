// José Angulo
public class Recursividad {

    public static double factorial(double n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Ejemplo de recursividad");
        System.out.println("Factorial: " + factorial(0));
        System.out.println("Factorial: " + factorial(1));
        System.out.println("Factorial: " + factorial(2));
        System.out.println("Factorial: " + factorial(3));
        System.out.println("Factorial: " + factorial(5));
        System.out.println("Factorial: " + factorial(10));

        for(int i = 0; i < 1000; i++){
            System.out.println("Factorial de "  + i + " --> " + factorial(i));
        }
    }
}
