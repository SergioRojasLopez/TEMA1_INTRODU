package BOLETIN_1_1;

import java.util.Scanner;

public class Ej2_Num {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce un numero del 1 al 10");
            num = sc.nextInt();


        } while (num < 0 || num > 10) ;

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + num * i);

        }
    }
}
