package org.example.AFirstProgram;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle");
        long principle = sc.nextLong();
        System.out.println("Enter the rate of Interest");
        double rate = sc.nextDouble();
        System.out.println("Enter the Time");
        int time = sc.nextInt();

        double SimpleInterest = principle*rate*time/100;

        System.out.println(SimpleInterest);

    }
}
