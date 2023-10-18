package BOLETIN_1_6;

import java.util.Random;
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int intentos = 0;
        final int Maxintentos = 6;
        Random secreto = new Random();
        int numSecreto = secreto.nextInt(1,100);


        while (intentos < Maxintentos){

            System.out.println("Introduce un número");
            int num = sc.nextInt();

            if (num < 1 || num > 100) {

                System.out.println("Has gastado un intento, tiene que estar entre 1 y 100");
                intentos++;

            } else if (num == numSecreto) {

                System.out.println("Enhorabuena, el numero secreto era: " + numSecreto);
                break;

            } else if (num < numSecreto) {
                System.out.println("El numero secreto es mayor");
                intentos++;


            } else {

                System.out.println("El numero secreto es menor");
                intentos++;

            }
            if (intentos < Maxintentos){

                System.out.println("Te quedan " + (Maxintentos - intentos) + " intentos");
            }


        }

        if (intentos == Maxintentos){

            System.out.println("Has sido derrotado, perdiste el juego, el numero secreto era " + numSecreto);
        }


    }
}
