package BOLETIN_1_7;

import java.util.Scanner;

public class Ej3 {

    private static final int M_VALUE = 1000;
    private static final int D_VALUE = 500;
    private static final int C_VALUE = 100;
    private static final int L_VALUE = 50;
    private static final int X_VALUE = 10;
    private static final int V_VALUE = 5;
    private static final int I_VALUE = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero romano");
        String numRomano = sc.next();
        int valorDecimal = 0;
        int lastDigitValue = 0;

        for (int i = 0; i < numRomano.length();i++){

            char digito = numRomano.charAt(i);
            int digitValue = valueOf(digito);

            if (i==0){

                valorDecimal = digitValue;
                lastDigitValue = digitValue;

            } else {

                if (lastDigitValue >= digitValue){

                    valorDecimal += digitValue;
                    lastDigitValue = digitValue;

                }else {

                    valorDecimal = valorDecimal + digitValue - (2 * lastDigitValue);
                }
            }
            lastDigitValue = digitValue;
        }

        System.out.println("El valor de " + numRomano + " es " + valorDecimal);
    }

    public static int valueOf(char c){

        return switch(c)
        {

            case 'M': yield M_VALUE;
            case 'D': yield D_VALUE;
            case 'C': yield C_VALUE;
            case 'L': yield L_VALUE;
            case 'X': yield X_VALUE;
            case 'V': yield V_VALUE;
            case 'I': yield I_VALUE;


            default:
                throw new IllegalStateException("Unexpected value: " + c);
        };
    }
}
