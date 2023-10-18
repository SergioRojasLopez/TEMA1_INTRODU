package BOLETIN_1_6;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad de alumnos que hay en clase");
        int alumnos = sc.nextInt();
        int aprobado = 0;
        int suspenso = 0;

        for (int i = 1; i <= alumnos; i++){


            System.out.println("Introduce las notas");
            int notas = sc.nextInt();

            if (notas >= 5){

                aprobado++;

            }else {

                suspenso++;
            }

        }
        double porcentajeaprobados = (double) aprobado/alumnos * 100;
        double porcentajesuspensos = (double) suspenso/alumnos * 100;

        System.out.println("El numero de aprobados es: " + aprobado + " y el de suspensos es " + suspenso);
        System.out.println("El porcentaje de aprobados es " + porcentajeaprobados + " y el de suspensos es " + porcentajesuspensos);

    }
}
