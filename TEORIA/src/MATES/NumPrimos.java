package MATES;

import java.util.Scanner;

public class NumPrimos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        do {
            System.out.println("Ingrese un numero positivo");
            num1 = sc.nextInt();
            System.out.println("Ingrese otro numero positivo");
            num2 = sc.nextInt();
            sc.close();
        } while (num1 < 0);

        boolean primos = true;

        for (int i = 2; i <= num1; i++) {

            if (num1 % i == 0 && num2 % i == 0) {

                primos = false;

                break;
            }
        }

        if (primos) {

            System.out.println("Los numeros son primos");

        } else {

            System.out.println("Los numeros no son primos");
        }
    }
}

