package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Variables {


    static String[] variables;
    static String operator;


    public static void getVariables(String str) {
        Pattern pattern = Pattern.compile("[+-[*/]]"); //Пошук арифметичних операцій

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {

            operator = str.substring(matcher.start(), matcher.end()); // записуєм символ операції
            variables = str.split("[+-[*/]]"); // розділяємо строку на масиви


        }
        if (operator == null || variables.length > 2) {
            System.out.println("не знайдено арифметичних операцій, або їх кількість більша за одну");
            System.exit(0);
        }


    }

}
