package TEMA2;

import java.util.Scanner;

public class RecorridoArray {

    public static void main(String[] args) {

        int [] array1 = {1,2,3,4,5};
        recorridoHaciaAtras(array1);

        int [] array2;
        recorridoAtrasDeclaracion();

        int [] array3 = {3,5,6,1,2,38,7};
        recorridoNormal(array3);


    }
        //Este método sirve para recorrer el array desde el final hasta el principio.
        //

        public static void recorridoHaciaAtras (int[] miArray){


            for (int i = miArray.length - 1; i >= 0; i--) {

                System.out.print(miArray[i]+ " ");

            }
            System.out.println();
        }
        //Recorrer el array desde el final para agregarle los valores que queramos desde el final

        public static void recorridoAtrasDeclaracion (){

            Scanner sc = new Scanner(System.in);
            System.out.println("Cuantas posiciones tendra tu tercer array?");

            int tamano = sc.nextInt();
            int [] miArray3 = new int[tamano];
            for (int z = miArray3.length - 1; z >= miArray3[0]; z--) {

                System.out.println("Dime los valores de tu array");

                int valores = sc.nextInt();
                miArray3[z] = valores;


            }
            for (int z:miArray3) {

                System.out.print(z + " ");

            }

            System.out.println();
        }

        // Este metodo sirve para recorrer el array desde el principio hasta el final

        public static void recorridoNormal (int [] miArray2){

            for (int i : miArray2) {

                System.out.print(i + " ");
            }
            System.out.println();
        }


}
