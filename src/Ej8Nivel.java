import javax.print.attribute.IntegerSyntax;
import java.util.Scanner;

public class Ej8Nivel {

    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu nivel de poder");
        int nivel = Integer.parseInt(teclado.nextLine());
        System.out.println("Dime cuantas misiones llevas completadas");
        int mision = Integer.parseInt(teclado.nextLine());
        if (nivel > 10 && mision > 20 ) {
            System.out.println("Tienes acceso a la mision especial");
        } else {
            System.out.println("No cumples los requisitos");

        }
    }

}
