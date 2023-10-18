package BOLETIN_1_6;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número positivo: ");

        int num = sc.nextInt();
        int contador = 0;

        if (num <= 0) {

            System.out.println("Introduce numeros positvos > 0");

            return;

        }

        int numOriginal = num;

        //Mientras el numero sea mayor que 0 lo dividimos entre 10 y el contador se autoincrementa en 1
        while (num > 0) {

            num = num / 10;
            contador++;

        }
        System.out.println(numOriginal + " tiene " + contador + " cifras");


    }
}
