package BOLETIN_1_1;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        do {
            System.out.println("Introduce la cantidad de numeros positivos");
            cantidad = sc.nextInt();
        } while (cantidad < 0);
        double suma = 0;
        for (int i = 1; i <= cantidad; i++){
            System.out.println("Introduce el numero " + i + ": ");
            double num = sc.nextDouble();

            suma += num;
        }

        double media = suma / cantidad;

        System.out.println("La media es: " + media );
    }
}
