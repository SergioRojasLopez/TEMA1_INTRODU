package BOLETIN_1_3;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Dime un numero mayor o igual que cero");
            num = sc.nextInt();
            sc.close();
        } while (num < 0);

        if (num %2 ==0){
            System.out.println("El numero " + num + " es par ");
        }else {
            System.out.println("El numero " + num + " es impar");
        }
    }
}
