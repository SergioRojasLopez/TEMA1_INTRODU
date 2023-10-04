package BOLETIN_1_1;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        do {
            System.out.println("Dime dos numeros enteros: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            if (num1 < 0 || num2 < 0) {

                System.out.println("Debes introducir números positivos");
            }

        } while (num1 < 0 || num2 < 0);

        int resultado = 0;
        for (int i =0; i < num2;i++){
            resultado  += num1;

        }
        System.out.println("El producto es " + resultado);
        sc.close();


    }
}
