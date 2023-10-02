package BOLETIN_1_1;

import java.util.Scanner;

public class Ej5_Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int contador = 0;
        //Agregamos la variable num para después llenarla con lo que introduzcamos por teclado//
        //La variable contador la iniciamos a 0 y automaticamente cuando introducimos un numero se suma +1 al contador//
        do {
            System.out.println("Introduce un número (negativo para terminar): ");
            num = sc.nextInt();
            contador ++;

        }while (num >= 0);

        //--contador nos resta un número del total de números que hemos introducido por teclado//

        System.out.println("Has introducido " + --contador + " numeros positivos");

    }
}
