package BOLETIN_1_2;

import java.util.Scanner;

public class Ej13ComidaRapida {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cual es tu comida favorita entre estas opciones");
        System.out.println("1.Hamburguesa");
        System.out.println("2. Pizza");
        System.out.println("3. Tacos");
        System.out.println("4. Ensaladas");
        System.out.println("5. Salir");
        int operacion = Integer.parseInt(teclado.nextLine());
        switch (operacion) {
            case 1:
                System.out.println("Te encanta el burger king");
                break;
            case 2:
                System.out.println("Te encanta el italiano");
                break;
            case 3:
                System.out.println("Te encanta el mexicano");
                break;
            case 4:
                System.out.println("Te encanta comer sano");
                break;
            case 5:
                System.out.println("Gracias por usar la app");
        }
    }
}
