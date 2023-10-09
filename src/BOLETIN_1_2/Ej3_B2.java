package BOLETIN_1_2;

import java.util.Scanner;

public class Ej3_B2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tres calificaciones");

        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        double suma = nota1 + nota2 + nota3;
        double promedio = suma / 3;

        System.out.println("Tu promedio es " + promedio);

    }
}
