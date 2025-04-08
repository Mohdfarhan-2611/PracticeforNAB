package org.example.AFirstProgram;

import java.util.Scanner;

public class LargestTwoNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println(num1+" is largest number");
        }else{
            System.out.println(num2+ " is Largest number");
        }

    }
}
