package org.example.Conditions;

import java.util.Scanner;

public class SmallestOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third number");
        int num3 = sc.nextInt();

        System.out.println((num1<num2)?(num1<num3?num1:num3):num2<num3?num2:num3);


    }
}
