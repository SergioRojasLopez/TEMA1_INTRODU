package BOLETIN_1_6;

public class Ej9 {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {

            System.out.println("Tabla de multiplicar del " + i + ":");

            for (int x = 0; x <= 10; x++) {

                int resultado = i * x;

                System.out.println(i + "*" + x + "=" + resultado);

            }


        }
    }
}
