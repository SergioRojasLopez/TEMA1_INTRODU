package TEMA2;

public class RecorridoArray {

    public static void main(String[] args) {

        int[] miArray = new int[5];
        int[] miArray2 = {1,2,3,4,5};

        //Este método sirve para recorrer el array desde el final hasta el principio.
        //
        for (int i = miArray2.length - 1; i >= 0; i--){

            System.out.println(miArray2[i]);
        }

        // Este metodo sirve para recorrer el array desde el principio hasta el final
        for (int i = 0; i < miArray2.length; i++){

            System.out.println(miArray2[i]);
        }

    }
}
