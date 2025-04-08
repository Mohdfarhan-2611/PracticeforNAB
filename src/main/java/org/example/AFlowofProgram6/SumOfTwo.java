package org.example.AFlowofProgram6;

import java.util.Scanner;

public class SumOfTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number Year");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        int sum = num1+num2;

        System.out.println("Sum is "+sum);

    }
}
