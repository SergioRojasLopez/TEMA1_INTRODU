import java.util.Scanner;

public class MiEntradaSalida {

    public static Scanner sc = new Scanner(System.in);

    /**
     *Lee un entero entero comprendido entre minimo y el maximo (incluidos)
     *
     * @param min representa el valor minimo introducido
     * @param max representa el valor maximo introducido
     * @return
     */

    public static int leerEnteroDeRngo(String mensaje,int min,int max){

        if (min >= max) {

            //TODO : Hacer cuando conozcamos las excepciones

        }

        System.out.println(mensaje);

        int numeroLeido;

        do {
            numeroLeido = Integer.parseInt(sc.nextLine());

            if (numeroLeido < min || numeroLeido > max){

                System.out.printf("Introduce un valor entre %d y %d", min,max);
            }


        }while (numeroLeido < min || numeroLeido > max);

        return numeroLeido;

    }
}
