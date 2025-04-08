package org.example.AFirstProgram;

import java.util.Scanner;

public class Currency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rupess");
        int rupees = sc.nextInt();
        int dollar = rupees*80;
        System.out.println(dollar+" Dollar");

    }
}
