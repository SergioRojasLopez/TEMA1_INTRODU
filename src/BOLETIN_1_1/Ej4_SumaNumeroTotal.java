package BOLETIN_1_1;

import java.util.Scanner;

public class Ej4_SumaNumeroTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Introduce un numero positivo");
            num = sc.nextInt();
            if (num < 0){
                System.out.println("El numero tiene que ser positivo");
            }
        } while (num < 0);

        int suma = 0;

        for (int i = 0; i <= num; i++){

            suma += i; //REPASAR//

        }
        sc.close();
        System.out.println("la suma de los " + num + " numeros es " + suma);
    }
}
