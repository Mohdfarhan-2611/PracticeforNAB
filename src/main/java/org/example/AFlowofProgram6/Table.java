package org.example.AFlowofProgram6;

import java.util.Scanner;

public class Table {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.print(num1*i);
        }
    }
}
