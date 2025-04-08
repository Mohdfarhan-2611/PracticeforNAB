package org.example.AFlowofProgram6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class XAndSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            try {
                System.out.println("Enter the number");
                int num1 = sc.nextInt();
                sum = sum + num1;
            } catch (InputMismatchException e) {
                System.out.println("Sum is " + sum);
                break;
            }
        }
    }
}
