package BOLETIN_1_3;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mult2 = 2;
        int mult3 = 3;

        System.out.println("Dime un numero");
        int num = sc.nextInt();
        sc.close();
        if (num % 2 == 0){
            System.out.println("El numero " + num + " es multiplo de " + mult2);
        } else if (num % 3 == 0){
            System.out.println("El numero " + num + " es multiplo de " + mult3);
        } else {
            System.out.println("El numero " + num + " no es multiplo ni de " + mult2 + " ni de " + mult3);
        }
    }
}
