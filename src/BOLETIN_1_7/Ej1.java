package BOLETIN_1_7;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();

        int inverso = 0;
        int resto;
        while (num > 0){

            resto = num % 10;
            inverso = inverso * 10 + resto;
            num /= 10;

        }

        System.out.println("El inverso de es: " + inverso);

    }
}
