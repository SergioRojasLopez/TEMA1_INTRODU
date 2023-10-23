package TEMA2;

import java.util.Arrays;

public class RecorridoArrayEjercicio {

    public static void main(String[] args) {

        int[] miArray = new int[5];
        int[] miArray2 = {1, 2, 3, 4, 5};

        for (int i = 0; i < miArray2.length; i++) {
            miArray[miArray.length - 1 - i] = miArray2[i];
        }
        for (int elem : miArray) {

            System.out.println(elem);
        }


    }
}
