package BOLETIN_1_1;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int num;
         int suma = 0;

         do {
             System.out.println("Introduce un numero");

             num = sc.nextInt();

         } while (num <= 0 );

         for (int i = 1; i <= num / 2; i++){

             if ( num % i == 0){
                 suma = suma + i;
             }
         }
        if (suma == num){
            System.out.println("El numero " + num + " es perfecto");
        } else {

            System.out.println("El numero " + num + " no es perfecto");

        }
    }
}
