package BUCLES;

import java.util.Scanner;

public class BucleFor {
    public static void main(String[] args) {
        System.out.println("Suma de los numeros del 1 al 10");
        int i;
        int suma = 0;

        for (i = 1; i <= 10; i++) {
            System.out.println(i);
            suma = suma + i;
            System.out.println();
        }
        System.out.println("El total es " + suma);
    }
}

