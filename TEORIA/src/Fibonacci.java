import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hasta que numero quieres hacer la sucesion de Fibonacci");
        int nivel = sc.nextInt();
        int suma = 0;


        if (nivel < 0) {

            System.out.println("Ingrese un numero mayor que 0");

        } else {

            for (int i = 0; i < nivel; i++) {

                System.out.println(Calcularfibonacci(i) + " ");

            }


        }


    }

    public static int Calcularfibonacci(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1)
            return 1;
        else {
            return Calcularfibonacci(num - 1) + Calcularfibonacci(num - 2);
        }

    }
}
