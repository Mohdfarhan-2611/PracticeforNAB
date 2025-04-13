package org.example.AConditionalsLoops;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height");
        double height = sc.nextInt();
        System.out.println("Entert the base");
        double base = sc.nextInt();

        double Area =  (height * base)/2;
        System.out.println(Area);

    }
}
