package BOLETIN_1_3;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos numeros");
        int num1;
        int num2;

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sc.close();
        if (num1 > num2){

            System.out.println("El numero " + num1 + " es mayor que " + num2);

        } else if (num1 == num2){

            System.out.println("El numero " + num1 + " es igual que " + num2);

        } else {

            System.out.println("El numero " + num1 + " es menor que " + num2);
        }
    }
}
