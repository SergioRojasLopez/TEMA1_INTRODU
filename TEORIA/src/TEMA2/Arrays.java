package TEMA2;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //declaro el vector
        int[] notas;

        // lo inicializo, diciendole que son 10 elementos, [0 - 9]
        notas = new int[10];

        // Le damos un valor a la posicion 9 y la posicion 8.
        notas [9] = 5;
        notas [8] = 2;

        // Esto sirve para acceder a la posicion que queramos,
        // en este caso como usamos el .length (recorre toda la variable) accede a la 9, 10 - 1 = 9
        System.out.println(notas [notas.length - 1]);
        System.out.println(notas [notas.length - 2]);


    }
}
