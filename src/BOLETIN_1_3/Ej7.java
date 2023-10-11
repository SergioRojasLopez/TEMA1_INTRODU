package BOLETIN_1_3;

import java.util.Scanner;

public class Ej7 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String estadoCivil;
            int edad;

            do {
                System.out.println("Ingresa tu estado civil: soltero/a (S), casado/a (C), divorciado/a (D), viudo/a (V)");
                estadoCivil = sc.next();
                if (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("d") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("c")) {
                    System.out.println("Valor no válido. Por favor, ingresa un estado civil válido.");
                }
            } while (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("d") && !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("c"));

            System.out.println("Introduce tu edad:");
            edad = sc.nextInt();

            double retencion = 0.0;

            if ((estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("d")) && edad < 35) {
                retencion = 12.0;
            } else if (edad > 50) {
                retencion = 8.5;
            } else if ((estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("c")) && edad < 35) {
                retencion = 11.3;
            } else {
                retencion = 10.5;
            }

            System.out.println("Se te aplica un " + retencion + "% de retención.");
        }
    }

