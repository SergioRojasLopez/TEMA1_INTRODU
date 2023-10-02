import java.util.Scanner;

public class BucleDoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clave;
        int num = 8;

        do {
            System.out.println("Introduce una clave");
            clave = sc.nextLine();
            //Con length recorremos la variable para saber el numero de letras que tiene//
        }while (clave.length() > num);
        System.out.println("La clave es correcta");

    }

}
