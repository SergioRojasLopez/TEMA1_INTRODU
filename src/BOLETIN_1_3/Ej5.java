package BOLETIN_1_3;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 4 numeros");

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();

        double sumaNum = num1 + num2 + num3 + num4;

        double media = sumaNum / 4;

        System.out.println("La media es " + media);

        if (num1 > media){

            System.out.println("El numero " + num1 + " es superior a la media: " + media);

        } else if (num2 > media){

            System.out.println("El numero " + num2 + " es superior a la media: " + media);


        } else if (num3 > media) {

            System.out.println("El numero " + num3 + " es superior a la media: " + media);

        } else if (num4 > media) {

            System.out.println("El numero " + num4 + " es superior a la media: " + media);
        }

    }
}
