package com.company;


import java.util.Scanner;


public class CalculatorMain {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть арифметичний вираз, допустимі символи (1-9, *,/,+,-) а також (I,V,X,L,C,D,M): ");
        String str = sc.nextLine();
        Variables.getVariables(str);

        if (!Variables.variables[0].matches("\\d+") | !Variables.variables[1].matches("\\d+")) // Якщо операнд містить символи перевіряємо строку на Римські числа.
        {

            RomanNumber.romanToDecimal(Variables.variables[0]);
            RomanNumber.romanToDecimal(Variables.variables[1]);
            System.out.println("Працюємо з римськими числами");

        } else {

            System.out.println("Працюємо з арабськими числами");
        }

        ArithmeticOperation.count();



    }
}

