package BUCLES;

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = Integer.parseInt(teclado.nextLine());

        int divisor = 2;

        while (divisor <= num) {
            if (num % divisor == 0) {
                System.out.println("El primer divisor de " + num + " es " + divisor);
                break;
            }
            divisor++;
        }
    }
}
