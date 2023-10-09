package BOLETIN_1_2;

import java.util.Scanner;

public class Ej5_B2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas monedas tienes");

        int monedas = sc.nextInt();

        System.out.println("Cual es el arma que portas");

        String arma = sc.next();

        System.out.println("Cuanta vida tienes");

        double vida = sc.nextDouble();

        System.out.println("\nTu inventario es:");
        System.out.println("Tienes " + monedas + " de Lumen");
        System.out.println("Portas de arma el/la " + arma);
        System.out.println("Tienes " + vida + " de vida");

        System.out.println("Vas a enfrentarte a un enemigo");

        System.out.println("Cuanto daño has recibido ");

        double dano = sc.nextDouble();

        vida -= dano;

        System.out.println("\nTu inventario actualizado es:");
        System.out.println("Tienes " + monedas + " de Lumen");
        System.out.println("Portas de arma el/la " + arma);
        System.out.println("Tienes " + vida + " de vida");

    }
}
