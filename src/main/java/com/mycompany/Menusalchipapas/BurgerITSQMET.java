package com.mycompany.menuburgeritsqmet;

import java.util.Scanner;

public class BurgerITSQMET {

    public static void main(String[] args) {
        int res1;
        int res2;
        int res3;
        int contsalsim = 0;
        int contsalcom = 0;
        int contpizzajum = 0;
        int contcola = 0;
        int contfanta = 0;
        int contpepsin = 0;
        double preciosalsimple = 1.5;
        double preciosalcompleta = 3;
        double preciopizzajumbo = 5;
        double cola = 0.5;
        double fanta = 1.5;
        double pepsin = 1;
        Scanner nuevo = new Scanner(System.in);
        System.out.println("Menu LAS SALCHIS MAS PODEROSAS");
        System.out.println("Menu");
        System.out.println("1 Salchipapas y mas");
        System.out.println("2 bebidas");
        System.out.println("3 Salir ");
        System.out.println("Ingrese su respuesta: ");
        res1 = nuevo.nextInt();
        if (res1 == 1) {
            System.out.println("Bienvenido");
            System.out.println("Estas las opciones que te podemos ofrecer: ");
            System.out.println("Opcion 1: Salchipapa simple $1.50");
            System.out.println("Opcion 2: Salchipapa completa $3");
            System.out.println("Opcion 3: Pizza personal $5");
            System.out.println("Opcion 4 : Salir");
            System.out.println("Ingrese su respuesta: ");
            res2 = nuevo.nextInt();
            while (res2 != 4) {
                System.out.println("Bienvenido");
                System.out.println("Estas las opciones que te podemos ofrecer: ");
                System.out.println("Opcion 1: Salchipapa simple $1.50");
                System.out.println("Opcion 2: Salchipapa completa $3");
                System.out.println("Opcion 3: Pizza personal $5");
                System.out.println("Opcion 4 : Salir");
                System.out.println("Ingrese su respuesta: ");
                res2 = nuevo.nextInt();
                if (res2 == 1) {
                    contsalsim++;
                }
                if (res2 == 2) {
                    contsalcom++;
                }
                if (res2 == 3) {
                    contpizzajum++;
                }
            }
            double totalsalsim = contsalsim * preciosalsimple;
            double totalsalcom = contsalcom * preciosalcompleta;
            double totalpizzajum = contpizzajum * preciopizzajumbo;
            double totalsalchipapasymas = totalsalsim + totalsalcom + totalpizzajum;
            if (res2 == 4) {
                System.out.println("Fin del menu");
                System.out.println("El total de tu compra es del apartado de hamburguesas es: ");
                System.out.println("En Salchipapas simples:" + totalsalsim);
                System.out.println("En Salchipapas completas: " + totalsalcom);
                System.out.println("En Pizzas personales: " + totalpizzajum);
                System.out.println("Total: " + totalsalchipapasymas);
            }
        }
        if (res1 == 2) {
            System.out.println("Bienvenido");
            System.out.println("Opcion 1: Cola simple $0.50");
            System.out.println("Opcion 2: Fanta $1.50");
            System.out.println("Opcion 3: Pepsin $1");
            System.out.println("Opcion 4 : Salir");
            System.out.println("Ingrese su respuesta: ");
            res3 = nuevo.nextInt();
            while (res3 != 4) {
                System.out.println("Bienvenido");
                System.out.println("Opcion 1: Cola simple $0.50");
                System.out.println("Opcion 2: Fanta $1.50");
                System.out.println("Opcion 3: Pepsin $1");
                System.out.println("Opcion 4 : Salir");
                System.out.println("Ingrese su respuesta: ");
                res3 = nuevo.nextInt();
                if (res3 == 1) {
                    contcola++;
                }
                if (res3 == 2) {
                    contfanta++;
                }
                if (res3 == 3) {
                    contpepsin++;
                }

            }
            double totalcola = contcola * cola;
            double totalnaran = contfanta * fanta;
            double totalpepsin = contpepsin * pepsin;
            double totalbebidas = totalcola + totalnaran + totalpepsin;
            if (res3 == 4) {
                System.out.println("Fin del menu");
                System.out.println("El total de tu compra es del apartado de bebidas es: ");
                System.out.println("En gaseosas: " + totalcola + " En Fantas sueño: " + totalnaran + " En pepsin " + totalpepsin);
                System.out.println("total: " + totalbebidas);
            }
        }
    }
}
