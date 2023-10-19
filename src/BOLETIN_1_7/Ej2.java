package BOLETIN_1_7;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inverso = 0, cifra, num, aux;

        do {
            System.out.println("Introduce un numero:");
            num = sc.nextInt();
        } while (num < 0);

        aux = num;

        while (aux != 0) {

            cifra = aux % 10;

            inverso = inverso * 10 + cifra;
            aux = aux / 10;


        }

        if (num == inverso){

            System.out.println("El numero es capicuo");

        }else {

            System.out.println("El numero no es capicuo");
        }

    }
}
