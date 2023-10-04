package BOLETIN_1_1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ej3Par_Impar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadNum;

        do {
            System.out.println("Cuantos numeros vas a usar?");
            cantidadNum = sc.nextInt();

            if (cantidadNum <= 0) {
                System.out.println("La cantidad de numeros tiene que ser > que 0");
            }
        } while (cantidadNum <= 0);

        for (int i = 1; i <= cantidadNum; i++) {
            System.out.println("Introduzca los numeros");
            int numero = sc.nextInt();
            if (numero%2 == 0) {
                System.out.println(numero + " es par");
            }else {
                System.out.println(numero + " es impar");
            }

        }
    }
}
