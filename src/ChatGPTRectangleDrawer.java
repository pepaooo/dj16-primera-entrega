// Version ChatGPT

import java.util.Scanner;

public class ChatGPTRectangleDrawer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the character, width, and height from the user
        System.out.print("Enter the character to draw the rectangle: ");
        char drawChar = scanner.next().charAt(0);

        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

        System.out.print("Enter the height of the rectangle: ");
        int height = scanner.nextInt();

        int row = 0;  // Initialize row counter

        // Loop through each row
        while (row < height) {
            int col = 0;  // Initialize column counter for each row

            // Loop through each column in the current row
            while (col < width) {
                System.out.print(drawChar);  // Print the character
                col++;  // Move to the next column
            }

            System.out.println();  // Move to the next line after finishing a row
            row++;  // Move to the next row
        }

        scanner.close();  // Close the scanner
    }
}

