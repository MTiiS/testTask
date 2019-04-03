package com.company;

public class ArithmeticOperation {


    public static void count()

    {
        int a = Integer.parseInt(Variables.variables[0]);
        int b = Integer.parseInt(Variables.variables[1]);
        switch (Variables.operator){

            case "+":

                System.out.println(a+b);
                break;

            case "-":
                System.out.println(a-b);
                break;

            case "*":
                System.out.println(a*b);
                break;

            case "/":
                try {

                    System.out.println(a/b);

                   // System.out.println((double)a/b); якщо потрібні не цілі числа

                } catch (Exception e) {

                    System.out.println("Неможливо поділити на 0");

                }

                break;



        }

    }
}
