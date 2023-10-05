package BOLETIN_1_2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la temperatura");
        double temperaturaC = sc.nextDouble();

        double temperaturaF = (temperaturaC * 9/5 ) + 32;

        System.out.println("La temperatura en Celsius es de " + temperaturaC);
        System.out.println("La temperatura en Farenheit es de " + temperaturaF);
    }
}
