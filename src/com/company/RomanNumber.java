package com.company;


public class RomanNumber {

    private static int i = 0;


    public static void romanToDecimal(String romanNumber) {
        int decimal = 0;
        int lastNumber = 0;

        String romanNumb = romanNumber.toUpperCase();


        for (int x = romanNumb.length() - 1; x >= 0; x--) {
            char convertToDecimal = romanNumb.charAt(x);


            switch (convertToDecimal) {

                case 'M':
                    decimal = countDecimal(1000, lastNumber, decimal);
                    lastNumber = 1000;
                    break;

                case 'D':
                    decimal = countDecimal(500, lastNumber, decimal);
                    lastNumber = 500;
                    break;

                case 'C':
                    decimal = countDecimal(100, lastNumber, decimal);
                    lastNumber = 100;
                    break;


                case 'L':
                    decimal = countDecimal(50, lastNumber, decimal);
                    lastNumber = 50;
                    break;

                case 'X':
                    decimal = countDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

                case 'V':
                    decimal = countDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;

                case 'I':
                    decimal = countDecimal(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;


                default:
                    System.out.println("Введено некоректні дані");
                    System.exit(0);
                    break;

            }
        }
        Variables.variables[i] = "" + decimal;
        i++;


    }

    public static int countDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }


}