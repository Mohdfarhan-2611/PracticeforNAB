package org.example.AFirstProgram;

import java.util.Scanner;

public class CalculateValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2");
        int num2 = sc.nextInt();
        System.out.println("Enter the Symbol to calculate the value");
        String symbol = sc.next();
        if(symbol.equals("+"))  {
            int sum = num1+num2;
            System.out.println(sum);
        } else if (symbol.equals("-")) {
            int minus = num1-num2;
            System.out.println(minus);
        } else if (symbol.equals("*")) {
            int multiply = num1 * num2;
            System.out.println(multiply);
        } else if (symbol.equals("/")) {
            int divide = num1/num2;
            System.out.println(divide);
        }
    }
}
