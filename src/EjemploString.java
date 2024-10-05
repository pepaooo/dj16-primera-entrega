// José Angulo
// Ejemplo de definición y uso de String
public class EjemploString {
    public static void main(String[] args) {
        System.out.println("Ejemplo de uso de la clase String");
        String nombre = "UNAM";
        System.out.println("Universidad llamada: " + nombre);
        String direccion = """
                Av. Universidad número 123
                Alcaldía Coyoacán, CDMX, CP 12345
                """;
        System.out.println(direccion);
    }
}
