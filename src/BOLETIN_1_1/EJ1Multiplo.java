package BOLETIN_1_1;

public class EJ1Multiplo {

    public static void main(String[] args) {

        for (int i = 1;  i <= 100; i++){

            if (i % 7 == 0){

                System.out.println( i + " es multiplo de 7");
            } else if (i % 13 == 0) {

                System.out.println(i + " es multiplo de 13");

            }

        }
    }
}