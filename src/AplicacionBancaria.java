import java.util.Scanner;

// José Angulo
public class AplicacionBancaria {

    public static void main(String[] args) {
        // Login
        boolean resultado = login();
        System.out.println("Resultado del login: " + resultado);
    }

    public static boolean login() {
        // Variables
        String usuario, password;
        // Entrada de datos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Usuario: ");
        usuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        password =  scanner.nextLine();
        scanner.close();
        // Resultado
        return usuario.equals("ramonlopez") && password.equals("abc123+");
    }

}
