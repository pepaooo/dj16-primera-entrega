// José Angulo
// Referencias utilizadas
// https://www.geeksforgeeks.org/swap-two-numbers-without-using-temporary-variable/
// https://www.baeldung.com/java-print-integer-binary
public class IntercambiarVariables2 {
    public static void main(String[] args) {
        int variable1 = 7;
        int variable2 = 3;
        System.out.println("Variable 1: " + variable1 + ", Variable 2: " + variable2);

        variable1 = variable1 + variable2;
        variable2 =  variable1 - variable2;
        variable1 = variable1 - variable2;
        System.out.println("Variable 1: " + variable1 + ", Variable 2: " + variable2);
        System.out.println();

        // Prueba con XOR
        System.out.printf("Variable 1. Decimal: %d, Binario: %s\n", variable1, buildBinaryString(variable1));
        System.out.printf("Variable 2. Decimal: %d, Binario: %s\n", variable2, buildBinaryString(variable2));
        variable1 = variable1 ^ variable2;
        System.out.printf("XOR variable1 = variable1 ^ variable2. Decimal: %d, Binario: %s\n", variable1, buildBinaryString(variable1));
        variable2 =  variable1 ^ variable2;
        System.out.printf("XOR variable2 = variable1 ^ variable2. Decimal: %d, Binario: %s\n", variable2, buildBinaryString(variable2));
        variable1 = variable1 ^ variable2;
        System.out.printf("XOR variable1 = variable1 ^ variable2. Decimal: %d, Binario: %s\n", variable1, buildBinaryString(variable1));

    }

    private static String buildBinaryString(int input){
        return String.format("%8s", Integer.toBinaryString(input)).replace(" ","0");
    }
}
