package Github.Programación;

import java.util.Scanner;

/**
 * E1
 */
public class Bloque1 {
    // MAIN
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcio = menu(sc);

        while (opcio != 0) {
            switch (opcio) {
                case 1:
                    decimalBinary(56);
                    break;
                case 2:
                    binaryDecimal(111000);
                    break;
                case 3:
                    if (esParell(30) == true) {
                        System.out.println("Es parell");
                    } else {
                        System.out.println("No es parell");
                    }
                    break;
                case 4:
                    primersNombresParells(30);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción incorrecta, introduzca de nuevo: ");
                    opcio = menu(sc);
                    break;
            }
        }
        sc.close();
    }

    // FUNCIONES
    static void decimalBinary(int decimal) {
        // INICIALIZACIÓN DE VARIABLES
        String binary = "";
        // MIENTRAS DECIMAL SEA MAYOR QUE '0', DIVIDIMOS PARA SACAR LOS DIGITOS BINARIOS
        // Y LOS AÑADIMOS EN ORDEN AL STRING
        while (decimal > 0) {
            binary = decimal % 2 == 0 ? "0" + binary : "1" + binary;
            decimal /= 2;
        }
        System.out.println(binary);
    }

    static void binaryDecimal(long binary) {
        double decimal = 0;

        for (int i = 0; binary > 0; i++) {
            // SEPARAMOS LA ULTIMA CIFRA DEL BINARIO, LA PASAMOS A DECIMAL Y LA ELIMINAMOS
            decimal += Math.pow(2, i) * (binary % 10);
            binary /= 10;
        }
        System.out.println(decimal);
    }

    static boolean esParell(int number) {
        return number % 2 == 0;
    }

    static void primersNombresParells(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    static int menu(Scanner sc) {

        int opcio;

        System.out.println("Tria una de les següents opcions: ");
        System.out.println("1. Decimal a binari");
        System.out.println("2. Binari a decimal");
        System.out.println("3. És parell?");
        System.out.println("4. Calcular parells de 0 fins a n");
        System.out.println("0. Sortir");
        opcio = sc.nextInt();

        return opcio;
    }
}