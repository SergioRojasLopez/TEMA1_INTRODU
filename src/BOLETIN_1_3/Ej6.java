package BOLETIN_1_3;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String vocal;
        int posicion = 0;


        do {
            System.out.println("Ingresa una vocal:");

            vocal = sc.next();

            if (vocal.equalsIgnoreCase("a")) {

                posicion = 1;
            } else if (vocal.equalsIgnoreCase("e")) {

                posicion = 2;

            } else if (vocal.equalsIgnoreCase("i")) {

                posicion = 3;

            } else if (vocal.equalsIgnoreCase("o")) {

                posicion = 4;


            } else if (vocal.equalsIgnoreCase("u")) {

                posicion = 5;
            }

        } while (posicion == 0);


        switch (posicion) {

            case 1 :
                System.out.println(vocal + " es la primera vocal");
                break;
            case 2 :
                System.out.println(vocal + " es la segunda vocal");
                break;
            case 3:
                System.out.println(vocal + " es la tercera vocal");
                break;
            case 4:
                System.out.println(vocal + " es la cuarta vocal");
                break;
            case 5:
                System.out.println(vocal + " es la quinta vocal");
                break;
        }

    }
}
