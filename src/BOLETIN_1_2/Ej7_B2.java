package BOLETIN_1_2;

import java.util.Scanner;

public class Ej7_B2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu tipo favorito de pokemon: agua, fuego o planta");

        String tipo = sc.next();

        if (tipo.equalsIgnoreCase("agua")){

            System.out.println("Te sugiero a Squirtle");

        } else if (tipo.equalsIgnoreCase("fuego")){

            System.out.println("Te sugiero a Charmander");

        }else if (tipo.equalsIgnoreCase("planta")) {

            System.out.println("Te sugiero a Bulbasur");
        }

    }
}

