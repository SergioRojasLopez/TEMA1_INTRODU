package BOLETIN_1_3;

import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las horas:");
        int horas1 = sc.nextInt();

        System.out.println("Introduce los minutos:");
        int minutos1 = sc.nextInt();

        System.out.println("Introduce los segundos:");
        int segundos1 = sc.nextInt();

        if (horas1 > 24 || horas1 < 0 || minutos1 > 24 || minutos1 < 0 || segundos1 > 60 || segundos1 < 0 ){

            System.out.println("Valores no validos");
            return;
        }

        System.out.println("Ahora vamos con la segunda marcacion de reloj");

        System.out.println("Introduce las horas");
        int horas2 = sc.nextInt();

        System.out.println("Introduce los minutos");
        int minutos2 = sc.nextInt();

        System.out.println("Introduce los segundos");
        int segundos2 = sc.nextInt();

        if (horas2 > 24 || horas2 < 0 || minutos2 > 24 || minutos2 < 0 || segundos2 > 60 || segundos2 < 0 ){

            System.out.println("Valores nno validos");
            return;
        }

        int totalSegundos1 = horas1 * 3600 + minutos1 * 24 + segundos1;
        int totalSegundos2 = horas2 * 3600 + minutos2 * 24 + segundos2;

        if (totalSegundos1 > totalSegundos2) {

            System.out.println("La marcacion 1 es mayor que la 2");
        }else if (totalSegundos1 < totalSegundos2){

            System.out.println("La marcacion 2 es mayor que la 1");
        } else {
            System.out.println("Son iguales");
        }
    }
}
