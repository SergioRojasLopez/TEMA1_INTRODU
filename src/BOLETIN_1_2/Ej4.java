package BOLETIN_1_2;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la distancia a tu destino");

        double distancia = sc.nextDouble();

        System.out.println("Dime la velocidad a la que vas a ir");

        double velocidad = sc.nextDouble();

        double tiempo = distancia / velocidad;

        System.out.println("Vas a tardar " + tiempo + " horas");
    }
}
