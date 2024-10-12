// José Angulo
public class DatosPelicula {
    // Al menos 5 variables con diferente tipo de dato primitivo + String de una película ficticia
    public static void main(String[] args) {
        String name = "The Matrix";
        short createdAt = 1999;
        char classification = 'R';
        int durationMinutes = 120;
        double productionCost = 63_000_000.999;
        boolean bestMovieEver = true;
        System.out.println("Name: " + name);
        System.out.println("Created at: " + createdAt);
        System.out.println("Classification: " + classification);
        System.out.println("Duration (minutes): " + durationMinutes);
        System.out.println("Production Cost: " + productionCost);
        System.out.println("Is it a good movie: " + bestMovieEver);
    }
}
