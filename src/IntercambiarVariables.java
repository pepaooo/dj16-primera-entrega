// José Angulo
public class IntercambiarVariables {
    public static void main(String[] args) {
        int variable1 = 10;
        int variable2 = 50;
        System.out.println("Variable 1: " + variable1 + ", Variable 2: " + variable2);
        int variable;
        variable = variable1;
        variable1 = variable2;
        variable2 = variable;
        System.out.println("Variable 1: " + variable1 + ", Variable 2: " + variable2);
    }
}
