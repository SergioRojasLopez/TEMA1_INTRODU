package BOLETIN_1_6;

import java.util.Scanner;


public class Ej1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        double num1 = sc.nextDouble();

        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();

        System.out.println("Introduce el tercer numero");
        double num3 = sc.nextDouble();
        sc.close();

        double mayor, medio, menor;

        if (num1 >= num2 && num1 >= num3) {

            mayor = num1;
            if (num2 >= num3) {

                medio = num2;
                menor = num3;

            } else {

                medio = num3;
                menor = num2;

            }
        } else if (num2 >= num1 && num2 >= num3) {

            mayor = num2;

            if (num1 >= num3) {

                medio = num1;
                menor = num3;
            } else {

                medio = num3;
                menor = num1;
            }

        } else {

            mayor = num3;

            if (num1 >= num2) {

                medio = num1;
                menor = num2;

            } else {

                medio = num2;
                menor = num1;
            }

        }
        System.out.println("El mayor es " + mayor + ", el medio es " + medio + ", el menor es " + menor);

    }
}
