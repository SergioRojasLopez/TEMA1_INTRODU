package BOLETIN_1_6;

import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int A = sc.nextInt();

        System.out.println("Introduce otro numero");
        int B = sc.nextInt();

        System.out.println("Introduce otro numero");
        int C = sc.nextInt();

        int resultado = B * B + 4 * A * C;

        if (resultado > 0){

            System.out.println("El resultado tiene mas de una solucion");

        } else if (resultado == 0) {

            System.out.println("El resultado tiene una solucion");

        } else {

            System.out.println("El resultado no tiene ninguna solucion");
        }


    }
}
