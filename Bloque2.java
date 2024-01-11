package Github.Programación;

import java.util.Scanner;

public class Bloque2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcio = 0;
        double radi, longitud, costat1, costat2, costat3, volumDisponible=0, volumNecessari;
        //PEDIMOS OPCION HASTA QUE SEA VALIDA
        while (opcio != 1 && opcio != 2) {
            System.out.println("\nQuè has de transportar? 1. Líquids 2. Sòlids");
            opcio = sc.nextInt();
            if (opcio != 1 && opcio != 2) {
                System.out.println("No és una opció vàlida.");
            }
            switch (opcio) {
                case 1:
                    System.out.println("\nQuants centímetres de radi té la cisterna?");
                    radi = sc.nextDouble();
                    System.out.println("\nQuants centímetres de longitud té la cisterna?");
                    longitud = sc.nextDouble();
                    volumDisponible = volumCilindre(radi, longitud);
                    break;

                case 2:
                    System.out.println("\nQuants centímetres té el costat 1 del contenidor?");
                    costat1 = sc.nextDouble();
                    System.out.println("\nQuants centímetres té el costat 2 del contenidor?");
                    costat2 = sc.nextDouble();
                    System.out.println("\nQuants centímetres té el costat 3 del contenidor?");
                    costat3 = sc.nextDouble();
                    volumDisponible = volumPrismaRectangular(costat1, costat2, costat3);
                    break;

                default:
                    break;
            }
        }
        System.out.println("\nQuants metres cúbics hem de transportar?");
        volumNecessari = sc.nextDouble();
        System.out.println("\nEl camió té capacitat per " + volumDisponible + "centímetres cúbics.");
        System.out.println("Hi caben " + volumDisponible / 1000000 + " metres cúbics.");
        System.out.println("Has de fer " + (int)Math.ceil(volumNecessari / (volumDisponible/1000000)) + " viatges");

        sc.close();
    }
    //volumDisponible SI ES UNA CISTERNA CILINDRICA (LIQUIDOS)
    static double volumCilindre(double radi, double longitud) {
        return (Math.PI) * Math.pow(radi, 2) * longitud;
    }
    //volumDisponible SI ES UN CONTENEDOR CUADRADO (SOLIDOS)
    static double volumPrismaRectangular(double costat1, double costat2, double costat3) {
        return costat1 * costat2 * costat3;
    }
}
