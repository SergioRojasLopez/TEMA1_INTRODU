package BOLETIN_1_2;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime en que vehiculo vas: coche, moto o camion");

        String vehiculo = sc.next();

        if (vehiculo.equalsIgnoreCase("coche")){

            System.out.println("Tu velocidad es de 120 km/h");

        } else if (vehiculo.equalsIgnoreCase("moto")){

            System.out.println("Tu velocidad es de 90 km/h");

        }else if (vehiculo.equalsIgnoreCase("camion")) {

            System.out.println("Tu velocidad es de 80 km/h");
        }

    }
}
