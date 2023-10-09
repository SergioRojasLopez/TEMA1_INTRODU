package BOLETIN_1_2;

import java.util.Scanner;


public class Ej9_B2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantos enemigos has derrotado");
        int enemigos = Integer.parseInt(teclado.nextLine());
        if (enemigos > 50){
            enemigos = enemigos * 2;
            System.out.println("Tienes " + enemigos + " puntos");
        } else {
            System.out.println("Tienes" + enemigos + " puntos");
        }
    }
}