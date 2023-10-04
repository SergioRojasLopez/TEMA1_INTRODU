package BOLETIN_1_1;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num;
        double menor = Double.MAX_VALUE;

        do {
            System.out.println("Introduce un numero");
            num = sc.nextDouble();
            if (num < menor){
                menor = num;
            }
            System.out.println("Quieres introducir mas numeros? (s/n)");

            String respuesta = sc.next();
            if (!respuesta.equalsIgnoreCase("s") ){
                break;

            }

        } while (true);

            System.out.println("el numero menor es " + menor);
    }
}
