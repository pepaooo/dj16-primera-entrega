// Version ChatGPT

import java.util.Scanner;

public class ChatGPTRectangleDrawer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the base and height of the rectangle
        System.out.print("Ingresa el número de la base del rectángulo: ");
        int base = scanner.nextInt();
        System.out.print("Ingresa el número de la altura del rectángulo: ");
        int altura = scanner.nextInt();
        scanner.close();

        // Draw the rectangle using while loops
        int row = 0;

        while (row < altura) {
            int col = 0;

            // Top or bottom border
            if (row == 0 || row == altura - 1) {
                while (col < base) {
                    System.out.print("*");
                    col++;
                }
            } else { // Middle part of the rectangle
                System.out.print("*"); // Left border
                while (col < base - 2) {
                    System.out.print(" "); // Inner spaces
                    col++;
                }
                System.out.print("*"); // Right border
            }

            System.out.println(); // Move to the next line
            row++;
        }
    }
}