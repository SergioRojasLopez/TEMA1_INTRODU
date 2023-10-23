package MATES;

import java.util.Scanner;

public class ModuloDeUnNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");

        int num = sc.nextInt();

        int resultado = num % 2;

        System.out.println("El resto es " + resultado);

        System.out.println("Introduce otro numero");

        int num2 = sc.nextInt();

        int resultado2 = num2 % 10;

        System.out.println("El resto es " + resultado2);
    }
}
