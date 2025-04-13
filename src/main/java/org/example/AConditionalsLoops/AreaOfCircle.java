package org.example.AConditionalsLoops;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        //Area of circle formula
        //A = pi * r*r

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        double pi = 3.14;

        double Area =  pi * radius * radius;

        System.out.println("Area of Circle "+Area);
    }
}
