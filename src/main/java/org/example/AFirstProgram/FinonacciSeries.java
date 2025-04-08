package org.example.AFirstProgram;

import java.util.Scanner;

public class FinonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.print(a +" "+ b+" ");

        for(int i = 1; i<=num; i++)
        {
            System.out.print(a+b + " ");
            int temp = b;
            b = a+b;
            a = temp;
        }



    }
}
