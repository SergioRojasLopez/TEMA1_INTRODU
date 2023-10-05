package BOLETIN_1_3;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad;

        do {
            System.out.println("Dime tu edad");
            edad = sc.nextInt();
        } while (edad > 100);

        if (edad >= 0 && edad <= 12) {

            System.out.println("Eres un crio");

        } else if (edad > 12 && edad <= 17) {

            System.out.println("Eres un adolescente");

        } else if (edad > 17 && edad <= 29) {

            System.out.println("Eres un joven");


        } else if (edad > 29){

            System.out.println("Eres un adulto");
        }


    }
}
