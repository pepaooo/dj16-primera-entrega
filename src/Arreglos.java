import java.util.Scanner;

// José Angulo
public class Arreglos {
    public static void main(String[] args) {
        System.out.println("Arreglos");
        // 1. Definición
        // tipo[] nombre
        // tipo nombre []
        String[] nombres;
        int numeros[];

        // 2. Inicialización
        // tipo[] nombre = new tipo[tamaño];
        int[] estaturas = new int[5];
        String[] empresas = new String[10];

        for (int i = 0; i < estaturas.length; i++) {
            System.out.println(estaturas[i]);
        }

        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el número de mes: ");
        int mes = scanner.nextInt();
        System.out.println("El mes con número " + mes + " es " + nombreMes_Arrays2(mes));

    }

    public static String nombreMes_Switch(int mes) {
        return switch (mes) {
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            case 12 -> "Diciembre";
            default -> "Mes inválido";
        };
    }

    public static String nombreMes_Arrays1(int mes) {
        String[] meses = new String[12];
        meses[0] = "Enero";
        meses[1] = "Febrero";
        meses[2] = "Marzo";
        meses[3] = "Abril";
        meses[4] = "Mayo";
        meses[5] = "Junio";
        meses[6] = "Julio";
        meses[7] = "Agosto";
        meses[8] = "Septiembre";
        meses[9] = "Octubre";
        meses[10] = "Noviembre";
        meses[11] = "Diciembre";
        if (mes < 1 || mes > 12) {
            return "Mes inválido";
        }
        return meses[mes - 1];
    }

    public static String nombreMes_Arrays2(int mes) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre"};
        if (mes < 1 || mes > 12) {
            return "Mes inválido";
        }
        return meses[mes - 1];
    }

}
