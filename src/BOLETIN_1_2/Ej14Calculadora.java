package BOLETIN_1_2;

import java.util.Scanner;

public class Ej14Calculadora {
    public static void main(String[] args) {
        int resultado = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime dos numeros");
        int num1 = Integer.parseInt(teclado.nextLine());
        int num2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Dime que operacion vas a realizar:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Dividir");
        System.out.println("4. Multiplicar");
        String operacion = String.valueOf(Integer.parseInt(teclado.nextLine()));

        switch (operacion) {
            case "1":
            case "+":
                resultado = num1 + num2;
                System.out.println(resultado);
                break;
            case "2":
                resultado = num1 - num2;
                System.out.println(resultado);
                break;
            case "3":
                resultado = num1 / num2;
                System.out.println(resultado);
                break;
            case "4":
                resultado = num1 * num2;
                System.out.println(resultado);
                break;

        }
    }
}
